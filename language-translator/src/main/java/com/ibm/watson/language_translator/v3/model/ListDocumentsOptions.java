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

/**
 * The listDocuments options.
 */
public class ListDocumentsOptions extends GenericModel {

  /**
   * Builder.
   */
  public static class Builder {

    private Builder(ListDocumentsOptions listDocumentsOptions) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDocumentsOptions.
     *
     * @return the listDocumentsOptions
     */
    public ListDocumentsOptions build() {
      return new ListDocumentsOptions(this);
    }
  }

  private ListDocumentsOptions(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a ListDocumentsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}
