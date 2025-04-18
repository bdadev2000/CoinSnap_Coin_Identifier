package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcde extends zzaqy {
    static final zzcde zzb = new zzcde();

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final zzarc zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzare();
        }
        if ("mvhd".equals(str)) {
            return new zzarf();
        }
        return new zzarg(str);
    }
}
