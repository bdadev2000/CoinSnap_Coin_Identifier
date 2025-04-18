package aa;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final Dialog f415b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416c;

    /* renamed from: d, reason: collision with root package name */
    public final int f417d;

    /* renamed from: f, reason: collision with root package name */
    public final int f418f;

    public a(Dialog dialog, Rect rect) {
        this.f415b = dialog;
        this.f416c = rect.left;
        this.f417d = rect.top;
        this.f418f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f416c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f417d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f418f;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f415b.onTouchEvent(obtain);
    }
}
