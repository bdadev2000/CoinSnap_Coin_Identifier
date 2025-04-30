package com.bytedance.sdk.component.adexpress.zp.lMd;

import com.bytedance.sdk.component.utils.tG;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    private static com.bytedance.sdk.component.adexpress.zp.KS.zp zp;

    public static void KS() {
        KS.zp(COT.ku(), lMd(), "temp_pkg_info.json");
    }

    public static void jU() {
        KS.lMd(COT.ku(), lMd(), "temp_pkg_info.json");
        zp = null;
    }

    public static synchronized com.bytedance.sdk.component.adexpress.zp.KS.zp lMd() {
        com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar;
        synchronized (ku.class) {
            zpVar = zp;
        }
        return zpVar;
    }

    public static void zp() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(COT.ku(), "temp_pkg_info.json");
            long length = file.length();
            Long valueOf = Long.valueOf(length);
            if (length > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.zp.KS.zp zp2 = com.bytedance.sdk.component.adexpress.zp.KS.zp.zp(new JSONObject(new String(bArr, "utf-8")));
                    if (zp2 != null) {
                        zp = zp2;
                        zp2.KS();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        tG.zp("Version", "version init error", th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th3;
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
        }
    }

    public static boolean lMd(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar) {
        return KS.KS(lMd(), zpVar);
    }

    public static synchronized void zp(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar) {
        synchronized (ku.class) {
            if (zpVar != null) {
                if (zpVar.QR()) {
                    zp = zpVar;
                }
            }
        }
    }

    public static boolean zp(String str) {
        return KS.zp(lMd(), str);
    }
}
