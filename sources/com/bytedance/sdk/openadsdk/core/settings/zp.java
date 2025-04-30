package com.bytedance.sdk.openadsdk.core.settings;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    public String BO;
    public int Bj;
    public int COT;
    public int FP;
    public int Gzh;
    public int HWF;
    public String Iv;
    public int KS;
    public int KVG;
    public int Lij;
    public int Pxi;
    public int QR;
    public boolean QUv;
    public int RCv;
    public List<QR> Rg;
    public boolean UPs;
    public int WNy;
    public int YW;
    public int YhE;
    public List<QR> aax;
    public boolean cW;
    public boolean cz;
    public int dQp;
    public int dT;
    public int eWG;
    public int fRl;
    public int ffE;
    public boolean irS;
    public int jU;
    public int ku;
    public int lMd;
    public long oKZ;
    public List<String> ot;
    public int ox;
    public int pvr;
    public int rV;
    public JSONObject si;
    public int tG;
    public int vDp;
    public int vwr;
    public int woN;
    public int yRU;
    public String zp;

    public zp(JSONObject jSONObject) {
        this.lMd = 1;
        this.KS = 1;
        this.jU = 2;
        this.COT = 1;
        this.HWF = 100;
        this.QR = 0;
        this.ku = 2;
        this.YW = 1;
        this.dT = 3;
        this.Bj = 30;
        this.vDp = 1;
        this.tG = 1;
        this.rV = 2;
        this.dQp = 1500;
        this.KVG = 2;
        this.woN = -1;
        this.vwr = 0;
        this.pvr = 5;
        this.cz = false;
        this.FP = 0;
        this.yRU = 2;
        this.ox = -1;
        this.RCv = 0;
        this.Lij = 0;
        this.Gzh = 5;
        this.irS = true;
        this.QUv = false;
        this.cW = false;
        this.YhE = 0;
        this.WNy = -1;
        this.UPs = false;
        this.fRl = 60000;
        this.ffE = 2;
        this.eWG = 1000;
        this.Pxi = 1;
        this.aax = new ArrayList();
        this.Rg = new ArrayList();
        new JSONObject();
        this.si = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.zp = jSONObject.optString("code_id");
        this.lMd = jSONObject.optInt("auto_play", 1);
        this.WNy = jSONObject.optInt("endcard_close_time", -1);
        this.KS = jSONObject.optInt("voice_control", 1);
        this.jU = jSONObject.optInt("rv_preload", 2);
        this.COT = jSONObject.optInt("nv_preload", 1);
        this.HWF = jSONObject.optInt("proportion_watching", 100);
        this.QR = jSONObject.optInt("skip_time_displayed", 0);
        this.ku = jSONObject.optInt("video_skip_result", 2);
        this.YW = jSONObject.optInt("reg_creative_control", 1);
        this.dT = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.Bj = optInt;
        if (optInt < 0) {
            this.Bj = 30;
        }
        this.vDp = jSONObject.optInt("voice_control", 2);
        this.tG = jSONObject.optInt("if_show_win", 1);
        this.rV = jSONObject.optInt("sp_preload", 2);
        this.dQp = jSONObject.optInt("stop_time", 1500);
        this.KVG = jSONObject.optInt("native_playable_delay", 2);
        this.woN = jSONObject.optInt("time_out_control", -1);
        this.ox = jSONObject.optInt("playable_close_time", -1);
        this.vwr = jSONObject.optInt("playable_reward_type", 0);
        this.FP = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.pvr = optInt2;
        if (optInt2 < 0) {
            this.pvr = 5;
        }
        zp(jSONObject.optJSONArray("parent_tpl_ids"));
        this.yRU = jSONObject.optInt("slot_type", 2);
        this.cz = jSONObject.optBoolean("close_on_click", false);
        this.RCv = jSONObject.optInt("allow_system_back", 0);
        this.Lij = jSONObject.optInt("splash_skip_time", 0);
        this.Gzh = jSONObject.optInt("splash_image_count_down_time", 5);
        this.QUv = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.cW = jSONObject.optBoolean("splash_close_on_click", false);
        int optInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.YhE = optInt3;
        if (optInt3 < 0 || optInt3 > 1) {
            this.YhE = 0;
        }
        this.irS = jSONObject.optBoolean("allow_mediaview_click", true);
        int optInt4 = jSONObject.optInt("total_time_out", 60000);
        this.fRl = optInt4;
        if (optInt4 <= 0 || optInt4 > 1800000) {
            this.fRl = 60000;
        }
        int optInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.ffE = optInt5;
        if (optInt5 <= 0 || optInt5 > 4) {
            this.ffE = 2;
        }
        this.eWG = jSONObject.optInt("bidding_token_tmax", 1000);
        int optInt6 = jSONObject.optInt("ad_load_type", 1);
        this.Pxi = optInt6;
        if (optInt6 <= 0 || optInt6 > 2) {
            this.Pxi = 1;
        }
        boolean optBoolean = jSONObject.optBoolean("is_mediation", false);
        this.UPs = optBoolean;
        if (optBoolean) {
            dQp.etV().Np();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                String optString = optJSONObject.optString("adn_name");
                String optString2 = optJSONObject.optString("adn_slot_id");
                int optInt7 = optJSONObject.optInt("ad_expired_time", Constants.ONE_HOUR);
                int optInt8 = optJSONObject.optInt("req_bidding_type", 2);
                String optString3 = optJSONObject.optString("rit_cpm");
                int optInt9 = optJSONObject.optInt("show_sort");
                int optInt10 = optJSONObject.optInt("layer_time_out", 2000);
                int i10 = (optInt10 <= 0 || optInt10 > 60000) ? 2000 : optInt10;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("server_params");
                if (optInt8 == 2) {
                    arrayList.add(new QR(optString, optString2, optInt7, optInt8, optString3, optInt9, i10, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                } else if (optInt8 == 0) {
                    arrayList2.add(new QR(optString, optString2, optInt7, optInt8, optString3, optInt9, i10, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                }
            }
            this.aax = arrayList;
            this.Rg = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.Rg);
        }
        if (!zp(this.KS)) {
            this.KS = 1;
        }
        if (!zp(this.vDp)) {
            this.vDp = 1;
        }
        this.oKZ = jSONObject.optLong("waterfall_id");
        String optString4 = jSONObject.optString("waterfall_version");
        this.BO = optString4;
        this.Iv = optString4;
    }

    private static boolean zp(int i9) {
        return i9 == 1 || i9 == 2;
    }

    public void zp(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.ot = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                this.ot.add(jSONArray.get(i9).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public zp(String str, int i9) {
        this.lMd = 1;
        this.KS = 1;
        this.jU = 2;
        this.COT = 1;
        this.HWF = 100;
        this.QR = 0;
        this.ku = 2;
        this.YW = 1;
        this.dT = 3;
        this.Bj = 30;
        this.vDp = 1;
        this.tG = 1;
        this.rV = 2;
        this.dQp = 1500;
        this.KVG = 2;
        this.woN = -1;
        this.vwr = 0;
        this.pvr = 5;
        this.cz = false;
        this.FP = 0;
        this.yRU = 2;
        this.ox = -1;
        this.RCv = 0;
        this.Lij = 0;
        this.Gzh = 5;
        this.irS = true;
        this.QUv = false;
        this.cW = false;
        this.YhE = 0;
        this.WNy = -1;
        this.UPs = false;
        this.fRl = 60000;
        this.ffE = 2;
        this.eWG = 1000;
        this.Pxi = 1;
        this.aax = new ArrayList();
        this.Rg = new ArrayList();
        this.si = new JSONObject();
        this.zp = str;
        this.KS = i9;
    }
}
