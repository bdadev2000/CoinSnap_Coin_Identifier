package com.bytedance.sdk.component.adexpress.YFl.Sg;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.AlY.nc;
import com.bytedance.sdk.component.adexpress.YFl.tN.YFl;
import com.bytedance.sdk.component.utils.YoT;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    static Object YFl = new Object();

    public static com.bytedance.sdk.component.adexpress.YFl.tN.YFl AlY() {
        return wN.Sg().vc();
    }

    private static File DSW(String str) {
        List<Pair<String, String>> Sg;
        YFl.Sg wN = AlY().wN();
        if (wN == null || (Sg = wN.Sg()) == null || Sg.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : Sg) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(wN.qsH(), (String) pair.first);
            }
        }
        return null;
    }

    public static void Sg() {
        try {
            qsH.AlY();
            File qsH = wN.qsH();
            if (qsH == null || !qsH.exists()) {
                return;
            }
            if (qsH.getParentFile() != null) {
                com.bytedance.sdk.component.utils.vc.tN(qsH.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.vc.tN(qsH);
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl() {
        wN.Sg();
    }

    public static String tN() {
        return vc.tN();
    }

    @Deprecated
    private static String vc() {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl AlY = AlY();
        if (AlY == null) {
            return null;
        }
        return AlY.AlY();
    }

    public static boolean wN() {
        return wN.Sg().wN();
    }

    public static String AlY(String str) {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl;
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl AlY = AlY();
        if (AlY == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl2 = AlY.YFl();
            if (YFl2 == null || YFl2.size() <= 0 || (yFl = YFl2.get(str)) == null) {
                return null;
            }
            return yFl.AlY();
        }
        return vc();
    }

    public static com.bytedance.sdk.component.adexpress.YFl.tN.Sg YFl(String str) {
        return DSW.YFl().YFl(str);
    }

    public static com.bytedance.sdk.component.adexpress.YFl.tN.Sg tN(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.YFl.tN.Sg YFl2 = DSW.YFl().YFl(str);
        if (YFl2 != null) {
            YFl2.YFl(Long.valueOf(System.currentTimeMillis()));
            YFl(YFl2);
        }
        return YFl2;
    }

    private static boolean wN(String str) {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl AlY;
        List<YFl.C0082YFl> vc2;
        if (!wN() || (AlY = AlY()) == null || (vc2 = AlY.vc()) == null) {
            return false;
        }
        for (YFl.C0082YFl c0082YFl : vc2) {
            if (c0082YFl != null && TextUtils.equals(str, c0082YFl.YFl())) {
                return true;
            }
        }
        return false;
    }

    public static void YFl(com.bytedance.sdk.component.adexpress.YFl.tN.AlY alY) {
        DSW.YFl().YFl(alY, alY.f10361vc);
    }

    private static File vc(String str) {
        if (!wN()) {
            return null;
        }
        for (YFl.C0082YFl c0082YFl : AlY().vc()) {
            if (c0082YFl.YFl() != null && c0082YFl.YFl().equals(str)) {
                File file = new File(wN.qsH(), com.bytedance.sdk.component.utils.wN.YFl(c0082YFl.YFl()));
                String YFl2 = com.bytedance.sdk.component.utils.wN.YFl(file);
                if (c0082YFl.Sg() == null || !c0082YFl.Sg().equals(YFl2)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    private static void YFl(final com.bytedance.sdk.component.adexpress.YFl.tN.Sg sg2) {
        com.bytedance.sdk.component.adexpress.AlY.AlY.YFl(new com.bytedance.sdk.component.qsH.qsH("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (Sg.YFl) {
                    vc.YFl().YFl(sg2, true);
                }
            }
        }, 10);
    }

    public static YFl YFl(String str, nc.YFl yFl, String str2, String str3) {
        File file;
        YFl yFl2 = new YFl();
        if (TextUtils.isEmpty(str3)) {
            file = null;
        } else {
            file = Sg(str3, str);
            if (file != null) {
                yFl2.YFl(1);
            }
        }
        if (file == null && (file = DSW(str)) != null) {
            yFl2.YFl(3);
        }
        if (file == null && (file = vc(str)) != null) {
            yFl2.YFl(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!YFl(str, str3)) {
                yFl2.YFl(4);
            }
        } else if (!wN(str)) {
            yFl2.YFl(6);
        }
        yFl2.Sg();
        if (file != null) {
            try {
                yFl2.YFl(new WebResourceResponse(yFl.YFl(), "utf-8", new FileInputStream(file)));
            } catch (Throwable th2) {
                YoT.YFl("TTDynamic", "get html WebResourceResponse error", th2);
            }
        }
        return yFl2;
    }

    public static boolean tN(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
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

    public static Set<String> Sg(String str) {
        return DSW.YFl().Sg(str);
    }

    private static File Sg(String str, String str2) {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl;
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl AlY = AlY();
        if (AlY == null || !wN()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl2 = AlY.YFl();
        if (YFl2.size() == 0 || (yFl = YFl2.get(str)) == null) {
            return null;
        }
        for (YFl.C0082YFl c0082YFl : yFl.vc()) {
            if (c0082YFl.YFl() != null && c0082YFl.YFl().equals(str2)) {
                File file = new File(wN.qsH(), com.bytedance.sdk.component.utils.wN.YFl(c0082YFl.YFl()));
                String YFl3 = com.bytedance.sdk.component.utils.wN.YFl(file);
                if (c0082YFl.Sg() == null || !c0082YFl.Sg().equals(YFl3)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean Sg(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }

    private static boolean YFl(String str, String str2) {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl AlY;
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl;
        if (!wN() || (AlY = AlY()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl2 = AlY.YFl();
        if (YFl2.size() == 0 || (yFl = YFl2.get(str2)) == null) {
            return false;
        }
        for (YFl.C0082YFl c0082YFl : yFl.vc()) {
            if (c0082YFl != null && TextUtils.equals(str, c0082YFl.YFl())) {
                return true;
            }
        }
        return false;
    }

    public static boolean YFl(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }
}
