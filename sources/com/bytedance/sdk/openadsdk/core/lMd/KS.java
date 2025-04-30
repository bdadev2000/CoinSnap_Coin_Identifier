package com.bytedance.sdk.openadsdk.core.lMd;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.Bj;

/* loaded from: classes.dex */
public abstract class KS implements View.OnClickListener, View.OnTouchListener {
    private static long COT = 0;
    private static float KS = 0.0f;
    protected static int QUv = 8;
    private static float jU;
    private static float lMd;
    private static float zp;
    protected View YhE;
    protected float cz = -1.0f;
    protected float FP = -1.0f;
    protected float ot = -1.0f;
    protected float yRU = -1.0f;
    protected long ox = -1;
    protected long RCv = -1;
    protected int Lij = -1;
    protected int Gzh = -1024;
    protected int irS = -1;
    protected boolean cW = true;
    public SparseArray<zp> WNy = new SparseArray<>();
    private int HWF = 0;
    private int QR = 0;

    /* loaded from: classes.dex */
    public static class zp {
        public double KS;
        public long jU;
        public double lMd;
        public int zp;

        public zp(int i9, double d2, double d9, long j7) {
            this.zp = i9;
            this.lMd = d2;
            this.KS = d9;
            this.jU = j7;
        }
    }

    static {
        if (KVG.zp() != null) {
            QUv = KVG.lMd();
        }
        zp = 0.0f;
        lMd = 0.0f;
        KS = 0.0f;
        jU = 0.0f;
        COT = 0L;
    }

    private boolean zp(View view, Point point) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (lMd.KS(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i9 = point.x) >= (i10 = iArr[0]) && i9 <= childAt.getWidth() + i10 && (i11 = point.y) >= (i12 = iArr[1]) && i11 <= childAt.getHeight() + i12;
                }
                if (zp(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean QR() {
        return this.cW;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!Bj.zp()) {
            return;
        }
        zp(view, this.cz, this.FP, this.ot, this.yRU, this.WNy, this.cW);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.lMd.KS.jU <= r3) goto L19;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lMd.KS.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void zp(View view, float f9, float f10, float f11, float f12, SparseArray<zp> sparseArray, boolean z8);
}
