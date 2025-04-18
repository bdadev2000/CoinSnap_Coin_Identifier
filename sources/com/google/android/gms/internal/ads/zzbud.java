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

/* loaded from: classes3.dex */
public final class zzbud {
    private final View zza;

    @Nullable
    private final Map zzb;

    @Nullable
    private final zzbzh zzc;

    public zzbud(zzbuc zzbucVar) {
        View view;
        Map map;
        View view2;
        view = zzbucVar.zza;
        this.zza = view;
        map = zzbucVar.zzb;
        this.zzb = map;
        view2 = zzbucVar.zza;
        zzbzh zza = zzbtx.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzg(new zzbue(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
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
                this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbub(this, list));
                return;
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording click: ".concat(e2.toString()));
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzbzh zzbzhVar = this.zzc;
            if (zzbzhVar != null) {
                try {
                    zzbzhVar.zzi(list, ObjectWrapper.wrap(this.zza), new zzbua(this, list));
                    return;
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording impression urls: ".concat(e2.toString()));
                    return;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbzh zzbzhVar = this.zzc;
        if (zzbzhVar != null) {
            try {
                zzbzhVar.zzk(ObjectWrapper.wrap(motionEvent));
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
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbtz(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbty(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }
}
