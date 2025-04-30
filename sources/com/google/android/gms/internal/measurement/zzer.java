package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzer extends zzdq.zza {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzdq zzdqVar, boolean z8) {
        super(zzdqVar);
        this.zzc = z8;
        this.zzd = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzd.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).setDataCollectionEnabled(this.zzc);
    }
}
