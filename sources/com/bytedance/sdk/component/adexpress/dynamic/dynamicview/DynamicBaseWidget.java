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
import com.applovin.impl.L;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.sdk.component.adexpress.dynamic.KS.HWF;
import com.bytedance.sdk.component.adexpress.dynamic.KS.QR;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.component.utils.FP;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DynamicBaseWidget extends FrameLayout implements IAnimation, COT, jU {
    private static final View.OnTouchListener ot = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener yRU = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected Context Bj;
    protected float COT;
    private FP FP;
    protected float HWF;
    protected float KS;
    protected boolean KVG;
    protected int QR;
    protected int YW;
    private float cz;
    protected View dQp;
    protected int dT;
    protected float jU;
    protected int ku;
    private float lMd;
    private float pvr;
    protected DynamicRootView rV;
    protected ku tG;
    protected QR vDp;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.zp vwr;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.zp.lMd woN;
    private float zp;

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context);
        boolean z8;
        this.Bj = context;
        this.rV = dynamicRootView;
        this.tG = kuVar;
        this.KS = kuVar.HWF();
        this.jU = kuVar.QR();
        this.COT = kuVar.ku();
        this.HWF = kuVar.YW();
        this.YW = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.KS);
        this.dT = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.jU);
        this.QR = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.COT);
        this.ku = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.HWF);
        QR qr = new QR(kuVar.dT());
        this.vDp = qr;
        if (qr.vwr() > 0) {
            this.QR = (this.vDp.vwr() * 2) + this.QR;
            this.ku = (this.vDp.vwr() * 2) + this.ku;
            this.YW -= this.vDp.vwr();
            this.dT -= this.vDp.vwr();
            List<ku> Bj = kuVar.Bj();
            if (Bj != null) {
                for (ku kuVar2 : Bj) {
                    kuVar2.KS(kuVar2.HWF() + com.bytedance.sdk.component.adexpress.jU.QR.lMd(this.Bj, this.vDp.vwr()));
                    kuVar2.jU(kuVar2.QR() + com.bytedance.sdk.component.adexpress.jU.QR.lMd(this.Bj, this.vDp.vwr()));
                    kuVar2.zp(com.bytedance.sdk.component.adexpress.jU.QR.lMd(this.Bj, this.vDp.vwr()));
                    kuVar2.lMd(com.bytedance.sdk.component.adexpress.jU.QR.lMd(this.Bj, this.vDp.vwr()));
                }
            }
        }
        if (this.vDp.rV() > 0.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.KVG = z8;
        this.vwr = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.zp();
    }

    public boolean COT() {
        QR qr = this.vDp;
        if (qr != null && qr.Gzh() != 0) {
            return true;
        }
        return false;
    }

    public void HWF() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
        layoutParams.topMargin = this.dT;
        int i9 = this.YW;
        layoutParams.leftMargin = i9;
        layoutParams.setMarginStart(i9);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean KS() {
        YW();
        HWF();
        jU();
        return true;
    }

    public void QR() {
        if (ku()) {
            return;
        }
        View view = this.dQp;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.zp.lMd lmd = new com.bytedance.sdk.component.adexpress.dynamic.animation.zp.lMd(view, this.tG.dT().COT().Sr());
        this.woN = lmd;
        lmd.zp();
    }

    public Drawable getBackgroundDrawable() {
        return zp(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.KVG;
    }

    public int getClickArea() {
        return this.vDp.Gzh();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.COT.zp getDynamicClickListener() {
        return this.rV.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.ku;
    }

    public HWF getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.KS.COT dT;
        ku kuVar = this.tG;
        if (kuVar == null || (dT = kuVar.dT()) == null) {
            return null;
        }
        return dT.COT();
    }

    public int getDynamicWidth() {
        return this.QR;
    }

    public String getImageObjectFit() {
        return this.vDp.oB();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.pvr;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(zp(lMd(this.vDp.ffE().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.cz;
    }

    public boolean jU() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.dQp;
        if (view == null) {
            view = this;
        }
        if (COT()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = ot;
            onClickListener = yRU;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int zp = com.bytedance.sdk.component.adexpress.dynamic.lMd.zp.zp(this.vDp);
            if (zp != 2 && zp != 3) {
                view.setOnClickListener(onClickListener);
            } else {
                view.setOnClickListener(yRU);
            }
        }
        zp(view);
        lMd(view);
        return true;
    }

    public boolean ku() {
        ku kuVar = this.tG;
        if (kuVar != null && kuVar.dT() != null && this.tG.dT().COT() != null && this.tG.dT().COT().Sr() != null) {
            return false;
        }
        return true;
    }

    public void lMd(View view) {
        HWF COT;
        ku kuVar = this.tG;
        if (kuVar == null || (COT = kuVar.dT().COT()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(COT.KVS()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QR();
        zp();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        lMd();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.vwr.zp(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.zp zpVar = this.vwr;
        View view = this.dQp;
        if (view == null) {
            view = this;
        }
        zpVar.zp(view, i9, i10);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f9) {
        this.pvr = f9;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f9) {
        this.zp = f9;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f9) {
        this.lMd = f9;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z8) {
        this.KVG = z8;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f9) {
        this.cz = f9;
        this.vwr.zp(this, f9);
    }

    public void zp(int i9) {
        QR qr = this.vDp;
        if (qr != null && qr.zp(i9)) {
            YW();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != null && (getChildAt(i10) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).zp(i9);
                }
            }
        }
    }

    private List<String> lMd(String str) {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '(') {
                i9++;
                z8 = true;
            } else if (str.charAt(i11) == ')' && i9 - 1 == 0 && z8) {
                int i12 = i11 + 1;
                arrayList.add(str.substring(i10, i12));
                i10 = i12;
                z8 = false;
            }
        }
        return arrayList;
    }

    public void zp(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.tG.ku());
            jSONObject.put("height", this.tG.YW());
            if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zp.cz, this.vDp.eWG());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zp.FP, this.tG.dT().lMd());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zp.ot, this.tG.KS());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zp.yRU, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.vDp.eWG());
            view.setTag(2097610715, this.tG.dT().lMd());
            view.setTag(2097610714, this.tG.KS());
            view.setTag(2097610713, jSONObject.toString());
            int zp = com.bytedance.sdk.component.adexpress.dynamic.lMd.zp.zp(this.vDp);
            if (zp == 1) {
                view.setTag(2097610707, new Pair(this.vDp.RCv(), Long.valueOf(this.vDp.Lij())));
                view.setTag(2097610708, Integer.valueOf(zp));
            }
        } catch (JSONException unused) {
        }
    }

    public void lMd() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.zp.lMd lmd = this.woN;
        if (lmd != null) {
            lmd.lMd();
        }
    }

    public Drawable zp(boolean z8, String str) {
        String[] split;
        int[] iArr;
        int irS;
        if (!TextUtils.isEmpty(this.vDp.ffE())) {
            try {
                String ffE = this.vDp.ffE();
                String substring = ffE.substring(ffE.indexOf("(") + 1, ffE.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(",")).trim(), substring.substring(substring.indexOf(",") + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{QR.zp(split[1]), QR.zp(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{QR.zp(split[1].substring(0, 7)), QR.zp(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i9 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i9;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable zp = zp(zp(split[0]), iArr);
                zp.setShape(0);
                zp.setCornerRadius(com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.dQp()));
                return zp;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float zp2 = com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.dQp());
        drawable.setCornerRadius(zp2);
        if (zp2 < 1.0f) {
            float zp3 = com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.cW());
            float zp4 = com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.YhE());
            float zp5 = com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.WNy());
            float zp6 = com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.UPs());
            float[] fArr = new float[8];
            if (zp3 > 0.0f) {
                fArr[0] = zp3;
                fArr[1] = zp3;
            }
            if (zp4 > 0.0f) {
                fArr[2] = zp4;
                fArr[3] = zp4;
            }
            if (zp5 > 0.0f) {
                fArr[4] = zp5;
                fArr[5] = zp5;
            }
            if (zp6 > 0.0f) {
                fArr[6] = zp6;
                fArr[7] = zp6;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z8) {
            irS = Color.parseColor(str);
        } else {
            irS = this.vDp.irS();
        }
        drawable.setColor(irS);
        if (this.vDp.woN() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.woN()), this.vDp.KVG());
        } else if (this.vDp.vwr() > 0) {
            drawable.setStroke(this.vDp.vwr(), this.vDp.KVG());
            drawable.setAlpha(50);
            if (L.x(this.tG, "video-vd")) {
                setLayerType(1, null);
                return new KS((int) zp2, this.vDp.vwr());
            }
        }
        return drawable;
    }

    public lMd zp(Bitmap bitmap) {
        return new zp(bitmap, null);
    }

    private Drawable[] zp(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = list.get(i9);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    iArr[i10] = QR.zp(split[i11].substring(0, 7));
                    i10 = i11;
                }
                GradientDrawable zp = zp(zp(split[0]), iArr);
                zp.setShape(0);
                zp.setCornerRadius(com.bytedance.sdk.component.adexpress.jU.QR.zp(this.Bj, this.vDp.dQp()));
                drawableArr[(list.size() - 1) - i9] = zp;
            }
        }
        return drawableArr;
    }

    public GradientDrawable zp(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
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

    public GradientDrawable.Orientation zp(String str) {
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

    private void zp() {
        if (isShown()) {
            int zp = com.bytedance.sdk.component.adexpress.dynamic.lMd.zp.zp(this.vDp);
            if (zp == 2) {
                if (this.FP == null) {
                    this.FP = new FP(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.3
                };
                tG renderRequest = this.rV.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.dQp();
                    renderRequest.pvr();
                    return;
                }
                return;
            }
            if (zp == 3) {
                if (this.FP == null) {
                    this.FP = new FP(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.4
                };
                tG renderRequest2 = this.rV.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.woN();
                    renderRequest2.cz();
                    renderRequest2.vwr();
                }
            }
        }
    }
}
