package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbbp implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzbbq zzb;

    public zzbbp(zzbbq zzbbqVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
        this.zzb = zzbbqVar;
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
