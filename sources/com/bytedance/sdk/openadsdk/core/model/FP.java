package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.cW;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FP extends woN {
    private jU Ay;
    private boolean BO;
    private rV Bj;
    private int CZ;
    private int DY;
    private Bj Eg;
    private boolean FGx;
    private int FP;
    private int Fm;
    private AdSlot GP;
    private String Gzh;
    private boolean Iv;
    private String KVG;
    private String KVS;
    private String LU;
    private String Lij;
    private JSONObject MBR;
    private String Ml;
    private boolean NJ;
    private int PI;
    private com.bykv.vk.openvk.component.video.api.KS.lMd Pxi;
    private int QR;
    private int RCv;
    private JSONObject REM;
    private KVG RRQ;
    private int Rg;
    private Map<String, Object> Rh;
    private JSONObject Sr;
    private boolean Sx;
    private long UPs;
    private int VuU;
    private int WJ;
    private String WLq;
    private int YW;
    private boolean aax;
    private String bQm;
    private String cz;
    private rV dT;
    private boolean dm;
    private com.bykv.vk.openvk.component.video.api.KS.lMd eWG;
    private String etV;
    private int eyb;
    private int fRl;
    private String fVt;
    private int ffE;
    private String fw;
    private woN.zp gH;
    private com.bytedance.sdk.openadsdk.core.QR.zp hRp;
    private int hl;
    private int iOI;
    private String irS;
    private String[] jQ;
    private int ku;
    public long lMd;
    private com.bytedance.sdk.openadsdk.core.ugen.COT.zp lT;
    private String led;
    private int mW;
    private int ny;
    private com.bykv.vk.openvk.component.video.api.KS.lMd oKZ;
    private dT ox;
    private int pdH;
    private String pvr;
    private vDp qJZ;
    private String rCC;
    private boolean si;
    private volatile boolean sm;
    private String tG;
    private cz tyQ;
    private boolean uOT;
    private String uVa;
    private String vDp;
    private String vLi;
    private String vwr;
    private String woN;
    private KS yRU;
    private final List<rV> KS = new ArrayList();
    private final List<String> jU = new ArrayList();
    private final List<FilterWord> COT = new ArrayList();
    private final cW HWF = cW.lMd();
    public boolean zp = false;
    private List<String> rV = new ArrayList();
    private List<String> dQp = new ArrayList();
    private String ot = "0";
    private String QUv = "";
    private int cW = 0;
    private int YhE = 2;
    private int WNy = 0;
    private int oB = 0;
    private int fgJ = 1;
    private ku qtv = new ku();
    private int Vjb = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int fs = 0;
    private int sqt = 1;
    private int Np = 0;
    private int YcG = 0;
    private int zpV = 0;
    private int bX = 1;
    private int TS = 1;
    private float Rea = 100.0f;
    private int xg = 2;
    private int zR = 1;
    private int HaA = 0;
    private int rOJ = -1;
    private long Iok = -1;
    private int jyq = 0;
    private int Dp = 0;
    private boolean yI = false;
    private int KL = 0;

    private static double COT(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    private com.bytedance.sdk.openadsdk.core.ugen.COT.zp qfP() {
        woN.zp fRl = fRl();
        if (fRl == null) {
            return null;
        }
        return woN.zp.lMd(fRl, String.valueOf(FGx()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Ay() {
        return this.FP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public rV BO() {
        return this.dT;
    }

    public int BSE() {
        return this.WNy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Bj() {
        if (hG()) {
            return 5;
        }
        if (Fm()) {
            return 2;
        }
        if (zR()) {
            return 4;
        }
        jU jUVar = this.Ay;
        if (jUVar == null) {
            return 1;
        }
        return jUVar.lMd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public float CZ() {
        if (this.Rea <= 0.0f) {
            this.Rea = 100.0f;
        }
        return (this.Rea * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public List<String> DY() {
        return this.rV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Dp() {
        if (this.rOJ < 0) {
            JSONObject WLq = WLq();
            if (WLq != null) {
                this.rOJ = WLq.optInt("ad_slot_type", 0);
            } else {
                this.rOJ = 0;
            }
        }
        return this.rOJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public JSONObject Eg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", oKZ());
            jSONObject.put("interaction_method", dQp());
            jSONObject.put("target_url", aax());
            jSONObject.put("app_log_url", qtv());
            jSONObject.put("gecko_id", fVt());
            jSONObject.put("extension", RRQ());
            jSONObject.put("ad_id", fgJ());
            jSONObject.put("source", Pxi());
            jSONObject.put("app_name", wW());
            jSONObject.put("screenshot", YcG());
            jSONObject.put("dislike_control", BSE());
            jSONObject.put("play_bar_show_time", cW());
            jSONObject.put("play_bar_style", Gzh());
            jSONObject.put("if_block_lp", cIt());
            jSONObject.put("cache_sort", HI());
            jSONObject.put("if_sp_cache", Wwg());
            jSONObject.put("render_control", cz());
            jSONObject.put("mrc_report", this.ny);
            jSONObject.put("isMrcReportFinish", this.sm);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cta", woN());
            jSONObject2.put("other", KVG());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, vwr());
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, pvr());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(COT()) && !TextUtils.isEmpty(HWF())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", COT());
                jSONObject4.put("adchoices_url", HWF());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            rV BO = BO();
            if (BO != null && !TextUtils.isEmpty(BO.zp())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", BO.zp());
                jSONObject5.put("height", BO.KS());
                jSONObject5.put("width", BO.lMd());
                jSONObject.put(RewardPlus.ICON, jSONObject5);
            }
            rV Iv = Iv();
            if (Iv != null && !TextUtils.isEmpty(Iv.zp())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("url", Iv.zp());
                jSONObject6.put("height", Iv.KS());
                jSONObject6.put("width", Iv.lMd());
                jSONObject.put("cover_image", jSONObject6);
            }
            Object REM = REM();
            if (REM != null) {
                jSONObject.put("session_params", REM);
            }
            ku irS = irS();
            if (irS != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", irS.zp);
                jSONObject7.put("click_upper_non_content_area", irS.lMd);
                jSONObject7.put("click_lower_content_area", irS.KS);
                jSONObject7.put("click_lower_non_content_area", irS.jU);
                jSONObject7.put("click_button_area", irS.COT);
                jSONObject7.put("click_video_area", irS.HWF);
                jSONObject.put("click_area", jSONObject7);
            }
            AdSlot QUv = QUv();
            if (QUv != null) {
                jSONObject.put("adslot", QUv.toJsonObj());
            }
            List<rV> Rg = Rg();
            if (Rg != null) {
                JSONArray jSONArray = new JSONArray();
                for (rV rVVar : Rg) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("url", rVVar.zp());
                    jSONObject8.put("height", rVVar.KS());
                    jSONObject8.put("width", rVVar.lMd());
                    jSONObject8.put("image_preview", rVVar.HWF());
                    jSONObject8.put("image_key", rVVar.QR());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> DY = DY();
            if (DY != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it = DY.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> Rh = Rh();
            if (Rh != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it2 = Rh.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, jSONArray3);
            }
            List<String> gH = gH();
            if (gH != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<String> it3 = gH.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", si());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, rCC());
            jSONObject.put("description", MBR());
            jSONObject.put("ext", GP());
            jSONObject.put("image_mode", mW());
            jSONObject.put("cover_click_area", rh());
            jSONObject.put("intercept_flag", xHP());
            jSONObject.put("button_text", oB());
            jSONObject.put("ad_logo", Vs());
            jSONObject.put("video_adaptation", Lij());
            jSONObject.put("feed_video_opentype", ot());
            jSONObject.put("orientation", bX());
            jSONObject.put("aspect_ratio", CZ());
            KS Vjb = Vjb();
            if (Vjb != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", Vjb.lMd());
                jSONObject9.put(CampaignEx.JSON_KEY_PACKAGE_NAME, Vjb.KS());
                jSONObject9.put(DownloadModel.DOWNLOAD_URL, Vjb.zp());
                jSONObject9.put("score", Vjb.jU());
                jSONObject9.put("comment_num", Vjb.COT());
                jSONObject9.put(CampaignEx.JSON_KEY_APP_SIZE, Vjb.HWF());
                jSONObject9.put("app_category", Vjb.QR());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject9);
            }
            dT fs = fs();
            if (fs != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", fs.zp());
                jSONObject10.put("fallback_url", fs.lMd());
                jSONObject10.put("fallback_type", fs.KS());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject10);
            }
            List<FilterWord> sqt = sqt();
            if (sqt != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator<FilterWord> it4 = sqt.iterator();
                while (it4.hasNext()) {
                    JSONObject lMd = lMd(it4.next());
                    if (lMd != null) {
                        jSONArray5.put(lMd);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            tG().zp(jSONObject);
            jSONObject.put("count_down", oY());
            jSONObject.put("expiration_time", Np());
            com.bykv.vk.openvk.component.video.api.KS.lMd qJZ = qJZ();
            if (qJZ != null) {
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, qJZ.vwr());
            }
            com.bykv.vk.openvk.component.video.api.KS.lMd KVS = KVS();
            if (KVS != null) {
                jSONObject.put("h265_video", KVS.vwr());
            }
            jSONObject.put("video_encode_type", jQ());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("if_send_click", ffE());
            jSONObject.put("download_conf", jSONObject11);
            if (zpV() != null) {
                JSONObject jSONObject12 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = zpV().entrySet();
                if (!entrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : entrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            woN.zp fRl = fRl();
            if (fRl != null) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put("id", fRl.COT());
                jSONObject13.put("md5", fRl.HWF());
                jSONObject13.put("url", fRl.QR());
                jSONObject13.put(DataSchemeDataSource.SCHEME_DATA, fRl.ku());
                jSONObject13.put("diff_data", fRl.YW());
                jSONObject13.put("version", fRl.jU());
                jSONObject13.put("dynamic_creative", fRl.dT());
                jSONObject13.put("engine_version", fRl.vDp());
                jSONObject13.put("ugen_data", fRl.KVG());
                jSONObject13.put("ugen_md5", fRl.dQp());
                jSONObject13.put("ugen_url", fRl.rV());
                jSONObject.put("tpl_info", jSONObject13);
            }
            jSONObject.put("creative_extra", YhE());
            jSONObject.put("market_url", kx());
            jSONObject.put("auction_price", RCv());
            jSONObject.put("ad_info", THm());
            jSONObject.put("is_package_open", Rea());
            jSONObject.put("playable_duration_time", iOI());
            jSONObject.put("playable_endcard_close_time", eyb());
            jSONObject.put("endcard_close_time", VuU());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("render_sequence", yRU());
            jSONObject14.put("backup_render_control", ox());
            jSONObject14.put("reserve_time", Sr());
            jSONObject14.put("render_thread", ny());
            jSONObject.put("render", jSONObject14);
            if (this.RRQ == null) {
                KVG kvg = new KVG();
                this.RRQ = kvg;
                kvg.zp("");
                this.RRQ.zp(10L);
                this.RRQ.lMd(20L);
                this.RRQ.KS(10L);
                this.RRQ.jU(20L);
            }
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.RRQ.zp());
            jSONObject15.put("straight_lp_showtime", this.RRQ.lMd());
            jSONObject15.put("onlyagg_loading_maxtime", this.RRQ.KS());
            jSONObject15.put("straight_agg_showtime", this.RRQ.jU());
            jSONObject15.put("loading_text", this.RRQ.COT());
            jSONObject.put("interaction_method_params", jSONObject15);
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("splash_clickarea", dT());
            jSONObject16.put("splash_layout_id", Bj());
            jSONObject16.put("load_wait_time", vDp());
            jSONObject.put("splash_control", jSONObject16);
            if (zR()) {
                jSONObject.put("dsp_html", this.etV);
            }
            if (Fm()) {
                jSONObject.put("vast_json", this.hRp.dT());
            }
            jSONObject.put("dsp_material_type", que());
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put("loading_landingpage_type", sm());
            String[] strArr = this.jQ;
            if (strArr != null && strArr.length > 0) {
                JSONArray jSONArray6 = new JSONArray();
                for (String str : this.jQ) {
                    jSONArray6.put(str);
                }
                jSONObject17.put("landingpage_text", jSONArray6);
            }
            jSONObject.put("loading_page", jSONObject17);
            jSONObject.put("deep_link_appname", this.pvr);
            jSONObject.put("landing_page_download_clicktype", this.FP);
            vDp vdp = this.qJZ;
            if (vdp != null) {
                jSONObject.put("dsp_style", vdp.COT());
            }
            jSONObject.put("jump_probability", this.WJ);
            jSONObject.put("identificationOverlayContent", this.LU);
            if (this.lT != null) {
                JSONObject jSONObject18 = new JSONObject();
                jSONObject18.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.lT.HWF());
                jSONObject.put("ugen", jSONObject18);
            }
            jSONObject.put("preload_h5_type", ho());
            jSONObject.put("hasReportShow", this.dm);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int FGx() {
        JSONObject WLq = WLq();
        if (WLq == null) {
            return 0;
        }
        return WLq.optInt("rit", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean FP() {
        return this.Np == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean Fm() {
        int i9 = this.Dp;
        if ((i9 == 1 || i9 == 3) && xg() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String GP() {
        return this.irS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String Gor() {
        JSONObject WLq;
        String str = this.fw;
        if (TextUtils.isEmpty(str) && (WLq = WLq()) != null) {
            str = WLq.optString("req_id", "");
            irS(str);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Gzh(String str) {
        this.LU = str;
    }

    public int HI() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String HWF() {
        return this.uVa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String HaA() {
        return this.etV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public cW ITK() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean IhO() {
        if (this.HWF.zp > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String[] Iok() {
        String[] strArr = this.jQ;
        if ((strArr == null || strArr.length <= 0) && !TextUtils.isEmpty(rCC())) {
            return new String[]{rCC()};
        }
        return this.jQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public rV Iv() {
        return this.Bj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void JR() {
        this.HWF.jU();
        QR(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int JTQ() {
        try {
            JSONObject WLq = WLq();
            if (WLq == null) {
                return 0;
            }
            return WLq.optInt("rec_clk", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean KL() {
        if (Dp() == 5) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean KS() {
        return this.BO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int KVG() {
        return this.zR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public com.bykv.vk.openvk.component.video.api.KS.lMd KVS() {
        return this.Pxi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public long LU() {
        if (this.Iok < 0) {
            JSONObject WLq = WLq();
            if (WLq != null) {
                this.Iok = WLq.optLong("ad_id", 0L);
            } else {
                this.Iok = 0L;
            }
        }
        return this.Iok;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Lij(String str) {
        this.WLq = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String MBR() {
        return this.woN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean Ml() {
        return this.yI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean NJ() {
        com.bykv.vk.openvk.component.video.api.KS.lMd lmd = this.eWG;
        if (lmd == null || lmd.pvr() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean Ngi() {
        return this.Sx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public long Np() {
        return this.UPs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String OJ() {
        return this.WLq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean Oza() {
        return this.NJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int PI() {
        JSONObject jSONObject = this.Sr;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt("easy_playable_skip_duration", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Pxi(int i9) {
        this.KL = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean QR() {
        return (TextUtils.isEmpty(COT()) || TextUtils.isEmpty(HWF())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public AdSlot QUv() {
        return this.GP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean RA() {
        return this.FGx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String RCv() {
        return this.vLi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public JSONObject REM() {
        return this.REM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public JSONObject RRQ() {
        return this.Sr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Rea() {
        return this.iOI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public List<rV> Rg() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public List<String> Rh() {
        return this.dQp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Sr() {
        return this.pdH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public double Sx() {
        return COT(WLq());
    }

    public String THm() {
        return this.Ml;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public JSONObject TS() {
        JSONObject Eg = Eg();
        JSONObject woN = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().woN(String.valueOf(FGx()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(Eg);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", woN);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("MaterialMeta", "toJsonObjPlus", e4.getMessage());
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int UPs() {
        return this.DY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void VTk() {
        com.bykv.vk.openvk.component.video.api.KS.lMd lmd = this.eWG;
        if (lmd != null && !TextUtils.isEmpty(lmd.vDp())) {
            try {
                if (this.eWG.vDp().contains("style_id")) {
                    this.uOT = true;
                    this.led = Uri.parse(this.eWG.vDp()).getQueryParameters("style_id").get(0);
                } else {
                    this.uOT = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean Vc() {
        return this.dm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void VgU() {
        this.FGx = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public KS Vjb() {
        return this.yRU;
    }

    public int Vs() {
        return this.sqt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int VuU() {
        return this.Fm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int WJ() {
        return this.rOJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public JSONObject WLq() {
        if (this.MBR == null) {
            try {
                if (!TextUtils.isEmpty(this.irS)) {
                    this.MBR = new JSONObject(this.irS);
                }
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("MaterialMeta", e4.getMessage());
            }
        }
        return this.MBR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean WNy() {
        return rh() == 100 || this.ku == 20;
    }

    public int Wwg() {
        return this.CZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public com.bytedance.sdk.openadsdk.core.ugen.COT.zp YC() {
        return this.lT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public jU YW() {
        return this.Ay;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean YcG() {
        return this.si;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String YhE() {
        return this.rCC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String aax() {
        return this.vDp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean bQm() {
        if (Fm() || BSE() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int bX() {
        if (this.TS != 2) {
            this.TS = 1;
        }
        return this.TS;
    }

    public int cIt() {
        return this.Np;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int cW() {
        return this.Vjb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String cdp() {
        return this.LU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int cz() {
        int i9 = this.ku;
        if (i9 == 5 || i9 == 6 || i9 == 33) {
            return 1;
        }
        if (slc()) {
            return 2;
        }
        return this.YhE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int dQp() {
        return this.YW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int dT() {
        jU jUVar = this.Ay;
        if (jUVar == null) {
            return 2;
        }
        return jUVar.zp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    @Nullable
    public String dm() {
        KS Vjb = Vjb();
        if (Vjb != null && !TextUtils.isEmpty(Vjb.zp())) {
            return Vjb.zp();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean eS() {
        vDp vdp;
        if (!Fm() || IhO() || (vdp = this.qJZ) == null || vdp.zp() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void eWG(int i9) {
        this.WJ = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean ea() {
        int i9 = this.ku;
        if ((i9 == 2 || i9 == 1) && 3 == this.QR) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            woN won = (woN) obj;
            if (this.ot.equals(won.fgJ()) && this.irS.equals(won.GP())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean etV() {
        return this.sm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int eyb() {
        return this.VuU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public woN.zp fRl() {
        return this.gH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String fVt() {
        return this.bQm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int ffE() {
        Bj bj = this.Eg;
        if (bj == null) {
            return 0;
        }
        return bj.zp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String fgJ() {
        return this.ot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public dT fs() {
        return this.ox;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public vDp fw() {
        return this.qJZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void gG() {
        this.Sx = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public List<String> gH() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public long gKR() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean hG() {
        List<Integer> KS;
        if (fRl() != null && (KS = fRl().KS()) != null && KS.contains(57)) {
            return true;
        }
        return false;
    }

    public com.bytedance.sdk.component.adexpress.zp.KS.jU hP() {
        woN.zp fRl = fRl();
        if (fRl == null) {
            return null;
        }
        return woN.zp.zp(fRl, String.valueOf(FGx()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void hRp() {
        this.sm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public com.bytedance.sdk.component.widget.lMd.zp hl() {
        com.bytedance.sdk.component.widget.lMd.zp zpVar = new com.bytedance.sdk.component.widget.lMd.zp();
        zpVar.zp(this.DY);
        zpVar.lMd(this.ot);
        zpVar.zp(GP());
        return zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int ho() {
        return this.KL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int iOI() {
        int i9 = this.eyb;
        if (i9 > 0) {
            return i9;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public ku irS() {
        return this.qtv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int jQ() {
        return this.PI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean jU() {
        return this.Iv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int jyq() {
        return this.HaA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public KVG ku() {
        return this.RRQ;
    }

    public String kx() {
        return this.fVt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(boolean z8) {
        this.Iv = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean lT() {
        if (Dp() == 8) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean led() {
        if (Dp() != 3 && Dp() != 4) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int mW() {
        return this.RCv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String mfu() {
        return this.led;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int ny() {
        return this.hl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean nz() {
        if (Fm() && !IhO()) {
            int nextInt = new Random().nextInt(100);
            vDp vdp = this.qJZ;
            if (vdp != null && nextInt < vdp.KS()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String oB() {
        if (!TextUtils.isEmpty(this.vwr)) {
            return this.vwr;
        }
        Context zp = com.bytedance.sdk.openadsdk.core.KVG.zp();
        int oKZ = oKZ();
        if (oKZ != 2 && oKZ != 3) {
            if (oKZ != 4) {
                if (oKZ != 8) {
                    return this.vwr;
                }
            } else {
                if (zp != null) {
                    return com.bytedance.sdk.component.utils.cz.zp(zp, "tt_video_download_apk");
                }
                return this.vwr;
            }
        }
        if (zp != null) {
            return com.bytedance.sdk.component.utils.cz.zp(zp, "tt_video_mobile_go_detail");
        }
        return this.vwr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int oKZ() {
        return this.QR;
    }

    public int oY() {
        return this.fRl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int ot() {
        return this.zpV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int ox() {
        return this.fgJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int pdH() {
        return this.Rg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int pvr() {
        return this.cW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public com.bykv.vk.openvk.component.video.api.KS.lMd qJZ() {
        return this.oKZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean qW() {
        return this.uOT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String qtv() {
        return this.Gzh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int que() {
        return this.Dp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String rCC() {
        return this.KVG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String rOJ() {
        String rCC = rCC();
        if (Vjb() != null && !TextUtils.isEmpty(Vjb().lMd())) {
            return Vjb().lMd();
        }
        return rCC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int rV() {
        return this.ku;
    }

    public int rh() {
        return this.ffE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String si() {
        return this.tG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean slc() {
        if (QUv() == null || QUv().getDurationSlotType() != 8 || !zR()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int sm() {
        return this.jyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public List<FilterWord> sqt() {
        return this.COT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public cz tG() {
        return this.tyQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean tyQ() {
        if (this.ny == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean uOT() {
        if (Dp() == 7) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String uVa() {
        return this.pvr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public long vDp() {
        jU jUVar = this.Ay;
        if (jUVar == null) {
            return 0L;
        }
        return jUVar.KS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean vFs() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean vLi() {
        if (this.KS.isEmpty()) {
            return false;
        }
        if (this.RCv == 4 && this.KS.size() < 3) {
            return false;
        }
        Iterator<rV> it = this.KS.iterator();
        while (it.hasNext()) {
            if (!it.next().COT()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String vwr() {
        return this.QUv;
    }

    public String wW() {
        return this.cz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int woN() {
        return this.xg;
    }

    public int xHP() {
        return this.mW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public com.bytedance.sdk.openadsdk.core.QR.zp xg() {
        return this.hRp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean yI() {
        if (Dp() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int yRU() {
        return this.oB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public boolean zR() {
        if (this.Dp == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean zf() {
        /*
            r3 = this;
            boolean r0 = r3.IhO()
            r1 = 0
            if (r0 != 0) goto L2f
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 100
            int r0 = r0.nextInt(r2)
            boolean r2 = r3.Fm()
            if (r2 == 0) goto L21
            com.bytedance.sdk.openadsdk.core.model.vDp r2 = r3.qJZ
            if (r2 == 0) goto L2a
            int r2 = r2.lMd()
            goto L2b
        L21:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.cz.lMd(r3)
            if (r2 != 0) goto L2a
            int r2 = r3.WJ
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r0 >= r2) goto L2f
            r0 = 1
            return r0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.model.FP.zf():boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(boolean z8) {
        this.BO = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public Map<String, Object> zpV() {
        return this.Rh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String COT() {
        return this.KVS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void FP(String str) {
        this.bQm = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Gzh() {
        if (Fm()) {
            return 5;
        }
        if (CZ() != 100.0f || cz() == 2) {
            return 0;
        }
        return this.fs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void HWF(String str) {
        this.uVa = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KS(boolean z8) {
        this.aax = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KVG(int i9) {
        this.ffE = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public int Lij() {
        return this.YcG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String Pxi() {
        return this.Lij;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void QR(boolean z8) {
        this.NJ = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void QUv(int i9) {
        this.hl = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void RCv(int i9) {
        this.VuU = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void UPs(int i9) {
        this.PI = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void WNy(int i9) {
        this.HaA = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void YW(String str) {
        this.vLi = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void YhE(int i9) {
        this.Rg = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void cW(int i9) {
        this.jyq = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void dQp(int i9) {
        this.CZ = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void dT(int i9) {
        this.sqt = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public com.bykv.vk.openvk.component.video.api.KS.lMd eWG() {
        return this.eWG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void fRl(int i9) {
        this.FP = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ffE(int i9) {
        this.Dp = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void irS(int i9) {
        this.pdH = Math.max(0, i9);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void jU(int i9) {
        this.YhE = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ku(boolean z8) {
        this.dm = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(int i9) {
        this.ku = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ot(String str) {
        this.fVt = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ox(int i9) {
        this.eyb = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void pvr(String str) {
        this.Gzh = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void rV(int i9) {
        this.bX = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void tG(int i9) {
        this.Vjb = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void vDp(int i9) {
        this.mW = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void vwr(int i9) {
        this.QR = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void woN(int i9) {
        this.DY = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void yRU(int i9) {
        this.iOI = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(KVG kvg) {
        this.RRQ = kvg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void COT(String str) {
        this.KVS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void FP(int i9) {
        this.TS = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void HWF(int i9) {
        this.zpV = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KS(int i9) {
        this.cW = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KVG(String str) {
        this.woN = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Lij(int i9) {
        this.Fm = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void QR(String str) {
        this.QUv = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public String RCv(String str) {
        JSONObject WLq = WLq();
        return WLq != null ? WLq.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void YW(int i9) {
        this.YcG = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void dQp(String str) {
        this.KVG = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void dT(String str) {
        this.rCC = str;
    }

    public void irS(String str) {
        this.fw = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void jU(boolean z8) {
        this.si = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ku(String str) {
        this.Ml = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(double d2) {
        if (d2 != 2.0d && d2 != 1.0d) {
            this.xg = 2;
        } else {
            this.xg = (int) d2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ot(int i9) {
        this.WNy = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ox(String str) {
        this.pvr = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void pvr(int i9) {
        this.RCv = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void rV(String str) {
        this.tG = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void tG(String str) {
        this.vDp = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void vDp(String str) {
        this.cz = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void vwr(String str) {
        this.ot = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void woN(String str) {
        this.vwr = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void yRU(String str) {
        this.etV = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(com.bytedance.sdk.openadsdk.core.ugen.COT.zp zpVar) {
        this.lT = zpVar;
        com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp().zp(zpVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void COT(int i9) {
        this.Np = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void HWF(boolean z8) {
        this.zp = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KS(rV rVVar) {
        this.KS.add(rVVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void QR(int i9) {
        this.oB = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void cz(String str) {
        this.irS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void jU(JSONObject jSONObject) {
        this.Sr = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void ku(int i9) {
        this.fgJ = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Bj(int i9) {
        this.fs = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void COT(boolean z8) {
        this.yI = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Gzh(int i9) {
        this.ny = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KS(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.QR = 4;
        this.ot = jSONObject.optString("id");
        this.Lij = jSONObject.optString("source");
        KS ks = new KS();
        this.yRU = ks;
        ks.KS(jSONObject.optString("pkg_name"));
        this.yRU.lMd(jSONObject.optString("name"));
        this.yRU.zp(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void cz(int i9) {
        this.fRl = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(rV rVVar) {
        this.Bj = rVVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(jU jUVar) {
        this.Ay = jUVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void Bj(String str) {
        this.Lij = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(long j7) {
        this.UPs = j7;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(cz czVar) {
        this.tyQ = czVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(JSONObject jSONObject) {
        this.REM = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(int i9) {
        zp(i9, -1);
    }

    private JSONObject lMd(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(lMd(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(int i9, int i10) {
        this.YW = i9;
        this.ku = i9;
        if (this.GP == null) {
            this.ku = 0;
            return;
        }
        if (i10 <= 0) {
            i10 = Dp();
        }
        if (this.GP.getNativeAdType() != 3 && this.GP.getDurationSlotType() != 3 && i10 != 3) {
            if (this.GP.getNativeAdType() != 7 && this.GP.getNativeAdType() != 8 && this.GP.getDurationSlotType() != 7 && this.GP.getDurationSlotType() != 8 && i10 != 7 && i10 != 8) {
                if (cz.lMd(this)) {
                    this.ku = 4;
                    return;
                }
                if (this.YW == 4 && !cz.lMd(this)) {
                    this.ku = 0;
                }
                if (i9 >= 5) {
                    this.ku = 0;
                    return;
                }
                if (this.YW == 2 && oKZ() != 3) {
                    this.ku = 0;
                    return;
                } else {
                    if (i9 == 0 || (i9 == 1 && oKZ() != 3)) {
                        this.ku = 0;
                        return;
                    }
                    return;
                }
            }
            if (cz.Bj(this)) {
                this.ku = 12;
                return;
            }
            if (cz.lMd(this)) {
                this.ku = 9;
                return;
            }
            if (this.YW == 5 && !dQp.KS(this)) {
                this.ku = 7;
            }
            if (this.YW == 6 && !dQp.lMd(this)) {
                this.ku = 7;
            }
            if (this.YW == 8 && rh() != 100) {
                this.ku = 7;
            }
            if (this.YW == 19 && TextUtils.isEmpty(this.vDp)) {
                this.ku = 7;
            }
            if (this.YW == 20 && TextUtils.isEmpty(this.vDp)) {
                this.ku = 7;
            }
            if (i9 < 5) {
                this.ku = 7;
                return;
            }
            return;
        }
        this.ku = 14;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KS(com.bykv.vk.openvk.component.video.api.KS.lMd lmd) {
        this.Pxi = lmd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void KS(long j7) {
        this.lMd = j7;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void lMd(com.bykv.vk.openvk.component.video.api.KS.lMd lmd) {
        this.oKZ = lmd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(double d2) {
        if (d2 != 2.0d && d2 != 1.0d) {
            this.zR = 1;
        } else {
            this.zR = (int) d2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(ku kuVar) {
        this.qtv = kuVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(AdSlot adSlot) {
        this.GP = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(woN.zp zpVar) {
        this.gH = zpVar;
        com.bytedance.sdk.component.adexpress.zp.KS.jU hP = hP();
        if (hP != null && !this.gH.tG()) {
            com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp(hP);
        }
        if (zpVar == null || TextUtils.isEmpty(zpVar.rV())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp().zp(qfP(), "ad");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(com.bykv.vk.openvk.component.video.api.KS.lMd lmd) {
        this.eWG = lmd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(Bj bj) {
        this.Eg = bj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(rV rVVar) {
        this.dT = rVVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(KS ks) {
        this.yRU = ks;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(dT dTVar) {
        this.ox = dTVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(FilterWord filterWord) {
        this.COT.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(Map<String, Object> map) {
        this.Rh = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(float f9) {
        this.Rea = f9;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(com.bytedance.sdk.openadsdk.core.QR.zp zpVar) {
        this.hRp = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(String[] strArr) {
        this.jQ = strArr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.woN
    public void zp(vDp vdp) {
        this.qJZ = vdp;
    }
}
