package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f17089a;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f17090b;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout a(@NotNull StaticLayoutParams staticLayoutParams) {
        Constructor constructor;
        StaticLayout staticLayout = null;
        if (f17089a) {
            constructor = f17090b;
        } else {
            f17089a = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                f17090b = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                f17090b = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            constructor = f17090b;
        }
        if (constructor != null) {
            try {
                staticLayout = (StaticLayout) constructor.newInstance(staticLayoutParams.f17091a, Integer.valueOf(staticLayoutParams.f17092b), Integer.valueOf(staticLayoutParams.f17093c), staticLayoutParams.d, Integer.valueOf(staticLayoutParams.e), staticLayoutParams.f17095g, staticLayoutParams.f17094f, Float.valueOf(staticLayoutParams.f17099k), Float.valueOf(staticLayoutParams.f17100l), Boolean.valueOf(staticLayoutParams.f17102n), staticLayoutParams.f17097i, Integer.valueOf(staticLayoutParams.f17098j), Integer.valueOf(staticLayoutParams.f17096h));
            } catch (IllegalAccessException unused2) {
                f17090b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused3) {
                f17090b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused4) {
                f17090b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(staticLayoutParams.f17091a, staticLayoutParams.f17092b, staticLayoutParams.f17093c, staticLayoutParams.d, staticLayoutParams.e, staticLayoutParams.f17095g, staticLayoutParams.f17099k, staticLayoutParams.f17100l, staticLayoutParams.f17102n, staticLayoutParams.f17097i, staticLayoutParams.f17098j);
    }
}
