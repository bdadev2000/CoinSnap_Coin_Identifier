package com.bytedance.adsdk.ugeno.Sg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl<E extends ViewGroup> extends Sg {
    protected List<Sg<View>> YFl;

    public YFl(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
    }

    public void YFl(Sg sg2) {
        if (sg2 == null) {
            return;
        }
        this.YFl.add(sg2);
        View NjR = sg2.NjR();
        if (NjR != null) {
            ((ViewGroup) this.wN).addView(NjR);
        }
    }

    public C0064YFl tN() {
        return new C0064YFl();
    }

    public YFl(Context context, YFl yFl) {
        super(context, yFl);
        this.YFl = new ArrayList();
    }

    public void YFl(Sg sg2, ViewGroup.LayoutParams layoutParams) {
        if (sg2 == null) {
            return;
        }
        this.YFl.add(sg2);
        View NjR = sg2.NjR();
        if (NjR != null) {
            ((ViewGroup) this.wN).addView(NjR, layoutParams);
        }
    }

    public List<Sg<View>> YFl() {
        return this.YFl;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public Sg YFl(String str) {
        Sg<View> Sg;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.eT)) {
            return this;
        }
        for (Sg<View> sg2 : this.YFl) {
            if (sg2 != null && (Sg = sg2.Sg(str)) != null) {
                return Sg;
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0064YFl {
        protected float AlY;
        protected float DSW;
        protected boolean EH;
        protected boolean GA;
        protected float NjR;
        protected boolean Wwa;
        protected float YoT;
        protected boolean aIu;
        protected float eT;
        protected boolean lG;

        /* renamed from: nc, reason: collision with root package name */
        protected float f10257nc;
        protected boolean pDU;
        protected boolean qO;
        protected float qsH;
        protected boolean rkt;
        protected float tN;

        /* renamed from: vc, reason: collision with root package name */
        protected float f10258vc;
        protected float wN;
        protected ViewGroup.LayoutParams wXo;
        protected float YFl = -2.0f;
        protected float Sg = -2.0f;

        public void YFl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.NjR = qsH.YFl(context, str2);
                    this.GA = true;
                    return;
                case 1:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.Sg = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.Sg = -2.0f;
                        return;
                    } else {
                        this.Sg = qsH.YFl(context, str2);
                        return;
                    }
                case 2:
                    this.tN = qsH.YFl(context, str2);
                    return;
                case 3:
                    this.f10258vc = qsH.YFl(context, str2);
                    this.qO = true;
                    return;
                case 4:
                    this.qsH = qsH.YFl(context, str2);
                    return;
                case 5:
                    this.DSW = qsH.YFl(context, str2);
                    this.aIu = true;
                    return;
                case 6:
                    this.f10257nc = qsH.YFl(context, str2);
                    this.EH = true;
                    return;
                case 7:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.YFl = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.YFl = -2.0f;
                        return;
                    } else {
                        this.YFl = qsH.YFl(context, str2);
                        return;
                    }
                case '\b':
                    this.YoT = qsH.YFl(context, str2);
                    this.rkt = true;
                    return;
                case '\t':
                    this.eT = qsH.YFl(context, str2);
                    this.pDU = true;
                    return;
                case '\n':
                    this.wN = qsH.YFl(context, str2);
                    this.Wwa = true;
                    return;
                case 11:
                    this.AlY = qsH.YFl(context, str2);
                    this.lG = true;
                    return;
                default:
                    return;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.YFl + ", mHeight=" + this.Sg + ", mMargin=" + this.tN + ", mMarginLeft=" + this.AlY + ", mMarginRight=" + this.wN + ", mMarginTop=" + this.f10258vc + ", mMarginBottom=" + this.DSW + ", mParams=" + this.wXo + AbstractJsonLexerKt.END_OBJ;
        }

        public ViewGroup.LayoutParams YFl() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.YFl, (int) this.Sg);
            marginLayoutParams.leftMargin = (int) (this.lG ? this.AlY : this.tN);
            marginLayoutParams.rightMargin = (int) (this.Wwa ? this.wN : this.tN);
            marginLayoutParams.topMargin = (int) (this.qO ? this.f10258vc : this.tN);
            marginLayoutParams.bottomMargin = (int) (this.aIu ? this.DSW : this.tN);
            return marginLayoutParams;
        }
    }
}
