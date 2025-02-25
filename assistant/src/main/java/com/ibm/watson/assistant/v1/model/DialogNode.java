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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;

/**
 * DialogNode.
 */
public class DialogNode extends GenericModel {

  /**
   * How the dialog node is processed.
   */
  public interface NodeType {
    /** standard. */
    String STANDARD = "standard";
    /** event_handler. */
    String EVENT_HANDLER = "event_handler";
    /** frame. */
    String FRAME = "frame";
    /** slot. */
    String SLOT = "slot";
    /** response_condition. */
    String RESPONSE_CONDITION = "response_condition";
    /** folder. */
    String FOLDER = "folder";
  }

  /**
   * How an `event_handler` node is processed.
   */
  public interface EventName {
    /** focus. */
    String FOCUS = "focus";
    /** input. */
    String INPUT = "input";
    /** filled. */
    String FILLED = "filled";
    /** validate. */
    String VALIDATE = "validate";
    /** filled_multiple. */
    String FILLED_MULTIPLE = "filled_multiple";
    /** generic. */
    String GENERIC = "generic";
    /** nomatch. */
    String NOMATCH = "nomatch";
    /** nomatch_responses_depleted. */
    String NOMATCH_RESPONSES_DEPLETED = "nomatch_responses_depleted";
    /** digression_return_prompt. */
    String DIGRESSION_RETURN_PROMPT = "digression_return_prompt";
  }

  /**
   * Whether this top-level dialog node can be digressed into.
   */
  public interface DigressIn {
    /** not_available. */
    String NOT_AVAILABLE = "not_available";
    /** returns. */
    String RETURNS = "returns";
    /** does_not_return. */
    String DOES_NOT_RETURN = "does_not_return";
  }

  /**
   * Whether this dialog node can be returned to after a digression.
   */
  public interface DigressOut {
    /** allow_returning. */
    String ALLOW_RETURNING = "allow_returning";
    /** allow_all. */
    String ALLOW_ALL = "allow_all";
    /** allow_all_never_return. */
    String ALLOW_ALL_NEVER_RETURN = "allow_all_never_return";
  }

  /**
   * Whether the user can digress to top-level nodes while filling out slots.
   */
  public interface DigressOutSlots {
    /** not_allowed. */
    String NOT_ALLOWED = "not_allowed";
    /** allow_returning. */
    String ALLOW_RETURNING = "allow_returning";
    /** allow_all. */
    String ALLOW_ALL = "allow_all";
  }

  @SerializedName("dialog_node")
  private String dialogNode;
  private String description;
  private String conditions;
  private String parent;
  @SerializedName("previous_sibling")
  private String previousSibling;
  private DialogNodeOutput output;
  private Map context;
  private Map metadata;
  @SerializedName("next_step")
  private DialogNodeNextStep nextStep;
  private String title;
  @SerializedName("type")
  private String nodeType;
  @SerializedName("event_name")
  private String eventName;
  private String variable;
  private List<DialogNodeAction> actions;
  @SerializedName("digress_in")
  private String digressIn;
  @SerializedName("digress_out")
  private String digressOut;
  @SerializedName("digress_out_slots")
  private String digressOutSlots;
  @SerializedName("user_label")
  private String userLabel;
  private Boolean disabled;
  private Date created;
  private Date updated;

  /**
   * Builder.
   */
  public static class Builder {
    private String dialogNode;
    private String description;
    private String conditions;
    private String parent;
    private String previousSibling;
    private DialogNodeOutput output;
    private Map context;
    private Map metadata;
    private DialogNodeNextStep nextStep;
    private String title;
    private String nodeType;
    private String eventName;
    private String variable;
    private List<DialogNodeAction> actions;
    private String digressIn;
    private String digressOut;
    private String digressOutSlots;
    private String userLabel;
    private Boolean disabled;
    private Date created;
    private Date updated;

    private Builder(DialogNode dialogNode) {
      this.dialogNode = dialogNode.dialogNode;
      this.description = dialogNode.description;
      this.conditions = dialogNode.conditions;
      this.parent = dialogNode.parent;
      this.previousSibling = dialogNode.previousSibling;
      this.output = dialogNode.output;
      this.context = dialogNode.context;
      this.metadata = dialogNode.metadata;
      this.nextStep = dialogNode.nextStep;
      this.title = dialogNode.title;
      this.nodeType = dialogNode.nodeType;
      this.eventName = dialogNode.eventName;
      this.variable = dialogNode.variable;
      this.actions = dialogNode.actions;
      this.digressIn = dialogNode.digressIn;
      this.digressOut = dialogNode.digressOut;
      this.digressOutSlots = dialogNode.digressOutSlots;
      this.userLabel = dialogNode.userLabel;
      this.disabled = dialogNode.disabled;
      this.created = dialogNode.created;
      this.updated = dialogNode.updated;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dialogNode the dialogNode
     */
    public Builder(String dialogNode) {
      this.dialogNode = dialogNode;
    }

    /**
     * Builds a DialogNode.
     *
     * @return the dialogNode
     */
    public DialogNode build() {
      return new DialogNode(this);
    }

    /**
     * Adds an actions to actions.
     *
     * @param actions the new actions
     * @return the DialogNode builder
     */
    public Builder addActions(DialogNodeAction actions) {
      Validator.notNull(actions, "actions cannot be null");
      if (this.actions == null) {
        this.actions = new ArrayList<DialogNodeAction>();
      }
      this.actions.add(actions);
      return this;
    }

    /**
     * Set the dialogNode.
     *
     * @param dialogNode the dialogNode
     * @return the DialogNode builder
     */
    public Builder dialogNode(String dialogNode) {
      this.dialogNode = dialogNode;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DialogNode builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the conditions.
     *
     * @param conditions the conditions
     * @return the DialogNode builder
     */
    public Builder conditions(String conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Set the parent.
     *
     * @param parent the parent
     * @return the DialogNode builder
     */
    public Builder parent(String parent) {
      this.parent = parent;
      return this;
    }

    /**
     * Set the previousSibling.
     *
     * @param previousSibling the previousSibling
     * @return the DialogNode builder
     */
    public Builder previousSibling(String previousSibling) {
      this.previousSibling = previousSibling;
      return this;
    }

    /**
     * Set the output.
     *
     * @param output the output
     * @return the DialogNode builder
     */
    public Builder output(DialogNodeOutput output) {
      this.output = output;
      return this;
    }

    /**
     * Set the context.
     *
     * @param context the context
     * @return the DialogNode builder
     */
    public Builder context(Map context) {
      this.context = context;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the DialogNode builder
     */
    public Builder metadata(Map metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set the nextStep.
     *
     * @param nextStep the nextStep
     * @return the DialogNode builder
     */
    public Builder nextStep(DialogNodeNextStep nextStep) {
      this.nextStep = nextStep;
      return this;
    }

    /**
     * Set the title.
     *
     * @param title the title
     * @return the DialogNode builder
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Set the nodeType.
     *
     * @param nodeType the nodeType
     * @return the DialogNode builder
     */
    public Builder nodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    /**
     * Set the eventName.
     *
     * @param eventName the eventName
     * @return the DialogNode builder
     */
    public Builder eventName(String eventName) {
      this.eventName = eventName;
      return this;
    }

    /**
     * Set the variable.
     *
     * @param variable the variable
     * @return the DialogNode builder
     */
    public Builder variable(String variable) {
      this.variable = variable;
      return this;
    }

    /**
     * Set the actions.
     * Existing actions will be replaced.
     *
     * @param actions the actions
     * @return the DialogNode builder
     */
    public Builder actions(List<DialogNodeAction> actions) {
      this.actions = actions;
      return this;
    }

    /**
     * Set the digressIn.
     *
     * @param digressIn the digressIn
     * @return the DialogNode builder
     */
    public Builder digressIn(String digressIn) {
      this.digressIn = digressIn;
      return this;
    }

    /**
     * Set the digressOut.
     *
     * @param digressOut the digressOut
     * @return the DialogNode builder
     */
    public Builder digressOut(String digressOut) {
      this.digressOut = digressOut;
      return this;
    }

    /**
     * Set the digressOutSlots.
     *
     * @param digressOutSlots the digressOutSlots
     * @return the DialogNode builder
     */
    public Builder digressOutSlots(String digressOutSlots) {
      this.digressOutSlots = digressOutSlots;
      return this;
    }

    /**
     * Set the userLabel.
     *
     * @param userLabel the userLabel
     * @return the DialogNode builder
     */
    public Builder userLabel(String userLabel) {
      this.userLabel = userLabel;
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the DialogNode builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /**
     * Set the created.
     *
     * @param created the created
     * @return the DialogNode builder
     */
    public Builder created(Date created) {
      this.created = created;
      return this;
    }

    /**
     * Set the updated.
     *
     * @param updated the updated
     * @return the DialogNode builder
     */
    public Builder updated(Date updated) {
      this.updated = updated;
      return this;
    }
  }

  private DialogNode(Builder builder) {
    Validator.notNull(builder.dialogNode, "dialogNode cannot be null");
    dialogNode = builder.dialogNode;
    description = builder.description;
    conditions = builder.conditions;
    parent = builder.parent;
    previousSibling = builder.previousSibling;
    output = builder.output;
    context = builder.context;
    metadata = builder.metadata;
    nextStep = builder.nextStep;
    title = builder.title;
    nodeType = builder.nodeType;
    eventName = builder.eventName;
    variable = builder.variable;
    actions = builder.actions;
    digressIn = builder.digressIn;
    digressOut = builder.digressOut;
    digressOutSlots = builder.digressOutSlots;
    userLabel = builder.userLabel;
    disabled = builder.disabled;
    created = builder.created;
    updated = builder.updated;
  }

  /**
   * New builder.
   *
   * @return a DialogNode builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dialogNode.
   *
   * The dialog node ID. This string must conform to the following restrictions:
   * - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters.
   *
   * @return the dialogNode
   */
  public String dialogNode() {
    return dialogNode;
  }

  /**
   * Gets the description.
   *
   * The description of the dialog node. This string cannot contain carriage return, newline, or tab characters.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the conditions.
   *
   * The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab
   * characters.
   *
   * @return the conditions
   */
  public String conditions() {
    return conditions;
  }

  /**
   * Gets the parent.
   *
   * The ID of the parent dialog node. This property is omitted if the dialog node has no parent.
   *
   * @return the parent
   */
  public String parent() {
    return parent;
  }

  /**
   * Gets the previousSibling.
   *
   * The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling.
   *
   * @return the previousSibling
   */
  public String previousSibling() {
    return previousSibling;
  }

  /**
   * Gets the output.
   *
   * The output of the dialog node. For more information about how to specify dialog node output, see the
   * [documentation]
   * (https://cloud.ibm.com/docs/services/assistant?topic=assistant-dialog-overview#dialog-overview-responses).
   *
   * @return the output
   */
  public DialogNodeOutput output() {
    return output;
  }

  /**
   * Gets the context.
   *
   * The context for the dialog node.
   *
   * @return the context
   */
  public Map context() {
    return context;
  }

  /**
   * Gets the metadata.
   *
   * The metadata for the dialog node.
   *
   * @return the metadata
   */
  public Map metadata() {
    return metadata;
  }

  /**
   * Gets the nextStep.
   *
   * The next step to execute following this dialog node.
   *
   * @return the nextStep
   */
  public DialogNodeNextStep nextStep() {
    return nextStep;
  }

  /**
   * Gets the title.
   *
   * The alias used to identify the dialog node. This string must conform to the following restrictions:
   * - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters.
   *
   * @return the title
   */
  public String title() {
    return title;
  }

  /**
   * Gets the nodeType.
   *
   * How the dialog node is processed.
   *
   * @return the nodeType
   */
  public String nodeType() {
    return nodeType;
  }

  /**
   * Gets the eventName.
   *
   * How an `event_handler` node is processed.
   *
   * @return the eventName
   */
  public String eventName() {
    return eventName;
  }

  /**
   * Gets the variable.
   *
   * The location in the dialog context where output is stored.
   *
   * @return the variable
   */
  public String variable() {
    return variable;
  }

  /**
   * Gets the actions.
   *
   * An array of objects describing any actions to be invoked by the dialog node.
   *
   * @return the actions
   */
  public List<DialogNodeAction> actions() {
    return actions;
  }

  /**
   * Gets the digressIn.
   *
   * Whether this top-level dialog node can be digressed into.
   *
   * @return the digressIn
   */
  public String digressIn() {
    return digressIn;
  }

  /**
   * Gets the digressOut.
   *
   * Whether this dialog node can be returned to after a digression.
   *
   * @return the digressOut
   */
  public String digressOut() {
    return digressOut;
  }

  /**
   * Gets the digressOutSlots.
   *
   * Whether the user can digress to top-level nodes while filling out slots.
   *
   * @return the digressOutSlots
   */
  public String digressOutSlots() {
    return digressOutSlots;
  }

  /**
   * Gets the userLabel.
   *
   * A label that can be displayed externally to describe the purpose of the node to users.
   *
   * @return the userLabel
   */
  public String userLabel() {
    return userLabel;
  }

  /**
   * Gets the disabled.
   *
   * For internal use only.
   *
   * @return the disabled
   */
  public Boolean disabled() {
    return disabled;
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
}
