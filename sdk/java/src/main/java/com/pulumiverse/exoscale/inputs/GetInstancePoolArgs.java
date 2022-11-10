// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePoolArgs Empty = new GetInstancePoolArgs();

    /**
     * The instance pool ID to match (conflicts with `name`).
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The instance pool ID to match (conflicts with `name`).
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A map of key/value labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A map of key/value labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The pool name to match (conflicts with `id`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The pool name to match (conflicts with `id`).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Exoscale [Zone][zone] name.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The Exoscale [Zone][zone] name.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private GetInstancePoolArgs() {}

    private GetInstancePoolArgs(GetInstancePoolArgs $) {
        this.id = $.id;
        this.labels = $.labels;
        this.name = $.name;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePoolArgs $;

        public Builder() {
            $ = new GetInstancePoolArgs();
        }

        public Builder(GetInstancePoolArgs defaults) {
            $ = new GetInstancePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The instance pool ID to match (conflicts with `name`).
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The instance pool ID to match (conflicts with `name`).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels A map of key/value labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A map of key/value labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The pool name to match (conflicts with `id`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The pool name to match (conflicts with `id`).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param zone The Exoscale [Zone][zone] name.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The Exoscale [Zone][zone] name.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetInstancePoolArgs build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
