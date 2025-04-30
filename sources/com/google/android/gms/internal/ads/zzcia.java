package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcia implements zzblp {
    final /* synthetic */ zzcic zza;

    public zzcia(zzcic zzcicVar) {
        this.zza = zzcicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i9;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        try {
                            zzcic zzcicVar = this.zza;
                            i9 = zzcicVar.zzI;
                            if (i9 != parseInt) {
                                zzcicVar.zzI = parseInt;
                                this.zza.requestLayout();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e4);
                }
            }
        }
    }
}
