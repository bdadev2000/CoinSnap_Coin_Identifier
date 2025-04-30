package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbrg extends zzbad implements zzbri {
    public zzbrg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzG(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final boolean zzM() throws RemoteException {
        Parcel zzdb = zzdb(22, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final boolean zzN() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbrq zzO() throws RemoteException {
        zzbrq zzbrqVar;
        Parcel zzdb = zzdb(15, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzbrq) {
                zzbrqVar = (zzbrq) queryLocalInterface;
            } else {
                zzbrqVar = new zzbrq(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbrr zzP() throws RemoteException {
        zzbrr zzbrrVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbrr) {
                zzbrrVar = (zzbrr) queryLocalInterface;
            } else {
                zzbrrVar = new zzbrr(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbip zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbro zzj() throws RemoteException {
        zzbro zzbrmVar;
        Parcel zzdb = zzdb(36, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzbro) {
                zzbrmVar = (zzbro) queryLocalInterface;
            } else {
                zzbrmVar = new zzbrm(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbru zzk() throws RemoteException {
        zzbru zzbrsVar;
        Parcel zzdb = zzdb(27, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzbru) {
                zzbrsVar = (zzbru) queryLocalInterface;
            } else {
                zzbrsVar = new zzbrs(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbtt zzl() throws RemoteException {
        Parcel zzdb = zzdb(33, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(zzdb, zzbtt.CREATOR);
        zzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbtt zzm() throws RemoteException {
        Parcel zzdb = zzdb(34, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(zzdb, zzbtt.CREATOR);
        zzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final IObjectWrapper zzn() throws RemoteException {
        return L.e(zzdb(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbys zzbysVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(null);
        zzbaf.zzf(zza, zzbysVar);
        zza.writeString(str2);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzq(IObjectWrapper iObjectWrapper, zzbnr zzbnrVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbnrVar);
        zza.writeTypedList(list);
        zzdc(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzr(IObjectWrapper iObjectWrapper, zzbys zzbysVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbysVar);
        zza.writeStringList(list);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzf(zza, zzbrlVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar, zzbhk zzbhkVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbaf.zzf(zza, zzbrlVar);
        zzbaf.zzd(zza, zzbhkVar);
        zza.writeStringList(list);
        zzdc(14, zza);
    }
}
