package com.bytedance.sdk.openadsdk.core.ugen.zp;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class lMd {
    private static volatile lMd zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(int i9, String str, String str2);

        void zp(JSONObject jSONObject, String str);
    }

    private void lMd(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.ugen.zp.zp zpVar = new com.bytedance.sdk.openadsdk.core.ugen.zp.zp();
        zpVar.KS(str).COT(str3).jU(str4).lMd(str2).zp(str5).zp(Long.valueOf(System.currentTimeMillis()));
        KS.zp().zp(zpVar);
        lMd();
    }

    public static lMd zp() {
        if (zp == null) {
            synchronized (lMd.class) {
                try {
                    if (zp == null) {
                        zp = new lMd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.ugen.COT.zp zpVar, String str) {
        if (zpVar == null) {
            return;
        }
        if (TextUtils.isEmpty(zpVar.zp())) {
            tG.zp("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        StringBuilder c9 = AbstractC2965e.c(str, "_");
        c9.append(zpVar.zp());
        final String sb = c9.toString();
        final String KS = zpVar.KS();
        final String lMd = zpVar.lMd();
        final String jU = zpVar.jU();
        String COT = zpVar.COT();
        if (TextUtils.isEmpty(COT) && str.equals("ad")) {
            COT = ku.lMd().jU();
        }
        final String str2 = COT;
        QUv.zp(new com.bytedance.sdk.component.ku.ku("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.1
            @Override // java.lang.Runnable
            public void run() {
                lMd.this.zp(sb, KS, lMd, jU, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd() {
        int jU = KVG.jU().jU();
        if (jU <= 0) {
            jU = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.ugen.zp.zp> lMd = KS.zp().lMd();
        if (lMd == null || lMd.isEmpty() || jU >= lMd.size()) {
            if (lMd == null) {
                return;
            }
            lMd.size();
            return;
        }
        int size = (int) (lMd.size() - (jU * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.ugen.zp.zp zpVar : lMd) {
            treeMap.put(zpVar.jU(), zpVar);
        }
        HashSet hashSet = new HashSet();
        int i9 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i9 < size) {
                i9++;
                com.bytedance.sdk.openadsdk.core.ugen.zp.zp zpVar2 = (com.bytedance.sdk.openadsdk.core.ugen.zp.zp) entry.getValue();
                if (zpVar2 != null) {
                    hashSet.add(zpVar2.zp());
                }
            }
        }
        zp(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str, String str2, String str3, String str4, String str5) {
        if (zp(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            lMd(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            zp(str2, str, str3, str5, (zp) null);
        } else {
            lMd(str2, str3, str5, str4, str);
        }
    }

    public void zp(String str, String str2, String str3, String str4, String str5, final zp zpVar) {
        String k6 = o.k(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.ugen.zp.zp zp2 = zp(k6, str4);
        if (zp2 != null && !TextUtils.isEmpty(zp2.COT())) {
            zp(zp2);
            if (zpVar != null) {
                try {
                    zpVar.zp(new JSONObject(zp2.COT()), ImagesContract.LOCAL);
                    return;
                } catch (JSONException unused) {
                    zpVar.zp(2, "parse json exception data is " + zp2.COT(), ImagesContract.LOCAL);
                    return;
                }
            }
            return;
        }
        zp(str2, k6, str4, str5, new zp() { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.2
            @Override // com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp
            public void zp(JSONObject jSONObject, String str6) {
                zp zpVar2 = zpVar;
                if (zpVar2 != null) {
                    zpVar2.zp(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp
            public void zp(int i9, String str6, String str7) {
                zp zpVar2 = zpVar;
                if (zpVar2 != null) {
                    zpVar2.zp(i9, str6, str7);
                }
            }
        });
    }

    private void zp(final String str, final String str2, final String str3, final String str4, final zp zpVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (zpVar != null) {
                zpVar.zp(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
            KS.lMd(str);
            KS.zp(7);
            KS.zp("load_ug_t");
            KS.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.3
                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                    if (lmd == null) {
                        return;
                    }
                    if (lmd.HWF()) {
                        String jU = lmd.jU();
                        if (TextUtils.isEmpty(jU)) {
                            zp zpVar2 = zpVar;
                            if (zpVar2 != null) {
                                zpVar2.zp(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        KS.zp().zp(new com.bytedance.sdk.openadsdk.core.ugen.zp.zp().zp(str2).lMd(str3).KS(str).COT(str4).jU(jU).zp(Long.valueOf(System.currentTimeMillis())));
                        lMd.this.lMd();
                        if (zpVar != null) {
                            try {
                                zpVar.zp(new JSONObject(jU), "net");
                                return;
                            } catch (JSONException unused) {
                                zpVar.zp(2, "parse json exception data is".concat(String.valueOf(jU)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    zp zpVar3 = zpVar;
                    if (zpVar3 != null) {
                        zpVar3.zp(3, "net code error code is " + lmd.zp() + " message is " + lmd.lMd(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                    zp zpVar2 = zpVar;
                    if (zpVar2 != null) {
                        zpVar2.zp(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.ugen.zp.zp> zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return KS.zp().zp(str);
    }

    public String zp(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.ugen.zp.zp zp2 = zp(o.k(str, "_", str2), str3);
        if (zp2 == null) {
            return null;
        }
        zp(zp2);
        return zp2.COT();
    }

    private com.bytedance.sdk.openadsdk.core.ugen.zp.zp zp(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return KS.zp().zp(str, str2);
    }

    private void zp(final com.bytedance.sdk.openadsdk.core.ugen.zp.zp zpVar) {
        zpVar.zp(Long.valueOf(System.currentTimeMillis()));
        QUv.zp(new com.bytedance.sdk.component.ku.ku("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.4
            @Override // java.lang.Runnable
            public void run() {
                KS.zp().zp(zpVar);
            }
        }, 10);
    }

    public void zp(Set<String> set) {
        try {
            KS.zp().zp(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
