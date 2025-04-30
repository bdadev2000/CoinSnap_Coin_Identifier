package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgcs extends zzgbc {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgcs(Object[] objArr, int i9, int i10) {
        this.zza = objArr;
        this.zzb = i9;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzfyg.zza(i9, this.zzc, "index");
        Object obj = this.zza[i9 + i9 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return true;
    }
}
