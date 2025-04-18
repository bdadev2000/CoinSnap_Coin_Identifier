package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public abstract class zzbp extends zzayd implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzaye.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzaye.zzc(parcel);
                boolean zzg = zzg(asInterface, zzaVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzg ? 1 : 0);
            } else {
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zze(asInterface2);
                parcel2.writeNoException();
            }
        } else {
            IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaye.zzc(parcel);
            boolean zzf = zzf(asInterface3, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
