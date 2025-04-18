package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzftv extends zzayd implements zzftw {
    public zzftv() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) zzaye.zza(parcel, Bundle.CREATOR);
            zzaye.zzc(parcel);
            zzb(bundle);
            return true;
        }
        return false;
    }
}
