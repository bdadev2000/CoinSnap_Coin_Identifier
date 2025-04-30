package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class zzgde {
    public static int zza(Set set) {
        int i9;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }

    public static zzgdd zzb(Set set, Set set2) {
        zzfyg.zzc(set, "set1");
        zzfyg.zzc(set2, "set2");
        return new zzgcy(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfyh zzfyhVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzgcz) {
                zzgcz zzgczVar = (zzgcz) sortedSet;
                return new zzgda((SortedSet) zzgczVar.zza, zzfyk.zza(zzgczVar.zzb, zzfyhVar));
            }
            sortedSet.getClass();
            return new zzgda(sortedSet, zzfyhVar);
        }
        if (set instanceof zzgcz) {
            zzgcz zzgczVar2 = (zzgcz) set;
            return new zzgcz(zzgczVar2.zza, zzfyk.zza(zzgczVar2.zzb, zzfyhVar));
        }
        set.getClass();
        return new zzgcz(set, zzfyhVar);
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
        if (collection instanceof zzgck) {
            collection = ((zzgck) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            collection.getClass();
            boolean z8 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }
        return zzf(set, collection.iterator());
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= set.remove(it.next());
        }
        return z8;
    }
}
