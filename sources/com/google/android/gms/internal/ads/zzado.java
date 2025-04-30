package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzado {
    public final String zza;

    private zzado(int i9, int i10, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzado zza(zzfu zzfuVar) {
        String str;
        zzfuVar.zzL(2);
        int zzm = zzfuVar.zzm();
        int i9 = zzm >> 1;
        int i10 = zzm & 1;
        int zzm2 = zzfuVar.zzm() >> 3;
        if (i9 != 4 && i9 != 5 && i9 != 7) {
            if (i9 == 8) {
                str = "hev1";
            } else if (i9 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i11 = zzm2 | (i10 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i9);
        if (i11 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(i11);
        return new zzado(i9, i11, sb.toString());
    }
}
