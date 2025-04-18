package com.bytedance.adsdk.ugeno.yoga;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class qsH extends ViewGroup implements com.bytedance.adsdk.ugeno.YFl.wN {
    private com.bytedance.adsdk.ugeno.YFl.vc AlY;
    private final YoT Sg;
    private final Map<View, YoT> YFl;
    private com.bytedance.adsdk.ugeno.tN tN;

    public qsH(Context context) {
        this(context, null, 0);
    }

    private void YFl(View view, boolean z10) {
        YoT yoT = this.YFl.get(view);
        if (yoT == null) {
            return;
        }
        YoT Sg2 = yoT.Sg();
        int i10 = 0;
        while (true) {
            if (i10 >= Sg2.YFl()) {
                break;
            }
            if (Sg2.YFl(i10).equals(yoT)) {
                Sg2.Sg(i10);
                break;
            }
            i10++;
        }
        yoT.YFl((Object) null);
        this.YFl.remove(view);
        if (z10) {
            this.Sg.YFl(Float.NaN, Float.NaN);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        YoT YFl2;
        this.Sg.YFl((NjR) null);
        if (!(view instanceof com.bytedance.adsdk.ugeno.yoga.YFl)) {
            super.addView(view, i10, layoutParams);
            if (this.YFl.containsKey(view)) {
                return;
            }
            if (view instanceof qsH) {
                YFl2 = ((qsH) view).getYogaNode();
            } else {
                if (this.YFl.containsKey(view)) {
                    YFl2 = this.YFl.get(view);
                } else {
                    YFl2 = GA.YFl();
                }
                YFl2.YFl(view);
                YFl2.YFl((NjR) new Sg());
            }
            YFl((YFl) view.getLayoutParams(), YFl2, view);
            this.YFl.put(view, YFl2);
            YoT yoT = this.Sg;
            yoT.YFl(YFl2, yoT.YFl());
            return;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof YFl;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new YFl(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new YFl(layoutParams);
    }

    public float getBorderRadius() {
        return this.AlY.YFl();
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.AlY.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN
    public float getShine() {
        return this.AlY.getShine();
    }

    public YoT getYogaNode() {
        return this.Sg;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.YFl(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.vc();
        }
        if (!(getParent() instanceof qsH)) {
            YFl(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        YFl(this.Sg, 0.0f, 0.0f);
        com.bytedance.adsdk.ugeno.tN tNVar2 = this.tN;
        if (tNVar2 != null) {
            tNVar2.YFl(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof qsH)) {
            YFl(i10, i11);
        }
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            int[] YFl2 = tNVar.YFl(i10, i11);
            setMeasuredDimension(YFl2[0], YFl2[1]);
        } else {
            setMeasuredDimension(Math.round(this.Sg.DSW()), Math.round(this.Sg.qsH()));
        }
        com.bytedance.adsdk.ugeno.tN tNVar2 = this.tN;
        if (tNVar2 != null) {
            tNVar2.wN();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            YFl(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            YFl(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        YFl(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        YFl(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        YFl(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            YFl(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            YFl(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.AlY.YFl(i10);
    }

    public void setBorderRadius(float f10) {
        this.AlY.YFl(f10);
    }

    public void setRipple(float f10) {
        com.bytedance.adsdk.ugeno.YFl.vc vcVar = this.AlY;
        if (vcVar != null) {
            vcVar.Sg(f10);
        }
    }

    public void setShine(float f10) {
        com.bytedance.adsdk.ugeno.YFl.vc vcVar = this.AlY;
        if (vcVar != null) {
            vcVar.tN(f10);
        }
    }

    public qsH(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.AlY = new com.bytedance.adsdk.ugeno.YFl.vc(this);
        YoT YFl2 = GA.YFl();
        this.Sg = YFl2;
        this.YFl = new HashMap();
        YFl2.YFl(this);
        YFl2.YFl((NjR) new Sg());
        YFl((YFl) generateDefaultLayoutParams(), YFl2, this);
    }

    /* loaded from: classes.dex */
    public static class Sg implements NjR {
        @Override // com.bytedance.adsdk.ugeno.yoga.NjR
        public long YFl(YoT yoT, float f10, nc ncVar, float f11, nc ncVar2) {
            View view = (View) yoT.NjR();
            if (view != null && !(view instanceof qsH)) {
                view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, YFl(ncVar)), View.MeasureSpec.makeMeasureSpec((int) f11, YFl(ncVar2)));
                return eT.YFl(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            return eT.YFl(0, 0);
        }

        private int YFl(nc ncVar) {
            if (ncVar == nc.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return ncVar == nc.EXACTLY ? 1073741824 : 0;
        }
    }

    private void YFl(YoT yoT, float f10, float f11) {
        View view = (View) yoT.NjR();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int round = Math.round(yoT.wN() + f10);
            int round2 = Math.round(yoT.vc() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(yoT.DSW()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(yoT.qsH()), 1073741824));
            view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
        }
        int YFl2 = yoT.YFl();
        for (int i10 = 0; i10 < YFl2; i10++) {
            if (equals(view)) {
                YFl(yoT.YFl(i10), f10, f11);
            } else if (!(view instanceof qsH)) {
                YFl(yoT.YFl(i10), yoT.wN() + f10, yoT.vc() + f11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl extends ViewGroup.LayoutParams {
        private float AlY;
        private float DSW;
        private float EH;
        private float GA;
        private float NjR;
        SparseArray<String> Sg;
        SparseArray<Float> YFl;
        private float YoT;
        private float eT;
        private float lG;

        /* renamed from: nc, reason: collision with root package name */
        private float f10303nc;
        private float pDU;
        private float qsH;
        private float rkt;
        private float tN;

        /* renamed from: vc, reason: collision with root package name */
        private float f10304vc;
        private float wN;

        public YFl(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof YFl) {
                YFl yFl = (YFl) layoutParams;
                this.YFl = yFl.YFl.clone();
                this.Sg = yFl.Sg.clone();
                return;
            }
            this.YFl = new SparseArray<>();
            this.Sg = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.YFl.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.YFl.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void AlY(float f10) {
            this.f10303nc = f10;
            this.YFl.put(8, Float.valueOf(f10));
        }

        public void DSW(float f10) {
            this.GA = f10;
            this.YFl.put(10, Float.valueOf(f10));
        }

        public void EH(float f10) {
            this.lG = f10;
            this.YFl.put(25, Float.valueOf(f10));
        }

        public void GA(float f10) {
            this.wN = f10;
            this.YFl.put(19, Float.valueOf(f10));
        }

        public void NjR(float f10) {
            this.EH = f10;
            this.YFl.put(12, Float.valueOf(f10));
        }

        public void Sg(float f10) {
            this.qsH = f10;
            this.YFl.put(6, Float.valueOf(f10));
        }

        public void YFl(float f10) {
            this.DSW = f10;
            this.YFl.put(5, Float.valueOf(f10));
        }

        public void YoT(float f10) {
            this.AlY = f10;
            this.YFl.put(18, Float.valueOf(f10));
        }

        public void eT(float f10) {
            this.tN = f10;
            this.YFl.put(17, Float.valueOf(f10));
        }

        public void nc(float f10) {
            this.rkt = f10;
            this.YFl.put(13, Float.valueOf(f10));
        }

        public void pDU(float f10) {
            this.f10304vc = f10;
            this.YFl.put(20, Float.valueOf(f10));
        }

        public void qsH(float f10) {
            this.pDU = f10;
            this.YFl.put(11, Float.valueOf(f10));
        }

        public void tN(float f10) {
            this.NjR = f10;
            this.YFl.put(7, Float.valueOf(f10));
        }

        public void vc(float f10) {
            this.YoT = f10;
            this.YFl.put(14, Float.valueOf(f10));
        }

        public void wN(float f10) {
            this.eT = f10;
            this.YFl.put(9, Float.valueOf(f10));
        }

        public YFl(int i10, int i11) {
            super(i10, i11);
            this.YFl = new SparseArray<>();
            this.Sg = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.YFl.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.YFl.put(16, Float.valueOf(i11));
            }
        }
    }

    private void YFl(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.Sg.vc(size2);
        }
        if (mode == 1073741824) {
            this.Sg.AlY(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.Sg.NjR(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.Sg.qsH(size);
        }
        this.Sg.YFl(Float.NaN, Float.NaN);
    }

    public static void YFl(YFl yFl, YoT yoT, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            yoT.YFl(AlY.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                yoT.Sg(wN.LEFT, r0.left);
                yoT.Sg(wN.TOP, r0.top);
                yoT.Sg(wN.RIGHT, r0.right);
                yoT.Sg(wN.BOTTOM, r0.bottom);
            }
        }
        for (int i10 = 0; i10 < yFl.YFl.size(); i10++) {
            int keyAt = yFl.YFl.keyAt(i10);
            float floatValue = yFl.YFl.valueAt(i10).floatValue();
            if (keyAt == 4) {
                yoT.tN(com.bytedance.adsdk.ugeno.yoga.Sg.YFl(Math.round(floatValue)));
            } else if (keyAt == 0) {
                yoT.YFl(com.bytedance.adsdk.ugeno.yoga.Sg.YFl(Math.round(floatValue)));
            } else if (keyAt == 9) {
                yoT.Sg(com.bytedance.adsdk.ugeno.yoga.Sg.YFl(Math.round(floatValue)));
            } else if (keyAt == 25) {
                yoT.nc(floatValue);
            } else if (keyAt == 8) {
                yoT.tN(floatValue);
            } else if (keyAt == 1) {
                yoT.YFl(vc.YFl(Math.round(floatValue)));
            } else if (keyAt == 6) {
                yoT.YFl(floatValue);
            } else if (keyAt == 7) {
                yoT.Sg(floatValue);
            } else if (keyAt == 16) {
                if (floatValue == -1.0f) {
                    yoT.DSW(100.0f);
                } else if (floatValue == -2.0f) {
                    yoT.AlY();
                } else {
                    yoT.vc(floatValue);
                }
            } else if (keyAt == 18) {
                yoT.YFl(wN.LEFT, floatValue);
            } else if (keyAt == 3) {
                yoT.YFl(DSW.YFl(Math.round(floatValue)));
            } else if (keyAt == 17) {
                yoT.YFl(wN.TOP, floatValue);
            } else if (keyAt == 20) {
                yoT.YFl(wN.RIGHT, floatValue);
            } else if (keyAt == 19) {
                yoT.YFl(wN.BOTTOM, floatValue);
            } else if (keyAt == 22) {
                yoT.Sg(wN.LEFT, floatValue);
            } else if (keyAt == 21) {
                yoT.Sg(wN.TOP, floatValue);
            } else if (keyAt == 24) {
                yoT.Sg(wN.RIGHT, floatValue);
            } else if (keyAt == 23) {
                yoT.Sg(wN.BOTTOM, floatValue);
            } else if (keyAt == 11) {
                yoT.tN(wN.LEFT, floatValue);
            } else if (keyAt == 10) {
                yoT.tN(wN.TOP, floatValue);
            } else if (keyAt == 13) {
                yoT.tN(wN.RIGHT, floatValue);
            } else if (keyAt == 12) {
                yoT.tN(wN.BOTTOM, floatValue);
            } else if (keyAt == 14) {
                yoT.YFl(EH.YFl(Math.round(floatValue)));
            } else if (keyAt == 15) {
                if (floatValue == -1.0f) {
                    yoT.wN(100.0f);
                } else if (floatValue == -2.0f) {
                    yoT.tN();
                } else {
                    yoT.AlY(floatValue);
                }
            } else if (keyAt == 2) {
                yoT.YFl(rkt.YFl(Math.round(floatValue)));
            }
        }
    }

    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.tN = sg2;
    }
}
