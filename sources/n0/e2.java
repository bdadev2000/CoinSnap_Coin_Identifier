package n0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class e2 extends i2 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f22268e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22269f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f22270g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f22271h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f22272c;

    /* renamed from: d, reason: collision with root package name */
    public g0.f f22273d;

    public e2() {
        this.f22272c = i();
    }

    @Nullable
    private static WindowInsets i() {
        if (!f22269f) {
            try {
                f22268e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f22269f = true;
        }
        Field field = f22268e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f22271h) {
            try {
                f22270g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f22271h = true;
        }
        Constructor constructor = f22270g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // n0.i2
    @NonNull
    public r2 b() {
        a();
        r2 h10 = r2.h(null, this.f22272c);
        g0.f[] fVarArr = this.f22291b;
        o2 o2Var = h10.a;
        o2Var.o(fVarArr);
        o2Var.q(this.f22273d);
        return h10;
    }

    @Override // n0.i2
    public void e(@Nullable g0.f fVar) {
        this.f22273d = fVar;
    }

    @Override // n0.i2
    public void g(@NonNull g0.f fVar) {
        WindowInsets windowInsets = this.f22272c;
        if (windowInsets != null) {
            this.f22272c = windowInsets.replaceSystemWindowInsets(fVar.a, fVar.f17910b, fVar.f17911c, fVar.f17912d);
        }
    }

    public e2(@NonNull r2 r2Var) {
        super(r2Var);
        this.f22272c = r2Var.g();
    }
}
