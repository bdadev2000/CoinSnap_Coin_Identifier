package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzhay implements Iterator {
    private final ArrayDeque zza;
    private zzgxl zzb;

    public /* synthetic */ zzhay(zzgxp zzgxpVar, zzhaz zzhazVar) {
        zzgxp zzgxpVar2;
        if (zzgxpVar instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) zzgxpVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzhbaVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhbaVar);
            zzgxpVar2 = zzhbaVar.zzd;
            this.zzb = zzb(zzgxpVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgxl) zzgxpVar;
    }

    private final zzgxl zzb(zzgxp zzgxpVar) {
        while (zzgxpVar instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) zzgxpVar;
            this.zza.push(zzhbaVar);
            zzgxpVar = zzhbaVar.zzd;
        }
        return (zzgxl) zzgxpVar;
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
    public final zzgxl next() {
        zzgxl zzgxlVar;
        zzgxp zzgxpVar;
        zzgxl zzgxlVar2 = this.zzb;
        if (zzgxlVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgxlVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgxpVar = ((zzhba) this.zza.pop()).zze;
            zzgxlVar = zzb(zzgxpVar);
        } while (zzgxlVar.zzd() == 0);
        this.zzb = zzgxlVar;
        return zzgxlVar2;
    }
}
