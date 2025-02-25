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
package com.ibm.watson.language_translator.v3.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;

/**
 * The deleteDocument options.
 */
public class DeleteDocumentOptions extends GenericModel {

  private String documentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String documentId;

    private Builder(DeleteDocumentOptions deleteDocumentOptions) {
      this.documentId = deleteDocumentOptions.documentId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param documentId the documentId
     */
    public Builder(String documentId) {
      this.documentId = documentId;
    }

    /**
     * Builds a DeleteDocumentOptions.
     *
     * @return the deleteDocumentOptions
     */
    public DeleteDocumentOptions build() {
      return new DeleteDocumentOptions(this);
    }

    /**
     * Set the documentId.
     *
     * @param documentId the documentId
     * @return the DeleteDocumentOptions builder
     */
    public Builder documentId(String documentId) {
      this.documentId = documentId;
      return this;
    }
  }

  private DeleteDocumentOptions(Builder builder) {
    Validator.notEmpty(builder.documentId, "documentId cannot be empty");
    documentId = builder.documentId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDocumentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the documentId.
   *
   * Document ID of the document to delete.
   *
   * @return the documentId
   */
  public String documentId() {
    return documentId;
  }
}
