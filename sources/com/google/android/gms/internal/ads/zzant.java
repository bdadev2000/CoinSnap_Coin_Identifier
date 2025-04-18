package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;

/* loaded from: classes2.dex */
public final class zzant implements zzaoo {
    private final zzamz zza;
    private final zzej zzb = new zzej(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzer zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzant(zzamz zzamzVar) {
        this.zza = zzamzVar;
    }

    private final void zze(int i2) {
        this.zzc = i2;
        this.zzd = 0;
    }

    private final boolean zzf(zzek zzekVar, @Nullable byte[] bArr, int i2) {
        int min = Math.min(zzekVar.zzb(), i2 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzekVar.zzM(min);
        } else {
            zzekVar.zzH(bArr, this.zzd, min);
        }
        int i3 = this.zzd + min;
        this.zzd = i3;
        return i3 == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.google.android.gms.internal.ads.zzej] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.google.android.gms.internal.ads.zzamz] */
    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zza(zzek zzekVar, int i2) throws zzbo {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        zzdi.zzb(this.zze);
        int i8 = -1;
        int i9 = 2;
        ?? r6 = 0;
        int i10 = 1;
        if ((i2 & 1) != 0) {
            int i11 = this.zzc;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    int i12 = this.zzj;
                    if (i12 != -1) {
                        zzea.zzf("PesReader", "Unexpected start indicator: expected " + i12 + " more bytes");
                    }
                    this.zza.zzc(zzekVar.zze() == 0);
                } else {
                    zzea.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i13 = i2;
        while (zzekVar.zzb() > 0) {
            int i14 = this.zzc;
            if (i14 == 0) {
                i3 = i9;
                z2 = r6;
                i4 = i10;
                i5 = i8;
                zzekVar.zzM(zzekVar.zzb());
            } else if (i14 != i10) {
                if (i14 != i9) {
                    int zzb = zzekVar.zzb();
                    int i15 = this.zzj;
                    int i16 = i15 == i8 ? r6 : zzb - i15;
                    if (i16 > 0) {
                        zzb -= i16;
                        zzekVar.zzK(zzekVar.zzd() + zzb);
                    }
                    this.zza.zza(zzekVar);
                    int i17 = this.zzj;
                    if (i17 != i8) {
                        int i18 = i17 - zzb;
                        this.zzj = i18;
                        if (i18 == 0) {
                            this.zza.zzc(r6);
                            zze(i10);
                        }
                    }
                } else {
                    if (zzf(zzekVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzekVar, null, this.zzi)) {
                        this.zzb.zzl(r6);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzn(i10);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i10);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzn(i10);
                            if (this.zzh || !this.zzg) {
                                i7 = zzd2;
                            } else {
                                this.zzb.zzn(4);
                                this.zzb.zzn(i10);
                                int zzd4 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i10);
                                long zzd5 = this.zzb.zzd(15);
                                this.zzb.zzn(i10);
                                i7 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                this.zzh = true;
                            }
                            j2 = this.zze.zzb((zzd << 30) | i7 | zzd3);
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        i13 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j2, i13);
                        zze(3);
                        i8 = -1;
                        i9 = 2;
                        r6 = 0;
                        i10 = 1;
                    }
                }
                i3 = i9;
                z2 = r6;
                i4 = i10;
                i5 = i8;
            } else if (zzf(zzekVar, this.zzb.zza, 9)) {
                z2 = false;
                this.zzb.zzl(0);
                int zzd6 = this.zzb.zzd(24);
                i4 = 1;
                if (zzd6 != 1) {
                    t.C("Unexpected start code prefix: ", zzd6, "PesReader");
                    this.zzj = -1;
                    i5 = -1;
                    i6 = 0;
                    i3 = 2;
                } else {
                    this.zzb.zzn(8);
                    zzej zzejVar = this.zzb;
                    int zzd7 = zzejVar.zzd(16);
                    zzejVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i3 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    i5 = -1;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                    } else {
                        int i19 = (zzd7 - 3) - zzd8;
                        this.zzj = i19;
                        if (i19 < 0) {
                            t.C("Found negative packet payload size: ", i19, "PesReader");
                            this.zzj = -1;
                        }
                    }
                    i6 = 2;
                }
                zze(i6);
            } else {
                z2 = false;
                i4 = 1;
                i5 = -1;
                i3 = 2;
            }
            i8 = i5;
            i10 = i4;
            r6 = z2;
            i9 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(zzer zzerVar, zzade zzadeVar, zzaon zzaonVar) {
        this.zze = zzerVar;
        this.zza.zzb(zzadeVar, zzaonVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z2) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
