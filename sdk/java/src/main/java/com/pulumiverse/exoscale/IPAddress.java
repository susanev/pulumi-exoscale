// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.IPAddressArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.IPAddressState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **WARNING:** This resource is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ElasticIP instead.
 * 
 */
@ResourceType(type="exoscale:index/iPAddress:IPAddress")
public class IPAddress extends com.pulumi.resources.CustomResource {
    /**
     * A free-form text describing the Elastic IP (EIP).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form text describing the Elastic IP (EIP).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The healthcheck probing interval (seconds; must be between `5` and `300`).
     * 
     */
    @Export(name="healthcheckInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthcheckInterval;

    /**
     * @return The healthcheck probing interval (seconds; must be between `5` and `300`).
     * 
     */
    public Output<Optional<Integer>> healthcheckInterval() {
        return Codegen.optional(this.healthcheckInterval);
    }
    /**
     * The healthcheck probing mode (must be `tcp`, `http` or `https`).
     * 
     */
    @Export(name="healthcheckMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthcheckMode;

    /**
     * @return The healthcheck probing mode (must be `tcp`, `http` or `https`).
     * 
     */
    public Output<Optional<String>> healthcheckMode() {
        return Codegen.optional(this.healthcheckMode);
    }
    /**
     * The healthcheck probe HTTP request path (must be specified in `http`/`https` modes).
     * 
     */
    @Export(name="healthcheckPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthcheckPath;

    /**
     * @return The healthcheck probe HTTP request path (must be specified in `http`/`https` modes).
     * 
     */
    public Output<Optional<String>> healthcheckPath() {
        return Codegen.optional(this.healthcheckPath);
    }
    /**
     * The healthcheck service port to probe (must be between `1` and `65535`).
     * 
     */
    @Export(name="healthcheckPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthcheckPort;

    /**
     * @return The healthcheck service port to probe (must be between `1` and `65535`).
     * 
     */
    public Output<Optional<Integer>> healthcheckPort() {
        return Codegen.optional(this.healthcheckPort);
    }
    /**
     * The number of unsuccessful healthcheck probes before considering the target unhealthy (must be between `1` and `20`).
     * 
     */
    @Export(name="healthcheckStrikesFail", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthcheckStrikesFail;

    /**
     * @return The number of unsuccessful healthcheck probes before considering the target unhealthy (must be between `1` and `20`).
     * 
     */
    public Output<Optional<Integer>> healthcheckStrikesFail() {
        return Codegen.optional(this.healthcheckStrikesFail);
    }
    /**
     * The number of successful healthcheck probes before considering the target healthy (must be between `1` and `20`).
     * 
     */
    @Export(name="healthcheckStrikesOk", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthcheckStrikesOk;

    /**
     * @return The number of successful healthcheck probes before considering the target healthy (must be between `1` and `20`).
     * 
     */
    public Output<Optional<Integer>> healthcheckStrikesOk() {
        return Codegen.optional(this.healthcheckStrikesOk);
    }
    /**
     * The time in seconds before considering a healthcheck probing failed (must be between `2` and `60`).
     * 
     */
    @Export(name="healthcheckTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthcheckTimeout;

    /**
     * @return The time in seconds before considering a healthcheck probing failed (must be between `2` and `60`).
     * 
     */
    public Output<Optional<Integer>> healthcheckTimeout() {
        return Codegen.optional(this.healthcheckTimeout);
    }
    /**
     * Disable TLS certificate validation in `https` mode (boolean; default: `false`). Note: this parameter can only be changed to `true`, it cannot be reset to `false` later on (requires a resource re-creation).
     * 
     */
    @Export(name="healthcheckTlsSkipVerify", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> healthcheckTlsSkipVerify;

    /**
     * @return Disable TLS certificate validation in `https` mode (boolean; default: `false`). Note: this parameter can only be changed to `true`, it cannot be reset to `false` later on (requires a resource re-creation).
     * 
     */
    public Output<Optional<Boolean>> healthcheckTlsSkipVerify() {
        return Codegen.optional(this.healthcheckTlsSkipVerify);
    }
    /**
     * The healthcheck TLS server name to specify in `https` mode. Note: this parameter can only be changed to a non-empty value, it cannot be reset to its default empty value later on (requires a resource re-creation).
     * 
     */
    @Export(name="healthcheckTlsSni", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthcheckTlsSni;

    /**
     * @return The healthcheck TLS server name to specify in `https` mode. Note: this parameter can only be changed to a non-empty value, it cannot be reset to its default empty value later on (requires a resource re-creation).
     * 
     */
    public Output<Optional<String>> healthcheckTlsSni() {
        return Codegen.optional(this.healthcheckTlsSni);
    }
    /**
     * The Elastic IP (EIP) IPv4 address.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The Elastic IP (EIP) IPv4 address.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The EIP reverse DNS record (must end with a `.`; e.g: `my-eip.example.net.`).
     * 
     */
    @Export(name="reverseDns", type=String.class, parameters={})
    private Output</* @Nullable */ String> reverseDns;

    /**
     * @return The EIP reverse DNS record (must end with a `.`; e.g: `my-eip.example.net.`).
     * 
     */
    public Output<Optional<String>> reverseDns() {
        return Codegen.optional(this.reverseDns);
    }
    /**
     * A dictionary of tags (key/value). To remove all tags, set `tags = {}`.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return A dictionary of tags (key/value). To remove all tags, set `tags = {}`.
     * 
     */
    public Output<Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The Exoscale Zone name
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The Exoscale Zone name
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPAddress(String name) {
        this(name, IPAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPAddress(String name, IPAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPAddress(String name, IPAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/iPAddress:IPAddress", name, args == null ? IPAddressArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IPAddress(String name, Output<String> id, @Nullable IPAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/iPAddress:IPAddress", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IPAddress get(String name, Output<String> id, @Nullable IPAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IPAddress(name, id, state, options);
    }
}
