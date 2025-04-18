package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzeea;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes3.dex */
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzF()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzb(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzcfs zzc(zzcfk zzcfkVar, zzbbl zzbblVar, boolean z10, @Nullable zzeea zzeeaVar) {
        return new zzcgt(zzcfkVar, zzbblVar, z10, zzeeaVar);
    }
}
