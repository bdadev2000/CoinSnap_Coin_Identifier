package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbpg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcx extends zzayc implements zzcz {
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
        ArrayList createTypedArrayList = zzdb.createTypedArrayList(zzblp.CREATOR);
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
    public final void zzj(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaye.zza;
        zza.writeInt(z10 ? 1 : 0);
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
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzdlVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpg zzbpgVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbpgVar);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaye.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblw zzblwVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzblwVar);
        zzdc(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzfvVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
