package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public abstract class zzdi extends zzbae implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            String readString = parcel.readString();
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            zze(readString, asInterface, asInterface2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
