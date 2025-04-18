package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcmn implements zzclr {
    private final CookieManager zza;

    public zzcmn(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzv.zzr().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaV);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zze = zzfxd.zzb(zzfwf.zzc(';')).zze(cookie);
                    for (int i10 = 0; i10 < zze.size(); i10++) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfxd.zzb(zzfwf.zzc('=')).zzc((String) zze.get(i10)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaH))));
                        } else {
                            throw new IndexOutOfBoundsException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("position (0) must be less than the number of elements that remained (", 0, ")"));
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
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaV), str2);
        }
    }
}
