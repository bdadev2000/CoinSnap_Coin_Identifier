package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbzl;

/* loaded from: classes.dex */
public abstract class zzco extends zzaym implements zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar = (zzs) zzayn.zza(parcel, zzs.CREATOR);
                String readString = parcel.readString();
                zzbpl zzf = zzbpk.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzayn.zzc(parcel);
                zzby zzd = zzd(asInterface, zzsVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) zzayn.zza(parcel, zzs.CREATOR);
                String readString2 = parcel.readString();
                zzbpl zzf2 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzayn.zzc(parcel);
                zzby zze = zze(asInterface2, zzsVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbpl zzf3 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzayn.zzc(parcel);
                zzbu zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzbgg zzj = zzj(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzj);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpl zzf4 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzayn.zzc(parcel);
                zzbwp zzo = zzo(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzo);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzbtm zzn = zzn(asInterface7);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzn);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzayn.zzc(parcel);
                zzcz zzh = zzh(asInterface8, readInt5);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzh);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) zzayn.zza(parcel, zzs.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzayn.zzc(parcel);
                zzby zzf5 = zzf(asInterface9, zzsVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzbgm zzk = zzk(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzk);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbpl zzf6 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzayn.zzc(parcel);
                zzbxf zzp = zzp(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzp);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar4 = (zzs) zzayn.zza(parcel, zzs.CREATOR);
                String readString6 = parcel.readString();
                zzbpl zzf7 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzayn.zzc(parcel);
                zzby zzc = zzc(asInterface14, zzsVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpl zzf8 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzayn.zzc(parcel);
                zzbzl zzq = zzq(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzq);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpl zzf9 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzayn.zzc(parcel);
                zzbtf zzm = zzm(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzm);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpl zzf10 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbkv zzc2 = zzbku.zzc(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzbky zzl = zzl(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzl);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpl zzf11 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzayn.zzc(parcel);
                zzdu zzi = zzi(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzi);
                return true;
            case 18:
                IObjectWrapper asInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpl zzf12 = zzbpk.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzayn.zzc(parcel);
                zzci zzg = zzg(asInterface19, zzf12, readInt13);
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzg);
                return true;
            default:
                return false;
        }
    }
}
