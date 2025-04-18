package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes4.dex */
public final class zzo {
    public static final zzo zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzm zzmVar = new zzm();
        zzmVar.zzc(1);
        zzmVar.zzb(2);
        zzmVar.zzd(3);
        zza = zzmVar.zzg();
        zzm zzmVar2 = new zzm();
        zzmVar2.zzc(1);
        zzmVar2.zzb(1);
        zzmVar2.zzd(2);
        zzmVar2.zzg();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzo(int i2, int i3, int i4, byte[] bArr, int i5, int i6, zzn zznVar) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = bArr;
        this.zzf = i5;
        this.zzg = i6;
    }

    @Pure
    public static int zza(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzb(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zzg(@Nullable zzo zzoVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (zzoVar == null) {
            return true;
        }
        int i6 = zzoVar.zzb;
        return (i6 == -1 || i6 == 1 || i6 == 2) && ((i2 = zzoVar.zzc) == -1 || i2 == 2) && (((i3 = zzoVar.zzd) == -1 || i3 == 3) && zzoVar.zze == null && (((i4 = zzoVar.zzg) == -1 || i4 == 8) && ((i5 = zzoVar.zzf) == -1 || i5 == 8)));
    }

    private static String zzh(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? d.i("Undefined color range ", i2) : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzi(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? d.i("Undefined color space ", i2) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzj(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? d.i("Undefined color transfer ", i2) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzo.class == obj.getClass()) {
            zzo zzoVar = (zzo) obj;
            if (this.zzb == zzoVar.zzb && this.zzc == zzoVar.zzc && this.zzd == zzoVar.zzd && Arrays.equals(this.zze, zzoVar.zze) && this.zzf == zzoVar.zzf && this.zzg == zzoVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzh;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i2 = this.zzf;
        int i3 = this.zzd;
        int i4 = this.zzc;
        String zzi = zzi(this.zzb);
        String zzh = zzh(i4);
        String zzj = zzj(i3);
        String str2 = "NA";
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        int i5 = this.zzg;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        boolean z2 = this.zze != null;
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("ColorInfo(", zzi, ", ", zzh, ", ");
        t2.append(zzj);
        t2.append(", ");
        t2.append(z2);
        t2.append(", ");
        t2.append(str);
        t2.append(", ");
        t2.append(str2);
        t2.append(")");
        return t2.toString();
    }

    public final zzm zzc() {
        return new zzm(this, null);
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
            str2 = this.zzf + RemoteSettings.FORWARD_SLASH_STRING + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return androidx.compose.foundation.text.input.a.k(str, RemoteSettings.FORWARD_SLASH_STRING, str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
