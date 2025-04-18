package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbxf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzch extends zzaym implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzcf zzcdVar;
        switch (i2) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzfu.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcdVar = queryLocalInterface instanceof zzcf ? (zzcf) queryLocalInterface : new zzcd(readStrongBinder);
                }
                zzayn.zzc(parcel);
                zzi(createTypedArrayList, zzcdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzayn.zzc(parcel);
                boolean zzl = zzl(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzayn.zzc(parcel);
                zzbxf zzg = zzg(readString2);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzg);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzayn.zzc(parcel);
                boolean zzj = zzj(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzayn.zzc(parcel);
                zzbao zze = zze(readString4);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zze);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzayn.zzc(parcel);
                boolean zzk = zzk(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzayn.zzc(parcel);
                zzby zzf = zzf(readString6);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzf);
                return true;
            case 8:
                zzbpl zzf2 = zzbpk.zzf(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzh(zzf2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
