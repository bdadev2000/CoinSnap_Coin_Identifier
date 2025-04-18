package com.bytedance.adsdk.ugeno.yoga.Sg;

import a4.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.AlY;
import com.bytedance.adsdk.ugeno.DSW.tN;
import com.bytedance.adsdk.ugeno.Sg.YFl;
import com.bytedance.adsdk.ugeno.YFl;
import com.bytedance.adsdk.ugeno.yoga.DSW;
import com.bytedance.adsdk.ugeno.yoga.EH;
import com.bytedance.adsdk.ugeno.yoga.Sg;
import com.bytedance.adsdk.ugeno.yoga.YoT;
import com.bytedance.adsdk.ugeno.yoga.qsH;
import com.bytedance.adsdk.ugeno.yoga.rkt;
import com.bytedance.adsdk.ugeno.yoga.vc;
import com.bytedance.adsdk.ugeno.yoga.wN;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.adsdk.ugeno.Sg.YFl<qsH> {
    private Sg ECi;
    private DSW Gmi;
    private vc Gnp;
    private YoT VJb;
    private Sg dU;

    /* renamed from: ni, reason: collision with root package name */
    private rkt f10300ni;

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0073YFl extends YFl.C0064YFl {
        public int Cfr;
        private boolean GS;
        private boolean Sco;
        private boolean UI;
        public int dXO;
        public int hQ;
        private boolean lu;
        private boolean mB;
        public float mn;
        public int pq;
        private boolean zB;
        public int Ne = 1;
        public float VOe = 0.0f;
        public float bZ = 1.0f;
        public int UZM = Sg.AUTO.YFl();
        public float YI = -1.0f;
        public int Ga = EH.RELATIVE.YFl();

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
        public qsH.YFl YFl() {
            float f10;
            float f11;
            float f12;
            float f13;
            qsH.YFl yFl = new qsH.YFl((int) this.YFl, (int) this.Sg);
            if (this.lG) {
                f10 = this.AlY;
            } else {
                f10 = this.tN;
            }
            yFl.YoT((int) f10);
            if (this.Wwa) {
                f11 = this.wN;
            } else {
                f11 = this.tN;
            }
            yFl.pDU((int) f11);
            if (this.qO) {
                f12 = this.f10258vc;
            } else {
                f12 = this.tN;
            }
            yFl.eT((int) f12);
            if (this.aIu) {
                f13 = this.DSW;
            } else {
                f13 = this.tN;
            }
            yFl.GA((int) f13);
            yFl.YFl(this.Ne);
            yFl.wN(this.UZM);
            yFl.Sg(this.VOe);
            yFl.tN(this.bZ);
            if (this.zB) {
                yFl.AlY(this.YI);
            }
            yFl.vc(this.Ga);
            if (this.Sco) {
                yFl.DSW(this.dXO);
            }
            if (this.GS) {
                yFl.NjR(this.Cfr);
            }
            if (this.lu) {
                yFl.qsH(this.hQ);
            }
            if (this.mB) {
                yFl.nc(this.pq);
            }
            if (this.UI && tN()) {
                float f14 = this.mn;
                if (f14 > 0.0f) {
                    yFl.EH(f14);
                }
            }
            return yFl;
        }

        public boolean tN() {
            float f10 = this.YFl;
            if (f10 == -1.0f && this.Sg == -1.0f) {
                return false;
            }
            if (f10 != -2.0f && this.Sg != -2.0f) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutParams{mOrder=");
            sb2.append(this.Ne);
            sb2.append(", mFlexGrow=");
            sb2.append(this.VOe);
            sb2.append(", mFlexShrink=");
            sb2.append(this.bZ);
            sb2.append(", mAlignSelf=");
            sb2.append(this.UZM);
            sb2.append(", mFlexBasis=");
            sb2.append(this.YI);
            sb2.append(", mPosition=");
            sb2.append(this.Ga);
            sb2.append(", mTop=");
            sb2.append(this.dXO);
            sb2.append(", mBottom=");
            sb2.append(this.Cfr);
            sb2.append(", mLeft=");
            sb2.append(this.hQ);
            sb2.append(", mRight=");
            return j.i(sb2, this.pq, AbstractJsonLexerKt.END_OBJ);
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
                case -1783760955:
                    if (str.equals("flexBasis")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 106006350:
                    if (str.equals("order")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 108285963:
                    if (str.equals("ratio")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1031115618:
                    if (str.equals("flexShrink")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1743739820:
                    if (str.equals("flexGrow")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1767100401:
                    if (str.equals("alignSelf")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.zB = true;
                    this.YI = tN.YFl(str2, -1.0f);
                    return;
                case 1:
                    this.GS = true;
                    this.Cfr = (int) com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, tN.YFl(str2, 0));
                    return;
                case 2:
                    this.Sco = true;
                    this.dXO = (int) com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, tN.YFl(str2, 0));
                    return;
                case 3:
                    this.lu = true;
                    this.hQ = (int) com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, tN.YFl(str2, 0));
                    return;
                case 4:
                    this.Ne = tN.YFl(str2, 1);
                    return;
                case 5:
                    this.UI = true;
                    this.mn = tN.YFl(str2, 0.0f);
                    return;
                case 6:
                    this.mB = true;
                    this.pq = (int) com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, tN.YFl(str2, 0));
                    return;
                case 7:
                    this.Ga = EH.YFl(str2).YFl();
                    return;
                case '\b':
                    this.bZ = tN.YFl(str2, 1.0f);
                    return;
                case '\t':
                    this.VOe = tN.YFl(str2, 0.0f);
                    return;
                case '\n':
                    this.UZM = Sg.YFl(str2).YFl();
                    return;
                default:
                    return;
            }
        }
    }

    public YFl(Context context) {
        super(context);
        this.Gnp = vc.ROW;
        this.f10300ni = rkt.NO_WRAP;
        this.Gmi = DSW.FLEX_START;
        Sg sg2 = Sg.STRETCH;
        this.dU = sg2;
        this.ECi = sg2;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl
    /* renamed from: BPI, reason: merged with bridge method [inline-methods] */
    public C0073YFl tN() {
        return new C0073YFl();
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public qsH AlY() {
        qsH qsh = new qsH(this.Sg);
        qsh.YFl(this);
        this.VJb = qsh.getYogaNode();
        return qsh;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void bZ() {
        ImageView.ScaleType scaleType;
        if (this.mB) {
            AlY.YFl().Sg().YFl(this.NjR, this.Sco, new YFl.InterfaceC0065YFl() { // from class: com.bytedance.adsdk.ugeno.yoga.Sg.YFl.1
                @Override // com.bytedance.adsdk.ugeno.YFl.InterfaceC0065YFl
                public void YFl(Bitmap bitmap) {
                    final Bitmap YFl;
                    if (bitmap != null && (YFl = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(((com.bytedance.adsdk.ugeno.Sg.Sg) YFl.this).Sg, bitmap, (int) ((com.bytedance.adsdk.ugeno.Sg.Sg) YFl.this).lu)) != null) {
                        com.bytedance.adsdk.ugeno.DSW.qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.Sg.YFl.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                YFl.this.YFl(new BitmapDrawable(YFl));
                            }
                        });
                    }
                }
            });
            return;
        }
        ImageView imageView = new ImageView(this.Sg);
        AlY.YFl().Sg().YFl(this.NjR, this.Sco, imageView, this.wN.getWidth(), this.wN.getHeight());
        if (this.UI && (scaleType = this.GS) != ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(scaleType);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        qsH.YFl yFl = new qsH.YFl(-1, -1);
        yFl.vc(EH.ABSOLUTE.YFl());
        T t5 = this.wN;
        if (t5 instanceof qsH) {
            ((qsH) t5).addView(imageView, 0, yFl);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void eT() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.Cfr) {
            f10 = this.UZM;
        } else {
            f10 = this.bZ;
        }
        if (this.hQ) {
            f11 = this.YI;
        } else {
            f11 = this.bZ;
        }
        if (this.pq) {
            f12 = this.Ga;
        } else {
            f12 = this.bZ;
        }
        if (this.mn) {
            f13 = this.dXO;
        } else {
            f13 = this.bZ;
        }
        this.VJb.Sg(wN.LEFT, f10);
        this.VJb.Sg(wN.RIGHT, f11);
        this.VJb.Sg(wN.TOP, f12);
        this.VJb.Sg(wN.BOTTOM, f13);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        this.VJb.YFl(this.Gnp);
        this.VJb.YFl(this.f10300ni);
        this.VJb.YFl(this.Gmi);
        this.VJb.YFl(this.dU);
        this.VJb.tN(this.ECi);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(Drawable drawable) {
        ImageView.ScaleType scaleType;
        ImageView imageView = new ImageView(this.Sg);
        imageView.setImageDrawable(drawable);
        if (this.UI && (scaleType = this.GS) != ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(scaleType);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        qsH.YFl yFl = new qsH.YFl(-1, -1);
        yFl.vc(EH.ABSOLUTE.YFl());
        T t5 = this.wN;
        if (t5 instanceof qsH) {
            ((qsH) t5).addView(imageView, 0, yFl);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        super.YFl(sg2);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, ViewGroup.LayoutParams layoutParams) {
        if (sg2 == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.Sg.YFl) this).YFl.add(sg2);
        View NjR = sg2.NjR();
        if (NjR != null) {
            ((qsH) this.wN).addView(NjR, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
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
                this.dU = Sg.YFl(str2);
                return;
            case 1:
                this.Gnp = vc.YFl(str2);
                return;
            case 2:
                this.ECi = Sg.YFl(str2);
                return;
            case 3:
                this.f10300ni = rkt.YFl(str2);
                return;
            case 4:
                this.Gmi = DSW.YFl(str2);
                return;
            default:
                return;
        }
    }
}
