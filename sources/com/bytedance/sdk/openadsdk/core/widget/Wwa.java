package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class Wwa {
    private float AlY;
    private int DSW;
    private final YFl YFl;
    private boolean eT;

    /* renamed from: vc, reason: collision with root package name */
    private int f10760vc;
    private float wN;
    private final boolean Sg = false;
    private boolean tN = false;
    private boolean qsH = true;
    private boolean NjR = false;

    /* renamed from: nc, reason: collision with root package name */
    private final View.OnTouchListener f10759nc = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Wwa.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (Wwa.this.YFl.VOe()) {
                if (!Wwa.this.tN) {
                    return true;
                }
                return false;
            }
            float x10 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        Wwa.this.eT = false;
                    }
                } else {
                    if (Math.abs(x10 - Wwa.this.f10760vc) > 20.0f || Math.abs(y4 - Wwa.this.DSW) > 20.0f) {
                        Wwa.this.qsH = false;
                    }
                    Wwa.this.qsH = true;
                    Wwa.this.NjR = false;
                    Wwa.this.AlY = 0.0f;
                    Wwa.this.wN = 0.0f;
                    Wwa.this.f10760vc = 0;
                    if (Wwa.this.YFl != null) {
                        Wwa.this.YFl.YFl(view, Wwa.this.qsH);
                    }
                    Wwa.this.eT = false;
                }
            } else {
                Wwa wwa = Wwa.this;
                wwa.eT = wwa.YFl(motionEvent);
                Wwa.this.AlY = x10;
                Wwa.this.wN = y4;
                Wwa.this.f10760vc = (int) x10;
                Wwa.this.DSW = (int) y4;
                Wwa.this.qsH = true;
                if (Wwa.this.YFl != null && Wwa.this.tN) {
                    Wwa.this.YFl.YFl(view, true);
                }
            }
            if (!Wwa.this.tN) {
                return true;
            }
            return false;
        }
    };

    /* loaded from: classes.dex */
    public interface YFl {
        boolean VOe();

        void YFl(View view, boolean z10);
    }

    public Wwa(YFl yFl) {
        this.YFl = yFl;
    }

    public void YFl(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f10759nc);
        }
    }

    public void YFl(boolean z10) {
        this.tN = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int tN = GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl().getApplicationContext());
        int AlY = GS.AlY(com.bytedance.sdk.openadsdk.core.lG.YFl().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = tN;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = AlY;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
