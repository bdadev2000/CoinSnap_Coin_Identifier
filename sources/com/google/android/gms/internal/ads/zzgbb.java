package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgbb extends zzgbc {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgbc zzc;

    public zzgbb(zzgbc zzgbcVar, int i9, int i10) {
        this.zzc = zzgbcVar;
        this.zza = i9;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzfyg.zza(i9, this.zzb, "index");
        return this.zzc.get(i9 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, java.util.List
    /* renamed from: zzh */
    public final zzgbc subList(int i9, int i10) {
        zzfyg.zzi(i9, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i9 + i11, i10 + i11);
    }
}
