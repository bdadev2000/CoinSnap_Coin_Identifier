package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzgbs {
    public static ArrayList zza(int i9) {
        zzfzz.zza(i9, "initialArraySize");
        return new ArrayList(i9);
    }

    public static List zzb(List list, zzfxu zzfxuVar) {
        if (list instanceof RandomAccess) {
            return new zzgbp(list, zzfxuVar);
        }
        return new zzgbr(list, zzfxuVar);
    }
}
