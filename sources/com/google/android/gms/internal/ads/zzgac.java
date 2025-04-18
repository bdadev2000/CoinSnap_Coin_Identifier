package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
abstract class zzgac implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgag zze;

    public /* synthetic */ zzgac(zzgag zzgagVar, zzgab zzgabVar) {
        int i2;
        this.zze = zzgagVar;
        i2 = zzgagVar.zzf;
        this.zzb = i2;
        this.zzc = zzgagVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i2;
        i2 = this.zze.zzf;
        if (i2 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.zzc;
        this.zzd = i2;
        Object zza = zza(i2);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfxz.zzk(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i2 = this.zzd;
        zzgag zzgagVar = this.zze;
        zzgagVar.remove(zzgag.zzg(zzgagVar, i2));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i2);
}
