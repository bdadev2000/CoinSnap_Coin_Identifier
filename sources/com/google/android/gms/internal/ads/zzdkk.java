package com.google.android.gms.internal.ads;

import a4.j;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdkk {
    private final zzdpn zza;
    private final zzdoc zzb;
    private final zzcoi zzc;
    private final zzdjg zzd;

    public zzdkk(zzdpn zzdpnVar, zzdoc zzdocVar, zzcoi zzcoiVar, zzdjg zzdjgVar) {
        this.zza = zzdpnVar;
        this.zzb = zzdocVar;
        this.zzc = zzcoiVar;
        this.zzd = zzdjgVar;
    }

    public final View zza() throws zzcfw {
        zzcfk zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zza.zzF().setVisibility(8);
        zza.zzag("/sendMessageToSdk", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdkk.this.zzb((zzcfk) obj, map);
            }
        });
        zza.zzag("/adMuted", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdkk.this.zzc((zzcfk) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/loadHtml", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, final Map map) {
                zzcfk zzcfkVar = (zzcfk) obj;
                zzchc zzN = zzcfkVar.zzN();
                final zzdkk zzdkkVar = zzdkk.this;
                zzN.zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdke
                    @Override // com.google.android.gms.internal.ads.zzcha
                    public final void zza(boolean z10, int i10, String str, String str2) {
                        zzdkk.this.zzd(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfkVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfkVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdki
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdkk.this.zze((zzcfk) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/hideOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdkk.this.zzf((zzcfk) obj, map);
            }
        });
        return zza.zzF();
    }

    public final /* synthetic */ void zzb(zzcfk zzcfkVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcfk zzcfkVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap q10 = j.q("messageType", "htmlLoaded");
        q10.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", q10);
    }

    public final /* synthetic */ void zze(zzcfk zzcfkVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Showing native ads overlay.");
        zzcfkVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcfk zzcfkVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Hiding native ads overlay.");
        zzcfkVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
