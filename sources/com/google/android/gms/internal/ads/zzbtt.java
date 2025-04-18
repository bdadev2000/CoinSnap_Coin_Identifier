package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbtt extends zzayc implements zzbtv {
    public zzbtt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzdc(1, zza);
    }
}
