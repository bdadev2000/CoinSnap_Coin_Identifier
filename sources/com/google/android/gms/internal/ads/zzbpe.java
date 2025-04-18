package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbpe extends zzayc implements zzbpg {
    public zzbpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbpj zzb(String str) throws RemoteException {
        zzbpj zzbphVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbphVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzbpj) {
                zzbphVar = (zzbpj) queryLocalInterface;
            } else {
                zzbphVar = new zzbph(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbrf zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(3, zza);
        zzbrf zzb = zzbre.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(4, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(2, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
