package androidx.navigation;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class Navigation$findViewNavController$2 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        p0.a.s(view, "it");
        Object tag = view.getTag(com.cooldev.gba.emulator.gameboy.R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }
}
