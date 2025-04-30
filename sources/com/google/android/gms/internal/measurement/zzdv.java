package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdv extends zzdq.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdq zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzdq zzdqVar, Activity activity, String str, String str2) {
        super(zzdqVar);
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    public final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzf.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).setCurrentScreen(ObjectWrapper.wrap(this.zzc), this.zzd, this.zze, this.zza);
    }
}
