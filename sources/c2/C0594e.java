package c2;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594e implements InterfaceC0595f {
    public final Set b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5391c;

    @Override // c2.InterfaceC0595f
    public final void b(Activity activity) {
        if (this.f5391c || !this.b.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC0593d(this, decorView));
    }
}
