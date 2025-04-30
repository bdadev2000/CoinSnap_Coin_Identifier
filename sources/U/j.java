package U;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class j extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final l f3100a;

    public j(l lVar) {
        this.f3100a = lVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
        i a6 = this.f3100a.a(i9);
        if (a6 == null) {
            return null;
        }
        return a6.f3098a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i9) {
        this.f3100a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i9) {
        i b = this.f3100a.b(i9);
        if (b == null) {
            return null;
        }
        return b.f3098a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i9, int i10, Bundle bundle) {
        return this.f3100a.c(i9, i10, bundle);
    }
}
