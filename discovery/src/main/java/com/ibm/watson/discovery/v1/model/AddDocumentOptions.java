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
package com.ibm.watson.discovery.v1.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;

/**
 * The addDocument options.
 */
public class AddDocumentOptions extends GenericModel {

  private String environmentId;
  private String collectionId;
  private InputStream file;
  private String filename;
  private String fileContentType;
  private String metadata;

  /**
   * Builder.
   */
  public static class Builder {
    private String environmentId;
    private String collectionId;
    private InputStream file;
    private String filename;
    private String fileContentType;
    private String metadata;

    private Builder(AddDocumentOptions addDocumentOptions) {
      this.environmentId = addDocumentOptions.environmentId;
      this.collectionId = addDocumentOptions.collectionId;
      this.file = addDocumentOptions.file;
      this.filename = addDocumentOptions.filename;
      this.fileContentType = addDocumentOptions.fileContentType;
      this.metadata = addDocumentOptions.metadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param environmentId the environmentId
     * @param collectionId the collectionId
     */
    public Builder(String environmentId, String collectionId) {
      this.environmentId = environmentId;
      this.collectionId = collectionId;
    }

    /**
     * Builds a AddDocumentOptions.
     *
     * @return the addDocumentOptions
     */
    public AddDocumentOptions build() {
      return new AddDocumentOptions(this);
    }

    /**
     * Set the environmentId.
     *
     * @param environmentId the environmentId
     * @return the AddDocumentOptions builder
     */
    public Builder environmentId(String environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set the collectionId.
     *
     * @param collectionId the collectionId
     * @return the AddDocumentOptions builder
     */
    public Builder collectionId(String collectionId) {
      this.collectionId = collectionId;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the AddDocumentOptions builder
     */
    public Builder file(InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * Set the filename.
     *
     * @param filename the filename
     * @return the AddDocumentOptions builder
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * Set the fileContentType.
     *
     * @param fileContentType the fileContentType
     * @return the AddDocumentOptions builder
     */
    public Builder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the AddDocumentOptions builder
     */
    public Builder metadata(String metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the AddDocumentOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder file(File file) throws FileNotFoundException {
      this.file = new FileInputStream(file);
      this.filename = file.getName();
      return this;
    }
  }

  private AddDocumentOptions(Builder builder) {
    Validator.notEmpty(builder.environmentId, "environmentId cannot be empty");
    Validator.notEmpty(builder.collectionId, "collectionId cannot be empty");
    Validator.isTrue((builder.file == null) || (builder.filename != null),
        "filename cannot be null if file is not null.");
    environmentId = builder.environmentId;
    collectionId = builder.collectionId;
    file = builder.file;
    filename = builder.filename;
    fileContentType = builder.fileContentType;
    metadata = builder.metadata;
  }

  /**
   * New builder.
   *
   * @return a AddDocumentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the environmentId.
   *
   * The ID of the environment.
   *
   * @return the environmentId
   */
  public String environmentId() {
    return environmentId;
  }

  /**
   * Gets the collectionId.
   *
   * The ID of the collection.
   *
   * @return the collectionId
   */
  public String collectionId() {
    return collectionId;
  }

  /**
   * Gets the file.
   *
   * The content of the document to ingest. The maximum supported file size when adding a file to a collection is 50
   * megabytes, the maximum supported file size when testing a confiruration is 1 megabyte. Files larger than the
   * supported size are rejected.
   *
   * @return the file
   */
  public InputStream file() {
    return file;
  }

  /**
   * Gets the filename.
   *
   * The filename for file.
   *
   * @return the filename
   */
  public String filename() {
    return filename;
  }

  /**
   * Gets the fileContentType.
   *
   * The content type of file. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the fileContentType
   */
  public String fileContentType() {
    return fileContentType;
  }

  /**
   * Gets the metadata.
   *
   * The maximum supported metadata file size is 1 MB. Metadata parts larger than 1 MB are rejected.
   * Example: ``` {
   * "Creator": "Johnny Appleseed",
   * "Subject": "Apples"
   * } ```.
   *
   * @return the metadata
   */
  public String metadata() {
    return metadata;
  }
}
