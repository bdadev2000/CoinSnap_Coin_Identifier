package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbxc;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class zzch extends zzayd implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzcf zzcdVar;
        switch (i10) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    if (queryLocalInterface instanceof zzcf) {
                        zzcdVar = (zzcf) queryLocalInterface;
                    } else {
                        zzcdVar = new zzcd(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zzi(createTypedArrayList, zzcdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzaye.zzc(parcel);
                boolean zzl = zzl(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzaye.zzc(parcel);
                zzbxc zzg = zzg(readString2);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzg);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzaye.zzc(parcel);
                boolean zzj = zzj(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzaye.zzc(parcel);
                zzbaf zze = zze(readString4);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zze);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaye.zzc(parcel);
                boolean zzk = zzk(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzaye.zzc(parcel);
                zzby zzf = zzf(readString6);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzf);
                return true;
            case 8:
                zzbpg zzf2 = zzbpf.zzf(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(zzf2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
