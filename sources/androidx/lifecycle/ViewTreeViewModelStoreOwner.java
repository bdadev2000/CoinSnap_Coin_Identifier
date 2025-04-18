package androidx.lifecycle;

import android.view.View;
import com.cooldev.gba.emulator.gameboy.R;
import y0.m;
import y0.n;

/* loaded from: classes3.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner a(View view) {
        p0.a.s(view, "<this>");
        return (ViewModelStoreOwner) m.M(m.Q(n.J(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.f20132a), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.f20133a));
    }

    public static final void b(View view, ViewModelStoreOwner viewModelStoreOwner) {
        p0.a.s(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
