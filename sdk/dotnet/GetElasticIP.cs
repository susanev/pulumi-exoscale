// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Exoscale
{
    public static class GetElasticIP
    {
        public static Task<GetElasticIPResult> InvokeAsync(GetElasticIPArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetElasticIPResult>("exoscale:index/getElasticIP:getElasticIP", args ?? new GetElasticIPArgs(), options.WithDefaults());

        public static Output<GetElasticIPResult> Invoke(GetElasticIPInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetElasticIPResult>("exoscale:index/getElasticIP:getElasticIP", args ?? new GetElasticIPInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetElasticIPArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Elastic IP (EIP) ID to match (conflicts with `ip_address`).
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The EIP IPv4 or IPv6 address to match (conflicts with `id`).
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        /// <summary>
        /// The Exocale [Zone][zone] name.
        /// </summary>
        [Input("zone", required: true)]
        public string Zone { get; set; } = null!;

        public GetElasticIPArgs()
        {
        }
        public static new GetElasticIPArgs Empty => new GetElasticIPArgs();
    }

    public sealed class GetElasticIPInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Elastic IP (EIP) ID to match (conflicts with `ip_address`).
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The EIP IPv4 or IPv6 address to match (conflicts with `id`).
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The Exocale [Zone][zone] name.
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public GetElasticIPInvokeArgs()
        {
        }
        public static new GetElasticIPInvokeArgs Empty => new GetElasticIPInvokeArgs();
    }


    [OutputType]
    public sealed class GetElasticIPResult
    {
        /// <summary>
        /// The Elastic IP (EIP) address family (`inet4` or `inet6`).
        /// </summary>
        public readonly string AddressFamily;
        /// <summary>
        /// The Elastic IP (EIP) CIDR.
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// The Elastic IP (EIP) description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Block) The *managed* EIP healthcheck configuration. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetElasticIPHealthcheckResult> Healthchecks;
        public readonly string? Id;
        public readonly string? IpAddress;
        /// <summary>
        /// A map of key/value labels.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string Zone;

        [OutputConstructor]
        private GetElasticIPResult(
            string addressFamily,

            string cidr,

            string description,

            ImmutableArray<Outputs.GetElasticIPHealthcheckResult> healthchecks,

            string? id,

            string? ipAddress,

            ImmutableDictionary<string, string> labels,

            string zone)
        {
            AddressFamily = addressFamily;
            Cidr = cidr;
            Description = description;
            Healthchecks = healthchecks;
            Id = id;
            IpAddress = ipAddress;
            Labels = labels;
            Zone = zone;
        }
    }
}
