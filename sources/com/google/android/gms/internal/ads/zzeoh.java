package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeoh implements zzepr {
    final /* synthetic */ zzeoi zza;

    public zzeoh(zzeoi zzeoiVar) {
        this.zza = zzeoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsf zzcsfVar;
        zzcsf zzcsfVar2;
        zzcsf zzcsfVar3;
        zzcsf zzcsfVar4 = (zzcsf) obj;
        synchronized (this.zza) {
            try {
                zzeoi zzeoiVar = this.zza;
                zzcsfVar = zzeoiVar.zzi;
                if (zzcsfVar != null) {
                    zzcsfVar3 = zzeoiVar.zzi;
                    zzcsfVar3.zzb();
                }
                this.zza.zzi = zzcsfVar4;
                zzcsfVar2 = this.zza.zzi;
                zzcsfVar2.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
