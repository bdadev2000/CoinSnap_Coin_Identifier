package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.cooldev.gba.emulator.gameboy.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes.dex */
public final class ResourceManagerInternal {

    /* renamed from: g, reason: collision with root package name */
    public static ResourceManagerInternal f1170g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1173b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1174c;
    public boolean d;
    public ResourceManagerHooks e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f1169f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final ColorFilterLruCache f1171h = new LruCache(6);

    /* loaded from: classes.dex */
    public static class AsldcInflateDelegate implements InflateDelegate {
    }

    /* loaded from: classes.dex */
    public static class AvdcInflateDelegate implements InflateDelegate {
    }

    /* loaded from: classes.dex */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
    }

    /* loaded from: classes.dex */
    public static class DrawableDelegate implements InflateDelegate {
    }

    /* loaded from: classes.dex */
    public interface InflateDelegate {
    }

    @RestrictTo
    /* loaded from: classes.dex */
    public interface ResourceManagerHooks {
        ColorStateList a(int i2, Context context);

        LayerDrawable b(ResourceManagerInternal resourceManagerInternal, Context context, int i2);

        boolean c(Context context, int i2, Drawable drawable);

        PorterDuff.Mode d(int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class VdcInflateDelegate implements InflateDelegate {
    }

    public static synchronized ResourceManagerInternal b() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            try {
                if (f1170g == null) {
                    f1170g = new ResourceManagerInternal();
                }
                resourceManagerInternal = f1170g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return resourceManagerInternal;
    }

    public static synchronized PorterDuffColorFilter f(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ResourceManagerInternal.class) {
            ColorFilterLruCache colorFilterLruCache = f1171h;
            colorFilterLruCache.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = colorFilterLruCache.get(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                colorFilterLruCache.put(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray longSparseArray = (LongSparseArray) this.f1173b.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray((Object) null);
                    this.f1173b.put(context, longSparseArray);
                }
                longSparseArray.h(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable c(Context context, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f1173b.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.c(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.i(j2);
        }
        return null;
    }

    public final synchronized Drawable d(Context context, int i2) {
        return e(context, i2, false);
    }

    public final synchronized Drawable e(Context context, int i2, boolean z2) {
        Drawable c2;
        try {
            if (!this.d) {
                this.d = true;
                Drawable d = d(context, R.drawable.abc_vector_test);
                if (d == null || (!(d instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(d.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.f1174c == null) {
                this.f1174c = new TypedValue();
            }
            TypedValue typedValue = this.f1174c;
            context.getResources().getValue(i2, typedValue, true);
            long j2 = (typedValue.assetCookie << 32) | typedValue.data;
            c2 = c(context, j2);
            if (c2 == null) {
                ResourceManagerHooks resourceManagerHooks = this.e;
                c2 = resourceManagerHooks == null ? null : resourceManagerHooks.b(this, context, i2);
                if (c2 != null) {
                    c2.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j2, c2);
                }
            }
            if (c2 == null) {
                c2 = ContextCompat.getDrawable(context, i2);
            }
            if (c2 != null) {
                c2 = h(context, i2, z2, c2);
            }
            if (c2 != null) {
                DrawableUtils.a(c2);
            }
        } finally {
        }
        return c2;
    }

    public final synchronized ColorStateList g(int i2, Context context) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f1172a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) sparseArrayCompat.c(i2);
        if (colorStateList == null) {
            ResourceManagerHooks resourceManagerHooks = this.e;
            if (resourceManagerHooks != null) {
                colorStateList2 = resourceManagerHooks.a(i2, context);
            }
            if (colorStateList2 != null) {
                if (this.f1172a == null) {
                    this.f1172a = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.f1172a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat();
                    this.f1172a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList g2 = g(i2, context);
        if (g2 != null) {
            Drawable mutate = drawable.mutate();
            DrawableCompat.j(mutate, g2);
            ResourceManagerHooks resourceManagerHooks = this.e;
            PorterDuff.Mode d = resourceManagerHooks != null ? resourceManagerHooks.d(i2) : null;
            if (d == null) {
                return mutate;
            }
            DrawableCompat.k(mutate, d);
            return mutate;
        }
        ResourceManagerHooks resourceManagerHooks2 = this.e;
        if (resourceManagerHooks2 != null && resourceManagerHooks2.e(context, i2, drawable)) {
            return drawable;
        }
        ResourceManagerHooks resourceManagerHooks3 = this.e;
        if ((resourceManagerHooks3 == null || !resourceManagerHooks3.c(context, i2, drawable)) && z2) {
            return null;
        }
        return drawable;
    }
}
