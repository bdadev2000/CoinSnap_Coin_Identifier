package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxe implements zzafa {
    private boolean zzB;

    @Nullable
    private zzsu zzC;
    private final zzwy zza;

    @Nullable
    private final zzst zzd;

    @Nullable
    private final zzso zze;

    @Nullable
    private zzxd zzf;

    @Nullable
    private zzan zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;

    @Nullable
    private zzan zzy;

    @Nullable
    private zzan zzz;
    private final zzxa zzb = new zzxa();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaez[] zzn = new zzaez[1000];
    private final zzxl zzc = new zzxl(new zzev() { // from class: com.google.android.gms.internal.ads.zzwz
        @Override // com.google.android.gms.internal.ads.zzev
        public final void zza(Object obj) {
            zzss zzssVar = ((zzxc) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    public zzxe(zzzv zzzvVar, @Nullable zzst zzstVar, @Nullable zzso zzsoVar) {
        this.zzd = zzstVar;
        this.zze = zzsoVar;
        this.zza = new zzwy(zzzvVar);
    }

    private final int zzA(int i9, int i10, long j7, boolean z8) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j9 = this.zzm[i9];
            if (j9 > j7) {
                break;
            }
            if (!z8 || (this.zzl[i9] & 1) != 0) {
                i11 = i12;
                if (j9 == j7) {
                    break;
                }
            }
            i9++;
            if (i9 == this.zzh) {
                i9 = 0;
            }
        }
        return i11;
    }

    private final int zzB(int i9) {
        int i10 = this.zzq + i9;
        int i11 = this.zzh;
        return i10 < i11 ? i10 : i10 - i11;
    }

    private final synchronized int zzC(zzlj zzljVar, zzin zzinVar, boolean z8, boolean z9, zzxa zzxaVar) {
        try {
            zzinVar.zzd = false;
            if (!zzK()) {
                if (!z9 && !this.zzv) {
                    zzan zzanVar = this.zzz;
                    if (zzanVar == null || (!z8 && zzanVar == this.zzg)) {
                        return -3;
                    }
                    zzH(zzanVar, zzljVar);
                    return -5;
                }
                zzinVar.zzc(4);
                zzinVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzan zzanVar2 = ((zzxc) this.zzc.zza(this.zzp + this.zzr)).zza;
            if (!z8 && zzanVar2 == this.zzg) {
                int zzB = zzB(this.zzr);
                if (!zzL(zzB)) {
                    zzinVar.zzd = true;
                    return -3;
                }
                zzinVar.zzc(this.zzl[zzB]);
                if (this.zzr == this.zzo - 1 && (z9 || this.zzv)) {
                    zzinVar.zza(536870912);
                }
                zzinVar.zze = this.zzm[zzB];
                zzxaVar.zza = this.zzk[zzB];
                zzxaVar.zzb = this.zzj[zzB];
                zzxaVar.zzc = this.zzn[zzB];
                return -4;
            }
            zzH(zzanVar2, zzljVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long zzD(long j7, boolean z8, boolean z9) {
        int i9;
        try {
            int i10 = this.zzo;
            if (i10 != 0) {
                long[] jArr = this.zzm;
                int i11 = this.zzq;
                if (j7 >= jArr[i11]) {
                    if (z9 && (i9 = this.zzr) != i10) {
                        i10 = i9 + 1;
                    }
                    int zzA = zzA(i11, i10, j7, false);
                    if (zzA != -1) {
                        return zzF(zzA);
                    }
                }
            }
            return -1L;
        } finally {
        }
    }

    private final synchronized long zzE() {
        int i9 = this.zzo;
        if (i9 == 0) {
            return -1L;
        }
        return zzF(i9);
    }

    private final long zzF(int i9) {
        long j7 = this.zzt;
        long j9 = Long.MIN_VALUE;
        if (i9 != 0) {
            int zzB = zzB(i9 - 1);
            for (int i10 = 0; i10 < i9; i10++) {
                j9 = Math.max(j9, this.zzm[zzB]);
                if ((this.zzl[zzB] & 1) != 0) {
                    break;
                }
                zzB--;
                if (zzB == -1) {
                    zzB = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j7, j9);
        this.zzo -= i9;
        int i11 = this.zzp + i9;
        this.zzp = i11;
        int i12 = this.zzq + i9;
        this.zzq = i12;
        int i13 = this.zzh;
        if (i12 >= i13) {
            this.zzq = i12 - i13;
        }
        int i14 = this.zzr - i9;
        this.zzr = i14;
        if (i14 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i11);
        if (this.zzo == 0) {
            int i15 = this.zzq;
            if (i15 == 0) {
                i15 = this.zzh;
            }
            return this.zzj[i15 - 1] + this.zzk[r12];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzG(long j7, int i9, long j9, int i10, @Nullable zzaez zzaezVar) {
        boolean z8;
        boolean z9;
        try {
            int i11 = this.zzo;
            if (i11 > 0) {
                if (this.zzj[zzB(i11 - 1)] + this.zzk[r0] <= j9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zzeq.zzd(z9);
            }
            if ((536870912 & i9) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.zzv = z8;
            this.zzu = Math.max(this.zzu, j7);
            int zzB = zzB(this.zzo);
            this.zzm[zzB] = j7;
            this.zzj[zzB] = j9;
            this.zzk[zzB] = i10;
            this.zzl[zzB] = i9;
            this.zzn[zzB] = zzaezVar;
            this.zzi[zzB] = 0;
            if (this.zzc.zzf() || !((zzxc) this.zzc.zzb()).zza.equals(this.zzz)) {
                zzan zzanVar = this.zzz;
                zzanVar.getClass();
                this.zzc.zzc(this.zzp + this.zzo, new zzxc(zzanVar, zzss.zza, null));
            }
            int i12 = this.zzo + 1;
            this.zzo = i12;
            int i13 = this.zzh;
            if (i12 == i13) {
                int i14 = i13 + 1000;
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr = new int[i14];
                int[] iArr2 = new int[i14];
                zzaez[] zzaezVarArr = new zzaez[i14];
                int i15 = this.zzq;
                int i16 = i13 - i15;
                System.arraycopy(this.zzj, i15, jArr2, 0, i16);
                System.arraycopy(this.zzm, this.zzq, jArr3, 0, i16);
                System.arraycopy(this.zzl, this.zzq, iArr, 0, i16);
                System.arraycopy(this.zzk, this.zzq, iArr2, 0, i16);
                System.arraycopy(this.zzn, this.zzq, zzaezVarArr, 0, i16);
                System.arraycopy(this.zzi, this.zzq, jArr, 0, i16);
                int i17 = this.zzq;
                System.arraycopy(this.zzj, 0, jArr2, i16, i17);
                System.arraycopy(this.zzm, 0, jArr3, i16, i17);
                System.arraycopy(this.zzl, 0, iArr, i16, i17);
                System.arraycopy(this.zzk, 0, iArr2, i16, i17);
                System.arraycopy(this.zzn, 0, zzaezVarArr, i16, i17);
                System.arraycopy(this.zzi, 0, jArr, i16, i17);
                this.zzj = jArr2;
                this.zzm = jArr3;
                this.zzl = iArr;
                this.zzk = iArr2;
                this.zzn = zzaezVarArr;
                this.zzi = jArr;
                this.zzq = 0;
                this.zzh = i14;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzH(zzan zzanVar, zzlj zzljVar) {
        zzae zzaeVar;
        zzan zzanVar2 = this.zzg;
        zzsu zzsuVar = null;
        if (zzanVar2 == null) {
            zzaeVar = null;
        } else {
            zzaeVar = zzanVar2.zzq;
        }
        this.zzg = zzanVar;
        zzae zzaeVar2 = zzanVar.zzq;
        zzljVar.zza = zzanVar.zzc(this.zzd.zza(zzanVar));
        zzljVar.zzb = this.zzC;
        if (zzanVar2 != null && zzgd.zzG(zzaeVar, zzaeVar2)) {
            return;
        }
        if (zzanVar.zzq != null) {
            zzsuVar = new zzsu(new zzsm(new zzsw(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }
        this.zzC = zzsuVar;
        zzljVar.zzb = zzsuVar;
    }

    private final void zzI() {
        if (this.zzC != null) {
            this.zzC = null;
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

    private final boolean zzL(int i9) {
        if (this.zzC != null) {
            return (this.zzl[i9] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzan zzanVar) {
        try {
            this.zzx = false;
            if (zzgd.zzG(zzanVar, this.zzz)) {
                return false;
            }
            if (!this.zzc.zzf() && ((zzxc) this.zzc.zzb()).zza.equals(zzanVar)) {
                this.zzz = ((zzxc) this.zzc.zzb()).zza;
            } else {
                this.zzz = zzanVar;
            }
            boolean z8 = this.zzA;
            zzan zzanVar2 = this.zzz;
            this.zzA = z8 & zzcg.zzf(zzanVar2.zzn, zzanVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j7, boolean z8) {
        int i9 = this.zzr;
        int zzB = zzB(i9);
        if (zzK() && j7 >= this.zzm[zzB]) {
            if (j7 > this.zzu && z8) {
                return this.zzo - i9;
            }
            int zzA = zzA(zzB, this.zzo - i9, j7, true);
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(com.google.android.gms.internal.ads.zzlj r9, com.google.android.gms.internal.ads.zzin r10, int r11, boolean r12) {
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
            com.google.android.gms.internal.ads.zzxa r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzC(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L2b
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L35
            if (r9 == 0) goto L2d
            com.google.android.gms.internal.ads.zzwy r9 = r8.zza
            com.google.android.gms.internal.ads.zzxa r11 = r8.zzb
            r9.zzd(r10, r11)
        L2b:
            r9 = r12
            goto L3e
        L2d:
            com.google.android.gms.internal.ads.zzwy r9 = r8.zza
            com.google.android.gms.internal.ads.zzxa r11 = r8.zzb
            r9.zze(r10, r11)
            goto L38
        L35:
            if (r9 == 0) goto L38
            goto L2b
        L38:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxe.zze(com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzin, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ int zzf(zzu zzuVar, int i9, boolean z8) {
        return zzaey.zza(this, zzuVar, i9, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzg(zzu zzuVar, int i9, boolean z8, int i10) throws IOException {
        return this.zza.zza(zzuVar, i9, z8);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzan zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j7, boolean z8, boolean z9) {
        this.zza.zzc(zzD(j7, false, z9));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzl(zzan zzanVar) {
        this.zzy = zzanVar;
        boolean zzM = zzM(zzanVar);
        zzxd zzxdVar = this.zzf;
        if (zzxdVar != null && zzM) {
            zzxdVar.zzM(zzanVar);
        }
    }

    @CallSuper
    public final void zzm() throws IOException {
        zzsu zzsuVar = this.zzC;
        if (zzsuVar == null) {
        } else {
            throw zzsuVar.zza();
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
    public final void zzp(boolean z8) {
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
        if (z8) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ void zzq(zzfu zzfuVar, int i9) {
        zzaey.zzb(this, zzfuVar, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzr(zzfu zzfuVar, int i9, int i10) {
        this.zza.zzh(zzfuVar, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzs(long j7, int i9, int i10, int i11, @Nullable zzaez zzaezVar) {
        if (this.zzw) {
            if ((i9 & 1) != 0) {
                this.zzw = false;
            } else {
                return;
            }
        }
        if (this.zzA) {
            if (j7 >= this.zzs) {
                if ((i9 & 1) == 0) {
                    if (!this.zzB) {
                        zzfk.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                        this.zzB = true;
                    }
                    i9 |= 1;
                }
            } else {
                return;
            }
        }
        zzG(j7, i9, (this.zza.zzb() - i10) - i11, i10, zzaezVar);
    }

    public final void zzt(long j7) {
        this.zzs = j7;
    }

    public final void zzu(@Nullable zzxd zzxdVar) {
        this.zzf = zzxdVar;
    }

    public final synchronized void zzv(int i9) {
        boolean z8 = false;
        if (i9 >= 0) {
            try {
                if (this.zzr + i9 <= this.zzo) {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzeq.zzd(z8);
        this.zzr += i9;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    @CallSuper
    public final synchronized boolean zzx(boolean z8) {
        boolean z9 = true;
        if (!zzK()) {
            if (!z8 && !this.zzv) {
                zzan zzanVar = this.zzz;
                if (zzanVar != null) {
                    if (zzanVar == this.zzg) {
                        return false;
                    }
                } else {
                    z9 = false;
                }
            }
            return z9;
        }
        if (((zzxc) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
            return true;
        }
        return zzL(zzB(this.zzr));
    }

    public final synchronized boolean zzy(int i9) {
        zzJ();
        int i10 = this.zzp;
        if (i9 >= i10 && i9 <= this.zzo + i10) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i9 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzz(long j7, boolean z8) {
        int zzA;
        try {
            zzJ();
            int i9 = this.zzr;
            int zzB = zzB(i9);
            if (zzK() && j7 >= this.zzm[zzB]) {
                if (j7 > this.zzu) {
                    if (z8) {
                        z8 = true;
                    }
                }
                if (this.zzA) {
                    zzA = this.zzo - i9;
                    int i10 = 0;
                    while (true) {
                        if (i10 < zzA) {
                            if (this.zzm[zzB] < j7) {
                                zzB++;
                                if (zzB == this.zzh) {
                                    zzB = 0;
                                }
                                i10++;
                            } else {
                                zzA = i10;
                                break;
                            }
                        } else if (!z8) {
                            zzA = -1;
                        }
                    }
                } else {
                    zzA = zzA(zzB, this.zzo - i9, j7, true);
                }
                if (zzA != -1) {
                    this.zzs = j7;
                    this.zzr += zzA;
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
