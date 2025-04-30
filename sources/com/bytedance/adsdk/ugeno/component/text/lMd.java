package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.lMd.KS;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class lMd extends com.bytedance.adsdk.ugeno.component.lMd<TextView> {
    private int DY;
    private int GP;
    private int MBR;
    private float Rh;
    private float Vjb;
    private float fVt;
    private int fgJ;
    private float fs;
    private int gH;
    private float mW;
    private int oB;
    private TextUtils.TruncateAt qtv;
    private int rCC;
    private float sqt;
    private String zp;

    public lMd(Context context) {
        super(context);
        this.rCC = Integer.MAX_VALUE;
        this.oB = 2;
        this.Vjb = -1.0f;
        this.fs = -1.0f;
    }

    private TextUtils.TruncateAt HWF(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c9 = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.qtv = TextUtils.TruncateAt.MIDDLE;
                break;
            case 1:
                this.qtv = TextUtils.TruncateAt.END;
                break;
            case 2:
                this.qtv = TextUtils.TruncateAt.START;
                break;
            default:
                this.qtv = null;
                break;
        }
        return this.qtv;
    }

    private int QR(String str) {
        char c9;
        int hashCode = str.hashCode();
        if (hashCode != -1178781136) {
            if (hashCode != -1039745817) {
                if (hashCode == 3029637 && str.equals(TtmlNode.BOLD)) {
                    c9 = 0;
                }
                c9 = 65535;
            } else {
                if (str.equals(Constants.NORMAL)) {
                    c9 = 2;
                }
                c9 = 65535;
            }
        } else {
            if (str.equals(TtmlNode.ITALIC)) {
                c9 = 1;
            }
            c9 = 65535;
        }
        if (c9 == 0) {
            return 1;
        }
        if (c9 == 1) {
            return 2;
        }
        return 0;
    }

    private int YW(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1026963764:
                if (str.equals(TtmlNode.UNDERLINE)) {
                    c9 = 0;
                    break;
                }
                break;
            case -972521773:
                if (str.equals("strikethrough")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 8;
            case 1:
                return 16;
            case 2:
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int ku(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c9 = 1;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 17;
            case 1:
                return 3;
            case 2:
                return 5;
            default:
                return 2;
        }
    }

    public void COT(String str) {
        this.zp = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.zp = "";
        }
        ((TextView) this.COT).setText(this.zp);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        if (TextUtils.equals("null", this.zp)) {
            this.zp = "";
        }
        COT(this.zp);
        ((TextView) this.COT).setTextSize(1, this.Rh);
        ((TextView) this.COT).setTextColor(this.DY);
        ((TextView) this.COT).setLines(this.MBR);
        ((TextView) this.COT).setMaxLines(this.rCC);
        ((TextView) this.COT).setGravity(this.oB);
        ((TextView) this.COT).setIncludeFontPadding(false);
        KS(this.fgJ);
        zp(this.qtv);
        ((TextView) this.COT).setTypeface(Typeface.DEFAULT, this.gH);
        if (Build.VERSION.SDK_INT >= 28) {
            float f9 = this.Vjb;
            if (f9 >= 0.0f) {
                ((TextView) this.COT).setLineSpacing(0.0f, f9);
            }
        }
        ((TextView) this.COT).setShadowLayer(this.fVt, this.mW, this.sqt, this.GP);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public TextView KS() {
        UGTextView uGTextView = new UGTextView(this.lMd);
        uGTextView.zp(this);
        return uGTextView;
    }

    public void KS(int i9) {
        this.fgJ = i9;
        if (i9 == Integer.MAX_VALUE) {
            return;
        }
        ((TextView) this.COT).setPaintFlags(i9);
    }

    public void zp(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((TextView) this.COT).setEllipsize(truncateAt);
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
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    c9 = 2;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    c9 = 4;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c9 = 5;
                    break;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    c9 = 6;
                    break;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    c9 = 7;
                    break;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -734428249:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                    c9 = '\t';
                    break;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c9 = 11;
                    break;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    c9 = '\r';
                    break;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    c9 = 14;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.fVt = KS.zp(str2, 0.0f);
                return;
            case 1:
                this.GP = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 2:
                this.oB = ku(str2);
                return;
            case 3:
                this.DY = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 4:
                this.gH = QR(str2);
                return;
            case 5:
                this.Rh = KS.zp(str2, 0.0f);
                return;
            case 6:
                this.fgJ = YW(str2);
                return;
            case 7:
                this.mW = KS.zp(str2, 0.0f);
                return;
            case '\b':
                this.sqt = KS.zp(str2, 0.0f);
                return;
            case '\t':
                this.fs = KS.zp(str2, -1.0f);
                return;
            case '\n':
                this.Vjb = KS.zp(str2, 1.0f);
                return;
            case 11:
                this.zp = str2;
                return;
            case '\f':
                this.MBR = KS.zp(str2, 0);
                return;
            case '\r':
                this.rCC = Integer.parseInt(str2);
                return;
            case 14:
                this.qtv = HWF(str2);
                return;
            default:
                return;
        }
    }
}
