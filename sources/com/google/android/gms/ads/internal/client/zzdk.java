package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes.dex */
public abstract class zzdk extends zzaym implements zzdl {
    public zzdk() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        zze zzeVar = (zze) zzayn.zza(parcel, zze.CREATOR);
        zzayn.zzc(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
