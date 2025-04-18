package com.bytedance.sdk.component.adexpress.dynamic.AlY;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.wN.eT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW {
    private vc AlY;
    public String Sg;
    public int YFl;
    public JSONObject tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10364vc;
    private wN wN;

    public DSW(wN wNVar) {
        this.wN = wNVar;
        this.YFl = wNVar.YFl();
        this.Sg = wNVar.tN();
        this.tN = wNVar.wN().in();
        this.f10364vc = wNVar.AlY();
        if (com.bytedance.sdk.component.adexpress.AlY.tN() == 1) {
            this.AlY = wNVar.DSW();
        } else {
            this.AlY = wNVar.wN();
        }
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            this.AlY = wNVar.wN();
        }
    }

    private boolean AfY() {
        if ((com.bytedance.sdk.component.adexpress.AlY.Sg() && (this.wN.Sg().contains("logo-union") || this.wN.Sg().contains("logounion") || this.wN.Sg().contains("logoad"))) || "logo-union".equals(this.wN.Sg()) || "logounion".equals(this.wN.Sg()) || "logoad".equals(this.wN.Sg())) {
            return true;
        }
        return false;
    }

    private boolean kA() {
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.Sg) || !this.Sg.contains("adx:")) && !eT.Sg()) {
            return false;
        }
        return true;
    }

    public int AlY() {
        return (int) this.AlY.rkt();
    }

    public String BPI() {
        return this.AlY.lu();
    }

    public int Bh() {
        return this.AlY.IXB();
    }

    public String Bn() {
        return this.AlY.Gnp();
    }

    public double Cfr() {
        return this.AlY.qsH();
    }

    public String Cqy() {
        return this.AlY.Cfr();
    }

    public int DSW() {
        return YFl(this.AlY.Ne());
    }

    public int DjU() {
        return this.AlY.Gmi();
    }

    public float EH() {
        return this.AlY.eT();
    }

    public double GA() {
        if (this.YFl == 11) {
            try {
                double parseDouble = Double.parseDouble(this.Sg);
                if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    return (int) parseDouble;
                }
                return parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public String GS() {
        return this.AlY.nc();
    }

    public int Ga() {
        String mB = this.AlY.mB();
        if (!"skip-with-time-skip-btn".equals(this.wN.Sg()) && !"skip".equals(this.wN.Sg()) && !TextUtils.equals("skip-with-countdowns-skip-btn", this.wN.Sg())) {
            if (!"skip-with-time-countdown".equals(this.wN.Sg()) && !"skip-with-time".equals(this.wN.Sg())) {
                if (this.YFl == 10 && TextUtils.equals(this.AlY.UI(), CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    return 5;
                }
                if (AfY() && kA()) {
                    return 0;
                }
                if (AfY()) {
                    return 7;
                }
                if ("feedback-dislike".equals(this.wN.Sg())) {
                    return 3;
                }
                if (!TextUtils.isEmpty(mB) && !mB.equals("none")) {
                    if (!mB.equals(MimeTypes.BASE_TYPE_VIDEO) && (this.wN.YFl() != 7 || !TextUtils.equals(mB, Constants.NORMAL))) {
                        if (mB.equals(Constants.NORMAL)) {
                            return 1;
                        }
                        if (!mB.equals("creative") && !"slide".equals(this.AlY.UI())) {
                            return 0;
                        }
                        return 2;
                    }
                    if (com.bytedance.sdk.component.adexpress.AlY.Sg() && this.wN.wN() != null && this.wN.wN().Lx()) {
                        return 11;
                    }
                    return 4;
                }
            }
            return 0;
        }
        return 6;
    }

    public int Hjb() {
        return this.AlY.mn();
    }

    public String Jc() {
        return this.AlY.rog();
    }

    public boolean Ld() {
        return this.AlY.xg();
    }

    public boolean Ne() {
        return this.AlY.zG();
    }

    public int NjR() {
        int qsH = qsH();
        if (qsH == 4) {
            return 17;
        }
        return qsH == 3 ? 8388613 : 8388611;
    }

    public boolean RX() {
        return this.AlY.GA();
    }

    public int Sco() {
        return this.AlY.NjR();
    }

    public int Sg() {
        return (int) this.AlY.lG();
    }

    public int UI() {
        return this.AlY.UT();
    }

    public int UT() {
        return this.AlY.dU();
    }

    public String UZM() {
        return this.AlY.LL();
    }

    public String VB() {
        return this.AlY.yn();
    }

    public int VOe() {
        return this.AlY.ko();
    }

    public int Vmj() {
        return this.AlY.Af();
    }

    public int Wwa() {
        return this.AlY.JwO();
    }

    public int YFl() {
        return (int) this.AlY.pDU();
    }

    public long YI() {
        return this.AlY.toy();
    }

    public boolean YP() {
        return this.AlY.xg();
    }

    public String YoT() {
        return this.f10364vc;
    }

    public int ZLB() {
        return this.AlY.ECi();
    }

    public int ZU() {
        return this.AlY.ZLB();
    }

    public boolean aIu() {
        return this.AlY.qf();
    }

    public String bZ() {
        return this.AlY.mB();
    }

    public int dGX() {
        return this.AlY.jz();
    }

    public int dXO() {
        return YFl(this.AlY.VOe());
    }

    public int dd() {
        return this.AlY.zB();
    }

    public String eT() {
        if (this.YFl == 1) {
            return this.Sg;
        }
        return "";
    }

    public int fIu() {
        return this.AlY.wqc();
    }

    public int hQ() {
        return this.AlY.tN();
    }

    public int iY() {
        return this.AlY.EAq();
    }

    public String ib() {
        return this.AlY.hQ();
    }

    public String in() {
        return this.AlY.agS();
    }

    public int ko() {
        return this.AlY.DSW();
    }

    public float lG() {
        return this.AlY.YoT();
    }

    public double lL() {
        return this.AlY.Sco();
    }

    public String lu() {
        return this.AlY.UI();
    }

    public boolean mB() {
        return this.AlY.uGS();
    }

    public int mn() {
        return this.AlY.wN();
    }

    public String nc() {
        int i10 = this.YFl;
        if (i10 != 2 && i10 != 13) {
            return "";
        }
        return this.Sg;
    }

    public double pDU() {
        return this.AlY.qO();
    }

    public int pq() {
        return this.AlY.Sg();
    }

    public int qO() {
        return this.AlY.HVP();
    }

    public int qsH() {
        String wXo = this.AlY.wXo();
        if (TtmlNode.LEFT.equals(wXo)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(wXo)) {
            return 4;
        }
        if (TtmlNode.RIGHT.equals(wXo)) {
            return 3;
        }
        return 2;
    }

    public String rE() {
        return this.AlY.UZM();
    }

    public int rkt() {
        return YFl(this.AlY.YI());
    }

    public int tN() {
        return (int) this.AlY.EH();
    }

    public boolean tQ() {
        return this.AlY.pq();
    }

    public boolean uGS() {
        return this.AlY.ni();
    }

    public String vc() {
        if (this.YFl == 0) {
            if (!TextUtils.isEmpty(this.Sg)) {
                return this.Sg;
            }
            return this.tN.optString(com.bytedance.sdk.component.adexpress.AlY.qsH.tN(com.bytedance.sdk.component.adexpress.AlY.YFl()));
        }
        return "";
    }

    public float wN() {
        return this.AlY.Wwa();
    }

    public String wXo() {
        return this.AlY.bZ();
    }

    public int zB() {
        return this.AlY.AlY();
    }

    public boolean zG() {
        return this.AlY.VJb();
    }

    public double zz() {
        return this.AlY.GS();
    }

    public static float[] Sg(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (split == null || split.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    public void YFl(float f10) {
        this.AlY.YFl(f10);
    }

    public static int YFl(String str) {
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
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean YFl(int i10) {
        wN wNVar = this.wN;
        if (wNVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.AlY = wNVar.DSW();
        } else {
            this.AlY = wNVar.wN();
        }
        return this.AlY != null;
    }
}
