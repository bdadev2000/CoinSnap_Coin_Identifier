package q;

import android.view.View;
import android.view.ViewConfiguration;
import p.InterfaceC2519B;

/* renamed from: q.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2627u0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22729c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22730d;

    /* renamed from: f, reason: collision with root package name */
    public final View f22731f;

    /* renamed from: g, reason: collision with root package name */
    public RunnableC2625t0 f22732g;

    /* renamed from: h, reason: collision with root package name */
    public RunnableC2625t0 f22733h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22734i;

    /* renamed from: j, reason: collision with root package name */
    public int f22735j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f22736k = new int[2];

    public AbstractViewOnTouchListenerC2627u0(View view) {
        this.f22731f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f22729c = tapTimeout;
        this.f22730d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC2625t0 runnableC2625t0 = this.f22733h;
        View view = this.f22731f;
        if (runnableC2625t0 != null) {
            view.removeCallbacks(runnableC2625t0);
        }
        RunnableC2625t0 runnableC2625t02 = this.f22732g;
        if (runnableC2625t02 != null) {
            view.removeCallbacks(runnableC2625t02);
        }
    }

    public abstract InterfaceC2519B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC2519B b = b();
        if (b != null && b.a()) {
            b.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractViewOnTouchListenerC2627u0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f22734i = false;
        this.f22735j = -1;
        RunnableC2625t0 runnableC2625t0 = this.f22732g;
        if (runnableC2625t0 != null) {
            this.f22731f.removeCallbacks(runnableC2625t0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
