package com.bytedance.sdk.openadsdk.core.settings;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    public int AlY;
    public String BPI;
    public boolean Cfr;
    public int DSW;
    public int EH;
    public int GA;
    public int GS;
    public int Ga;
    public int Ne;
    public int NjR;
    public boolean Sco;
    public int Sg;
    public int UI;
    public int UZM;
    public List<String> VOe;
    public int Wwa;
    public String YFl;
    public int YI;
    public int YoT;
    public long ZU;
    public int aIu;
    public int bZ;
    public int dXO;
    public int eT;
    public List<qsH> fIu;
    public boolean hQ;
    public JSONObject iY;
    public List<qsH> ko;
    public int lG;
    public int lu;
    public int mB;
    public int mn;

    /* renamed from: nc, reason: collision with root package name */
    public int f10744nc;
    public int pDU;
    public boolean pq;
    public int qO;
    public int qsH;
    public int rkt;
    public int tN;

    /* renamed from: vc, reason: collision with root package name */
    public int f10745vc;
    public int wN;
    public boolean wXo;
    public int zB;
    public String zG;

    public Sg(JSONObject jSONObject) {
        this.Sg = 1;
        this.tN = 1;
        this.AlY = 2;
        this.wN = 1;
        this.f10745vc = 100;
        this.DSW = 0;
        this.qsH = 2;
        this.NjR = 1;
        this.f10744nc = 3;
        this.eT = 30;
        this.YoT = 30;
        this.GA = 1;
        this.pDU = 1;
        this.EH = 2;
        this.rkt = 1500;
        this.lG = 2;
        this.Wwa = 3500;
        this.qO = 0;
        this.aIu = 5;
        this.wXo = false;
        this.Ne = 0;
        this.bZ = 2;
        this.UZM = -1;
        this.YI = 0;
        this.Ga = 0;
        this.dXO = 5;
        this.Cfr = true;
        this.hQ = false;
        this.pq = false;
        this.mn = 0;
        this.zB = -1;
        this.Sco = false;
        this.GS = 60000;
        this.lu = 2;
        this.mB = 1000;
        this.UI = 1;
        this.ko = new ArrayList();
        this.fIu = new ArrayList();
        new JSONObject();
        this.iY = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.YFl = jSONObject.optString("code_id");
        this.Sg = jSONObject.optInt("auto_play", 1);
        this.zB = jSONObject.optInt("endcard_close_time", -1);
        this.tN = jSONObject.optInt("voice_control", 1);
        this.AlY = jSONObject.optInt("rv_preload", 2);
        this.wN = jSONObject.optInt("nv_preload", 1);
        this.f10745vc = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.DSW = jSONObject.optInt("skip_time_displayed", 0);
        this.qsH = jSONObject.optInt("video_skip_result", 2);
        this.NjR = jSONObject.optInt("reg_creative_control", 1);
        this.f10744nc = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.eT = optInt;
        if (optInt < 0) {
            this.eT = 30;
        }
        this.GA = jSONObject.optInt("voice_control", 2);
        this.pDU = jSONObject.optInt("if_show_win", 1);
        this.EH = jSONObject.optInt("sp_preload", 2);
        this.rkt = jSONObject.optInt("stop_time", 1500);
        this.lG = jSONObject.optInt("native_playable_delay", 2);
        this.Wwa = jSONObject.optInt("time_out_control", -1);
        this.UZM = jSONObject.optInt("playable_close_time", -1);
        this.qO = jSONObject.optInt("playable_reward_type", 0);
        this.Ne = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.aIu = optInt2;
        if (optInt2 < 0) {
            this.aIu = 5;
        }
        YFl(jSONObject.optJSONArray("parent_tpl_ids"));
        this.bZ = jSONObject.optInt("slot_type", 2);
        this.wXo = jSONObject.optBoolean("close_on_click", false);
        this.YI = jSONObject.optInt("allow_system_back", 0);
        this.Ga = jSONObject.optInt("splash_skip_time", 0);
        this.dXO = jSONObject.optInt("splash_image_count_down_time", 5);
        this.hQ = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.pq = jSONObject.optBoolean("splash_close_on_click", false);
        int optInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.mn = optInt3;
        if (optInt3 < 0 || optInt3 > 1) {
            this.mn = 0;
        }
        this.Cfr = jSONObject.optBoolean("allow_mediaview_click", true);
        int optInt4 = jSONObject.optInt("total_time_out", 60000);
        this.GS = optInt4;
        if (optInt4 <= 0 || optInt4 > 1800000) {
            this.GS = 60000;
        }
        int optInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.lu = optInt5;
        if (optInt5 <= 0 || optInt5 > 4) {
            this.lu = 2;
        }
        this.mB = jSONObject.optInt("bidding_token_tmax", 1000);
        int optInt6 = jSONObject.optInt("ad_load_type", 1);
        this.UI = optInt6;
        if (optInt6 <= 0 || optInt6 > 2) {
            this.UI = 1;
        }
        boolean optBoolean = jSONObject.optBoolean("is_mediation", false);
        this.Sco = optBoolean;
        if (optBoolean) {
            rkt.JwO().lL();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                String optString = optJSONObject.optString("adn_name");
                String optString2 = optJSONObject.optString("adn_slot_id");
                int optInt7 = optJSONObject.optInt("ad_expired_time", Constants.ONE_HOUR);
                int optInt8 = optJSONObject.optInt("req_bidding_type", 2);
                String optString3 = optJSONObject.optString("rit_cpm");
                int optInt9 = optJSONObject.optInt("show_sort");
                int optInt10 = optJSONObject.optInt("layer_time_out", 2000);
                int i11 = (optInt10 <= 0 || optInt10 > 60000) ? 2000 : optInt10;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("server_params");
                if (optInt8 == 2) {
                    arrayList.add(new qsH(optString, optString2, optInt7, optInt8, optString3, optInt9, i11, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                } else if (optInt8 == 0) {
                    arrayList2.add(new qsH(optString, optString2, optInt7, optInt8, optString3, optInt9, i11, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                }
            }
            this.ko = arrayList;
            this.fIu = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.fIu);
        }
        if (!YFl(this.tN)) {
            this.tN = 1;
        }
        if (!YFl(this.GA)) {
            this.GA = 1;
        }
        this.ZU = jSONObject.optLong("waterfall_id");
        String optString4 = jSONObject.optString("waterfall_version");
        this.BPI = optString4;
        this.zG = optString4;
        this.YoT = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean YFl(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void YFl(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.VOe = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.VOe.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public Sg(String str, int i10) {
        this.Sg = 1;
        this.tN = 1;
        this.AlY = 2;
        this.wN = 1;
        this.f10745vc = 100;
        this.DSW = 0;
        this.qsH = 2;
        this.NjR = 1;
        this.f10744nc = 3;
        this.eT = 30;
        this.YoT = 30;
        this.GA = 1;
        this.pDU = 1;
        this.EH = 2;
        this.rkt = 1500;
        this.lG = 2;
        this.Wwa = 3500;
        this.qO = 0;
        this.aIu = 5;
        this.wXo = false;
        this.Ne = 0;
        this.bZ = 2;
        this.UZM = -1;
        this.YI = 0;
        this.Ga = 0;
        this.dXO = 5;
        this.Cfr = true;
        this.hQ = false;
        this.pq = false;
        this.mn = 0;
        this.zB = -1;
        this.Sco = false;
        this.GS = 60000;
        this.lu = 2;
        this.mB = 1000;
        this.UI = 1;
        this.ko = new ArrayList();
        this.fIu = new ArrayList();
        this.iY = new JSONObject();
        this.YFl = str;
        this.tN = i10;
    }
}
