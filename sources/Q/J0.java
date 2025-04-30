package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: g, reason: collision with root package name */
    public static J0 f22554g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f22556a;
    public final WeakHashMap b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f22557c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22558d;

    /* renamed from: e, reason: collision with root package name */
    public U4.p f22559e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f22553f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final I0 f22555h = new x.g(6);

    public static synchronized J0 c() {
        J0 j02;
        synchronized (J0.class) {
            try {
                if (f22554g == null) {
                    f22554g = new J0();
                }
                j02 = f22554g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    public static synchronized PorterDuffColorFilter g(int i9, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (J0.class) {
            I0 i02 = f22555h;
            i02.getClass();
            int i10 = (31 + i9) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) i02.get(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i9, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                x.f fVar = (x.f) this.b.get(context);
                if (fVar == null) {
                    fVar = new x.f();
                    this.b.put(context, fVar);
                }
                fVar.f(j7, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i9) {
        if (this.f22557c == null) {
            this.f22557c = new TypedValue();
        }
        TypedValue typedValue = this.f22557c;
        context.getResources().getValue(i9, typedValue, true);
        long j7 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d2 = d(context, j7);
        if (d2 != null) {
            return d2;
        }
        LayerDrawable layerDrawable = null;
        if (this.f22559e != null) {
            if (i9 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, 2131230845)});
            } else if (i9 == R.drawable.abc_ratingbar_material) {
                layerDrawable = U4.p.o(this, context, R.dimen.abc_star_big);
            } else if (i9 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = U4.p.o(this, context, R.dimen.abc_star_medium);
            } else if (i9 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = U4.p.o(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j7, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j7) {
        x.f fVar = (x.f) this.b.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.d(null, j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.g(j7);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i9) {
        return f(context, i9, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        M.a.i(r0, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f22558d     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r8.f22558d = r0     // Catch: java.lang.Throwable -> L31
            r0 = 2131230906(0x7f0800ba, float:1.8077878E38)
            android.graphics.drawable.Drawable r0 = r8.e(r9, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ldb
            boolean r1 = r0 instanceof N0.p     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ldb
        L26:
            android.graphics.drawable.Drawable r0 = r8.b(r9, r10)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L34
            android.graphics.drawable.Drawable r0 = I.h.getDrawable(r9, r10)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Le6
        L34:
            if (r0 == 0) goto Ld4
            android.content.res.ColorStateList r1 = r8.h(r9, r10)     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 == 0) goto L57
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch: java.lang.Throwable -> L31
            M.a.h(r0, r1)     // Catch: java.lang.Throwable -> L31
            U4.p r9 = r8.f22559e     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto L49
            goto L50
        L49:
            r9 = 2131230893(0x7f0800ad, float:1.8077852E38)
            if (r10 != r9) goto L50
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> L31
        L50:
            if (r2 == 0) goto Ld4
            M.a.i(r0, r2)     // Catch: java.lang.Throwable -> L31
            goto Ld4
        L57:
            U4.p r1 = r8.f22559e     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto Lcb
            r1 = 2131230888(0x7f0800a8, float:1.8077841E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6 = 2130968888(0x7f040138, float:1.7546442E38)
            r7 = 2130968890(0x7f04013a, float:1.7546446E38)
            if (r10 != r1) goto L95
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> L31
            int r1 = q.O0.c(r9, r7)     // Catch: java.lang.Throwable -> L31
            android.graphics.PorterDuff$Mode r2 = q.C2624t.b     // Catch: java.lang.Throwable -> L31
            U4.p.t(r11, r1)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = q.O0.c(r9, r7)     // Catch: java.lang.Throwable -> L31
            U4.p.t(r11, r1)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L31
            int r9 = q.O0.c(r9, r6)     // Catch: java.lang.Throwable -> L31
            U4.p.t(r10, r9)     // Catch: java.lang.Throwable -> L31
            goto Ld4
        L95:
            r1 = 2131230879(0x7f08009f, float:1.8077823E38)
            if (r10 == r1) goto La4
            r1 = 2131230878(0x7f08009e, float:1.8077821E38)
            if (r10 == r1) goto La4
            r1 = 2131230880(0x7f0800a0, float:1.8077825E38)
            if (r10 != r1) goto Lcb
        La4:
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> L31
            int r1 = q.O0.b(r9, r7)     // Catch: java.lang.Throwable -> L31
            android.graphics.PorterDuff$Mode r2 = q.C2624t.b     // Catch: java.lang.Throwable -> L31
            U4.p.t(r11, r1)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = q.O0.c(r9, r6)     // Catch: java.lang.Throwable -> L31
            U4.p.t(r11, r1)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L31
            int r9 = q.O0.c(r9, r6)     // Catch: java.lang.Throwable -> L31
            U4.p.t(r10, r9)     // Catch: java.lang.Throwable -> L31
            goto Ld4
        Lcb:
            boolean r9 = r8.i(r9, r10, r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto Ld4
            if (r11 == 0) goto Ld4
            r0 = r2
        Ld4:
            if (r0 == 0) goto Ld9
            q.AbstractC2610l0.a(r0)     // Catch: java.lang.Throwable -> L31
        Ld9:
            monitor-exit(r8)
            return r0
        Ldb:
            r9 = 0
            r8.f22558d = r9     // Catch: java.lang.Throwable -> L31
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L31
        Le6:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q.J0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i9) {
        ColorStateList colorStateList;
        x.m mVar;
        WeakHashMap weakHashMap = this.f22556a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (mVar = (x.m) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) mVar.c(i9, null);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            U4.p pVar = this.f22559e;
            if (pVar != null) {
                colorStateList2 = pVar.q(context, i9);
            }
            if (colorStateList2 != null) {
                if (this.f22556a == null) {
                    this.f22556a = new WeakHashMap();
                }
                x.m mVar2 = (x.m) this.f22556a.get(context);
                if (mVar2 == null) {
                    mVar2 = new x.m();
                    this.f22556a.put(context, mVar2);
                }
                mVar2.a(i9, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            U4.p r0 = r7.f22559e
            r1 = 0
            if (r0 == 0) goto L74
            android.graphics.PorterDuff$Mode r2 = q.C2624t.b
            java.lang.Object r3 = r0.f3317a
            int[] r3 = (int[]) r3
            boolean r3 = U4.p.j(r9, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130968890(0x7f04013a, float:1.7546446E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L55
        L19:
            java.lang.Object r3 = r0.f3318c
            int[] r3 = (int[]) r3
            boolean r3 = U4.p.j(r9, r3)
            if (r3 == 0) goto L27
            r9 = 2130968888(0x7f040138, float:1.7546442E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.f3319d
            int[] r0 = (int[]) r0
            boolean r0 = U4.p.j(r9, r0)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r9 = r3
            goto L16
        L38:
            r0 = 2131230865(0x7f080091, float:1.8077795E38)
            if (r9 != r0) goto L4c
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L55
        L4c:
            r0 = 2131230847(0x7f08007f, float:1.8077758E38)
            if (r9 != r0) goto L52
            goto L36
        L52:
            r9 = r1
            r3 = r9
            goto L17
        L55:
            if (r3 == 0) goto L74
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = q.O0.c(r8, r9)
            java.lang.Class<q.t> r9 = q.C2624t.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = g(r8, r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L6f
            r10.setAlpha(r0)
        L6f:
            r1 = r4
            goto L74
        L71:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.J0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
