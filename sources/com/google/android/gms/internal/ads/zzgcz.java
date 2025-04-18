package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public final class zzgcz {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }

    public static zzgcy zzb(Set set, Set set2) {
        zzfxz.zzc(set, "set1");
        zzfxz.zzc(set2, "set2");
        return new zzgct(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzc(Set set, zzfya zzfyaVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgcu)) {
                set.getClass();
                return new zzgcu(set, zzfyaVar);
            }
            zzgcu zzgcuVar = (zzgcu) set;
            return new zzgcu((Set) zzgcuVar.zza, zzfyd.zza(zzgcuVar.zzb, zzfyaVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgcu)) {
            sortedSet.getClass();
            return new zzgcv(sortedSet, zzfyaVar);
        }
        zzgcu zzgcuVar2 = (zzgcu) sortedSet;
        return new zzgcv((SortedSet) zzgcuVar2.zza, zzfyd.zza(zzgcuVar2.zzb, zzfyaVar));
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgcf) {
            collection = ((zzgcf) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= set.remove(it.next());
        }
        return z2;
    }
}
