package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbri extends zzayl implements zzbrk {
    public zzbri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final zzbrz zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        zzbrz zzbrzVar = (zzbrz) zzayn.zza(zzdb, zzbrz.CREATOR);
        zzdb.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final zzbrz zzg() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        zzbrz zzbrzVar = (zzbrz) zzayn.zza(zzdb, zzbrz.CREATOR);
        zzdb.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, zzbrn zzbrnVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzayn.zzd(zza, bundle);
        zzayn.zzd(zza, bundle2);
        zzayn.zzd(zza, zzsVar);
        zzayn.zzf(zza, zzbrnVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqv zzbqvVar, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbqvVar);
        zzayn.zzf(zza, zzbprVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpr zzbprVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbqyVar);
        zzayn.zzf(zza, zzbprVar);
        zzayn.zzd(zza, zzsVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpr zzbprVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbqyVar);
        zzayn.zzf(zza, zzbprVar);
        zzayn.zzd(zza, zzsVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbrbVar);
        zzayn.zzf(zza, zzbprVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbreVar);
        zzayn.zzf(zza, zzbprVar);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpr zzbprVar, zzbfr zzbfrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbreVar);
        zzayn.zzf(zza, zzbprVar);
        zzayn.zzd(zza, zzbfrVar);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbrhVar);
        zzayn.zzf(zza, zzbprVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbrhVar);
        zzayn.zzf(zza, zzbprVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(24, zza);
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(15, zza);
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
