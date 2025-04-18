package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbhh extends zzayl implements zzbhj {
    public zzbhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(zzbgw zzbgwVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbgwVar);
        zzdc(1, zza);
    }
}
