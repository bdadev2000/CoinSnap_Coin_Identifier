package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f543n = 0;

    /* renamed from: a, reason: collision with root package name */
    public DrawableContainerState f544a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f545b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f546c;
    public Drawable d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f548g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f550i;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f551j;

    /* renamed from: k, reason: collision with root package name */
    public long f552k;

    /* renamed from: l, reason: collision with root package name */
    public long f553l;

    /* renamed from: m, reason: collision with root package name */
    public BlockInvalidateCallback f554m;

    /* renamed from: f, reason: collision with root package name */
    public int f547f = 255;

    /* renamed from: h, reason: collision with root package name */
    public int f549h = -1;

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api21Impl {
    }

    /* loaded from: classes.dex */
    public static class BlockInvalidateCallback implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        public Drawable.Callback f556a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f556a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f556a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class DrawableContainerState extends Drawable.ConstantState {
        public final int A;
        public boolean B;
        public ColorFilter C;
        public boolean D;
        public ColorStateList E;
        public PorterDuff.Mode F;
        public boolean G;
        public boolean H;

        /* renamed from: a, reason: collision with root package name */
        public final DrawableContainerCompat f557a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f558b;

        /* renamed from: c, reason: collision with root package name */
        public int f559c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f560f;

        /* renamed from: g, reason: collision with root package name */
        public final Drawable[] f561g;

        /* renamed from: h, reason: collision with root package name */
        public final int f562h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f563i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f564j;

        /* renamed from: k, reason: collision with root package name */
        public Rect f565k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f566l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f567m;

        /* renamed from: n, reason: collision with root package name */
        public int f568n;

        /* renamed from: o, reason: collision with root package name */
        public int f569o;

        /* renamed from: p, reason: collision with root package name */
        public int f570p;

        /* renamed from: q, reason: collision with root package name */
        public int f571q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f572r;

        /* renamed from: s, reason: collision with root package name */
        public int f573s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f574t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f575u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f576v;
        public boolean w;
        public boolean x;

        /* renamed from: y, reason: collision with root package name */
        public int f577y;

        /* renamed from: z, reason: collision with root package name */
        public final int f578z;

        public DrawableContainerState(DrawableContainerState drawableContainerState, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            this.f563i = false;
            this.f566l = false;
            this.x = true;
            this.f578z = 0;
            this.A = 0;
            this.f557a = drawableContainerCompat;
            this.f558b = resources != null ? resources : drawableContainerState != null ? drawableContainerState.f558b : null;
            int i2 = drawableContainerState != null ? drawableContainerState.f559c : 0;
            int i3 = DrawableContainerCompat.f543n;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? Opcodes.IF_ICMPNE : i2;
            this.f559c = i2;
            if (drawableContainerState == null) {
                this.f561g = new Drawable[10];
                this.f562h = 0;
                return;
            }
            this.d = drawableContainerState.d;
            this.e = drawableContainerState.e;
            this.f576v = true;
            this.w = true;
            this.f563i = drawableContainerState.f563i;
            this.f566l = drawableContainerState.f566l;
            this.x = drawableContainerState.x;
            this.f577y = drawableContainerState.f577y;
            this.f578z = drawableContainerState.f578z;
            this.A = drawableContainerState.A;
            this.B = drawableContainerState.B;
            this.C = drawableContainerState.C;
            this.D = drawableContainerState.D;
            this.E = drawableContainerState.E;
            this.F = drawableContainerState.F;
            this.G = drawableContainerState.G;
            this.H = drawableContainerState.H;
            if (drawableContainerState.f559c == i2) {
                if (drawableContainerState.f564j) {
                    this.f565k = drawableContainerState.f565k != null ? new Rect(drawableContainerState.f565k) : null;
                    this.f564j = true;
                }
                if (drawableContainerState.f567m) {
                    this.f568n = drawableContainerState.f568n;
                    this.f569o = drawableContainerState.f569o;
                    this.f570p = drawableContainerState.f570p;
                    this.f571q = drawableContainerState.f571q;
                    this.f567m = true;
                }
            }
            if (drawableContainerState.f572r) {
                this.f573s = drawableContainerState.f573s;
                this.f572r = true;
            }
            if (drawableContainerState.f574t) {
                this.f575u = drawableContainerState.f575u;
                this.f574t = true;
            }
            Drawable[] drawableArr = drawableContainerState.f561g;
            this.f561g = new Drawable[drawableArr.length];
            this.f562h = drawableContainerState.f562h;
            SparseArray sparseArray = drawableContainerState.f560f;
            if (sparseArray != null) {
                this.f560f = sparseArray.clone();
            } else {
                this.f560f = new SparseArray(this.f562h);
            }
            int i4 = this.f562h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f560f.put(i5, constantState);
                    } else {
                        this.f561g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        public final void a() {
            this.f567m = true;
            b();
            int i2 = this.f562h;
            Drawable[] drawableArr = this.f561g;
            this.f569o = -1;
            this.f568n = -1;
            this.f571q = 0;
            this.f570p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f568n) {
                    this.f568n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f569o) {
                    this.f569o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f570p) {
                    this.f570p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f571q) {
                    this.f571q = minimumHeight;
                }
            }
        }

        public final void b() {
            SparseArray sparseArray = this.f560f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f560f.keyAt(i2);
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f560f.valueAt(i2);
                    Drawable[] drawableArr = this.f561g;
                    Drawable newDrawable = constantState.newDrawable(this.f558b);
                    DrawableCompat.h(newDrawable, this.f577y);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f557a);
                    drawableArr[keyAt] = mutate;
                }
                this.f560f = null;
            }
        }

        public final Drawable c(int i2) {
            int indexOfKey;
            Drawable drawable = this.f561g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f560f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = ((Drawable.ConstantState) this.f560f.valueAt(indexOfKey)).newDrawable(this.f558b);
            DrawableCompat.h(newDrawable, this.f577y);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f557a);
            this.f561g[i2] = mutate;
            this.f560f.removeAt(indexOfKey);
            if (this.f560f.size() == 0) {
                this.f560f = null;
            }
            return mutate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i2 = this.f562h;
            Drawable[] drawableArr = this.f561g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f560f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (DrawableCompat.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            int i2 = this.f562h;
            Drawable[] drawableArr = this.f561g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.d | this.e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f548g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f546c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f552k
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f547f
            r3.setAlpha(r9)
            r13.f552k = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r10 = r13.f544a
            int r10 = r10.f578z
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f547f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f552k = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.d
            if (r9 == 0) goto L61
            long r10 = r13.f553l
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.d = r0
            r13.f553l = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r4 = r13.f544a
            int r4 = r4.A
            int r3 = r3 / r4
            int r4 = r13.f547f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f553l = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f551j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        DrawableContainerState drawableContainerState = this.f544a;
        if (theme == null) {
            drawableContainerState.getClass();
            return;
        }
        drawableContainerState.b();
        int i2 = drawableContainerState.f562h;
        Drawable[] drawableArr = drawableContainerState.f561g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && DrawableCompat.b(drawable)) {
                DrawableCompat.a(drawableArr[i3], theme);
                drawableContainerState.e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            drawableContainerState.f558b = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = Opcodes.IF_ICMPNE;
            }
            int i5 = drawableContainerState.f559c;
            drawableContainerState.f559c = i4;
            if (i5 != i4) {
                drawableContainerState.f567m = false;
                drawableContainerState.f564j = false;
            }
        }
    }

    public DrawableContainerState b() {
        return this.f544a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback, java.lang.Object] */
    public final void c(Drawable drawable) {
        if (this.f554m == null) {
            this.f554m = new Object();
        }
        BlockInvalidateCallback blockInvalidateCallback = this.f554m;
        blockInvalidateCallback.f556a = drawable.getCallback();
        drawable.setCallback(blockInvalidateCallback);
        try {
            if (this.f544a.f578z <= 0 && this.f548g) {
                drawable.setAlpha(this.f547f);
            }
            DrawableContainerState drawableContainerState = this.f544a;
            if (drawableContainerState.D) {
                drawable.setColorFilter(drawableContainerState.C);
            } else {
                if (drawableContainerState.G) {
                    DrawableCompat.j(drawable, drawableContainerState.E);
                }
                DrawableContainerState drawableContainerState2 = this.f544a;
                if (drawableContainerState2.H) {
                    DrawableCompat.k(drawable, drawableContainerState2.F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f544a.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            DrawableCompat.h(drawable, DrawableCompat.d(this));
            drawable.setAutoMirrored(this.f544a.B);
            Rect rect = this.f545b;
            if (rect != null) {
                DrawableCompat.g(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            BlockInvalidateCallback blockInvalidateCallback2 = this.f554m;
            Drawable.Callback callback = blockInvalidateCallback2.f556a;
            blockInvalidateCallback2.f556a = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            BlockInvalidateCallback blockInvalidateCallback3 = this.f554m;
            Drawable.Callback callback2 = blockInvalidateCallback3.f556a;
            blockInvalidateCallback3.f556a = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f544a.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f549h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.f544a
            int r0 = r0.A
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f546c
            if (r0 == 0) goto L29
            r9.d = r0
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.f544a
            int r0 = r0.A
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f553l = r0
            goto L35
        L29:
            r9.d = r4
            r9.f553l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f546c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.f544a
            int r1 = r0.f562h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.c(r10)
            r9.f546c = r0
            r9.f549h = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r10 = r9.f544a
            int r10 = r10.f578z
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f552k = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f546c = r4
            r10 = -1
            r9.f549h = r10
        L5a:
            long r0 = r9.f552k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f553l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7c
        L67:
            java.lang.Runnable r10 = r9.f551j
            if (r10 != 0) goto L76
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$1 r10 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$1
            r1 = r9
            androidx.appcompat.graphics.drawable.StateListDrawableCompat r1 = (androidx.appcompat.graphics.drawable.StateListDrawableCompat) r1
            r10.<init>()
            r9.f551j = r10
            goto L79
        L76:
            r9.unscheduleSelf(r10)
        L79:
            r9.a(r0)
        L7c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f546c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(DrawableContainerState drawableContainerState) {
        this.f544a = drawableContainerState;
        int i2 = this.f549h;
        if (i2 >= 0) {
            Drawable c2 = drawableContainerState.c(i2);
            this.f546c = c2;
            if (c2 != null) {
                c(c2);
            }
        }
        this.d = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f547f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f544a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        DrawableContainerState drawableContainerState = this.f544a;
        if (!drawableContainerState.f576v) {
            drawableContainerState.b();
            drawableContainerState.f576v = true;
            int i2 = drawableContainerState.f562h;
            Drawable[] drawableArr = drawableContainerState.f561g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    drawableContainerState.w = false;
                    return null;
                }
            }
            drawableContainerState.w = true;
        } else if (!drawableContainerState.w) {
            return null;
        }
        this.f544a.d = getChangingConfigurations();
        return this.f544a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f546c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f545b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.f566l) {
            if (!drawableContainerState.f567m) {
                drawableContainerState.a();
            }
            return drawableContainerState.f569o;
        }
        Drawable drawable = this.f546c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.f566l) {
            if (!drawableContainerState.f567m) {
                drawableContainerState.a();
            }
            return drawableContainerState.f568n;
        }
        Drawable drawable = this.f546c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.f566l) {
            if (!drawableContainerState.f567m) {
                drawableContainerState.a();
            }
            return drawableContainerState.f571q;
        }
        Drawable drawable = this.f546c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.f566l) {
            if (!drawableContainerState.f567m) {
                drawableContainerState.a();
            }
            return drawableContainerState.f570p;
        }
        Drawable drawable = this.f546c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f546c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.f572r) {
            return drawableContainerState.f573s;
        }
        drawableContainerState.b();
        int i2 = drawableContainerState.f562h;
        Drawable[] drawableArr = drawableContainerState.f561g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        drawableContainerState.f573s = opacity;
        drawableContainerState.f572r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f546c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        DrawableContainerState drawableContainerState = this.f544a;
        boolean z2 = false;
        Rect rect2 = null;
        if (!drawableContainerState.f563i) {
            Rect rect3 = drawableContainerState.f565k;
            if (rect3 != null || drawableContainerState.f564j) {
                rect2 = rect3;
            } else {
                drawableContainerState.b();
                Rect rect4 = new Rect();
                int i2 = drawableContainerState.f562h;
                Drawable[] drawableArr = drawableContainerState.f561g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                drawableContainerState.f564j = true;
                drawableContainerState.f565k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z2 = true;
            }
        } else {
            Drawable drawable = this.f546c;
            z2 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (isAutoMirrored() && DrawableCompat.d(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState != null) {
            drawableContainerState.f572r = false;
            drawableContainerState.f574t = false;
        }
        if (drawable != this.f546c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f544a.B;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.f574t) {
            return drawableContainerState.f575u;
        }
        drawableContainerState.b();
        int i2 = drawableContainerState.f562h;
        Drawable[] drawableArr = drawableContainerState.f561g;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (drawableArr[i3].isStateful()) {
                z2 = true;
                break;
            }
            i3++;
        }
        drawableContainerState.f575u = z2;
        drawableContainerState.f574t = true;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f546c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f548g) {
                this.f546c.setAlpha(this.f547f);
            }
        }
        if (this.f553l != 0) {
            this.f553l = 0L;
        } else {
            z3 = z2;
        }
        if (this.f552k != 0) {
            this.f552k = 0L;
        } else if (!z3) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f550i && super.mutate() == this) {
            DrawableContainerState b2 = b();
            b2.d();
            e(b2);
            this.f550i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f546c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        DrawableContainerState drawableContainerState = this.f544a;
        int i3 = this.f549h;
        int i4 = drawableContainerState.f562h;
        Drawable[] drawableArr = drawableContainerState.f561g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                boolean h2 = DrawableCompat.h(drawable, i2);
                if (i5 == i3) {
                    z2 = h2;
                }
            }
        }
        drawableContainerState.f577y = i2;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f546c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f546c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f546c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f548g && this.f547f == i2) {
            return;
        }
        this.f548g = true;
        this.f547f = i2;
        Drawable drawable = this.f546c;
        if (drawable != null) {
            if (this.f552k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.B != z2) {
            drawableContainerState.B = z2;
            Drawable drawable = this.f546c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.f544a;
        drawableContainerState.D = true;
        if (drawableContainerState.C != colorFilter) {
            drawableContainerState.C = colorFilter;
            Drawable drawable = this.f546c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        DrawableContainerState drawableContainerState = this.f544a;
        if (drawableContainerState.x != z2) {
            drawableContainerState.x = z2;
            Drawable drawable = this.f546c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f546c;
        if (drawable != null) {
            DrawableCompat.f(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f545b;
        if (rect == null) {
            this.f545b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f546c;
        if (drawable != null) {
            DrawableCompat.g(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.f544a;
        drawableContainerState.G = true;
        if (drawableContainerState.E != colorStateList) {
            drawableContainerState.E = colorStateList;
            DrawableCompat.j(this.f546c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.f544a;
        drawableContainerState.H = true;
        if (drawableContainerState.F != mode) {
            drawableContainerState.F = mode;
            DrawableCompat.k(this.f546c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f546c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f546c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
