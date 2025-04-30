package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.cW;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class woN {
    private long zp = 0;

    /* loaded from: classes.dex */
    public static class zp {
        private String Bj;
        private String COT;
        private String HWF;
        private String KS;
        private String QR;
        private String YW;
        private String dT;
        private String jU;
        private List<Integer> ku;
        private String lMd;
        private String tG;
        private String vDp;
        private String zp;

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.ugen.COT.zp lMd(zp zpVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.ugen.COT.zp().zp(zpVar.COT()).lMd(zpVar.dQp()).KS(zpVar.rV()).jU(zpVar.KVG()).COT(str);
        }

        @NonNull
        public static com.bytedance.sdk.component.adexpress.zp.KS.jU zp(zp zpVar, String str) {
            return com.bytedance.sdk.component.adexpress.zp.KS.jU.zp().zp(zpVar.COT()).lMd(zpVar.HWF()).KS(zpVar.QR()).jU(zpVar.ku()).COT(zpVar.jU()).HWF(str);
        }

        public String Bj() {
            return this.dT;
        }

        public String COT() {
            return this.zp;
        }

        public String HWF() {
            return this.lMd;
        }

        public List<Integer> KS() {
            return this.ku;
        }

        public String KVG() {
            return this.tG;
        }

        public String QR() {
            return this.KS;
        }

        public String YW() {
            return this.COT;
        }

        public String dQp() {
            return this.vDp;
        }

        public String dT() {
            return this.QR;
        }

        public String jU() {
            return this.HWF;
        }

        public String ku() {
            return this.jU;
        }

        public String rV() {
            return this.Bj;
        }

        public boolean tG() {
            if (!TextUtils.isEmpty(this.YW) && this.YW.equals("v3")) {
                return true;
            }
            return false;
        }

        public String vDp() {
            return this.YW;
        }

        public void Bj(String str) {
            this.vDp = str;
        }

        public void COT(String str) {
            this.jU = str;
        }

        public void HWF(String str) {
            this.COT = str;
        }

        public void KS(String str) {
            this.lMd = str;
        }

        public void QR(String str) {
            this.QR = str;
        }

        public void YW(String str) {
            this.YW = str;
        }

        public void dT(String str) {
            this.Bj = str;
        }

        public void jU(String str) {
            this.KS = str;
        }

        public void ku(String str) {
            this.dT = str;
        }

        public void vDp(String str) {
            this.tG = str;
        }

        public void lMd(String str) {
            this.zp = str;
        }

        public void zp(List<Integer> list) {
            this.ku = list;
        }

        public void zp(String str) {
            this.HWF = str;
        }
    }

    public static boolean COT(woN won) {
        if (won == null) {
            return false;
        }
        int mW = won.mW();
        return won.Fm() || mW == 5 || mW == 15 || mW == 50;
    }

    private static double HWF(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean KS(woN won) {
        return (won == null || won.eWG() == null || won.eWG().jU() != 7 || cz.lMd(won)) ? false : true;
    }

    public static boolean jU(woN won) {
        return (won == null || won.eWG() == null || won.eWG().zp() != 1) ? false : true;
    }

    public static boolean lMd(woN won) {
        return (zp(won) || KS(won)) ? false : true;
    }

    public abstract int Ay();

    public abstract rV BO();

    public abstract int Bj();

    public abstract void Bj(int i9);

    public abstract void Bj(String str);

    public abstract String COT();

    public abstract void COT(int i9);

    public abstract void COT(String str);

    public abstract void COT(boolean z8);

    public abstract float CZ();

    public abstract List<String> DY();

    public abstract int Dp();

    public abstract JSONObject Eg();

    public abstract int FGx();

    public abstract void FP(int i9);

    public abstract void FP(String str);

    public abstract boolean FP();

    public abstract boolean Fm();

    public abstract String GP();

    public abstract String Gor();

    public abstract int Gzh();

    public abstract void Gzh(int i9);

    public abstract void Gzh(String str);

    public abstract String HWF();

    public abstract void HWF(int i9);

    public abstract void HWF(String str);

    public abstract void HWF(boolean z8);

    public abstract String HaA();

    public abstract cW ITK();

    public abstract boolean IhO();

    public abstract String[] Iok();

    public abstract rV Iv();

    public abstract void JR();

    public abstract int JTQ();

    public abstract boolean KL();

    public abstract void KS(int i9);

    public abstract void KS(long j7);

    public abstract void KS(com.bykv.vk.openvk.component.video.api.KS.lMd lmd);

    public abstract void KS(rV rVVar);

    public abstract void KS(JSONObject jSONObject);

    public abstract void KS(boolean z8);

    public abstract boolean KS();

    public abstract int KVG();

    public abstract void KVG(int i9);

    public abstract void KVG(String str);

    public abstract com.bykv.vk.openvk.component.video.api.KS.lMd KVS();

    public abstract long LU();

    public abstract int Lij();

    public abstract void Lij(int i9);

    public abstract void Lij(String str);

    public abstract String MBR();

    public abstract boolean Ml();

    public abstract boolean NJ();

    public abstract boolean Ngi();

    public abstract long Np();

    public abstract String OJ();

    public abstract boolean Oza();

    public abstract int PI();

    public abstract String Pxi();

    public abstract void Pxi(int i9);

    public abstract void QR(int i9);

    public abstract void QR(String str);

    public abstract void QR(boolean z8);

    public boolean QR() {
        return (TextUtils.isEmpty(COT()) || TextUtils.isEmpty(HWF())) ? false : true;
    }

    public abstract AdSlot QUv();

    public abstract void QUv(int i9);

    public abstract boolean RA();

    public abstract String RCv();

    public abstract String RCv(String str);

    public abstract void RCv(int i9);

    public abstract JSONObject REM();

    public abstract JSONObject RRQ();

    public abstract int Rea();

    public abstract List<rV> Rg();

    public abstract List<String> Rh();

    public abstract int Sr();

    public abstract double Sx();

    public abstract JSONObject TS();

    public abstract int UPs();

    public abstract void UPs(int i9);

    public abstract void VTk();

    public abstract boolean Vc();

    public abstract void VgU();

    public abstract KS Vjb();

    public abstract int VuU();

    public abstract int WJ();

    public abstract JSONObject WLq();

    public abstract void WNy(int i9);

    public abstract boolean WNy();

    public abstract com.bytedance.sdk.openadsdk.core.ugen.COT.zp YC();

    public abstract jU YW();

    public abstract void YW(int i9);

    public abstract void YW(String str);

    public abstract boolean YcG();

    public abstract String YhE();

    public abstract void YhE(int i9);

    public abstract String aax();

    public abstract boolean bQm();

    public abstract int bX();

    public abstract int cW();

    public abstract void cW(int i9);

    public abstract String cdp();

    public abstract int cz();

    public abstract void cz(int i9);

    public abstract void cz(String str);

    public abstract int dQp();

    public abstract void dQp(int i9);

    public abstract void dQp(String str);

    public abstract int dT();

    public abstract void dT(int i9);

    public abstract void dT(String str);

    @Nullable
    public abstract String dm();

    public abstract boolean eS();

    public abstract com.bykv.vk.openvk.component.video.api.KS.lMd eWG();

    public abstract void eWG(int i9);

    public abstract boolean ea();

    public abstract boolean etV();

    public abstract int eyb();

    public abstract zp fRl();

    public abstract void fRl(int i9);

    public abstract String fVt();

    public abstract int ffE();

    public abstract void ffE(int i9);

    public abstract String fgJ();

    public abstract dT fs();

    public abstract vDp fw();

    public abstract void gG();

    public abstract List<String> gH();

    public abstract long gKR();

    public abstract boolean hG();

    public abstract void hRp();

    public abstract com.bytedance.sdk.component.widget.lMd.zp hl();

    public abstract int ho();

    public abstract int iOI();

    public abstract ku irS();

    public abstract void irS(int i9);

    public abstract int jQ();

    public abstract void jU(int i9);

    public abstract void jU(JSONObject jSONObject);

    public abstract void jU(boolean z8);

    public abstract boolean jU();

    public abstract int jyq();

    public abstract KVG ku();

    public abstract void ku(int i9);

    public abstract void ku(String str);

    public abstract void ku(boolean z8);

    public abstract void lMd(double d2);

    public abstract void lMd(int i9);

    public abstract void lMd(long j7);

    public abstract void lMd(com.bykv.vk.openvk.component.video.api.KS.lMd lmd);

    public abstract void lMd(rV rVVar);

    public abstract void lMd(JSONObject jSONObject);

    public abstract void lMd(boolean z8);

    public abstract boolean lT();

    public abstract boolean led();

    public abstract int mW();

    public abstract String mfu();

    public abstract int ny();

    public abstract boolean nz();

    public abstract String oB();

    public abstract int oKZ();

    public abstract int ot();

    public abstract void ot(int i9);

    public abstract void ot(String str);

    public abstract int ox();

    public abstract void ox(int i9);

    public abstract void ox(String str);

    public abstract int pdH();

    public abstract int pvr();

    public abstract void pvr(int i9);

    public abstract void pvr(String str);

    public abstract com.bykv.vk.openvk.component.video.api.KS.lMd qJZ();

    public abstract boolean qW();

    public abstract String qtv();

    public abstract int que();

    public abstract String rCC();

    public abstract String rOJ();

    public abstract int rV();

    public abstract void rV(int i9);

    public abstract void rV(String str);

    public abstract String si();

    public abstract boolean slc();

    public abstract int sm();

    public abstract List<FilterWord> sqt();

    public abstract cz tG();

    public abstract void tG(int i9);

    public abstract void tG(String str);

    public abstract boolean tyQ();

    public abstract boolean uOT();

    public abstract String uVa();

    public abstract long vDp();

    public abstract void vDp(int i9);

    public abstract void vDp(String str);

    public abstract boolean vFs();

    public abstract boolean vLi();

    public abstract String vwr();

    public abstract void vwr(int i9);

    public abstract void vwr(String str);

    public abstract int woN();

    public abstract void woN(int i9);

    public abstract void woN(String str);

    public abstract com.bytedance.sdk.openadsdk.core.QR.zp xg();

    public abstract boolean yI();

    public abstract int yRU();

    public abstract void yRU(int i9);

    public abstract void yRU(String str);

    public abstract boolean zR();

    public abstract boolean zf();

    public long zp() {
        return this.zp;
    }

    public abstract void zp(double d2);

    public abstract void zp(float f9);

    public abstract void zp(int i9);

    public abstract void zp(int i9, int i10);

    public abstract void zp(com.bykv.vk.openvk.component.video.api.KS.lMd lmd);

    public abstract void zp(AdSlot adSlot);

    public abstract void zp(FilterWord filterWord);

    public abstract void zp(com.bytedance.sdk.openadsdk.core.QR.zp zpVar);

    public abstract void zp(Bj bj);

    public abstract void zp(KS ks);

    public abstract void zp(KVG kvg);

    public abstract void zp(cz czVar);

    public abstract void zp(dT dTVar);

    public abstract void zp(jU jUVar);

    public abstract void zp(ku kuVar);

    public abstract void zp(rV rVVar);

    public abstract void zp(vDp vdp);

    public abstract void zp(zp zpVar);

    public abstract void zp(com.bytedance.sdk.openadsdk.core.ugen.COT.zp zpVar);

    public abstract void zp(Map<String, Object> map);

    public abstract void zp(boolean z8);

    public abstract void zp(String[] strArr);

    public abstract Map<String, Object> zpV();

    public static JSONObject KS(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("MaterialMeta", e4.getMessage());
            }
        }
        return null;
    }

    public static double lMd(String str) {
        return HWF(KS(str));
    }

    public void zp(long j7) {
        this.zp = j7;
    }

    private static long COT(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static int jU(String str) {
        return zp(KS(str));
    }

    public static boolean zp(woN won, boolean z8, boolean z9, boolean z10, boolean z11) {
        if (zp(won) || z11 || won == null || won.eWG() == null || TextUtils.isEmpty(won.eWG().vDp())) {
            return false;
        }
        return KS(won) ? z10 : (won.eWG() == null || won.eWG().zp() != 1) ? z8 : z9;
    }

    public static woN lMd() {
        return new FP();
    }

    public static String lMd(Context context, woN won) {
        if (context != null && won != null) {
            try {
                if (won.oKZ() == 8) {
                    String zp2 = com.bytedance.sdk.openadsdk.core.act.zp.zp(context);
                    if (TextUtils.isEmpty(zp2)) {
                        return null;
                    }
                    return zp2;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public static boolean zp(woN won) {
        return (won == null || won.eWG() == null || won.eWG().jU() != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.video.zp.lMd zp(String str, woN won) {
        won.WNy(0);
        int Dp = won.Dp();
        int i9 = 3;
        if (Dp == 3) {
            i9 = 4;
        } else if (Dp == 7) {
            i9 = 1;
        } else if (Dp == 8) {
            i9 = 2;
        }
        return new com.bytedance.sdk.openadsdk.core.video.zp.lMd(str, won.qJZ(), won.KVS(), won.jyq(), won.jQ(), i9);
    }

    public static long zp(String str) {
        return COT(KS(str));
    }

    public static int zp(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String zp(Context context, woN won) {
        if (context == null || won == null || !((won.Dp() == 8 || won.Dp() == 7) && won.WNy())) {
            return null;
        }
        String lMd = lMd(context, won);
        if (TextUtils.isEmpty(lMd) || com.bytedance.sdk.openadsdk.core.act.zp.zp() != 1) {
            return null;
        }
        return lMd;
    }
}
