package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzlo implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzlm zzc;

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zze;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i9 = this.zza;
        if (i9 > 0) {
            list = this.zzc.zza;
            if (i9 <= list.size()) {
                return true;
            }
        }
        if (zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!zza().hasNext()) {
            list = this.zzc.zza;
            int i9 = this.zza - 1;
            this.zza = i9;
            return (Map.Entry) list.get(i9);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzlo(zzlm zzlmVar) {
        List list;
        this.zzc = zzlmVar;
        list = zzlmVar.zza;
        this.zza = list.size();
    }
}
