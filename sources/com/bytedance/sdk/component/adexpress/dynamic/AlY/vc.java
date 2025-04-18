package com.bytedance.sdk.component.adexpress.dynamic.AlY;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc {
    private int Af;
    private int AfY;
    private float AlY;
    private int BPI;
    private boolean Bh;
    private int Bn;
    private double Cfr;
    private boolean Cqy;
    private float DSW;
    private boolean DjU;
    private int EAq;
    private int ECi;
    private String EH;
    private String GA;
    private boolean GS;
    private int Ga;
    private boolean Gmi;
    private int Gnp;
    private int HVP;
    private int Hjb;
    private double IXB;
    private String JB;
    private String JT;
    private boolean Jc;
    private int JwO;
    private String LL;
    private String Ld;
    private String Lx;
    private String Ne;
    private float NjR;
    private boolean PT;
    private boolean RX;
    private int SVa;
    private String Sco;
    private float Sg;
    private int UI;
    private String UT;
    private boolean UZM;
    private String Uv;
    private boolean VB;
    private boolean VJb;
    private String VOe;
    private int Vmj;
    private String Wwa;
    private float YFl;
    private int YI;
    private int YP;
    private double YoT;
    private String ZLB;
    private String ZS;
    private int ZU;
    private String aIu;
    private int agS;
    private String bZ;
    private boolean dBO;
    private int dGX;
    private boolean dU;
    private double dXO;

    /* renamed from: dc, reason: collision with root package name */
    private int f10372dc;

    /* renamed from: dd, reason: collision with root package name */
    private boolean f10373dd;
    private double eT;
    private int ep;
    private boolean fIu;
    private String hQ;
    private int iY;

    /* renamed from: ib, reason: collision with root package name */
    private JSONObject f10374ib;
    private int in;
    private int jz;
    private List<YFl> kA;
    private int ko;
    private String lG;
    private int lL;
    private int lu;
    private int mB;
    private String mn;

    /* renamed from: nc, reason: collision with root package name */
    private float f10375nc;

    /* renamed from: ni, reason: collision with root package name */
    private boolean f10376ni;
    private String pDU;
    private JSONObject pm;
    private String pq;
    private String qO;

    /* renamed from: qf, reason: collision with root package name */
    private int f10377qf;
    private int qjy;
    private float qsH;
    private int rE;
    private String rkt;
    private boolean rog;
    private float tN;
    private String tQ;
    private String toy;
    private int uGS;

    /* renamed from: vc, reason: collision with root package name */
    private float f10378vc;
    private boolean wN;
    private String wXo;
    private int wqc;
    private long ww = -1;

    /* renamed from: xg, reason: collision with root package name */
    private JSONObject f10379xg;
    private JSONObject yn;
    private String zB;
    private double zG;
    private int zl;
    private int zz;

    private void Ga(String str) {
        this.JB = str;
    }

    public static vc YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        vc vcVar = new vc();
        vcVar.Sg(jSONObject.optString("adType", "embeded"));
        vcVar.EH(jSONObject.optString("clickArea", "creative"));
        vcVar.rkt(jSONObject.optString("clickTigger", CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        vcVar.tN(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        vcVar.AlY(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        vcVar.wN(jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#999999"));
        vcVar.vc(jSONObject.optString("bgColor", "transparent"));
        vcVar.DSW(jSONObject.optString("bgImgUrl", ""));
        vcVar.Ga(jSONObject.optString("bgImgData", ""));
        vcVar.qsH(jSONObject.optString("borderColor", "#000000"));
        vcVar.NjR(jSONObject.optString("borderStyle", "solid"));
        vcVar.nc(jSONObject.optString("heightMode", DebugKt.DEBUG_PROPERTY_VALUE_AUTO));
        vcVar.eT(jSONObject.optString("widthMode", "fixed"));
        vcVar.YoT(jSONObject.optString("interactText", ""));
        vcVar.tN(jSONObject.optBoolean("isShowBgControl", false));
        vcVar.GA(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            vcVar.DSW(optJSONObject.optInt("translateY", 0));
            vcVar.qsH(optJSONObject.optInt("translateX", 0));
            vcVar.AlY(optJSONObject.optDouble("scaleX", 0.0d));
            vcVar.wN(optJSONObject.optDouble("scaleY", 0.0d));
        }
        vcVar.pDU(jSONObject.optString("interactType", ""));
        vcVar.wN(jSONObject.optInt("interactSlideDirection", -1));
        vcVar.lG(jSONObject.optString("justifyHorizontal", "space-around"));
        vcVar.Wwa(jSONObject.optString("justifyVertical", "flex-start"));
        vcVar.Sg(jSONObject.optDouble("timingStart"));
        vcVar.tN(jSONObject.optDouble("timingEnd"));
        vcVar.AlY((float) jSONObject.optDouble("width", 0.0d));
        vcVar.tN((float) jSONObject.optDouble("height", 0.0d));
        vcVar.YFl((float) jSONObject.optDouble("borderRadius", 0.0d));
        vcVar.Sg((float) jSONObject.optDouble("borderSize", 0.0d));
        vcVar.Sg(jSONObject.optBoolean("interactValidate", false));
        vcVar.NjR((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        vcVar.wN((float) jSONObject.optDouble("paddingBottom", 0.0d));
        vcVar.vc((float) jSONObject.optDouble("paddingLeft", 0.0d));
        vcVar.DSW((float) jSONObject.optDouble("paddingRight", 0.0d));
        vcVar.qsH((float) jSONObject.optDouble("paddingTop", 0.0d));
        vcVar.AlY(jSONObject.optBoolean("lineFeed", false));
        vcVar.NjR(jSONObject.optInt("lineCount", 0));
        vcVar.vc(jSONObject.optDouble("lineHeight", 1.2d));
        vcVar.pDU(jSONObject.optInt("letterSpacing", 0));
        vcVar.wN(jSONObject.optBoolean("isDataFixed", false));
        vcVar.EH(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        vcVar.vc(jSONObject.optBoolean("lineLimit"));
        vcVar.rkt(jSONObject.optInt("position"));
        vcVar.qO(jSONObject.optString("align"));
        vcVar.DSW(jSONObject.optBoolean("useLeft"));
        vcVar.qsH(jSONObject.optBoolean("useRight"));
        vcVar.NjR(jSONObject.optBoolean("useTop"));
        vcVar.nc(jSONObject.optBoolean("useBottom"));
        vcVar.aIu(jSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
        vcVar.Sg(jSONObject.optJSONObject("i18n"));
        vcVar.YoT(jSONObject.optInt("marginLeft"));
        vcVar.GA(jSONObject.optInt("marginRight"));
        vcVar.nc(jSONObject.optInt("marginTop"));
        vcVar.eT(jSONObject.optInt("marginBottom"));
        vcVar.lG(jSONObject.optInt("tagMaxCount"));
        vcVar.eT(jSONObject.optBoolean("allowTextFlow"));
        vcVar.Wwa(jSONObject.optInt("textFlowType"));
        vcVar.qO(jSONObject.optInt("textFlowDuration"));
        vcVar.aIu(jSONObject.optInt(TtmlNode.LEFT));
        vcVar.wXo(jSONObject.optInt(TtmlNode.RIGHT));
        vcVar.Ne(jSONObject.optInt("top"));
        vcVar.VOe(jSONObject.optInt("bottom"));
        vcVar.wXo(jSONObject.optString("alignItems", "flex-start"));
        vcVar.Ne(jSONObject.optString("direction", ""));
        vcVar.YFl(jSONObject.optBoolean("loop", false));
        vcVar.bZ(jSONObject.optInt("zIndex"));
        vcVar.Cfr(jSONObject.optInt("interactVisibleTime"));
        vcVar.UZM(jSONObject.optInt("interactHiddenTime"));
        vcVar.GA(jSONObject.optBoolean("interactEnableMask"));
        vcVar.pDU(jSONObject.optBoolean("interactWontHide"));
        vcVar.YFl(jSONObject.optString("bgGradient"));
        vcVar.pq(jSONObject.optInt("areaType"));
        vcVar.mn(jSONObject.optInt("interactSlideThreshold", 0));
        vcVar.GS(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.AlY.Sg() ? 0 : 120));
        vcVar.Wwa(jSONObject.optBoolean("openPlayableLandingPage", false));
        vcVar.tN(jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO));
        vcVar.AlY(jSONObject.optJSONObject("image"));
        vcVar.zB(jSONObject.optInt("borderShadowExtent"));
        vcVar.EH(jSONObject.optBoolean("bgGauseBlur"));
        vcVar.Sco(jSONObject.optInt("bgGauseBlurRadius"));
        vcVar.rkt(jSONObject.optBoolean("showTimeProgress", false));
        vcVar.lG(jSONObject.optBoolean("showPlayButton", false));
        vcVar.YFl(jSONObject.optDouble("bgColorCg", 0.0d));
        vcVar.vc(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        vcVar.Sg(jSONObject.optInt("borderTopLeftRadius", 0));
        vcVar.YFl(jSONObject.optInt("borderTopRightRadius", 0));
        vcVar.AlY(jSONObject.optInt("borderBottomLeftRadius", 0));
        vcVar.tN(jSONObject.optInt("borderBottomRightRadius", 0));
        vcVar.wN(jSONObject.optJSONObject("interactI18n"));
        vcVar.bZ(jSONObject.optString("imageObjectFit"));
        vcVar.UZM(jSONObject.optString("interactTitle"));
        vcVar.hQ(jSONObject.optInt("interactTextPositionTop"));
        vcVar.VOe(jSONObject.optString("imageLottieTosPath"));
        vcVar.YoT(jSONObject.optBoolean("animationsLoop"));
        vcVar.YI(jSONObject.optInt("lottieAppNameMaxLength"));
        vcVar.dXO(jSONObject.optInt("lottieAdDescMaxLength"));
        vcVar.Ga(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    YFl yFl = new YFl();
                    yFl.tN(jSONObject2.optString("animationType"));
                    yFl.YFl(jSONObject2.optDouble("animationDuration"));
                    yFl.Sg(jSONObject2.optDouble("animationScaleX"));
                    yFl.tN(jSONObject2.optDouble("animationScaleY"));
                    yFl.AlY(jSONObject2.optString("animationTimeFunction"));
                    yFl.AlY(jSONObject2.optDouble("animationDelay"));
                    yFl.vc(jSONObject2.optInt("animationIterationCount"));
                    yFl.wN(jSONObject2.optString("animationDirection"));
                    yFl.wN(jSONObject2.optDouble("animationInterval"));
                    yFl.YFl(jSONObject2.optInt("animationBorderWidth"));
                    yFl.YFl(jSONObject2.optLong("key"));
                    yFl.Sg(jSONObject2.optInt("animationEffectWidth"));
                    yFl.tN(jSONObject2.optInt("animationSwing", 1));
                    yFl.AlY(jSONObject2.optInt("animationTranslateX"));
                    yFl.wN(jSONObject2.optInt("animationTranslateY"));
                    yFl.Sg(jSONObject2.optString("animationRippleBackgroundColor"));
                    yFl.YFl(jSONObject2.optString("animationScaleDirection"));
                    yFl.DSW(jSONObject2.optInt("animationFadeStart"));
                    yFl.qsH(jSONObject2.optInt("animationFadeEnd"));
                    yFl.vc(jSONObject2.optString("animationFillMode"));
                    yFl.NjR(jSONObject2.optInt("animationBounceHeight"));
                    if (vcVar.qO() > 0.0d) {
                        yFl.AlY(yFl.pDU() + vcVar.qO());
                    }
                    arrayList.add(yFl);
                }
                vcVar.YFl(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                vcVar.YI(jSONObject.optString("triggerSlideDirection", "0"));
                vcVar.YFl(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return vcVar;
    }

    public int Af() {
        return this.EAq;
    }

    public int AfY() {
        return this.uGS;
    }

    public int AlY() {
        return this.HVP;
    }

    public String BPI() {
        return this.Sco;
    }

    public int Bh() {
        return this.ZU;
    }

    public int Bn() {
        return this.Hjb;
    }

    public String Cfr() {
        return this.VOe;
    }

    public int Cqy() {
        return this.ko;
    }

    public int DSW() {
        return this.Af;
    }

    public int DjU() {
        return this.Vmj;
    }

    public int EAq() {
        return this.ECi;
    }

    public int ECi() {
        return this.f10372dc;
    }

    public float EH() {
        return this.DSW;
    }

    public boolean GA() {
        return this.wN;
    }

    public double GS() {
        return this.Cfr;
    }

    public int Gmi() {
        return this.agS;
    }

    public String Gnp() {
        return this.JT;
    }

    public int HVP() {
        return this.Gnp;
    }

    public boolean Hjb() {
        return this.Cqy;
    }

    public int IXB() {
        return this.AfY;
    }

    public boolean JT() {
        return this.VJb;
    }

    public int Jc() {
        return this.iY;
    }

    public int JwO() {
        return this.jz;
    }

    public String LL() {
        return this.toy;
    }

    public double Ld() {
        return this.zG;
    }

    public boolean Lx() {
        return this.dU;
    }

    public String Ne() {
        return this.rkt;
    }

    public int NjR() {
        return this.wqc;
    }

    public int PT() {
        List<YFl> list = this.kA;
        if (list != null) {
            for (YFl yFl : list) {
                if ("translate".equals(yFl.NjR()) && yFl.DSW() < 0) {
                    return -yFl.DSW();
                }
            }
            return 0;
        }
        return 0;
    }

    public boolean RX() {
        return this.Bh;
    }

    public String SVa() {
        return this.UT;
    }

    public double Sco() {
        return this.dXO;
    }

    public int Sg() {
        return this.JwO;
    }

    public String UI() {
        return this.mn;
    }

    public int UT() {
        return this.zz;
    }

    public String UZM() {
        return this.JB;
    }

    public boolean VB() {
        return this.fIu;
    }

    public boolean VJb() {
        return this.rog;
    }

    public String VOe() {
        return this.lG;
    }

    public String Vmj() {
        return this.tQ;
    }

    public float Wwa() {
        return this.f10375nc;
    }

    public String YI() {
        return this.qO;
    }

    public int YP() {
        return this.in;
    }

    public float YoT() {
        return this.Sg;
    }

    public int ZLB() {
        return this.lL;
    }

    public List<YFl> ZS() {
        return this.kA;
    }

    public String ZU() {
        return this.zB;
    }

    public double aIu() {
        return this.YoT;
    }

    public String agS() {
        return this.LL;
    }

    public String bZ() {
        return this.Wwa;
    }

    public JSONObject dBO() {
        return this.yn;
    }

    public int dGX() {
        return this.BPI;
    }

    public int dU() {
        return this.zl;
    }

    public String dXO() {
        return this.Ne;
    }

    public void dc() {
        YFl(this, this.yn);
    }

    public boolean dd() {
        return this.VB;
    }

    public float eT() {
        return this.YFl;
    }

    public boolean ep() {
        return this.Gmi;
    }

    public int fIu() {
        return this.mB;
    }

    public String hQ() {
        return this.bZ;
    }

    public int iY() {
        return this.UI;
    }

    public String ib() {
        return this.Ld;
    }

    public JSONObject in() {
        return this.f10374ib;
    }

    public int jz() {
        return this.rE;
    }

    public String kA() {
        return this.ZLB;
    }

    public int ko() {
        return this.lu;
    }

    public float lG() {
        return this.NjR;
    }

    public boolean lL() {
        return this.Jc;
    }

    public String lu() {
        return this.hQ;
    }

    public String mB() {
        return this.pq;
    }

    public int mn() {
        return this.YI;
    }

    public String nc() {
        return this.Uv;
    }

    public boolean ni() {
        return this.dBO;
    }

    public float pDU() {
        return this.f10378vc;
    }

    public int pm() {
        return this.SVa;
    }

    public boolean pq() {
        return this.UZM;
    }

    public double qO() {
        return this.eT;
    }

    public boolean qf() {
        return this.f10376ni;
    }

    public int qjy() {
        return this.YP;
    }

    public double qsH() {
        return this.IXB;
    }

    public int rE() {
        return this.Bn;
    }

    public float rkt() {
        return this.qsH;
    }

    public String rog() {
        return this.ZS;
    }

    public int tN() {
        return this.f10377qf;
    }

    public int tQ() {
        return this.dGX;
    }

    public long toy() {
        return this.ww;
    }

    public boolean uGS() {
        return this.f10373dd;
    }

    public JSONObject vc() {
        return this.pm;
    }

    public int wN() {
        return this.ep;
    }

    public String wXo() {
        return this.EH;
    }

    public int wqc() {
        return this.qjy;
    }

    public boolean xg() {
        return this.PT;
    }

    public String yn() {
        return this.Lx;
    }

    public int zB() {
        return this.Ga;
    }

    public boolean zG() {
        return this.GS;
    }

    public void zl() {
        YFl(this, this.f10379xg);
    }

    public boolean zz() {
        return this.RX;
    }

    public void AlY(int i10) {
        this.ep = i10;
    }

    public void Cfr(int i10) {
        this.AfY = i10;
    }

    public void DSW(float f10) {
        this.qsH = f10;
    }

    public void EH(String str) {
        this.pq = str;
    }

    public void GA(String str) {
        this.bZ = str;
    }

    public void GS(int i10) {
        this.ECi = i10;
    }

    public String Ga() {
        return this.wXo;
    }

    public void Ne(int i10) {
        this.Bn = i10;
    }

    public void NjR(float f10) {
        this.f10375nc = f10;
    }

    public void Sco(int i10) {
        this.Gnp = i10;
    }

    public void Sg(int i10) {
        this.f10377qf = i10;
    }

    public void UZM(int i10) {
        this.rE = i10;
    }

    public void VOe(int i10) {
        this.uGS = i10;
    }

    public void Wwa(String str) {
        this.Sco = str;
    }

    public void YI(int i10) {
        this.agS = i10;
    }

    public void YoT(String str) {
        this.VOe = str;
    }

    public void aIu(String str) {
        this.tQ = str;
    }

    public void bZ(int i10) {
        this.YP = i10;
    }

    public void dXO(int i10) {
        this.f10372dc = i10;
    }

    public void eT(String str) {
        this.Ne = str;
    }

    public void hQ(int i10) {
        this.EAq = i10;
    }

    public void lG(String str) {
        this.zB = str;
    }

    public void mn(int i10) {
        this.qjy = i10;
    }

    public void nc(String str) {
        this.wXo = str;
    }

    public void pDU(String str) {
        this.hQ = str;
    }

    public void pq(int i10) {
        this.SVa = i10;
    }

    public void qO(String str) {
        this.Ld = str;
    }

    public void qsH(float f10) {
        this.NjR = f10;
    }

    public void rkt(String str) {
        this.mn = str;
    }

    public void tN(int i10) {
        this.HVP = i10;
    }

    public void vc(int i10) {
        this.wqc = i10;
    }

    public void wN(int i10) {
        this.Af = i10;
    }

    public void wXo(int i10) {
        this.in = i10;
    }

    public void zB(int i10) {
        this.jz = i10;
    }

    public void AlY(float f10) {
        this.AlY = f10;
    }

    public void DSW(String str) {
        this.Wwa = str;
    }

    public void EH(int i10) {
        this.iY = i10;
    }

    public void GA(int i10) {
        this.BPI = i10;
    }

    public void Ga(int i10) {
        this.zl = i10;
    }

    public void Ne(String str) {
        this.UT = str;
    }

    public void NjR(String str) {
        this.aIu = str;
    }

    public void Sg(float f10) {
        this.Sg = f10;
    }

    public void UZM(String str) {
        this.LL = str;
    }

    public void VOe(String str) {
        this.JT = str;
    }

    public void Wwa(int i10) {
        this.lL = i10;
    }

    public void YI(String str) {
        this.toy = str;
    }

    public void YoT(int i10) {
        this.ZU = i10;
    }

    public void aIu(int i10) {
        this.Vmj = i10;
    }

    public void bZ(String str) {
        this.Lx = str;
    }

    public void eT(int i10) {
        this.UI = i10;
    }

    public void lG(int i10) {
        this.Hjb = i10;
    }

    public void nc(int i10) {
        this.mB = i10;
    }

    public void pDU(int i10) {
        this.ko = i10;
    }

    public void qO(int i10) {
        this.zz = i10;
    }

    public void qsH(String str) {
        this.qO = str;
    }

    public void rkt(int i10) {
        this.dGX = i10;
    }

    public void tN(float f10) {
        this.tN = f10;
    }

    public void vc(float f10) {
        this.DSW = f10;
    }

    public void wN(float f10) {
        this.f10378vc = f10;
    }

    public void wXo(String str) {
        this.ZLB = str;
    }

    public void AlY(String str) {
        this.EH = str;
    }

    public void DSW(int i10) {
        this.YI = i10;
    }

    public void EH(boolean z10) {
        this.f10376ni = z10;
    }

    public void GA(boolean z10) {
        this.rog = z10;
    }

    public void NjR(int i10) {
        this.lu = i10;
    }

    public void Sg(boolean z10) {
        this.wN = z10;
    }

    public void Wwa(boolean z10) {
        this.VJb = z10;
    }

    public void YoT(boolean z10) {
        this.dBO = z10;
    }

    public void eT(boolean z10) {
        this.f10373dd = z10;
    }

    public void lG(boolean z10) {
        this.dU = z10;
    }

    public void nc(boolean z10) {
        this.RX = z10;
    }

    public void pDU(boolean z10) {
        this.PT = z10;
    }

    public void qsH(int i10) {
        this.Ga = i10;
    }

    public void rkt(boolean z10) {
        this.Gmi = z10;
    }

    public void tN(double d10) {
        this.YoT = d10;
    }

    public void vc(String str) {
        this.lG = str;
    }

    public void wN(String str) {
        this.rkt = str;
    }

    public void AlY(double d10) {
        this.dXO = d10;
    }

    public void DSW(boolean z10) {
        this.Cqy = z10;
    }

    public void NjR(boolean z10) {
        this.Jc = z10;
    }

    public void Sg(double d10) {
        this.eT = d10;
    }

    public void qsH(boolean z10) {
        this.VB = z10;
    }

    public void tN(String str) {
        this.pDU = str;
    }

    public void vc(double d10) {
        this.zG = d10;
    }

    public void wN(double d10) {
        this.Cfr = d10;
    }

    public void AlY(boolean z10) {
        this.GS = z10;
    }

    public void Sg(String str) {
        this.GA = str;
    }

    public void tN(boolean z10) {
        this.UZM = z10;
    }

    public void vc(boolean z10) {
        this.Bh = z10;
    }

    public void wN(boolean z10) {
        this.fIu = z10;
    }

    public void AlY(JSONObject jSONObject) {
        this.yn = jSONObject;
    }

    public void Sg(JSONObject jSONObject) {
        this.f10374ib = jSONObject;
    }

    public void tN(JSONObject jSONObject) {
        this.f10379xg = jSONObject;
    }

    public void wN(JSONObject jSONObject) {
        this.pm = jSONObject;
    }

    public boolean YFl() {
        return this.DjU;
    }

    public void YFl(boolean z10) {
        this.DjU = z10;
    }

    public void YFl(int i10) {
        this.JwO = i10;
    }

    public void YFl(double d10) {
        this.IXB = d10;
    }

    public void YFl(String str) {
        this.Uv = str;
    }

    public void YFl(float f10) {
        this.YFl = f10;
    }

    public void YFl(List<YFl> list) {
        this.kA = list;
    }

    public void YFl(long j3) {
        this.ww = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0444 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x044d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x045f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x048d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x052a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x053c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x054e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x057b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0584 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x058d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x059f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x061f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0631 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x063a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.vc r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.AlY.vc.YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.vc, org.json.JSONObject):void");
    }
}
