package androidx.navigation;

import android.view.View;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class Navigation$findViewNavController$1 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        p0.a.s(view, "it");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
