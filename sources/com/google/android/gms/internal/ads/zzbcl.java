package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbcl implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;

    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbci
                @Override // com.google.android.gms.internal.ads.zzfxg
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbce zzbceVar) {
        if (!this.zzc.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbceVar.zzk();
            }
        }
        if (zzbceVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbceVar.zzk();
            }
            return zzbceVar.zzb(bundle);
        }
        if (zzbceVar.zze() == 1 && this.zzh.has(zzbceVar.zzl())) {
            return zzbceVar.zza(this.zzh);
        }
        return zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbcj
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzbcl.this.zzc(zzbceVar);
            }
        });
    }

    public final Object zzb(zzbce zzbceVar) {
        if (!this.zzd && !this.zza) {
            return zzbceVar.zzk();
        }
        return zza(zzbceVar);
    }

    public final /* synthetic */ Object zzc(zzbce zzbceVar) {
        return zzbceVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0113, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcp.zza(new com.google.android.gms.internal.ads.zzbch(r3))).optBoolean("local_flags_enabled") != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119 A[Catch: all -> 0x0159, DONT_GENERATE, TRY_ENTER, TryCatch #2 {, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x000e, B:14:0x0013, B:15:0x0015, B:17:0x0027, B:18:0x002b, B:20:0x002d, B:39:0x0097, B:40:0x009e, B:49:0x00cd, B:50:0x00d4, B:57:0x0119, B:58:0x0120, B:66:0x0147, B:67:0x014e, B:82:0x0151, B:83:0x0158, B:23:0x0042, B:26:0x004c, B:29:0x0055, B:31:0x0060, B:32:0x0068, B:34:0x006e, B:36:0x007e, B:38:0x0093, B:42:0x00a0, B:44:0x00a4, B:46:0x00b4, B:48:0x00c9, B:52:0x00d6, B:55:0x0115, B:60:0x0122, B:62:0x0139, B:64:0x013d, B:65:0x0140, B:69:0x00e7, B:71:0x00f5, B:73:0x00fd, B:75:0x0108), top: B:7:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122 A[Catch: all -> 0x0150, TRY_ENTER, TryCatch #0 {all -> 0x0150, blocks: (B:23:0x0042, B:26:0x004c, B:29:0x0055, B:31:0x0060, B:32:0x0068, B:34:0x006e, B:36:0x007e, B:38:0x0093, B:42:0x00a0, B:44:0x00a4, B:46:0x00b4, B:48:0x00c9, B:52:0x00d6, B:55:0x0115, B:60:0x0122, B:62:0x0139, B:64:0x013d, B:65:0x0140, B:69:0x00e7, B:71:0x00f5, B:73:0x00fd, B:75:0x0108), top: B:22:0x0042, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcl.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
