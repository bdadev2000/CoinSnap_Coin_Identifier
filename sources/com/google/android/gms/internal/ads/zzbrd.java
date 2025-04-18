package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbrd extends zzayc implements zzbrf {
    public zzbrd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(zzdb, zzbru.CREATOR);
        zzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzg() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(zzdb, zzbru.CREATOR);
        zzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, zzbri zzbriVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaye.zzd(zza, bundle);
        zzaye.zzd(zza, bundle2);
        zzaye.zzd(zza, zzsVar);
        zzaye.zzf(zza, zzbriVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqq zzbqqVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbqqVar);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpm zzbpmVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbqtVar);
        zzaye.zzf(zza, zzbpmVar);
        zzaye.zzd(zza, zzsVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpm zzbpmVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbqtVar);
        zzaye.zzf(zza, zzbpmVar);
        zzaye.zzd(zza, zzsVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqw zzbqwVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbqwVar);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqz zzbqzVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbqzVar);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqz zzbqzVar, zzbpm zzbpmVar, zzbfn zzbfnVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbqzVar);
        zzaye.zzf(zza, zzbpmVar);
        zzaye.zzd(zza, zzbfnVar);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbrcVar);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzd(zza, zzmVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbrcVar);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(24, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(15, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
