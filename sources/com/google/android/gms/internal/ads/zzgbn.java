package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class zzgbn {
    public static ArrayList zza(int i2) {
        zzfzu.zza(i2, "initialArraySize");
        return new ArrayList(i2);
    }

    public static List zzb(List list, zzfxq zzfxqVar) {
        return list instanceof RandomAccess ? new zzgbk(list, zzfxqVar) : new zzgbm(list, zzfxqVar);
    }
}
