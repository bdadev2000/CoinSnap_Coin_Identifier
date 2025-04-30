package com.bytedance.adsdk.lottie.jU;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.lottie.Bj;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ku {
    private final HWF lMd;
    private final QR zp;

    public ku(QR qr, HWF hwf) {
        this.zp = qr;
        this.lMd = hwf;
    }

    @WorkerThread
    private Bj<com.bytedance.adsdk.lottie.HWF> KS(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                jU zp = this.lMd.zp(str);
                if (zp.zp()) {
                    Bj<com.bytedance.adsdk.lottie.HWF> zp2 = zp(context, str, zp.lMd(), zp.KS(), str2);
                    zp2.zp();
                    try {
                        zp.close();
                    } catch (IOException unused) {
                    }
                    return zp2;
                }
                Bj<com.bytedance.adsdk.lottie.HWF> bj = new Bj<>(new IllegalArgumentException(zp.jU()));
                try {
                    zp.close();
                } catch (IOException unused2) {
                }
                return bj;
            } catch (Exception e4) {
                Bj<com.bytedance.adsdk.lottie.HWF> bj2 = new Bj<>(e4);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return bj2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @WorkerThread
    private com.bytedance.adsdk.lottie.HWF lMd(Context context, String str, String str2) {
        QR qr;
        Pair<KS, InputStream> zp;
        Bj<com.bytedance.adsdk.lottie.HWF> lMd;
        if (str2 == null || (qr = this.zp) == null || (zp = qr.zp(str)) == null) {
            return null;
        }
        KS ks = (KS) zp.first;
        InputStream inputStream = (InputStream) zp.second;
        if (ks == KS.ZIP) {
            lMd = com.bytedance.adsdk.lottie.QR.zp(context, new ZipInputStream(inputStream), str2);
        } else {
            lMd = com.bytedance.adsdk.lottie.QR.lMd(inputStream, str2);
        }
        if (lMd.zp() != null) {
            return lMd.zp();
        }
        return null;
    }

    @WorkerThread
    public Bj<com.bytedance.adsdk.lottie.HWF> zp(Context context, String str, String str2) {
        com.bytedance.adsdk.lottie.HWF lMd = lMd(context, str, str2);
        if (lMd != null) {
            return new Bj<>(lMd);
        }
        return KS(context, str, str2);
    }

    private Bj<com.bytedance.adsdk.lottie.HWF> zp(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        Bj<com.bytedance.adsdk.lottie.HWF> zp;
        KS ks;
        QR qr;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            ks = KS.JSON;
            zp = zp(str, inputStream, str3);
        } else {
            KS ks2 = KS.ZIP;
            zp = zp(context, str, inputStream, str3);
            ks = ks2;
        }
        if (str3 != null && zp.zp() != null && (qr = this.zp) != null) {
            qr.zp(str, ks);
        }
        return zp;
    }

    private Bj<com.bytedance.adsdk.lottie.HWF> zp(Context context, String str, InputStream inputStream, String str2) throws IOException {
        QR qr;
        if (str2 != null && (qr = this.zp) != null) {
            return com.bytedance.adsdk.lottie.QR.zp(context, new ZipInputStream(new FileInputStream(qr.zp(str, inputStream, KS.ZIP))), str);
        }
        return com.bytedance.adsdk.lottie.QR.zp(context, new ZipInputStream(inputStream), (String) null);
    }

    private Bj<com.bytedance.adsdk.lottie.HWF> zp(String str, InputStream inputStream, String str2) throws IOException {
        QR qr;
        if (str2 != null && (qr = this.zp) != null) {
            return com.bytedance.adsdk.lottie.QR.lMd(new FileInputStream(qr.zp(str, inputStream, KS.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.lottie.QR.lMd(inputStream, (String) null);
    }
}
