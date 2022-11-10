// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMAccessKeyState extends com.pulumi.resources.ResourceArgs {

    public static final IAMAccessKeyState Empty = new IAMAccessKeyState();

    /**
     * The IAM access key (identifier).
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The IAM access key (identifier).
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The IAM access key name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The IAM access key name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of API operations to restrict the key to.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<String>> operations;

    /**
     * @return A list of API operations to restrict the key to.
     * 
     */
    public Optional<Output<List<String>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * (Sensitive) The key secret.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return (Sensitive) The key secret.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * A list of tags to restrict the key to.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to restrict the key to.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsOperations")
    private @Nullable Output<List<String>> tagsOperations;

    public Optional<Output<List<String>>> tagsOperations() {
        return Optional.ofNullable(this.tagsOperations);
    }

    private IAMAccessKeyState() {}

    private IAMAccessKeyState(IAMAccessKeyState $) {
        this.key = $.key;
        this.name = $.name;
        this.operations = $.operations;
        this.resources = $.resources;
        this.secret = $.secret;
        this.tags = $.tags;
        this.tagsOperations = $.tagsOperations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMAccessKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMAccessKeyState $;

        public Builder() {
            $ = new IAMAccessKeyState();
        }

        public Builder(IAMAccessKeyState defaults) {
            $ = new IAMAccessKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The IAM access key (identifier).
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The IAM access key (identifier).
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name The IAM access key name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The IAM access key name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operations A list of API operations to restrict the key to.
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<String>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations A list of API operations to restrict the key to.
         * 
         * @return builder
         * 
         */
        public Builder operations(List<String> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations A list of API operations to restrict the key to.
         * 
         * @return builder
         * 
         */
        public Builder operations(String... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param resources A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param secret (Sensitive) The key secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret (Sensitive) The key secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param tags A list of tags to restrict the key to.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to restrict the key to.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to restrict the key to.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder tagsOperations(@Nullable Output<List<String>> tagsOperations) {
            $.tagsOperations = tagsOperations;
            return this;
        }

        public Builder tagsOperations(List<String> tagsOperations) {
            return tagsOperations(Output.of(tagsOperations));
        }

        public Builder tagsOperations(String... tagsOperations) {
            return tagsOperations(List.of(tagsOperations));
        }

        public IAMAccessKeyState build() {
            return $;
        }
    }

}