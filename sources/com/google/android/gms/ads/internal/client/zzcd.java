package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbg;

/* loaded from: classes2.dex */
public abstract class zzcd extends zzbae implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i9) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbrf zzf = zzbre.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbrf zzf2 = zzbre.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbrf zzf3 = zzbre.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbq zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbhz zzi = zzi(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzf4 = zzbre.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbyk zzn = zzn(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbvg zzm = zzm(asInterface7);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzco zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzf5 = zzf(asInterface9, zzqVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbif zzj = zzj(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbrf zzf6 = zzbre.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbza zzo = zzo(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzo);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbrf zzf7 = zzbre.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzc = zzc(asInterface14, zzqVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzf8 = zzbre.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzcbg zzp = zzp(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzf9 = zzbre.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbuz zzl = zzl(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzf10 = zzbre.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbmo zzc2 = zzbmn.zzc(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbmr zzk = zzk(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzf11 = zzbre.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzdj zzh = zzh(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
