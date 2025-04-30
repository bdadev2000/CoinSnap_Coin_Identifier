package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzcbf extends zzbae implements zzcbg {
    public zzcbf() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcbg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof zzcbg) {
            return (zzcbg) queryLocalInterface;
        }
        return new zzcbe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzcbd zzcbdVar = null;
        switch (i9) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcbk zzcbkVar = (zzcbk) zzbaf.zza(parcel, zzcbk.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof zzcbd) {
                        zzcbdVar = (zzcbd) queryLocalInterface;
                    } else {
                        zzcbdVar = new zzcbb(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzf(asInterface, zzcbkVar, zzcbdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzk(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzb = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzm(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzb2 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzl(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwe zzbweVar = (zzbwe) zzbaf.zza(parcel, zzbwe.CREATOR);
                zzbaf.zzc(parcel);
                zzg(zzbweVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzj(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzb3 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzi(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzb4 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzh(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                IObjectWrapper zze = zze(asInterface8, asInterface9, readString, asInterface10);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zze);
                return true;
            default:
                return false;
        }
    }
}
