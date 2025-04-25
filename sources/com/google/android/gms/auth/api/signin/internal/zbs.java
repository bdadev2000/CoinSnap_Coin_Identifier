package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.Renderer;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: com.google.android.gms:play-services-auth@@20.5.0 */
/* loaded from: classes12.dex */
public final class zbs extends com.google.android.gms.internal.p002authapi.zba implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        com.google.android.gms.internal.p002authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p002authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(Renderer.MSG_SET_WAKEUP_LISTENER, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        com.google.android.gms.internal.p002authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p002authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        com.google.android.gms.internal.p002authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p002authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
