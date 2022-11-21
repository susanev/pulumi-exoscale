// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * !> **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.PrivateNetwork instead.
 */
export function getNetwork(args: GetNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("exoscale:index/getNetwork:getNetwork", {
        "id": args.id,
        "name": args.name,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkArgs {
    /**
     * The private network ID to match (conflicts with `name`).
     */
    id?: string;
    /**
     * The network name to match (conflicts with `id`).
     */
    name?: string;
    /**
     * The Exoscale Zone name.
     */
    zone: string;
}

/**
 * A collection of values returned by getNetwork.
 */
export interface GetNetworkResult {
    /**
     * The private network description.
     */
    readonly description: string;
    readonly endIp: string;
    readonly id?: string;
    readonly name?: string;
    /**
     * The network mask defining the IPv4 network allowed for static leases.
     * * `startIp`/`endIp` - The first/last IPv4 addresses used by the DHCP service for dynamic leases.
     */
    readonly netmask: string;
    readonly startIp: string;
    readonly zone: string;
}

export function getNetworkOutput(args: GetNetworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkResult> {
    return pulumi.output(args).apply(a => getNetwork(a, opts))
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkOutputArgs {
    /**
     * The private network ID to match (conflicts with `name`).
     */
    id?: pulumi.Input<string>;
    /**
     * The network name to match (conflicts with `id`).
     */
    name?: pulumi.Input<string>;
    /**
     * The Exoscale Zone name.
     */
    zone: pulumi.Input<string>;
}
