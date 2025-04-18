package com.google.android.gms.internal.location;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdr extends zzds {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzds zzc;

    public zzdr(zzds zzdsVar, int i10, int i11) {
        this.zzc = zzdsVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzdm.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzds, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzds subList(int i10, int i11) {
        zzdm.zzc(i10, i11, this.zzb);
        zzds zzdsVar = this.zzc;
        int i12 = this.zza;
        return zzdsVar.subList(i10 + i12, i11 + i12);
    }
}
