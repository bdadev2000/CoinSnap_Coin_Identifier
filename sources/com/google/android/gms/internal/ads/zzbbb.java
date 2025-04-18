package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbbb implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbbc zza;

    public zzbbb(zzbbc zzbbcVar) {
        this.zza = zzbbcVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        zzbbf zzbbfVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                this.zza.zzf = null;
                zzbbc zzbbcVar = this.zza;
                zzbbfVar = zzbbcVar.zzd;
                if (zzbbfVar != null) {
                    zzbbcVar.zzd = null;
                }
                obj2 = this.zza.zzc;
                obj2.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
