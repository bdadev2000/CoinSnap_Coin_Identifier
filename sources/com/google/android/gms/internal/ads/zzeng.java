package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeng implements zzeoq {
    final /* synthetic */ zzenh zza;

    public zzeng(zzenh zzenhVar) {
        this.zza = zzenhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqr zzcqrVar;
        zzcqr zzcqrVar2;
        zzcqr zzcqrVar3;
        zzcqr zzcqrVar4 = (zzcqr) obj;
        synchronized (this.zza) {
            try {
                zzenh zzenhVar = this.zza;
                zzcqrVar = zzenhVar.zzi;
                if (zzcqrVar != null) {
                    zzcqrVar3 = zzenhVar.zzi;
                    zzcqrVar3.zzb();
                }
                this.zza.zzi = zzcqrVar4;
                zzcqrVar2 = this.zza.zzi;
                zzcqrVar2.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
