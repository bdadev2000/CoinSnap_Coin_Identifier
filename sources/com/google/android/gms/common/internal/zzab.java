package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i9, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzc(zza, bundle);
        zzC(1, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i9, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i9, IBinder iBinder, zzk zzkVar) throws RemoteException {
        throw null;
    }
}
