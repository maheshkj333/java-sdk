/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.speech_to_text.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a corpus from a custom language model.
 */
public class Corpus extends GenericModel {

  /**
   * The status of the corpus:
   * * `analyzed`: The service successfully analyzed the corpus. The custom model can be trained with data from the
   * corpus.
   * * `being_processed`: The service is still analyzing the corpus. The service cannot accept requests to add new
   * resources or to train the custom model.
   * * `undetermined`: The service encountered an error while processing the corpus. The `error` field describes the
   * failure.
   */
  public interface Status {
    /** analyzed. */
    String ANALYZED = "analyzed";
    /** being_processed. */
    String BEING_PROCESSED = "being_processed";
    /** undetermined. */
    String UNDETERMINED = "undetermined";
  }

  private String name;
  @SerializedName("total_words")
  private Long totalWords;
  @SerializedName("out_of_vocabulary_words")
  private Long outOfVocabularyWords;
  private String status;
  private String error;

  /**
   * Gets the name.
   *
   * The name of the corpus.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the totalWords.
   *
   * The total number of words in the corpus. The value is `0` while the corpus is being processed.
   *
   * @return the totalWords
   */
  public Long getTotalWords() {
    return totalWords;
  }

  /**
   * Gets the outOfVocabularyWords.
   *
   * The number of OOV words in the corpus. The value is `0` while the corpus is being processed.
   *
   * @return the outOfVocabularyWords
   */
  public Long getOutOfVocabularyWords() {
    return outOfVocabularyWords;
  }

  /**
   * Gets the status.
   *
   * The status of the corpus:
   * * `analyzed`: The service successfully analyzed the corpus. The custom model can be trained with data from the
   * corpus.
   * * `being_processed`: The service is still analyzing the corpus. The service cannot accept requests to add new
   * resources or to train the custom model.
   * * `undetermined`: The service encountered an error while processing the corpus. The `error` field describes the
   * failure.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the error.
   *
   * If the status of the corpus is `undetermined`, the following message: `Analysis of corpus 'name' failed. Please try
   * adding the corpus again by setting the 'allow_overwrite' flag to 'true'`.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }
}
