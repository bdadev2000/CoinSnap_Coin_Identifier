package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class b2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f809b;

    /* renamed from: c, reason: collision with root package name */
    public final int f810c;

    /* renamed from: d, reason: collision with root package name */
    public final int f811d;

    /* renamed from: f, reason: collision with root package name */
    public final View f812f;

    /* renamed from: g, reason: collision with root package name */
    public a2 f813g;

    /* renamed from: h, reason: collision with root package name */
    public a2 f814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f815i;

    /* renamed from: j, reason: collision with root package name */
    public int f816j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f817k = new int[2];

    public b2(View view) {
        this.f812f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f809b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f810c = tapTimeout;
        this.f811d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        a2 a2Var = this.f814h;
        View view = this.f812f;
        if (a2Var != null) {
            view.removeCallbacks(a2Var);
        }
        a2 a2Var2 = this.f813g;
        if (a2Var2 != null) {
            view.removeCallbacks(a2Var2);
        }
    }

    public abstract k.g0 b();

    public abstract boolean c();

    public boolean d() {
        k.g0 b3 = b();
        if (b3 != null && b3.a()) {
            b3.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f815i = false;
        this.f816j = -1;
        a2 a2Var = this.f813g;
        if (a2Var != null) {
            this.f812f.removeCallbacks(a2Var);
        }
    }
}
