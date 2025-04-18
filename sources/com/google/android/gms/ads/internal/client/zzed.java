package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes3.dex */
public abstract class zzed extends zzaym implements zzee {
    public zzed() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzi();
        } else if (i2 == 2) {
            zzh();
        } else if (i2 == 3) {
            zzg();
        } else if (i2 == 4) {
            zze();
        } else {
            if (i2 != 5) {
                return false;
            }
            boolean zzg = zzayn.zzg(parcel);
            zzayn.zzc(parcel);
            zzf(zzg);
        }
        parcel2.writeNoException();
        return true;
    }
}
