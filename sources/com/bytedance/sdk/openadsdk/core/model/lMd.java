package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    public AdSlot COT;
    public int KS = 1;
    public ArrayList<Integer> jU;
    public int lMd;
    public String zp;

    public ArrayList<Integer> COT() {
        return this.jU;
    }

    public int KS() {
        return this.KS;
    }

    public AdSlot jU() {
        return this.COT;
    }

    public int lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void lMd(int i9) {
        this.KS = i9;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void zp(int i9) {
        this.lMd = i9;
    }

    public void zp(AdSlot adSlot) {
        this.COT = adSlot;
    }

    public void zp(ArrayList<Integer> arrayList) {
        this.jU = arrayList;
    }

    public static void zp(lMd lmd) {
        int lMd;
        if (lmd == null || lmd.jU() == null || (lMd = lmd.lMd()) >= 0 || lMd == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.dT.KS.zp();
        com.bytedance.sdk.openadsdk.dT.KS.zp("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.core.model.lMd.1
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", lMd.this.KS());
                jSONObject.put("err_code", lMd.this.lMd());
                jSONObject.put("server_res_str", lMd.this.zp());
                if (lMd.this.COT() != null && lMd.this.COT().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) lMd.this.COT()).toString());
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("rd_client_custom_error").zp(lMd.this.jU().getDurationSlotType()).lMd(jSONObject.toString());
            }
        });
    }
}
