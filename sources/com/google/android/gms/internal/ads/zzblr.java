package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.v4.media.d;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzblr implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzblt zzb;

    public zzblr(zzblt zzbltVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
        this.zzb = zzbltVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzblg zzblgVar;
        try {
            zzcas zzcasVar = this.zza;
            zzblgVar = this.zzb.zza;
            zzcasVar.zzc(zzblgVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        this.zza.zzd(new RuntimeException(d.i("onConnectionSuspended: ", i2)));
    }
}
