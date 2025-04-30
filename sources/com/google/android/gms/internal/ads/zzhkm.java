package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhkm {
    public static HashSet zza(int i9) {
        return new HashSet(zzd(i9));
    }

    public static LinkedHashMap zzb(int i9) {
        return new LinkedHashMap(zzd(i9));
    }

    public static List zzc(int i9) {
        if (i9 == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i9);
    }

    private static int zzd(int i9) {
        if (i9 < 3) {
            return i9 + 1;
        }
        if (i9 < 1073741824) {
            return (int) ((i9 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
