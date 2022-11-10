// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityGroupRulesIngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupRulesIngressArgs Empty = new SecurityGroupRulesIngressArgs();

    /**
     * A list of (`INGRESS`) source / (`EGRESS`) destination IP subnet (in CIDR notation) to match.
     * 
     */
    @Import(name="cidrLists")
    private @Nullable Output<List<String>> cidrLists;

    /**
     * @return A list of (`INGRESS`) source / (`EGRESS`) destination IP subnet (in CIDR notation) to match.
     * 
     */
    public Optional<Output<List<String>>> cidrLists() {
        return Optional.ofNullable(this.cidrLists);
    }

    /**
     * A free-form text describing the block.
     * * `icmp_type`/`icmp_code` - An ICMP/ICMPv6 type/code to match.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A free-form text describing the block.
     * * `icmp_type`/`icmp_code` - An ICMP/ICMPv6 type/code to match.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="icmpCode")
    private @Nullable Output<Integer> icmpCode;

    public Optional<Output<Integer>> icmpCode() {
        return Optional.ofNullable(this.icmpCode);
    }

    @Import(name="icmpType")
    private @Nullable Output<Integer> icmpType;

    public Optional<Output<Integer>> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }

    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A list of ports or port ranges (`&lt;start_port&gt;-&lt;end_port&gt;`).
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<String>> ports;

    /**
     * @return A list of ports or port ranges (`&lt;start_port&gt;-&lt;end_port&gt;`).
     * 
     */
    public Optional<Output<List<String>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`).
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`).
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * A list of source (for ingress)/destination (for egress) identified by a security group.
     * 
     */
    @Import(name="userSecurityGroupLists")
    private @Nullable Output<List<String>> userSecurityGroupLists;

    /**
     * @return A list of source (for ingress)/destination (for egress) identified by a security group.
     * 
     */
    public Optional<Output<List<String>>> userSecurityGroupLists() {
        return Optional.ofNullable(this.userSecurityGroupLists);
    }

    private SecurityGroupRulesIngressArgs() {}

    private SecurityGroupRulesIngressArgs(SecurityGroupRulesIngressArgs $) {
        this.cidrLists = $.cidrLists;
        this.description = $.description;
        this.icmpCode = $.icmpCode;
        this.icmpType = $.icmpType;
        this.ids = $.ids;
        this.ports = $.ports;
        this.protocol = $.protocol;
        this.userSecurityGroupLists = $.userSecurityGroupLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGroupRulesIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGroupRulesIngressArgs $;

        public Builder() {
            $ = new SecurityGroupRulesIngressArgs();
        }

        public Builder(SecurityGroupRulesIngressArgs defaults) {
            $ = new SecurityGroupRulesIngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrLists A list of (`INGRESS`) source / (`EGRESS`) destination IP subnet (in CIDR notation) to match.
         * 
         * @return builder
         * 
         */
        public Builder cidrLists(@Nullable Output<List<String>> cidrLists) {
            $.cidrLists = cidrLists;
            return this;
        }

        /**
         * @param cidrLists A list of (`INGRESS`) source / (`EGRESS`) destination IP subnet (in CIDR notation) to match.
         * 
         * @return builder
         * 
         */
        public Builder cidrLists(List<String> cidrLists) {
            return cidrLists(Output.of(cidrLists));
        }

        /**
         * @param cidrLists A list of (`INGRESS`) source / (`EGRESS`) destination IP subnet (in CIDR notation) to match.
         * 
         * @return builder
         * 
         */
        public Builder cidrLists(String... cidrLists) {
            return cidrLists(List.of(cidrLists));
        }

        /**
         * @param description A free-form text describing the block.
         * * `icmp_type`/`icmp_code` - An ICMP/ICMPv6 type/code to match.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A free-form text describing the block.
         * * `icmp_type`/`icmp_code` - An ICMP/ICMPv6 type/code to match.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder icmpCode(@Nullable Output<Integer> icmpCode) {
            $.icmpCode = icmpCode;
            return this;
        }

        public Builder icmpCode(Integer icmpCode) {
            return icmpCode(Output.of(icmpCode));
        }

        public Builder icmpType(@Nullable Output<Integer> icmpType) {
            $.icmpType = icmpType;
            return this;
        }

        public Builder icmpType(Integer icmpType) {
            return icmpType(Output.of(icmpType));
        }

        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param ports A list of ports or port ranges (`&lt;start_port&gt;-&lt;end_port&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<String>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports A list of ports or port ranges (`&lt;start_port&gt;-&lt;end_port&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder ports(List<String> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports A list of ports or port ranges (`&lt;start_port&gt;-&lt;end_port&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param protocol The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`).
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`).
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param userSecurityGroupLists A list of source (for ingress)/destination (for egress) identified by a security group.
         * 
         * @return builder
         * 
         */
        public Builder userSecurityGroupLists(@Nullable Output<List<String>> userSecurityGroupLists) {
            $.userSecurityGroupLists = userSecurityGroupLists;
            return this;
        }

        /**
         * @param userSecurityGroupLists A list of source (for ingress)/destination (for egress) identified by a security group.
         * 
         * @return builder
         * 
         */
        public Builder userSecurityGroupLists(List<String> userSecurityGroupLists) {
            return userSecurityGroupLists(Output.of(userSecurityGroupLists));
        }

        /**
         * @param userSecurityGroupLists A list of source (for ingress)/destination (for egress) identified by a security group.
         * 
         * @return builder
         * 
         */
        public Builder userSecurityGroupLists(String... userSecurityGroupLists) {
            return userSecurityGroupLists(List.of(userSecurityGroupLists));
        }

        public SecurityGroupRulesIngressArgs build() {
            return $;
        }
    }

}
