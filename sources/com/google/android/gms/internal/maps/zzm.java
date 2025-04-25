package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzm extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
    }

    public final LatLng zzd() throws RemoteException {
        Parcel zzJ = zzJ(1, zza());
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    public final List zze() throws RemoteException {
        Parcel zzJ = zzJ(2, zza());
        ArrayList<IBinder> createBinderArrayList = zzJ.createBinderArrayList();
        zzJ.recycle();
        return createBinderArrayList;
    }
}
