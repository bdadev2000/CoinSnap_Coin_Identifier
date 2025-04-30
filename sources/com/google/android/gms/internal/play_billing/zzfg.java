package com.google.android.gms.internal.play_billing;

import com.applovin.impl.L;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfg {
    private static final zzfg zza = new zzfg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfg(int i9, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i9;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public static zzfg zzc() {
        return zza;
    }

    public static zzfg zze(zzfg zzfgVar, zzfg zzfgVar2) {
        int i9 = zzfgVar.zzb + zzfgVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzfgVar.zzc, i9);
        System.arraycopy(zzfgVar2.zzc, 0, copyOf, zzfgVar.zzb, zzfgVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzfgVar.zzd, i9);
        System.arraycopy(zzfgVar2.zzd, 0, copyOf2, zzfgVar.zzb, zzfgVar2.zzb);
        return new zzfg(i9, copyOf, copyOf2, true);
    }

    public static zzfg zzf() {
        return new zzfg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i9) {
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
        if (obj == null || !(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        int i9 = this.zzb;
        if (i9 == zzfgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzfgVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzfgVar.zzd;
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
        int zzw;
        int zzx;
        int zzw2;
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
                                    zzw2 = zzby.zzw(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzdc.zza());
                                }
                            } else {
                                int zzw3 = zzby.zzw(i13 << 3);
                                zzw = zzw3 + zzw3;
                                zzx = ((zzfg) this.zzd[i11]).zza();
                            }
                        } else {
                            int i15 = i13 << 3;
                            zzbq zzbqVar = (zzbq) this.zzd[i11];
                            int zzw4 = zzby.zzw(i15);
                            int zzd = zzbqVar.zzd();
                            i10 = zzby.zzw(zzd) + zzd + zzw4 + i10;
                        }
                    } else {
                        ((Long) this.zzd[i11]).getClass();
                        zzw2 = zzby.zzw(i13 << 3) + 8;
                    }
                    i10 = zzw2 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.zzd[i11]).longValue();
                    zzw = zzby.zzw(i16);
                    zzx = zzby.zzx(longValue);
                }
                i10 = zzx + zzw + i10;
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
                zzbq zzbqVar = (zzbq) this.zzd[i11];
                int zzw = zzby.zzw(8);
                int zzw2 = zzby.zzw(i12) + zzby.zzw(16);
                int zzw3 = zzby.zzw(24);
                int zzd = zzbqVar.zzd();
                i10 += zzw + zzw + zzw2 + L.y(zzd, zzd, zzw3);
            }
            this.zze = i10;
            return i10;
        }
        return i9;
    }

    public final zzfg zzd(zzfg zzfgVar) {
        if (zzfgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i9 = this.zzb + zzfgVar.zzb;
        zzm(i9);
        System.arraycopy(zzfgVar.zzc, 0, this.zzc, this.zzb, zzfgVar.zzb);
        System.arraycopy(zzfgVar.zzd, 0, this.zzd, this.zzb, zzfgVar.zzb);
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
            zzee.zzb(sb, i9, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i9, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i9;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzfx zzfxVar) throws IOException {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzfxVar.zzw(this.zzc[i9] >>> 3, this.zzd[i9]);
        }
    }

    public final void zzl(zzfx zzfxVar) throws IOException {
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
                                    zzfxVar.zzk(i12, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzdc.zza());
                                }
                            } else {
                                zzfxVar.zzF(i12);
                                ((zzfg) obj).zzl(zzfxVar);
                                zzfxVar.zzh(i12);
                            }
                        } else {
                            zzfxVar.zzd(i12, (zzbq) obj);
                        }
                    } else {
                        zzfxVar.zzm(i12, ((Long) obj).longValue());
                    }
                } else {
                    zzfxVar.zzt(i12, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzfg() {
        this(0, new int[8], new Object[8], true);
    }
}
