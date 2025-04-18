package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzfm extends zzfq {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzfm(zzfl zzflVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfq
    public final void zza(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzhn.zzf(obj, j2);
        if (list instanceof zzfk) {
            unmodifiableList = ((zzfk) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgj) && (list instanceof zzfc)) {
                zzfc zzfcVar = (zzfc) list;
                if (zzfcVar.zzc()) {
                    zzfcVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhn.zzs(obj, j2, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzfq
    public final void zzb(Object obj, Object obj2, long j2) {
        zzfj zzfjVar;
        List list = (List) zzhn.zzf(obj2, j2);
        int size = list.size();
        List list2 = (List) zzhn.zzf(obj, j2);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzfk ? new zzfj(size) : ((list2 instanceof zzgj) && (list2 instanceof zzfc)) ? ((zzfc) list2).zzd(size) : new ArrayList(size);
            zzhn.zzs(obj, j2, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzhn.zzs(obj, j2, arrayList);
                zzfjVar = arrayList;
            } else if (list2 instanceof zzhi) {
                zzfj zzfjVar2 = new zzfj(list2.size() + size);
                zzfjVar2.addAll(zzfjVar2.size(), (zzhi) list2);
                zzhn.zzs(obj, j2, zzfjVar2);
                zzfjVar = zzfjVar2;
            } else if ((list2 instanceof zzgj) && (list2 instanceof zzfc)) {
                zzfc zzfcVar = (zzfc) list2;
                if (!zzfcVar.zzc()) {
                    list2 = zzfcVar.zzd(list2.size() + size);
                    zzhn.zzs(obj, j2, list2);
                }
            }
            list2 = zzfjVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzhn.zzs(obj, j2, list);
    }

    private zzfm() {
        super(null);
    }
}
