package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* loaded from: classes2.dex */
final class zzep extends zzdq.zza {
    private final /* synthetic */ zzdc zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzdq zzdqVar, zzdc zzdcVar) {
        super(zzdqVar);
        this.zzc = zzdcVar;
        this.zzd = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzd.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).getSessionId(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
