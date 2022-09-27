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
    /// <summary>
    /// The provider type for the exoscale package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [ExoscaleResourceType("pulumi:providers:exoscale")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Exoscale CloudStack API endpoint (by default: https://api.exoscale.com/v1)
        /// </summary>
        [Output("computeEndpoint")]
        public Output<string?> ComputeEndpoint { get; private set; } = null!;

        /// <summary>
        /// CloudStack ini configuration filename (by default: cloudstack.ini)
        /// </summary>
        [Output("config")]
        public Output<string?> Config { get; private set; } = null!;

        /// <summary>
        /// Exoscale DNS API endpoint (by default: https://api.exoscale.com/dns)
        /// </summary>
        [Output("dnsEndpoint")]
        public Output<string> DnsEndpoint { get; private set; } = null!;

        [Output("environment")]
        public Output<string?> Environment { get; private set; } = null!;

        /// <summary>
        /// Exoscale API key
        /// </summary>
        [Output("key")]
        public Output<string?> Key { get; private set; } = null!;

        [Output("profile")]
        public Output<string?> Profile { get; private set; } = null!;

        /// <summary>
        /// CloudStack ini configuration section name (by default: cloudstack)
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// Exoscale API secret
        /// </summary>
        [Output("secret")]
        public Output<string?> Secret { get; private set; } = null!;

        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs args, CustomResourceOptions? options = null)
            : base("exoscale", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumiverse/pulumi-exoscale",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Exoscale CloudStack API endpoint (by default: https://api.exoscale.com/v1)
        /// </summary>
        [Input("computeEndpoint")]
        public Input<string>? ComputeEndpoint { get; set; }

        /// <summary>
        /// CloudStack ini configuration filename (by default: cloudstack.ini)
        /// </summary>
        [Input("config")]
        public Input<string>? CloudStackIniConfig { get; set; }

        [Input("delay", json: true)]
        public Input<int>? Delay { get; set; }

        /// <summary>
        /// Exoscale DNS API endpoint (by default: https://api.exoscale.com/dns)
        /// </summary>
        [Input("dnsEndpoint", required: true)]
        public Input<string> DnsEndpoint { get; set; } = null!;

        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// Defines if the user-data of compute instances should be gzipped (by default: true)
        /// </summary>
        [Input("gzipUserData", json: true)]
        public Input<bool>? GzipUserData { get; set; }

        /// <summary>
        /// Exoscale API key
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("profile")]
        public Input<string>? Profile { get; set; }

        /// <summary>
        /// CloudStack ini configuration section name (by default: cloudstack)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Exoscale API secret
        /// </summary>
        [Input("secret")]
        public Input<string>? Secret { get; set; }

        /// <summary>
        /// Timeout in seconds for waiting on compute resources to become available (by default: 300)
        /// </summary>
        [Input("timeout", required: true, json: true)]
        public Input<int> Timeout { get; set; } = null!;

        [Input("token")]
        public Input<string>? Token { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
