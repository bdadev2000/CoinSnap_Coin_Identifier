package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzdjx implements zzbfm {
    final /* synthetic */ zzdku zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdjx(zzdku zzdkuVar, ViewGroup viewGroup) {
        this.zza = zzdkuVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zzc() {
        zzfzo zzfzoVar = zzdju.zza;
        Map zzm = this.zza.zzm();
        if (zzm != null) {
            int size = zzfzoVar.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = zzm.get((String) zzfzoVar.get(i10));
                i10++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
