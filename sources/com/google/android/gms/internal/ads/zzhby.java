package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhby extends AbstractList {
    private final List zza;
    private final zzhbx zzb;

    public zzhby(List list, zzhbx zzhbxVar) {
        this.zza = list;
        this.zzb = zzhbxVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return this.zzb.zzb(this.zza.get(i9));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
