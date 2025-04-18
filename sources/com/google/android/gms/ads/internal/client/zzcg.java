package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxc;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcg extends zzayc implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbaf zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(5, zza);
        zzbaf zzb = zzbae.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(7, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzby) {
                zzbwVar = (zzby) queryLocalInterface;
            } else {
                zzbwVar = new zzbw(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbxc zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(3, zza);
        zzbxc zzq = zzbxb.zzq(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpg zzbpgVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbpgVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaye.zzf(zza, zzcfVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(4, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(6, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(2, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
