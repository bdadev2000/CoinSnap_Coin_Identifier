package com.google.android.gms.internal.ads;

import Q7.n0;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzt {
    public static final zzt zza;
    public static final zzt zzb;

    @Deprecated
    public static final zzn zzc;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    public final int zzd;
    public final int zze;
    public final int zzf;

    @Nullable
    public final byte[] zzg;
    public final int zzh;
    public final int zzi;
    private int zzp;

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzc(1);
        zzrVar.zzb(2);
        zzrVar.zzd(3);
        zza = zzrVar.zzg();
        zzr zzrVar2 = new zzr();
        zzrVar2.zzc(1);
        zzrVar2.zzb(1);
        zzrVar2.zzd(2);
        zzb = zzrVar2.zzg();
        zzj = Integer.toString(0, 36);
        zzk = Integer.toString(1, 36);
        zzl = Integer.toString(2, 36);
        zzm = Integer.toString(3, 36);
        zzn = Integer.toString(4, 36);
        zzo = Integer.toString(5, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
        };
    }

    public /* synthetic */ zzt(int i9, int i10, int i11, byte[] bArr, int i12, int i13, zzs zzsVar) {
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = bArr;
        this.zzh = i12;
        this.zzi = i13;
    }

    public static int zza(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 != 9) {
            return (i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i9) {
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 4) {
            return 10;
        }
        if (i9 == 13) {
            return 2;
        }
        if (i9 == 16) {
            return 6;
        }
        if (i9 != 18) {
            return (i9 == 6 || i9 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(@Nullable zzt zztVar) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (zztVar == null) {
            return true;
        }
        int i13 = zztVar.zzd;
        return (i13 == -1 || i13 == 1 || i13 == 2) && ((i9 = zztVar.zze) == -1 || i9 == 2) && (((i10 = zztVar.zzf) == -1 || i10 == 3) && zztVar.zzg == null && (((i11 = zztVar.zzi) == -1 || i11 == 8) && ((i12 = zztVar.zzh) == -1 || i12 == 8)));
    }

    private static String zzh(int i9) {
        if (i9 != -1) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return o.h(i9, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String zzi(int i9) {
        if (i9 != -1) {
            if (i9 != 6) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        return o.h(i9, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String zzj(int i9) {
        if (i9 != -1) {
            if (i9 != 10) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    return o.h(i9, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzt.class == obj.getClass()) {
            zzt zztVar = (zzt) obj;
            if (this.zzd == zztVar.zzd && this.zze == zztVar.zze && this.zzf == zztVar.zzf && Arrays.equals(this.zzg, zztVar.zzg) && this.zzh == zztVar.zzh && this.zzi == zztVar.zzi) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzp;
        if (i9 == 0) {
            int hashCode = ((((Arrays.hashCode(this.zzg) + ((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf) * 31)) * 31) + this.zzh) * 31) + this.zzi;
            this.zzp = hashCode;
            return hashCode;
        }
        return i9;
    }

    public final String toString() {
        String str;
        boolean z8;
        int i9 = this.zzh;
        int i10 = this.zzf;
        int i11 = this.zze;
        String zzi = zzi(this.zzd);
        String zzh = zzh(i11);
        String zzj2 = zzj(i10);
        String str2 = "NA";
        if (i9 == -1) {
            str = "NA";
        } else {
            str = i9 + "bit Luma";
        }
        int i12 = this.zzi;
        if (i12 != -1) {
            str2 = i12 + "bit Chroma";
        }
        if (this.zzg != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        StringBuilder o3 = o.o("ColorInfo(", zzi, ", ", zzh, ", ");
        o3.append(zzj2);
        o3.append(", ");
        o3.append(z8);
        o3.append(", ");
        return n0.m(o3, str, ", ", str2, ")");
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String zzi = zzi(this.zzd);
            String zzh = zzh(this.zze);
            String zzj2 = zzj(this.zzf);
            Locale locale = Locale.US;
            str = zzi + "/" + zzh + "/" + zzj2;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzh + "/" + this.zzi;
        } else {
            str2 = "NA/NA";
        }
        return o.k(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzh == -1 || this.zzi == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
