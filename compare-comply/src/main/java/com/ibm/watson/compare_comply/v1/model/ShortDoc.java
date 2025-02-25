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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Brief information about the input document.
 */
public class ShortDoc extends GenericModel {

  private String title;
  private String hash;

  /**
   * Gets the title.
   *
   * The title of the input document, if identified.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Gets the hash.
   *
   * The MD5 hash of the input document.
   *
   * @return the hash
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the title.
   *
   * @param title the new title
   */
  public void setTitle(final String title) {
    this.title = title;
  }

  /**
   * Sets the hash.
   *
   * @param hash the new hash
   */
  public void setHash(final String hash) {
    this.hash = hash;
  }
}
