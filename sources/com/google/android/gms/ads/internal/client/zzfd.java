package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgs;

/* loaded from: classes3.dex */
public final class zzfd implements MediaContent {
    private final zzbfv zza;
    private final VideoController zzb = new VideoController();

    @Nullable
    private final zzbgs zzc;

    public zzfd(zzbfv zzbfvVar, @Nullable zzbgs zzbgsVar) {
        this.zza = zzbfvVar;
        this.zzc = zzbgsVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.unwrap(zzi);
            }
            return null;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception occurred while getting video controller", e2);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(@Nullable Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final zzbgs zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return false;
        }
    }

    public final zzbfv zzc() {
        return this.zza;
    }
}
