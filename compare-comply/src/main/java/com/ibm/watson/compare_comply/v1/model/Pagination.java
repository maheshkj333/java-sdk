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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Pagination details, if required by the length of the output.
 */
public class Pagination extends GenericModel {

  @SerializedName("refresh_cursor")
  private String refreshCursor;
  @SerializedName("next_cursor")
  private String nextCursor;
  @SerializedName("refresh_url")
  private String refreshUrl;
  @SerializedName("next_url")
  private String nextUrl;
  private Long total;

  /**
   * Gets the refreshCursor.
   *
   * A token identifying the current page of results.
   *
   * @return the refreshCursor
   */
  public String getRefreshCursor() {
    return refreshCursor;
  }

  /**
   * Gets the nextCursor.
   *
   * A token identifying the next page of results.
   *
   * @return the nextCursor
   */
  public String getNextCursor() {
    return nextCursor;
  }

  /**
   * Gets the refreshUrl.
   *
   * The URL that returns the current page of results.
   *
   * @return the refreshUrl
   */
  public String getRefreshUrl() {
    return refreshUrl;
  }

  /**
   * Gets the nextUrl.
   *
   * The URL that returns the next page of results.
   *
   * @return the nextUrl
   */
  public String getNextUrl() {
    return nextUrl;
  }

  /**
   * Gets the total.
   *
   * Reserved for future use.
   *
   * @return the total
   */
  public Long getTotal() {
    return total;
  }
}
