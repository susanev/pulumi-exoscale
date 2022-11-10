// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetComputeTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputeTemplateArgs Empty = new GetComputeTemplateArgs();

    /**
     * A template category filter (default: `featured`); among:
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return A template category filter (default: `featured`); among:
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The compute instance template ID to match (conflicts with `name`).
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The compute instance template ID to match (conflicts with `name`).
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The template name to match (conflicts with `id`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The template name to match (conflicts with `id`).
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

    private GetComputeTemplateArgs() {}

    private GetComputeTemplateArgs(GetComputeTemplateArgs $) {
        this.filter = $.filter;
        this.id = $.id;
        this.name = $.name;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputeTemplateArgs $;

        public Builder() {
            $ = new GetComputeTemplateArgs();
        }

        public Builder(GetComputeTemplateArgs defaults) {
            $ = new GetComputeTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A template category filter (default: `featured`); among:
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A template category filter (default: `featured`); among:
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param id The compute instance template ID to match (conflicts with `name`).
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The compute instance template ID to match (conflicts with `name`).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The template name to match (conflicts with `id`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The template name to match (conflicts with `id`).
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

        public GetComputeTemplateArgs build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
