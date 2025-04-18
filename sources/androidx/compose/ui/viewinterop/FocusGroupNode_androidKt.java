package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;

/* loaded from: classes2.dex */
public final class FocusGroupNode_androidKt {
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(FocusOwner focusOwner, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        androidx.compose.ui.geometry.Rect n2 = focusOwner.n();
        if (n2 == null) {
            return null;
        }
        int i2 = (int) n2.f14914a;
        int i3 = iArr[0];
        int i4 = iArr2[0];
        int i5 = (int) n2.f14915b;
        int i6 = iArr[1];
        int i7 = iArr2[1];
        return new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) n2.f14916c) + i3) - i4, (((int) n2.d) + i6) - i7);
    }

    public static final View c(Modifier.Node node) {
        AndroidViewHolder androidViewHolder = DelegatableNodeKt.f(node.f14688a).f15951m;
        View interopView = androidViewHolder != null ? androidViewHolder.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view".toString());
    }
}
