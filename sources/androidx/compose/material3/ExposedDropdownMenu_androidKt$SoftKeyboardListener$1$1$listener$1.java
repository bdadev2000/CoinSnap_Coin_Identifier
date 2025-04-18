package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f9373c;

    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(View view, q0.a aVar) {
        this.f9372b = view;
        this.f9373c = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f9371a || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f9371a = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f9373c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f9371a) {
            return;
        }
        View view2 = this.f9372b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f9371a = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f9371a) {
            this.f9372b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f9371a = false;
        }
    }
}
