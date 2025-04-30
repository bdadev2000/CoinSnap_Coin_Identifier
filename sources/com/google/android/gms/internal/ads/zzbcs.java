package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbcs implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbcu zza;

    public zzbcs(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        Object obj2;
        zzbcx zzbcxVar;
        zzbcx zzbcxVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbcu zzbcuVar = this.zza;
                zzbcxVar = zzbcuVar.zzd;
                if (zzbcxVar != null) {
                    zzbcxVar2 = zzbcuVar.zzd;
                    zzbcuVar.zzf = zzbcxVar2.zzq();
                }
            } catch (DeadObjectException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e4);
                zzbcu.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
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
