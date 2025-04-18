package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.zB;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p5.a;

/* loaded from: classes.dex */
public abstract class Wwa {
    public static final String AlY;
    public static final String Sg;
    public static final String tN;
    protected boolean YFl;
    private long wN = 0;

    /* loaded from: classes.dex */
    public static class YFl {
        private String AlY;
        private String DSW;
        private String GA;
        private String NjR;
        private String Sg;
        private String YFl;
        private String YoT;
        private String eT;

        /* renamed from: nc, reason: collision with root package name */
        private String f10697nc;
        private String pDU;
        private List<Integer> qsH;
        private String tN;

        /* renamed from: vc, reason: collision with root package name */
        private String f10698vc;
        private String wN;

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.eT.vc.YFl Sg(YFl yFl, String str) {
            return new com.bytedance.sdk.openadsdk.core.eT.vc.YFl().YFl(yFl.vc()).Sg(yFl.rkt()).tN(yFl.EH()).AlY(yFl.lG()).wN(str);
        }

        @NonNull
        public static com.bytedance.sdk.component.adexpress.YFl.tN.AlY YFl(YFl yFl, String str) {
            return com.bytedance.sdk.component.adexpress.YFl.tN.AlY.YFl().YFl(yFl.vc()).Sg(yFl.DSW()).tN(yFl.qsH()).AlY(yFl.NjR()).wN(yFl.wN()).vc(str);
        }

        public String AlY() {
            return this.NjR;
        }

        public String DSW() {
            return this.Sg;
        }

        public String EH() {
            return this.YoT;
        }

        public String GA() {
            return this.f10697nc;
        }

        public String NjR() {
            return this.AlY;
        }

        public String YoT() {
            return this.eT;
        }

        public String eT() {
            return this.DSW;
        }

        public String lG() {
            return this.pDU;
        }

        public String nc() {
            return this.wN;
        }

        public boolean pDU() {
            return !TextUtils.isEmpty(this.f10697nc) && this.f10697nc.equals("v3");
        }

        public String qsH() {
            return this.tN;
        }

        public String rkt() {
            return this.GA;
        }

        public List<Integer> tN() {
            return this.qsH;
        }

        public String vc() {
            return this.YFl;
        }

        public String wN() {
            return this.f10698vc;
        }

        public void AlY(String str) {
            this.Sg = str;
        }

        public void DSW(String str) {
            this.wN = str;
        }

        public void GA(String str) {
            this.pDU = str;
        }

        public void NjR(String str) {
            this.eT = str;
        }

        public void YoT(String str) {
            this.GA = str;
        }

        public void eT(String str) {
            this.YoT = str;
        }

        public void nc(String str) {
            this.f10697nc = str;
        }

        public void qsH(String str) {
            this.DSW = str;
        }

        public void tN(String str) {
            this.YFl = str;
        }

        public void vc(String str) {
            this.AlY = str;
        }

        public void wN(String str) {
            this.tN = str;
        }

        public void Sg(String str) {
            this.f10698vc = str;
        }

        public void YFl(List<Integer> list) {
            this.qsH = list;
        }

        public void YFl(String str) {
            this.NjR = str;
        }
    }

    static {
        CharSequence[] charSequenceArr = {"is", Sco.wXo()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) "_");
        sb2.append(charSequenceArr[1]);
        Sg = sb2.toString();
        CharSequence[] charSequenceArr2 = {"is", Sco.wXo(), "sample"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i10 = 1; i10 < 3; i10++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[i10]);
        }
        tN = sb3.toString();
        CharSequence[] charSequenceArr3 = {Sco.wXo(), "strategy"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        sb4.append((CharSequence) "_");
        sb4.append(charSequenceArr3[1]);
        AlY = sb4.toString();
    }

    public Wwa() {
        this.YFl = false;
        this.YFl = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("is_new_playable", false);
    }

    public static boolean AlY(Wwa wwa) {
        return (wwa == null || wwa.BPI() == null || wwa.BPI().f23466k != 1) ? false : true;
    }

    private static double DSW(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean tN(Wwa wwa) {
        return (wwa == null || wwa.BPI() == null || wwa.BPI().f23467l != 7 || Ne.DSW(wwa)) ? false : true;
    }

    private static long vc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static boolean wN(Wwa wwa) {
        if (wwa == null) {
            return false;
        }
        int ZLB = wwa.ZLB();
        return wwa.yn() || ZLB == 5 || ZLB == 15 || ZLB == 50;
    }

    public abstract wXo AXS();

    public abstract com.bytedance.sdk.openadsdk.core.YoT.YFl Af();

    public abstract Map<String, Object> AfY();

    public abstract void AlY(int i10);

    public abstract void AlY(JSONObject jSONObject);

    public abstract void AlY(boolean z10);

    public abstract boolean AlY();

    public abstract a BPI();

    public abstract void BPI(int i10);

    public abstract int Bh();

    public abstract eT Bn();

    public abstract com.bytedance.sdk.openadsdk.core.eT.vc.YFl CR();

    public abstract int Cfr();

    public abstract void Cfr(int i10);

    public abstract String Cqy();

    public abstract String DSW();

    public abstract void DSW(int i10);

    public abstract void DSW(String str);

    public abstract void DSW(boolean z10);

    public abstract String DjU();

    public abstract GA EAq();

    public abstract boolean ECi();

    public abstract Ne EH();

    public abstract void EH(int i10);

    public abstract void EH(String str);

    public abstract int ENV();

    public abstract zB EQ();

    public abstract boolean Ef();

    public abstract int GA();

    public abstract void GA(int i10);

    public abstract void GA(String str);

    public abstract int GS();

    public abstract void GS(int i10);

    public abstract boolean GT();

    public abstract String Ga();

    public abstract void Ga(int i10);

    public abstract void Ga(String str);

    public abstract JSONObject Gmi();

    public abstract boolean Gnp();

    public abstract boolean HVP();

    public abstract com.bytedance.sdk.openadsdk.core.eT.vc.YFl HaH();

    public abstract String Hjb();

    public abstract int IXB();

    public abstract JSONObject JB();

    public abstract int JGG();

    public abstract com.bytedance.sdk.component.NjR.Sg.YFl JT();

    public abstract int Ja();

    public abstract String Jc();

    public abstract boolean JwO();

    public abstract String LL();

    public abstract EH Ld();

    public abstract int Lx();

    public abstract void MJU();

    public abstract boolean MZ();

    public abstract int NW();

    public abstract String NZ();

    public abstract int Ne();

    public abstract void Ne(int i10);

    public abstract void Ne(String str);

    public abstract lG NjR();

    public abstract void NjR(int i10);

    public abstract void NjR(String str);

    public abstract void NjR(boolean z10);

    public abstract void OPr();

    public abstract String PT();

    public abstract boolean PVM();

    public abstract boolean Pj();

    public abstract boolean QGo();

    public abstract List<String> RX();

    public abstract int SVa();

    public abstract void Sco(int i10);

    public abstract boolean Sco();

    public long Sg() {
        return this.wN;
    }

    public abstract void Sg(double d10);

    public abstract void Sg(int i10);

    public abstract void Sg(long j3);

    public abstract void Sg(com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl);

    public abstract void Sg(EH eh2);

    public abstract void Sg(JSONObject jSONObject);

    public abstract void Sg(a aVar);

    public abstract void Sg(boolean z10);

    public abstract boolean TMt();

    public abstract UZM UI();

    public abstract void UI(int i10);

    public abstract List<FilterWord> UT();

    public abstract int UZM();

    public abstract String UZM(String str);

    public abstract void UZM(int i10);

    public abstract int Uv();

    public abstract List<EH> VB();

    public abstract int VJb();

    public abstract void VOe(int i10);

    public abstract void VOe(String str);

    public abstract boolean VOe();

    public abstract boolean VRF();

    public abstract String Vmj();

    public abstract int Wwa();

    public abstract void Wwa(int i10);

    public abstract void Wwa(String str);

    public abstract boolean Xns();

    public abstract boolean Xrd();

    public abstract void YFl(double d10);

    public abstract void YFl(float f10);

    public abstract void YFl(int i10);

    public abstract void YFl(int i10, int i11);

    public abstract void YFl(AdSlot adSlot);

    public abstract void YFl(FilterWord filterWord);

    public abstract void YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl yFl);

    public abstract void YFl(com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl);

    public abstract void YFl(AlY alY);

    public abstract void YFl(EH eh2);

    public abstract void YFl(GA ga2);

    public abstract void YFl(Ne ne2);

    public abstract void YFl(NjR njR);

    public abstract void YFl(UZM uzm);

    public abstract void YFl(YFl yFl);

    public abstract void YFl(YoT yoT);

    public abstract void YFl(eT eTVar);

    public abstract void YFl(lG lGVar);

    public abstract void YFl(tN tNVar);

    public abstract void YFl(wN wNVar);

    public abstract void YFl(wXo wxo);

    public abstract void YFl(Map<String, Object> map);

    public abstract void YFl(a aVar);

    public abstract void YFl(boolean z10);

    public boolean YFl() {
        int rkt = rkt();
        return (Ne() != 2 || rkt == 5 || rkt == 6 || rkt == 19 || rkt == 12) ? false : true;
    }

    public abstract int YI();

    public abstract void YI(int i10);

    public abstract void YI(String str);

    public abstract long YP();

    public abstract int YoT();

    public abstract void YoT(int i10);

    public abstract void YoT(String str);

    public abstract int ZLB();

    public abstract boolean ZS();

    public abstract int ZU();

    public abstract void ZU(int i10);

    public abstract boolean Zu();

    public abstract String aIu();

    public abstract void aIu(int i10);

    public abstract void aIu(String str);

    public abstract int agS();

    public abstract String bT();

    public abstract int bZ();

    public abstract void bZ(int i10);

    public abstract void bZ(String str);

    public abstract String bg();

    public abstract boolean blt();

    public abstract String bwE();

    @Nullable
    public abstract String cC();

    public abstract int dBO();

    public abstract EH dGX();

    public abstract int dU();

    public abstract int dXO();

    public abstract void dXO(int i10);

    public abstract void dXO(String str);

    public abstract a dc();

    public abstract String dd();

    public abstract void eA();

    public abstract AlY eT();

    public abstract void eT(int i10);

    public abstract void eT(String str);

    public abstract int ep();

    public abstract boolean fIu();

    public abstract boolean fcp();

    public abstract NjR hQ();

    public abstract void hQ(int i10);

    public abstract boolean hf();

    public abstract boolean iY();

    public abstract List<String> ib();

    public abstract boolean id();

    public abstract tN in();

    public abstract boolean iv();

    public abstract String ivp();

    public abstract long iyg();

    public abstract boolean jqV();

    public abstract boolean jz();

    public abstract JSONObject kA();

    public abstract int kU();

    public abstract String kYz();

    public abstract int ko();

    public abstract double ks();

    public abstract int lG();

    public abstract void lG(int i10);

    public abstract void lG(String str);

    public abstract String lL();

    public abstract boolean lX();

    public abstract YFl lu();

    public abstract void lu(int i10);

    public abstract void mB(int i10);

    public abstract boolean mB();

    public abstract int mn();

    public abstract void mn(int i10);

    public abstract wN nc();

    public abstract void nc(int i10);

    public abstract void nc(String str);

    public abstract JSONObject ni();

    public abstract long oa();

    public abstract boolean oc();

    public abstract void on();

    public abstract long pDU();

    public abstract void pDU(int i10);

    public abstract void pDU(String str);

    public abstract boolean pE();

    public abstract int pm();

    public abstract AdSlot pq();

    public abstract void pq(int i10);

    public abstract int qO();

    public abstract void qO(int i10);

    public abstract void qO(String str);

    public abstract void qf();

    public abstract float qjy();

    public abstract void qsH(int i10);

    public abstract void qsH(String str);

    public abstract void qsH(boolean z10);

    public boolean qsH() {
        return (TextUtils.isEmpty(vc()) || TextUtils.isEmpty(DSW())) ? false : true;
    }

    public abstract boolean rE();

    public abstract int rkt();

    public abstract void rkt(int i10);

    public abstract void rkt(String str);

    public abstract int rnG();

    public abstract int rog();

    public abstract void tN(int i10);

    public abstract void tN(long j3);

    public abstract void tN(EH eh2);

    public abstract void tN(JSONObject jSONObject);

    public abstract void tN(a aVar);

    public abstract void tN(boolean z10);

    public abstract List<String> tQ();

    public abstract int toy();

    public abstract String uGS();

    public abstract String vc();

    public abstract void vc(int i10);

    public abstract void vc(String str);

    public abstract void vc(boolean z10);

    public abstract void wN(int i10);

    public abstract void wN(String str);

    public abstract void wN(JSONObject jSONObject);

    public abstract void wN(boolean z10);

    public abstract boolean wN();

    public abstract int wXo();

    public abstract void wXo(int i10);

    public abstract void wXo(String str);

    public abstract JSONObject wqc();

    public abstract boolean ww();

    public abstract boolean xSx();

    public abstract int xg();

    public abstract boolean yn();

    public abstract int ynx();

    public abstract String zB();

    public abstract void zB(int i10);

    public abstract String zG();

    public abstract void zG(int i10);

    public abstract a zl();

    public abstract String zz();

    public static boolean Sg(Wwa wwa) {
        return (YFl(wwa) || tN(wwa)) ? false : true;
    }

    public static boolean vc(Wwa wwa) {
        Object obj;
        if (wwa == null) {
            return false;
        }
        try {
            Map<String, Object> AfY = wwa.AfY();
            if (AfY == null || (obj = AfY.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("MaterialMeta", th2.getMessage());
            return false;
        }
    }

    public static double Sg(String str) {
        return DSW(tN(str));
    }

    public void YFl(long j3) {
        this.wN = j3;
    }

    public static int AlY(String str) {
        return YFl(tN(str));
    }

    public static boolean YFl(Wwa wwa, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (YFl(wwa) || z13 || wwa == null || wwa.BPI() == null || TextUtils.isEmpty(wwa.BPI().f23463h)) {
            return false;
        }
        return tN(wwa) ? z12 : (wwa.BPI() == null || wwa.BPI().f23466k != 1) ? z10 : z11;
    }

    public static JSONObject tN(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("MaterialMeta", e2.getMessage());
            }
        }
        return null;
    }

    public static String Sg(Context context, Wwa wwa) {
        if (context != null && wwa != null) {
            try {
                if (wwa.ko() == 8 || wwa.nc().YFl()) {
                    String YFl2 = com.bytedance.sdk.openadsdk.core.act.YFl.YFl(context);
                    if (TextUtils.isEmpty(YFl2)) {
                        return null;
                    }
                    return YFl2;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("MaterialMeta", th2.getMessage());
            }
        }
        return null;
    }

    public static Wwa tN() {
        return new VOe();
    }

    public static boolean YFl(Wwa wwa) {
        return (wwa == null || wwa.BPI() == null || wwa.BPI().f23467l != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl(String str, Wwa wwa) {
        wwa.Sco(0);
        int Uv = wwa.Uv();
        int i10 = 3;
        if (Uv == 3) {
            i10 = 4;
        } else if (Uv == 7) {
            i10 = 1;
        } else if (Uv == 8) {
            i10 = 2;
        }
        return new com.bytedance.sdk.openadsdk.core.GA.YFl.Sg(str, wwa.zl(), wwa.dc(), wwa.dBO(), wwa.agS(), i10);
    }

    public static long YFl(String str) {
        return vc(tN(str));
    }

    public static int YFl(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String YFl(Context context, Wwa wwa) {
        if (context == null || wwa == null || !((wwa.Uv() == 8 || wwa.Uv() == 7) && wwa.Sco())) {
            return null;
        }
        String Sg2 = Sg(context, wwa);
        if (TextUtils.isEmpty(Sg2) || com.bytedance.sdk.openadsdk.core.act.YFl.YFl() != 1) {
            return null;
        }
        return Sg2;
    }
}
