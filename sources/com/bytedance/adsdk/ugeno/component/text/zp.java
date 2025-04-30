package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class zp extends com.bytedance.adsdk.ugeno.component.lMd<RichTextView> {
    private int DY;
    private int MBR;
    private float Rh;
    private int fgJ;
    private String gH;
    private String oB;
    private int rCC;
    private String zp;

    public zp(Context context) {
        super(context);
        this.rCC = Integer.MAX_VALUE;
        this.fgJ = 2;
    }

    private int COT(String str) {
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
        ((RichTextView) this.COT).setRichText(this.zp);
        ((RichTextView) this.COT).setTextSize(1, this.Rh);
        ((RichTextView) this.COT).setTextColor(this.DY);
        ((RichTextView) this.COT).setLines(this.MBR);
        ((RichTextView) this.COT).setMaxLines(this.rCC);
        ((RichTextView) this.COT).setGravity(this.fgJ);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public RichTextView KS() {
        return new RichTextView(this.lMd);
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
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c9 = 4;
                    break;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    c9 = 5;
                    break;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    c9 = 6;
                    break;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    c9 = 7;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.fgJ = COT(str2);
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
                this.zp = str2;
                return;
            case 5:
                this.MBR = Integer.parseInt(str2);
                return;
            case 6:
                this.rCC = Integer.parseInt(str2);
                return;
            case 7:
                this.oB = str2;
                return;
            default:
                return;
        }
    }
}
