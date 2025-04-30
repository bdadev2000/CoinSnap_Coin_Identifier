package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzgah implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgal zze;

    public /* synthetic */ zzgah(zzgal zzgalVar, zzgag zzgagVar) {
        int i9;
        this.zze = zzgalVar;
        i9 = zzgalVar.zzf;
        this.zzb = i9;
        this.zzc = zzgalVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i9;
        i9 = this.zze.zzf;
        if (i9 == this.zzb) {
        } else {
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
            int i9 = this.zzc;
            this.zzd = i9;
            Object zza = zza(i9);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z8;
        zzb();
        if (this.zzd >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzk(z8, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i9 = this.zzd;
        zzgal zzgalVar = this.zze;
        zzgalVar.remove(zzgal.zzg(zzgalVar, i9));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i9);
}
