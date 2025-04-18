package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public final class zzbkx {
    private final Context zza;
    private final OnH5AdsEventListener zzb;

    @Nullable
    private zzbkt zzc;

    public zzbkx(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbcn.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjC)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjE)).intValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzbc.zza().zzn(this.zza, new zzbpc(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjC)).booleanValue()) {
            zzd();
            zzbkt zzbktVar = this.zzc;
            if (zzbktVar != null) {
                try {
                    zzbktVar.zze();
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbkt zzbktVar = this.zzc;
        if (zzbktVar == null) {
            return false;
        }
        try {
            zzbktVar.zzf(str);
            return true;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return true;
        }
    }
}
