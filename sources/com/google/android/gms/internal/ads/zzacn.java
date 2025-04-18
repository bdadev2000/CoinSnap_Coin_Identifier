package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzacn {
    public final String zza;

    private zzacn(int i10, int i11, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzacn zza(zzed zzedVar) {
        String str;
        zzedVar.zzM(2);
        int zzm = zzedVar.zzm();
        int i10 = zzm >> 1;
        int i11 = zzm & 1;
        int zzm2 = zzedVar.zzm() >> 3;
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i12 = zzm2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (i12 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(i12);
        return new zzacn(i10, i12, sb2.toString());
    }
}
