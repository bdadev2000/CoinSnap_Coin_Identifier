package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzde {
    public final int zzb;
    public final String zzc;
    public final int zzd;
    private final zzan[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdd
    };

    public zzde(String str, zzan... zzanVarArr) {
        boolean z8;
        int length = zzanVarArr.length;
        int i9 = 1;
        if (length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzc = str;
        this.zzg = zzanVarArr;
        this.zzb = length;
        int zzb = zzcg.zzb(zzanVarArr[0].zzn);
        this.zzd = zzb == -1 ? zzcg.zzb(zzanVarArr[0].zzm) : zzb;
        String zzc = zzc(zzanVarArr[0].zze);
        int i10 = zzanVarArr[0].zzg | 16384;
        while (true) {
            zzan[] zzanVarArr2 = this.zzg;
            if (i9 < zzanVarArr2.length) {
                if (!zzc.equals(zzc(zzanVarArr2[i9].zze))) {
                    zzan[] zzanVarArr3 = this.zzg;
                    zzd("languages", zzanVarArr3[0].zze, zzanVarArr3[i9].zze, i9);
                    return;
                } else {
                    zzan[] zzanVarArr4 = this.zzg;
                    if (i10 != (zzanVarArr4[i9].zzg | 16384)) {
                        zzd("role flags", Integer.toBinaryString(zzanVarArr4[0].zzg), Integer.toBinaryString(this.zzg[i9].zzg), i9);
                        return;
                    }
                    i9++;
                }
            } else {
                return;
            }
        }
    }

    private static String zzc(@Nullable String str) {
        if (str != null && !str.equals(C.LANGUAGE_UNDETERMINED)) {
            return str;
        }
        return "";
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i9) {
        StringBuilder o3 = o.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o3.append(str3);
        o3.append("' (track ");
        o3.append(i9);
        o3.append(")");
        zzfk.zzd("TrackGroup", "", new IllegalStateException(o3.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzde.class == obj.getClass()) {
            zzde zzdeVar = (zzde) obj;
            if (this.zzc.equals(zzdeVar.zzc) && Arrays.equals(this.zzg, zzdeVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzh;
        if (i9 == 0) {
            int hashCode = this.zzc.hashCode() + 527;
            int hashCode2 = Arrays.hashCode(this.zzg) + (hashCode * 31);
            this.zzh = hashCode2;
            return hashCode2;
        }
        return i9;
    }

    public final int zza(zzan zzanVar) {
        int i9 = 0;
        while (true) {
            zzan[] zzanVarArr = this.zzg;
            if (i9 < zzanVarArr.length) {
                if (zzanVar == zzanVarArr[i9]) {
                    return i9;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    public final zzan zzb(int i9) {
        return this.zzg[i9];
    }
}
