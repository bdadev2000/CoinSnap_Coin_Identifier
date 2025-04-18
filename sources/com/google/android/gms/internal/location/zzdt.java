package com.google.android.gms.internal.location;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdt extends zzds {
    static final zzds zza = new zzdt(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdt(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzdm.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzds, com.google.android.gms.internal.location.zzdp
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final Object[] zzg() {
        return this.zzb;
    }
}
