package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzhaw extends zzgxi {
    final zzhay zza;
    zzgxk zzb = zzb();
    final /* synthetic */ zzhba zzc;

    public zzhaw(zzhba zzhbaVar) {
        this.zzc = zzhbaVar;
        this.zza = new zzhay(zzhbaVar, null);
    }

    private final zzgxk zzb() {
        zzhay zzhayVar = this.zza;
        if (zzhayVar.hasNext()) {
            return zzhayVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final byte zza() {
        zzgxk zzgxkVar = this.zzb;
        if (zzgxkVar != null) {
            byte zza = zzgxkVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
