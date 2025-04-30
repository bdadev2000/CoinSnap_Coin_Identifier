package com.bytedance.sdk.component.adexpress.dynamic.KS;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF {
    private int Ay;
    private int BO;
    private double Bj;
    private boolean COT;
    private String CZ;
    private int DY;
    private String Dp;
    private int Eg;
    private String FP;
    private boolean Fm;
    private int GP;
    private int Gzh;
    private float HWF;
    private int HaA;
    private int Iok;
    private int Iv;
    private float KS;
    private String KVG;
    private String KVS;
    private long LU = -1;
    private int Lij;
    private boolean MBR;
    private int Ml;
    private int NJ;
    private int Np;
    private boolean PI;
    private int Pxi;
    private float QR;
    private double QUv;
    private boolean RCv;
    private int REM;
    private double RRQ;
    private List<zp> Rea;
    private int Rg;
    private boolean Rh;
    private String Sr;
    private int TS;
    private String UPs;
    private String Vjb;
    private int VuU;
    private String WJ;
    private int WLq;
    private String WNy;
    private float YW;
    private int YcG;
    private String YhE;
    private double aax;
    private int bQm;
    private String bX;
    private String cW;
    private String cz;
    private String dQp;
    private float dT;
    private int eWG;
    private int etV;
    private int eyb;
    private String fRl;
    private int fVt;
    private boolean ffE;
    private boolean fgJ;
    private JSONObject fs;
    private int fw;
    private int gH;
    private JSONObject hRp;
    private int hl;
    private int iOI;
    private double irS;
    private int jQ;
    private float jU;
    private String jyq;
    private float ku;
    private float lMd;
    private String led;
    private boolean mW;
    private boolean ny;
    private boolean oB;
    private int oKZ;
    private String ot;
    private String ox;
    private int pdH;
    private String pvr;
    private boolean qJZ;
    private boolean qtv;
    private String rCC;
    private int rOJ;
    private String rV;
    private boolean si;
    private JSONObject sm;
    private int sqt;
    private String tG;
    private JSONObject tyQ;
    private String uOT;
    private boolean uVa;
    private double vDp;
    private boolean vLi;
    private String vwr;
    private String woN;
    private boolean xg;
    private String yRU;
    private boolean zR;
    private float zp;
    private int zpV;

    private void Gzh(String str) {
        this.led = str;
    }

    public static HWF zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HWF hwf = new HWF();
        hwf.lMd(jSONObject.optString("adType", "embeded"));
        hwf.dQp(jSONObject.optString("clickArea", "creative"));
        hwf.KVG(jSONObject.optString("clickTigger", CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        hwf.KS(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        hwf.jU(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        hwf.COT(jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#999999"));
        hwf.HWF(jSONObject.optString("bgColor", "transparent"));
        hwf.QR(jSONObject.optString("bgImgUrl", ""));
        hwf.Gzh(jSONObject.optString("bgImgData", ""));
        hwf.ku(jSONObject.optString("borderColor", "#000000"));
        hwf.YW(jSONObject.optString("borderStyle", "solid"));
        hwf.dT(jSONObject.optString("heightMode", "auto"));
        hwf.Bj(jSONObject.optString("widthMode", "fixed"));
        hwf.vDp(jSONObject.optString("interactText", ""));
        hwf.KS(jSONObject.optBoolean("isShowBgControl", false));
        hwf.tG(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            hwf.QR(optJSONObject.optInt("translateY", 0));
            hwf.ku(optJSONObject.optInt("translateX", 0));
            hwf.jU(optJSONObject.optDouble("scaleX", 0.0d));
            hwf.COT(optJSONObject.optDouble("scaleY", 0.0d));
        }
        hwf.rV(jSONObject.optString("interactType", ""));
        hwf.COT(jSONObject.optInt("interactSlideDirection", -1));
        hwf.woN(jSONObject.optString("justifyHorizontal", "space-around"));
        hwf.vwr(jSONObject.optString("justifyVertical", "flex-start"));
        hwf.lMd(jSONObject.optDouble("timingStart"));
        hwf.KS(jSONObject.optDouble("timingEnd"));
        hwf.jU((float) jSONObject.optDouble("width", 0.0d));
        hwf.KS((float) jSONObject.optDouble("height", 0.0d));
        hwf.zp((float) jSONObject.optDouble("borderRadius", 0.0d));
        hwf.lMd((float) jSONObject.optDouble("borderSize", 0.0d));
        hwf.lMd(jSONObject.optBoolean("interactValidate", false));
        hwf.YW((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        hwf.COT((float) jSONObject.optDouble("paddingBottom", 0.0d));
        hwf.HWF((float) jSONObject.optDouble("paddingLeft", 0.0d));
        hwf.QR((float) jSONObject.optDouble("paddingRight", 0.0d));
        hwf.ku((float) jSONObject.optDouble("paddingTop", 0.0d));
        hwf.jU(jSONObject.optBoolean("lineFeed", false));
        hwf.YW(jSONObject.optInt("lineCount", 0));
        hwf.HWF(jSONObject.optDouble("lineHeight", 1.2d));
        hwf.rV(jSONObject.optInt("letterSpacing", 0));
        hwf.COT(jSONObject.optBoolean("isDataFixed", false));
        hwf.dQp(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        hwf.HWF(jSONObject.optBoolean("lineLimit"));
        hwf.KVG(jSONObject.optInt("position"));
        hwf.pvr(jSONObject.optString("align"));
        hwf.QR(jSONObject.optBoolean("useLeft"));
        hwf.ku(jSONObject.optBoolean("useRight"));
        hwf.YW(jSONObject.optBoolean("useTop"));
        hwf.dT(jSONObject.optBoolean("useBottom"));
        hwf.cz(jSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
        hwf.lMd(jSONObject.optJSONObject("i18n"));
        hwf.vDp(jSONObject.optInt("marginLeft"));
        hwf.tG(jSONObject.optInt("marginRight"));
        hwf.dT(jSONObject.optInt("marginTop"));
        hwf.Bj(jSONObject.optInt("marginBottom"));
        hwf.woN(jSONObject.optInt("tagMaxCount"));
        hwf.Bj(jSONObject.optBoolean("allowTextFlow"));
        hwf.vwr(jSONObject.optInt("textFlowType"));
        hwf.pvr(jSONObject.optInt("textFlowDuration"));
        hwf.cz(jSONObject.optInt(TtmlNode.LEFT));
        hwf.FP(jSONObject.optInt(TtmlNode.RIGHT));
        hwf.ot(jSONObject.optInt("top"));
        hwf.yRU(jSONObject.optInt("bottom"));
        hwf.FP(jSONObject.optString("alignItems", "flex-start"));
        hwf.ot(jSONObject.optString("direction", ""));
        hwf.zp(jSONObject.optBoolean("loop", false));
        hwf.ox(jSONObject.optInt("zIndex"));
        hwf.QUv(jSONObject.optInt("interactVisibleTime"));
        hwf.RCv(jSONObject.optInt("interactHiddenTime"));
        hwf.tG(jSONObject.optBoolean("interactEnableMask"));
        hwf.rV(jSONObject.optBoolean("interactWontHide"));
        hwf.zp(jSONObject.optString("bgGradient"));
        hwf.YhE(jSONObject.optInt("areaType"));
        hwf.WNy(jSONObject.optInt("interactSlideThreshold", 0));
        hwf.ffE(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.jU.lMd() ? 0 : 120));
        hwf.vwr(jSONObject.optBoolean("openPlayableLandingPage", false));
        hwf.KS(jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO));
        hwf.jU(jSONObject.optJSONObject("image"));
        hwf.UPs(jSONObject.optInt("borderShadowExtent"));
        hwf.dQp(jSONObject.optBoolean("bgGauseBlur"));
        hwf.fRl(jSONObject.optInt("bgGauseBlurRadius"));
        hwf.KVG(jSONObject.optBoolean("showTimeProgress", false));
        hwf.woN(jSONObject.optBoolean("showPlayButton", false));
        hwf.zp(jSONObject.optDouble("bgColorCg", 0.0d));
        hwf.HWF(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        hwf.lMd(jSONObject.optInt("borderTopLeftRadius", 0));
        hwf.zp(jSONObject.optInt("borderTopRightRadius", 0));
        hwf.jU(jSONObject.optInt("borderBottomLeftRadius", 0));
        hwf.KS(jSONObject.optInt("borderBottomRightRadius", 0));
        hwf.COT(jSONObject.optJSONObject("interactI18n"));
        hwf.ox(jSONObject.optString("imageObjectFit"));
        hwf.RCv(jSONObject.optString("interactTitle"));
        hwf.cW(jSONObject.optInt("interactTextPositionTop"));
        hwf.yRU(jSONObject.optString("imageLottieTosPath"));
        hwf.vDp(jSONObject.optBoolean("animationsLoop"));
        hwf.Lij(jSONObject.optInt("lottieAppNameMaxLength"));
        hwf.irS(jSONObject.optInt("lottieAdDescMaxLength"));
        hwf.Gzh(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i9);
                    zp zpVar = new zp();
                    zpVar.KS(jSONObject2.optString("animationType"));
                    zpVar.zp(jSONObject2.optDouble("animationDuration"));
                    zpVar.lMd(jSONObject2.optDouble("animationScaleX"));
                    zpVar.KS(jSONObject2.optDouble("animationScaleY"));
                    zpVar.jU(jSONObject2.optString("animationTimeFunction"));
                    zpVar.jU(jSONObject2.optDouble("animationDelay"));
                    zpVar.HWF(jSONObject2.optInt("animationIterationCount"));
                    zpVar.COT(jSONObject2.optString("animationDirection"));
                    zpVar.COT(jSONObject2.optDouble("animationInterval"));
                    zpVar.zp(jSONObject2.optInt("animationBorderWidth"));
                    zpVar.zp(jSONObject2.optLong("key"));
                    zpVar.lMd(jSONObject2.optInt("animationEffectWidth"));
                    zpVar.KS(jSONObject2.optInt("animationSwing", 1));
                    zpVar.jU(jSONObject2.optInt("animationTranslateX"));
                    zpVar.COT(jSONObject2.optInt("animationTranslateY"));
                    zpVar.lMd(jSONObject2.optString("animationRippleBackgroundColor"));
                    zpVar.zp(jSONObject2.optString("animationScaleDirection"));
                    zpVar.QR(jSONObject2.optInt("animationFadeStart"));
                    zpVar.ku(jSONObject2.optInt("animationFadeEnd"));
                    zpVar.HWF(jSONObject2.optString("animationFillMode"));
                    zpVar.YW(jSONObject2.optInt("animationBounceHeight"));
                    if (hwf.pvr() > 0.0d) {
                        zpVar.jU(zpVar.rV() + hwf.pvr());
                    }
                    arrayList.add(zpVar);
                }
                hwf.zp(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                hwf.Lij(jSONObject.optString("triggerSlideDirection", "0"));
                hwf.zp(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return hwf;
    }

    public String Ay() {
        return this.Dp;
    }

    public String BO() {
        return this.UPs;
    }

    public float Bj() {
        return this.zp;
    }

    public int COT() {
        return this.hl;
    }

    public int CZ() {
        return this.fVt;
    }

    public int DY() {
        return this.oKZ;
    }

    public String Dp() {
        return this.WJ;
    }

    public int Eg() {
        return this.zpV;
    }

    public String FP() {
        return this.dQp;
    }

    public boolean Fm() {
        return this.uVa;
    }

    public boolean GP() {
        return this.MBR;
    }

    public JSONObject HWF() {
        return this.sm;
    }

    public int HaA() {
        return this.WLq;
    }

    public int Iok() {
        return this.eyb;
    }

    public String Iv() {
        return this.fRl;
    }

    public int KS() {
        return this.fw;
    }

    public float KVG() {
        return this.ku;
    }

    public boolean KVS() {
        return this.PI;
    }

    public String Lij() {
        return this.pvr;
    }

    public int MBR() {
        return this.Rg;
    }

    public String Ml() {
        return this.CZ;
    }

    public void NJ() {
        zp(this, this.tyQ);
    }

    public String Np() {
        return this.Vjb;
    }

    public boolean PI() {
        return this.qJZ;
    }

    public String Pxi() {
        return this.YhE;
    }

    public int QR() {
        return this.etV;
    }

    public String QUv() {
        return this.yRU;
    }

    public String RCv() {
        return this.led;
    }

    public boolean REM() {
        return this.mW;
    }

    public int RRQ() {
        return this.TS;
    }

    public String Rea() {
        return this.bX;
    }

    public int Rg() {
        return this.eWG;
    }

    public int Rh() {
        return this.BO;
    }

    public List<zp> Sr() {
        return this.Rea;
    }

    public int TS() {
        return this.REM;
    }

    public int UPs() {
        return this.Gzh;
    }

    public int Vjb() {
        return this.gH;
    }

    public String VuU() {
        return this.KVS;
    }

    public long WJ() {
        return this.LU;
    }

    public void WLq() {
        zp(this, this.hRp);
    }

    public int WNy() {
        return this.Lij;
    }

    public int YW() {
        return this.rOJ;
    }

    public JSONObject YcG() {
        return this.fs;
    }

    public boolean YhE() {
        return this.RCv;
    }

    public boolean aax() {
        return this.ffE;
    }

    public int bQm() {
        return this.YcG;
    }

    public int bX() {
        return this.sqt;
    }

    public String cW() {
        return this.ox;
    }

    public double cz() {
        return this.vDp;
    }

    public float dQp() {
        return this.QR;
    }

    public String dT() {
        return this.uOT;
    }

    public String eWG() {
        return this.cW;
    }

    public int etV() {
        return this.jQ;
    }

    public int eyb() {
        return this.Eg;
    }

    public double fRl() {
        return this.irS;
    }

    public boolean fVt() {
        return this.qtv;
    }

    public double ffE() {
        return this.QUv;
    }

    public int fgJ() {
        return this.DY;
    }

    public String fs() {
        return this.rCC;
    }

    public boolean fw() {
        return this.Fm;
    }

    public int gH() {
        return this.Iv;
    }

    public String hRp() {
        return this.jyq;
    }

    public boolean hl() {
        return this.xg;
    }

    public int iOI() {
        return this.bQm;
    }

    public String irS() {
        return this.ot;
    }

    public int jQ() {
        return this.HaA;
    }

    public int jU() {
        return this.pdH;
    }

    public boolean jyq() {
        return this.zR;
    }

    public double ku() {
        return this.RRQ;
    }

    public int lMd() {
        return this.Iok;
    }

    public boolean mW() {
        return this.oB;
    }

    public int ny() {
        List<zp> list = this.Rea;
        if (list != null) {
            for (zp zpVar : list) {
                if ("translate".equals(zpVar.YW()) && zpVar.QR() < 0) {
                    return -zpVar.QR();
                }
            }
            return 0;
        }
        return 0;
    }

    public boolean oB() {
        return this.si;
    }

    public String oKZ() {
        return this.WNy;
    }

    public String ot() {
        return this.KVG;
    }

    public String ox() {
        return this.vwr;
    }

    public int pdH() {
        return this.VuU;
    }

    public double pvr() {
        return this.Bj;
    }

    public String qJZ() {
        return this.Sr;
    }

    public boolean qtv() {
        return this.Rh;
    }

    public double rCC() {
        return this.aax;
    }

    public int rOJ() {
        return this.iOI;
    }

    public float rV() {
        return this.HWF;
    }

    public int si() {
        return this.Pxi;
    }

    public int sm() {
        return this.Ml;
    }

    public boolean sqt() {
        return this.fgJ;
    }

    public boolean tG() {
        return this.COT;
    }

    public boolean tyQ() {
        return this.ny;
    }

    public JSONObject uVa() {
        return this.hRp;
    }

    public float vDp() {
        return this.lMd;
    }

    public int vLi() {
        return this.Np;
    }

    public float vwr() {
        return this.dT;
    }

    public float woN() {
        return this.YW;
    }

    public int xg() {
        return this.Ay;
    }

    public String yRU() {
        return this.woN;
    }

    public int zR() {
        return this.NJ;
    }

    public int zpV() {
        return this.GP;
    }

    public void Bj(String str) {
        this.ot = str;
    }

    public void COT(int i9) {
        this.etV = i9;
    }

    public void FP(int i9) {
        this.YcG = i9;
    }

    public String Gzh() {
        return this.FP;
    }

    public void HWF(int i9) {
        this.rOJ = i9;
    }

    public void KS(int i9) {
        this.pdH = i9;
    }

    public void KVG(String str) {
        this.WNy = str;
    }

    public void Lij(int i9) {
        this.Ay = i9;
    }

    public void QR(float f9) {
        this.ku = f9;
    }

    public void QUv(int i9) {
        this.TS = i9;
    }

    public void RCv(int i9) {
        this.Eg = i9;
    }

    public void UPs(int i9) {
        this.eyb = i9;
    }

    public void WNy(int i9) {
        this.iOI = i9;
    }

    public void YW(float f9) {
        this.dT = f9;
    }

    public void YhE(int i9) {
        this.Ml = i9;
    }

    public void cW(int i9) {
        this.jQ = i9;
    }

    public void cz(String str) {
        this.Vjb = str;
    }

    public void dQp(String str) {
        this.YhE = str;
    }

    public void dT(String str) {
        this.FP = str;
    }

    public void fRl(int i9) {
        this.VuU = i9;
    }

    public void ffE(int i9) {
        this.HaA = i9;
    }

    public void irS(int i9) {
        this.WLq = i9;
    }

    public void jU(int i9) {
        this.hl = i9;
    }

    public void ku(float f9) {
        this.YW = f9;
    }

    public void lMd(int i9) {
        this.fw = i9;
    }

    public void ot(int i9) {
        this.zpV = i9;
    }

    public void ox(int i9) {
        this.bQm = i9;
    }

    public void pvr(String str) {
        this.rCC = str;
    }

    public void rV(String str) {
        this.cW = str;
    }

    public void tG(String str) {
        this.ox = str;
    }

    public void vDp(String str) {
        this.yRU = str;
    }

    public void vwr(String str) {
        this.fRl = str;
    }

    public void woN(String str) {
        this.UPs = str;
    }

    public void yRU(int i9) {
        this.REM = i9;
    }

    public void Bj(int i9) {
        this.oKZ = i9;
    }

    public void COT(float f9) {
        this.HWF = f9;
    }

    public void FP(String str) {
        this.bX = str;
    }

    public void Gzh(int i9) {
        this.NJ = i9;
    }

    public void HWF(float f9) {
        this.QR = f9;
    }

    public void KS(float f9) {
        this.KS = f9;
    }

    public void KVG(int i9) {
        this.gH = i9;
    }

    public void Lij(String str) {
        this.WJ = str;
    }

    public void QR(String str) {
        this.vwr = str;
    }

    public void RCv(String str) {
        this.Dp = str;
    }

    public void YW(String str) {
        this.cz = str;
    }

    public void cz(int i9) {
        this.Np = i9;
    }

    public void dQp(int i9) {
        this.DY = i9;
    }

    public void dT(int i9) {
        this.Pxi = i9;
    }

    public void jU(float f9) {
        this.jU = f9;
    }

    public void ku(String str) {
        this.pvr = str;
    }

    public void lMd(float f9) {
        this.lMd = f9;
    }

    public void ot(String str) {
        this.CZ = str;
    }

    public void ox(String str) {
        this.jyq = str;
    }

    public void pvr(int i9) {
        this.fVt = i9;
    }

    public void rV(int i9) {
        this.Rg = i9;
    }

    public void tG(int i9) {
        this.Iv = i9;
    }

    public void vDp(int i9) {
        this.BO = i9;
    }

    public void vwr(int i9) {
        this.sqt = i9;
    }

    public void woN(int i9) {
        this.GP = i9;
    }

    public void yRU(String str) {
        this.KVS = str;
    }

    public void Bj(boolean z8) {
        this.mW = z8;
    }

    public void COT(String str) {
        this.KVG = str;
    }

    public void HWF(String str) {
        this.woN = str;
    }

    public void KS(double d2) {
        this.vDp = d2;
    }

    public void KVG(boolean z8) {
        this.xg = z8;
    }

    public void QR(int i9) {
        this.Lij = i9;
    }

    public void YW(int i9) {
        this.eWG = i9;
    }

    public void dQp(boolean z8) {
        this.Fm = z8;
    }

    public void dT(boolean z8) {
        this.qtv = z8;
    }

    public void jU(String str) {
        this.dQp = str;
    }

    public void ku(int i9) {
        this.Gzh = i9;
    }

    public void lMd(boolean z8) {
        this.COT = z8;
    }

    public void rV(boolean z8) {
        this.ny = z8;
    }

    public void tG(boolean z8) {
        this.qJZ = z8;
    }

    public void vDp(boolean z8) {
        this.uVa = z8;
    }

    public void vwr(boolean z8) {
        this.PI = z8;
    }

    public void woN(boolean z8) {
        this.zR = z8;
    }

    public void COT(double d2) {
        this.QUv = d2;
    }

    public void HWF(double d2) {
        this.aax = d2;
    }

    public void KS(String str) {
        this.rV = str;
    }

    public void QR(boolean z8) {
        this.MBR = z8;
    }

    public void YW(boolean z8) {
        this.fgJ = z8;
    }

    public void jU(double d2) {
        this.irS = d2;
    }

    public void ku(boolean z8) {
        this.oB = z8;
    }

    public void lMd(double d2) {
        this.Bj = d2;
    }

    public void COT(boolean z8) {
        this.si = z8;
    }

    public void HWF(boolean z8) {
        this.Rh = z8;
    }

    public void KS(boolean z8) {
        this.RCv = z8;
    }

    public void jU(boolean z8) {
        this.ffE = z8;
    }

    public void lMd(String str) {
        this.tG = str;
    }

    public void COT(JSONObject jSONObject) {
        this.sm = jSONObject;
    }

    public void KS(JSONObject jSONObject) {
        this.tyQ = jSONObject;
    }

    public void jU(JSONObject jSONObject) {
        this.hRp = jSONObject;
    }

    public void lMd(JSONObject jSONObject) {
        this.fs = jSONObject;
    }

    public boolean zp() {
        return this.vLi;
    }

    public void zp(boolean z8) {
        this.vLi = z8;
    }

    public void zp(int i9) {
        this.Iok = i9;
    }

    public void zp(double d2) {
        this.RRQ = d2;
    }

    public void zp(String str) {
        this.uOT = str;
    }

    public void zp(float f9) {
        this.zp = f9;
    }

    public void zp(List<zp> list) {
        this.Rea = list;
    }

    public void zp(long j7) {
        this.LU = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0444 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x044d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x045f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x048d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x052a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x053c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x054e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x057b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0584 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x058d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x059f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x05df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x061f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0631 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x063a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.HWF r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.KS.HWF.zp(com.bytedance.sdk.component.adexpress.dynamic.KS.HWF, org.json.JSONObject):void");
    }
}
