package M0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class G {
    public static int a(ViewGroup viewGroup, int i9) {
        return viewGroup.getChildDrawingOrder(i9);
    }

    public static void b(ViewGroup viewGroup, boolean z8) {
        viewGroup.suppressLayout(z8);
    }
}
