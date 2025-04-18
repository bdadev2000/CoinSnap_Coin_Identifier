package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes4.dex */
public final class zzdvt implements zzdvd {
    private final long zza;
    private final zzdvi zzb;
    private final zzffy zzc;

    public zzdvt(long j2, Context context, zzdvi zzdviVar, zzcho zzchoVar, String str) {
        this.zza = j2;
        this.zzb = zzdviVar;
        zzfga zzw = zzchoVar.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzf(zzmVar, new zzdvr(this));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdvs(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
