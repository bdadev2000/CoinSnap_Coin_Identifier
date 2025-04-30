package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzi extends zzw implements zzj {
    public zzi() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    public final boolean zzb(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            Bundle bundle = (Bundle) zzx.zza(parcel, Bundle.CREATOR);
            zzx.zzb(parcel);
            zza(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
