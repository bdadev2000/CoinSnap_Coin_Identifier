package o0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class k extends AccessibilityNodeProvider {
    public final m a;

    public k(m mVar) {
        this.a = mVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        j a = this.a.a(i10);
        if (a == null) {
            return null;
        }
        return a.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        j b3 = this.a.b(i10);
        if (b3 == null) {
            return null;
        }
        return b3.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.a.c(i10, i11, bundle);
    }
}
