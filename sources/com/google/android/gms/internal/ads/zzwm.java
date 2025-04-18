package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzwm implements zzaeh {
    private boolean zzA;

    @Nullable
    private zzrw zzB;
    private final zzwg zza;

    @Nullable
    private final zzrv zzd;

    @Nullable
    private final zzrq zze;

    @Nullable
    private zzwl zzf;

    @Nullable
    private zzaf zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;

    @Nullable
    private zzaf zzy;
    private final zzwi zzb = new zzwi();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaeg[] zzn = new zzaeg[1000];
    private final zzwt zzc = new zzwt(new zzdn() { // from class: com.google.android.gms.internal.ads.zzwh
        @Override // com.google.android.gms.internal.ads.zzdn
        public final void zza(Object obj) {
            zzru zzruVar = ((zzwk) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    public zzwm(zzza zzzaVar, @Nullable zzrv zzrvVar, @Nullable zzrq zzrqVar) {
        this.zzd = zzrvVar;
        this.zze = zzrqVar;
        this.zza = new zzwg(zzzaVar);
    }

    private final int zzA(int i2, int i3, long j2, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.zzm[i2];
            if (j3 > j2) {
                break;
            }
            if (!z2 || (this.zzl[i2] & 1) != 0) {
                i4 = i5;
                if (j3 == j2) {
                    break;
                }
            }
            i2++;
            if (i2 == this.zzh) {
                i2 = 0;
            }
        }
        return i4;
    }

    private final int zzB(int i2) {
        int i3 = this.zzq + i2;
        int i4 = this.zzh;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private final synchronized int zzC(zzkm zzkmVar, zzhq zzhqVar, boolean z2, boolean z3, zzwi zzwiVar) {
        try {
            zzhqVar.zzd = false;
            if (!zzK()) {
                if (!z3 && !this.zzv) {
                    zzaf zzafVar = this.zzy;
                    if (zzafVar == null || (!z2 && zzafVar == this.zzg)) {
                        return -3;
                    }
                    zzH(zzafVar, zzkmVar);
                    return -5;
                }
                zzhqVar.zzc(4);
                zzhqVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzaf zzafVar2 = ((zzwk) this.zzc.zza(this.zzp + this.zzr)).zza;
            if (!z2 && zzafVar2 == this.zzg) {
                int zzB = zzB(this.zzr);
                if (!zzL(zzB)) {
                    zzhqVar.zzd = true;
                    return -3;
                }
                zzhqVar.zzc(this.zzl[zzB]);
                if (this.zzr == this.zzo - 1 && (z3 || this.zzv)) {
                    zzhqVar.zza(536870912);
                }
                zzhqVar.zze = this.zzm[zzB];
                zzwiVar.zza = this.zzk[zzB];
                zzwiVar.zzb = this.zzj[zzB];
                zzwiVar.zzc = this.zzn[zzB];
                return -4;
            }
            zzH(zzafVar2, zzkmVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long zzD(long j2, boolean z2, boolean z3) {
        int i2;
        try {
            int i3 = this.zzo;
            if (i3 != 0) {
                long[] jArr = this.zzm;
                int i4 = this.zzq;
                if (j2 >= jArr[i4]) {
                    if (z3 && (i2 = this.zzr) != i3) {
                        i3 = i2 + 1;
                    }
                    int zzA = zzA(i4, i3, j2, false);
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
        int i2 = this.zzo;
        if (i2 == 0) {
            return -1L;
        }
        return zzF(i2);
    }

    @GuardedBy
    private final long zzF(int i2) {
        long j2 = this.zzt;
        long j3 = Long.MIN_VALUE;
        if (i2 != 0) {
            int zzB = zzB(i2 - 1);
            for (int i3 = 0; i3 < i2; i3++) {
                j3 = Math.max(j3, this.zzm[zzB]);
                if ((this.zzl[zzB] & 1) != 0) {
                    break;
                }
                zzB--;
                if (zzB == -1) {
                    zzB = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j2, j3);
        this.zzo -= i2;
        int i4 = this.zzp + i2;
        this.zzp = i4;
        int i5 = this.zzq + i2;
        this.zzq = i5;
        int i6 = this.zzh;
        if (i5 >= i6) {
            this.zzq = i5 - i6;
        }
        int i7 = this.zzr - i2;
        this.zzr = i7;
        if (i7 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i4);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i8 = this.zzq;
        if (i8 == 0) {
            i8 = this.zzh;
        }
        return this.zzj[i8 - 1] + this.zzk[r12];
    }

    private final synchronized void zzG(long j2, int i2, long j3, int i3, @Nullable zzaeg zzaegVar) {
        try {
            int i4 = this.zzo;
            if (i4 > 0) {
                int zzB = zzB(i4 - 1);
                zzdi.zzd(this.zzj[zzB] + ((long) this.zzk[zzB]) <= j3);
            }
            this.zzv = (536870912 & i2) != 0;
            this.zzu = Math.max(this.zzu, j2);
            int zzB2 = zzB(this.zzo);
            this.zzm[zzB2] = j2;
            this.zzj[zzB2] = j3;
            this.zzk[zzB2] = i3;
            this.zzl[zzB2] = i2;
            this.zzn[zzB2] = zzaegVar;
            this.zzi[zzB2] = 0;
            if (this.zzc.zzf() || !((zzwk) this.zzc.zzb()).zza.equals(this.zzy)) {
                zzaf zzafVar = this.zzy;
                zzafVar.getClass();
                this.zzc.zzc(this.zzp + this.zzo, new zzwk(zzafVar, this.zzd.zzb(this.zze, zzafVar), null));
            }
            int i5 = this.zzo + 1;
            this.zzo = i5;
            int i6 = this.zzh;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                long[] jArr3 = new long[i7];
                int[] iArr = new int[i7];
                int[] iArr2 = new int[i7];
                zzaeg[] zzaegVarArr = new zzaeg[i7];
                int i8 = this.zzq;
                int i9 = i6 - i8;
                System.arraycopy(this.zzj, i8, jArr2, 0, i9);
                System.arraycopy(this.zzm, this.zzq, jArr3, 0, i9);
                System.arraycopy(this.zzl, this.zzq, iArr, 0, i9);
                System.arraycopy(this.zzk, this.zzq, iArr2, 0, i9);
                System.arraycopy(this.zzn, this.zzq, zzaegVarArr, 0, i9);
                System.arraycopy(this.zzi, this.zzq, jArr, 0, i9);
                int i10 = this.zzq;
                System.arraycopy(this.zzj, 0, jArr2, i9, i10);
                System.arraycopy(this.zzm, 0, jArr3, i9, i10);
                System.arraycopy(this.zzl, 0, iArr, i9, i10);
                System.arraycopy(this.zzk, 0, iArr2, i9, i10);
                System.arraycopy(this.zzn, 0, zzaegVarArr, i9, i10);
                System.arraycopy(this.zzi, 0, jArr, i9, i10);
                this.zzj = jArr2;
                this.zzm = jArr3;
                this.zzl = iArr;
                this.zzk = iArr2;
                this.zzn = zzaegVarArr;
                this.zzi = jArr;
                this.zzq = 0;
                this.zzh = i7;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzH(zzaf zzafVar, zzkm zzkmVar) {
        zzaf zzafVar2 = this.zzg;
        zzy zzyVar = zzafVar2 == null ? null : zzafVar2.zzr;
        this.zzg = zzafVar;
        zzy zzyVar2 = zzafVar.zzr;
        zzkmVar.zza = zzafVar.zzc(this.zzd.zza(zzafVar));
        zzkmVar.zzb = this.zzB;
        if (zzafVar2 == null || !Objects.equals(zzyVar, zzyVar2)) {
            zzrw zzc = this.zzd.zzc(this.zze, zzafVar);
            this.zzB = zzc;
            zzkmVar.zzb = zzc;
        }
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

    private final boolean zzL(int i2) {
        if (this.zzB != null) {
            return (this.zzl[i2] & Ints.MAX_POWER_OF_TWO) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzaf zzafVar) {
        try {
            this.zzx = false;
            if (Objects.equals(zzafVar, this.zzy)) {
                return false;
            }
            if (this.zzc.zzf() || !((zzwk) this.zzc.zzb()).zza.equals(zzafVar)) {
                this.zzy = zzafVar;
            } else {
                this.zzy = ((zzwk) this.zzc.zzb()).zza;
            }
            boolean z2 = this.zzz;
            zzaf zzafVar2 = this.zzy;
            this.zzz = z2 & zzbn.zzf(zzafVar2.zzn, zzafVar2.zzj);
            this.zzA = false;
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

    public final synchronized int zzc(long j2, boolean z2) {
        int i2 = this.zzr;
        int zzB = zzB(i2);
        if (zzK() && j2 >= this.zzm[zzB]) {
            if (j2 > this.zzu && z2) {
                return this.zzo - i2;
            }
            int zzA = zzA(zzB, this.zzo - i2, j2, true);
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
    public final int zze(com.google.android.gms.internal.ads.zzkm r9, com.google.android.gms.internal.ads.zzhq r10, int r11, boolean r12) {
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
            com.google.android.gms.internal.ads.zzwi r7 = r8.zzb
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
            com.google.android.gms.internal.ads.zzwg r9 = r8.zza
            com.google.android.gms.internal.ads.zzwi r11 = r8.zzb
            r9.zzd(r10, r11)
        L2b:
            r9 = r12
            goto L3e
        L2d:
            com.google.android.gms.internal.ads.zzwg r9 = r8.zza
            com.google.android.gms.internal.ads.zzwi r11 = r8.zzb
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwm.zze(com.google.android.gms.internal.ads.zzkm, com.google.android.gms.internal.ads.zzhq, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ int zzf(zzp zzpVar, int i2, boolean z2) {
        return zzaef.zza(this, zzpVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final int zzg(zzp zzpVar, int i2, boolean z2, int i3) throws IOException {
        return this.zza.zza(zzpVar, i2, z2);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzaf zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j2, boolean z2, boolean z3) {
        this.zza.zzc(zzD(j2, false, z3));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzl(zzaf zzafVar) {
        boolean zzM = zzM(zzafVar);
        zzwl zzwlVar = this.zzf;
        if (zzwlVar == null || !zzM) {
            return;
        }
        zzwlVar.zzM(zzafVar);
    }

    @CallSuper
    public final void zzm() throws IOException {
        zzrw zzrwVar = this.zzB;
        if (zzrwVar != null) {
            throw zzrwVar.zza();
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
    public final void zzp(boolean z2) {
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
        if (z2) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ void zzq(zzek zzekVar, int i2) {
        zzaef.zzb(this, zzekVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzr(zzek zzekVar, int i2, int i3) {
        this.zza.zzh(zzekVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzs(long j2, int i2, int i3, int i4, @Nullable zzaeg zzaegVar) {
        if (this.zzw) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzz) {
            if (j2 < this.zzs) {
                return;
            }
            if ((i2 & 1) == 0) {
                if (!this.zzA) {
                    zzea.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                    this.zzA = true;
                }
                i2 |= 1;
            }
        }
        zzG(j2, i2, (this.zza.zzb() - i3) - i4, i3, zzaegVar);
    }

    public final void zzt(long j2) {
        this.zzs = j2;
    }

    public final void zzu(@Nullable zzwl zzwlVar) {
        this.zzf = zzwlVar;
    }

    public final synchronized void zzv(int i2) {
        boolean z2 = false;
        if (i2 >= 0) {
            try {
                if (this.zzr + i2 <= this.zzo) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdi.zzd(z2);
        this.zzr += i2;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    @CallSuper
    public final synchronized boolean zzx(boolean z2) {
        boolean z3 = true;
        if (zzK()) {
            if (((zzwk) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzL(zzB(this.zzr));
        }
        if (!z2 && !this.zzv) {
            zzaf zzafVar = this.zzy;
            if (zzafVar == null) {
                z3 = false;
            } else if (zzafVar == this.zzg) {
                return false;
            }
        }
        return z3;
    }

    public final synchronized boolean zzy(int i2) {
        zzJ();
        int i3 = this.zzp;
        if (i2 >= i3 && i2 <= this.zzo + i3) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i2 - i3;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzz(long j2, boolean z2) {
        int zzA;
        try {
            zzJ();
            int i2 = this.zzr;
            int zzB = zzB(i2);
            if (zzK() && j2 >= this.zzm[zzB]) {
                if (j2 > this.zzu) {
                    if (z2) {
                        z2 = true;
                    }
                }
                if (this.zzz) {
                    zzA = this.zzo - i2;
                    int i3 = 0;
                    while (true) {
                        if (i3 < zzA) {
                            if (this.zzm[zzB] >= j2) {
                                zzA = i3;
                                break;
                            }
                            zzB++;
                            if (zzB == this.zzh) {
                                zzB = 0;
                            }
                            i3++;
                        } else if (!z2) {
                            zzA = -1;
                        }
                    }
                } else {
                    zzA = zzA(zzB, this.zzo - i2, j2, true);
                }
                if (zzA != -1) {
                    this.zzs = j2;
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
