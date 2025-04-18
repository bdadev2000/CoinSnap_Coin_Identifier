package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 f20130a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        p0.a.s(view, "currentView");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
