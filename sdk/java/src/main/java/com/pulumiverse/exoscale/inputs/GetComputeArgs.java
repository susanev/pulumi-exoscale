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


public final class GetComputeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputeArgs Empty = new GetComputeArgs();

    /**
     * The instance hostname to match.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The instance hostname to match.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The compute instance ID to match.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The compute instance ID to match.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The instance tags to match (map of key/value).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The instance tags to match (map of key/value).
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetComputeArgs() {}

    private GetComputeArgs(GetComputeArgs $) {
        this.hostname = $.hostname;
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputeArgs $;

        public Builder() {
            $ = new GetComputeArgs();
        }

        public Builder(GetComputeArgs defaults) {
            $ = new GetComputeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The instance hostname to match.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The instance hostname to match.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param id The compute instance ID to match.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The compute instance ID to match.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param tags The instance tags to match (map of key/value).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The instance tags to match (map of key/value).
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetComputeArgs build() {
            return $;
        }
    }

}
