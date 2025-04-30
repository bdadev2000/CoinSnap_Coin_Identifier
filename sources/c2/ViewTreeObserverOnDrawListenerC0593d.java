package c2;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0593d implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0594e f5390c;

    public ViewTreeObserverOnDrawListenerC0593d(C0594e c0594e, View view) {
        this.f5390c = c0594e;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        j2.n.f().post(new f4.b(15, this, this, false));
    }
}
