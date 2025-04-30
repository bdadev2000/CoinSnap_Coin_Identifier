package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzgbi {
    public static Object zza(Iterable iterable, Object obj) {
        zzgcx zzgcxVar = new zzgcx((zzgcy) iterable);
        if (zzgcxVar.hasNext()) {
            return zzgcxVar.next();
        }
        return obj;
    }

    public static boolean zzb(Iterable iterable, zzfyh zzfyhVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfyhVar.getClass();
            return zzd((List) iterable, zzfyhVar);
        }
        Iterator it = iterable.iterator();
        zzfyhVar.getClass();
        boolean z8 = false;
        while (it.hasNext()) {
            if (zzfyhVar.zza(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    private static void zzc(List list, zzfyh zzfyhVar, int i9, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (zzfyhVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 >= i9) {
                list.remove(i10);
            } else {
                return;
            }
        }
    }

    private static boolean zzd(List list, zzfyh zzfyhVar) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < list.size()) {
            Object obj = list.get(i9);
            if (!zzfyhVar.zza(obj)) {
                if (i9 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfyhVar, i10, i9);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfyhVar, i10, i9);
                        return true;
                    }
                }
                i10++;
            }
            i9++;
        }
        list.subList(i10, list.size()).clear();
        if (i9 == i10) {
            return false;
        }
        return true;
    }
}
