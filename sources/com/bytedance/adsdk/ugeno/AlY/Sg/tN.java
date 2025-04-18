package com.bytedance.adsdk.ugeno.AlY.Sg;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.AlY.DSW;

/* loaded from: classes.dex */
public class tN extends YFl {
    private float NjR;
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private float f10233nc;

    public tN(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.AlY.Sg.YFl
    public boolean YFl(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return YFl(this.Sg, (MotionEvent) objArr[0]);
    }

    public boolean YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.NjR = motionEvent.getRawX();
            this.f10233nc = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(rawX - this.NjR) >= 15.0f || Math.abs(rawY - this.f10233nc) >= 15.0f) {
                    this.eT = true;
                }
            } else if (action == 3) {
                this.eT = false;
            }
        } else {
            if (this.eT) {
                this.eT = false;
                this.NjR = 0.0f;
                this.f10233nc = 0.0f;
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.NjR) < 15.0f && Math.abs(rawY2 - this.f10233nc) < 15.0f) {
                DSW dsw = this.YFl;
                if (dsw != null) {
                    dsw.YFl(sg2, this.f10232vc, this.tN.Sg());
                    this.NjR = 0.0f;
                    this.f10233nc = 0.0f;
                    return true;
                }
            } else {
                this.eT = false;
            }
        }
        return true;
    }
}
