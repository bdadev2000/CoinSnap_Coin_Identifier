package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.zB;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
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
import p5.a;

/* loaded from: classes.dex */
public class VOe extends Wwa {
    private int Af;
    private int AfY;
    private a BPI;
    private boolean Bh;
    private int Cfr;
    private int Cqy;
    private String EAq;
    private int ECi;
    private EH EH;
    private int EQ;
    private int GA;
    private tN Ga;
    private int Gmi;
    private volatile boolean HVP;
    private int JB;
    private String JGG;
    private int JT;
    private Wwa.YFl Jc;
    private JSONObject JwO;
    private boolean LL;
    private boolean Ld;
    private String Ne;
    private int OPr;
    private Ne PT;
    private boolean Pj;
    private String QGo;
    private String RX;
    private String SVa;
    private com.bytedance.sdk.openadsdk.core.eT.vc.YFl TMt;
    private int UI;
    private int UZM;
    private String Uv;
    private Map<String, Object> VB;
    private int VJb;
    private String VOe;
    private AdSlot Vmj;
    private JSONObject YP;
    private int YoT;
    private lG ZS;
    private int ZU;
    private String aIu;
    private String agS;
    private String bZ;
    private boolean cC;
    private GA dBO;
    private int dGX;
    private int dU;
    private eT dXO;

    /* renamed from: dc, reason: collision with root package name */
    private AlY f10685dc;
    private int eT;
    private boolean fIu;
    private int fcp;
    private String hQ;

    /* renamed from: hf, reason: collision with root package name */
    private JSONObject f10687hf;
    private boolean iY;

    /* renamed from: id, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.eT.vc.YFl f10689id;
    private int in;
    private UZM iv;
    private boolean ivp;
    private wN iyg;
    private String kA;
    private a ko;
    private boolean ks;
    private String lG;
    private wXo lX;
    private long mB;
    private String mn;

    /* renamed from: ni, reason: collision with root package name */
    private String f10691ni;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f10692oa;

    /* renamed from: oc, reason: collision with root package name */
    private String f10693oc;
    private EH pDU;
    private com.bytedance.sdk.openadsdk.core.YoT.YFl pm;
    private String pq;

    /* renamed from: qf, reason: collision with root package name */
    private int f10694qf;
    private YoT qjy;
    private String rkt;
    private int rog;
    private JSONObject tQ;
    private String toy;
    private String uGS;

    /* renamed from: vc, reason: collision with root package name */
    public long f10695vc;
    private String wXo;
    private String wqc;
    private int xSx;
    private a zG;
    private String zl;
    private final List<EH> DSW = new ArrayList();
    private final List<String> qsH = new ArrayList();
    private final List<FilterWord> NjR = new ArrayList();

    /* renamed from: nc, reason: collision with root package name */
    private final zB f10690nc = zB.Sg();
    public boolean wN = false;
    private List<String> Wwa = new ArrayList();
    private List<String> qO = new ArrayList();
    private String YI = "0";
    private String zB = "";
    private int Sco = 0;
    private int GS = 2;
    private int lu = 0;

    /* renamed from: ib, reason: collision with root package name */
    private int f10688ib = 0;
    private int Hjb = 1;

    /* renamed from: dd, reason: collision with root package name */
    private NjR f10686dd = new NjR();
    private int lL = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int zz = 0;
    private int Bn = 1;
    private int ZLB = 0;
    private int UT = 0;
    private int DjU = 0;
    private int rE = 1;
    private int jz = 1;
    private float Gnp = 100.0f;
    private int IXB = 2;

    /* renamed from: xg, reason: collision with root package name */
    private int f10696xg = 1;
    private int yn = 0;
    private int ep = -1;
    private long Lx = -1;
    private int ww = 0;
    private boolean Xrd = false;
    private int kU = 0;
    private int Ja = 50;
    private int pE = -1;

    private com.bytedance.sdk.openadsdk.core.eT.vc.YFl BL() {
        UZM UI = UI();
        if (UI == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.eT.vc.YFl().YFl(UI.YFl()).Sg(UI.Sg()).tN(UI.tN()).AlY(UI.AlY()).wN(kU() + "_v3");
    }

    public static boolean DSW(Wwa wwa) {
        if (wwa == null) {
            return false;
        }
        int ZLB = wwa.ZLB();
        return wwa.yn() || ZLB == 5 || ZLB == 15 || ZLB == 50;
    }

    private com.bytedance.sdk.openadsdk.core.eT.vc.YFl uxx() {
        Wwa.YFl lu = lu();
        if (lu == null) {
            return null;
        }
        return Wwa.YFl.Sg(lu, String.valueOf(kU()));
    }

    private static double vc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public wXo AXS() {
        return this.lX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public com.bytedance.sdk.openadsdk.core.YoT.YFl Af() {
        return this.pm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public Map<String, Object> AfY() {
        return this.VB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean AlY() {
        return this.fIu;
    }

    public int BJG() {
        return this.AfY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void BPI(int i10) {
        this.Ja = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Bh() {
        return this.OPr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public eT Bn() {
        return this.dXO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public com.bytedance.sdk.openadsdk.core.eT.vc.YFl CR() {
        return this.TMt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Cfr() {
        if (yn()) {
            return 5;
        }
        if (qjy() != 100.0f || Ne() == 2) {
            return 0;
        }
        return this.zz;
    }

    public int Cl() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String Cqy() {
        return this.rkt;
    }

    public String Cxk() {
        return this.bZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String DjU() {
        return this.SVa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public GA EAq() {
        return this.dBO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean ECi() {
        return this.Xrd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public Ne EH() {
        return this.PT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int ENV() {
        return this.Ja;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public zB EQ() {
        return this.f10690nc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Ef() {
        return this.cC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int GA() {
        if (Zu()) {
            return 5;
        }
        if (ZS()) {
            return 4;
        }
        AlY alY = this.f10685dc;
        if (alY == null) {
            return 1;
        }
        return alY.Sg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int GS() {
        return this.Cqy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean GT() {
        return this.ivp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Ga(String str) {
        this.Uv = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public JSONObject Gmi() {
        JSONObject ni2 = ni();
        JSONObject Wwa = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().Wwa(String.valueOf(kU()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(ni2);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", Wwa);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("MaterialMeta", "toJsonObjPlus", e2.getMessage());
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Gnp() {
        if (yn() || QXK() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean HVP() {
        return this.HVP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public com.bytedance.sdk.openadsdk.core.eT.vc.YFl HaH() {
        return this.f10689id;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String Hjb() {
        return this.aIu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int IXB() {
        return this.ECi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public JSONObject JB() {
        if (this.tQ == null) {
            try {
                if (!TextUtils.isEmpty(this.mn)) {
                    this.tQ = new JSONObject(this.mn);
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("MaterialMeta", e2.getMessage());
            }
        }
        return this.tQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int JGG() {
        return this.ep;
    }

    public com.bytedance.sdk.component.adexpress.YFl.tN.AlY JO() {
        Wwa.YFl lu = lu();
        if (lu == null) {
            return null;
        }
        return Wwa.YFl.YFl(lu, String.valueOf(kU()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public com.bytedance.sdk.component.NjR.Sg.YFl JT() {
        com.bytedance.sdk.component.NjR.Sg.YFl yFl = new com.bytedance.sdk.component.NjR.Sg.YFl();
        yFl.YFl(this.Cqy);
        yFl.Sg(this.YI);
        yFl.YFl(uGS());
        return yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Ja() {
        return this.ww;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String Jc() {
        return this.lG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean JwO() {
        return this.f10694qf == 1;
    }

    public int KY() {
        return this.Bn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String LL() {
        return this.VOe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public EH Ld() {
        return this.EH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Lx() {
        return this.JT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void MJU() {
        a aVar = this.BPI;
        if (aVar != null && !TextUtils.isEmpty(aVar.f23463h)) {
            try {
                if (this.BPI.f23463h.contains("style_id")) {
                    this.f10692oa = true;
                    this.JGG = Uri.parse(this.BPI.f23463h).getQueryParameters("style_id").get(0);
                } else {
                    this.f10692oa = false;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean MZ() {
        return this.f10692oa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int NW() {
        if (this.pE < 0) {
            try {
                JSONObject JB = JB();
                if (JB != null) {
                    this.pE = JB.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.pE = 0;
                }
            } catch (Throwable unused) {
                this.pE = 0;
            }
        }
        return this.pE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String NZ() {
        return this.toy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Ne() {
        int i10 = this.YoT;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (Pj()) {
            return 2;
        }
        return this.GS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public lG NjR() {
        return this.ZS;
    }

    public int OIY() {
        return this.in;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void OPr() {
        this.f10690nc.AlY();
        DSW(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String PT() {
        return this.wqc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean PVM() {
        return this.ks;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Pj() {
        if (pq() == null || pq().getDurationSlotType() != 8 || !ZS()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean QGo() {
        GA ga2;
        if (!yn() || xSx() || (ga2 = this.dBO) == null || ga2.YFl() != 1) {
            return false;
        }
        return true;
    }

    public int QXK() {
        return this.lu;
    }

    public int QmD() {
        return this.EQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public List<String> RX() {
        return this.Wwa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int SVa() {
        if (this.jz != 2) {
            this.jz = 1;
        }
        return this.jz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Sco() {
        return Cl() == 100 || this.YoT == 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(boolean z10) {
        this.iY = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean TMt() {
        return Uv() == 7;
    }

    public int Tei() {
        return this.UI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void UI(int i10) {
        this.JB = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public List<FilterWord> UT() {
        return this.NjR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int UZM() {
        return this.f10688ib;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Uv() {
        if (this.ep < 0) {
            JSONObject JB = JB();
            if (JB != null) {
                this.ep = JB.optInt("ad_slot_type", 0);
            } else {
                this.ep = 0;
            }
        }
        return this.ep;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public List<EH> VB() {
        return this.DSW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int VJb() {
        int i10 = this.dU;
        if (i10 > 0) {
            return i10;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean VOe() {
        return this.ZLB == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean VRF() {
        return this.LL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String Vmj() {
        return this.pq;
    }

    public String Wm() {
        return this.f10691ni;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int Wwa() {
        return this.f10696xg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Xns() {
        if (this.ep <= 0) {
            this.ep = Uv();
        }
        int i10 = this.ep;
        if ((i10 == 7 || i10 == 8) && !DSW(this) && lG() != 21 && this.fcp == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Xrd() {
        return Uv() == 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(boolean z10) {
        this.fIu = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YI(String str) {
        this.toy = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public long YP() {
        return this.mB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int YoT() {
        AlY alY = this.f10685dc;
        if (alY == null) {
            return 2;
        }
        return alY.YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int ZLB() {
        return this.Cfr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean ZS() {
        return this.ww == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void ZU(int i10) {
        this.kU = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean Zu() {
        List<Integer> tN;
        if (lu() != null && (tN = lu().tN()) != null && tN.contains(57)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String aIu() {
        return this.zB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int agS() {
        return this.Af;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String bT() {
        return this.QGo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int bZ() {
        return this.DjU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String bg() {
        return this.JGG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean blt() {
        return this.Pj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String bwE() {
        return this.Uv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    @Nullable
    public String cC() {
        tN in = in();
        if (in != null && !TextUtils.isEmpty(in.YFl())) {
            return in.YFl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int dBO() {
        return this.yn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public EH dGX() {
        return this.pDU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int dU() {
        return this.Gmi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void dXO(String str) {
        this.QGo = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public a dc() {
        return this.zG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String dd() {
        return this.wXo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void eA() {
        this.ks = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public AlY eT() {
        return this.f10685dc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int ep() {
        return this.rog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Wwa wwa = (Wwa) obj;
            if (this.YI.equals(wwa.zz()) && this.mn.equals(wwa.uGS())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean fIu() {
        return this.xSx == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean fcp() {
        if (yn() && !xSx()) {
            int nextInt = new Random().nextInt(100);
            GA ga2 = this.dBO;
            if (ga2 != null && nextInt < ga2.tN()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public NjR hQ() {
        return this.f10686dd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean hf() {
        return Uv() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean iY() {
        return this.EQ == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public List<String> ib() {
        return this.qsH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean id() {
        return Uv() == 3 || Uv() == 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public tN in() {
        return this.Ga;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean iv() {
        return Uv() == 8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String ivp() {
        JSONObject JB;
        String str = this.EAq;
        if (TextUtils.isEmpty(str) && (JB = JB()) != null) {
            str = JB.optString("req_id", "");
            Cfr(str);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public long iyg() {
        return this.f10695vc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean jqV() {
        return this.YFl;
    }

    public String ju() {
        return this.uGS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean jz() {
        if (this.DSW.isEmpty()) {
            return false;
        }
        if (this.Cfr == 4 && this.DSW.size() < 3) {
            return false;
        }
        Iterator<EH> it = this.DSW.iterator();
        while (it.hasNext()) {
            if (!it.next().wN()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public JSONObject kA() {
        return this.YP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int kU() {
        JSONObject JB = JB();
        if (JB == null) {
            return 0;
        }
        return JB.optInt("rit", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String kYz() {
        JSONObject JB;
        if (this.f10693oc == null && (JB = JB()) != null) {
            this.f10693oc = JB.optString(BidResponsedEx.KEY_CID, "");
        }
        return this.f10693oc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int ko() {
        return this.eT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public double ks() {
        return vc(JB());
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int lG() {
        return this.GA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String lL() {
        if (!TextUtils.isEmpty(this.Ne)) {
            return this.Ne;
        }
        Context YFl = com.bytedance.sdk.openadsdk.core.lG.YFl();
        int ko = ko();
        if (ko != 2 && ko != 3) {
            if (ko != 4) {
                if (ko != 8) {
                    return this.Ne;
                }
            } else {
                if (YFl != null) {
                    return com.bytedance.sdk.component.utils.qO.YFl(YFl, "tt_video_download_apk");
                }
                return this.Ne;
            }
        }
        if (YFl != null) {
            return com.bytedance.sdk.component.utils.qO.YFl(YFl, "tt_video_mobile_go_detail");
        }
        return this.Ne;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean lX() {
        return this.wN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public Wwa.YFl lu() {
        return this.Jc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean mB() {
        Wwa.YFl yFl = this.Jc;
        if (yFl != null) {
            return !TextUtils.isEmpty(yFl.GA());
        }
        int i10 = this.f10688ib;
        return i10 == 9 || i10 == 10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int mn() {
        return this.lL;
    }

    public int myS() {
        return this.xSx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public wN nc() {
        return this.iyg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public JSONObject ni() {
        Object tN;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", ko());
            jSONObject.put(Wwa.tN, myS());
            jSONObject.put("interaction_method", lG());
            jSONObject.put(Wwa.Sg, QmD());
            jSONObject.put(Wwa.AlY, Bh());
            jSONObject.put("target_url", Cqy());
            jSONObject.put("app_log_url", Vmj());
            jSONObject.put("gecko_id", DjU());
            jSONObject.put("extension", wqc());
            jSONObject.put("ad_id", zz());
            jSONObject.put("source", zG());
            jSONObject.put("app_name", Cxk());
            jSONObject.put("screenshot", rE());
            jSONObject.put("dislike_control", QXK());
            jSONObject.put("play_bar_show_time", mn());
            jSONObject.put("play_bar_style", Cfr());
            jSONObject.put("if_block_lp", rQ());
            jSONObject.put("cache_sort", utE());
            jSONObject.put("if_sp_cache", BJG());
            jSONObject.put("render_control", Ne());
            jSONObject.put("mrc_report", this.f10694qf);
            jSONObject.put("isMrcReportFinish", this.HVP);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cta", qO());
            jSONObject2.put("other", Wwa());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, aIu());
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, wXo());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(vc()) && !TextUtils.isEmpty(DSW())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", vc());
                jSONObject4.put("adchoices_url", DSW());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            EH dGX = dGX();
            if (dGX != null && !TextUtils.isEmpty(dGX.YFl())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", dGX.YFl());
                jSONObject5.put("height", dGX.tN());
                jSONObject5.put("width", dGX.Sg());
                jSONObject.put(RewardPlus.ICON, jSONObject5);
            }
            EH Ld = Ld();
            if (Ld != null && !TextUtils.isEmpty(Ld.YFl())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("url", Ld.YFl());
                jSONObject6.put("height", Ld.tN());
                jSONObject6.put("width", Ld.Sg());
                jSONObject.put("cover_image", jSONObject6);
            }
            Object kA = kA();
            if (kA != null) {
                jSONObject.put("session_params", kA);
            }
            NjR hQ = hQ();
            if (hQ != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", hQ.YFl);
                jSONObject7.put("click_upper_non_content_area", hQ.Sg);
                jSONObject7.put("click_lower_content_area", hQ.tN);
                jSONObject7.put("click_lower_non_content_area", hQ.AlY);
                jSONObject7.put("click_button_area", hQ.wN);
                jSONObject7.put("click_video_area", hQ.f10684vc);
                jSONObject.put("click_area", jSONObject7);
            }
            wN nc2 = nc();
            if (nc2 != null) {
                jSONObject.put("arbitrage_interceptor_params", nc2.qsH());
            }
            AdSlot pq = pq();
            if (pq != null) {
                jSONObject.put("adslot", pq.toJsonObj());
            }
            List<EH> VB = VB();
            if (VB != null) {
                JSONArray jSONArray = new JSONArray();
                for (EH eh2 : VB) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("url", eh2.YFl());
                    jSONObject8.put("height", eh2.tN());
                    jSONObject8.put("width", eh2.Sg());
                    jSONObject8.put("image_preview", eh2.vc());
                    jSONObject8.put("image_key", eh2.DSW());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> RX = RX();
            if (RX != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it = RX.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> tQ = tQ();
            if (tQ != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it2 = tQ.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, jSONArray3);
            }
            List<String> ib2 = ib();
            if (ib2 != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<String> it3 = ib2.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", Jc());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, Hjb());
            jSONObject.put("description", dd());
            jSONObject.put("ext", uGS());
            jSONObject.put("image_mode", ZLB());
            jSONObject.put("cover_click_area", Cl());
            jSONObject.put("intercept_flag", OIY());
            jSONObject.put("button_text", lL());
            jSONObject.put("ad_logo", KY());
            jSONObject.put("video_adaptation", dXO());
            jSONObject.put("feed_video_opentype", bZ());
            jSONObject.put("orientation", SVa());
            jSONObject.put("aspect_ratio", qjy());
            tN in = in();
            if (in != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", in.Sg());
                jSONObject9.put(CampaignEx.JSON_KEY_PACKAGE_NAME, in.tN());
                jSONObject9.put(DownloadModel.DOWNLOAD_URL, in.YFl());
                jSONObject9.put("score", in.AlY());
                jSONObject9.put("comment_num", in.wN());
                jSONObject9.put(CampaignEx.JSON_KEY_APP_SIZE, in.vc());
                jSONObject9.put("app_category", in.DSW());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject9);
            }
            eT Bn = Bn();
            if (Bn != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", Bn.YFl());
                jSONObject10.put("fallback_url", Bn.Sg());
                jSONObject10.put("fallback_type", Bn.tN());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject10);
            }
            wXo AXS = AXS();
            if (AXS != null && (tN = AXS.tN()) != null) {
                jSONObject.put("oem", tN);
            }
            List<FilterWord> UT = UT();
            if (UT != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator<FilterWord> it4 = UT.iterator();
                while (it4.hasNext()) {
                    JSONObject Sg = Sg(it4.next());
                    if (Sg != null) {
                        jSONArray5.put(Sg);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            EH().YFl(jSONObject);
            jSONObject.put("count_down", Tei());
            jSONObject.put("expiration_time", YP());
            a zl = zl();
            if (zl != null) {
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, zl.b());
            }
            a dc2 = dc();
            if (dc2 != null) {
                jSONObject.put("h265_video", dc2.b());
            }
            jSONObject.put("video_encode_type", agS());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("if_send_click", ZU());
            jSONObject.put("download_conf", jSONObject11);
            if (AfY() != null) {
                JSONObject jSONObject12 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = AfY().entrySet();
                if (!entrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : entrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            Wwa.YFl lu = lu();
            if (lu != null) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put("id", lu.vc());
                jSONObject13.put("md5", lu.DSW());
                jSONObject13.put("url", lu.qsH());
                jSONObject13.put(DataSchemeDataSource.SCHEME_DATA, lu.NjR());
                jSONObject13.put("diff_data", lu.nc());
                jSONObject13.put("version", lu.wN());
                jSONObject13.put("dynamic_creative", lu.eT());
                jSONObject13.put("engine_version", lu.GA());
                jSONObject13.put("ugen_data", lu.lG());
                jSONObject13.put("ugen_md5", lu.rkt());
                jSONObject13.put("ugen_url", lu.EH());
                jSONObject.put("tpl_info", jSONObject13);
            }
            UZM uzm = this.iv;
            if (uzm != null) {
                jSONObject.put("tpl_info_v3", uzm.vc());
            }
            jSONObject.put("dynamic_creative", zlC());
            jSONObject.put("creative_extra", zB());
            jSONObject.put("market_url", ju());
            jSONObject.put("auction_price", Ga());
            jSONObject.put("ad_info", Wm());
            jSONObject.put("is_package_open", dU());
            jSONObject.put("playable_duration_time", VJb());
            jSONObject.put("playable_endcard_close_time", IXB());
            jSONObject.put("endcard_close_time", xg());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("render_sequence", UZM());
            jSONObject14.put("backup_render_control", YI());
            jSONObject14.put("reserve_time", ep());
            jSONObject14.put("render_thread", Lx());
            jSONObject.put("render", jSONObject14);
            if (this.ZS == null) {
                lG lGVar = new lG();
                this.ZS = lGVar;
                lGVar.YFl("");
                this.ZS.YFl(10L);
                this.ZS.Sg(20L);
                this.ZS.tN(10L);
                this.ZS.AlY(20L);
            }
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.ZS.YFl());
            jSONObject15.put("straight_lp_showtime", this.ZS.Sg());
            jSONObject15.put("onlyagg_loading_maxtime", this.ZS.tN());
            jSONObject15.put("straight_agg_showtime", this.ZS.AlY());
            jSONObject15.put("loading_text", this.ZS.wN());
            jSONObject.put("interaction_method_params", jSONObject15);
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("splash_clickarea", YoT());
            jSONObject16.put("splash_layout_id", GA());
            jSONObject16.put("load_wait_time", pDU());
            jSONObject.put("splash_control", jSONObject16);
            if (ZS()) {
                jSONObject.put("dsp_html", this.wqc);
            }
            if (yn()) {
                jSONObject.put("vast_json", this.pm.nc());
            }
            jSONObject.put("dsp_material_type", Ja());
            jSONObject.put("deep_link_appname", this.VOe);
            jSONObject.put("landing_page_download_clicktype", this.UZM);
            GA ga2 = this.dBO;
            if (ga2 != null) {
                jSONObject.put("dsp_style", ga2.wN());
            }
            jSONObject.put("jump_probability", this.JB);
            jSONObject.put("identificationOverlayContent", this.Uv);
            if (this.f10689id != null) {
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.f10689id.YFl(this.TMt));
                jSONObject.put("ugen", jSONObject17);
            }
            jSONObject.put("preload_h5_type", rnG());
            jSONObject.put("hasReportShow", this.ivp);
            jSONObject.put("endcard_creative", this.QGo);
            jSONObject.put("image_stay", this.fcp);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public long oa() {
        if (this.Lx < 0) {
            JSONObject JB = JB();
            if (JB != null) {
                this.Lx = JB.optLong("ad_id", 0L);
            } else {
                this.Lx = 0L;
            }
        }
        return this.Lx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean oc() {
        int i10 = this.YoT;
        return (i10 == 2 || i10 == 1) && 3 == this.eT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void on() {
        this.cC = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public long pDU() {
        AlY alY = this.f10685dc;
        if (alY == null) {
            return 0L;
        }
        return alY.tN();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean pE() {
        /*
            r3 = this;
            boolean r0 = r3.xSx()
            r1 = 0
            if (r0 != 0) goto L2f
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 100
            int r0 = r0.nextInt(r2)
            boolean r2 = r3.yn()
            if (r2 == 0) goto L21
            com.bytedance.sdk.openadsdk.core.model.GA r2 = r3.dBO
            if (r2 == 0) goto L2a
            int r2 = r2.Sg()
            goto L2b
        L21:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.Ne.Sg(r3)
            if (r2 != 0) goto L2a
            int r2 = r3.JB
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.model.VOe.pE():boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int pm() {
        JSONObject jSONObject = this.JwO;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt("easy_playable_skip_duration", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public AdSlot pq() {
        return this.Vmj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int qO() {
        return this.IXB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void qf() {
        this.HVP = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public float qjy() {
        if (this.Gnp <= 0.0f) {
            this.Gnp = 100.0f;
        }
        return (this.Gnp * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean qsH() {
        return (TextUtils.isEmpty(vc()) || TextUtils.isEmpty(DSW())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean rE() {
        return this.Ld;
    }

    public int rQ() {
        return this.ZLB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int rkt() {
        return this.YoT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int rnG() {
        return this.kU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int rog() {
        return this.dGX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void tN(boolean z10) {
        this.Bh = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public List<String> tQ() {
        return this.qO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int toy() {
        return this.UZM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String uGS() {
        return this.mn;
    }

    public int utE() {
        return this.rE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean wN() {
        return this.iY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int wXo() {
        return this.Sco;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public JSONObject wqc() {
        return this.JwO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean ww() {
        a aVar = this.BPI;
        if (aVar == null || aVar.f23468m != 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean xSx() {
        return this.f10690nc.YFl > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int xg() {
        return this.VJb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public boolean yn() {
        int i10 = this.ww;
        if ((i10 == 1 || i10 == 3) && Af() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int ynx() {
        try {
            JSONObject JB = JB();
            if (JB == null) {
                return 0;
            }
            return JB.optInt("rec_clk", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String zB() {
        return this.RX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void zG(int i10) {
        this.fcp = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public a zl() {
        return this.ko;
    }

    public JSONObject zlC() {
        return this.f10687hf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String zz() {
        return this.YI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void AlY(int i10) {
        this.GS = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public a BPI() {
        return this.BPI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void EH(int i10) {
        this.AfY = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void GS(int i10) {
        this.Af = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String Ga() {
        return this.kA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void NjR(boolean z10) {
        this.Pj = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sco(int i10) {
        this.yn = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl) {
        this.TMt = yFl;
        com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl(yFl, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public UZM UI() {
        return this.iv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void UZM(int i10) {
        this.lu = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void VOe(int i10) {
        this.UI = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Wwa(int i10) {
        this.xSx = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(wN wNVar) {
        this.iyg = wNVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int YI() {
        return this.Hjb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YoT(int i10) {
        this.in = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int ZU() {
        YoT yoT = this.qjy;
        if (yoT == null) {
            return 0;
        }
        return yoT.YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void aIu(int i10) {
        this.EQ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void bZ(int i10) {
        this.jz = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public int dXO() {
        return this.UT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void eT(int i10) {
        this.zz = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void hQ(int i10) {
        this.f10694qf = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void lG(int i10) {
        this.Cqy = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void lu(int i10) {
        this.UZM = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void mn(int i10) {
        this.JT = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void nc(int i10) {
        this.Bn = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void pDU(int i10) {
        this.rE = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void pq(int i10) {
        this.rog = Math.max(0, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void qO(int i10) {
        this.eT = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void qsH(boolean z10) {
        this.ivp = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void rkt(int i10) {
        this.ZU = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void tN(int i10) {
        this.Sco = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String vc() {
        return this.agS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void wN(String str) {
        this.agS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void wXo(int i10) {
        this.OPr = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void zB(int i10) {
        this.dGX = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String zG() {
        return this.hQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void AlY(boolean z10) {
        this.Ld = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String DSW() {
        return this.zl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void EH(String str) {
        this.aIu = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Ga(int i10) {
        this.dU = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void NjR(String str) {
        this.kA = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public String UZM(String str) {
        JSONObject JB = JB();
        return JB != null ? JB.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void VOe(String str) {
        this.wqc = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Wwa(String str) {
        this.YI = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(lG lGVar) {
        this.ZS = lGVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YI(int i10) {
        this.Gmi = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YoT(String str) {
        this.bZ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void aIu(String str) {
        this.mn = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void bZ(String str) {
        this.VOe = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void dXO(int i10) {
        this.ECi = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void eT(String str) {
        this.hQ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void lG(String str) {
        this.Ne = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void nc(String str) {
        this.RX = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void pDU(String str) {
        this.lG = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void qO(String str) {
        this.pq = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void qsH(String str) {
        this.f10691ni = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void rkt(String str) {
        this.wXo = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void tN(EH eh2) {
        this.DSW.add(eh2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void vc(String str) {
        this.zl = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void wN(int i10) {
        this.ZLB = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void wXo(String str) {
        this.SVa = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void AlY(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.eT = 4;
        this.YI = jSONObject.optString("id");
        this.hQ = jSONObject.optString("source");
        tN tNVar = new tN();
        this.Ga = tNVar;
        tNVar.tN(jSONObject.optString("pkg_name"));
        this.Ga.Sg(jSONObject.optString("name"));
        this.Ga.YFl(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Cfr(int i10) {
        this.VJb = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void DSW(boolean z10) {
        this.LL = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void GA(int i10) {
        this.lL = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Ne(int i10) {
        this.Cfr = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void NjR(int i10) {
        this.UT = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(int i10) {
        this.YoT = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl) {
        this.f10689id = yFl;
        com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl(yFl, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void mB(int i10) {
        this.ww = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void qsH(int i10) {
        this.Hjb = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void tN(JSONObject jSONObject) {
        this.YP = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void vc(int i10) {
        this.DjU = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void wN(JSONObject jSONObject) {
        this.JwO = jSONObject;
    }

    public void Cfr(String str) {
        this.EAq = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void DSW(String str) {
        this.zB = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void GA(String str) {
        this.rkt = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Ne(String str) {
        this.uGS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.IXB = 2;
        } else {
            this.IXB = (int) d10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void tN(a aVar) {
        this.zG = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void vc(boolean z10) {
        this.wN = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void wN(boolean z10) {
        this.Xrd = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void DSW(int i10) {
        this.f10688ib = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(AlY alY) {
        this.f10685dc = alY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void tN(long j3) {
        this.f10695vc = j3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(JSONObject jSONObject) {
        this.f10687hf = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(Ne ne2) {
        this.PT = ne2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(EH eh2) {
        this.EH = eh2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(int i10) {
        YFl(i10, -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(long j3) {
        this.mB = j3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(int i10, int i11) {
        this.GA = i10;
        this.YoT = i10;
        if (this.Vmj == null) {
            this.YoT = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = Uv();
        }
        if (this.Vmj.getNativeAdType() != 3 && this.Vmj.getDurationSlotType() != 3 && i11 != 3) {
            if (this.Vmj.getNativeAdType() != 7 && this.Vmj.getNativeAdType() != 8 && this.Vmj.getDurationSlotType() != 7 && this.Vmj.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (Ne.Sg(this)) {
                    this.YoT = 4;
                    return;
                }
                if (this.GA == 4 && !Ne.Sg(this)) {
                    this.YoT = 0;
                }
                if (i10 >= 5) {
                    this.YoT = 0;
                    return;
                }
                if (this.GA == 2 && ko() != 3) {
                    this.YoT = 0;
                    return;
                } else {
                    if (i10 == 0 || (i10 == 1 && ko() != 3)) {
                        this.YoT = 0;
                        return;
                    }
                    return;
                }
            }
            if (Ne.tN(this)) {
                this.YoT = 12;
                return;
            }
            if (Ne.Sg(this)) {
                this.YoT = 9;
                return;
            }
            if (this.GA == 5 && !rkt.tN(this)) {
                this.YoT = 7;
            }
            if (this.GA == 6 && !rkt.Sg(this)) {
                this.YoT = 7;
            }
            if (this.GA == 8 && Cl() != 100) {
                this.YoT = 7;
            }
            if (this.GA == 19 && TextUtils.isEmpty(this.rkt)) {
                this.YoT = 7;
            }
            if (this.GA == 20 && TextUtils.isEmpty(this.rkt)) {
                this.YoT = 7;
            }
            if (i10 < 5) {
                this.YoT = 7;
                return;
            }
            return;
        }
        this.YoT = 14;
    }

    private JSONObject Sg(FilterWord filterWord) {
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
                        jSONArray.put(Sg(it.next()));
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

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void Sg(a aVar) {
        this.ko = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.f10696xg = 1;
        } else {
            this.f10696xg = (int) d10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(NjR njR) {
        this.f10686dd = njR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(AdSlot adSlot) {
        this.Vmj = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(Wwa.YFl yFl) {
        this.Jc = yFl;
        com.bytedance.sdk.component.adexpress.YFl.tN.AlY JO = JO();
        if (JO != null && !mB()) {
            com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl(JO);
        }
        if (yFl == null || TextUtils.isEmpty(yFl.EH())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl(uxx(), "ad");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(UZM uzm) {
        this.iv = uzm;
        if (uzm == null || TextUtils.isEmpty(uzm.tN())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl(BL(), "adv3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(a aVar) {
        this.BPI = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(YoT yoT) {
        this.qjy = yoT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(EH eh2) {
        this.pDU = eh2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(tN tNVar) {
        this.Ga = tNVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(eT eTVar) {
        this.dXO = eTVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(FilterWord filterWord) {
        this.NjR.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(Map<String, Object> map) {
        this.VB = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(float f10) {
        this.Gnp = f10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl yFl) {
        this.pm = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(GA ga2) {
        this.dBO = ga2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.Wwa
    public void YFl(wXo wxo) {
        this.lX = wxo;
    }
}
