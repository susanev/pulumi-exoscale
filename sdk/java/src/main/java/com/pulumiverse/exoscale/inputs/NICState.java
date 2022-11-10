// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NICState extends com.pulumi.resources.ResourceArgs {

    public static final NICState Empty = new NICState();

    /**
     * The compute instance ID.
     * 
     */
    @Import(name="computeId")
    private @Nullable Output<String> computeId;

    /**
     * @return The compute instance ID.
     * 
     */
    public Optional<Output<String>> computeId() {
        return Optional.ofNullable(this.computeId);
    }

    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * The IPv4 address to request as static DHCP lease if the NIC is attached to a *managed* private network.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IPv4 address to request as static DHCP lease if the NIC is attached to a *managed* private network.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The NIC MAC address.
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    /**
     * @return The NIC MAC address.
     * 
     */
    public Optional<Output<String>> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    @Import(name="netmask")
    private @Nullable Output<String> netmask;

    public Optional<Output<String>> netmask() {
        return Optional.ofNullable(this.netmask);
    }

    /**
     * The private network ID.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return The private network ID.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private NICState() {}

    private NICState(NICState $) {
        this.computeId = $.computeId;
        this.gateway = $.gateway;
        this.ipAddress = $.ipAddress;
        this.macAddress = $.macAddress;
        this.netmask = $.netmask;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NICState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NICState $;

        public Builder() {
            $ = new NICState();
        }

        public Builder(NICState defaults) {
            $ = new NICState(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeId The compute instance ID.
         * 
         * @return builder
         * 
         */
        public Builder computeId(@Nullable Output<String> computeId) {
            $.computeId = computeId;
            return this;
        }

        /**
         * @param computeId The compute instance ID.
         * 
         * @return builder
         * 
         */
        public Builder computeId(String computeId) {
            return computeId(Output.of(computeId));
        }

        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param ipAddress The IPv4 address to request as static DHCP lease if the NIC is attached to a *managed* private network.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IPv4 address to request as static DHCP lease if the NIC is attached to a *managed* private network.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param macAddress The NIC MAC address.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param macAddress The NIC MAC address.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(String macAddress) {
            return macAddress(Output.of(macAddress));
        }

        public Builder netmask(@Nullable Output<String> netmask) {
            $.netmask = netmask;
            return this;
        }

        public Builder netmask(String netmask) {
            return netmask(Output.of(netmask));
        }

        /**
         * @param networkId The private network ID.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId The private network ID.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public NICState build() {
            return $;
        }
    }

}