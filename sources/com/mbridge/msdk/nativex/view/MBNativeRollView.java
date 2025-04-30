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

/* loaded from: classes3.dex */
public class MBNativeRollView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private RollingBCView f16788a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private NativeListener.FilpListener f16789c;

    /* loaded from: classes3.dex */
    public interface a {
        View a(Frame frame, int i9);
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f16788a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.f16788a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f16789c = filpListener;
            this.f16788a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i9) {
        this.f16788a.setLayoutParams(new LinearLayout.LayoutParams(i9, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f16788a = rollingBCView;
        addView(rollingBCView);
        this.f16788a.setLayoutParams(new LinearLayout.LayoutParams((int) (ai.i(context) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
