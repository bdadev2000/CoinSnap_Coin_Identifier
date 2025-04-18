package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzano implements zzaob {
    private final zzann zza;
    private final zzed zzb = new zzed(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzano(zzann zzannVar) {
        this.zza = zzannVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zza(zzed zzedVar, int i10) {
        int i11;
        boolean z10;
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = zzedVar.zzd() + zzedVar.zzm();
        } else {
            i11 = -1;
        }
        if (this.zzf) {
            if (i12 != 0) {
                this.zzf = false;
                zzedVar.zzL(i11);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzedVar.zzb() > 0) {
            int i13 = this.zzd;
            if (i13 < 3) {
                if (i13 == 0) {
                    int zzm = zzedVar.zzm();
                    zzedVar.zzL(zzedVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzedVar.zzb(), 3 - this.zzd);
                zzedVar.zzH(this.zzb.zzN(), this.zzd, min);
                int i14 = this.zzd + min;
                this.zzd = i14;
                if (i14 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzed zzedVar2 = this.zzb;
                    int zzm2 = zzedVar2.zzm();
                    if ((zzm2 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int zzm3 = zzedVar2.zzm();
                    this.zze = z10;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i15 = this.zzc;
                    if (zzc < i15) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(4098, Math.max(i15, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzedVar.zzb(), this.zzc - i13);
                zzedVar.zzH(this.zzb.zzN(), this.zzd, min2);
                int i16 = this.zzd + min2;
                this.zzd = i16;
                int i17 = this.zzc;
                if (i16 != i17) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzen.zzf(this.zzb.zzN(), 0, i17, -1) == 0) {
                            this.zzb.zzK(this.zzc - 4);
                        } else {
                            this.zzf = true;
                            return;
                        }
                    } else {
                        this.zzb.zzK(i17);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
        this.zza.zzb(zzekVar, zzacuVar, zzaoaVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzc() {
        this.zzf = true;
    }
}
