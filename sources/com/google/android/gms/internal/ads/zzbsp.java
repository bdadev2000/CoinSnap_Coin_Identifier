package com.google.android.gms.internal.ads;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zzbsp {
    private final zzcfo zza;
    private final String zzb;

    public zzbsp(zzcfo zzcfoVar, String str) {
        this.zza = zzcfoVar;
        this.zzb = str;
    }

    public final void zzg(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i4).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcfo zzcfoVar = this.zza;
            if (zzcfoVar != null) {
                zzcfoVar.zze("onError", put);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzj(int i2, int i3, int i4, int i5, float f2, int i6) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i2).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f2).put("rotation", i6));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzk(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i4).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
