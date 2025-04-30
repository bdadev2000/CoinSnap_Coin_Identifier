package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdq;

/* loaded from: classes2.dex */
final class zzfe extends zzdq.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdc zzd;
    private final /* synthetic */ zzdq.zzd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(zzdq.zzd zzdVar, Activity activity, zzdc zzdcVar) {
        super(zzdq.this);
        this.zzc = activity;
        this.zzd = zzdcVar;
        this.zze = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = zzdq.this.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}
