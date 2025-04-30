package q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: q.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2610l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f22685a = {R.attr.state_checked};
    public static final int[] b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f22686c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29 && i9 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(b);
            } else {
                drawable.setState(f22685a);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a6 = AbstractC2608k0.a(drawable);
            i9 = a6.left;
            i10 = a6.top;
            i11 = a6.right;
            i12 = a6.bottom;
            return new Rect(i9, i10, i11, i12);
        }
        boolean z8 = drawable instanceof M.g;
        Object obj = drawable;
        if (z8) {
            ((M.h) ((M.g) drawable)).getClass();
            obj = null;
        }
        if (i13 < 29) {
            if (AbstractC2606j0.f22680a) {
                try {
                    Object invoke = AbstractC2606j0.b.invoke(obj, null);
                    if (invoke != null) {
                        return new Rect(AbstractC2606j0.f22681c.getInt(invoke), AbstractC2606j0.f22682d.getInt(invoke), AbstractC2606j0.f22683e.getInt(invoke), AbstractC2606j0.f22684f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z9 = AbstractC2606j0.f22680a;
        }
        return f22686c;
    }

    public static PorterDuff.Mode c(int i9, PorterDuff.Mode mode) {
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 != 9) {
                    switch (i9) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
