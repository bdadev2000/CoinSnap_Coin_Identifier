package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;

/* loaded from: classes3.dex */
public abstract class zzbh extends zzayd implements zzbi {
    public zzbh() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
