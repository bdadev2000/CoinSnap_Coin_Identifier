package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzacx {
    public final String zza;

    private zzacx(int i2, int i3, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzacx zza(zzek zzekVar) {
        String str;
        zzekVar.zzM(2);
        int zzm = zzekVar.zzm();
        int i2 = zzm >> 1;
        int i3 = zzm & 1;
        int zzm2 = zzekVar.zzm() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i4 = zzm2 | (i3 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(i4 >= 10 ? "." : ".0");
        sb.append(i4);
        return new zzacx(i2, i4, sb.toString());
    }
}
