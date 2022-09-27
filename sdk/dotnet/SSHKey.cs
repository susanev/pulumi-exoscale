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
    /// ## Import
    /// 
    /// An existing SSH key may be imported as a resource by `&lt;name&gt;`console
    /// 
    /// ```sh
    ///  $ pulumi import exoscale:index/sSHKey:SSHKey \
    /// ```
    /// 
    ///  exoscale_ssh_key.my_ssh_key \
    /// 
    ///  my-ssh-key
    /// </summary>
    [ExoscaleResourceType("exoscale:index/sSHKey:SSHKey")]
    public partial class SSHKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The SSH key unique identifier.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// The SSH key name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The SSH *public* key that will be authorized in compute instances.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;


        /// <summary>
        /// Create a SSHKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SSHKey(string name, SSHKeyArgs? args = null, CustomResourceOptions? options = null)
            : base("exoscale:index/sSHKey:SSHKey", name, args ?? new SSHKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SSHKey(string name, Input<string> id, SSHKeyState? state = null, CustomResourceOptions? options = null)
            : base("exoscale:index/sSHKey:SSHKey", name, state, MakeResourceOptions(options, id))
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
        /// <summary>
        /// Get an existing SSHKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SSHKey Get(string name, Input<string> id, SSHKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new SSHKey(name, id, state, options);
        }
    }

    public sealed class SSHKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SSH key name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SSH *public* key that will be authorized in compute instances.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        public SSHKeyArgs()
        {
        }
        public static new SSHKeyArgs Empty => new SSHKeyArgs();
    }

    public sealed class SSHKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SSH key unique identifier.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// The SSH key name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SSH *public* key that will be authorized in compute instances.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        public SSHKeyState()
        {
        }
        public static new SSHKeyState Empty => new SSHKeyState();
    }
}
