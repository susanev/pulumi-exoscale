// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityGroupPlainArgs Empty = new GetSecurityGroupPlainArgs();

    /**
     * The security group ID to match (conflicts with `name`)
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The security group ID to match (conflicts with `name`)
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name to match (conflicts with `id`)
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name to match (conflicts with `id`)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSecurityGroupPlainArgs() {}

    private GetSecurityGroupPlainArgs(GetSecurityGroupPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityGroupPlainArgs $;

        public Builder() {
            $ = new GetSecurityGroupPlainArgs();
        }

        public Builder(GetSecurityGroupPlainArgs defaults) {
            $ = new GetSecurityGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The security group ID to match (conflicts with `name`)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name to match (conflicts with `id`)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetSecurityGroupPlainArgs build() {
            return $;
        }
    }

}
