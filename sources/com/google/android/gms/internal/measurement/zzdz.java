package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* loaded from: classes2.dex */
final class zzdz extends zzdq.zza {
    private final /* synthetic */ zzdq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzdq zzdqVar) {
        super(zzdqVar);
        this.zzc = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzc.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).resetAnalyticsData(this.zza);
    }
}
