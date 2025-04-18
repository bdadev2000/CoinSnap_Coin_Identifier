package com.bytedance.adsdk.Sg.AlY;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.Sg.YoT;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class qsH {
    private final vc Sg;
    private final DSW YFl;

    public qsH(DSW dsw, vc vcVar) {
        this.YFl = dsw;
        this.Sg = vcVar;
    }

    @WorkerThread
    private com.bytedance.adsdk.Sg.DSW Sg(Context context, String str, String str2) {
        DSW dsw;
        Pair<tN, InputStream> YFl;
        YoT<com.bytedance.adsdk.Sg.DSW> Sg;
        if (str2 == null || (dsw = this.YFl) == null || (YFl = dsw.YFl(str)) == null) {
            return null;
        }
        tN tNVar = (tN) YFl.first;
        InputStream inputStream = (InputStream) YFl.second;
        if (tNVar == tN.ZIP) {
            Sg = com.bytedance.adsdk.Sg.qsH.YFl(context, new ZipInputStream(inputStream), str2);
        } else {
            Sg = com.bytedance.adsdk.Sg.qsH.Sg(inputStream, str2);
        }
        if (Sg.YFl() != null) {
            return Sg.YFl();
        }
        return null;
    }

    @WorkerThread
    private YoT<com.bytedance.adsdk.Sg.DSW> tN(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                AlY YFl = this.Sg.YFl(str);
                if (YFl.YFl()) {
                    YoT<com.bytedance.adsdk.Sg.DSW> YFl2 = YFl(context, str, YFl.Sg(), YFl.tN(), str2);
                    YFl2.YFl();
                    try {
                        YFl.close();
                    } catch (IOException unused) {
                    }
                    return YFl2;
                }
                YoT<com.bytedance.adsdk.Sg.DSW> yoT = new YoT<>(new IllegalArgumentException(YFl.AlY()));
                try {
                    YFl.close();
                } catch (IOException unused2) {
                }
                return yoT;
            } catch (Exception e2) {
                YoT<com.bytedance.adsdk.Sg.DSW> yoT2 = new YoT<>(e2);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return yoT2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @WorkerThread
    public YoT<com.bytedance.adsdk.Sg.DSW> YFl(Context context, String str, String str2) {
        com.bytedance.adsdk.Sg.DSW Sg = Sg(context, str, str2);
        if (Sg != null) {
            return new YoT<>(Sg);
        }
        return tN(context, str, str2);
    }

    private YoT<com.bytedance.adsdk.Sg.DSW> YFl(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        YoT<com.bytedance.adsdk.Sg.DSW> YFl;
        tN tNVar;
        DSW dsw;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            tNVar = tN.JSON;
            YFl = YFl(str, inputStream, str3);
        } else {
            tN tNVar2 = tN.ZIP;
            YFl = YFl(context, str, inputStream, str3);
            tNVar = tNVar2;
        }
        if (str3 != null && YFl.YFl() != null && (dsw = this.YFl) != null) {
            dsw.YFl(str, tNVar);
        }
        return YFl;
    }

    private YoT<com.bytedance.adsdk.Sg.DSW> YFl(Context context, String str, InputStream inputStream, String str2) throws IOException {
        DSW dsw;
        if (str2 != null && (dsw = this.YFl) != null) {
            return com.bytedance.adsdk.Sg.qsH.YFl(context, new ZipInputStream(new FileInputStream(dsw.YFl(str, inputStream, tN.ZIP))), str);
        }
        return com.bytedance.adsdk.Sg.qsH.YFl(context, new ZipInputStream(inputStream), (String) null);
    }

    private YoT<com.bytedance.adsdk.Sg.DSW> YFl(String str, InputStream inputStream, String str2) throws IOException {
        DSW dsw;
        if (str2 != null && (dsw = this.YFl) != null) {
            return com.bytedance.adsdk.Sg.qsH.Sg(new FileInputStream(dsw.YFl(str, inputStream, tN.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.Sg.qsH.Sg(inputStream, (String) null);
    }
}
