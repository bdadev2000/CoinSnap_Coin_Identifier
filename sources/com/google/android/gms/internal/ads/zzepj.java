package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzepj implements zzepr {
    final /* synthetic */ zzepk zza;

    public zzepj(zzepk zzepkVar) {
        this.zza = zzepkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdig zzdigVar;
        zzdig zzdigVar2 = (zzdig) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdigVar2;
            zzdigVar = this.zza.zzj;
            zzdigVar.zzj();
        }
    }
}
