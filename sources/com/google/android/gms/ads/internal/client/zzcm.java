package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcm extends zzbad implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        ArrayList createTypedArrayList = zzdb.createTypedArrayList(zzbnn.CREATOR);
        zzdb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzdaVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbrf zzbrfVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbrfVar);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f9) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f9);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbnu zzbnuVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbnuVar);
        zzdc(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzffVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
