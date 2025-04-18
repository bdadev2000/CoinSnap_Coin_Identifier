package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class Ne extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.Sg.vc Sg;
    private final YFl YFl;

    /* loaded from: classes.dex */
    public static class YFl extends GestureDetector.SimpleOnGestureListener {
        boolean YFl = false;

        public boolean Sg() {
            return this.YFl;
        }

        public void YFl() {
            this.YFl = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.YFl = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public Ne(Context context) {
        this(context, new YFl());
    }

    public boolean Sg() {
        return this.YFl.Sg();
    }

    public void YFl() {
        this.YFl.YFl();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.Sg.YFl(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public Ne(Context context, YFl yFl) {
        super(context, yFl);
        this.YFl = yFl;
        this.Sg = new com.bytedance.sdk.openadsdk.core.Sg.vc();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.nc YFl(Context context, View view, View view2) {
        if (this.Sg == null) {
            return new nc.YFl().YFl();
        }
        return new nc.YFl().vc(this.Sg.YFl).wN(this.Sg.Sg).AlY(this.Sg.tN).tN(this.Sg.AlY).Sg(this.Sg.wN).YFl(this.Sg.f10645vc).Sg(GS.YFl(view)).YFl(GS.YFl(view2)).tN(GS.tN(view)).AlY(GS.tN(view2)).AlY(this.Sg.DSW).wN(this.Sg.qsH).vc(this.Sg.NjR).YFl(this.Sg.YoT).Sg(com.bytedance.sdk.openadsdk.core.NjR.Sg().YFl() ? 1 : 2).YFl("vessel").YFl(GS.wN(context)).tN(GS.DSW(context)).Sg(GS.vc(context)).YFl();
    }
}
