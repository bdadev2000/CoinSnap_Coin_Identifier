package androidx.savedstate;

import android.view.View;
import p0.a;
import y0.m;
import y0.n;

/* loaded from: classes4.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner a(View view) {
        a.s(view, "<this>");
        return (SavedStateRegistryOwner) m.M(m.Q(n.J(view, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.f21439a), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.f21440a));
    }

    public static final void b(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        a.s(view, "<this>");
        view.setTag(com.cooldev.gba.emulator.gameboy.R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
