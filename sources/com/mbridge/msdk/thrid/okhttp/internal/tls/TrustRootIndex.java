package com.mbridge.msdk.thrid.okhttp.internal.tls;

import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
public interface TrustRootIndex {
    X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate);
}
