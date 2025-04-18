package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes.dex */
public final class zzcob implements zzcnf {
    private final CookieManager zza;

    public zzcob(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzu.zzq().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaS), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaS);
        String cookie = this.zza.getCookie(str2);
        if (cookie != null) {
            List zze = zzfym.zzb(zzfxn.zzc(';')).zze(cookie);
            for (int i2 = 0; i2 < zze.size(); i2++) {
                CookieManager cookieManager = this.zza;
                Iterator it = zzfym.zzb(zzfxn.zzc(SignatureVisitor.INSTANCEOF)).zzc((String) zze.get(i2)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(d.j("position (0) must be less than the number of elements that remained (", 0, ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaE))));
            }
        }
    }
}
