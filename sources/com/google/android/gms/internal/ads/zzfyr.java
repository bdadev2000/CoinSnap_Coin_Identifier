package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class zzfyr extends zzfxl {
    final CharSequence zzb;
    final zzfxr zzc;
    int zzd = 0;
    int zze;

    public zzfyr(zzfyt zzfytVar, CharSequence charSequence) {
        zzfxr zzfxrVar;
        zzfxrVar = zzfytVar.zza;
        this.zzc = zzfxrVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i9 = this.zzd;
        while (true) {
            int i10 = this.zzd;
            if (i10 != -1) {
                int zzd = zzd(i10);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzd = zzc;
                }
                if (zzc == i9) {
                    int i11 = zzc + 1;
                    this.zzd = i11;
                    if (i11 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i9 < zzd) {
                        this.zzb.charAt(i9);
                    }
                    if (i9 < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i12 = this.zze;
                    if (i12 == 1) {
                        zzd = this.zzb.length();
                        this.zzd = -1;
                        if (zzd > i9) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zze = i12 - 1;
                    }
                    return this.zzb.subSequence(i9, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i9);

    public abstract int zzd(int i9);
}
