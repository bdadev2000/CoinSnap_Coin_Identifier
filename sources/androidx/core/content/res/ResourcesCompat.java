package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ResourcesCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18503a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f18504b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18505c = new Object();

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api21Impl {
        @DoNotInline
        public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        @DoNotInline
        public static Drawable b(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api23Impl {
        @DoNotInline
        public static int a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColor(i2, theme);
        }

        @NonNull
        @DoNotInline
        public static ColorStateList b(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static float a(@NonNull Resources resources, @DimenRes int i2) {
            return resources.getFloat(i2);
        }
    }

    /* loaded from: classes.dex */
    public static class ColorStateListCacheEntry {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f18506a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f18507b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18508c;

        public ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f18506a = colorStateList;
            this.f18507b = configuration;
            this.f18508c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class ColorStateListCacheKey {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f18509a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f18510b;

        public ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.f18509a = resources;
            this.f18510b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ColorStateListCacheKey.class != obj.getClass()) {
                return false;
            }
            ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
            return this.f18509a.equals(colorStateListCacheKey.f18509a) && Objects.equals(this.f18510b, colorStateListCacheKey.f18510b);
        }

        public final int hashCode() {
            return Objects.hash(this.f18509a, this.f18510b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class FontCallback {
        @NonNull
        @RestrictTo
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo
        public final void callbackFailAsync(int i2, @Nullable Handler handler) {
            getHandler(handler).post(new b(i2, 0, this));
        }

        @RestrictTo
        public final void callbackSuccessAsync(@NonNull Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new a(0, this, typeface));
        }

        public abstract void onFontRetrievalFailed(int i2);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class ThemeCompat {

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api23Impl {

            /* renamed from: a, reason: collision with root package name */
            public static final Object f18511a = new Object();

            /* renamed from: b, reason: collision with root package name */
            public static Method f18512b;

            /* renamed from: c, reason: collision with root package name */
            public static boolean f18513c;
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api29Impl {
            @DoNotInline
            public static void a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.a(theme);
                return;
            }
            synchronized (Api23Impl.f18511a) {
                if (!Api23Impl.f18513c) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        Api23Impl.f18512b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                    }
                    Api23Impl.f18513c = true;
                }
                Method method = Api23Impl.f18512b;
                if (method != null) {
                    try {
                        method.invoke(theme, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                        Api23Impl.f18512b = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x003f, code lost:
    
        if (r4.f18508c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList a(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r0 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey
            r0.<init>(r7, r9)
            java.lang.Object r1 = androidx.core.content.res.ResourcesCompat.f18505c
            monitor-enter(r1)
            java.util.WeakHashMap r2 = androidx.core.content.res.ResourcesCompat.f18504b     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L34
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r2 == 0) goto L48
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L34
            if (r4 <= 0) goto L48
            java.lang.Object r4 = r2.get(r8)     // Catch: java.lang.Throwable -> L34
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r4 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r4     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L48
            android.content.res.Configuration r5 = r4.f18507b     // Catch: java.lang.Throwable -> L34
            android.content.res.Configuration r6 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L34
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L45
            if (r9 != 0) goto L37
            int r5 = r4.f18508c     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L41
            goto L37
        L34:
            r7 = move-exception
            goto Lb0
        L37:
            if (r9 == 0) goto L45
            int r5 = r4.f18508c     // Catch: java.lang.Throwable -> L34
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> L34
            if (r5 != r6) goto L45
        L41:
            android.content.res.ColorStateList r2 = r4.f18506a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L4a
        L45:
            r2.remove(r8)     // Catch: java.lang.Throwable -> L34
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            r2 = r3
        L4a:
            if (r2 == 0) goto L4d
            return r2
        L4d:
            java.lang.ThreadLocal r1 = androidx.core.content.res.ResourcesCompat.f18503a
            java.lang.Object r2 = r1.get()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            if (r2 != 0) goto L5f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.set(r2)
        L5f:
            r1 = 1
            r7.getValue(r8, r2, r1)
            int r1 = r2.type
            r2 = 28
            if (r1 < r2) goto L6e
            r2 = 31
            if (r1 > r2) goto L6e
            goto L7f
        L6e:
            android.content.res.XmlResourceParser r1 = r7.getXml(r8)
            android.content.res.ColorStateList r3 = androidx.core.content.res.ColorStateListInflaterCompat.a(r7, r1, r9)     // Catch: java.lang.Exception -> L77
            goto L7f
        L77:
            r1 = move-exception
            java.lang.String r2 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r2, r4, r1)
        L7f:
            if (r3 == 0) goto Lab
            java.lang.Object r1 = androidx.core.content.res.ResourcesCompat.f18505c
            monitor-enter(r1)
            java.util.WeakHashMap r7 = androidx.core.content.res.ResourcesCompat.f18504b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r7.get(r0)     // Catch: java.lang.Throwable -> L97
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L99
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L97
            r2.<init>()     // Catch: java.lang.Throwable -> L97
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r7 = move-exception
            goto La9
        L99:
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r7 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources r0 = r0.f18509a     // Catch: java.lang.Throwable -> L97
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L97
            r7.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L97
            r2.append(r8, r7)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            return r3
        La9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            throw r7
        Lab:
            android.content.res.ColorStateList r7 = androidx.core.content.res.ResourcesCompat.Api23Impl.b(r7, r8, r9)
            return r7
        Lb0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static Drawable b(Resources resources, int i2, Resources.Theme theme) {
        return Api21Impl.a(resources, i2, theme);
    }

    public static Drawable c(Resources resources, int i2, int i3, Resources.Theme theme) {
        return Api21Impl.b(resources, i2, i3, theme);
    }

    public static Typeface d(int i2, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface e(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, androidx.core.content.res.ResourcesCompat.FontCallback r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.e(android.content.Context, int, android.util.TypedValue, int, androidx.core.content.res.ResourcesCompat$FontCallback, boolean, boolean):android.graphics.Typeface");
    }
}
