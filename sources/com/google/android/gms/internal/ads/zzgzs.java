package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzgzs implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzhac zzhacVar = (zzhac) obj;
        zzhac zzhacVar2 = (zzhac) obj2;
        zzgzv it = zzhacVar.iterator();
        zzgzv it2 = zzhacVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzhacVar.zzd()).compareTo(Integer.valueOf(zzhacVar2.zzd()));
    }
}
