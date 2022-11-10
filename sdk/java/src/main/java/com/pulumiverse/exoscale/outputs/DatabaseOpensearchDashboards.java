// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseOpensearchDashboards {
    /**
     * @return {Type -  schema.TypeBool, Optional -  true, Default -  true},
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return {Type -  schema.TypeInt, Optional -  true, Default -  128},
     * 
     */
    private @Nullable Integer maxOldSpaceSize;
    /**
     * @return {Type -  schema.TypeInt, Optional -  true, Default -  30000},
     * `settings` -  OpenSearch-specific settings, in json. e.g.`jsonencode({thread_pool_search_size: 64})`. Use `exo x get-dbaas-settings-opensearch` to get a list of available settings.
     * 
     */
    private @Nullable Integer requestTimeout;

    private DatabaseOpensearchDashboards() {}
    /**
     * @return {Type -  schema.TypeBool, Optional -  true, Default -  true},
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return {Type -  schema.TypeInt, Optional -  true, Default -  128},
     * 
     */
    public Optional<Integer> maxOldSpaceSize() {
        return Optional.ofNullable(this.maxOldSpaceSize);
    }
    /**
     * @return {Type -  schema.TypeInt, Optional -  true, Default -  30000},
     * `settings` -  OpenSearch-specific settings, in json. e.g.`jsonencode({thread_pool_search_size: 64})`. Use `exo x get-dbaas-settings-opensearch` to get a list of available settings.
     * 
     */
    public Optional<Integer> requestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseOpensearchDashboards defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer maxOldSpaceSize;
        private @Nullable Integer requestTimeout;
        public Builder() {}
        public Builder(DatabaseOpensearchDashboards defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxOldSpaceSize = defaults.maxOldSpaceSize;
    	      this.requestTimeout = defaults.requestTimeout;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder maxOldSpaceSize(@Nullable Integer maxOldSpaceSize) {
            this.maxOldSpaceSize = maxOldSpaceSize;
            return this;
        }
        @CustomType.Setter
        public Builder requestTimeout(@Nullable Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public DatabaseOpensearchDashboards build() {
            final var o = new DatabaseOpensearchDashboards();
            o.enabled = enabled;
            o.maxOldSpaceSize = maxOldSpaceSize;
            o.requestTimeout = requestTimeout;
            return o;
        }
    }
}
