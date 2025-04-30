package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdy extends zzdq.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(zzdq zzdqVar, Boolean bool) {
        super(zzdqVar);
        this.zzc = bool;
        this.zzd = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdb zzdbVar2;
        if (this.zzc != null) {
            zzdbVar2 = this.zzd.zzj;
            ((zzdb) Preconditions.checkNotNull(zzdbVar2)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzdbVar = this.zzd.zzj;
            ((zzdb) Preconditions.checkNotNull(zzdbVar)).clearMeasurementEnabled(this.zza);
        }
    }
}
