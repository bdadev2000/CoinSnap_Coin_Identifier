package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfvs;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzfvu;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfwq;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfxf;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzz {
    private zzfwq zzf;

    @Nullable
    private zzcfo zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzfvt zzd = null;

    @Nullable
    private String zzb = null;

    private final zzfws zzl() {
        zzfwr zzc = zzfws.zzc();
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzle)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zza(@Nullable zzcfo zzcfoVar, Context context) {
        this.zzc = zzcfoVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfvt zzfvtVar;
        if (!this.zze || (zzfvtVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfvtVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfvt zzfvtVar;
        if (!this.zze || (zzfvtVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfvr zzc = zzfvs.zzc();
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzle)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        zzfvtVar.zzb(zzc.zzc(), this.zzf);
    }

    @VisibleForTesting
    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    @VisibleForTesting
    public final void zze(final String str, final Map map) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzz.this.zzh(str, map);
            }
        });
    }

    @VisibleForTesting
    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfvt zzfvtVar;
        if (!this.zze || (zzfvtVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfvtVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcfo zzcfoVar = this.zzc;
        if (zzcfoVar != null) {
            zzcfoVar.zzd(str, map);
        }
    }

    @VisibleForTesting
    public final void zzi(zzfwp zzfwpVar) {
        if (!TextUtils.isEmpty(zzfwpVar.zzb())) {
            if (!((Boolean) zzbe.zzc().zza(zzbcv.zzle)).booleanValue()) {
                this.zza = zzfwpVar.zzb();
            }
        }
        switch (zzfwpVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfwpVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(@Nullable zzcfo zzcfoVar, @Nullable zzfwn zzfwnVar) {
        if (zzcfoVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfoVar;
        if (!this.zze && !zzk(zzcfoVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcv.zzle)).booleanValue()) {
            this.zzb = zzfwnVar.zzh();
        }
        zzm();
        zzfvt zzfvtVar = this.zzd;
        if (zzfvtVar != null) {
            zzfvtVar.zzd(zzfwnVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfxf.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfvu.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
