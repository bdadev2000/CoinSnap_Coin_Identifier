package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class wN extends FrameLayout implements IAnimation, GS, Sco {
    private static final View.OnTouchListener Ne = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener VOe = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected float AlY;
    protected int DSW;
    protected View EH;
    protected com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH GA;
    protected int NjR;
    private float Sg;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.tN Wwa;
    private float YFl;
    protected com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW YoT;
    private float aIu;
    protected Context eT;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.Sg lG;

    /* renamed from: nc, reason: collision with root package name */
    protected int f10387nc;
    protected DynamicRootView pDU;
    private float qO;
    protected int qsH;
    protected boolean rkt;
    protected float tN;

    /* renamed from: vc, reason: collision with root package name */
    protected float f10388vc;
    protected float wN;
    private com.bytedance.sdk.component.utils.aIu wXo;

    public wN(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context);
        boolean z10;
        this.eT = context;
        this.pDU = dynamicRootView;
        this.GA = qsh;
        this.tN = qsh.vc();
        this.AlY = qsh.DSW();
        this.wN = qsh.qsH();
        this.f10388vc = qsh.NjR();
        this.NjR = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.tN);
        this.f10387nc = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.AlY);
        this.DSW = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.wN);
        this.qsH = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.f10388vc);
        com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw = new com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW(qsh.nc());
        this.YoT = dsw;
        if (dsw.Wwa() > 0) {
            this.DSW = (this.YoT.Wwa() * 2) + this.DSW;
            this.qsH = (this.YoT.Wwa() * 2) + this.qsH;
            this.NjR -= this.YoT.Wwa();
            this.f10387nc -= this.YoT.Wwa();
            List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT = qsh.eT();
            if (eT != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh2 : eT) {
                    qsh2.tN(qsh2.vc() + com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(this.eT, this.YoT.Wwa()));
                    qsh2.AlY(qsh2.DSW() + com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(this.eT, this.YoT.Wwa()));
                    qsh2.YFl(com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(this.eT, this.YoT.Wwa()));
                    qsh2.Sg(com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(this.eT, this.YoT.Wwa()));
                }
            }
        }
        if (this.YoT.pDU() > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.rkt = z10;
        this.Wwa = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.tN();
    }

    public boolean AlY() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.EH;
        if (view == null) {
            view = this;
        }
        if (wN()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = Ne;
            onClickListener = VOe;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int YFl = com.bytedance.sdk.component.adexpress.dynamic.Sg.YFl.YFl(this.YoT);
            if (YFl != 2 && YFl != 3) {
                view.setOnClickListener(onClickListener);
            } else {
                view.setOnClickListener(VOe);
            }
        }
        YFl(view);
        Sg(view);
        return true;
    }

    public void DSW() {
        if (qsH()) {
            return;
        }
        View view = this.EH;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.Sg sg2 = new com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.Sg(view, this.GA.nc().wN().ZS());
        this.lG = sg2;
        sg2.YFl();
    }

    public void Sg(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN;
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.GA;
        if (qsh == null || (wN = qsh.nc().wN()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(wN.JT()));
    }

    public void YFl(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw = this.YoT;
        if (dsw != null && dsw.YFl(i10)) {
            NjR();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof wN)) {
                    ((wN) childAt).YFl(i10);
                }
            }
        }
    }

    public Drawable getBackgroundDrawable() {
        return YFl(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.rkt;
    }

    public int getClickArea() {
        return this.YoT.Ga();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vc.YFl getDynamicClickListener() {
        return this.pDU.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.qsH;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.AlY.vc getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.wN nc2;
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.GA;
        if (qsh == null || (nc2 = qsh.nc()) == null) {
            return null;
        }
        return nc2.wN();
    }

    public int getDynamicWidth() {
        return this.DSW;
    }

    public String getImageObjectFit() {
        return this.YoT.VB();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.qO;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(YFl(Sg(this.YoT.GS().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.aIu;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DSW();
        YFl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Sg();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.Wwa.YFl(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.tN tNVar = this.Wwa;
        View view = this.EH;
        if (view == null) {
            view = this;
        }
        tNVar.YFl(view, i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.component.utils.aIu aiu = this.wXo;
        if (aiu != null && z10) {
            aiu.onResume();
        }
    }

    public boolean qsH() {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.GA;
        if (qsh != null && qsh.nc() != null && this.GA.nc().wN() != null && this.GA.nc().wN().ZS() != null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.qO = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.YFl = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.Sg = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.rkt = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.aIu = f10;
        this.Wwa.YFl(this, f10);
    }

    public boolean tN() {
        NjR();
        vc();
        AlY();
        return true;
    }

    public void vc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.DSW, this.qsH);
        layoutParams.topMargin = this.f10387nc;
        int i10 = this.NjR;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean wN() {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw = this.YoT;
        return (dsw == null || dsw.Ga() == 0) ? false : true;
    }

    private List<String> Sg(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && i10 - 1 == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    public void YFl(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.GA.qsH());
            jSONObject.put("height", this.GA.NjR());
            if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.aIu, this.YoT.lu());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.wXo, this.GA.nc().Sg());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.Ne, this.GA.tN());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.VOe, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.YoT.lu());
            view.setTag(2097610715, this.GA.nc().Sg());
            view.setTag(2097610714, this.GA.tN());
            view.setTag(2097610713, jSONObject.toString());
            int YFl = com.bytedance.sdk.component.adexpress.dynamic.Sg.YFl.YFl(this.YoT);
            if (YFl == 1) {
                view.setTag(2097610707, new Pair(this.YoT.UZM(), Long.valueOf(this.YoT.YI())));
                view.setTag(2097610708, Integer.valueOf(YFl));
            }
        } catch (JSONException unused) {
        }
    }

    public void Sg() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.Sg sg2 = this.lG;
        if (sg2 != null) {
            sg2.Sg();
        }
    }

    public Drawable YFl(boolean z10, String str) {
        String[] split;
        int[] iArr;
        int dXO;
        if (!TextUtils.isEmpty(this.YoT.GS())) {
            try {
                String GS = this.YoT.GS();
                String substring = GS.substring(GS.indexOf("(") + 1, GS.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(",")).trim(), substring.substring(substring.indexOf(",") + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(split[1]), com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(split[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable YFl = YFl(YFl(split[0]), iArr);
                YFl.setShape(0);
                YFl.setCornerRadius(com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.EH()));
                return YFl;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float YFl2 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.EH());
        drawable.setCornerRadius(YFl2);
        if (YFl2 < 1.0f) {
            float YFl3 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.hQ());
            float YFl4 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.pq());
            float YFl5 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.mn());
            float YFl6 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.zB());
            float[] fArr = new float[8];
            if (YFl3 > 0.0f) {
                fArr[0] = YFl3;
                fArr[1] = YFl3;
            }
            if (YFl4 > 0.0f) {
                fArr[2] = YFl4;
                fArr[3] = YFl4;
            }
            if (YFl5 > 0.0f) {
                fArr[4] = YFl5;
                fArr[5] = YFl5;
            }
            if (YFl6 > 0.0f) {
                fArr[6] = YFl6;
                fArr[7] = YFl6;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            dXO = Color.parseColor(str);
        } else {
            dXO = this.YoT.dXO();
        }
        drawable.setColor(dXO);
        if (this.YoT.lG() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.lG()), this.YoT.rkt());
            return drawable;
        }
        if (this.YoT.Wwa() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.YoT.Wwa(), this.YoT.rkt());
        drawable.setAlpha(50);
        if (!e.w(this.GA, "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new qO((int) YFl2, this.YoT.Wwa());
    }

    public Sg YFl(Bitmap bitmap) {
        return new YFl(bitmap, null);
    }

    private Drawable[] YFl(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(split[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable YFl = YFl(YFl(split[0]), iArr);
                YFl.setShape(0);
                YFl.setCornerRadius(com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.EH()));
                drawableArr[(list.size() - 1) - i10] = YFl;
            }
        }
        return drawableArr;
    }

    public GradientDrawable YFl(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation YFl(String str) {
        try {
            int parseFloat = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (parseFloat <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseFloat <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseFloat <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void YFl() {
        if (isShown()) {
            int YFl = com.bytedance.sdk.component.adexpress.dynamic.Sg.YFl.YFl(this.YoT);
            if (YFl == 2) {
                if (this.wXo == null) {
                    this.wXo = new com.bytedance.sdk.component.utils.aIu(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN.3
                };
                com.bytedance.sdk.component.adexpress.Sg.GA renderRequest = this.pDU.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.EH();
                    renderRequest.wXo();
                    renderRequest.qO();
                }
            } else if (YFl == 3) {
                if (this.wXo == null) {
                    this.wXo = new com.bytedance.sdk.component.utils.aIu(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN.4
                };
                com.bytedance.sdk.component.adexpress.Sg.GA renderRequest2 = this.pDU.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.lG();
                    renderRequest2.Ne();
                    renderRequest2.Wwa();
                    renderRequest2.aIu();
                }
            }
            com.bytedance.sdk.component.utils.aIu aiu = this.wXo;
            if (aiu != null) {
                aiu.onResume();
            }
        }
    }
}
