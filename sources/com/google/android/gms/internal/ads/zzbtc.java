package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbtc extends zzbad implements zzbte {
    public zzbtc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final zzbtt zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(zzdb, zzbtt.CREATOR);
        zzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final zzbtt zzg() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(zzdb, zzbtt.CREATOR);
        zzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbth zzbthVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbaf.zzd(zza, bundle);
        zzbaf.zzd(zza, bundle2);
        zzbaf.zzd(zza, zzqVar);
        zzbaf.zzf(zza, zzbthVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsp zzbspVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbspVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbss zzbssVar, zzbrl zzbrlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbssVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzbaf.zzd(zza, zzqVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbss zzbssVar, zzbrl zzbrlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbssVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzbaf.zzd(zza, zzqVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbsvVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsy zzbsyVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbsyVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsy zzbsyVar, zzbrl zzbrlVar, zzbhk zzbhkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbsyVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzbaf.zzd(zza, zzbhkVar);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbtb zzbtbVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbtbVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbtb zzbtbVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbtbVar);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(24, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(15, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
