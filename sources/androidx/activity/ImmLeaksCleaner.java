package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.t {

    /* renamed from: b, reason: collision with root package name */
    public static int f559b;

    @Override // androidx.lifecycle.t
    public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar != androidx.lifecycle.n.ON_DESTROY) {
            return;
        }
        if (f559b == 0) {
            try {
                f559b = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f559b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f559b != 1) {
        } else {
            throw null;
        }
    }
}
