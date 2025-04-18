package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class zzgbq {
    public static int zza(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    public static zzgbo zzb(Set set, Set set2) {
        zzfwq.zzc(set, "set1");
        zzfwq.zzc(set2, "set2");
        return new zzgbk(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzc(Set set, zzfwr zzfwrVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzgbl) {
                zzgbl zzgblVar = (zzgbl) sortedSet;
                return new zzgbm((SortedSet) zzgblVar.zza, zzfwu.zza(zzgblVar.zzb, zzfwrVar));
            }
            sortedSet.getClass();
            return new zzgbm(sortedSet, zzfwrVar);
        }
        if (set instanceof zzgbl) {
            zzgbl zzgblVar2 = (zzgbl) set;
            return new zzgbl((Set) zzgblVar2.zza, zzfwu.zza(zzgblVar2.zzb, zzfwrVar));
        }
        set.getClass();
        return new zzgbl(set, zzfwrVar);
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
        if (collection instanceof zzgaw) {
            collection = ((zzgaw) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return zzf(set, collection.iterator());
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
