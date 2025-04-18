package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzgae {
    public static ArrayList zza(int i10) {
        zzfyl.zza(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List zzb(List list, zzfwh zzfwhVar) {
        if (list instanceof RandomAccess) {
            return new zzgab(list, zzfwhVar);
        }
        return new zzgad(list, zzfwhVar);
    }
}
