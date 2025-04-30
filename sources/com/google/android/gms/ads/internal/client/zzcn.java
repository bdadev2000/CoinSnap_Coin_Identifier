package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzcn extends zzbae implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzda zzcyVar;
        switch (i9) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzbaf.zzc(parcel);
                zzq(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzbaf.zzc(parcel);
                zzr(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzg = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzp(zzg);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzbaf.zzc(parcel);
                zzn(asInterface, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzl(readString3, asInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                int i11 = zzbaf.zza;
                parcel2.writeInt(zzv ? 1 : 0);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzbaf.zzc(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbrf zzf2 = zzbre.zzf(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzo(zzf2);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbnu zzc = zzbnt.zzc(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzs(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg2);
                return true;
            case 14:
                zzff zzffVar = (zzff) zzbaf.zza(parcel, zzff.CREATOR);
                zzbaf.zzc(parcel);
                zzu(zzffVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface instanceof zzda) {
                        zzcyVar = (zzda) queryLocalInterface;
                    } else {
                        zzcyVar = new zzcy(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzm(zzcyVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zzg3 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzj(zzg3);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzbaf.zzc(parcel);
                zzt(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
