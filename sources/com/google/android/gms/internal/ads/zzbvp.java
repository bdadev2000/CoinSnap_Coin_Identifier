package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface zzbvp extends IInterface {
    void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException;

    @Deprecated
    void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvx zzbvxVar) throws RemoteException;
}
