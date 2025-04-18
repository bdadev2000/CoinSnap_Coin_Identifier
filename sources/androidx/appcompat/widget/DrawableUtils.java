package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
public class DrawableUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1093a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1094b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f1095c = new Rect();

    /* loaded from: classes.dex */
    public static class Api18Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f1096a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f1097b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f1098c;
        public static final Field d;
        public static final Field e;

        /* renamed from: f, reason: collision with root package name */
        public static final Field f1099f;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L39 java.lang.NoSuchMethodException -> L3c
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L34
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L48
                r8 = r0
                goto L4a
            L2d:
                r7 = r1
                goto L48
            L2f:
                r6 = r1
            L30:
                r7 = r6
                goto L48
            L32:
                r6 = r1
                goto L30
            L34:
                r6 = r1
                goto L30
            L36:
                r5 = r1
            L37:
                r6 = r5
                goto L30
            L39:
                r5 = r1
            L3a:
                r6 = r5
                goto L30
            L3c:
                r5 = r1
            L3d:
                r6 = r5
                goto L30
            L3f:
                r4 = r1
                r5 = r4
                goto L37
            L42:
                r4 = r1
                r5 = r4
                goto L3a
            L45:
                r4 = r1
                r5 = r4
                goto L3d
            L48:
                r3 = r1
                r8 = r2
            L4a:
                if (r8 == 0) goto L59
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1097b = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1098c = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.d = r6
                androidx.appcompat.widget.DrawableUtils.Api18Impl.e = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1099f = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1096a = r0
                goto L65
            L59:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1097b = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1098c = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.d = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.e = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1099f = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1096a = r2
            L65:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1093a);
        } else {
            drawable.setState(f1094b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            Insets a2 = Api29Impl.a(drawable);
            i2 = a2.left;
            i3 = a2.top;
            i4 = a2.right;
            i5 = a2.bottom;
            return new Rect(i2, i3, i4, i5);
        }
        Drawable l2 = DrawableCompat.l(drawable);
        if (i6 >= 29) {
            boolean z2 = Api18Impl.f1096a;
        } else if (Api18Impl.f1096a) {
            try {
                Object invoke = Api18Impl.f1097b.invoke(l2, new Object[0]);
                if (invoke != null) {
                    return new Rect(Api18Impl.f1098c.getInt(invoke), Api18Impl.d.getInt(invoke), Api18Impl.e.getInt(invoke), Api18Impl.f1099f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1095c;
    }

    public static PorterDuff.Mode c(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
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
}
