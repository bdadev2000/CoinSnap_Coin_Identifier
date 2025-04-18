package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class zzbzg extends zzayd implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbzh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof zzbzh) {
            return (zzbzh) queryLocalInterface;
        }
        return new zzbzf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbze zzbzeVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzl zzbzlVar = (zzbzl) zzaye.zza(parcel, zzbzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof zzbze) {
                        zzbzeVar = (zzbze) queryLocalInterface;
                    } else {
                        zzbzeVar = new zzbzc(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zzf(asInterface, zzbzlVar, zzbzeVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzk(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtv zzb = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzm(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtv zzb2 = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzl(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbue zzbueVar = (zzbue) zzaye.zza(parcel, zzbue.CREATOR);
                zzaye.zzc(parcel);
                zzg(zzbueVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtv zzb3 = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtv zzb4 = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                IObjectWrapper zze = zze(asInterface8, asInterface9, readString, asInterface10);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zze);
                return true;
            default:
                return false;
        }
    }
}
