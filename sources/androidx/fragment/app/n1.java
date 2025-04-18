package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final s1 a = new s1();

    /* renamed from: b, reason: collision with root package name */
    public static final u1 f1697b;

    static {
        u1 u1Var;
        try {
            Intrinsics.checkNotNull(f2.n.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            u1Var = (u1) f2.n.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            u1Var = null;
        }
        f1697b = u1Var;
    }

    public static final void a(int i10, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
