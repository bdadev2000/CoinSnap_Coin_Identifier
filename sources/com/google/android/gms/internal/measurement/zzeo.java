package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeo extends zzdq.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdc zzd;
    private final /* synthetic */ zzdq zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzdq zzdqVar, Bundle bundle, zzdc zzdcVar) {
        super(zzdqVar);
        this.zzc = bundle;
        this.zzd = zzdcVar;
        this.zze = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zze.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).performAction(this.zzc, this.zzd, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
