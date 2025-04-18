package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcdi extends zzarl {
    static final zzcdi zzb = new zzcdi();

    @Override // com.google.android.gms.internal.ads.zzarl
    public final zzarp zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzarr() : "mvhd".equals(str) ? new zzars() : new zzart(str);
    }
}
