package androidx.lifecycle;

import android.view.View;
import com.cooldev.gba.emulator.gameboy.R;
import y0.m;
import y0.n;

/* loaded from: classes4.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner a(View view) {
        p0.a.s(view, "<this>");
        return (LifecycleOwner) m.M(m.Q(n.J(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.f20130a), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.f20131a));
    }

    public static final void b(View view, LifecycleOwner lifecycleOwner) {
        p0.a.s(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
