package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzfzu {
    public static Object zza(Iterable iterable, Object obj) {
        zzgbj zzgbjVar = new zzgbj((zzgbk) iterable);
        if (zzgbjVar.hasNext()) {
            return zzgbjVar.next();
        }
        return obj;
    }

    public static boolean zzb(Iterable iterable, zzfwr zzfwrVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfwrVar.getClass();
            return zzd((List) iterable, zzfwrVar);
        }
        Iterator it = iterable.iterator();
        zzfwrVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfwrVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzc(List list, zzfwr zzfwrVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfwrVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }

    private static boolean zzd(List list, zzfwr zzfwrVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfwrVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfwrVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfwrVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        if (i10 == i11) {
            return false;
        }
        return true;
    }
}
