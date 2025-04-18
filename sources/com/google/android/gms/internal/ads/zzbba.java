package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbba implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbbc zza;

    public zzbba(zzbbc zzbbcVar) {
        this.zza = zzbbcVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        Object obj2;
        zzbbf zzbbfVar;
        zzbbf zzbbfVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbbc zzbbcVar = this.zza;
                zzbbfVar = zzbbcVar.zzd;
                if (zzbbfVar != null) {
                    zzbbfVar2 = zzbbcVar.zzd;
                    zzbbcVar.zzf = zzbbfVar2.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                zzbbc.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
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
