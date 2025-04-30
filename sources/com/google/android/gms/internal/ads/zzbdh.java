package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbdh implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbdi zzb;

    public zzbdh(zzbdi zzbdiVar, zzccn zzccnVar) {
        this.zza = zzccnVar;
        this.zzb = zzbdiVar;
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
