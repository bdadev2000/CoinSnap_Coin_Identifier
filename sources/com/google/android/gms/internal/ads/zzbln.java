package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbln implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcao zza;

    public zzbln(zzblo zzbloVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
