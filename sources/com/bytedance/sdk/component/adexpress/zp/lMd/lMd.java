package com.bytedance.sdk.component.adexpress.zp.lMd;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.jU.ku;
import com.bytedance.sdk.component.adexpress.zp.KS.zp;
import com.bytedance.sdk.component.utils.tG;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    static Object zp = new Object();

    public static boolean COT() {
        return COT.lMd().COT();
    }

    @Deprecated
    private static String HWF() {
        com.bytedance.sdk.component.adexpress.zp.KS.zp jU = jU();
        if (jU == null) {
            return null;
        }
        return jU.jU();
    }

    public static String KS() {
        return HWF.KS();
    }

    private static File QR(String str) {
        List<Pair<String, String>> lMd;
        zp.lMd COT = jU().COT();
        if (COT == null || (lMd = COT.lMd()) == null || lMd.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : lMd) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(COT.ku(), (String) pair.first);
            }
        }
        return null;
    }

    public static com.bytedance.sdk.component.adexpress.zp.KS.zp jU() {
        return COT.lMd().HWF();
    }

    public static void lMd() {
        try {
            ku.jU();
            File ku = COT.ku();
            if (ku == null || !ku.exists()) {
                return;
            }
            if (ku.getParentFile() != null) {
                com.bytedance.sdk.component.utils.HWF.KS(ku.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.HWF.KS(ku);
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp() {
        COT.lMd();
    }

    private static boolean COT(String str) {
        com.bytedance.sdk.component.adexpress.zp.KS.zp jU;
        List<zp.C0085zp> HWF;
        if (!COT() || (jU = jU()) == null || (HWF = jU.HWF()) == null) {
            return false;
        }
        for (zp.C0085zp c0085zp : HWF) {
            if (c0085zp != null && TextUtils.equals(str, c0085zp.zp())) {
                return true;
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.zp.KS.lMd KS(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.zp.KS.lMd zp2 = QR.zp().zp(str);
        if (zp2 != null) {
            zp2.zp(Long.valueOf(System.currentTimeMillis()));
            zp(zp2);
        }
        return zp2;
    }

    public static String jU(String str) {
        com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar;
        com.bytedance.sdk.component.adexpress.zp.KS.zp jU = jU();
        if (jU == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp2 = jU.zp();
            if (zp2 == null || zp2.size() <= 0 || (zpVar = zp2.get(str)) == null) {
                return null;
            }
            return zpVar.jU();
        }
        return HWF();
    }

    public static com.bytedance.sdk.component.adexpress.zp.KS.lMd zp(String str) {
        return QR.zp().zp(str);
    }

    private static File HWF(String str) {
        if (!COT()) {
            return null;
        }
        for (zp.C0085zp c0085zp : jU().HWF()) {
            if (c0085zp.zp() != null && c0085zp.zp().equals(str)) {
                File file = new File(COT.ku(), com.bytedance.sdk.component.utils.COT.zp(c0085zp.zp()));
                String zp2 = com.bytedance.sdk.component.utils.COT.zp(file);
                if (c0085zp.lMd() == null || !c0085zp.lMd().equals(zp2)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static void zp(com.bytedance.sdk.component.adexpress.zp.KS.jU jUVar) {
        QR.zp().zp(jUVar, jUVar.HWF);
    }

    private static void zp(final com.bytedance.sdk.component.adexpress.zp.KS.lMd lmd) {
        com.bytedance.sdk.component.adexpress.jU.KS.zp(new com.bytedance.sdk.component.ku.ku("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.zp.lMd.lMd.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (lMd.zp) {
                    HWF.zp().zp(lmd, true);
                }
            }
        }, 10);
    }

    public static zp zp(String str, ku.zp zpVar, String str2, String str3) {
        File file;
        zp zpVar2 = new zp();
        if (TextUtils.isEmpty(str3)) {
            file = null;
        } else {
            file = lMd(str3, str);
            if (file != null) {
                zpVar2.zp(1);
            }
        }
        if (file == null && (file = QR(str)) != null) {
            zpVar2.zp(3);
        }
        if (file == null && (file = HWF(str)) != null) {
            zpVar2.zp(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!zp(str, str3)) {
                zpVar2.zp(4);
            }
        } else if (!COT(str)) {
            zpVar2.zp(6);
        }
        zpVar2.lMd();
        if (file != null) {
            try {
                zpVar2.zp(new WebResourceResponse(zpVar.zp(), "utf-8", new FileInputStream(file)));
            } catch (Throwable th) {
                tG.zp("TTDynamic", "get html WebResourceResponse error", th);
            }
        }
        return zpVar2;
    }

    public static Set<String> lMd(String str) {
        return QR.zp().lMd(str);
    }

    private static File lMd(String str, String str2) {
        com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar;
        com.bytedance.sdk.component.adexpress.zp.KS.zp jU = jU();
        if (jU == null || !COT()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp2 = jU.zp();
        if (zp2.size() == 0 || (zpVar = zp2.get(str)) == null) {
            return null;
        }
        for (zp.C0085zp c0085zp : zpVar.HWF()) {
            if (c0085zp.zp() != null && c0085zp.zp().equals(str2)) {
                File file = new File(COT.ku(), com.bytedance.sdk.component.utils.COT.zp(c0085zp.zp()));
                String zp3 = com.bytedance.sdk.component.utils.COT.zp(file);
                if (c0085zp.lMd() == null || !c0085zp.lMd().equals(zp3)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean lMd(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                    if (optJSONObject == null || (opt = optJSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean zp(String str, String str2) {
        com.bytedance.sdk.component.adexpress.zp.KS.zp jU;
        com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar;
        if (!COT() || (jU = jU()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp2 = jU.zp();
        if (zp2.size() == 0 || (zpVar = zp2.get(str2)) == null) {
            return false;
        }
        for (zp.C0085zp c0085zp : zpVar.HWF()) {
            if (c0085zp != null && TextUtils.equals(str, c0085zp.zp())) {
                return true;
            }
        }
        return false;
    }

    public static boolean zp(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }
}
