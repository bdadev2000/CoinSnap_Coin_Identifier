package o0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public class m {
    public final Object a;

    public m() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new l(this);
        } else {
            this.a = new k(this);
        }
    }

    public j a(int i10) {
        return null;
    }

    public j b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }

    public m(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }
}
