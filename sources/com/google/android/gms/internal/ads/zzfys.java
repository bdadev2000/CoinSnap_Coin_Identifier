package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzfys implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfyx zze;

    public /* synthetic */ zzfys(zzfyx zzfyxVar, zzfyw zzfywVar) {
        int i10;
        this.zze = zzfyxVar;
        i10 = zzfyxVar.zzf;
        this.zzb = i10;
        this.zzc = zzfyxVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i10;
        i10 = this.zze.zzf;
        if (i10 != this.zzb) {
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
        if (hasNext()) {
            int i10 = this.zzc;
            this.zzd = i10;
            Object zza = zza(i10);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        zzb();
        if (this.zzd >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzl(z10, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzfyx zzfyxVar = this.zze;
        zzfyxVar.remove(zzfyx.zzg(zzfyxVar, i10));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
