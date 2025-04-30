package com.google.ar.core.dependencies;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends c implements h {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    @Override // com.google.ar.core.dependencies.h
    public final void d(String str, List list, Bundle bundle, j jVar) throws RemoteException {
        Parcel a6 = a();
        a6.writeString(str);
        a6.writeTypedList(list);
        e.b(a6, bundle);
        e.c(a6, jVar);
        c(1, a6);
    }

    @Override // com.google.ar.core.dependencies.h
    public final void e(String str, Bundle bundle, j jVar) throws RemoteException {
        Parcel a6 = a();
        a6.writeString(str);
        e.b(a6, bundle);
        e.c(a6, jVar);
        c(2, a6);
    }
}
