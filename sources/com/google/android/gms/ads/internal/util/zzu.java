package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzcim;
import com.google.android.gms.internal.ads.zzegk;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes2.dex */
public class zzu extends zzab {
    public zzu() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (zzt.zzF()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final WebResourceResponse zzb(String str, String str2, int i9, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i9, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final zzchl zzc(zzchd zzchdVar, zzbdm zzbdmVar, boolean z8, @Nullable zzegk zzegkVar) {
        return new zzcim(zzchdVar, zzbdmVar, z8, zzegkVar);
    }
}
