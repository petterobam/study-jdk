---
title: 【java.security.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.security
---

```cmd
java.security（安全相关）
   ├── acl（此包中的类和接口已被java.security包中的类取代。）
   ├── cert（提供用于解析和管理证书，证书吊销列表（CRL）和证书路径的类和接口。）
   ├── interfaces（提供用于生成RSA实验室技术说明PKCS＃1中定义的RSA 密钥的接口，以及NIST的FIPS-186中定义的DSA（数字签名算法）密钥。）
   ├── spec（提供关键规范和算法参数规范的类和接口）
   └─ *.java（安全相关基础类）
```

<!-- more -->

## 包简介

提供安全框架的类和接口。

## 详细目录
```cmd
java.security
    ├── AccessControlContext.java
    ├── AccessControlException.java
    ├── AccessController.java
    ├── AlgorithmConstraints.java
    ├── AlgorithmParameterGenerator.java
    ├── AlgorithmParameterGeneratorSpi.java
    ├── AlgorithmParameters.java
    ├── AlgorithmParametersSpi.java
    ├── AllPermission.java
    ├── AuthProvider.java
    ├── BasicPermission.java
    ├── Certificate.java
    ├── CodeSigner.java
    ├── CodeSource.java
    ├── CryptoPrimitive.java
    ├── DigestException.java
    ├── DigestInputStream.java
    ├── DigestOutputStream.java
    ├── DomainCombiner.java
    ├── DomainLoadStoreParameter.java
    ├── GeneralSecurityException.java
    ├── Guard.java
    ├── GuardedObject.java
    ├── Identity.java
    ├── IdentityScope.java
    ├── InvalidAlgorithmParameterException.java
    ├── InvalidKeyException.java
    ├── InvalidParameterException.java
    ├── Key.java
    ├── KeyException.java
    ├── KeyFactory.java
    ├── KeyFactorySpi.java
    ├── KeyManagementException.java
    ├── KeyPair.java
    ├── KeyPairGenerator.java
    ├── KeyPairGeneratorSpi.java
    ├── KeyRep.java
    ├── KeyStore.java
    ├── KeyStoreException.java
    ├── KeyStoreSpi.java
    ├── MessageDigest.java
    ├── MessageDigestSpi.java
    ├── NoSuchAlgorithmException.java
    ├── NoSuchProviderException.java
    ├── PKCS12Attribute.java
    ├── Permission.java
    ├── PermissionCollection.java
    ├── Permissions.java
    ├── Policy.java
    ├── PolicySpi.java
    ├── Principal.java
    ├── PrivateKey.java
    ├── PrivilegedAction.java
    ├── PrivilegedActionException.java
    ├── PrivilegedExceptionAction.java
    ├── ProtectionDomain.java
    ├── Provider.java
    ├── ProviderException.java
    ├── PublicKey.java
    ├── SecureClassLoader.java
    ├── SecureRandom.java
    ├── SecureRandomSpi.java
    ├── Security.java
    ├── SecurityPermission.java
    ├── Signature.java
    ├── SignatureException.java
    ├── SignatureSpi.java
    ├── SignedObject.java
    ├── Signer.java
    ├── Timestamp.java
    ├── URIParameter.java
    ├── UnrecoverableEntryException.java
    ├── UnrecoverableKeyException.java
    ├── UnresolvedPermission.java
    ├── UnresolvedPermissionCollection.java
    ├── acl
    │   ├── Acl.java
    │   ├── AclEntry.java
    │   ├── AclNotFoundException.java
    │   ├── Group.java
    │   ├── LastOwnerException.java
    │   ├── NotOwnerException.java
    │   ├── Owner.java
    │   ├── Permission.java
    │   └── package-info.java
    ├── cert
    │   ├── CRL.java
    │   ├── CRLException.java
    │   ├── CRLReason.java
    │   ├── CRLSelector.java
    │   ├── CertPath.java
    │   ├── CertPathBuilder.java
    │   ├── CertPathBuilderException.java
    │   ├── CertPathBuilderResult.java
    │   ├── CertPathBuilderSpi.java
    │   ├── CertPathChecker.java
    │   ├── CertPathHelperImpl.java
    │   ├── CertPathParameters.java
    │   ├── CertPathValidator.java
    │   ├── CertPathValidatorException.java
    │   ├── CertPathValidatorResult.java
    │   ├── CertPathValidatorSpi.java
    │   ├── CertSelector.java
    │   ├── CertStore.java
    │   ├── CertStoreException.java
    │   ├── CertStoreParameters.java
    │   ├── CertStoreSpi.java
    │   ├── Certificate.java
    │   ├── CertificateEncodingException.java
    │   ├── CertificateException.java
    │   ├── CertificateExpiredException.java
    │   ├── CertificateFactory.java
    │   ├── CertificateFactorySpi.java
    │   ├── CertificateNotYetValidException.java
    │   ├── CertificateParsingException.java
    │   ├── CertificateRevokedException.java
    │   ├── CollectionCertStoreParameters.java
    │   ├── Extension.java
    │   ├── LDAPCertStoreParameters.java
    │   ├── PKIXBuilderParameters.java
    │   ├── PKIXCertPathBuilderResult.java
    │   ├── PKIXCertPathChecker.java
    │   ├── PKIXCertPathValidatorResult.java
    │   ├── PKIXParameters.java
    │   ├── PKIXReason.java
    │   ├── PKIXRevocationChecker.java
    │   ├── PolicyNode.java
    │   ├── PolicyQualifierInfo.java
    │   ├── TrustAnchor.java
    │   ├── X509CRL.java
    │   ├── X509CRLEntry.java
    │   ├── X509CRLSelector.java
    │   ├── X509CertSelector.java
    │   ├── X509Certificate.java
    │   ├── X509Extension.java
    │   └── package-info.java
    ├── interfaces
    │   ├── DSAKey.java
    │   ├── DSAKeyPairGenerator.java
    │   ├── DSAParams.java
    │   ├── DSAPrivateKey.java
    │   ├── DSAPublicKey.java
    │   ├── ECKey.java
    │   ├── ECPrivateKey.java
    │   ├── ECPublicKey.java
    │   ├── RSAKey.java
    │   ├── RSAMultiPrimePrivateCrtKey.java
    │   ├── RSAPrivateCrtKey.java
    │   ├── RSAPrivateKey.java
    │   ├── RSAPublicKey.java
    │   └── package-info.java
    ├── package-info.java
    └── spec
        ├── AlgorithmParameterSpec.java
        ├── DSAGenParameterSpec.java
        ├── DSAParameterSpec.java
        ├── DSAPrivateKeySpec.java
        ├── DSAPublicKeySpec.java
        ├── ECField.java
        ├── ECFieldF2m.java
        ├── ECFieldFp.java
        ├── ECGenParameterSpec.java
        ├── ECParameterSpec.java
        ├── ECPoint.java
        ├── ECPrivateKeySpec.java
        ├── ECPublicKeySpec.java
        ├── EllipticCurve.java
        ├── EncodedKeySpec.java
        ├── InvalidKeySpecException.java
        ├── InvalidParameterSpecException.java
        ├── KeySpec.java
        ├── MGF1ParameterSpec.java
        ├── PKCS8EncodedKeySpec.java
        ├── PSSParameterSpec.java
        ├── RSAKeyGenParameterSpec.java
        ├── RSAMultiPrimePrivateCrtKeySpec.java
        ├── RSAOtherPrimeInfo.java
        ├── RSAPrivateCrtKeySpec.java
        ├── RSAPrivateKeySpec.java
        ├── RSAPublicKeySpec.java
        ├── X509EncodedKeySpec.java
        └── package-info.java

```