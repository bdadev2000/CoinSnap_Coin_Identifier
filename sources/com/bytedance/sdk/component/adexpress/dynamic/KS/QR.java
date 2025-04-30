package com.bytedance.sdk.component.adexpress.dynamic.KS;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.jU.Bj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR {
    private COT COT;
    private String HWF;
    public JSONObject KS;
    private HWF jU;
    public String lMd;
    public int zp;

    public QR(COT cot) {
        this.COT = cot;
        this.zp = cot.zp();
        this.lMd = cot.KS();
        this.KS = cot.COT().YcG();
        this.HWF = cot.jU();
        if (com.bytedance.sdk.component.adexpress.jU.KS() == 1) {
            this.jU = cot.QR();
        } else {
            this.jU = cot.COT();
        }
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            this.jU = cot.COT();
        }
    }

    private boolean Rea() {
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.lMd) || !this.lMd.contains("adx:")) && !Bj.lMd()) {
            return false;
        }
        return true;
    }

    private boolean TS() {
        if ((com.bytedance.sdk.component.adexpress.jU.lMd() && (this.COT.lMd().contains("logo-union") || this.COT.lMd().contains("logounion") || this.COT.lMd().contains("logoad"))) || "logo-union".equals(this.COT.lMd()) || "logounion".equals(this.COT.lMd()) || "logoad".equals(this.COT.lMd())) {
            return true;
        }
        return false;
    }

    public int BO() {
        return this.jU.bX();
    }

    public String Bj() {
        if (this.zp == 1) {
            return this.lMd;
        }
        return "";
    }

    public float COT() {
        return this.jU.vwr();
    }

    public int CZ() {
        return this.jU.zR();
    }

    public int DY() {
        return this.jU.jQ();
    }

    public String Eg() {
        return this.jU.RCv();
    }

    public String FP() {
        return this.jU.ox();
    }

    public int GP() {
        return this.jU.WNy();
    }

    public int Gzh() {
        String Pxi = this.jU.Pxi();
        if (!"skip-with-time-skip-btn".equals(this.COT.lMd()) && !"skip".equals(this.COT.lMd()) && !TextUtils.equals("skip-with-countdowns-skip-btn", this.COT.lMd())) {
            if (!"skip-with-time-countdown".equals(this.COT.lMd()) && !"skip-with-time".equals(this.COT.lMd())) {
                if (this.zp == 10 && TextUtils.equals(this.jU.oKZ(), CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    return 5;
                }
                if (TS() && Rea()) {
                    return 0;
                }
                if (TS()) {
                    return 7;
                }
                if ("feedback-dislike".equals(this.COT.lMd())) {
                    return 3;
                }
                if (!TextUtils.isEmpty(Pxi) && !Pxi.equals("none")) {
                    if (!Pxi.equals(MimeTypes.BASE_TYPE_VIDEO) && (this.COT.zp() != 7 || !TextUtils.equals(Pxi, Constants.NORMAL))) {
                        if (Pxi.equals(Constants.NORMAL)) {
                            return 1;
                        }
                        if (!Pxi.equals("creative") && !"slide".equals(this.jU.oKZ())) {
                            return 0;
                        }
                        return 2;
                    }
                    if (com.bytedance.sdk.component.adexpress.jU.lMd() && this.COT.COT() != null && this.COT.COT().jyq()) {
                        return 11;
                    }
                    return 4;
                }
            }
            return 0;
        }
        return 6;
    }

    public String HWF() {
        if (this.zp == 0) {
            if (!TextUtils.isEmpty(this.lMd)) {
                return this.lMd;
            }
            return this.KS.optString(com.bytedance.sdk.component.adexpress.jU.QR.KS(com.bytedance.sdk.component.adexpress.jU.zp()));
        }
        return "";
    }

    public String Iv() {
        return this.jU.eWG();
    }

    public int KS() {
        return (int) this.jU.dQp();
    }

    public int KVG() {
        return zp(this.jU.Lij());
    }

    public long Lij() {
        return this.jU.WJ();
    }

    public String MBR() {
        return this.jU.QUv();
    }

    public int Np() {
        return this.jU.etV();
    }

    public boolean Pxi() {
        return this.jU.REM();
    }

    public int QR() {
        return zp(this.jU.ot());
    }

    public double QUv() {
        return this.jU.ku();
    }

    public String RCv() {
        return this.jU.Dp();
    }

    public boolean REM() {
        return this.jU.Fm();
    }

    public int Rg() {
        return this.jU.QR();
    }

    public int Rh() {
        return this.jU.RRQ();
    }

    public int UPs() {
        return this.jU.jU();
    }

    public boolean Vjb() {
        return this.jU.YhE();
    }

    public int WNy() {
        return this.jU.COT();
    }

    public int YW() {
        int ku = ku();
        if (ku == 4) {
            return 17;
        }
        if (ku == 3) {
            return 8388613;
        }
        return 8388611;
    }

    public String YcG() {
        return this.jU.Ay();
    }

    public int YhE() {
        return this.jU.lMd();
    }

    public boolean aax() {
        return this.jU.PI();
    }

    public boolean bQm() {
        return this.jU.tyQ();
    }

    public int bX() {
        return this.jU.HaA();
    }

    public int cW() {
        return this.jU.KS();
    }

    public boolean cz() {
        return this.jU.fw();
    }

    public float dQp() {
        return this.jU.Bj();
    }

    public String dT() {
        int i9 = this.zp;
        if (i9 != 2 && i9 != 13) {
            return "";
        }
        return this.lMd;
    }

    public String eWG() {
        return this.jU.oKZ();
    }

    public int fRl() {
        return this.jU.YW();
    }

    public double fVt() {
        return this.jU.ffE();
    }

    public String ffE() {
        return this.jU.dT();
    }

    public String fgJ() {
        return this.jU.qJZ();
    }

    public String fs() {
        return this.jU.cW();
    }

    public int gH() {
        return this.jU.eyb();
    }

    public int irS() {
        return zp(this.jU.yRU());
    }

    public int jU() {
        return (int) this.jU.KVG();
    }

    public int ku() {
        String FP = this.jU.FP();
        if (TtmlNode.LEFT.equals(FP)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(FP)) {
            return 4;
        }
        if (TtmlNode.RIGHT.equals(FP)) {
            return 3;
        }
        return 2;
    }

    public int lMd() {
        return (int) this.jU.woN();
    }

    public int mW() {
        return this.jU.UPs();
    }

    public String oB() {
        return this.jU.hRp();
    }

    public int oKZ() {
        return this.jU.CZ();
    }

    public boolean ot() {
        return this.jU.aax();
    }

    public String ox() {
        return this.jU.Pxi();
    }

    public int pvr() {
        return this.jU.pdH();
    }

    public boolean qtv() {
        return this.jU.tG();
    }

    public boolean rCC() {
        return this.jU.tyQ();
    }

    public double rV() {
        return this.jU.pvr();
    }

    public int si() {
        return this.jU.rOJ();
    }

    public double sqt() {
        return this.jU.fRl();
    }

    public double tG() {
        if (this.zp == 11) {
            try {
                double parseDouble = Double.parseDouble(this.lMd);
                if (!com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    return (int) parseDouble;
                }
                return parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public String vDp() {
        return this.HWF;
    }

    public int vLi() {
        return this.jU.xg();
    }

    public int vwr() {
        return this.jU.Iok();
    }

    public float woN() {
        return this.jU.vDp();
    }

    public int yRU() {
        return this.jU.Rg();
    }

    public int zp() {
        return (int) this.jU.rV();
    }

    public String zpV() {
        return this.jU.VuU();
    }

    public static float[] lMd(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split != null && split.length == 4) {
            return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void zp(float f9) {
        this.jU.zp(f9);
    }

    public static int zp(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean zp(int i9) {
        COT cot = this.COT;
        if (cot == null) {
            return false;
        }
        if (i9 == 1) {
            this.jU = cot.QR();
        } else {
            this.jU = cot.COT();
        }
        return this.jU != null;
    }
}
