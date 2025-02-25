# Text to Speech

## Installation

##### Maven
```xml
<dependency>
  <groupId>com.ibm.watson</groupId>
  <artifactId>text-to-speech</artifactId>
  <version>7.4.1</version>
</dependency>
```

##### Gradle
```gradle
'com.ibm.watson:text-to-speech:7.4.1'
```

## Usage
Use the [Text to Speech][text_to_speech] service to get the available voices to synthesize.

```java
TextToSpeech service = new TextToSpeech();
IamOptions options = new IamOptions.Builder()
  .apiKey("<iam_api_key>")
  .build();
service.setIamCredentials(options);

Voices voices = service.listVoices().execute().getResult();
System.out.println(voices);
```

## Usage with WebSockets
The Watson Text to Speech service supports the use of WebSockets as an alternative to the `synthesize()` method, which converts text to speech. Here is an example of using the WebSocket version of the method to get an audio file:
```java
TextToSpeech service = new TextToSpeech();
IamOptions options = new IamOptions.Builder()
  .apiKey("<iam_api_key>")
  .build();
service.setIamCredentials(options);

String text = "It's beginning to look a lot like Christmas";
SynthesizeOptions synthesizeOptions = new SynthesizeOptions.Builder()
  .text(text)
  .accept(SynthesizeOptions.Accept.AUDIO_OGG_CODECS_OPUS)
  .build();

// a callback is defined to handle certain events, like an audio transmission or a timing marker
// in this case, we'll build up a byte array of all the received bytes to build the resulting file
final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
service.synthesizeUsingWebSocket(synthesizeOptions, new BaseSynthesizeCallback() {
  @Override
  public void onAudioStream(byte[] bytes) {
    // append to our byte array
    try {
      byteArrayOutputStream.write(bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
});

// quick way to wait for synthesis to complete, since synthesizeUsingWebSocket() runs asynchronously
Thread.sleep(5000);

// create file with audio data
String filename = "synthesize_websocket_test.ogg";
OutputStream fileOutputStream = new FileOutputStream(filename);
byteArrayOutputStream.writeTo(fileOutputStream);

// clean up
byteArrayOutputStream.close();
fileOutputStream.close();
```

[text_to_speech]: https://cloud.ibm.com/docs/services/text-to-speech?topic=text-to-speech-about