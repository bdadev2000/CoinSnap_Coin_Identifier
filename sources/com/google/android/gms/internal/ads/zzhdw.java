package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzhdw implements Iterator {
    private final ArrayDeque zza;
    private zzgzx zzb;

    public /* synthetic */ zzhdw(zzhac zzhacVar, zzhdv zzhdvVar) {
        zzhac zzhacVar2;
        if (zzhacVar instanceof zzhdy) {
            zzhdy zzhdyVar = (zzhdy) zzhacVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzhdyVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhdyVar);
            zzhacVar2 = zzhdyVar.zzd;
            this.zzb = zzb(zzhacVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgzx) zzhacVar;
    }

    private final zzgzx zzb(zzhac zzhacVar) {
        while (zzhacVar instanceof zzhdy) {
            zzhdy zzhdyVar = (zzhdy) zzhacVar;
            this.zza.push(zzhdyVar);
            zzhacVar = zzhdyVar.zzd;
        }
        return (zzgzx) zzhacVar;
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
    public final zzgzx next() {
        zzgzx zzgzxVar;
        zzhac zzhacVar;
        zzgzx zzgzxVar2 = this.zzb;
        if (zzgzxVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgzxVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzhacVar = ((zzhdy) this.zza.pop()).zze;
            zzgzxVar = zzb(zzhacVar);
        } while (zzgzxVar.zzd() == 0);
        this.zzb = zzgzxVar;
        return zzgzxVar2;
    }
}
