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

/* loaded from: classes2.dex */
public final class zzben implements SharedPreferences.OnSharedPreferenceChangeListener {
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
            this.zzh = new JSONObject((String) zzber.zza(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzbek
                @Override // com.google.android.gms.internal.ads.zzfyw
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

    public final Object zza(final zzbeg zzbegVar) {
        if (!this.zzc.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbegVar.zzm();
            }
        }
        if (zzbegVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbegVar.zzm();
            }
            return zzbegVar.zzb(bundle);
        }
        if (zzbegVar.zze() == 1 && this.zzh.has(zzbegVar.zzn())) {
            return zzbegVar.zza(this.zzh);
        }
        return zzber.zza(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzbel
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzben.this.zzc(zzbegVar);
            }
        });
    }

    public final Object zzb(zzbeg zzbegVar) {
        if (!this.zzd && !this.zza) {
            return zzbegVar.zzm();
        }
        return zza(zzbegVar);
    }

    public final /* synthetic */ Object zzc(zzbeg zzbegVar) {
        return zzbegVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzber.zza(new com.google.android.gms.internal.ads.zzbej(r3))).optBoolean("local_flags_enabled") != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x0011, B:14:0x0016, B:15:0x0018, B:17:0x002a, B:18:0x002e, B:20:0x0030, B:39:0x009e, B:40:0x00a5, B:49:0x00d4, B:50:0x00db, B:57:0x0120, B:58:0x0127, B:66:0x014e, B:67:0x0155, B:83:0x0157, B:84:0x015e, B:23:0x0045, B:26:0x004f, B:29:0x005c, B:31:0x0067, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:38:0x009a, B:42:0x00a7, B:44:0x00ab, B:46:0x00bb, B:48:0x00d0, B:52:0x00dd, B:55:0x011c, B:60:0x0129, B:62:0x0140, B:64:0x0144, B:65:0x0147, B:69:0x00ee, B:71:0x00fc, B:73:0x0104, B:75:0x010f), top: B:7:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129 A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:23:0x0045, B:26:0x004f, B:29:0x005c, B:31:0x0067, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:38:0x009a, B:42:0x00a7, B:44:0x00ab, B:46:0x00bb, B:48:0x00d0, B:52:0x00dd, B:55:0x011c, B:60:0x0129, B:62:0x0140, B:64:0x0144, B:65:0x0147, B:69:0x00ee, B:71:0x00fc, B:73:0x0104, B:75:0x010f), top: B:22:0x0045, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzben.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
