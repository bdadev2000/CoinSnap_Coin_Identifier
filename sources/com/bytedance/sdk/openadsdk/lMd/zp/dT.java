package com.bytedance.sdk.openadsdk.lMd.zp;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.dT.KS.lMd;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT implements com.bytedance.sdk.component.HWF.zp.lMd.KS {
    private final KS lMd = KS.zp();
    public woN<com.bytedance.sdk.openadsdk.lMd.zp> zp;

    private boolean KS(List<com.bytedance.sdk.openadsdk.lMd.zp> list) {
        JSONObject KS;
        if (list == null || list.size() == 0 || (KS = list.get(0).KS()) == null) {
            return true;
        }
        return TextUtils.isEmpty(KS.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.HWF.zp.jU.zp>> jU(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        HashMap<String, List<com.bytedance.sdk.component.HWF.zp.jU.zp>> hashMap = new HashMap<>();
        new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.bytedance.sdk.component.HWF.zp.jU.zp zpVar = list.get(i9);
            JSONObject QR = zpVar.QR();
            if (QR != null) {
                String optString = QR.optString("app_log_url");
                List<com.bytedance.sdk.component.HWF.zp.jU.zp> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(zpVar);
            }
        }
        return hashMap;
    }

    public com.bytedance.sdk.openadsdk.lMd.COT lMd(List<lMd.zp> list) {
        if (this.zp == null) {
            this.zp = KVG.KS();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.Bj.zp()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<lMd.zp> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().lMd);
                }
                jSONObject.put("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                jSONObject.put(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.COT.zp(String.valueOf(currentTimeMillis).concat("stats_list")));
            } catch (Exception unused) {
            }
            return this.zp.zp(jSONObject);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.lMd.KS
    public void zp(final List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, @Nullable final com.bytedance.sdk.component.HWF.zp.lMd.lMd lmd) {
        com.bytedance.sdk.component.HWF.zp.jU.zp zpVar;
        if (list == null || list.isEmpty() || (zpVar = list.get(0)) == null) {
            return;
        }
        byte jU = zpVar.jU();
        final ArrayList arrayList = new ArrayList();
        if (jU == 0) {
            QUv.zp(new com.bytedance.sdk.component.ku.KS.lMd(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.lMd.zp.dT.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = dT.this.jU(list).entrySet().iterator();
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.zp("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.HWF.zp.lMd.lMd lmd2 = lmd;
                        if (lmd2 != null) {
                            lmd2.zp(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            zp.zp(zp.jU);
                            List<com.bytedance.sdk.component.HWF.zp.jU.zp> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.HWF.zp.jU.zp zpVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.lMd.zp(zpVar2.KS(), zpVar2.QR()));
                            }
                            com.bytedance.sdk.openadsdk.lMd.COT zp = dT.this.zp(arrayList2);
                            if (lmd != null && zp != null) {
                                boolean z8 = zp.jU;
                                if (dT.this.zp(arrayList2, zp)) {
                                    z8 = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.HWF.zp.lMd.KS.zp(new com.bytedance.sdk.component.HWF.zp.lMd.KS.lMd(zp.zp, zp.lMd, zp.KS, z8, ""), list2));
                                if (zp.lMd == 200) {
                                    zp.zp(zp.jU, true);
                                } else if (z8) {
                                    zp.zp(zp.jU, false);
                                }
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.tG.zp("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.HWF.zp.lMd.lMd lmd3 = lmd;
                    if (lmd3 != null) {
                        lmd3.zp(arrayList);
                    }
                }
            });
            return;
        }
        if (jU == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.HWF.zp.jU.zp zpVar2 : list) {
                arrayList2.add(new lMd.zp(zpVar2.KS(), zpVar2.QR()));
            }
            zp.zp(zp.COT);
            if (arrayList2.size() > 0) {
                QUv.zp(new com.bytedance.sdk.component.ku.KS.lMd(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.lMd.zp.dT.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.lMd.COT lMd = dT.this.lMd(arrayList2);
                        if (lmd != null && lMd != null) {
                            arrayList.add(new com.bytedance.sdk.component.HWF.zp.lMd.KS.zp(new com.bytedance.sdk.component.HWF.zp.lMd.KS.lMd(lMd.zp, lMd.lMd, lMd.KS, lMd.jU, ""), list));
                            lmd.zp(arrayList);
                            if (lMd.lMd == 200) {
                                zp.zp(zp.COT, true);
                            } else if (lMd.jU) {
                                zp.zp(zp.COT, false);
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(List<com.bytedance.sdk.openadsdk.lMd.zp> list, com.bytedance.sdk.openadsdk.lMd.COT cot) {
        int i9;
        return !KS(list) && (i9 = cot.lMd) >= 400 && i9 < 500;
    }

    public com.bytedance.sdk.openadsdk.lMd.COT zp(List<com.bytedance.sdk.openadsdk.lMd.zp> list) {
        if (this.zp == null) {
            this.zp = KVG.KS();
        }
        if (this.zp == null) {
            return null;
        }
        int zpV = dQp.etV().zpV();
        if (3 == zpV) {
            return this.zp.zp(this.lMd.zp(this.lMd.zp(list, false), System.currentTimeMillis(), this.lMd.lMd(), true), this.lMd.zp(list), true);
        }
        if (2 == zpV) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject lMd = this.lMd.lMd();
            this.zp.zp(this.lMd.zp(this.lMd.zp(list, true), currentTimeMillis, lMd, true), this.lMd.zp(list), true);
            return this.zp.zp(this.lMd.zp(this.lMd.lMd(list), currentTimeMillis, lMd, false), this.lMd.zp(list), false);
        }
        return this.zp.zp(this.lMd.zp(list, System.currentTimeMillis(), this.lMd.lMd(), false), this.lMd.zp(list), false);
    }
}
