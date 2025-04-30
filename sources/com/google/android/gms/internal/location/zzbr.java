package com.google.android.gms.internal.location;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    public zzbr(zzbs zzbsVar, int i9, int i10) {
        this.zzc = zzbsVar;
        this.zza = i9;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzbm.zza(i9, this.zzb, "index");
        return this.zzc.get(i9 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbs subList(int i9, int i10) {
        zzbm.zzc(i9, i10, this.zzb);
        zzbs zzbsVar = this.zzc;
        int i11 = this.zza;
        return zzbsVar.subList(i9 + i11, i10 + i11);
    }
}
