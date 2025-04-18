package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzhdd extends zzgzl {
    final zzhdh zza;
    zzgzn zzb = zzb();
    final /* synthetic */ zzhdj zzc;

    public zzhdd(zzhdj zzhdjVar) {
        this.zzc = zzhdjVar;
        this.zza = new zzhdh(zzhdjVar, null);
    }

    private final zzgzn zzb() {
        zzhdh zzhdhVar = this.zza;
        if (zzhdhVar.hasNext()) {
            return zzhdhVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final byte zza() {
        zzgzn zzgznVar = this.zzb;
        if (zzgznVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzgznVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
