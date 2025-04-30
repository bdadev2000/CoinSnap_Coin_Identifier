package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzee extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdq zzdqVar, String str) {
        super(zzdqVar);
        this.zzc = str;
        this.zzd = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzd.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).beginAdUnitExposure(this.zzc, this.zzb);
    }
}
