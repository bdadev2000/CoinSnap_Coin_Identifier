package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzfvp extends zzbae implements zzfvq {
    public zzfvp() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            Bundle bundle = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
            zzbaf.zzc(parcel);
            zzb(bundle);
            return true;
        }
        return false;
    }
}
