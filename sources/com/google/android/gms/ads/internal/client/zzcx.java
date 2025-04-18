package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcx extends zzayl implements zzcz {
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        ArrayList createTypedArrayList = zzdb.createTypedArrayList(zzblu.CREATOR);
        zzdb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdlVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpl zzbplVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbplVar);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzbmb zzbmbVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbmbVar);
        zzdc(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfw zzfwVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzfwVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
