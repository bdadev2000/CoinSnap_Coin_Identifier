package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzhgl implements zzhfx {
    private final List zza;
    private final List zzb;

    static {
        zzhfy.zza(Collections.emptySet());
    }

    public /* synthetic */ zzhgl(List list, List list2, zzhgj zzhgjVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhgk zza(int i10, int i11) {
        return new zzhgk(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zza.size();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzhgg) this.zzb.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza = zzhfu.zza(size);
        int size3 = this.zza.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object zzb = ((zzhgg) this.zza.get(i11)).zzb();
            zzb.getClass();
            zza.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                zza.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza);
    }
}
