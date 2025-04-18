package f2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class e0 {
    public static final l0 a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f17594b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new m0();
        } else {
            a = new l0();
        }
        f17594b = new b(5, "translationAlpha", Float.class);
        new b(6, "clipBounds", Rect.class);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        a.C(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) {
        a.x(view, i10);
    }
}
