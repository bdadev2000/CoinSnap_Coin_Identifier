package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdg extends zzdd {
    static final zzdd zza = new zzdg(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdg(Object[] objArr, int i9) {
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzcw.zza(i9, this.zzc, "index");
        Object obj = this.zzb[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdd, com.google.android.gms.internal.consent_sdk.zzda
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public final Object[] zze() {
        return this.zzb;
    }
}
