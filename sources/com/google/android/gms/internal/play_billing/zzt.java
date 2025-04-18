package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzt extends zzw implements zzu {
    public zzt() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    public final boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) zzx.zza(parcel, Bundle.CREATOR);
            zzx.zzb(parcel);
            zza(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
