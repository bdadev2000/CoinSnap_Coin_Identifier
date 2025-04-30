package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            int readInt = parcel.readInt();
            com.google.android.gms.internal.base.zac.zab(parcel);
            zab(readInt);
            return true;
        }
        return false;
    }
}
