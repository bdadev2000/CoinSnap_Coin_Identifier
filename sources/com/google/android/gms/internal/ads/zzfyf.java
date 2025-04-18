package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
final class zzfyf extends zzfyk {
    final /* synthetic */ zzfyg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyf(zzfyg zzfygVar, zzfym zzfymVar, CharSequence charSequence) {
        super(zzfymVar, charSequence);
        this.zza = zzfygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final int zzc(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final int zzd(int i2) {
        CharSequence charSequence = ((zzfyk) this).zzb;
        int length = charSequence.length();
        zzfxz.zzb(i2, length, FirebaseAnalytics.Param.INDEX);
        while (i2 < length) {
            zzfyg zzfygVar = this.zza;
            if (zzfygVar.zza.zzb(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
