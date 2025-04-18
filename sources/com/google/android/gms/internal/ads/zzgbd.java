package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class zzgbd {
    public static Object zza(Iterable iterable, Object obj) {
        zzgcs zzgcsVar = new zzgcs((zzgct) iterable);
        return zzgcsVar.hasNext() ? zzgcsVar.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfya zzfyaVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfyaVar.getClass();
            return zzd((List) iterable, zzfyaVar);
        }
        Iterator it = iterable.iterator();
        zzfyaVar.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (zzfyaVar.zza(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static void zzc(List list, zzfya zzfyaVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (zzfyaVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    private static boolean zzd(List list, zzfya zzfyaVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!zzfyaVar.zza(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfyaVar, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfyaVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }
}
