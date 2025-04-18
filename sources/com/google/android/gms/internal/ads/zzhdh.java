package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzhdh implements Iterator {
    private final ArrayDeque zza;
    private zzgzp zzb;

    public /* synthetic */ zzhdh(zzgzs zzgzsVar, zzhdg zzhdgVar) {
        zzgzs zzgzsVar2;
        if (!(zzgzsVar instanceof zzhdj)) {
            this.zza = null;
            this.zzb = (zzgzp) zzgzsVar;
            return;
        }
        zzhdj zzhdjVar = (zzhdj) zzgzsVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhdjVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhdjVar);
        zzgzsVar2 = zzhdjVar.zzd;
        this.zzb = zzb(zzgzsVar2);
    }

    private final zzgzp zzb(zzgzs zzgzsVar) {
        while (zzgzsVar instanceof zzhdj) {
            zzhdj zzhdjVar = (zzhdj) zzgzsVar;
            this.zza.push(zzhdjVar);
            zzgzsVar = zzhdjVar.zzd;
        }
        return (zzgzp) zzgzsVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgzp next() {
        zzgzp zzgzpVar;
        zzgzs zzgzsVar;
        zzgzp zzgzpVar2 = this.zzb;
        if (zzgzpVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgzpVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgzsVar = ((zzhdj) this.zza.pop()).zze;
            zzgzpVar = zzb(zzgzsVar);
        } while (zzgzpVar.zzd() == 0);
        this.zzb = zzgzpVar;
        return zzgzpVar2;
    }
}
