package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbxc extends zzbae implements zzbxd {
    public zzbxc() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbxn zzbxnVar = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 5) {
                        if (i9 != 6) {
                            if (i9 != 7) {
                                return false;
                            }
                            String readString = parcel.readString();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface instanceof zzbxn) {
                                    zzbxnVar = (zzbxn) queryLocalInterface;
                                } else {
                                    zzbxnVar = new zzbxl(readStrongBinder);
                                }
                            }
                            zzbaf.zzc(parcel);
                            zzh(readString, zzbxnVar);
                            parcel2.writeNoException();
                        } else {
                            zzbxu zzbxuVar = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface2 instanceof zzbxn) {
                                    zzbxnVar = (zzbxn) queryLocalInterface2;
                                } else {
                                    zzbxnVar = new zzbxl(readStrongBinder2);
                                }
                            }
                            zzbaf.zzc(parcel);
                            zze(zzbxuVar, zzbxnVar);
                            parcel2.writeNoException();
                        }
                    } else {
                        zzbxu zzbxuVar2 = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                            if (queryLocalInterface3 instanceof zzbxn) {
                                zzbxnVar = (zzbxn) queryLocalInterface3;
                            } else {
                                zzbxnVar = new zzbxl(readStrongBinder3);
                            }
                        }
                        zzbaf.zzc(parcel);
                        zzf(zzbxuVar2, zzbxnVar);
                        parcel2.writeNoException();
                    }
                } else {
                    zzbxu zzbxuVar3 = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                        if (queryLocalInterface4 instanceof zzbxn) {
                            zzbxnVar = (zzbxn) queryLocalInterface4;
                        } else {
                            zzbxnVar = new zzbxl(readStrongBinder4);
                        }
                    }
                    zzbaf.zzc(parcel);
                    zzg(zzbxuVar3, zzbxnVar);
                    parcel2.writeNoException();
                }
            } else {
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface5 instanceof zzbxe) {
                    }
                }
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
            }
        } else {
            zzbaf.zzc(parcel);
            parcel2.writeNoException();
            zzbaf.zze(parcel2, null);
        }
        return true;
    }
}
