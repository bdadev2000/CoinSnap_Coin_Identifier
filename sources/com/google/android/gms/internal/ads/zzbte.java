package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbte extends zzayc implements zzbtg {
    public zzbte(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final boolean zzH() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzh(int i10, int i11, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zzaye.zzd(zza, intent);
        zzdc(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzi() throws RemoteException {
        zzdc(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzl(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, bundle);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzm() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzp(int i10, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzq() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzr() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, bundle);
        Parcel zzdb = zzdb(6, zza);
        if (zzdb.readInt() != 0) {
            bundle.readFromParcel(zzdb);
        }
        zzdb.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzt() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzu() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzv() throws RemoteException {
        zzdc(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzx() throws RemoteException {
        zzdc(9, zza());
    }
}
