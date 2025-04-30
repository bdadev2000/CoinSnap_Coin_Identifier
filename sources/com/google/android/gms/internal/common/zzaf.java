package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaf extends zzag {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzag zzc;

    public zzaf(zzag zzagVar, int i9, int i10) {
        this.zzc = zzagVar;
        this.zza = i9;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzs.zza(i9, this.zzb, "index");
        return this.zzc.get(i9 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzag subList(int i9, int i10) {
        zzs.zzc(i9, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i9 + i11, i10 + i11);
    }
}
