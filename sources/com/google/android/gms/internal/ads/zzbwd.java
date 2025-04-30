package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbwd {
    private final View zza;

    @Nullable
    private final Map zzb;

    @Nullable
    private final zzcbg zzc;

    public zzbwd(zzbwc zzbwcVar) {
        View view;
        Map map;
        View view2;
        view = zzbwcVar.zza;
        this.zza = view;
        map = zzbwcVar.zzb;
        this.zzb = map;
        view2 = zzbwcVar.zza;
        zzcbg zza = zzbvx.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzg(new zzbwe(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbwb(this, list));
                return;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording click: ".concat(e4.toString()));
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzcbg zzcbgVar = this.zzc;
            if (zzcbgVar != null) {
                try {
                    zzcbgVar.zzi(list, ObjectWrapper.wrap(this.zza), new zzbwa(this, list));
                    return;
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording impression urls: ".concat(e4.toString()));
                    return;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcbg zzcbgVar = this.zzc;
        if (zzcbgVar != null) {
            try {
                zzcbgVar.zzk(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call remote method.");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbvz(this, updateClickUrlCallback));
        } catch (RemoteException e4) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e4.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbvy(this, updateImpressionUrlsCallback));
        } catch (RemoteException e4) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e4.toString()));
        }
    }
}
