package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.applovin.impl.L;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdnf {
    private final zzdsd zza;
    private final zzdqs zzb;
    private final zzcrk zzc;
    private final zzdmb zzd;

    public zzdnf(zzdsd zzdsdVar, zzdqs zzdqsVar, zzcrk zzcrkVar, zzdmb zzdmbVar) {
        this.zza = zzdsdVar;
        this.zzb = zzdqsVar;
        this.zzc = zzcrkVar;
        this.zzd = zzdmbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzchp {
        zzchd zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzag("/sendMessageToSdk", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnf.this.zzb((zzchd) obj, map);
            }
        });
        zza.zzag("/adMuted", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnb
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnf.this.zzc((zzchd) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/loadHtml", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnc
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, final Map map) {
                zzchd zzchdVar = (zzchd) obj;
                zzciv zzN = zzchdVar.zzN();
                final zzdnf zzdnfVar = zzdnf.this;
                zzN.zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdmz
                    @Override // com.google.android.gms.internal.ads.zzcit
                    public final void zza(boolean z8, int i9, String str, String str2) {
                        zzdnf.this.zzd(map, z8, i9, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzchdVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzchdVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showOverlay", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnd
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnf.this.zze((zzchd) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/hideOverlay", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdne
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnf.this.zzf((zzchd) obj, map);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzchd zzchdVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzchd zzchdVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z8, int i9, String str, String str2) {
        HashMap m = L.m("messageType", "htmlLoaded");
        m.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", m);
    }

    public final /* synthetic */ void zze(zzchd zzchdVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Showing native ads overlay.");
        zzchdVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzchd zzchdVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Hiding native ads overlay.");
        zzchdVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
