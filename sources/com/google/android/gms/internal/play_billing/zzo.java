package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzo extends zzw implements zzp {
    public zzo() {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    public final boolean zzb(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            Bundle bundle = (Bundle) zzx.zza(parcel, Bundle.CREATOR);
            zzx.zzb(parcel);
            zza(bundle);
            return true;
        }
        return false;
    }
}
