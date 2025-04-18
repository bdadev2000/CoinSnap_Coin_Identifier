package com.bytedance.sdk.component.adexpress.YFl.Sg;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW {
    private static volatile DSW YFl;
    private AtomicBoolean Sg = new AtomicBoolean(false);

    private DSW() {
    }

    private JSONObject tN(String str) {
        com.bytedance.sdk.component.adexpress.YFl.YFl.tN tN = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN();
        if (tN == null) {
            return null;
        }
        com.bytedance.sdk.component.DSW.Sg.Sg DSW = tN.DSW();
        DSW.Sg(str);
        com.bytedance.sdk.component.DSW.Sg YFl2 = DSW.YFl();
        if (YFl2 != null) {
            try {
                if (YFl2.vc() && YFl2.AlY() != null) {
                    return new JSONObject(YFl2.AlY());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> Sg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return vc.YFl().Sg(str);
    }

    public static DSW YFl() {
        if (YFl == null) {
            synchronized (DSW.class) {
                if (YFl == null) {
                    YFl = new DSW();
                }
            }
        }
        return YFl;
    }

    private void Sg() {
        if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() == null) {
            return;
        }
        int YFl2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().YFl();
        if (YFl2 <= 0) {
            YFl2 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.YFl.tN.Sg> Sg = vc.YFl().Sg();
        if (Sg == null || Sg.isEmpty() || YFl2 >= Sg.size()) {
            if (Sg == null) {
                return;
            }
            Sg.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.YFl.tN.Sg sg2 : Sg) {
            treeMap.put(sg2.DSW(), sg2);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (Sg.size() - (YFl2 * 0.75f));
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                ((Long) entry.getKey()).longValue();
                com.bytedance.sdk.component.adexpress.YFl.tN.Sg sg3 = (com.bytedance.sdk.component.adexpress.YFl.tN.Sg) entry.getValue();
                if (sg3 != null) {
                    hashSet.add(sg3.Sg());
                }
            }
        }
        YFl(hashSet);
        this.Sg.set(false);
    }

    public com.bytedance.sdk.component.adexpress.YFl.tN.Sg YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return vc.YFl().YFl(str);
    }

    public void YFl(com.bytedance.sdk.component.adexpress.YFl.tN.AlY alY, String str) {
        if (alY == null) {
            YoT.YFl("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = alY.YFl;
        final String str3 = alY.tN;
        final String str4 = alY.Sg;
        final String str5 = alY.AlY;
        final String str6 = alY.wN;
        final String qsH = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() != null ? com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().qsH() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            YoT.YFl("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.adexpress.AlY.AlY.YFl(new com.bytedance.sdk.component.qsH.qsH("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.YFl.Sg.DSW.1
                @Override // java.lang.Runnable
                public void run() {
                    DSW.this.YFl(str2, str3, str4, str5, str6, qsH);
                }
            }, 10);
        }
    }

    private void Sg(String str, String str2, String str3, String str4, String str5, String str6) {
        vc.YFl().YFl(new com.bytedance.sdk.component.adexpress.YFl.tN.Sg().YFl(str).Sg(str2).tN(str3).AlY(str4).wN(str5).vc(str6).YFl(Long.valueOf(System.currentTimeMillis())), false);
        Sg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void YFl(String str, String str2, String str3, String str4, String str5, String str6) {
        if (YFl(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                Sg(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4)) {
            YFl(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            YFl(str2, str6, str);
        } else {
            Sg(str6, str, str3, str2, str4, str5);
        }
        boolean YFl2 = qsH.YFl(str5);
        if (!Sg.wN() || YFl2) {
            wN.Sg().YFl(true);
        }
    }

    private void YFl(String str, String str2, String str3) {
        JSONObject tN;
        if (TextUtils.isEmpty(str) || (tN = tN(str)) == null) {
            return;
        }
        String optString = tN.optString("md5");
        String optString2 = tN.optString("version");
        String optString3 = tN.optString(DataSchemeDataSource.SCHEME_DATA);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.YFl.tN.Sg YFl2 = new com.bytedance.sdk.component.adexpress.YFl.tN.Sg().YFl(str2).Sg(str3).tN(optString).AlY(str).wN(optString3).vc(optString2).YFl(Long.valueOf(System.currentTimeMillis()));
        vc.YFl().YFl(YFl2, false);
        Sg();
        if (qsH.YFl(optString2)) {
            YFl2.vc(optString2);
            wN.Sg().YFl(true);
        }
    }

    public void YFl(Set<String> set) {
        try {
            vc.YFl().YFl(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
