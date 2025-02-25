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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;

/**
 * CreateIntent.
 */
public class CreateIntent extends GenericModel {

  private String intent;
  private String description;
  private Date created;
  private Date updated;
  private List<Example> examples;

  /**
   * Builder.
   */
  public static class Builder {
    private String intent;
    private String description;
    private Date created;
    private Date updated;
    private List<Example> examples;

    private Builder(CreateIntent createIntent) {
      this.intent = createIntent.intent;
      this.description = createIntent.description;
      this.created = createIntent.created;
      this.updated = createIntent.updated;
      this.examples = createIntent.examples;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param intent the intent
     */
    public Builder(String intent) {
      this.intent = intent;
    }

    /**
     * Builds a CreateIntent.
     *
     * @return the createIntent
     */
    public CreateIntent build() {
      return new CreateIntent(this);
    }

    /**
     * Adds an example to examples.
     *
     * @param example the new example
     * @return the CreateIntent builder
     */
    public Builder addExample(Example example) {
      Validator.notNull(example, "example cannot be null");
      if (this.examples == null) {
        this.examples = new ArrayList<Example>();
      }
      this.examples.add(example);
      return this;
    }

    /**
     * Set the intent.
     *
     * @param intent the intent
     * @return the CreateIntent builder
     */
    public Builder intent(String intent) {
      this.intent = intent;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateIntent builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the created.
     *
     * @param created the created
     * @return the CreateIntent builder
     */
    public Builder created(Date created) {
      this.created = created;
      return this;
    }

    /**
     * Set the updated.
     *
     * @param updated the updated
     * @return the CreateIntent builder
     */
    public Builder updated(Date updated) {
      this.updated = updated;
      return this;
    }

    /**
     * Set the examples.
     * Existing examples will be replaced.
     *
     * @param examples the examples
     * @return the CreateIntent builder
     */
    public Builder examples(List<Example> examples) {
      this.examples = examples;
      return this;
    }
  }

  private CreateIntent(Builder builder) {
    Validator.notNull(builder.intent, "intent cannot be null");
    intent = builder.intent;
    description = builder.description;
    created = builder.created;
    updated = builder.updated;
    examples = builder.examples;
  }

  /**
   * New builder.
   *
   * @return a CreateIntent builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the intent.
   *
   * The name of the intent. This string must conform to the following restrictions:
   * - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters.
   * - It cannot begin with the reserved prefix `sys-`.
   *
   * @return the intent
   */
  public String intent() {
    return intent;
  }

  /**
   * Gets the description.
   *
   * The description of the intent. This string cannot contain carriage return, newline, or tab characters.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the created.
   *
   * The timestamp for creation of the object.
   *
   * @return the created
   */
  public Date created() {
    return created;
  }

  /**
   * Gets the updated.
   *
   * The timestamp for the most recent update to the object.
   *
   * @return the updated
   */
  public Date updated() {
    return updated;
  }

  /**
   * Gets the examples.
   *
   * An array of user input examples for the intent.
   *
   * @return the examples
   */
  public List<Example> examples() {
    return examples;
  }
}
