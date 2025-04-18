package f2;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class d0 {
    public static int a(ViewGroup viewGroup, int i10) {
        int childDrawingOrder;
        childDrawingOrder = viewGroup.getChildDrawingOrder(i10);
        return childDrawingOrder;
    }

    public static void b(ViewGroup viewGroup, boolean z10) {
        viewGroup.suppressLayout(z10);
    }
}
