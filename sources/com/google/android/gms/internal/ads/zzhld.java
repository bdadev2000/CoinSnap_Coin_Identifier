package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzhld implements zzhkp {
    private static final zzhkp zza = zzhkq.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    public /* synthetic */ zzhld(List list, List list2, zzhlb zzhlbVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzhlc zza(int i9, int i10) {
        return new zzhlc(i9, i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Collection collection = (Collection) ((zzhky) this.zzc.get(i9)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzhkm.zza(size);
        int size3 = this.zzb.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object zzb = ((zzhky) this.zzb.get(i10)).zzb();
            zzb.getClass();
            zza2.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            for (Object obj : (Collection) arrayList.get(i11)) {
                obj.getClass();
                zza2.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
