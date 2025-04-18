package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public abstract class zzbk extends zzayd implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzd();
                break;
            case 2:
                int readInt = parcel.readInt();
                zzaye.zzc(parcel);
                zze(readInt);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                zze zzeVar = (zze) zzaye.zza(parcel, zze.CREATOR);
                zzaye.zzc(parcel);
                zzf(zzeVar);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
