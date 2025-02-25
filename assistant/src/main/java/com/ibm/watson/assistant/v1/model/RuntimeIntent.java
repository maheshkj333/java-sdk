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
package com.ibm.watson.assistant.v1.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * An intent identified in the user input.
 */
public class RuntimeIntent extends DynamicModel<Object> {
  @SerializedName("intent")
  private String intent;
  @SerializedName("confidence")
  private Double confidence;

  public RuntimeIntent() {
    super(new TypeToken<Object>() {
    });
  }

  /**
   * Gets the intent.
   *
   * The name of the recognized intent.
   *
   * @return the intent
   */
  public String getIntent() {
    return this.intent;
  }

  /**
   * Sets the intent.
   *
   * @param intent the new intent
   */
  public void setIntent(final String intent) {
    this.intent = intent;
  }

  /**
   * Gets the confidence.
   *
   * A decimal percentage that represents Watson's confidence in the intent.
   *
   * @return the confidence
   */
  public Double getConfidence() {
    return this.confidence;
  }

  /**
   * Sets the confidence.
   *
   * @param confidence the new confidence
   */
  public void setConfidence(final Double confidence) {
    this.confidence = confidence;
  }
}
