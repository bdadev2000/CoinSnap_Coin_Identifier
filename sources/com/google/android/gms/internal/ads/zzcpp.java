package com.google.android.gms.internal.ads;

import Q7.n0;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcpp implements zzcot {
    private final CookieManager zza;

    public zzcpp(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzu.zzq().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaO);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zzf = zzfyt.zzc(zzfxr.zzc(';')).zzf(cookie);
                    for (int i9 = 0; i9 < zzf.size(); i9++) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfyt.zzc(zzfxr.zzc('=')).zzd((String) zzf.get(i9)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzay))));
                        } else {
                            throw new IndexOutOfBoundsException(n0.f(0, "position (0) must be less than the number of elements that remained (", ")"));
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaO), str2);
        }
    }
}
