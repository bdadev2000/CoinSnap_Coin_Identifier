package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzhiw implements zzhii {
    private final List zza;
    private final List zzb;

    static {
        zzhij.zza(Collections.emptySet());
    }

    public /* synthetic */ zzhiw(List list, List list2, zzhiu zzhiuVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhiv zza(int i2, int i3) {
        return new zzhiv(i2, i3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zza.size();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((zzhir) this.zzb.get(i2)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza = zzhif.zza(size);
        int size3 = this.zza.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object zzb = ((zzhir) this.zza.get(i3)).zzb();
            zzb.getClass();
            zza.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                obj.getClass();
                zza.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza);
    }
}
