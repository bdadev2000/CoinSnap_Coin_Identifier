package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzn extends zza implements zzp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzp
    public final int zzd() throws RemoteException {
        Parcel zzJ = zzJ(1, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzp
    public final String zze() throws RemoteException {
        Parcel zzJ = zzJ(4, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzp
    public final String zzf() throws RemoteException {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzp
    public final String zzg() throws RemoteException {
        Parcel zzJ = zzJ(3, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzp
    public final Map zzh() throws RemoteException {
        Parcel zzJ = zzJ(5, zza());
        HashMap zzc = zzc.zzc(zzJ);
        zzJ.recycle();
        return zzc;
    }
}
