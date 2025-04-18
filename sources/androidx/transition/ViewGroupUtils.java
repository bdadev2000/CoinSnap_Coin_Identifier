package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
class ViewGroupUtils {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21625a = true;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api29Impl {
        @DoNotInline
        public static int a(ViewGroup viewGroup, int i2) {
            return viewGroup.getChildDrawingOrder(i2);
        }

        @DoNotInline
        public static void b(ViewGroup viewGroup, boolean z2) {
            viewGroup.suppressLayout(z2);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(viewGroup, z2);
        } else if (f21625a) {
            try {
                Api29Impl.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f21625a = false;
            }
        }
    }
}
