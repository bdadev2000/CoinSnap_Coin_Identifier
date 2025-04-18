package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfxv implements Iterator {
    final Iterator zza;
    Collection zzb;
    Iterator zzc;
    final /* synthetic */ zzfyh zzd;

    public zzfxv(zzfyh zzfyhVar) {
        Map map;
        this.zzd = zzfyhVar;
        map = zzfyhVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = zzfzw.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.zzc.remove();
        Collection collection = this.zzb;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfyh zzfyhVar = this.zzd;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 - 1;
    }
}
