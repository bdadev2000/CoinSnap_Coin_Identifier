package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import j.AbstractC2379a;

/* loaded from: classes.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22581a = new ThreadLocal();
    public static final int[] b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f22582c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22583d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f22584e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f22585f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f22586g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC2379a.f20950j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i9) {
        ColorStateList d2 = d(context, i9);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f22581a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f9 = typedValue.getFloat();
        return L.c.d(c(context, i9), Math.round(Color.alpha(r4) * f9));
    }

    public static int c(Context context, int i9) {
        int[] iArr = f22586g;
        iArr[0] = i9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i9) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f22586g;
        iArr[0] = i9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = I.h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
