package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdws implements zzdwc {
    private final long zza;
    private final zzdwh zzb;
    private final zzfgk zzc;

    public zzdws(long j7, Context context, zzdwh zzdwhVar, zzcjd zzcjdVar, String str) {
        this.zza = j7;
        this.zzb = zzdwhVar;
        zzfgm zzw = zzcjdVar.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdwq(this));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdwr(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }
}
