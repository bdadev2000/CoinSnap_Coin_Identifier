package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import org.objectweb.asm.Opcodes;

@RestrictTo
/* loaded from: classes4.dex */
public class ThemeUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1227a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1228b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1229c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1230f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1231g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.f318j);
        try {
            if (!obtainStyledAttributes.hasValue(Opcodes.LNEG)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i2, Context context) {
        ColorStateList d2 = d(i2, context);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f1228b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f1227a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return ColorUtils.g(c(i2, context), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(int i2, Context context) {
        int[] iArr = f1231g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            tintTypedArray.f();
        }
    }

    public static ColorStateList d(int i2, Context context) {
        int[] iArr = f1231g;
        iArr[0] = i2;
        TintTypedArray tintTypedArray = new TintTypedArray(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return tintTypedArray.a(0);
        } finally {
            tintTypedArray.f();
        }
    }
}
