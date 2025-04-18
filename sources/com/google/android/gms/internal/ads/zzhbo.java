package com.google.android.gms.internal.ads;

import a4.j;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhbo {
    private static final zzhbo zza = new zzhbo(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhbo(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzhbo zzc() {
        return zza;
    }

    public static zzhbo zze(zzhbo zzhboVar, zzhbo zzhboVar2) {
        int i10 = zzhboVar.zzb + zzhboVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhboVar.zzc, i10);
        System.arraycopy(zzhboVar2.zzc, 0, copyOf, zzhboVar.zzb, zzhboVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhboVar.zzd, i10);
        System.arraycopy(zzhboVar2.zzd, 0, copyOf2, zzhboVar.zzb, zzhboVar2.zzb);
        return new zzhbo(i10, copyOf, copyOf2, true);
    }

    public static zzhbo zzf() {
        return new zzhbo();
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhbo)) {
            return false;
        }
        zzhbo zzhboVar = (zzhbo) obj;
        int i10 = this.zzb;
        if (i10 == zzhboVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhboVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhboVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int zzD2;
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 5) {
                                    ((Integer) this.zzd[i12]).intValue();
                                    zzD2 = zzgyc.zzD(i14 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zzgzl("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int zzD3 = zzgyc.zzD(i14 << 3);
                                zzD = zzD3 + zzD3;
                                zzE = ((zzhbo) this.zzd[i12]).zza();
                            }
                        } else {
                            int i16 = i14 << 3;
                            zzgxp zzgxpVar = (zzgxp) this.zzd[i12];
                            int zzD4 = zzgyc.zzD(i16);
                            int zzd = zzgxpVar.zzd();
                            i11 = zzgyc.zzD(zzd) + zzd + zzD4 + i11;
                        }
                    } else {
                        ((Long) this.zzd[i12]).longValue();
                        zzD2 = zzgyc.zzD(i14 << 3) + 8;
                    }
                    i11 = zzD2 + i11;
                } else {
                    int i17 = i14 << 3;
                    long longValue = ((Long) this.zzd[i12]).longValue();
                    zzD = zzgyc.zzD(i17);
                    zzE = zzgyc.zzE(longValue);
                }
                i11 = zzE + zzD + i11;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12] >>> 3;
                zzgxp zzgxpVar = (zzgxp) this.zzd[i12];
                int zzD = zzgyc.zzD(8);
                int zzD2 = zzgyc.zzD(i13) + zzgyc.zzD(16);
                int zzD3 = zzgyc.zzD(24);
                int zzd = zzgxpVar.zzd();
                i11 = j.a(zzD + zzD, zzD2, zzgyc.zzD(zzd) + zzd + zzD3, i11);
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final zzhbo zzd(zzhbo zzhboVar) {
        if (zzhboVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzhboVar.zzb;
        zzn(i10);
        System.arraycopy(zzhboVar.zzc, 0, this.zzc, this.zzb, zzhboVar.zzb);
        System.arraycopy(zzhboVar.zzd, 0, this.zzd, this.zzb, zzhboVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzhak.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzhcc zzhccVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhccVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzhcc zzhccVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    zzhccVar.zzk(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zzgzl("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                zzhccVar.zzF(i13);
                                ((zzhbo) obj).zzl(zzhccVar);
                                zzhccVar.zzh(i13);
                            }
                        } else {
                            zzhccVar.zzd(i13, (zzgxp) obj);
                        }
                    } else {
                        zzhccVar.zzm(i13, ((Long) obj).longValue());
                    }
                } else {
                    zzhccVar.zzt(i13, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean zzm(int i10, zzgxv zzgxvVar) throws IOException {
        int zzl;
        zzg();
        int i11 = i10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzj(i10, Integer.valueOf(zzgxvVar.zzf()));
                                return true;
                            }
                            throw new zzgzl("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    zzhbo zzhboVar = new zzhbo();
                    do {
                        zzl = zzgxvVar.zzl();
                        if (zzl == 0) {
                            break;
                        }
                    } while (zzhboVar.zzm(zzl, zzgxvVar));
                    zzgxvVar.zzy(4 | ((i10 >>> 3) << 3));
                    zzj(i10, zzhboVar);
                    return true;
                }
                zzj(i10, zzgxvVar.zzv());
                return true;
            }
            zzj(i10, Long.valueOf(zzgxvVar.zzn()));
            return true;
        }
        zzj(i10, Long.valueOf(zzgxvVar.zzo()));
        return true;
    }

    private zzhbo() {
        this(0, new int[8], new Object[8], true);
    }
}
