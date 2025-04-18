package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcd {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzaf[] zzd;
    private int zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzcd(String str, zzaf... zzafVarArr) {
        int length = zzafVarArr.length;
        int i2 = 1;
        zzdi.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzafVarArr;
        this.zza = length;
        int zzb = zzbn.zzb(zzafVarArr[0].zzn);
        this.zzc = zzb == -1 ? zzbn.zzb(zzafVarArr[0].zzm) : zzb;
        String zzc = zzc(zzafVarArr[0].zzd);
        int i3 = zzafVarArr[0].zzf | 16384;
        while (true) {
            zzaf[] zzafVarArr2 = this.zzd;
            if (i2 >= zzafVarArr2.length) {
                return;
            }
            if (!zzc.equals(zzc(zzafVarArr2[i2].zzd))) {
                zzaf[] zzafVarArr3 = this.zzd;
                zzd("languages", zzafVarArr3[0].zzd, zzafVarArr3[i2].zzd, i2);
                return;
            } else {
                zzaf[] zzafVarArr4 = this.zzd;
                if (i3 != (zzafVarArr4[i2].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzafVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i2].zzf), i2);
                    return;
                }
                i2++;
            }
        }
    }

    private static String zzc(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i2) {
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        t2.append(str3);
        t2.append("' (track ");
        t2.append(i2);
        t2.append(")");
        zzea.zzd("TrackGroup", "", new IllegalStateException(t2.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcd.class == obj.getClass()) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzb.equals(zzcdVar.zzb) && Arrays.equals(this.zzd, zzcdVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.zzb.hashCode() + 527;
        int hashCode2 = Arrays.hashCode(this.zzd) + (hashCode * 31);
        this.zze = hashCode2;
        return hashCode2;
    }

    public final int zza(zzaf zzafVar) {
        int i2 = 0;
        while (true) {
            zzaf[] zzafVarArr = this.zzd;
            if (i2 >= zzafVarArr.length) {
                return -1;
            }
            if (zzafVar == zzafVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final zzaf zzb(int i2) {
        return this.zzd[i2];
    }
}
