package com.google.android.gms.internal.ads;

import com.applovin.impl.L;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzher {
    private static final zzher zza = new zzher(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzher(int i9, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i9;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public static zzher zzc() {
        return zza;
    }

    public static zzher zze(zzher zzherVar, zzher zzherVar2) {
        int i9 = zzherVar.zzb + zzherVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzherVar.zzc, i9);
        System.arraycopy(zzherVar2.zzc, 0, copyOf, zzherVar.zzb, zzherVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzherVar.zzd, i9);
        System.arraycopy(zzherVar2.zzd, 0, copyOf2, zzherVar.zzb, zzherVar2.zzb);
        return new zzher(i9, copyOf, copyOf2, true);
    }

    public static zzher zzf() {
        return new zzher();
    }

    private final void zzn(int i9) {
        int[] iArr = this.zzc;
        if (i9 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i9);
            this.zzd = Arrays.copyOf(this.zzd, i9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzher)) {
            return false;
        }
        zzher zzherVar = (zzher) obj;
        int i9 = this.zzb;
        if (i9 == zzherVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzherVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzherVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzb;
        int i10 = i9 + 527;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int zzD2;
        int i9 = this.zze;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.zzd[i11]).getClass();
                                    zzD2 = zzhat.zzD(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzhcd.zza());
                                }
                            } else {
                                int zzD3 = zzhat.zzD(i13 << 3);
                                zzD = zzD3 + zzD3;
                                zzE = ((zzher) this.zzd[i11]).zza();
                            }
                        } else {
                            int i15 = i13 << 3;
                            zzhac zzhacVar = (zzhac) this.zzd[i11];
                            int zzD4 = zzhat.zzD(i15);
                            int zzd = zzhacVar.zzd();
                            i10 = zzhat.zzD(zzd) + zzd + zzD4 + i10;
                        }
                    } else {
                        ((Long) this.zzd[i11]).getClass();
                        zzD2 = zzhat.zzD(i13 << 3) + 8;
                    }
                    i10 = zzD2 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.zzd[i11]).longValue();
                    zzD = zzhat.zzD(i16);
                    zzE = zzhat.zzE(longValue);
                }
                i10 = zzE + zzD + i10;
            }
            this.zze = i10;
            return i10;
        }
        return i9;
    }

    public final int zzb() {
        int i9 = this.zze;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11] >>> 3;
                zzhac zzhacVar = (zzhac) this.zzd[i11];
                int zzD = zzhat.zzD(8);
                int zzD2 = zzhat.zzD(i12) + zzhat.zzD(16);
                int zzD3 = zzhat.zzD(24);
                int zzd = zzhacVar.zzd();
                i10 += zzD + zzD + zzD2 + L.b(zzd, zzd, zzD3);
            }
            this.zze = i10;
            return i10;
        }
        return i9;
    }

    public final zzher zzd(zzher zzherVar) {
        if (zzherVar.equals(zza)) {
            return this;
        }
        zzg();
        int i9 = this.zzb + zzherVar.zzb;
        zzn(i9);
        System.arraycopy(zzherVar.zzc, 0, this.zzc, this.zzb, zzherVar.zzb);
        System.arraycopy(zzherVar.zzd, 0, this.zzd, this.zzb, zzherVar.zzb);
        this.zzb = i9;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhdg.zzb(sb, i9, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i9, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i9;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzhfi zzhfiVar) throws IOException {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzhfiVar.zzw(this.zzc[i9] >>> 3, this.zzd[i9]);
        }
    }

    public final void zzl(zzhfi zzhfiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i9 = 0; i9 < this.zzb; i9++) {
                int i10 = this.zzc[i9];
                Object obj = this.zzd[i9];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    zzhfiVar.zzk(i12, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzhcd.zza());
                                }
                            } else {
                                zzhfiVar.zzF(i12);
                                ((zzher) obj).zzl(zzhfiVar);
                                zzhfiVar.zzh(i12);
                            }
                        } else {
                            zzhfiVar.zzd(i12, (zzhac) obj);
                        }
                    } else {
                        zzhfiVar.zzm(i12, ((Long) obj).longValue());
                    }
                } else {
                    zzhfiVar.zzt(i12, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean zzm(int i9, zzham zzhamVar) throws IOException {
        int zzm;
        zzg();
        int i10 = i9 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                zzj(i9, Integer.valueOf(zzhamVar.zzg()));
                                return true;
                            }
                            throw zzhcd.zza();
                        }
                        return false;
                    }
                    zzher zzherVar = new zzher();
                    do {
                        zzm = zzhamVar.zzm();
                        if (zzm == 0) {
                            break;
                        }
                    } while (zzherVar.zzm(zzm, zzhamVar));
                    zzhamVar.zzz(4 | ((i9 >>> 3) << 3));
                    zzj(i9, zzherVar);
                    return true;
                }
                zzj(i9, zzhamVar.zzw());
                return true;
            }
            zzj(i9, Long.valueOf(zzhamVar.zzo()));
            return true;
        }
        zzj(i9, Long.valueOf(zzhamVar.zzp()));
        return true;
    }

    private zzher() {
        this(0, new int[8], new Object[8], true);
    }
}
