package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbwt extends zzayd implements zzbwu {
    public zzbwt() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbwu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzbwu) {
            return (zzbwu) queryLocalInterface;
        }
        return new zzbws(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzl(asInterface);
                break;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaye.zzc(parcel);
                zzk(asInterface2, readInt);
                break;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(asInterface3);
                break;
            case 4:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(asInterface4);
                break;
            case 5:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzo(asInterface5);
                break;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzf(asInterface6);
                break;
            case 7:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbwv zzbwvVar = (zzbwv) zzaye.zza(parcel, zzbwv.CREATOR);
                zzaye.zzc(parcel);
                zzm(asInterface7, zzbwvVar);
                break;
            case 8:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zze(asInterface8);
                break;
            case 9:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaye.zzc(parcel);
                zzg(asInterface9, readInt2);
                break;
            case 10:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(asInterface10);
                break;
            case 11:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzn(asInterface11);
                break;
            case 12:
                zzaye.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
