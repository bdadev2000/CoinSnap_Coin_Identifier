package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzhfu {
    public static HashSet zza(int i10) {
        return new HashSet(zzd(i10));
    }

    public static LinkedHashMap zzb(int i10) {
        return new LinkedHashMap(zzd(i10));
    }

    public static List zzc(int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i10);
    }

    private static int zzd(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
