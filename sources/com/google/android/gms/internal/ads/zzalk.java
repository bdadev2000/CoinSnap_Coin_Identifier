package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes2.dex */
final class zzalk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzalk(int i2, int i3, int i4, int i5, int i6) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    @Nullable
    public static zzalk zza(String str) {
        char c2;
        zzdi.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = split.length;
            if (i2 >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new zzalk(i3, i4, i5, i6, length);
            }
            String zza = zzfxi.zza(split[i2].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (zza.equals("end")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3556653:
                    if (zza.equals("text")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (zza.equals("start")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 109780401:
                    if (zza.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            c2 = 65535;
            if (c2 == 0) {
                i3 = i2;
            } else if (c2 == 1) {
                i4 = i2;
            } else if (c2 == 2) {
                i5 = i2;
            } else if (c2 == 3) {
                i6 = i2;
            }
            i2++;
        }
    }
}
