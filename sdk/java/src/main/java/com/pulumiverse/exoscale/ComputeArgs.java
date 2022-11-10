// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeArgs Empty = new ComputeArgs();

    /**
     * A list of anti-affinity groups (IDs; at creation time only; conflicts with `affinity_groups`).
     * 
     */
    @Import(name="affinityGroupIds")
    private @Nullable Output<List<String>> affinityGroupIds;

    /**
     * @return A list of anti-affinity groups (IDs; at creation time only; conflicts with `affinity_groups`).
     * 
     */
    public Optional<Output<List<String>>> affinityGroupIds() {
        return Optional.ofNullable(this.affinityGroupIds);
    }

    /**
     * A list of anti-affinity groups (names; at creation time only; conflicts with `affinity_group_ids`).
     * 
     */
    @Import(name="affinityGroups")
    private @Nullable Output<List<String>> affinityGroups;

    /**
     * @return A list of anti-affinity groups (names; at creation time only; conflicts with `affinity_group_ids`).
     * 
     */
    public Optional<Output<List<String>>> affinityGroups() {
        return Optional.ofNullable(this.affinityGroups);
    }

    /**
     * The instance disk size (GiB; at least `10`).
     * 
     */
    @Import(name="diskSize", required=true)
    private Output<Integer> diskSize;

    /**
     * @return The instance disk size (GiB; at least `10`).
     * 
     */
    public Output<Integer> diskSize() {
        return this.diskSize;
    }

    /**
     * The displayed instance name. Note: if the `hostname` attribute is not set, this attribute is also used to set the OS&#39; *hostname* during creation, so the value must contain only alphanumeric and hyphen (&#34;-&#34;) characters; it can be changed to any character during a later update. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The displayed instance name. Note: if the `hostname` attribute is not set, this attribute is also used to set the OS&#39; *hostname* during creation, so the value must contain only alphanumeric and hyphen (&#34;-&#34;) characters; it can be changed to any character during a later update. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The instance hostname, must contain only alphanumeric and hyphen (`-`) characters. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically. Note: updating this attribute&#39;s value requires to reboot the instance.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The instance hostname, must contain only alphanumeric and hyphen (`-`) characters. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically. Note: updating this attribute&#39;s value requires to reboot the instance.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Enable IPv4 on the instance (only supported value is `true`).
     * 
     */
    @Import(name="ip4")
    private @Nullable Output<Boolean> ip4;

    /**
     * @return Enable IPv4 on the instance (only supported value is `true`).
     * 
     */
    public Optional<Output<Boolean>> ip4() {
        return Optional.ofNullable(this.ip4);
    }

    /**
     * Enable IPv6 on the instance (boolean; default: `false`).
     * 
     */
    @Import(name="ip6")
    private @Nullable Output<Boolean> ip6;

    /**
     * @return Enable IPv6 on the instance (boolean; default: `false`).
     * 
     */
    public Optional<Output<Boolean>> ip6() {
        return Optional.ofNullable(this.ip6);
    }

    /**
     * The SSH keypair (name) to authorize in the instance.
     * 
     */
    @Import(name="keyPair")
    private @Nullable Output<String> keyPair;

    /**
     * @return The SSH keypair (name) to authorize in the instance.
     * 
     */
    public Optional<Output<String>> keyPair() {
        return Optional.ofNullable(this.keyPair);
    }

    /**
     * The keyboard layout configuration (`de`, `de-ch`, `es`, `fi`, `fr`, `fr-be`, `fr-ch`, `is`, `it`, `jp`, `nl-be`, `no`, `pt`, `uk`, `us`; at creation time only).
     * 
     */
    @Import(name="keyboard")
    private @Nullable Output<String> keyboard;

    /**
     * @return The keyboard layout configuration (`de`, `de-ch`, `es`, `fi`, `fr`, `fr-be`, `fr-ch`, `is`, `it`, `jp`, `nl-be`, `no`, `pt`, `uk`, `us`; at creation time only).
     * 
     */
    public Optional<Output<String>> keyboard() {
        return Optional.ofNullable(this.keyboard);
    }

    /**
     * The instance reverse DNS record (must end with a `.`; e.g: `my-instance.example.net.`).
     * 
     */
    @Import(name="reverseDns")
    private @Nullable Output<String> reverseDns;

    /**
     * @return The instance reverse DNS record (must end with a `.`; e.g: `my-instance.example.net.`).
     * 
     */
    public Optional<Output<String>> reverseDns() {
        return Optional.ofNullable(this.reverseDns);
    }

    /**
     * A list of security groups (IDs; conflicts with `security_groups`).
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return A list of security groups (IDs; conflicts with `security_groups`).
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * A list of security groups (names; conflicts with `security_group_ids`).
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return A list of security groups (names; conflicts with `security_group_ids`).
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The instance size (`Tiny`, `Small`, `Medium`, `Large`, etc.)
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The instance size (`Tiny`, `Small`, `Medium`, `Large`, etc.)
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The instance state (`Running` or `Stopped`; default: `Running`)
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The instance state (`Running` or `Stopped`; default: `Running`)
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A map of tags (key/value). To remove all tags, set `tags = {}`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags (key/value). To remove all tags, set `tags = {}`.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The compute instance template (name). Only *featured* templates are available, if you want to reference *custom templates* use the `template_id` attribute instead.
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return The compute instance template (name). Only *featured* templates are available, if you want to reference *custom templates* use the `template_id` attribute instead.
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The compute instance template (ID). Usage of the `exoscale.getComputeTemplate` data source is recommended.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return The compute instance template (ID). Usage of the `exoscale.getComputeTemplate` data source is recommended.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    /**
     * cloud-init configuration (no need to base64-encode or gzip it as the provider will take care of it).
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return cloud-init configuration (no need to base64-encode or gzip it as the provider will take care of it).
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The Exoscale Zone name.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The Exoscale Zone name.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private ComputeArgs() {}

    private ComputeArgs(ComputeArgs $) {
        this.affinityGroupIds = $.affinityGroupIds;
        this.affinityGroups = $.affinityGroups;
        this.diskSize = $.diskSize;
        this.displayName = $.displayName;
        this.hostname = $.hostname;
        this.ip4 = $.ip4;
        this.ip6 = $.ip6;
        this.keyPair = $.keyPair;
        this.keyboard = $.keyboard;
        this.reverseDns = $.reverseDns;
        this.securityGroupIds = $.securityGroupIds;
        this.securityGroups = $.securityGroups;
        this.size = $.size;
        this.state = $.state;
        this.tags = $.tags;
        this.template = $.template;
        this.templateId = $.templateId;
        this.userData = $.userData;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeArgs $;

        public Builder() {
            $ = new ComputeArgs();
        }

        public Builder(ComputeArgs defaults) {
            $ = new ComputeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param affinityGroupIds A list of anti-affinity groups (IDs; at creation time only; conflicts with `affinity_groups`).
         * 
         * @return builder
         * 
         */
        public Builder affinityGroupIds(@Nullable Output<List<String>> affinityGroupIds) {
            $.affinityGroupIds = affinityGroupIds;
            return this;
        }

        /**
         * @param affinityGroupIds A list of anti-affinity groups (IDs; at creation time only; conflicts with `affinity_groups`).
         * 
         * @return builder
         * 
         */
        public Builder affinityGroupIds(List<String> affinityGroupIds) {
            return affinityGroupIds(Output.of(affinityGroupIds));
        }

        /**
         * @param affinityGroupIds A list of anti-affinity groups (IDs; at creation time only; conflicts with `affinity_groups`).
         * 
         * @return builder
         * 
         */
        public Builder affinityGroupIds(String... affinityGroupIds) {
            return affinityGroupIds(List.of(affinityGroupIds));
        }

        /**
         * @param affinityGroups A list of anti-affinity groups (names; at creation time only; conflicts with `affinity_group_ids`).
         * 
         * @return builder
         * 
         */
        public Builder affinityGroups(@Nullable Output<List<String>> affinityGroups) {
            $.affinityGroups = affinityGroups;
            return this;
        }

        /**
         * @param affinityGroups A list of anti-affinity groups (names; at creation time only; conflicts with `affinity_group_ids`).
         * 
         * @return builder
         * 
         */
        public Builder affinityGroups(List<String> affinityGroups) {
            return affinityGroups(Output.of(affinityGroups));
        }

        /**
         * @param affinityGroups A list of anti-affinity groups (names; at creation time only; conflicts with `affinity_group_ids`).
         * 
         * @return builder
         * 
         */
        public Builder affinityGroups(String... affinityGroups) {
            return affinityGroups(List.of(affinityGroups));
        }

        /**
         * @param diskSize The instance disk size (GiB; at least `10`).
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The instance disk size (GiB; at least `10`).
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param displayName The displayed instance name. Note: if the `hostname` attribute is not set, this attribute is also used to set the OS&#39; *hostname* during creation, so the value must contain only alphanumeric and hyphen (&#34;-&#34;) characters; it can be changed to any character during a later update. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The displayed instance name. Note: if the `hostname` attribute is not set, this attribute is also used to set the OS&#39; *hostname* during creation, so the value must contain only alphanumeric and hyphen (&#34;-&#34;) characters; it can be changed to any character during a later update. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param hostname The instance hostname, must contain only alphanumeric and hyphen (`-`) characters. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically. Note: updating this attribute&#39;s value requires to reboot the instance.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The instance hostname, must contain only alphanumeric and hyphen (`-`) characters. If neither `display_name` or `hostname` attributes are set, a random value will be generated automatically. Note: updating this attribute&#39;s value requires to reboot the instance.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ip4 Enable IPv4 on the instance (only supported value is `true`).
         * 
         * @return builder
         * 
         */
        public Builder ip4(@Nullable Output<Boolean> ip4) {
            $.ip4 = ip4;
            return this;
        }

        /**
         * @param ip4 Enable IPv4 on the instance (only supported value is `true`).
         * 
         * @return builder
         * 
         */
        public Builder ip4(Boolean ip4) {
            return ip4(Output.of(ip4));
        }

        /**
         * @param ip6 Enable IPv6 on the instance (boolean; default: `false`).
         * 
         * @return builder
         * 
         */
        public Builder ip6(@Nullable Output<Boolean> ip6) {
            $.ip6 = ip6;
            return this;
        }

        /**
         * @param ip6 Enable IPv6 on the instance (boolean; default: `false`).
         * 
         * @return builder
         * 
         */
        public Builder ip6(Boolean ip6) {
            return ip6(Output.of(ip6));
        }

        /**
         * @param keyPair The SSH keypair (name) to authorize in the instance.
         * 
         * @return builder
         * 
         */
        public Builder keyPair(@Nullable Output<String> keyPair) {
            $.keyPair = keyPair;
            return this;
        }

        /**
         * @param keyPair The SSH keypair (name) to authorize in the instance.
         * 
         * @return builder
         * 
         */
        public Builder keyPair(String keyPair) {
            return keyPair(Output.of(keyPair));
        }

        /**
         * @param keyboard The keyboard layout configuration (`de`, `de-ch`, `es`, `fi`, `fr`, `fr-be`, `fr-ch`, `is`, `it`, `jp`, `nl-be`, `no`, `pt`, `uk`, `us`; at creation time only).
         * 
         * @return builder
         * 
         */
        public Builder keyboard(@Nullable Output<String> keyboard) {
            $.keyboard = keyboard;
            return this;
        }

        /**
         * @param keyboard The keyboard layout configuration (`de`, `de-ch`, `es`, `fi`, `fr`, `fr-be`, `fr-ch`, `is`, `it`, `jp`, `nl-be`, `no`, `pt`, `uk`, `us`; at creation time only).
         * 
         * @return builder
         * 
         */
        public Builder keyboard(String keyboard) {
            return keyboard(Output.of(keyboard));
        }

        /**
         * @param reverseDns The instance reverse DNS record (must end with a `.`; e.g: `my-instance.example.net.`).
         * 
         * @return builder
         * 
         */
        public Builder reverseDns(@Nullable Output<String> reverseDns) {
            $.reverseDns = reverseDns;
            return this;
        }

        /**
         * @param reverseDns The instance reverse DNS record (must end with a `.`; e.g: `my-instance.example.net.`).
         * 
         * @return builder
         * 
         */
        public Builder reverseDns(String reverseDns) {
            return reverseDns(Output.of(reverseDns));
        }

        /**
         * @param securityGroupIds A list of security groups (IDs; conflicts with `security_groups`).
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of security groups (IDs; conflicts with `security_groups`).
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of security groups (IDs; conflicts with `security_groups`).
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param securityGroups A list of security groups (names; conflicts with `security_group_ids`).
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups A list of security groups (names; conflicts with `security_group_ids`).
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups A list of security groups (names; conflicts with `security_group_ids`).
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param size The instance size (`Tiny`, `Small`, `Medium`, `Large`, etc.)
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The instance size (`Tiny`, `Small`, `Medium`, `Large`, etc.)
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param state The instance state (`Running` or `Stopped`; default: `Running`)
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The instance state (`Running` or `Stopped`; default: `Running`)
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags A map of tags (key/value). To remove all tags, set `tags = {}`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags (key/value). To remove all tags, set `tags = {}`.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param template The compute instance template (name). Only *featured* templates are available, if you want to reference *custom templates* use the `template_id` attribute instead.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The compute instance template (name). Only *featured* templates are available, if you want to reference *custom templates* use the `template_id` attribute instead.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param templateId The compute instance template (ID). Usage of the `exoscale.getComputeTemplate` data source is recommended.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId The compute instance template (ID). Usage of the `exoscale.getComputeTemplate` data source is recommended.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param userData cloud-init configuration (no need to base64-encode or gzip it as the provider will take care of it).
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData cloud-init configuration (no need to base64-encode or gzip it as the provider will take care of it).
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param zone The Exoscale Zone name.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The Exoscale Zone name.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ComputeArgs build() {
            $.diskSize = Objects.requireNonNull($.diskSize, "expected parameter 'diskSize' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
