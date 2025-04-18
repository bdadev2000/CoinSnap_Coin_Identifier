package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzdmb {
    private final zzdre zza;
    private final zzdpt zzb;
    private final zzcpw zzc;
    private final zzdkx zzd;

    public zzdmb(zzdre zzdreVar, zzdpt zzdptVar, zzcpw zzcpwVar, zzdkx zzdkxVar) {
        this.zza = zzdreVar;
        this.zzb = zzdptVar;
        this.zzc = zzcpwVar;
        this.zzd = zzdkxVar;
    }

    public final View zza() throws zzcga {
        zzcfo zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zza.zzF().setVisibility(8);
        zza.zzag("/sendMessageToSdk", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmb.this.zzb((zzcfo) obj, map);
            }
        });
        zza.zzag("/adMuted", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmb.this.zzc((zzcfo) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/loadHtml", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, final Map map) {
                zzcfo zzcfoVar = (zzcfo) obj;
                zzchg zzN = zzcfoVar.zzN();
                final zzdmb zzdmbVar = zzdmb.this;
                zzN.zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdlv
                    @Override // com.google.android.gms.internal.ads.zzche
                    public final void zza(boolean z2, int i2, String str, String str2) {
                        zzdmb.this.zzd(map, z2, i2, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfoVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfoVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmb.this.zze((zzcfo) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/hideOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmb.this.zzf((zzcfo) obj, map);
            }
        });
        return zza.zzF();
    }

    public final /* synthetic */ void zzb(zzcfo zzcfoVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcfo zzcfoVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z2, int i2, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(zzcfo zzcfoVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Showing native ads overlay.");
        zzcfoVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcfo zzcfoVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Hiding native ads overlay.");
        zzcfoVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
