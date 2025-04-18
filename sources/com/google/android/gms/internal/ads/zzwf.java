package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzwf implements zzadx {
    private boolean zzA;

    @Nullable
    private zzrq zzB;
    private final zzvz zza;

    @Nullable
    private final zzrp zzd;

    @Nullable
    private final zzrk zze;

    @Nullable
    private zzwd zzf;

    @Nullable
    private zzad zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;

    @Nullable
    private zzad zzy;
    private final zzwb zzb = new zzwb();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzadw[] zzn = new zzadw[1000];
    private final zzwm zzc = new zzwm(new zzdg() { // from class: com.google.android.gms.internal.ads.zzwa
        @Override // com.google.android.gms.internal.ads.zzdg
        public final void zza(Object obj) {
            zzro zzroVar = ((zzwc) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    public zzwf(zzys zzysVar, @Nullable zzrp zzrpVar, @Nullable zzrk zzrkVar) {
        this.zzd = zzrpVar;
        this.zze = zzrkVar;
        this.zza = new zzvz(zzysVar);
    }

    private final int zzA(int i10, int i11, long j3, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.zzm[i10];
            if (j10 > j3) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (j10 == j3) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzB(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int zzC(zzkj zzkjVar, zzhm zzhmVar, boolean z10, boolean z11, zzwb zzwbVar) {
        zzhmVar.zzd = false;
        if (!zzK()) {
            if (!z11 && !this.zzv) {
                zzad zzadVar = this.zzy;
                if (zzadVar == null || (!z10 && zzadVar == this.zzg)) {
                    return -3;
                }
                zzH(zzadVar, zzkjVar);
                return -5;
            }
            zzhmVar.zzc(4);
            zzhmVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzad zzadVar2 = ((zzwc) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z10 && zzadVar2 == this.zzg) {
            int zzB = zzB(this.zzr);
            if (!zzL(zzB)) {
                zzhmVar.zzd = true;
                return -3;
            }
            zzhmVar.zzc(this.zzl[zzB]);
            if (this.zzr == this.zzo - 1 && (z11 || this.zzv)) {
                zzhmVar.zza(536870912);
            }
            zzhmVar.zze = this.zzm[zzB];
            zzwbVar.zza = this.zzk[zzB];
            zzwbVar.zzb = this.zzj[zzB];
            zzwbVar.zzc = this.zzn[zzB];
            return -4;
        }
        zzH(zzadVar2, zzkjVar);
        return -5;
    }

    private final synchronized long zzD(long j3, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzo;
        if (i11 != 0) {
            long[] jArr = this.zzm;
            int i12 = this.zzq;
            if (j3 >= jArr[i12]) {
                if (z11 && (i10 = this.zzr) != i11) {
                    i11 = i10 + 1;
                }
                int zzA = zzA(i12, i11, j3, false);
                if (zzA != -1) {
                    return zzF(zzA);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzE() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzF(i10);
    }

    private final long zzF(int i10) {
        long j3 = this.zzt;
        long j10 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzB = zzB(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = Math.max(j10, this.zzm[zzB]);
                if ((this.zzl[zzB] & 1) != 0) {
                    break;
                }
                zzB--;
                if (zzB == -1) {
                    zzB = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j3, j10);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo == 0) {
            int i16 = this.zzq;
            if (i16 == 0) {
                i16 = this.zzh;
            }
            return this.zzj[i16 - 1] + this.zzk[r12];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzG(long j3, int i10, long j10, int i11, @Nullable zzadw zzadwVar) {
        boolean z10;
        boolean z11;
        int i12 = this.zzo;
        if (i12 > 0) {
            if (this.zzj[zzB(i12 - 1)] + this.zzk[r0] <= j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdb.zzd(z11);
        }
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzv = z10;
        this.zzu = Math.max(this.zzu, j3);
        int zzB = zzB(this.zzo);
        this.zzm[zzB] = j3;
        this.zzj[zzB] = j10;
        this.zzk[zzB] = i11;
        this.zzl[zzB] = i10;
        this.zzn[zzB] = zzadwVar;
        this.zzi[zzB] = 0;
        if (this.zzc.zzf() || !((zzwc) this.zzc.zzb()).zza.equals(this.zzy)) {
            zzad zzadVar = this.zzy;
            zzadVar.getClass();
            this.zzc.zzc(this.zzp + this.zzo, new zzwc(zzadVar, this.zzd.zzb(this.zze, zzadVar), null));
        }
        int i13 = this.zzo + 1;
        this.zzo = i13;
        int i14 = this.zzh;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzadw[] zzadwVarArr = new zzadw[i15];
            int i16 = this.zzq;
            int i17 = i14 - i16;
            System.arraycopy(this.zzj, i16, jArr2, 0, i17);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i17);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i17);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzq, zzadwVarArr, 0, i17);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i17);
            int i18 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i17, i18);
            System.arraycopy(this.zzm, 0, jArr3, i17, i18);
            System.arraycopy(this.zzl, 0, iArr, i17, i18);
            System.arraycopy(this.zzk, 0, iArr2, i17, i18);
            System.arraycopy(this.zzn, 0, zzadwVarArr, i17, i18);
            System.arraycopy(this.zzi, 0, jArr, i17, i18);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzadwVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i15;
        }
    }

    private final void zzH(zzad zzadVar, zzkj zzkjVar) {
        zzw zzwVar;
        zzad zzadVar2 = this.zzg;
        if (zzadVar2 == null) {
            zzwVar = null;
        } else {
            zzwVar = zzadVar2.zzs;
        }
        this.zzg = zzadVar;
        zzw zzwVar2 = zzadVar.zzs;
        zzkjVar.zza = zzadVar.zzc(this.zzd.zza(zzadVar));
        zzkjVar.zzb = this.zzB;
        if (zzadVar2 != null && Objects.equals(zzwVar, zzwVar2)) {
            return;
        }
        zzrq zzc = this.zzd.zzc(this.zze, zzadVar);
        this.zzB = zzc;
        zzkjVar.zzb = zzc;
    }

    private final void zzI() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzJ() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzK() {
        return this.zzr != this.zzo;
    }

    private final boolean zzL(int i10) {
        if (this.zzB != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzad zzadVar) {
        this.zzx = false;
        if (Objects.equals(zzadVar, this.zzy)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzwc) this.zzc.zzb()).zza.equals(zzadVar)) {
            this.zzy = ((zzwc) this.zzc.zzb()).zza;
        } else {
            this.zzy = zzadVar;
        }
        boolean z10 = this.zzz;
        zzad zzadVar2 = this.zzy;
        this.zzz = z10 & zzbg.zzf(zzadVar2.zzo, zzadVar2.zzk);
        this.zzA = false;
        return true;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j3, boolean z10) {
        int i10 = this.zzr;
        int zzB = zzB(i10);
        if (zzK() && j3 >= this.zzm[zzB]) {
            if (j3 > this.zzu && z10) {
                return this.zzo - i10;
            }
            int zzA = zzA(zzB, this.zzo - i10, j3, true);
            if (zzA == -1) {
                return 0;
            }
            return zzA;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(com.google.android.gms.internal.ads.zzkj r9, com.google.android.gms.internal.ads.zzhm r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzwb r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzC(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzvz r9 = r8.zza
            com.google.android.gms.internal.ads.zzwb r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzvz r9 = r8.zza
            com.google.android.gms.internal.ads.zzwb r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.zze(com.google.android.gms.internal.ads.zzkj, com.google.android.gms.internal.ads.zzhm, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ int zzf(zzn zznVar, int i10, boolean z10) {
        return zzadv.zza(this, zznVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zzg(zzn zznVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zza(zznVar, i10, z10);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzad zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j3, boolean z10, boolean z11) {
        this.zza.zzc(zzD(j3, false, z11));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzl(zzad zzadVar) {
        boolean zzM = zzM(zzadVar);
        zzwd zzwdVar = this.zzf;
        if (zzwdVar != null && zzM) {
            zzwdVar.zzM(zzadVar);
        }
    }

    @CallSuper
    public final void zzm() throws IOException {
        zzrq zzrqVar = this.zzB;
        if (zzrqVar != null) {
            throw zzrqVar.zza();
        }
    }

    @CallSuper
    public final void zzn() {
        zzk();
        zzI();
    }

    @CallSuper
    public final void zzo() {
        zzp(true);
        zzI();
    }

    @CallSuper
    public final void zzp(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ void zzq(zzed zzedVar, int i10) {
        zzadv.zzb(this, zzedVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzr(zzed zzedVar, int i10, int i11) {
        this.zza.zzh(zzedVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzs(long j3, int i10, int i11, int i12, @Nullable zzadw zzadwVar) {
        if (this.zzw) {
            if ((i10 & 1) != 0) {
                this.zzw = false;
            } else {
                return;
            }
        }
        if (this.zzz) {
            if (j3 >= this.zzs) {
                if ((i10 & 1) == 0) {
                    if (!this.zzA) {
                        zzdt.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                        this.zzA = true;
                    }
                    i10 |= 1;
                }
            } else {
                return;
            }
        }
        zzG(j3, i10, (this.zza.zzb() - i11) - i12, i11, zzadwVar);
    }

    public final void zzt(long j3) {
        this.zzs = j3;
    }

    public final void zzu(@Nullable zzwd zzwdVar) {
        this.zzf = zzwdVar;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzdb.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    @CallSuper
    public final synchronized boolean zzx(boolean z10) {
        boolean z11 = true;
        if (!zzK()) {
            if (!z10 && !this.zzv) {
                zzad zzadVar = this.zzy;
                if (zzadVar != null) {
                    if (zzadVar == this.zzg) {
                        return false;
                    }
                } else {
                    z11 = false;
                }
            }
            return z11;
        }
        if (((zzwc) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
            return true;
        }
        return zzL(zzB(this.zzr));
    }

    public final synchronized boolean zzy(int i10) {
        zzJ();
        int i11 = this.zzp;
        if (i10 >= i11 && i10 <= this.zzo + i11) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzz(long j3, boolean z10) {
        int zzA;
        zzJ();
        int i10 = this.zzr;
        int zzB = zzB(i10);
        if (zzK() && j3 >= this.zzm[zzB]) {
            if (j3 > this.zzu) {
                if (z10) {
                    z10 = true;
                }
            }
            if (this.zzz) {
                zzA = this.zzo - i10;
                int i11 = 0;
                while (true) {
                    if (i11 < zzA) {
                        if (this.zzm[zzB] < j3) {
                            zzB++;
                            if (zzB == this.zzh) {
                                zzB = 0;
                            }
                            i11++;
                        } else {
                            zzA = i11;
                            break;
                        }
                    } else if (!z10) {
                        zzA = -1;
                    }
                }
            } else {
                zzA = zzA(zzB, this.zzo - i10, j3, true);
            }
            if (zzA != -1) {
                this.zzs = j3;
                this.zzr += zzA;
                return true;
            }
        }
        return false;
    }
}
