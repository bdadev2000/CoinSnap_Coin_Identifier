package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfum;
import com.google.android.gms.internal.ads.zzfvf;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfvi;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzz {
    private zzfvi zzf;

    @Nullable
    private zzcfk zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzful zzd = null;

    @Nullable
    private String zzb = null;

    private final zzfvk zzl() {
        zzfvj zzc = zzfvk.zzc();
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzlf)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
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
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zza(@Nullable zzcfk zzcfkVar, Context context) {
        this.zzc = zzcfkVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzful zzfulVar;
        if (this.zze && (zzfulVar = this.zzd) != null) {
            zzfulVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final void zzc() {
        zzful zzfulVar;
        if (this.zze && (zzfulVar = this.zzd) != null) {
            zzfuj zzc = zzfuk.zzc();
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzlf)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
                zzc.zza(this.zzb);
            } else {
                String str = this.zza;
                if (str != null) {
                    zzc.zzb(str);
                } else {
                    zzf("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzfulVar.zzb(zzc.zzc(), this.zzf);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    public final void zze(final String str, final Map map) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzz.this.zzh(str, map);
            }
        });
    }

    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PglCryptUtils.KEY_MESSAGE, str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzful zzfulVar;
        if (this.zze && (zzfulVar = this.zzd) != null) {
            zzfulVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcfk zzcfkVar = this.zzc;
        if (zzcfkVar != null) {
            zzcfkVar.zzd(str, map);
        }
    }

    public final void zzi(zzfvh zzfvhVar) {
        if (!TextUtils.isEmpty(zzfvhVar.zzb())) {
            if (!((Boolean) zzbe.zzc().zza(zzbcn.zzlf)).booleanValue()) {
                this.zza = zzfvhVar.zzb();
            }
        }
        switch (zzfvhVar.zza()) {
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
                hashMap.put("error", String.valueOf(zzfvhVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(@Nullable zzcfk zzcfkVar, @Nullable zzfvf zzfvfVar) {
        if (zzcfkVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfkVar;
        if (!this.zze && !zzk(zzcfkVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzlf)).booleanValue()) {
            this.zzb = zzfvfVar.zzh();
        }
        zzm();
        zzful zzfulVar = this.zzd;
        if (zzfulVar != null) {
            zzfulVar.zzd(zzfvfVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfvx.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfum.zza(context);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
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
