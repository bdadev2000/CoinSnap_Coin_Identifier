package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbbg implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzbbh zzb;

    public zzbbg(zzbbh zzbbhVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbbhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
