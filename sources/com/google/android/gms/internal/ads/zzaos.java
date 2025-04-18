package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
final class zzaos extends zzaot {
    private final byte[] zza;

    public zzaos(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaot, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.zza;
    }
}
