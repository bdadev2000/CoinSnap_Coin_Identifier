package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbsm extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsm(zzbfr zzbfrVar) {
        zzbfy zzbfyVar;
        try {
            this.zzb = zzbfrVar.zzg();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfrVar.zzh()) {
                if (obj instanceof IBinder) {
                    zzbfyVar = zzbfx.zzg((IBinder) obj);
                } else {
                    zzbfyVar = null;
                }
                if (zzbfyVar != null) {
                    this.zza.add(new zzbso(zzbfyVar));
                }
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
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
