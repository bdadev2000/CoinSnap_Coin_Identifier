package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzalk {
    @Nullable
    public static zzall zza(@Nullable zzall zzallVar, @Nullable String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzallVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzall) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzall zzallVar2 = new zzall();
                while (i10 < length2) {
                    zzallVar2.zzl((zzall) map.get(strArr[i10]));
                    i10++;
                }
                return zzallVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzallVar.zzl((zzall) map.get(strArr[0]));
                return zzallVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    zzallVar.zzl((zzall) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return zzallVar;
    }
}
