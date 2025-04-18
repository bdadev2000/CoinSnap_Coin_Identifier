package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class YFl implements View.OnTouchListener {
    private static int tN = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.tN.qsH AlY;
    private float Sg;
    private float YFl;
    private int wN;

    /* renamed from: vc, reason: collision with root package name */
    private RectF f10398vc = new RectF();
    private long DSW = 0;
    private final int qsH = 200;
    private final int NjR = 3;

    /* renamed from: nc, reason: collision with root package name */
    private SoftReference<ViewGroup> f10397nc = new SoftReference<>(null);

    public YFl(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh, int i10, final ViewGroup viewGroup) {
        this.wN = tN;
        this.AlY = qsh;
        if (i10 > 0) {
            this.wN = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.this.f10397nc = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = this.f10398vc;
                if (rectF != null && !rectF.contains(this.YFl, this.Sg)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float abs = Math.abs(rawX - this.YFl);
                float abs2 = Math.abs(rawY - this.Sg);
                int i10 = this.wN;
                if (abs >= i10 && abs2 >= i10) {
                    com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh2 = this.AlY;
                    if (qsh2 != null) {
                        qsh2.YFl();
                    }
                } else if ((System.currentTimeMillis() - this.DSW < 200 || (abs < 3.0f && abs2 < 3.0f)) && (qsh = this.AlY) != null) {
                    qsh.YFl();
                }
            }
        } else {
            this.f10398vc = YFl(this.f10397nc.get());
            this.YFl = motionEvent.getRawX();
            this.Sg = motionEvent.getRawY();
            this.DSW = System.currentTimeMillis();
        }
        return true;
    }

    private RectF YFl(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
    }
}
