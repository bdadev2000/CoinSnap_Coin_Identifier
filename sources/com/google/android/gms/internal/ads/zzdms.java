package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzdms implements zzbhj {
    final /* synthetic */ zzdnp zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdms(zzdnp zzdnpVar, ViewGroup viewGroup) {
        this.zza = zzdnpVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zzc() {
        zzgbc zzgbcVar = zzdmp.zza;
        Map zzm = this.zza.zzm();
        if (zzm != null) {
            int size = zzgbcVar.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = zzm.get((String) zzgbcVar.get(i9));
                i9++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
