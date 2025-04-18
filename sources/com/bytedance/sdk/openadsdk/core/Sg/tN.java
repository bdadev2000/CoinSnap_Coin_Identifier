package com.bytedance.sdk.openadsdk.core.Sg;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.YoT;

/* loaded from: classes.dex */
public abstract class tN implements View.OnClickListener, View.OnTouchListener {
    private static float AlY = 0.0f;
    private static float Sg = 0.0f;
    private static float YFl = 0.0f;
    protected static int hQ = 8;
    private static float tN;
    private static long wN;
    protected View mn;
    protected float wXo = -1.0f;
    protected float Ne = -1.0f;
    protected float VOe = -1.0f;
    protected float bZ = -1.0f;
    protected long UZM = -1;
    protected long YI = -1;
    protected int Ga = -1;
    protected int dXO = -1024;
    protected int Cfr = -1;
    protected boolean pq = true;
    public SparseArray<YFl> zB = new SparseArray<>();

    /* renamed from: vc, reason: collision with root package name */
    private int f10643vc = 0;
    private int DSW = 0;

    /* loaded from: classes.dex */
    public static class YFl {
        public long AlY;
        public double Sg;
        public int YFl;
        public double tN;

        public YFl(int i10, double d10, double d11, long j3) {
            this.YFl = i10;
            this.Sg = d10;
            this.tN = d11;
            this.AlY = j3;
        }
    }

    static {
        if (lG.YFl() != null) {
            hQ = lG.Sg();
        }
        YFl = 0.0f;
        Sg = 0.0f;
        tN = 0.0f;
        AlY = 0.0f;
        wN = 0L;
    }

    private boolean YFl(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (Sg.tN(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= childAt.getWidth() + i11 && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= childAt.getHeight() + i13;
                }
                if (YFl(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean DSW() {
        return this.pq;
    }

    public abstract void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<YFl> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!YoT.YFl()) {
            return;
        }
        YFl(view, this.wXo, this.Ne, this.VOe, this.bZ, this.zB, this.pq);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.Sg.tN.AlY <= r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.Sg.tN.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
