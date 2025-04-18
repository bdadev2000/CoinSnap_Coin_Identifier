package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdvv implements com.google.android.gms.ads.internal.overlay.zzr, zzcha {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdvk zzc;
    private zzcfk zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdl zzh;
    private boolean zzi;

    public zzdvv(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzdl zzdlVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
            try {
                zzdlVar.zze(zzfgq.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdlVar.zze(zzfgq.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziC)).intValue()) {
                return true;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdlVar.zze(zzfgq.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdl zzdlVar = this.zzh;
            if (zzdlVar != null) {
                zzdlVar.zze(zzfgq.zzd(17, null, null));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdu(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdl zzdlVar = this.zzh;
            if (zzdlVar != null) {
                try {
                    zzdlVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Nullable
    public final Activity zzg() {
        zzcfk zzcfkVar = this.zzd;
        if (zzcfkVar != null && !zzcfkVar.zzaE()) {
            return this.zzd.zzi();
        }
        return null;
    }

    public final void zzh(zzdvk zzdvkVar) {
        this.zzc = zzdvkVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzdl zzdlVar, zzbkl zzbklVar, zzbke zzbkeVar, zzbjs zzbjsVar) {
        if (!zzl(zzdlVar)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzA();
            zzcfk zza = zzcfx.zza(this.zza, zzche.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbbl.zza(), null, null, null, null);
            this.zzd = zza;
            zzchc zzN = zza.zzN();
            if (zzN == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzdlVar.zze(zzfgq.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InspectorUi.openInspector 3");
                    return;
                }
            }
            this.zzh = zzdlVar;
            zzN.zzU(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbklVar, null, new zzbkk(this.zza), zzbkeVar, zzbjsVar, null);
            zzN.zzB(this);
            this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziA));
            com.google.android.gms.ads.internal.zzv.zzj();
            com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
            this.zzg = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        } catch (zzcfw e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to obtain a web view for the ad inspector", e10);
            try {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "InspectorUi.openInspector 0");
                zzdlVar.zze(zzfgq.zzd(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException e11) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "InspectorUi.openInspector 1");
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvu
                @Override // java.lang.Runnable
                public final void run() {
                    zzdvv.this.zzi(str);
                }
            });
        }
    }
}
