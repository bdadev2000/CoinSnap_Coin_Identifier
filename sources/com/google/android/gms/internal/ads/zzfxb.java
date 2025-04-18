package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class zzfxb extends zzfvz {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzfxb(zzfxd zzfxdVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i10 = this.zzc;
        while (true) {
            int i11 = this.zzc;
            if (i11 != -1) {
                int zzd = zzd(i11);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzc = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzc = zzc;
                }
                if (zzc == i10) {
                    int i12 = zzc + 1;
                    this.zzc = i12;
                    if (i12 > this.zzb.length()) {
                        this.zzc = -1;
                    }
                } else {
                    if (i10 < zzd) {
                        this.zzb.charAt(i10);
                    }
                    if (i10 < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i13 = this.zzd;
                    if (i13 == 1) {
                        zzd = this.zzb.length();
                        this.zzc = -1;
                        if (zzd > i10) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zzd = i13 - 1;
                    }
                    return this.zzb.subSequence(i10, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
