package androidx.appcompat.widget;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public abstract class v1 {
    public static boolean a(AbsListView absListView) {
        boolean isSelectedChildViewEnabled;
        isSelectedChildViewEnabled = absListView.isSelectedChildViewEnabled();
        return isSelectedChildViewEnabled;
    }

    public static void b(AbsListView absListView, boolean z10) {
        absListView.setSelectedChildViewEnabled(z10);
    }
}
