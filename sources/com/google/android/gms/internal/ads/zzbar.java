package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbar implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbat zza;

    public zzbar(zzbat zzbatVar) {
        this.zza = zzbatVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        Object obj2;
        zzbaw zzbawVar;
        zzbaw zzbawVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbat zzbatVar = this.zza;
                zzbawVar = zzbatVar.zzd;
                if (zzbawVar != null) {
                    zzbawVar2 = zzbatVar.zzd;
                    zzbatVar.zzf = zzbawVar2.zzq();
                }
            } catch (DeadObjectException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e2);
                zzbat.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
