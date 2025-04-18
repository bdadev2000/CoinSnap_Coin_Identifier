package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzhif {
    public static HashSet zza(int i2) {
        return new HashSet(zzd(i2));
    }

    public static LinkedHashMap zzb(int i2) {
        return new LinkedHashMap(zzd(i2));
    }

    public static List zzc(int i2) {
        return i2 == 0 ? Collections.emptyList() : new ArrayList(i2);
    }

    private static int zzd(int i2) {
        return i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
