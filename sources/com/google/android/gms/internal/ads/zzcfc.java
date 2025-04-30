package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcfc extends zzasn {
    static final zzcfc zzb = new zzcfc();

    @Override // com.google.android.gms.internal.ads.zzasn
    public final zzasr zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzast();
        }
        if ("mvhd".equals(str)) {
            return new zzasu();
        }
        return new zzasv(str);
    }
}
