package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: g, reason: collision with root package name */
    public static s2 f1020g;
    public WeakHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1022b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1023c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1024d;

    /* renamed from: e, reason: collision with root package name */
    public v f1025e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f1019f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final r2 f1021h = new r2();

    public static synchronized s2 c() {
        s2 s2Var;
        synchronized (s2.class) {
            if (f1020g == null) {
                f1020g = new s2();
            }
            s2Var = f1020g;
        }
        return s2Var;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (s2.class) {
            r2 r2Var = f1021h;
            r2Var.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r2Var.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                r2Var.getClass();
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j3, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            r.e eVar = (r.e) this.f1022b.get(context);
            if (eVar == null) {
                eVar = new r.e();
                this.f1022b.put(context, eVar);
            }
            eVar.f(j3, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.f1023c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f1023c = r0
        Lb:
            android.util.TypedValue r0 = r7.f1023c
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.d(r8, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            androidx.appcompat.widget.v r1 = r7.f1025e
            if (r1 != 0) goto L2b
            goto L73
        L2b:
            r1 = 2131230828(0x7f08006c, float:1.807772E38)
            if (r9 != r1) goto L4c
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131230827(0x7f08006b, float:1.8077718E38)
            android.graphics.drawable.Drawable r5 = r7.e(r8, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131230829(0x7f08006d, float:1.8077722E38)
            android.graphics.drawable.Drawable r5 = r7.e(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L74
        L4c:
            r1 = 2131230863(0x7f08008f, float:1.807779E38)
            if (r9 != r1) goto L59
            r9 = 2131166003(0x7f070333, float:1.794624E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.v.f(r7, r8, r9)
            goto L74
        L59:
            r1 = 2131230862(0x7f08008e, float:1.8077789E38)
            if (r9 != r1) goto L66
            r9 = 2131166004(0x7f070334, float:1.7946241E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.v.f(r7, r8, r9)
            goto L74
        L66:
            r1 = 2131230864(0x7f080090, float:1.8077793E38)
            if (r9 != r1) goto L73
            r9 = 2131166005(0x7f070335, float:1.7946243E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.v.f(r7, r8, r9)
            goto L74
        L73:
            r9 = 0
        L74:
            if (r9 == 0) goto L7e
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.a(r8, r3, r9)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s2.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, long j3) {
        r.e eVar = (r.e) this.f1022b.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.d(j3, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.g(j3);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i10) {
        return f(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        h0.a.i(r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002b, code lost:
    
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s2.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i10) {
        ColorStateList colorStateList;
        r.l lVar;
        try {
            WeakHashMap weakHashMap = this.a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (lVar = (r.l) weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) lVar.c(i10, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                v vVar = this.f1025e;
                if (vVar != null) {
                    colorStateList2 = vVar.g(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    r.l lVar2 = (r.l) this.a.get(context);
                    if (lVar2 == null) {
                        lVar2 = new r.l();
                        this.a.put(context, lVar2);
                    }
                    lVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.v r0 = r6.f1025e
            r1 = 0
            if (r0 == 0) goto L7b
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.w.f1066b
            java.lang.Object r3 = r0.a
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.v.b(r8, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968956(0x7f04017c, float:1.754658E38)
            goto L4e
        L17:
            java.lang.Object r3 = r0.f1058c
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.v.b(r8, r3)
            if (r3 == 0) goto L25
            r8 = 2130968954(0x7f04017a, float:1.7546576E38)
            goto L4e
        L25:
            java.lang.Object r0 = r0.f1059d
            int[] r0 = (int[]) r0
            boolean r0 = androidx.appcompat.widget.v.b(r8, r0)
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L4b
        L32:
            r0 = 2131230849(0x7f080081, float:1.8077762E38)
            if (r8 != r0) goto L46
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L56
        L46:
            r0 = 2131230831(0x7f08006f, float:1.8077726E38)
            if (r8 != r0) goto L51
        L4b:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4e:
            r0 = r8
            r8 = r4
            goto L53
        L51:
            r8 = r1
            r0 = r8
        L53:
            r3 = r2
            r2 = r0
            r0 = r5
        L56:
            if (r8 == 0) goto L77
            int[] r8 = androidx.appcompat.widget.s1.a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.p3.c(r7, r2)
            java.lang.Class<androidx.appcompat.widget.w> r9 = androidx.appcompat.widget.w.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r7 = g(r7, r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r9)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L72
            r8.setAlpha(r0)
        L72:
            r7 = r4
            goto L78
        L74:
            r7 = move-exception
            monitor-exit(r9)
            throw r7
        L77:
            r7 = r1
        L78:
            if (r7 == 0) goto L7b
            r1 = r4
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s2.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
