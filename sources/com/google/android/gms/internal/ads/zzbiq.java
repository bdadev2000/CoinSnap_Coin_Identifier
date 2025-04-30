package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbiq {
    private final zzbip zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();

    public zzbiq(zzbip zzbipVar) {
        Context context;
        this.zza = zzbipVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbipVar.zzh());
        } catch (RemoteException | NullPointerException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzs(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e9) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e9);
            }
        }
        this.zzb = mediaView;
    }

    public final zzbip zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }
}
