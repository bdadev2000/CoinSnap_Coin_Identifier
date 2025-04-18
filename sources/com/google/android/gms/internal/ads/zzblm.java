package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import eb.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzblm implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzblo zzb;

    public zzblm(zzblo zzbloVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbloVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzblb zzblbVar;
        try {
            zzcao zzcaoVar = this.zza;
            zzblbVar = this.zzb.zza;
            zzcaoVar.zzc(zzblbVar.zzp());
        } catch (DeadObjectException e2) {
            this.zza.zzd(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.zza.zzd(new RuntimeException(j.i("onConnectionSuspended: ", i10)));
    }
}
