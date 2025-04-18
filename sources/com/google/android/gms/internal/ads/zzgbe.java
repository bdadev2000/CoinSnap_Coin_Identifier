package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgbe extends zzfzo {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgbe(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzfwq.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }
}
