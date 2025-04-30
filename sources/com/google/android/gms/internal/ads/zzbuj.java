package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzbuj {
    private final zzchd zza;
    private final String zzb;

    public zzbuj(zzchd zzchdVar, String str) {
        this.zza = zzchdVar;
        this.zzb = str;
    }

    public final void zzg(int i9, int i10, int i11, int i12) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i9).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching default position.", e4);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzchd zzchdVar = this.zza;
            if (zzchdVar != null) {
                zzchdVar.zze("onError", put);
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching error event.", e4);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching ready Event.", e4);
        }
    }

    public final void zzj(int i9, int i10, int i11, int i12, float f9, int i13) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i9).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f9).put("rotation", i13));
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining screen information.", e4);
        }
    }

    public final void zzk(int i9, int i10, int i11, int i12) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i9).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching size change.", e4);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching state change.", e4);
        }
    }
}
