package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
abstract class zzfyk extends zzfxh {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public zzfyk(zzfym zzfymVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i2 = this.zzc;
        while (true) {
            int i3 = this.zzc;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i3);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzc = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzc = zzc;
            }
            if (zzc != i2) {
                if (i2 < zzd) {
                    this.zzb.charAt(i2);
                }
                if (i2 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i4 = this.zzd;
                if (i4 == 1) {
                    zzd = this.zzb.length();
                    this.zzc = -1;
                    if (zzd > i2) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zzd = i4 - 1;
                }
                return this.zzb.subSequence(i2, zzd).toString();
            }
            int i5 = zzc + 1;
            this.zzc = i5;
            if (i5 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
