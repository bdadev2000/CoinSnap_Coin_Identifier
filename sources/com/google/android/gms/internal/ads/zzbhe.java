package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbhe extends zzayl implements zzbhg {
    public zzbhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zze(zzbgw zzbgwVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbgwVar);
        zza.writeString(str);
        zzdc(1, zza);
    }
}
