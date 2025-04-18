package com.bytedance.sdk.openadsdk.core.eT.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.google.android.gms.common.internal.ImagesContract;
import eb.j;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private static volatile Sg YFl;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(int i10, String str, String str2);

        void YFl(JSONObject jSONObject, String str);
    }

    private void Sg(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.eT.YFl.YFl yFl = new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl();
        yFl.tN(str).wN(str3).AlY(str4).Sg(str2).YFl(str5).YFl(Long.valueOf(System.currentTimeMillis()));
        tN.YFl().YFl(yFl);
        Sg();
    }

    public String YFl(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.eT.YFl.YFl YFl2 = YFl(a.m(str, "_", str2), str3);
        if (YFl2 == null) {
            return null;
        }
        YFl(YFl2);
        return YFl2.wN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg() {
        int AlY = lG.AlY().AlY();
        if (AlY <= 0) {
            AlY = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> Sg = tN.YFl().Sg();
        if (Sg == null || Sg.isEmpty() || AlY >= Sg.size()) {
            if (Sg == null) {
                return;
            }
            Sg.size();
            return;
        }
        int size = (int) (Sg.size() - (AlY * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.eT.YFl.YFl yFl : Sg) {
            treeMap.put(yFl.AlY(), yFl);
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                com.bytedance.sdk.openadsdk.core.eT.YFl.YFl yFl2 = (com.bytedance.sdk.openadsdk.core.eT.YFl.YFl) entry.getValue();
                if (yFl2 != null) {
                    hashSet.add(yFl2.YFl());
                }
            }
        }
        YFl(hashSet);
    }

    public static Sg YFl() {
        if (YFl == null) {
            synchronized (Sg.class) {
                if (YFl == null) {
                    YFl = new Sg();
                }
            }
        }
        return YFl;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl, String str) {
        if (yFl == null) {
            return;
        }
        if (TextUtils.isEmpty(yFl.YFl())) {
            YoT.YFl("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        StringBuilder n10 = j.n(str, "_");
        n10.append(yFl.YFl());
        final String sb2 = n10.toString();
        final String tN = yFl.tN();
        final String Sg = yFl.Sg();
        final String AlY = yFl.AlY();
        String wN = yFl.wN();
        if (TextUtils.isEmpty(wN)) {
            if (str.equals("ad")) {
                wN = NjR.Sg().AlY();
            } else if (str.equals("adv3")) {
                wN = NjR.Sg().AlY() + "_v3";
            }
        }
        final String str2 = wN;
        mn.YFl(new qsH("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                Sg.this.YFl(sb2, tN, Sg, AlY, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str, String str2, String str3, String str4, String str5) {
        if (YFl(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            Sg(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            YFl(str2, str, str3, str5, (YFl) null);
        } else {
            Sg(str2, str3, str5, str4, str);
        }
    }

    public void YFl(String str, String str2, String str3, String str4, String str5, final YFl yFl) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (yFl != null) {
                yFl.YFl(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String m10 = a.m(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.eT.YFl.YFl YFl2 = YFl(m10, str4);
        if (YFl2 != null && !TextUtils.isEmpty(YFl2.wN())) {
            YFl(YFl2);
            if (yFl != null) {
                try {
                    yFl.YFl(new JSONObject(YFl2.wN()), ImagesContract.LOCAL);
                    return;
                } catch (JSONException unused) {
                    yFl.YFl(2, "parse json exception data is " + YFl2.wN(), ImagesContract.LOCAL);
                    return;
                }
            }
            return;
        }
        YFl(str2, m10, str4, str5, new YFl() { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.2
            @Override // com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl
            public void YFl(JSONObject jSONObject, String str6) {
                YFl yFl2 = yFl;
                if (yFl2 != null) {
                    yFl2.YFl(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl
            public void YFl(int i10, String str6, String str7) {
                YFl yFl2 = yFl;
                if (yFl2 != null) {
                    yFl2.YFl(i10, str6, str7);
                }
            }
        });
    }

    private void YFl(final String str, final String str2, final String str3, final String str4, final YFl yFl) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (yFl != null) {
                yFl.YFl(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
            tN.Sg(str);
            tN.YFl(7);
            tN.YFl("load_ug_t");
            tN.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.3
                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                    if (sg2 == null) {
                        return;
                    }
                    if (sg2.vc()) {
                        String AlY = sg2.AlY();
                        if (TextUtils.isEmpty(AlY)) {
                            YFl yFl2 = yFl;
                            if (yFl2 != null) {
                                yFl2.YFl(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        tN.YFl().YFl(new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl().YFl(str2).Sg(str3).tN(str).wN(str4).AlY(AlY).YFl(Long.valueOf(System.currentTimeMillis())));
                        Sg.this.Sg();
                        if (yFl != null) {
                            try {
                                yFl.YFl(new JSONObject(AlY), "net");
                                return;
                            } catch (JSONException unused) {
                                yFl.YFl(2, "parse json exception data is".concat(String.valueOf(AlY)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    YFl yFl3 = yFl;
                    if (yFl3 != null) {
                        yFl3.YFl(3, "net code error code is " + sg2.YFl() + " message is " + sg2.Sg(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                    YFl yFl2 = yFl;
                    if (yFl2 != null) {
                        yFl2.YFl(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return tN.YFl().YFl(str);
    }

    private com.bytedance.sdk.openadsdk.core.eT.YFl.YFl YFl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return tN.YFl().YFl(str, str2);
    }

    private void YFl(final com.bytedance.sdk.openadsdk.core.eT.YFl.YFl yFl) {
        yFl.YFl(Long.valueOf(System.currentTimeMillis()));
        mn.YFl(new qsH("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.4
            @Override // java.lang.Runnable
            public void run() {
                tN.YFl().YFl(yFl);
            }
        }, 10);
    }

    public void YFl(Set<String> set) {
        try {
            tN.YFl().YFl(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
