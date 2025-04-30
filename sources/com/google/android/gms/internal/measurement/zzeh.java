package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeh extends zzdq.zza {
    private final /* synthetic */ zzdc zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzdq zzdqVar, zzdc zzdcVar) {
        super(zzdqVar);
        this.zzc = zzdcVar;
        this.zzd = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzd.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).getCurrentScreenName(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
