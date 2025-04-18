package com.bytedance.adsdk.ugeno.NjR.vc;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.DSW.tN;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.adsdk.ugeno.Sg.Sg<TextView> {
    private float Af;
    private int ECi;
    private int Gmi;
    protected int Gnp;
    private int IXB;
    private float JwO;
    private int PT;
    private int VJb;
    protected String YFl;
    private float ZS;
    private int dU;

    /* renamed from: ni, reason: collision with root package name */
    private float f10242ni;
    private float pm;
    private float wqc;

    /* renamed from: xg, reason: collision with root package name */
    @Deprecated
    private TextUtils.TruncateAt f10243xg;
    private TextUtils.TruncateAt yn;

    public Sg(Context context) {
        super(context);
        this.Gnp = ViewCompat.MEASURED_STATE_MASK;
        this.f10242ni = 12.0f;
        this.dU = Integer.MAX_VALUE;
        this.VJb = 2;
        this.Af = -1.0f;
        this.ZS = 400.0f;
    }

    private TextUtils.TruncateAt DSW(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int NjR(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c10 = 1;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
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

    private int nc(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1026963764:
                if (str.equals(TtmlNode.UNDERLINE)) {
                    c10 = 0;
                    break;
                }
                break;
            case -972521773:
                if (str.equals("strikethrough")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 8;
            case 1:
                return 16;
            case 2:
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int qsH(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1178781136) {
            if (str.equals(TtmlNode.ITALIC)) {
                c10 = 1;
            }
            c10 = 65535;
        } else if (hashCode != -1039745817) {
            if (hashCode == 3029637 && str.equals(TtmlNode.BOLD)) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals(Constants.NORMAL)) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            return c10 != 1 ? 0 : 2;
        }
        return 1;
    }

    private TextUtils.TruncateAt vc(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c10 = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f10243xg = TextUtils.TruncateAt.MIDDLE;
                break;
            case 1:
                this.f10243xg = TextUtils.TruncateAt.END;
                break;
            case 2:
                this.f10243xg = TextUtils.TruncateAt.START;
                break;
            default:
                this.f10243xg = null;
                break;
        }
        return this.f10243xg;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        Typeface create;
        super.Sg();
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, this.YFl)) {
            this.YFl = "";
        }
        wN(this.YFl);
        boolean z10 = true;
        ((TextView) this.wN).setTextSize(1, this.f10242ni);
        ((TextView) this.wN).setTextColor(this.Gnp);
        ((TextView) this.wN).setLines(this.ECi);
        ((TextView) this.wN).setMaxLines(this.dU);
        ((TextView) this.wN).setGravity(this.VJb);
        ((TextView) this.wN).setIncludeFontPadding(false);
        YFl(this.IXB);
        if (Ga()) {
            YFl(this.yn);
        } else {
            YFl(this.f10243xg);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            float f10 = this.Af;
            if (f10 >= 0.0f) {
                ((TextView) this.wN).setLineSpacing(0.0f, f10);
            }
        }
        ((TextView) this.wN).setShadowLayer(this.JwO, this.pm, this.wqc, this.PT);
        int i11 = this.Gmi;
        if (i11 == 1) {
            ((TextView) this.wN).setTypeface(Typeface.DEFAULT, i11);
            return;
        }
        if (i10 >= 28) {
            Typeface typeface = Typeface.DEFAULT;
            int i12 = (int) this.ZS;
            if (i11 != 2) {
                z10 = false;
            }
            create = Typeface.create(typeface, i12, z10);
            ((TextView) this.wN).setTypeface(create);
            return;
        }
        if (this.ZS >= 500.0f) {
            ((TextView) this.wN).setTypeface(Typeface.DEFAULT, 1);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public TextView AlY() {
        YFl yFl = new YFl(this.Sg);
        yFl.YFl(this);
        return yFl;
    }

    public void wN(String str) {
        this.YFl = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            this.YFl = "";
        }
        ((TextView) this.wN).setText(this.YFl);
    }

    public void YFl(int i10) {
        this.IXB = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((TextView) this.wN).setPaintFlags(i10);
    }

    public void YFl(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((TextView) this.wN).setEllipsize(truncateAt);
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
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c10 = 6;
                    break;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    c10 = 7;
                    break;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -734428249:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                    c10 = '\n';
                    break;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c10 = '\f';
                    break;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    c10 = 14;
                    break;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                this.JwO = tN.YFl(str2, 0.0f);
                return;
            case 1:
                this.PT = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case 2:
                this.VJb = NjR(str2);
                return;
            case 3:
                this.Gnp = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case 4:
                this.Gmi = qsH(str2);
                return;
            case 6:
                this.f10242ni = tN.YFl(str2, 0.0f);
                return;
            case 7:
                this.IXB = nc(str2);
                return;
            case '\b':
                this.pm = tN.YFl(str2, 0.0f);
                return;
            case '\t':
                this.wqc = tN.YFl(str2, 0.0f);
                return;
            case '\n':
                this.ZS = tN.YFl(str2, -1.0f);
                return;
            case 11:
                this.Af = tN.YFl(str2, 1.0f);
                return;
            case '\f':
                this.YFl = str2;
                return;
            case '\r':
                this.ECi = tN.YFl(str2, 0);
                return;
            case 14:
                this.yn = DSW(str2);
                return;
            case 15:
                this.dU = Integer.parseInt(str2);
                return;
            case 16:
                this.f10243xg = vc(str2);
                return;
            default:
                return;
        }
    }
}
