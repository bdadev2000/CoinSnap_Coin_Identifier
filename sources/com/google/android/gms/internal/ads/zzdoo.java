package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdoo {
    private final Executor zza;
    private final zzcpw zzb;
    private final zzdfu zzc;
    private final zzcop zzd;

    public zzdoo(Executor executor, zzcpw zzcpwVar, zzdfu zzdfuVar, zzcop zzcopVar) {
        this.zza = executor;
        this.zzc = zzdfuVar;
        this.zzb = zzcpwVar;
        this.zzd = zzcopVar;
    }

    public final void zza(final zzcfo zzcfoVar) {
        if (zzcfoVar == null) {
            return;
        }
        this.zzc.zza(zzcfoVar.zzF());
        this.zzc.zzo(new zzayv() { // from class: com.google.android.gms.internal.ads.zzdok
            @Override // com.google.android.gms.internal.ads.zzayv
            public final void zzdp(zzayu zzayuVar) {
                zzchg zzN = zzcfo.this.zzN();
                Rect rect = zzayuVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzayv() { // from class: com.google.android.gms.internal.ads.zzdol
            @Override // com.google.android.gms.internal.ads.zzayv
            public final void zzdp(zzayu zzayuVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzayuVar.zzj ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                zzcfo.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcfoVar);
        zzchg zzN = zzcfoVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjL)).booleanValue() && zzN != null) {
            zzN.zzJ(this.zzd);
            zzN.zzK(this.zzd, null, null);
        }
        zzcfoVar.zzag("/trackActiveViewUnit", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdoo.this.zzb((zzcfo) obj, map);
            }
        });
        zzcfoVar.zzag("/untrackActiveViewUnit", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdoo.this.zzc((zzcfo) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcfo zzcfoVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcfo zzcfoVar, Map map) {
        this.zzb.zza();
    }
}
