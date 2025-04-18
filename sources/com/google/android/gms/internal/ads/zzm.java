package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import eb.j;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzm {
    public static final zzm zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzk zzkVar = new zzk();
        zzkVar.zzc(1);
        zzkVar.zzb(2);
        zzkVar.zzd(3);
        zza = zzkVar.zzg();
        zzk zzkVar2 = new zzk();
        zzkVar2.zzc(1);
        zzkVar2.zzb(1);
        zzkVar2.zzd(2);
        zzkVar2.zzg();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzm(int i10, int i11, int i12, byte[] bArr, int i13, int i14, zzl zzlVar) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
        this.zzf = i13;
        this.zzg = i14;
    }

    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(@Nullable zzm zzmVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (zzmVar == null) {
            return true;
        }
        int i14 = zzmVar.zzb;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = zzmVar.zzc) == -1 || i10 == 2) && (((i11 = zzmVar.zzd) == -1 || i11 == 3) && zzmVar.zze == null && (((i12 = zzmVar.zzg) == -1 || i12 == 8) && ((i13 = zzmVar.zzf) == -1 || i13 == 8)));
    }

    private static String zzh(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return j.i("Undefined color range ", i10);
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String zzi(int i10) {
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return j.i("Undefined color space ", i10);
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String zzj(int i10) {
        if (i10 != -1) {
            if (i10 != 10) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return j.i("Undefined color transfer ", i10);
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
        if (obj != null && zzm.class == obj.getClass()) {
            zzm zzmVar = (zzm) obj;
            if (this.zzb == zzmVar.zzb && this.zzc == zzmVar.zzc && this.zzd == zzmVar.zzd && Arrays.equals(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        boolean z10;
        int i10 = this.zzf;
        int i11 = this.zzd;
        int i12 = this.zzc;
        String zzi = zzi(this.zzb);
        String zzh = zzh(i12);
        String zzj = zzj(i11);
        String str2 = "NA";
        if (i10 == -1) {
            str = "NA";
        } else {
            str = i10 + "bit Luma";
        }
        int i13 = this.zzg;
        if (i13 != -1) {
            str2 = i13 + "bit Chroma";
        }
        if (this.zze != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder p10 = a4.j.p("ColorInfo(", zzi, ", ", zzh, ", ");
        p10.append(zzj);
        p10.append(", ");
        p10.append(z10);
        p10.append(", ");
        return a4.j.k(p10, str, ", ", str2, ")");
    }

    public final zzk zzc() {
        return new zzk(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            str = String.format(Locale.US, "%s/%s/%s", zzi(this.zzb), zzh(this.zzc), zzj(this.zzd));
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
