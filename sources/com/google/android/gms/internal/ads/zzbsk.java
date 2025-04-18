package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zzbsk {
    private final zzcfk zza;
    private final String zzb;

    public zzbsk(zzcfk zzcfkVar, String str) {
        this.zza = zzcfkVar;
        this.zzb = str;
    }

    public final void zzg(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching default position.", e2);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", this.zzb);
            zzcfk zzcfkVar = this.zza;
            if (zzcfkVar != null) {
                zzcfkVar.zze("onError", put);
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching error event.", e2);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining screen information.", e2);
        }
    }

    public final void zzk(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching size change.", e2);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching state change.", e2);
        }
    }
}
