package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzhbg implements Iterator {
    final /* synthetic */ zzhbj zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhbg(zzhbj zzhbjVar, zzhbi zzhbiVar) {
        this.zza = zzhbjVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzhbj.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzhbj zzhbjVar = this.zza;
        if (i10 >= zzhbj.zzb(zzhbjVar)) {
            return !zzhbj.zzh(zzhbjVar).isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzhbj zzhbjVar = this.zza;
        if (i10 < zzhbj.zzb(zzhbjVar)) {
            return (zzhbf) zzhbj.zzk(zzhbjVar)[i10];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzhbj.zzi(this.zza);
            int i10 = this.zzb;
            zzhbj zzhbjVar = this.zza;
            if (i10 < zzhbj.zzb(zzhbjVar)) {
                this.zzb = i10 - 1;
                zzhbj.zze(zzhbjVar, i10);
                return;
            } else {
                zza().remove();
                return;
            }
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
