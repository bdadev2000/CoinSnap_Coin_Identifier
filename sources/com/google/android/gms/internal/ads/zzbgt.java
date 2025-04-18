package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbgt {
    private final zzbgs zza;

    public zzbgt(zzbgs zzbgsVar) {
        Context context;
        this.zza = zzbgsVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbgsVar.zzh());
        } catch (RemoteException | NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
            }
        }
    }

    public final zzbgs zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }
}
