package com.bytedance.adsdk.ugeno.component.input;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.adsdk.ugeno.component.lMd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class zp extends lMd<EditText> {
    private int DY;
    private int MBR;
    private float Rh;
    private String Vjb;
    private int fgJ;
    private String gH;
    private String oB;
    private String qtv;
    private int rCC;
    private int zp;

    public zp(Context context) {
        super(context);
        this.zp = 1;
        this.rCC = Integer.MAX_VALUE;
        this.fgJ = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int COT(String str) {
        char c9;
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0) {
            if (c9 == 1) {
                return 3;
            }
            if (c9 == 2) {
                return 2;
            }
            if (c9 != 3) {
                return 1;
            }
            return 32;
        }
        return 128;
    }

    private int HWF(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ((EditText) this.COT).setInputType(this.zp);
        ((EditText) this.COT).setText(this.qtv);
        ((EditText) this.COT).setTextSize(1, this.Rh);
        ((EditText) this.COT).setTextColor(this.DY);
        ((EditText) this.COT).setLines(this.MBR);
        ((EditText) this.COT).setMaxLines(this.rCC);
        ((EditText) this.COT).setGravity(this.fgJ);
        ((EditText) this.COT).setHint(this.Vjb);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public EditText KS() {
        UGEditText uGEditText = new UGEditText(this.lMd);
        uGEditText.zp(this);
        return uGEditText;
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
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    c9 = 0;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c9 = 3;
                    break;
                }
                break;
            case 3202695:
                if (str.equals("hint")) {
                    c9 = 4;
                    break;
                }
                break;
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c9 = 5;
                    break;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    c9 = 6;
                    break;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    c9 = 7;
                    break;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    c9 = '\t';
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.fgJ = HWF(str2);
                return;
            case 1:
                this.DY = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 2:
                this.gH = str2;
                return;
            case 3:
                this.Rh = Float.parseFloat(str2);
                return;
            case 4:
                this.Vjb = str2;
                return;
            case 5:
                this.qtv = str2;
                return;
            case 6:
                this.MBR = Integer.parseInt(str2);
                return;
            case 7:
                this.rCC = Integer.parseInt(str2);
                return;
            case '\b':
                this.oB = str2;
                return;
            case '\t':
                this.zp = COT(str2);
                return;
            default:
                return;
        }
    }
}
