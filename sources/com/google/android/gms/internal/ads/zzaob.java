package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaob implements zzaoo {
    private final zzaoa zza;
    private final zzek zzb = new zzek(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaob(zzaoa zzaoaVar) {
        this.zza = zzaoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zza(zzek zzekVar, int i2) {
        int i3 = i2 & 1;
        int zzd = i3 != 0 ? zzekVar.zzd() + zzekVar.zzm() : -1;
        if (this.zzf) {
            if (i3 == 0) {
                return;
            }
            this.zzf = false;
            zzekVar.zzL(zzd);
            this.zzd = 0;
        }
        while (zzekVar.zzb() > 0) {
            int i4 = this.zzd;
            if (i4 < 3) {
                if (i4 == 0) {
                    int zzm = zzekVar.zzm();
                    zzekVar.zzL(zzekVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzekVar.zzb(), 3 - this.zzd);
                zzekVar.zzH(this.zzb.zzN(), this.zzd, min);
                int i5 = this.zzd + min;
                this.zzd = i5;
                if (i5 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzek zzekVar2 = this.zzb;
                    int zzm2 = zzekVar2.zzm();
                    boolean z2 = (zzm2 & 128) != 0;
                    int zzm3 = zzekVar2.zzm();
                    this.zze = z2;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i6 = this.zzc;
                    if (zzc < i6) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(4098, Math.max(i6, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzekVar.zzb(), this.zzc - i4);
                zzekVar.zzH(this.zzb.zzN(), this.zzd, min2);
                int i7 = this.zzd + min2;
                this.zzd = i7;
                int i8 = this.zzc;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzK(i8);
                    } else {
                        if (zzeu.zze(this.zzb.zzN(), 0, i8, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzK(this.zzc - 4);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(zzer zzerVar, zzade zzadeVar, zzaon zzaonVar) {
        this.zza.zzb(zzerVar, zzadeVar, zzaonVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzc() {
        this.zzf = true;
    }
}
