package androidx.lifecycle;

import android.view.View;
import com.cooldev.gba.emulator.gameboy.R;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 f20133a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        p0.a.s(view, ViewHierarchyConstants.VIEW_KEY);
        Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
