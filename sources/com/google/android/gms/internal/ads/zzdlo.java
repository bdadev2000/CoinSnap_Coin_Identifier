package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class zzdlo implements zzbfq {
    final /* synthetic */ zzdml zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdlo(zzdml zzdmlVar, ViewGroup viewGroup) {
        this.zza = zzdmlVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzc() {
        zzgax zzgaxVar = zzdll.zza;
        Map zzm = this.zza.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzgaxVar.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = zzm.get((String) zzgaxVar.get(i2));
            i2++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
