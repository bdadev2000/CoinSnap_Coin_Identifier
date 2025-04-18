package androidx.transition;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f21634h = true;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api29Impl {
        @DoNotInline
        public static void a(View view, int i2) {
            view.setTransitionVisibility(i2);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void c(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(view, i2);
        } else if (f21634h) {
            try {
                Api29Impl.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f21634h = false;
            }
        }
    }
}
