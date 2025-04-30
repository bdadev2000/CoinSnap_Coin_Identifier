package H3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class a implements View.OnTouchListener {
    public final Dialog b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1375c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1376d;

    /* renamed from: f, reason: collision with root package name */
    public final int f1377f;

    public a(Dialog dialog, Rect rect) {
        this.b = dialog;
        this.f1375c = rect.left;
        this.f1376d = rect.top;
        this.f1377f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f1375c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f1376d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i9 = this.f1377f;
            obtain.setLocation((-i9) - 1, (-i9) - 1);
        }
        view.performClick();
        return this.b.onTouchEvent(obtain);
    }
}
