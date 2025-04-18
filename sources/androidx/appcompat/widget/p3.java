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

/* loaded from: classes.dex */
public abstract class p3 {
    public static final ThreadLocal a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f994b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f995c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f996d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f997e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f998f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f999g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.a.f17887j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f994b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return g0.d.c(c(context, i10), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f999g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        i3 i3Var = new i3(context, obtainStyledAttributes);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            i3Var.o();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = f999g;
        iArr[0] = i10;
        i3 i3Var = new i3(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return i3Var.b(0);
        } finally {
            i3Var.o();
        }
    }
}
