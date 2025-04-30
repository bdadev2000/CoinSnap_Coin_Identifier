package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfo implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcfp zze;

    public zzcfo(zzcfp zzcfpVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcfpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c9;
        HashMap m = L.m(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        m.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            m.put("cachedSrc", this.zzb);
        }
        String str = this.zzc;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        String str2 = "internal";
        switch (c9) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case '\b':
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        m.put("type", str2);
        m.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            m.put("message", this.zzd);
        }
        zzcfp.zze(this.zze, "onPrecacheEvent", m);
    }
}
