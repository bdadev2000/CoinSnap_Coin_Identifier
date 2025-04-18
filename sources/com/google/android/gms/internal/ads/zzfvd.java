package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzfvd extends zzaym implements zzfve {
    public zzfvd() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzayn.zza(parcel, Bundle.CREATOR);
        zzayn.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
