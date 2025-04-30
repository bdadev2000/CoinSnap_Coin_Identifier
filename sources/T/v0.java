package T;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class v0 extends y0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2936e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2937f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f2938g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2939h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f2940c;

    /* renamed from: d, reason: collision with root package name */
    public L.e f2941d;

    public v0() {
        this.f2940c = i();
    }

    @Nullable
    private static WindowInsets i() {
        if (!f2937f) {
            try {
                f2936e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f2937f = true;
        }
        Field field = f2936e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f2939h) {
            try {
                f2938g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f2939h = true;
        }
        Constructor constructor = f2938g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // T.y0
    @NonNull
    public G0 b() {
        a();
        G0 h6 = G0.h(null, this.f2940c);
        L.e[] eVarArr = this.b;
        E0 e02 = h6.f2863a;
        e02.o(eVarArr);
        e02.q(this.f2941d);
        return h6;
    }

    @Override // T.y0
    public void e(@Nullable L.e eVar) {
        this.f2941d = eVar;
    }

    @Override // T.y0
    public void g(@NonNull L.e eVar) {
        WindowInsets windowInsets = this.f2940c;
        if (windowInsets != null) {
            this.f2940c = windowInsets.replaceSystemWindowInsets(eVar.f1669a, eVar.b, eVar.f1670c, eVar.f1671d);
        }
    }

    public v0(@NonNull G0 g02) {
        super(g02);
        this.f2940c = g02.g();
    }
}
