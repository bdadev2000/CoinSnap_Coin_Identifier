package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface zzak extends IInterface {
    void zzb(int i2, String[] strArr) throws RemoteException;

    void zzc(int i2, String[] strArr) throws RemoteException;

    void zzd(int i2, PendingIntent pendingIntent) throws RemoteException;
}
