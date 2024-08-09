# Getting Started

### What is HasiCorp Vault ?

HashiCorp Vault is an identity-based secrets and encryption management system. A secret is anything that you want to tightly control access to, such as API encryption keys, passwords, and certificates. Vault provides encryption services that are gated by authentication and authorization methods.

* [Vault Server Setup](https://developer.hashicorp.com/vault/install#linux)

`$ vault --version`   
`Vault v1.17.2 (2af5655e364f697a15b1dc2db2c3f85f6ef949f2), built 2024-07-05T15:19:12Z`

### Create local vault server
`$ vault server -dev -dev-root-token-id="0000-0000-0000-0000"`

http://localhost:8200/ui

To login use the same provided token (0000–0000–0000–0000)

Steps : 
1. Click 'Enable new engine'
2. Select option 'KV'
3. 'Enable Engine'
4. 'Create Secret' button
5. Save values as : path=credentials & key=external-api.apiKey & value=Shrikant
6. Run application and see the log.

**@ConfigurationProperties** allows the developer to map the entire content of the properties file to a POJO. A property file can be either application.properties or application.yml.
This annotation is useful when we have a large set of explicit configurations defined in the properties file. It provides an organized and Java-specific approach to defining the properties. We can cluster similar sets or properties to multiple POJOs.
It also supports binding an external property file to a Java Object.

### Reference Documentation
For further reference, please consider the following sections:

* [Reference Blog](https://medium.com/@namant744/spring-boot-hashicorp-vault-integration-265a344db9e1)