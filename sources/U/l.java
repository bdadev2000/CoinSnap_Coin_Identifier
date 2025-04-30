package U;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3101a;

    public l() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3101a = new j(this);
        } else {
            this.f3101a = new j(this);
        }
    }

    public i a(int i9) {
        return null;
    }

    public i b(int i9) {
        return null;
    }

    public boolean c(int i9, int i10, Bundle bundle) {
        return false;
    }

    public l(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f3101a = accessibilityNodeProvider;
    }
}
