package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbas implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbat zza;

    public zzbas(zzbat zzbatVar) {
        this.zza = zzbatVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        zzbaw zzbawVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzbat zzbatVar = this.zza;
            zzbawVar = zzbatVar.zzd;
            if (zzbawVar != null) {
                zzbatVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
