package com.bytedance.sdk.component.adexpress.YFl.Sg;

import com.bytedance.sdk.component.utils.YoT;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    private static com.bytedance.sdk.component.adexpress.YFl.tN.YFl YFl;

    public static void AlY() {
        tN.Sg(wN.qsH(), Sg(), "temp_pkg_info.json");
        YFl = null;
    }

    public static synchronized com.bytedance.sdk.component.adexpress.YFl.tN.YFl Sg() {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl;
        synchronized (qsH.class) {
            yFl = YFl;
        }
        return yFl;
    }

    public static void YFl() {
        FileInputStream fileInputStream;
        Throwable th2;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(wN.qsH(), "temp_pkg_info.json");
            Long valueOf = Long.valueOf(file.length());
            if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.YFl.tN.YFl YFl2 = com.bytedance.sdk.component.adexpress.YFl.tN.YFl.YFl(new JSONObject(new String(bArr, "utf-8")));
                    if (YFl2 != null) {
                        YFl = YFl2;
                        YFl2.tN();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        YoT.YFl("Version", "version init error", th2);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th4;
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
        }
    }

    public static void tN() {
        tN.YFl(wN.qsH(), Sg(), "temp_pkg_info.json");
    }

    public static boolean Sg(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl) {
        return tN.tN(Sg(), yFl);
    }

    public static synchronized void YFl(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl) {
        synchronized (qsH.class) {
            if (yFl != null) {
                if (yFl.DSW()) {
                    YFl = yFl;
                }
            }
        }
    }

    public static boolean YFl(String str) {
        return tN.YFl(Sg(), str);
    }
}
