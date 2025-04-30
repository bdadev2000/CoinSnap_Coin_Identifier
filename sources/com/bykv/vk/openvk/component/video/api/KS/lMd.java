package com.bykv.vk.openvk.component.video.api.KS;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private double Bj;
    private String COT;
    private String HWF;
    private long KS;
    private String QR;
    private String YW;
    private String dT;
    private double jU;
    private String ku;
    private int lMd;
    private int tG;
    private int vDp;
    private int zp;
    private float rV = -1.0f;
    private int dQp = 0;
    private int KVG = 0;
    private int woN = 0;
    private int vwr = 0;
    private int pvr = 307200;
    private int cz = 1;

    public String Bj() {
        return this.QR;
    }

    public long COT() {
        return this.KS;
    }

    public boolean FP() {
        if (this.woN == 0) {
            return true;
        }
        return false;
    }

    public double HWF() {
        return this.jU;
    }

    public int KS() {
        return this.lMd;
    }

    public int KVG() {
        return this.woN;
    }

    public double QR() {
        return this.Bj;
    }

    public String YW() {
        return this.COT;
    }

    public int cz() {
        return this.KVG;
    }

    public int dQp() {
        if (this.pvr < 0) {
            this.pvr = 307200;
        }
        long j7 = this.pvr;
        long j9 = this.KS;
        if (j7 > j9) {
            this.pvr = (int) j9;
        }
        return this.pvr;
    }

    public String dT() {
        return this.HWF;
    }

    public int jU() {
        return this.tG;
    }

    public float ku() {
        return this.rV;
    }

    public int lMd() {
        return this.zp;
    }

    public int ot() {
        return this.cz;
    }

    public int pvr() {
        return this.dQp;
    }

    public String rV() {
        if (TextUtils.isEmpty(this.dT)) {
            this.dT = com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(this.QR);
        }
        return this.dT;
    }

    public String tG() {
        return this.YW;
    }

    public String vDp() {
        return this.ku;
    }

    public JSONObject vwr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", lMd());
            jSONObject.put("cover_url", dT());
            jSONObject.put("cover_width", KS());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, vDp());
            jSONObject.put("file_hash", rV());
            jSONObject.put("resolution", YW());
            jSONObject.put("size", COT());
            jSONObject.put("video_duration", HWF());
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, Bj());
            jSONObject.put("playable_download_url", tG());
            jSONObject.put("if_playable_loading_show", pvr());
            jSONObject.put("remove_loading_page_type", cz());
            jSONObject.put("fallback_endcard_judge", zp());
            jSONObject.put("video_preload_size", dQp());
            jSONObject.put("reward_video_cached_type", KVG());
            jSONObject.put("execute_cached_type", woN());
            jSONObject.put("endcard_render", jU());
            jSONObject.put("replay_time", ot());
            jSONObject.put("play_speed_ratio", ku());
            if (QR() > 0.0d) {
                jSONObject.put("start", QR());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int woN() {
        return this.vwr;
    }

    public int zp() {
        return this.vDp;
    }

    public void COT(String str) {
        this.YW = str;
    }

    public void HWF(String str) {
        this.dT = str;
    }

    public void KS(int i9) {
        this.lMd = i9;
    }

    public void QR(int i9) {
        this.vwr = i9;
    }

    public void YW(int i9) {
        this.KVG = i9;
    }

    public void dT(int i9) {
        this.cz = Math.min(4, Math.max(1, i9));
    }

    public void jU(int i9) {
        this.tG = i9;
    }

    public void ku(int i9) {
        this.dQp = i9;
    }

    public void lMd(int i9) {
        this.zp = i9;
    }

    public void zp(int i9) {
        this.vDp = i9;
    }

    public void COT(int i9) {
        this.pvr = i9;
    }

    public void HWF(int i9) {
        this.woN = i9;
    }

    public void KS(String str) {
        this.QR = str;
    }

    public void jU(String str) {
        this.ku = str;
    }

    public void lMd(String str) {
        this.HWF = str;
    }

    public void zp(long j7) {
        this.KS = j7;
    }

    public void zp(double d2) {
        this.jU = d2;
    }

    public void zp(String str) {
        this.COT = str;
    }
}
