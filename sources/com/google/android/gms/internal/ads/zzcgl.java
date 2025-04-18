package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcgl implements zzbjw {
    final /* synthetic */ zzcgn zza;

    public zzcgl(zzcgn zzcgnVar) {
        this.zza = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i2;
        if (map != null) {
            String str = (String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    try {
                        zzcgn zzcgnVar = this.zza;
                        i2 = zzcgnVar.zzI;
                        if (i2 != parseInt) {
                            zzcgnVar.zzI = parseInt;
                            this.zza.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
