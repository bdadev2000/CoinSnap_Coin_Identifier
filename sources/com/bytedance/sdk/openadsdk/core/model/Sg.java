package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    public ArrayList<Integer> AlY;
    public int Sg;
    public String YFl;
    public int tN = 1;
    public AdSlot wN;

    public AdSlot AlY() {
        return this.wN;
    }

    public int Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public int tN() {
        return this.tN;
    }

    public ArrayList<Integer> wN() {
        return this.AlY;
    }

    public void Sg(int i10) {
        this.tN = i10;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void YFl(int i10) {
        this.Sg = i10;
    }

    public void YFl(AdSlot adSlot) {
        this.wN = adSlot;
    }

    public void YFl(ArrayList<Integer> arrayList) {
        this.AlY = arrayList;
    }

    public static void YFl(Sg sg2) {
        int Sg;
        if (sg2 == null || sg2.AlY() == null || (Sg = sg2.Sg()) >= 0 || Sg == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.pDU.tN.YFl();
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.model.Sg.1
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", Sg.this.tN());
                jSONObject.put("err_code", Sg.this.Sg());
                jSONObject.put("server_res_str", Sg.this.YFl());
                if (Sg.this.wN() != null && Sg.this.wN().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) Sg.this.wN()).toString());
                }
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("rd_client_custom_error").YFl(Sg.this.AlY().getDurationSlotType()).Sg(jSONObject.toString());
            }
        });
    }
}
