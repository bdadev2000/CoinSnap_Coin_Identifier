package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* loaded from: classes4.dex */
public class MBNativeRollView extends LinearLayout {
    private RollingBCView a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14221b;

    /* renamed from: c, reason: collision with root package name */
    private NativeListener.FilpListener f14222c;

    /* loaded from: classes4.dex */
    public interface a {
        View a(Frame frame, int i10);
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f14222c = filpListener;
            this.a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i10) {
        this.a.setLayoutParams(new LinearLayout.LayoutParams(i10, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14221b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.a = rollingBCView;
        addView(rollingBCView);
        this.a.setLayoutParams(new LinearLayout.LayoutParams((int) (ai.i(context) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
