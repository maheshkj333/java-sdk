/*
 * (C) Copyright IBM Corp. 2019.
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
package com.ibm.watson.compare_comply.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The leading sentences in a section or subsection of the input document.
 */
public class LeadingSentence extends GenericModel {

  private String text;
  private Location location;
  @SerializedName("element_locations")
  private List<ElementLocations> elementLocations;

  /**
   * Gets the text.
   *
   * The text of the leading sentence.
   *
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets the location.
   *
   * The numeric location of the identified element in the document, represented with two integers labeled `begin` and
   * `end`.
   *
   * @return the location
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Gets the elementLocations.
   *
   * An array of `location` objects that lists the locations of detected leading sentences.
   *
   * @return the elementLocations
   */
  public List<ElementLocations> getElementLocations() {
    return elementLocations;
  }
}
