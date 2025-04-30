package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbnm zzb;

    public zzbnk(zzbnm zzbnmVar, zzccn zzccnVar) {
        this.zza = zzccnVar;
        this.zzb = zzbnmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbmz zzbmzVar;
        try {
            zzccn zzccnVar = this.zza;
            zzbmzVar = this.zzb.zza;
            zzccnVar.zzc(zzbmzVar.zzp());
        } catch (DeadObjectException e4) {
            this.zza.zzd(e4);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
        this.zza.zzd(new RuntimeException(o.h(i9, "onConnectionSuspended: ")));
    }
}
