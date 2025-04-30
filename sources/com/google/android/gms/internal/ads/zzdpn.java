package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdpn {
    private final Executor zza;
    private final zzcrk zzb;
    private final zzdhc zzc;
    private final zzcqd zzd;

    public zzdpn(Executor executor, zzcrk zzcrkVar, zzdhc zzdhcVar, zzcqd zzcqdVar) {
        this.zza = executor;
        this.zzc = zzdhcVar;
        this.zzb = zzcrkVar;
        this.zzd = zzcqdVar;
    }

    public final void zza(final zzchd zzchdVar) {
        if (zzchdVar == null) {
            return;
        }
        this.zzc.zza(zzchdVar.zzF());
        this.zzc.zzo(new zzban() { // from class: com.google.android.gms.internal.ads.zzdpj
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzdp(zzbam zzbamVar) {
                zzciv zzN = zzchd.this.zzN();
                Rect rect = zzbamVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzban() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzdp(zzbam zzbamVar) {
                String str;
                HashMap hashMap = new HashMap();
                if (true != zzbamVar.zzj) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zzchd.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzchdVar);
        zzciv zzN = zzchdVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkf)).booleanValue() && zzN != null) {
            zzN.zzJ(this.zzd);
            zzN.zzK(this.zzd, null, null);
        }
        zzchdVar.zzag("/trackActiveViewUnit", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdpn.this.zzb((zzchd) obj, map);
            }
        });
        zzchdVar.zzag("/untrackActiveViewUnit", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdpm
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdpn.this.zzc((zzchd) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzchd zzchdVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzchd zzchdVar, Map map) {
        this.zzb.zza();
    }
}
