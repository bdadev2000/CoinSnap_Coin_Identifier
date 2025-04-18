package com.bytedance.adsdk.ugeno.wN;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.Sg.YFl;
import com.bytedance.adsdk.ugeno.wN.wN;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class vc extends com.bytedance.adsdk.ugeno.Sg.YFl<wN> {
    private int ECi;
    private int Gmi;
    private int Gnp;
    private int dU;

    /* renamed from: ni, reason: collision with root package name */
    private int f10291ni;

    /* loaded from: classes.dex */
    public static class YFl extends YFl.C0064YFl {
        public int Ne = 1;
        public float VOe = 0.0f;
        public float bZ = 0.0f;
        public int UZM = -1;
        public float YI = -1.0f;
        public int Ga = -1;
        public int dXO = -1;
        public int Cfr = ViewCompat.MEASURED_SIZE_MASK;
        public int hQ = ViewCompat.MEASURED_SIZE_MASK;

        private float AlY(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float Sg(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float tN(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int wN(String str) {
            boolean z10;
            str.getClass();
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        z10 = 2;
                        break;
                    }
                    z10 = -1;
                    break;
                case 1384876188:
                    if (str.equals("flex_start")) {
                        z10 = 3;
                        break;
                    }
                    z10 = -1;
                    break;
                case 1744442261:
                    if (str.equals("flex_end")) {
                        z10 = 4;
                        break;
                    }
                    z10 = -1;
                    break;
                default:
                    z10 = -1;
                    break;
            }
            switch (z10) {
                case false:
                    return 4;
                case true:
                    return 3;
                case true:
                    return 2;
                case true:
                    return 0;
                case true:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        public String toString() {
            return "LayoutParams{mWidth=" + this.YFl + ", mHeight=" + this.Sg + ", mMargin=" + this.tN + ", mMarginLeft=" + this.AlY + ", mMarginRight=" + this.wN + ", mMarginTop=" + this.f10258vc + ", mMarginBottom=" + this.DSW + ", mParams=" + this.wXo + ", mOrder=" + this.Ne + ", mFlexGrow=" + this.VOe + ", mFlexShrink=" + this.bZ + ", mAlignSelf=" + this.UZM + ", mFlexBasisPercent=" + this.YI + ", mMinWidth=" + this.Ga + ", mMinHeight=" + this.dXO + ", mMaxWidth=" + this.Cfr + ", mMaxHeight=" + this.hQ + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
        public wN.YFl YFl() {
            wN.YFl yFl = new wN.YFl((int) this.YFl, (int) this.Sg);
            ((ViewGroup.MarginLayoutParams) yFl).leftMargin = (int) this.AlY;
            ((ViewGroup.MarginLayoutParams) yFl).rightMargin = (int) this.wN;
            ((ViewGroup.MarginLayoutParams) yFl).topMargin = (int) this.f10258vc;
            ((ViewGroup.MarginLayoutParams) yFl).bottomMargin = (int) this.DSW;
            yFl.tN(this.Ne);
            yFl.AlY(this.UZM);
            yFl.YFl(this.VOe);
            yFl.Sg(this.bZ);
            yFl.tN(this.YI);
            return yFl;
        }

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        public void YFl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.YFl(context, str, str2);
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1962496832:
                    if (str.equals("flexBasisPercent")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 106006350:
                    if (str.equals("order")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1031115618:
                    if (str.equals("flexShrink")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1743739820:
                    if (str.equals("flexGrow")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1767100401:
                    if (str.equals("alignSelf")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.YI = AlY(str2);
                    return;
                case 1:
                    this.Ne = YFl(str2);
                    return;
                case 2:
                    this.bZ = tN(str2);
                    return;
                case 3:
                    this.VOe = Sg(str2);
                    return;
                case 4:
                    this.UZM = wN(str2);
                    return;
                default:
                    return;
            }
        }

        private int YFl(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public vc(Context context) {
        super(context);
    }

    private int DSW(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int NjR(String str) {
        char c10;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            return 0;
        }
        if (c10 == 1) {
            return 1;
        }
        if (c10 == 2) {
            return 2;
        }
        if (c10 != 3) {
            return c10 != 4 ? 5 : 3;
        }
        return 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int qsH(String str) {
        char c10;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            return 0;
        }
        if (c10 == 1) {
            return 1;
        }
        if (c10 != 2) {
            return c10 != 3 ? 4 : 3;
        }
        return 2;
    }

    private int vc(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        ((wN) this.wN).setFlexDirection(this.Gnp);
        ((wN) this.wN).setFlexWrap(this.f10291ni);
        ((wN) this.wN).setJustifyContent(this.Gmi);
        ((wN) this.wN).setAlignItems(this.dU);
        ((wN) this.wN).setAlignContent(this.ECi);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.YFl(str, str2);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1063257157:
                if (str.equals("alignItems")) {
                    c10 = 0;
                    break;
                }
                break;
            case -975171706:
                if (str.equals("flexDirection")) {
                    c10 = 1;
                    break;
                }
                break;
            case -752601676:
                if (str.equals("alignContent")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1744216035:
                if (str.equals("flexWrap")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1860657097:
                if (str.equals("justifyContent")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.dU = qsH(str2);
                return;
            case 1:
                this.Gnp = wN(str2);
                return;
            case 2:
                this.ECi = NjR(str2);
                return;
            case 3:
                this.f10291ni = vc(str2);
                return;
            case 4:
                this.Gmi = DSW(str2);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public wN AlY() {
        wN wNVar = new wN(this.Sg);
        wNVar.YFl(this);
        return wNVar;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl
    public YFl.C0064YFl tN() {
        return new YFl();
    }

    public int wN(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c10 = 1;
                    break;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 3;
            case 1:
                return 2;
            case 2:
                return 1;
            default:
                return 0;
        }
    }
}
