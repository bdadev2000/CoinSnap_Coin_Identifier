package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfyh extends zzfyk {
    public zzfyh(zzfyi zzfyiVar, zzfym zzfymVar, CharSequence charSequence) {
        super(zzfymVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final int zzc(int i2) {
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final int zzd(int i2) {
        int i3 = i2 + 4000;
        if (i3 < ((zzfyk) this).zzb.length()) {
            return i3;
        }
        return -1;
    }
}
