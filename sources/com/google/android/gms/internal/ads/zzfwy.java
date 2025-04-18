package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfwy extends zzfxb {
    public zzfwy(zzfwz zzfwzVar, zzfxd zzfxdVar, CharSequence charSequence) {
        super(zzfxdVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzc(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzd(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzfxb) this).zzb.length()) {
            return i11;
        }
        return -1;
    }
}
