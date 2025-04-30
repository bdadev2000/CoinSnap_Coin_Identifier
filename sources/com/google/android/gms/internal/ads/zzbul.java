package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbul extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbul(zzbho zzbhoVar) {
        zzbhv zzbhvVar;
        try {
            this.zzb = zzbhoVar.zzg();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbhoVar.zzh()) {
                if (obj instanceof IBinder) {
                    zzbhvVar = zzbhu.zzg((IBinder) obj);
                } else {
                    zzbhvVar = null;
                }
                if (zzbhvVar != null) {
                    this.zza.add(new zzbun(zzbhvVar));
                }
            }
        } catch (RemoteException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
