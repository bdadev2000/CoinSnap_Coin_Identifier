package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwt;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfxj;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzx {
    private zzfws zzf;

    @Nullable
    private zzchd zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzfwf zzd = null;

    @Nullable
    private String zzb = null;

    private final zzfwu zzl() {
        zzfwt zzc = zzfwu.zzc();
        if (((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzc.zza(this.zzb);
        } else {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzw(this);
        }
    }

    public final synchronized void zza(@Nullable zzchd zzchdVar, Context context) {
        this.zzc = zzchdVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfwf zzfwfVar;
        if (this.zze && (zzfwfVar = this.zzd) != null) {
            zzfwfVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final void zzc() {
        zzfwf zzfwfVar;
        if (this.zze && (zzfwfVar = this.zzd) != null) {
            zzfwd zzc = zzfwe.zzc();
            if (((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
                zzc.zza(this.zzb);
            } else {
                String str = this.zza;
                if (str != null) {
                    zzc.zzb(str);
                } else {
                    zzf("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzfwfVar.zzb(zzc.zzc(), this.zzf);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    public final void zze(final String str, final Map map) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzx.this.zzh(str, map);
            }
        });
    }

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
        zzfwf zzfwfVar;
        if (this.zze && (zzfwfVar = this.zzd) != null) {
            zzfwfVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzchd zzchdVar = this.zzc;
        if (zzchdVar != null) {
            zzchdVar.zzd(str, map);
        }
    }

    public final void zzi(zzfwr zzfwrVar) {
        if (!TextUtils.isEmpty(zzfwrVar.zzb())) {
            if (!((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue()) {
                this.zza = zzfwrVar.zzb();
            }
        }
        switch (zzfwrVar.zza()) {
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
                hashMap.put("error", String.valueOf(zzfwrVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(@Nullable zzchd zzchdVar, @Nullable zzfwp zzfwpVar) {
        if (zzchdVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzchdVar;
        if (!this.zze && !zzk(zzchdVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue()) {
            this.zzb = zzfwpVar.zzh();
        }
        zzm();
        zzfwf zzfwfVar = this.zzd;
        if (zzfwfVar != null) {
            zzfwfVar.zzd(zzfwpVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfxj.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfwg.zza(context);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
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
