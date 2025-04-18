package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdmx {
    private final Executor zza;
    private final zzcoi zzb;
    private final zzdef zzc;
    private final zzcnb zzd;

    public zzdmx(Executor executor, zzcoi zzcoiVar, zzdef zzdefVar, zzcnb zzcnbVar) {
        this.zza = executor;
        this.zzc = zzdefVar;
        this.zzb = zzcoiVar;
        this.zzd = zzcnbVar;
    }

    public final void zza(final zzcfk zzcfkVar) {
        if (zzcfkVar == null) {
            return;
        }
        this.zzc.zza(zzcfkVar.zzF());
        this.zzc.zzo(new zzaym() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzaym
            public final void zzdp(zzayl zzaylVar) {
                zzchc zzN = zzcfk.this.zzN();
                Rect rect = zzaylVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzaym() { // from class: com.google.android.gms.internal.ads.zzdmu
            @Override // com.google.android.gms.internal.ads.zzaym
            public final void zzdp(zzayl zzaylVar) {
                String str;
                HashMap hashMap = new HashMap();
                if (true != zzaylVar.zzj) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zzcfk.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcfkVar);
        zzchc zzN = zzcfkVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjN)).booleanValue() && zzN != null) {
            zzN.zzK(this.zzd);
            zzN.zzL(this.zzd, null, null);
        }
        zzcfkVar.zzag("/trackActiveViewUnit", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdmv
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdmx.this.zzb((zzcfk) obj, map);
            }
        });
        zzcfkVar.zzag("/untrackActiveViewUnit", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdmx.this.zzc((zzcfk) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcfk zzcfkVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcfk zzcfkVar, Map map) {
        this.zzb.zza();
    }
}
