package M0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final M f1847a;
    public static final C0211b b;

    /* JADX WARN: Type inference failed for: r0v1, types: [M0.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [M0.M, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1847a = new Object();
        } else {
            f1847a = new Object();
        }
        b = new C0211b("translationAlpha", 5, Float.class);
        new C0211b("clipBounds", 6, Rect.class);
    }

    public static void a(View view, int i9, int i10, int i11, int i12) {
        f1847a.F(view, i9, i10, i11, i12);
    }

    public static void b(View view, int i9) {
        f1847a.B(view, i9);
    }
}
