package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.pDU.tN.tN;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc implements com.bytedance.sdk.component.vc.YFl.Sg.tN {
    private final tN Sg = tN.YFl();
    public qO<com.bytedance.sdk.openadsdk.AlY.YFl> YFl;

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>> AlY(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        HashMap<String, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>> hashMap = new HashMap<>();
        new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl = list.get(i10);
            JSONObject DSW = yFl.DSW();
            if (DSW != null) {
                String optString = DSW.optString("app_log_url");
                List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(yFl);
            }
        }
        return hashMap;
    }

    private boolean tN(List<com.bytedance.sdk.openadsdk.AlY.YFl> list) {
        JSONObject tN;
        if (list == null || list.size() == 0 || (tN = list.get(0).tN()) == null) {
            return true;
        }
        return TextUtils.isEmpty(tN.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.AlY.wN Sg(List<tN.YFl> list) {
        if (this.YFl == null) {
            this.YFl = lG.tN();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.YoT.YFl()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<tN.YFl> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().Sg);
                }
                jSONObject.put("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                jSONObject.put(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.wN.YFl(String.valueOf(currentTimeMillis).concat("stats_list")));
            } catch (Exception unused) {
            }
            return this.YFl.YFl(jSONObject);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.Sg.tN
    public void YFl(final List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, @Nullable final com.bytedance.sdk.component.vc.YFl.Sg.Sg sg2) {
        com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl;
        if (list == null || list.isEmpty() || (yFl = list.get(0)) == null) {
            return;
        }
        byte AlY = yFl.AlY();
        final ArrayList arrayList = new ArrayList();
        if (AlY == 0) {
            mn.YFl(new com.bytedance.sdk.component.qsH.tN.Sg(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.AlY.YFl.nc.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = nc.this.AlY(list).entrySet().iterator();
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("OverSeaEventUploadImp", th2.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.vc.YFl.Sg.Sg sg3 = sg2;
                        if (sg3 != null) {
                            sg3.YFl(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            YFl.YFl(YFl.AlY);
                            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.AlY.YFl(yFl2.tN(), yFl2.DSW()));
                            }
                            com.bytedance.sdk.openadsdk.AlY.wN YFl = nc.this.YFl(arrayList2);
                            if (sg2 != null && YFl != null) {
                                boolean z10 = YFl.AlY;
                                if (nc.this.YFl(arrayList2, YFl)) {
                                    z10 = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.vc.YFl.Sg.tN.YFl(new com.bytedance.sdk.component.vc.YFl.Sg.tN.Sg(YFl.YFl, YFl.Sg, YFl.tN, z10, ""), list2));
                                if (YFl.Sg == 200) {
                                    YFl.YFl(YFl.AlY, true);
                                } else if (z10) {
                                    YFl.YFl(YFl.AlY, false);
                                }
                            }
                        } catch (Throwable th3) {
                            com.bytedance.sdk.component.utils.YoT.YFl("OverSeaEventUploadImp", th3.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.vc.YFl.Sg.Sg sg4 = sg2;
                    if (sg4 != null) {
                        sg4.YFl(arrayList);
                    }
                }
            });
            return;
        }
        if (AlY == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl2 : list) {
                arrayList2.add(new tN.YFl(yFl2.tN(), yFl2.DSW()));
            }
            YFl.YFl(YFl.wN);
            if (arrayList2.size() > 0) {
                mn.YFl(new com.bytedance.sdk.component.qsH.tN.Sg(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.AlY.YFl.nc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.AlY.wN Sg = nc.this.Sg(arrayList2);
                        if (sg2 != null && Sg != null) {
                            arrayList.add(new com.bytedance.sdk.component.vc.YFl.Sg.tN.YFl(new com.bytedance.sdk.component.vc.YFl.Sg.tN.Sg(Sg.YFl, Sg.Sg, Sg.tN, Sg.AlY, ""), list));
                            sg2.YFl(arrayList);
                            if (Sg.Sg == 200) {
                                YFl.YFl(YFl.wN, true);
                            } else if (Sg.AlY) {
                                YFl.YFl(YFl.wN, false);
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(List<com.bytedance.sdk.openadsdk.AlY.YFl> list, com.bytedance.sdk.openadsdk.AlY.wN wNVar) {
        int i10;
        return !tN(list) && (i10 = wNVar.Sg) >= 400 && i10 < 500;
    }

    public com.bytedance.sdk.openadsdk.AlY.wN YFl(List<com.bytedance.sdk.openadsdk.AlY.YFl> list) {
        if (this.YFl == null) {
            this.YFl = lG.tN();
        }
        if (this.YFl == null) {
            return null;
        }
        int Vmj = rkt.JwO().Vmj();
        if (3 == Vmj) {
            return this.YFl.YFl(this.Sg.YFl(this.Sg.YFl(list, false), System.currentTimeMillis(), this.Sg.Sg(), true), this.Sg.YFl(list), true);
        }
        if (2 == Vmj) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject Sg = this.Sg.Sg();
            this.YFl.YFl(this.Sg.YFl(this.Sg.YFl(list, true), currentTimeMillis, Sg, true), this.Sg.YFl(list), true);
            return this.YFl.YFl(this.Sg.YFl(this.Sg.Sg(list), currentTimeMillis, Sg, false), this.Sg.YFl(list), false);
        }
        return this.YFl.YFl(this.Sg.YFl(list, System.currentTimeMillis(), this.Sg.Sg(), false), this.Sg.YFl(list), false);
    }
}
