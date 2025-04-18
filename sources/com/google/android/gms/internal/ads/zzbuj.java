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

/* loaded from: classes4.dex */
public final class zzbuj {
    private final View zza;

    @Nullable
    private final Map zzb;

    @Nullable
    private final zzbzl zzc;

    public zzbuj(zzbui zzbuiVar) {
        View view;
        Map map;
        View view2;
        view = zzbuiVar.zza;
        this.zza = view;
        map = zzbuiVar.zzb;
        this.zzb = map;
        view2 = zzbuiVar.zza;
        zzbzl zza = zzbud.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzg(new zzbuk(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbuh(this, list));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbzl zzbzlVar = this.zzc;
        if (zzbzlVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbzlVar.zzi(list, ObjectWrapper.wrap(this.zza), new zzbug(this, list));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbzl zzbzlVar = this.zzc;
        if (zzbzlVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbzlVar.zzk(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbuf(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbue(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
