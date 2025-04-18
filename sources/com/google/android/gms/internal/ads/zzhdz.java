package com.google.android.gms.internal.ads;

import com.applovin.impl.adview.t;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhdz {
    private static final zzhdz zza = new zzhdz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhdz(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzhdz zzc() {
        return zza;
    }

    public static zzhdz zze(zzhdz zzhdzVar, zzhdz zzhdzVar2) {
        int i2 = zzhdzVar.zzb + zzhdzVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhdzVar.zzc, i2);
        System.arraycopy(zzhdzVar2.zzc, 0, copyOf, zzhdzVar.zzb, zzhdzVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhdzVar.zzd, i2);
        System.arraycopy(zzhdzVar2.zzd, 0, copyOf2, zzhdzVar.zzb, zzhdzVar2.zzb);
        return new zzhdz(i2, copyOf, copyOf2, true);
    }

    public static zzhdz zzf() {
        return new zzhdz();
    }

    private final void zzn(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhdz)) {
            return false;
        }
        zzhdz zzhdzVar = (zzhdz) obj;
        int i2 = this.zzb;
        if (i2 == zzhdzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhdzVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhdzVar.zzd;
                    int i4 = this.zzb;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = i2 + 527;
        int[] iArr = this.zzc;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = ((i3 * 31) + i5) * 31;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int zzD2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    zzD2 = zzhaj.zzD(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzgzs zzgzsVar = (zzgzs) this.zzd[i4];
                    int zzD3 = zzhaj.zzD(i8);
                    int zzd = zzgzsVar.zzd();
                    i3 = zzhaj.zzD(zzd) + zzd + zzD3 + i3;
                } else if (i7 == 3) {
                    int zzD4 = zzhaj.zzD(i6 << 3);
                    zzD = zzD4 + zzD4;
                    zzE = ((zzhdz) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzhbs("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    zzD2 = zzhaj.zzD(i6 << 3) + 4;
                }
                i3 = zzD2 + i3;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzD = zzhaj.zzD(i9);
                zzE = zzhaj.zzE(longValue);
            }
            i3 = zzE + zzD + i3;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4] >>> 3;
            zzgzs zzgzsVar = (zzgzs) this.zzd[i4];
            int zzD = zzhaj.zzD(8);
            int zzD2 = zzhaj.zzD(i5) + zzhaj.zzD(16);
            int zzD3 = zzhaj.zzD(24);
            int zzd = zzgzsVar.zzd();
            i3 += zzD + zzD + zzD2 + t.a(zzd, zzd, zzD3);
        }
        this.zze = i3;
        return i3;
    }

    public final zzhdz zzd(zzhdz zzhdzVar) {
        if (zzhdzVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzhdzVar.zzb;
        zzn(i2);
        System.arraycopy(zzhdzVar.zzc, 0, this.zzc, this.zzb, zzhdzVar.zzb);
        System.arraycopy(zzhdzVar.zzd, 0, this.zzd, this.zzb, zzhdzVar.zzb);
        this.zzb = i2;
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

    public final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzhcr.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzj(int i2, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    public final void zzk(zzhen zzhenVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzhenVar.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzhen zzhenVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzhenVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzhenVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzhenVar.zzd(i5, (zzgzs) obj);
                } else if (i4 == 3) {
                    zzhenVar.zzF(i5);
                    ((zzhdz) obj).zzl(zzhenVar);
                    zzhenVar.zzh(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzhbs("Protocol message tag had invalid wire type."));
                    }
                    zzhenVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean zzm(int i2, zzhac zzhacVar) throws IOException {
        int zzl;
        zzg();
        int i3 = i2 & 7;
        if (i3 == 0) {
            zzj(i2, Long.valueOf(zzhacVar.zzo()));
            return true;
        }
        if (i3 == 1) {
            zzj(i2, Long.valueOf(zzhacVar.zzn()));
            return true;
        }
        if (i3 == 2) {
            zzj(i2, zzhacVar.zzv());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            zzj(i2, Integer.valueOf(zzhacVar.zzf()));
            return true;
        }
        zzhdz zzhdzVar = new zzhdz();
        do {
            zzl = zzhacVar.zzl();
            if (zzl == 0) {
                break;
            }
        } while (zzhdzVar.zzm(zzl, zzhacVar));
        zzhacVar.zzy(4 | ((i2 >>> 3) << 3));
        zzj(i2, zzhdzVar);
        return true;
    }

    private zzhdz() {
        this(0, new int[8], new Object[8], true);
    }
}
