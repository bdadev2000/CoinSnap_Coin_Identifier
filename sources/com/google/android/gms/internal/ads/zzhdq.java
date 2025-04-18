package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhdq implements Iterator {
    final /* synthetic */ zzhdu zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhdq(zzhdu zzhduVar, zzhdp zzhdpVar) {
        this.zza = zzhduVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        Map map;
        int i3 = this.zzb + 1;
        zzhdu zzhduVar = this.zza;
        i2 = zzhduVar.zzb;
        if (i3 < i2) {
            return true;
        }
        map = zzhduVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i2;
        Object[] objArr;
        this.zzc = true;
        int i3 = this.zzb + 1;
        this.zzb = i3;
        zzhdu zzhduVar = this.zza;
        i2 = zzhduVar.zzb;
        if (i3 >= i2) {
            return (Map.Entry) zza().next();
        }
        objArr = zzhduVar.zza;
        return (zzhdo) objArr[i3];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i3 = this.zzb;
        zzhdu zzhduVar = this.zza;
        i2 = zzhduVar.zzb;
        if (i3 >= i2) {
            zza().remove();
        } else {
            this.zzb = i3 - 1;
            zzhduVar.zzm(i3);
        }
    }
}
