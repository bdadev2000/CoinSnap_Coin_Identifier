package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper zae(IObjectWrapper iObjectWrapper, zax zaxVar) throws RemoteException {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(zaa, zaxVar);
        return L.e(zab(2, zaa));
    }
}
