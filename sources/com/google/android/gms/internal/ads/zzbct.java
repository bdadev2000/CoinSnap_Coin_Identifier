package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbct implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbcu zza;

    public zzbct(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        zzbcx zzbcxVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                this.zza.zzf = null;
                zzbcu zzbcuVar = this.zza;
                zzbcxVar = zzbcuVar.zzd;
                if (zzbcxVar != null) {
                    zzbcuVar.zzd = null;
                }
                obj2 = this.zza.zzc;
                obj2.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
