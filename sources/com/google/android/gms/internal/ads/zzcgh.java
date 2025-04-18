package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcgh implements zzbjr {
    final /* synthetic */ zzcgj zza;

    public zzcgh(zzcgj zzcgjVar) {
        this.zza = zzcgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcgj zzcgjVar = this.zza;
                        i10 = zzcgjVar.zzI;
                        if (i10 != parseInt) {
                            zzcgjVar.zzI = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
