package com.google.android.gms.internal.ads;

import android.util.Log;
import com.applovin.impl.adview.t;
import com.facebook.internal.security.CertificateUtil;

/* loaded from: classes4.dex */
public final class zzhhv extends zzhia {
    final String zza;

    public zzhhv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhia
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(t.b(str, t.b(str2, 1)));
        sb.append(str2);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
