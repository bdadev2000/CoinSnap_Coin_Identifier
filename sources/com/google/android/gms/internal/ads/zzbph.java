package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbph extends zzayc implements zzbpj {
    public zzbph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzG(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaye.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzM() throws RemoteException {
        Parcel zzdb = zzdb(22, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzN() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpr zzO() throws RemoteException {
        zzbpr zzbprVar;
        Parcel zzdb = zzdb(15, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbprVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzbpr) {
                zzbprVar = (zzbpr) queryLocalInterface;
            } else {
                zzbprVar = new zzbpr(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbps zzP() throws RemoteException {
        zzbps zzbpsVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbps) {
                zzbpsVar = (zzbps) queryLocalInterface;
            } else {
                zzbpsVar = new zzbps(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        Parcel zzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbgs zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpp zzj() throws RemoteException {
        zzbpp zzbpnVar;
        Parcel zzdb = zzdb(36, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzbpp) {
                zzbpnVar = (zzbpp) queryLocalInterface;
            } else {
                zzbpnVar = new zzbpn(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpv zzk() throws RemoteException {
        zzbpv zzbptVar;
        Parcel zzdb = zzdb(27, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbptVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzbpv) {
                zzbptVar = (zzbpv) queryLocalInterface;
            } else {
                zzbptVar = new zzbpt(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbru zzl() throws RemoteException {
        Parcel zzdb = zzdb(33, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(zzdb, zzbru.CREATOR);
        zzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbru zzm() throws RemoteException {
        Parcel zzdb = zzdb(34, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(zzdb, zzbru.CREATOR);
        zzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final IObjectWrapper zzn() throws RemoteException {
        return e.c(zzdb(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwu zzbwuVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(null);
        zzaye.zzf(zza, zzbwuVar);
        zza.writeString(str2);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzq(IObjectWrapper iObjectWrapper, zzblt zzbltVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbltVar);
        zza.writeTypedList(list);
        zzdc(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwu zzbwuVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbwuVar);
        zza.writeStringList(list);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzf(zza, zzbpmVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar, zzbfn zzbfnVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaye.zzf(zza, zzbpmVar);
        zzaye.zzd(zza, zzbfnVar);
        zza.writeStringList(list);
        zzdc(14, zza);
    }
}
