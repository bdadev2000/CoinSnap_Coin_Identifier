package com.google.android.gms.internal.maps;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzbo extends zzbi {
    static final zzbi zza = new zzbo(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbo(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzba.zza(i, this.zzc, "index");
        return Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbi, com.google.android.gms.internal.maps.zzbf
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.maps.zzbf
    public final int zzc() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.maps.zzbf
    public final Object[] zze() {
        return this.zzb;
    }
}
