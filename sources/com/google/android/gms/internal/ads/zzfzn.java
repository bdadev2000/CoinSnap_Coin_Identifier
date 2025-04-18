package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfzn extends zzfzo {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfzo zzc;

    public zzfzn(zzfzo zzfzoVar, int i10, int i11) {
        this.zzc = zzfzoVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzfwq.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfzo, java.util.List
    /* renamed from: zzh */
    public final zzfzo subList(int i10, int i11) {
        zzfwq.zzj(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
