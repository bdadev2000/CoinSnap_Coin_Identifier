package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzhco extends zzhcs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhco() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j7, int i9) {
        zzhcl zzhclVar;
        List arrayList;
        List list = (List) zzhfa.zzh(obj, j7);
        if (list.isEmpty()) {
            if (list instanceof zzhcm) {
                arrayList = new zzhcl(i9);
            } else if ((list instanceof zzhdn) && (list instanceof zzhca)) {
                arrayList = ((zzhca) list).zzf(i9);
            } else {
                arrayList = new ArrayList(i9);
            }
            zzhfa.zzv(obj, j7, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i9);
            arrayList2.addAll(list);
            zzhfa.zzv(obj, j7, arrayList2);
            zzhclVar = arrayList2;
        } else if (list instanceof zzhev) {
            zzhcl zzhclVar2 = new zzhcl(list.size() + i9);
            zzhclVar2.addAll(zzhclVar2.size(), (zzhev) list);
            zzhfa.zzv(obj, j7, zzhclVar2);
            zzhclVar = zzhclVar2;
        } else {
            if ((list instanceof zzhdn) && (list instanceof zzhca)) {
                zzhca zzhcaVar = (zzhca) list;
                if (!zzhcaVar.zzc()) {
                    zzhca zzf = zzhcaVar.zzf(list.size() + i9);
                    zzhfa.zzv(obj, j7, zzf);
                    return zzf;
                }
                return list;
            }
            return list;
        }
        return zzhclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public final List zza(Object obj, long j7) {
        return zzf(obj, j7, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public final void zzb(Object obj, long j7) {
        Object unmodifiableList;
        List list = (List) zzhfa.zzh(obj, j7);
        if (list instanceof zzhcm) {
            unmodifiableList = ((zzhcm) list).zzd();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzhdn) && (list instanceof zzhca)) {
                zzhca zzhcaVar = (zzhca) list;
                if (zzhcaVar.zzc()) {
                    zzhcaVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzhfa.zzv(obj, j7, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public final void zzc(Object obj, Object obj2, long j7) {
        List list = (List) zzhfa.zzh(obj2, j7);
        List zzf = zzf(obj, j7, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzhfa.zzv(obj, j7, list);
    }

    public /* synthetic */ zzhco(zzhcn zzhcnVar) {
        super(null);
    }
}
