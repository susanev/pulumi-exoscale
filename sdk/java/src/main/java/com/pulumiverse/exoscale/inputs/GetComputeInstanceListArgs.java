// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetComputeInstanceListArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputeInstanceListArgs Empty = new GetComputeInstanceListArgs();

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

    private GetComputeInstanceListArgs() {}

    private GetComputeInstanceListArgs(GetComputeInstanceListArgs $) {
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputeInstanceListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputeInstanceListArgs $;

        public Builder() {
            $ = new GetComputeInstanceListArgs();
        }

        public Builder(GetComputeInstanceListArgs defaults) {
            $ = new GetComputeInstanceListArgs(Objects.requireNonNull(defaults));
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

        public GetComputeInstanceListArgs build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}