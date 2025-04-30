package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i9, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;

    void zzb(int i9, @NonNull Bundle bundle) throws RemoteException;

    void zzc(int i9, IBinder iBinder, zzk zzkVar) throws RemoteException;
}
