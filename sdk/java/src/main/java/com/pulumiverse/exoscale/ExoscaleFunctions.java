// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.GetAffinityArgs;
import com.pulumiverse.exoscale.inputs.GetAffinityPlainArgs;
import com.pulumiverse.exoscale.inputs.GetAntiAffinityGroupArgs;
import com.pulumiverse.exoscale.inputs.GetAntiAffinityGroupPlainArgs;
import com.pulumiverse.exoscale.inputs.GetComputeArgs;
import com.pulumiverse.exoscale.inputs.GetComputeIPAddressArgs;
import com.pulumiverse.exoscale.inputs.GetComputeIPAddressPlainArgs;
import com.pulumiverse.exoscale.inputs.GetComputeInstanceArgs;
import com.pulumiverse.exoscale.inputs.GetComputeInstanceListArgs;
import com.pulumiverse.exoscale.inputs.GetComputeInstanceListPlainArgs;
import com.pulumiverse.exoscale.inputs.GetComputeInstancePlainArgs;
import com.pulumiverse.exoscale.inputs.GetComputePlainArgs;
import com.pulumiverse.exoscale.inputs.GetComputeTemplateArgs;
import com.pulumiverse.exoscale.inputs.GetComputeTemplatePlainArgs;
import com.pulumiverse.exoscale.inputs.GetDomainArgs;
import com.pulumiverse.exoscale.inputs.GetDomainPlainArgs;
import com.pulumiverse.exoscale.inputs.GetDomainRecordArgs;
import com.pulumiverse.exoscale.inputs.GetDomainRecordPlainArgs;
import com.pulumiverse.exoscale.inputs.GetElasticIPArgs;
import com.pulumiverse.exoscale.inputs.GetElasticIPPlainArgs;
import com.pulumiverse.exoscale.inputs.GetInstancePoolArgs;
import com.pulumiverse.exoscale.inputs.GetInstancePoolListArgs;
import com.pulumiverse.exoscale.inputs.GetInstancePoolListPlainArgs;
import com.pulumiverse.exoscale.inputs.GetInstancePoolPlainArgs;
import com.pulumiverse.exoscale.inputs.GetNLBArgs;
import com.pulumiverse.exoscale.inputs.GetNLBPlainArgs;
import com.pulumiverse.exoscale.inputs.GetNetworkArgs;
import com.pulumiverse.exoscale.inputs.GetNetworkPlainArgs;
import com.pulumiverse.exoscale.inputs.GetPrivateNetworkArgs;
import com.pulumiverse.exoscale.inputs.GetPrivateNetworkPlainArgs;
import com.pulumiverse.exoscale.inputs.GetSecurityGroupArgs;
import com.pulumiverse.exoscale.inputs.GetSecurityGroupPlainArgs;
import com.pulumiverse.exoscale.outputs.GetAffinityResult;
import com.pulumiverse.exoscale.outputs.GetAntiAffinityGroupResult;
import com.pulumiverse.exoscale.outputs.GetComputeIPAddressResult;
import com.pulumiverse.exoscale.outputs.GetComputeInstanceListResult;
import com.pulumiverse.exoscale.outputs.GetComputeInstanceResult;
import com.pulumiverse.exoscale.outputs.GetComputeResult;
import com.pulumiverse.exoscale.outputs.GetComputeTemplateResult;
import com.pulumiverse.exoscale.outputs.GetDomainRecordResult;
import com.pulumiverse.exoscale.outputs.GetDomainResult;
import com.pulumiverse.exoscale.outputs.GetElasticIPResult;
import com.pulumiverse.exoscale.outputs.GetInstancePoolListResult;
import com.pulumiverse.exoscale.outputs.GetInstancePoolResult;
import com.pulumiverse.exoscale.outputs.GetNLBResult;
import com.pulumiverse.exoscale.outputs.GetNetworkResult;
import com.pulumiverse.exoscale.outputs.GetPrivateNetworkResult;
import com.pulumiverse.exoscale.outputs.GetSecurityGroupResult;
import java.util.concurrent.CompletableFuture;

public final class ExoscaleFunctions {
    /**
     * !&gt; **WARNING:** This data source is DEPRECATED and will be removed in the next major version. Please use exoscale.AntiAffinityGroup instead.
     * 
     */
    public static Output<GetAffinityResult> getAffinity() {
        return getAffinity(GetAffinityArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is DEPRECATED and will be removed in the next major version. Please use exoscale.AntiAffinityGroup instead.
     * 
     */
    public static CompletableFuture<GetAffinityResult> getAffinityPlain() {
        return getAffinityPlain(GetAffinityPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is DEPRECATED and will be removed in the next major version. Please use exoscale.AntiAffinityGroup instead.
     * 
     */
    public static Output<GetAffinityResult> getAffinity(GetAffinityArgs args) {
        return getAffinity(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is DEPRECATED and will be removed in the next major version. Please use exoscale.AntiAffinityGroup instead.
     * 
     */
    public static CompletableFuture<GetAffinityResult> getAffinityPlain(GetAffinityPlainArgs args) {
        return getAffinityPlain(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is DEPRECATED and will be removed in the next major version. Please use exoscale.AntiAffinityGroup instead.
     * 
     */
    public static Output<GetAffinityResult> getAffinity(GetAffinityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getAffinity:getAffinity", TypeShape.of(GetAffinityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is DEPRECATED and will be removed in the next major version. Please use exoscale.AntiAffinityGroup instead.
     * 
     */
    public static CompletableFuture<GetAffinityResult> getAffinityPlain(GetAffinityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getAffinity:getAffinity", TypeShape.of(GetAffinityResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetAntiAffinityGroupResult> getAntiAffinityGroup() {
        return getAntiAffinityGroup(GetAntiAffinityGroupArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAntiAffinityGroupResult> getAntiAffinityGroupPlain() {
        return getAntiAffinityGroupPlain(GetAntiAffinityGroupPlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<GetAntiAffinityGroupResult> getAntiAffinityGroup(GetAntiAffinityGroupArgs args) {
        return getAntiAffinityGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAntiAffinityGroupResult> getAntiAffinityGroupPlain(GetAntiAffinityGroupPlainArgs args) {
        return getAntiAffinityGroupPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetAntiAffinityGroupResult> getAntiAffinityGroup(GetAntiAffinityGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getAntiAffinityGroup:getAntiAffinityGroup", TypeShape.of(GetAntiAffinityGroupResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetAntiAffinityGroupResult> getAntiAffinityGroupPlain(GetAntiAffinityGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getAntiAffinityGroup:getAntiAffinityGroup", TypeShape.of(GetAntiAffinityGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance instead.
     * 
     */
    public static Output<GetComputeResult> getCompute() {
        return getCompute(GetComputeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance instead.
     * 
     */
    public static CompletableFuture<GetComputeResult> getComputePlain() {
        return getComputePlain(GetComputePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance instead.
     * 
     */
    public static Output<GetComputeResult> getCompute(GetComputeArgs args) {
        return getCompute(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance instead.
     * 
     */
    public static CompletableFuture<GetComputeResult> getComputePlain(GetComputePlainArgs args) {
        return getComputePlain(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance instead.
     * 
     */
    public static Output<GetComputeResult> getCompute(GetComputeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getCompute:getCompute", TypeShape.of(GetComputeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance instead.
     * 
     */
    public static CompletableFuture<GetComputeResult> getComputePlain(GetComputePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getCompute:getCompute", TypeShape.of(GetComputeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ElasticIP instead.
     * 
     */
    public static Output<GetComputeIPAddressResult> getComputeIPAddress(GetComputeIPAddressArgs args) {
        return getComputeIPAddress(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ElasticIP instead.
     * 
     */
    public static CompletableFuture<GetComputeIPAddressResult> getComputeIPAddressPlain(GetComputeIPAddressPlainArgs args) {
        return getComputeIPAddressPlain(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ElasticIP instead.
     * 
     */
    public static Output<GetComputeIPAddressResult> getComputeIPAddress(GetComputeIPAddressArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getComputeIPAddress:getComputeIPAddress", TypeShape.of(GetComputeIPAddressResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ElasticIP instead.
     * 
     */
    public static CompletableFuture<GetComputeIPAddressResult> getComputeIPAddressPlain(GetComputeIPAddressPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getComputeIPAddress:getComputeIPAddress", TypeShape.of(GetComputeIPAddressResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetComputeInstanceResult> getComputeInstance(GetComputeInstanceArgs args) {
        return getComputeInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetComputeInstanceResult> getComputeInstancePlain(GetComputeInstancePlainArgs args) {
        return getComputeInstancePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetComputeInstanceResult> getComputeInstance(GetComputeInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getComputeInstance:getComputeInstance", TypeShape.of(GetComputeInstanceResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetComputeInstanceResult> getComputeInstancePlain(GetComputeInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getComputeInstance:getComputeInstance", TypeShape.of(GetComputeInstanceResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetComputeInstanceListResult> getComputeInstanceList(GetComputeInstanceListArgs args) {
        return getComputeInstanceList(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetComputeInstanceListResult> getComputeInstanceListPlain(GetComputeInstanceListPlainArgs args) {
        return getComputeInstanceListPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetComputeInstanceListResult> getComputeInstanceList(GetComputeInstanceListArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getComputeInstanceList:getComputeInstanceList", TypeShape.of(GetComputeInstanceListResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetComputeInstanceListResult> getComputeInstanceListPlain(GetComputeInstanceListPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getComputeInstanceList:getComputeInstanceList", TypeShape.of(GetComputeInstanceListResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetComputeTemplateResult> getComputeTemplate(GetComputeTemplateArgs args) {
        return getComputeTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetComputeTemplateResult> getComputeTemplatePlain(GetComputeTemplatePlainArgs args) {
        return getComputeTemplatePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetComputeTemplateResult> getComputeTemplate(GetComputeTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getComputeTemplate:getComputeTemplate", TypeShape.of(GetComputeTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetComputeTemplateResult> getComputeTemplatePlain(GetComputeTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getComputeTemplate:getComputeTemplate", TypeShape.of(GetComputeTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args) {
        return getDomainPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetDomainRecordResult> getDomainRecord(GetDomainRecordArgs args) {
        return getDomainRecord(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainRecordResult> getDomainRecordPlain(GetDomainRecordPlainArgs args) {
        return getDomainRecordPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetDomainRecordResult> getDomainRecord(GetDomainRecordArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getDomainRecord:getDomainRecord", TypeShape.of(GetDomainRecordResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetDomainRecordResult> getDomainRecordPlain(GetDomainRecordPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getDomainRecord:getDomainRecord", TypeShape.of(GetDomainRecordResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetElasticIPResult> getElasticIP(GetElasticIPArgs args) {
        return getElasticIP(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetElasticIPResult> getElasticIPPlain(GetElasticIPPlainArgs args) {
        return getElasticIPPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetElasticIPResult> getElasticIP(GetElasticIPArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getElasticIP:getElasticIP", TypeShape.of(GetElasticIPResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetElasticIPResult> getElasticIPPlain(GetElasticIPPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getElasticIP:getElasticIP", TypeShape.of(GetElasticIPResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetInstancePoolResult> getInstancePool(GetInstancePoolArgs args) {
        return getInstancePool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstancePoolResult> getInstancePoolPlain(GetInstancePoolPlainArgs args) {
        return getInstancePoolPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetInstancePoolResult> getInstancePool(GetInstancePoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getInstancePool:getInstancePool", TypeShape.of(GetInstancePoolResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetInstancePoolResult> getInstancePoolPlain(GetInstancePoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getInstancePool:getInstancePool", TypeShape.of(GetInstancePoolResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetInstancePoolListResult> getInstancePoolList(GetInstancePoolListArgs args) {
        return getInstancePoolList(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstancePoolListResult> getInstancePoolListPlain(GetInstancePoolListPlainArgs args) {
        return getInstancePoolListPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetInstancePoolListResult> getInstancePoolList(GetInstancePoolListArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getInstancePoolList:getInstancePoolList", TypeShape.of(GetInstancePoolListResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetInstancePoolListResult> getInstancePoolListPlain(GetInstancePoolListPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getInstancePoolList:getInstancePoolList", TypeShape.of(GetInstancePoolListResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetNLBResult> getNLB(GetNLBArgs args) {
        return getNLB(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNLBResult> getNLBPlain(GetNLBPlainArgs args) {
        return getNLBPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetNLBResult> getNLB(GetNLBArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getNLB:getNLB", TypeShape.of(GetNLBResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetNLBResult> getNLBPlain(GetNLBPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getNLB:getNLB", TypeShape.of(GetNLBResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.PrivateNetwork instead.
     * 
     */
    public static Output<GetNetworkResult> getNetwork(GetNetworkArgs args) {
        return getNetwork(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.PrivateNetwork instead.
     * 
     */
    public static CompletableFuture<GetNetworkResult> getNetworkPlain(GetNetworkPlainArgs args) {
        return getNetworkPlain(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.PrivateNetwork instead.
     * 
     */
    public static Output<GetNetworkResult> getNetwork(GetNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getNetwork:getNetwork", TypeShape.of(GetNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **WARNING:** This data source is **DEPRECATED** and will be removed in the next major version. Please use exoscale.PrivateNetwork instead.
     * 
     */
    public static CompletableFuture<GetNetworkResult> getNetworkPlain(GetNetworkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getNetwork:getNetwork", TypeShape.of(GetNetworkResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetPrivateNetworkResult> getPrivateNetwork(GetPrivateNetworkArgs args) {
        return getPrivateNetwork(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateNetworkResult> getPrivateNetworkPlain(GetPrivateNetworkPlainArgs args) {
        return getPrivateNetworkPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetPrivateNetworkResult> getPrivateNetwork(GetPrivateNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getPrivateNetwork:getPrivateNetwork", TypeShape.of(GetPrivateNetworkResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetPrivateNetworkResult> getPrivateNetworkPlain(GetPrivateNetworkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getPrivateNetwork:getPrivateNetwork", TypeShape.of(GetPrivateNetworkResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetSecurityGroupResult> getSecurityGroup() {
        return getSecurityGroup(GetSecurityGroupArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecurityGroupResult> getSecurityGroupPlain() {
        return getSecurityGroupPlain(GetSecurityGroupPlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<GetSecurityGroupResult> getSecurityGroup(GetSecurityGroupArgs args) {
        return getSecurityGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecurityGroupResult> getSecurityGroupPlain(GetSecurityGroupPlainArgs args) {
        return getSecurityGroupPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetSecurityGroupResult> getSecurityGroup(GetSecurityGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("exoscale:index/getSecurityGroup:getSecurityGroup", TypeShape.of(GetSecurityGroupResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetSecurityGroupResult> getSecurityGroupPlain(GetSecurityGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("exoscale:index/getSecurityGroup:getSecurityGroup", TypeShape.of(GetSecurityGroupResult.class), args, Utilities.withVersion(options));
    }
}