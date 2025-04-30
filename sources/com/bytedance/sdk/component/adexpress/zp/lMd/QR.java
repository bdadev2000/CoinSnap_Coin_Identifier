package com.bytedance.sdk.component.adexpress.zp.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tG;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR {
    private static volatile QR zp;
    private AtomicBoolean lMd = new AtomicBoolean(false);

    private QR() {
    }

    private JSONObject KS(String str) {
        com.bytedance.sdk.component.adexpress.zp.zp.KS KS = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS();
        if (KS == null) {
            return null;
        }
        com.bytedance.sdk.component.QR.lMd.lMd QR = KS.QR();
        QR.lMd(str);
        com.bytedance.sdk.component.QR.lMd zp2 = QR.zp();
        if (zp2 != null) {
            try {
                if (zp2.HWF() && zp2.jU() != null) {
                    return new JSONObject(zp2.jU());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return HWF.zp().lMd(str);
    }

    public static QR zp() {
        if (zp == null) {
            synchronized (QR.class) {
                try {
                    if (zp == null) {
                        zp = new QR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    private void lMd() {
        if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS() == null) {
            return;
        }
        int zp2 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().zp();
        if (zp2 <= 0) {
            zp2 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.zp.KS.lMd> lMd = HWF.zp().lMd();
        if (lMd == null || lMd.isEmpty() || zp2 >= lMd.size()) {
            if (lMd == null) {
                return;
            }
            lMd.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.zp.KS.lMd lmd : lMd) {
            treeMap.put(lmd.QR(), lmd);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (lMd.size() - (zp2 * 0.75f));
        int i9 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i9 < size) {
                i9++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.zp.KS.lMd lmd2 = (com.bytedance.sdk.component.adexpress.zp.KS.lMd) entry.getValue();
                if (lmd2 != null) {
                    hashSet.add(lmd2.lMd());
                }
            }
        }
        zp(hashSet);
        this.lMd.set(false);
    }

    public com.bytedance.sdk.component.adexpress.zp.KS.lMd zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return HWF.zp().zp(str);
    }

    public void zp(com.bytedance.sdk.component.adexpress.zp.KS.jU jUVar, String str) {
        String str2;
        if (jUVar == null) {
            tG.zp("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str3 = jUVar.zp;
        final String str4 = jUVar.KS;
        final String str5 = jUVar.lMd;
        final String str6 = jUVar.jU;
        final String str7 = jUVar.COT;
        if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS() != null) {
            str2 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().ku();
        } else {
            str2 = "";
        }
        final String str8 = TextUtils.isEmpty(str) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            tG.zp("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.adexpress.jU.KS.zp(new com.bytedance.sdk.component.ku.ku("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.zp.lMd.QR.1
                @Override // java.lang.Runnable
                public void run() {
                    QR.this.zp(str3, str4, str5, str6, str7, str8);
                }
            }, 10);
        }
    }

    private void lMd(String str, String str2, String str3, String str4, String str5, String str6) {
        HWF.zp().zp(new com.bytedance.sdk.component.adexpress.zp.KS.lMd().zp(str).lMd(str2).KS(str3).jU(str4).COT(str5).HWF(str6).zp(Long.valueOf(System.currentTimeMillis())), false);
        lMd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zp(String str, String str2, String str3, String str4, String str5, String str6) {
        if (zp(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                lMd(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4)) {
            zp(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            zp(str2, str6, str);
        } else {
            lMd(str6, str, str3, str2, str4, str5);
        }
        boolean zp2 = ku.zp(str5);
        if (!lMd.COT() || zp2) {
            COT.lMd().zp(true);
        }
    }

    private void zp(String str, String str2, String str3) {
        JSONObject KS;
        if (TextUtils.isEmpty(str) || (KS = KS(str)) == null) {
            return;
        }
        String optString = KS.optString("md5");
        String optString2 = KS.optString("version");
        String optString3 = KS.optString(DataSchemeDataSource.SCHEME_DATA);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zp.KS.lMd zp2 = new com.bytedance.sdk.component.adexpress.zp.KS.lMd().zp(str2).lMd(str3).KS(optString).jU(str).COT(optString3).HWF(optString2).zp(Long.valueOf(System.currentTimeMillis()));
        HWF.zp().zp(zp2, false);
        lMd();
        if (ku.zp(optString2)) {
            zp2.HWF(optString2);
            COT.lMd().zp(true);
        }
    }

    public void zp(Set<String> set) {
        try {
            HWF.zp().zp(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
