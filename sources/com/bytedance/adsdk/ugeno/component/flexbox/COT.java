package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;
import com.bytedance.adsdk.ugeno.component.zp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class COT extends com.bytedance.adsdk.ugeno.component.zp<FlexboxLayout> {
    private int DY;
    private int MBR;
    private int Rh;
    private int gH;
    private int rCC;

    /* loaded from: classes.dex */
    public static class zp extends zp.C0066zp {
        public int YW = 1;
        public float dT = 0.0f;
        public float Bj = 0.0f;
        public int vDp = -1;
        public float tG = -1.0f;
        public int rV = -1;
        public int dQp = -1;
        public int KVG = ViewCompat.MEASURED_SIZE_MASK;
        public int woN = ViewCompat.MEASURED_SIZE_MASK;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int COT(String str) {
            boolean z8;
            str.getClass();
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        z8 = false;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        z8 = true;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        z8 = 2;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1384876188:
                    if (str.equals("flex_start")) {
                        z8 = 3;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1744442261:
                    if (str.equals("flex_end")) {
                        z8 = 4;
                        break;
                    }
                    z8 = -1;
                    break;
                default:
                    z8 = -1;
                    break;
            }
            switch (z8) {
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

        private float KS(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float jU(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float lMd(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.zp + ", mHeight=" + this.lMd + ", mMargin=" + this.KS + ", mMarginLeft=" + this.jU + ", mMarginRight=" + this.COT + ", mMarginTop=" + this.HWF + ", mMarginBottom=" + this.QR + ", mParams=" + this.ku + ", mOrder=" + this.YW + ", mFlexGrow=" + this.dT + ", mFlexShrink=" + this.Bj + ", mAlignSelf=" + this.vDp + ", mFlexBasisPercent=" + this.tG + ", mMinWidth=" + this.rV + ", mMinHeight=" + this.dQp + ", mMaxWidth=" + this.KVG + ", mMaxHeight=" + this.woN + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.component.zp.C0066zp
        /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
        public FlexboxLayout.zp zp() {
            FlexboxLayout.zp zpVar = new FlexboxLayout.zp((int) this.zp, (int) this.lMd);
            ((ViewGroup.MarginLayoutParams) zpVar).leftMargin = (int) this.jU;
            ((ViewGroup.MarginLayoutParams) zpVar).rightMargin = (int) this.COT;
            ((ViewGroup.MarginLayoutParams) zpVar).topMargin = (int) this.HWF;
            ((ViewGroup.MarginLayoutParams) zpVar).bottomMargin = (int) this.QR;
            zpVar.KS(this.YW);
            zpVar.jU(this.vDp);
            zpVar.zp(this.dT);
            zpVar.lMd(this.Bj);
            zpVar.KS(this.tG);
            return zpVar;
        }

        @Override // com.bytedance.adsdk.ugeno.component.zp.C0066zp
        public void zp(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.zp(context, str, str2);
            str.getClass();
            char c9 = 65535;
            switch (str.hashCode()) {
                case -1962496832:
                    if (str.equals("flexBasisPercent")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 106006350:
                    if (str.equals("order")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 1031115618:
                    if (str.equals("flexShrink")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 1743739820:
                    if (str.equals("flexGrow")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 1767100401:
                    if (str.equals("alignSelf")) {
                        c9 = 4;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    this.tG = jU(str2);
                    return;
                case 1:
                    this.YW = zp(str2);
                    return;
                case 2:
                    this.Bj = KS(str2);
                    return;
                case 3:
                    this.dT = lMd(str2);
                    return;
                case 4:
                    this.vDp = COT(str2);
                    return;
                default:
                    return;
            }
        }

        private int zp(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public COT(Context context) {
        super(context);
    }

    private int COT(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c9 = 1;
                    break;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
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

    private int HWF(String str) {
        str.getClass();
        if (!str.equals("wrap")) {
            return 0;
        }
        return 1;
    }

    private int QR(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
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
    private int YW(String str) {
        char c9;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0) {
            return 0;
        }
        if (c9 == 1) {
            return 1;
        }
        if (c9 == 2) {
            return 2;
        }
        if (c9 == 3) {
            return 4;
        }
        if (c9 != 4) {
            return 5;
        }
        return 3;
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp
    public zp.C0066zp ku() {
        return new zp();
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp, com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ((FlexboxLayout) this.COT).setFlexDirection(this.DY);
        ((FlexboxLayout) this.COT).setFlexWrap(this.Rh);
        ((FlexboxLayout) this.COT).setJustifyContent(this.gH);
        ((FlexboxLayout) this.COT).setAlignItems(this.rCC);
        ((FlexboxLayout) this.COT).setAlignContent(this.MBR);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: vwr, reason: merged with bridge method [inline-methods] */
    public FlexboxLayout KS() {
        FlexboxLayout flexboxLayout = new FlexboxLayout(this.lMd);
        flexboxLayout.zp(this);
        return flexboxLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.zp(str, str2);
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1063257157:
                if (str.equals("alignItems")) {
                    c9 = 0;
                    break;
                }
                break;
            case -975171706:
                if (str.equals("flexDirection")) {
                    c9 = 1;
                    break;
                }
                break;
            case -752601676:
                if (str.equals("alignContent")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1744216035:
                if (str.equals("flexWrap")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1860657097:
                if (str.equals("justifyContent")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.rCC = ku(str2);
                return;
            case 1:
                this.DY = COT(str2);
                return;
            case 2:
                this.MBR = YW(str2);
                return;
            case 3:
                this.Rh = HWF(str2);
                return;
            case 4:
                this.gH = QR(str2);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int ku(String str) {
        char c9;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0) {
            return 0;
        }
        if (c9 == 1) {
            return 1;
        }
        if (c9 != 2) {
            return c9 != 3 ? 4 : 3;
        }
        return 2;
    }
}
