package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzelx implements zzenh {
    final /* synthetic */ zzely zza;

    public zzelx(zzely zzelyVar) {
        this.zza = zzelyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpd zzcpdVar;
        zzcpd zzcpdVar2;
        zzcpd zzcpdVar3;
        zzcpd zzcpdVar4 = (zzcpd) obj;
        synchronized (this.zza) {
            zzely zzelyVar = this.zza;
            zzcpdVar = zzelyVar.zzi;
            if (zzcpdVar != null) {
                zzcpdVar3 = zzelyVar.zzi;
                zzcpdVar3.zzb();
            }
            this.zza.zzi = zzcpdVar4;
            zzcpdVar2 = this.zza.zzi;
            zzcpdVar2.zzk();
        }
    }
}
