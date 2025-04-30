package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgco extends zzgbc {
    static final zzgbc zza = new zzgco(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzgco(Object[] objArr, int i9) {
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzfyg.zza(i9, this.zzc, "index");
        Object obj = this.zzb[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgax
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, i9, this.zzc);
        return i9 + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final Object[] zzg() {
        return this.zzb;
    }
}
