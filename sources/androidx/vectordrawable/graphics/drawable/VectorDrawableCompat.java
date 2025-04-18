package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f21667k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public VectorDrawableCompatState f21668b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f21669c;
    public ColorFilter d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21670f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21671g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f21672h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f21673i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f21674j;

    /* loaded from: classes.dex */
    public static class VClipPath extends VPath {
    }

    /* loaded from: classes.dex */
    public static class VFullPath extends VPath {
        public ComplexColorCompat e;

        /* renamed from: f, reason: collision with root package name */
        public float f21675f;

        /* renamed from: g, reason: collision with root package name */
        public ComplexColorCompat f21676g;

        /* renamed from: h, reason: collision with root package name */
        public float f21677h;

        /* renamed from: i, reason: collision with root package name */
        public float f21678i;

        /* renamed from: j, reason: collision with root package name */
        public float f21679j;

        /* renamed from: k, reason: collision with root package name */
        public float f21680k;

        /* renamed from: l, reason: collision with root package name */
        public float f21681l;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Cap f21682m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Join f21683n;

        /* renamed from: o, reason: collision with root package name */
        public float f21684o;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            return this.f21676g.b() || this.e.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r6.f21676g
                boolean r1 = r0.b()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f18491b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f18492c
                if (r1 == r4) goto L1c
                r0.f18492c = r1
                r0 = r3
                goto L1d
            L1c:
                r0 = r2
            L1d:
                androidx.core.content.res.ComplexColorCompat r1 = r6.e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f18491b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f18492c
                if (r7 == r4) goto L36
                r1.f18492c = r7
                r2 = r3
            L36:
                r7 = r0 | r2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f21678i;
        }

        @ColorInt
        public int getFillColor() {
            return this.f21676g.f18492c;
        }

        public float getStrokeAlpha() {
            return this.f21677h;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.e.f18492c;
        }

        public float getStrokeWidth() {
            return this.f21675f;
        }

        public float getTrimPathEnd() {
            return this.f21680k;
        }

        public float getTrimPathOffset() {
            return this.f21681l;
        }

        public float getTrimPathStart() {
            return this.f21679j;
        }

        public void setFillAlpha(float f2) {
            this.f21678i = f2;
        }

        public void setFillColor(int i2) {
            this.f21676g.f18492c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f21677h = f2;
        }

        public void setStrokeColor(int i2) {
            this.e.f18492c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f21675f = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f21680k = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f21681l = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f21679j = f2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class VObject {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class VPath extends VObject {

        /* renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f21695a;

        /* renamed from: b, reason: collision with root package name */
        public String f21696b;

        /* renamed from: c, reason: collision with root package name */
        public int f21697c;
        public final int d;

        public VPath() {
            this.f21695a = null;
            this.f21697c = 0;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f21695a;
        }

        public String getPathName() {
            return this.f21696b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.a(this.f21695a, pathDataNodeArr)) {
                this.f21695a = PathParser.e(pathDataNodeArr);
                return;
            }
            PathParser.PathDataNode[] pathDataNodeArr2 = this.f21695a;
            for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                pathDataNodeArr2[i2].f18537a = pathDataNodeArr[i2].f18537a;
                int i3 = 0;
                while (true) {
                    float[] fArr = pathDataNodeArr[i2].f18538b;
                    if (i3 < fArr.length) {
                        pathDataNodeArr2[i2].f18538b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
        }

        public VPath(VPath vPath) {
            this.f21695a = null;
            this.f21697c = 0;
            this.f21696b = vPath.f21696b;
            this.d = vPath.d;
            this.f21695a = PathParser.e(vPath.f21695a);
        }
    }

    /* loaded from: classes.dex */
    public static class VectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f21712a;

        /* renamed from: b, reason: collision with root package name */
        public VPathRenderer f21713b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f21714c;
        public PorterDuff.Mode d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f21715f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f21716g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f21717h;

        /* renamed from: i, reason: collision with root package name */
        public int f21718i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f21719j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f21720k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f21721l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21712a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState] */
    public VectorDrawableCompat() {
        this.f21671g = true;
        this.f21672h = new float[9];
        this.f21673i = new Matrix();
        this.f21674j = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f21714c = null;
        constantState.d = f21667k;
        constantState.f21713b = new VPathRenderer();
        this.f21668b = constantState;
    }

    public static VectorDrawableCompat a(Resources resources, int i2, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.f21666a = ResourcesCompat.b(resources, i2, theme);
        new VectorDrawableDelegateState(vectorDrawableCompat.f21666a.getConstantState());
        return vectorDrawableCompat;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f21666a;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f21674j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.f21669c;
        }
        Matrix matrix = this.f21673i;
        canvas.getMatrix(matrix);
        float[] fArr = this.f21672h;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(Opcodes.ACC_STRICT, width);
        int min2 = Math.min(Opcodes.ACC_STRICT, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && DrawableCompat.d(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
        Bitmap bitmap = vectorDrawableCompatState.f21715f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != vectorDrawableCompatState.f21715f.getHeight()) {
            vectorDrawableCompatState.f21715f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            vectorDrawableCompatState.f21720k = true;
        }
        if (this.f21671g) {
            VectorDrawableCompatState vectorDrawableCompatState2 = this.f21668b;
            if (vectorDrawableCompatState2.f21720k || vectorDrawableCompatState2.f21716g != vectorDrawableCompatState2.f21714c || vectorDrawableCompatState2.f21717h != vectorDrawableCompatState2.d || vectorDrawableCompatState2.f21719j != vectorDrawableCompatState2.e || vectorDrawableCompatState2.f21718i != vectorDrawableCompatState2.f21713b.getRootAlpha()) {
                VectorDrawableCompatState vectorDrawableCompatState3 = this.f21668b;
                vectorDrawableCompatState3.f21715f.eraseColor(0);
                Canvas canvas2 = new Canvas(vectorDrawableCompatState3.f21715f);
                VPathRenderer vPathRenderer = vectorDrawableCompatState3.f21713b;
                vPathRenderer.a(vPathRenderer.f21703g, VPathRenderer.f21698p, canvas2, min, min2);
                VectorDrawableCompatState vectorDrawableCompatState4 = this.f21668b;
                vectorDrawableCompatState4.f21716g = vectorDrawableCompatState4.f21714c;
                vectorDrawableCompatState4.f21717h = vectorDrawableCompatState4.d;
                vectorDrawableCompatState4.f21718i = vectorDrawableCompatState4.f21713b.getRootAlpha();
                vectorDrawableCompatState4.f21719j = vectorDrawableCompatState4.e;
                vectorDrawableCompatState4.f21720k = false;
            }
        } else {
            VectorDrawableCompatState vectorDrawableCompatState5 = this.f21668b;
            vectorDrawableCompatState5.f21715f.eraseColor(0);
            Canvas canvas3 = new Canvas(vectorDrawableCompatState5.f21715f);
            VPathRenderer vPathRenderer2 = vectorDrawableCompatState5.f21713b;
            vPathRenderer2.a(vPathRenderer2.f21703g, VPathRenderer.f21698p, canvas3, min, min2);
        }
        VectorDrawableCompatState vectorDrawableCompatState6 = this.f21668b;
        if (vectorDrawableCompatState6.f21713b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (vectorDrawableCompatState6.f21721l == null) {
                Paint paint2 = new Paint();
                vectorDrawableCompatState6.f21721l = paint2;
                paint2.setFilterBitmap(true);
            }
            vectorDrawableCompatState6.f21721l.setAlpha(vectorDrawableCompatState6.f21713b.getRootAlpha());
            vectorDrawableCompatState6.f21721l.setColorFilter(colorFilter);
            paint = vectorDrawableCompatState6.f21721l;
        }
        canvas.drawBitmap(vectorDrawableCompatState6.f21715f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getAlpha() : this.f21668b.f21713b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f21668b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f21666a;
        return drawable != null ? DrawableCompat.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f21666a != null) {
            return new VectorDrawableDelegateState(this.f21666a.getConstantState());
        }
        this.f21668b.f21712a = getChangingConfigurations();
        return this.f21668b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f21668b.f21713b.f21705i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f21668b.f21713b.f21704h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.isAutoMirrored() : this.f21668b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
            if (vectorDrawableCompatState != null) {
                VPathRenderer vPathRenderer = vectorDrawableCompatState.f21713b;
                if (vPathRenderer.f21710n == null) {
                    vPathRenderer.f21710n = Boolean.valueOf(vPathRenderer.f21703g.a());
                }
                if (vPathRenderer.f21710n.booleanValue() || ((colorStateList = this.f21668b.f21714c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f21670f && super.mutate() == this) {
            VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f21714c = null;
            constantState.d = f21667k;
            if (vectorDrawableCompatState != null) {
                constantState.f21712a = vectorDrawableCompatState.f21712a;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.f21713b);
                constantState.f21713b = vPathRenderer;
                if (vectorDrawableCompatState.f21713b.e != null) {
                    vPathRenderer.e = new Paint(vectorDrawableCompatState.f21713b.e);
                }
                if (vectorDrawableCompatState.f21713b.d != null) {
                    constantState.f21713b.d = new Paint(vectorDrawableCompatState.f21713b.d);
                }
                constantState.f21714c = vectorDrawableCompatState.f21714c;
                constantState.d = vectorDrawableCompatState.d;
                constantState.e = vectorDrawableCompatState.e;
            }
            this.f21668b = constantState;
            this.f21670f = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
        ColorStateList colorStateList = vectorDrawableCompatState.f21714c;
        if (colorStateList == null || (mode = vectorDrawableCompatState.d) == null) {
            z2 = false;
        } else {
            this.f21669c = b(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        VPathRenderer vPathRenderer = vectorDrawableCompatState.f21713b;
        if (vPathRenderer.f21710n == null) {
            vPathRenderer.f21710n = Boolean.valueOf(vPathRenderer.f21703g.a());
        }
        if (vPathRenderer.f21710n.booleanValue()) {
            boolean b2 = vectorDrawableCompatState.f21713b.f21703g.b(iArr);
            vectorDrawableCompatState.f21720k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f21668b.f21713b.getRootAlpha() != i2) {
            this.f21668b.f21713b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f21668b.e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.i(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.j(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
        if (vectorDrawableCompatState.f21714c != colorStateList) {
            vectorDrawableCompatState.f21714c = colorStateList;
            this.f21669c = b(colorStateList, vectorDrawableCompatState.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.k(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
        if (vectorDrawableCompatState.d != mode) {
            vectorDrawableCompatState.d = mode;
            this.f21669c = b(vectorDrawableCompatState.f21714c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class VectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f21722a;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f21722a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f21722a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21722a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f21666a = (VectorDrawable) this.f21722a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f21666a = (VectorDrawable) this.f21722a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f21666a = (VectorDrawable) this.f21722a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z2;
        VPathRenderer vPathRenderer;
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f21668b;
        vectorDrawableCompatState.f21713b = new VPathRenderer();
        TypedArray d = TypedArrayUtils.d(resources, theme, attributeSet, AndroidResources.f21650a);
        VectorDrawableCompatState vectorDrawableCompatState2 = this.f21668b;
        VPathRenderer vPathRenderer2 = vectorDrawableCompatState2.f21713b;
        int i6 = !TypedArrayUtils.c(xmlPullParser, "tintMode") ? -1 : d.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i7 = 3;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        vectorDrawableCompatState2.d = mode;
        ColorStateList a2 = TypedArrayUtils.a(d, xmlPullParser, theme);
        if (a2 != null) {
            vectorDrawableCompatState2.f21714c = a2;
        }
        boolean z3 = vectorDrawableCompatState2.e;
        if (TypedArrayUtils.c(xmlPullParser, "autoMirrored")) {
            z3 = d.getBoolean(5, z3);
        }
        vectorDrawableCompatState2.e = z3;
        float f2 = vPathRenderer2.f21706j;
        if (TypedArrayUtils.c(xmlPullParser, "viewportWidth")) {
            f2 = d.getFloat(7, f2);
        }
        vPathRenderer2.f21706j = f2;
        float f3 = vPathRenderer2.f21707k;
        if (TypedArrayUtils.c(xmlPullParser, "viewportHeight")) {
            f3 = d.getFloat(8, f3);
        }
        vPathRenderer2.f21707k = f3;
        if (vPathRenderer2.f21706j <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            vPathRenderer2.f21704h = d.getDimension(3, vPathRenderer2.f21704h);
            int i8 = 2;
            float dimension = d.getDimension(2, vPathRenderer2.f21705i);
            vPathRenderer2.f21705i = dimension;
            if (vPathRenderer2.f21704h <= 0.0f) {
                throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = vPathRenderer2.getAlpha();
                if (TypedArrayUtils.c(xmlPullParser, "alpha")) {
                    alpha = d.getFloat(4, alpha);
                }
                vPathRenderer2.setAlpha(alpha);
                boolean z4 = false;
                String string = d.getString(0);
                if (string != null) {
                    vPathRenderer2.f21709m = string;
                    vPathRenderer2.f21711o.put(string, vPathRenderer2);
                }
                d.recycle();
                vectorDrawableCompatState.f21712a = getChangingConfigurations();
                int i9 = 1;
                vectorDrawableCompatState.f21720k = true;
                VectorDrawableCompatState vectorDrawableCompatState3 = this.f21668b;
                VPathRenderer vPathRenderer3 = vectorDrawableCompatState3.f21713b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(vPathRenderer3.f21703g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i7)) {
                    if (eventType == i8) {
                        String name = xmlPullParser.getName();
                        VGroup vGroup = (VGroup) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i3 = depth;
                        ArrayMap arrayMap = vPathRenderer3.f21711o;
                        if (equals) {
                            ?? vPath = new VPath();
                            vPath.f21675f = 0.0f;
                            vPath.f21677h = 1.0f;
                            vPath.f21678i = 1.0f;
                            vPath.f21679j = 0.0f;
                            vPath.f21680k = 1.0f;
                            vPath.f21681l = 0.0f;
                            Paint.Cap cap = Paint.Cap.BUTT;
                            vPath.f21682m = cap;
                            Paint.Join join = Paint.Join.MITER;
                            vPath.f21683n = join;
                            vPath.f21684o = 4.0f;
                            TypedArray d2 = TypedArrayUtils.d(resources, theme, attributeSet, AndroidResources.f21652c);
                            if (TypedArrayUtils.c(xmlPullParser, "pathData")) {
                                vPathRenderer = vPathRenderer3;
                                String string2 = d2.getString(0);
                                if (string2 != null) {
                                    vPath.f21696b = string2;
                                }
                                String string3 = d2.getString(2);
                                if (string3 != null) {
                                    vPath.f21695a = PathParser.c(string3);
                                }
                                vPath.f21676g = TypedArrayUtils.b(d2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = vPath.f21678i;
                                if (TypedArrayUtils.c(xmlPullParser, "fillAlpha")) {
                                    f4 = d2.getFloat(12, f4);
                                }
                                vPath.f21678i = f4;
                                int i10 = !TypedArrayUtils.c(xmlPullParser, "strokeLineCap") ? -1 : d2.getInt(8, -1);
                                Paint.Cap cap2 = vPath.f21682m;
                                if (i10 != 0) {
                                    if (i10 != 1) {
                                        cap = i10 != 2 ? cap2 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                }
                                vPath.f21682m = cap;
                                int i11 = !TypedArrayUtils.c(xmlPullParser, "strokeLineJoin") ? -1 : d2.getInt(9, -1);
                                Paint.Join join2 = vPath.f21683n;
                                if (i11 == 0) {
                                    join2 = join;
                                } else if (i11 == 1) {
                                    join2 = Paint.Join.ROUND;
                                } else if (i11 == 2) {
                                    join2 = Paint.Join.BEVEL;
                                }
                                vPath.f21683n = join2;
                                float f5 = vPath.f21684o;
                                if (TypedArrayUtils.c(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = d2.getFloat(10, f5);
                                }
                                vPath.f21684o = f5;
                                vPath.e = TypedArrayUtils.b(d2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = vPath.f21677h;
                                if (TypedArrayUtils.c(xmlPullParser, "strokeAlpha")) {
                                    f6 = d2.getFloat(11, f6);
                                }
                                vPath.f21677h = f6;
                                float f7 = vPath.f21675f;
                                if (TypedArrayUtils.c(xmlPullParser, "strokeWidth")) {
                                    f7 = d2.getFloat(4, f7);
                                }
                                vPath.f21675f = f7;
                                float f8 = vPath.f21680k;
                                if (TypedArrayUtils.c(xmlPullParser, "trimPathEnd")) {
                                    f8 = d2.getFloat(6, f8);
                                }
                                vPath.f21680k = f8;
                                float f9 = vPath.f21681l;
                                if (TypedArrayUtils.c(xmlPullParser, "trimPathOffset")) {
                                    f9 = d2.getFloat(7, f9);
                                }
                                vPath.f21681l = f9;
                                float f10 = vPath.f21679j;
                                if (TypedArrayUtils.c(xmlPullParser, "trimPathStart")) {
                                    f10 = d2.getFloat(5, f10);
                                }
                                vPath.f21679j = f10;
                                int i12 = vPath.f21697c;
                                if (TypedArrayUtils.c(xmlPullParser, "fillType")) {
                                    i12 = d2.getInt(13, i12);
                                }
                                vPath.f21697c = i12;
                            } else {
                                vPathRenderer = vPathRenderer3;
                            }
                            d2.recycle();
                            vGroup.f21686b.add(vPath);
                            if (vPath.getPathName() != null) {
                                arrayMap.put(vPath.getPathName(), vPath);
                            }
                            vectorDrawableCompatState3.f21712a = vPath.d | vectorDrawableCompatState3.f21712a;
                            z2 = false;
                            i5 = 1;
                            z5 = false;
                        } else {
                            vPathRenderer = vPathRenderer3;
                            if ("clip-path".equals(name)) {
                                VPath vPath2 = new VPath();
                                if (TypedArrayUtils.c(xmlPullParser, "pathData")) {
                                    TypedArray d3 = TypedArrayUtils.d(resources, theme, attributeSet, AndroidResources.d);
                                    String string4 = d3.getString(0);
                                    if (string4 != null) {
                                        vPath2.f21696b = string4;
                                    }
                                    String string5 = d3.getString(1);
                                    if (string5 != null) {
                                        vPath2.f21695a = PathParser.c(string5);
                                    }
                                    vPath2.f21697c = !TypedArrayUtils.c(xmlPullParser, "fillType") ? 0 : d3.getInt(2, 0);
                                    d3.recycle();
                                }
                                vGroup.f21686b.add(vPath2);
                                if (vPath2.getPathName() != null) {
                                    arrayMap.put(vPath2.getPathName(), vPath2);
                                }
                                vectorDrawableCompatState3.f21712a = vPath2.d | vectorDrawableCompatState3.f21712a;
                            } else if ("group".equals(name)) {
                                VGroup vGroup2 = new VGroup();
                                TypedArray d4 = TypedArrayUtils.d(resources, theme, attributeSet, AndroidResources.f21651b);
                                float f11 = vGroup2.f21687c;
                                if (TypedArrayUtils.c(xmlPullParser, "rotation")) {
                                    f11 = d4.getFloat(5, f11);
                                }
                                vGroup2.f21687c = f11;
                                i5 = 1;
                                vGroup2.d = d4.getFloat(1, vGroup2.d);
                                vGroup2.e = d4.getFloat(2, vGroup2.e);
                                float f12 = vGroup2.f21688f;
                                if (TypedArrayUtils.c(xmlPullParser, "scaleX")) {
                                    f12 = d4.getFloat(3, f12);
                                }
                                vGroup2.f21688f = f12;
                                float f13 = vGroup2.f21689g;
                                if (TypedArrayUtils.c(xmlPullParser, "scaleY")) {
                                    f13 = d4.getFloat(4, f13);
                                }
                                vGroup2.f21689g = f13;
                                float f14 = vGroup2.f21690h;
                                if (TypedArrayUtils.c(xmlPullParser, "translateX")) {
                                    f14 = d4.getFloat(6, f14);
                                }
                                vGroup2.f21690h = f14;
                                float f15 = vGroup2.f21691i;
                                if (TypedArrayUtils.c(xmlPullParser, "translateY")) {
                                    f15 = d4.getFloat(7, f15);
                                }
                                vGroup2.f21691i = f15;
                                z2 = false;
                                String string6 = d4.getString(0);
                                if (string6 != null) {
                                    vGroup2.f21694l = string6;
                                }
                                vGroup2.c();
                                d4.recycle();
                                vGroup.f21686b.add(vGroup2);
                                arrayDeque.push(vGroup2);
                                if (vGroup2.getGroupName() != null) {
                                    arrayMap.put(vGroup2.getGroupName(), vGroup2);
                                }
                                vectorDrawableCompatState3.f21712a = vGroup2.f21693k | vectorDrawableCompatState3.f21712a;
                            }
                            z2 = false;
                            i5 = 1;
                        }
                        i4 = i5;
                        i2 = 3;
                    } else {
                        z2 = z4;
                        vPathRenderer = vPathRenderer3;
                        i2 = i7;
                        i3 = depth;
                        i4 = 1;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i7 = i2;
                    z4 = z2;
                    i9 = i4;
                    depth = i3;
                    vPathRenderer3 = vPathRenderer;
                    i8 = 2;
                }
                if (!z5) {
                    this.f21669c = b(vectorDrawableCompatState.f21714c, vectorDrawableCompatState.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* loaded from: classes.dex */
    public static class VGroup extends VObject {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f21685a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f21686b;

        /* renamed from: c, reason: collision with root package name */
        public float f21687c;
        public float d;
        public float e;

        /* renamed from: f, reason: collision with root package name */
        public float f21688f;

        /* renamed from: g, reason: collision with root package name */
        public float f21689g;

        /* renamed from: h, reason: collision with root package name */
        public float f21690h;

        /* renamed from: i, reason: collision with root package name */
        public float f21691i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f21692j;

        /* renamed from: k, reason: collision with root package name */
        public final int f21693k;

        /* renamed from: l, reason: collision with root package name */
        public String f21694l;

        public VGroup() {
            this.f21685a = new Matrix();
            this.f21686b = new ArrayList();
            this.f21687c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f21688f = 1.0f;
            this.f21689g = 1.0f;
            this.f21690h = 0.0f;
            this.f21691i = 0.0f;
            this.f21692j = new Matrix();
            this.f21694l = null;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f21686b;
                if (i2 >= arrayList.size()) {
                    return false;
                }
                if (((VObject) arrayList.get(i2)).a()) {
                    return true;
                }
                i2++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean b(int[] iArr) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                ArrayList arrayList = this.f21686b;
                if (i2 >= arrayList.size()) {
                    return z2;
                }
                z2 |= ((VObject) arrayList.get(i2)).b(iArr);
                i2++;
            }
        }

        public final void c() {
            Matrix matrix = this.f21692j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f21688f, this.f21689g);
            matrix.postRotate(this.f21687c, 0.0f, 0.0f);
            matrix.postTranslate(this.f21690h + this.d, this.f21691i + this.e);
        }

        public String getGroupName() {
            return this.f21694l;
        }

        public Matrix getLocalMatrix() {
            return this.f21692j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f21687c;
        }

        public float getScaleX() {
            return this.f21688f;
        }

        public float getScaleY() {
            return this.f21689g;
        }

        public float getTranslateX() {
            return this.f21690h;
        }

        public float getTranslateY() {
            return this.f21691i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f21687c) {
                this.f21687c = f2;
                c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f21688f) {
                this.f21688f = f2;
                c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f21689g) {
                this.f21689g = f2;
                c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f21690h) {
                this.f21690h = f2;
                c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f21691i) {
                this.f21691i = f2;
                c();
            }
        }

        /* JADX WARN: Type inference failed for: r4v6, types: [androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath] */
        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            VPath vPath;
            this.f21685a = new Matrix();
            this.f21686b = new ArrayList();
            this.f21687c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f21688f = 1.0f;
            this.f21689g = 1.0f;
            this.f21690h = 0.0f;
            this.f21691i = 0.0f;
            Matrix matrix = new Matrix();
            this.f21692j = matrix;
            this.f21694l = null;
            this.f21687c = vGroup.f21687c;
            this.d = vGroup.d;
            this.e = vGroup.e;
            this.f21688f = vGroup.f21688f;
            this.f21689g = vGroup.f21689g;
            this.f21690h = vGroup.f21690h;
            this.f21691i = vGroup.f21691i;
            String str = vGroup.f21694l;
            this.f21694l = str;
            this.f21693k = vGroup.f21693k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.f21692j);
            ArrayList arrayList = vGroup.f21686b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof VGroup) {
                    this.f21686b.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        VFullPath vFullPath = (VFullPath) obj;
                        ?? vPath2 = new VPath(vFullPath);
                        vPath2.f21675f = 0.0f;
                        vPath2.f21677h = 1.0f;
                        vPath2.f21678i = 1.0f;
                        vPath2.f21679j = 0.0f;
                        vPath2.f21680k = 1.0f;
                        vPath2.f21681l = 0.0f;
                        vPath2.f21682m = Paint.Cap.BUTT;
                        vPath2.f21683n = Paint.Join.MITER;
                        vPath2.f21684o = 4.0f;
                        vPath2.e = vFullPath.e;
                        vPath2.f21675f = vFullPath.f21675f;
                        vPath2.f21677h = vFullPath.f21677h;
                        vPath2.f21676g = vFullPath.f21676g;
                        vPath2.f21697c = vFullPath.f21697c;
                        vPath2.f21678i = vFullPath.f21678i;
                        vPath2.f21679j = vFullPath.f21679j;
                        vPath2.f21680k = vFullPath.f21680k;
                        vPath2.f21681l = vFullPath.f21681l;
                        vPath2.f21682m = vFullPath.f21682m;
                        vPath2.f21683n = vFullPath.f21683n;
                        vPath2.f21684o = vFullPath.f21684o;
                        vPath = vPath2;
                    } else if (obj instanceof VClipPath) {
                        vPath = new VPath((VClipPath) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f21686b.add(vPath);
                    Object obj2 = vPath.f21696b;
                    if (obj2 != null) {
                        arrayMap.put(obj2, vPath);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class VPathRenderer {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f21698p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f21699a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f21700b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f21701c;
        public Paint d;
        public Paint e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f21702f;

        /* renamed from: g, reason: collision with root package name */
        public final VGroup f21703g;

        /* renamed from: h, reason: collision with root package name */
        public float f21704h;

        /* renamed from: i, reason: collision with root package name */
        public float f21705i;

        /* renamed from: j, reason: collision with root package name */
        public float f21706j;

        /* renamed from: k, reason: collision with root package name */
        public float f21707k;

        /* renamed from: l, reason: collision with root package name */
        public int f21708l;

        /* renamed from: m, reason: collision with root package name */
        public String f21709m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f21710n;

        /* renamed from: o, reason: collision with root package name */
        public final ArrayMap f21711o;

        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
        public VPathRenderer() {
            this.f21701c = new Matrix();
            this.f21704h = 0.0f;
            this.f21705i = 0.0f;
            this.f21706j = 0.0f;
            this.f21707k = 0.0f;
            this.f21708l = 255;
            this.f21709m = null;
            this.f21710n = null;
            this.f21711o = new SimpleArrayMap();
            this.f21703g = new VGroup();
            this.f21699a = new Path();
            this.f21700b = new Path();
        }

        public final void a(VGroup vGroup, Matrix matrix, Canvas canvas, int i2, int i3) {
            int i4;
            float f2;
            vGroup.f21685a.set(matrix);
            Matrix matrix2 = vGroup.f21685a;
            matrix2.preConcat(vGroup.f21692j);
            canvas.save();
            char c2 = 0;
            int i5 = 0;
            while (true) {
                ArrayList arrayList = vGroup.f21686b;
                if (i5 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                VObject vObject = (VObject) arrayList.get(i5);
                if (vObject instanceof VGroup) {
                    a((VGroup) vObject, matrix2, canvas, i2, i3);
                } else if (vObject instanceof VPath) {
                    VPath vPath = (VPath) vObject;
                    float f3 = i2 / this.f21706j;
                    float f4 = i3 / this.f21707k;
                    float min = Math.min(f3, f4);
                    Matrix matrix3 = this.f21701c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c2], fArr[1]);
                    i4 = i5;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                    if (abs != 0.0f) {
                        vPath.getClass();
                        Path path = this.f21699a;
                        path.reset();
                        PathParser.PathDataNode[] pathDataNodeArr = vPath.f21695a;
                        if (pathDataNodeArr != null) {
                            PathParser.PathDataNode.b(pathDataNodeArr, path);
                        }
                        Path path2 = this.f21700b;
                        path2.reset();
                        if (vPath instanceof VClipPath) {
                            path2.setFillType(vPath.f21697c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            VFullPath vFullPath = (VFullPath) vPath;
                            float f6 = vFullPath.f21679j;
                            if (f6 != 0.0f || vFullPath.f21680k != 1.0f) {
                                float f7 = vFullPath.f21681l;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (vFullPath.f21680k + f7) % 1.0f;
                                if (this.f21702f == null) {
                                    this.f21702f = new PathMeasure();
                                }
                                this.f21702f.setPath(path, false);
                                float length = this.f21702f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f21702f.getSegment(f10, length, path, true);
                                    f2 = 0.0f;
                                    this.f21702f.getSegment(0.0f, f11, path, true);
                                } else {
                                    f2 = 0.0f;
                                    this.f21702f.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f2, f2);
                            }
                            path2.addPath(path, matrix3);
                            ComplexColorCompat complexColorCompat = vFullPath.f21676g;
                            if ((complexColorCompat.f18490a == null && complexColorCompat.f18492c == 0) ? false : true) {
                                if (this.e == null) {
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.e;
                                Shader shader = complexColorCompat.f18490a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(vFullPath.f21678i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = complexColorCompat.f18492c;
                                    float f12 = vFullPath.f21678i;
                                    PorterDuff.Mode mode = VectorDrawableCompat.f21667k;
                                    paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(vFullPath.f21697c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            ComplexColorCompat complexColorCompat2 = vFullPath.e;
                            if (complexColorCompat2.f18490a != null || complexColorCompat2.f18492c != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = vFullPath.f21683n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = vFullPath.f21682m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(vFullPath.f21684o);
                                Shader shader2 = complexColorCompat2.f18490a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(vFullPath.f21677h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = complexColorCompat2.f18492c;
                                    float f13 = vFullPath.f21677h;
                                    PorterDuff.Mode mode2 = VectorDrawableCompat.f21667k;
                                    paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(vFullPath.f21675f * abs * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i5 = i4 + 1;
                    c2 = 0;
                }
                i4 = i5;
                i5 = i4 + 1;
                c2 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f21708l;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f21708l = i2;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.f21701c = new Matrix();
            this.f21704h = 0.0f;
            this.f21705i = 0.0f;
            this.f21706j = 0.0f;
            this.f21707k = 0.0f;
            this.f21708l = 255;
            this.f21709m = null;
            this.f21710n = null;
            ?? simpleArrayMap = new SimpleArrayMap(0);
            this.f21711o = simpleArrayMap;
            this.f21703g = new VGroup(vPathRenderer.f21703g, simpleArrayMap);
            this.f21699a = new Path(vPathRenderer.f21699a);
            this.f21700b = new Path(vPathRenderer.f21700b);
            this.f21704h = vPathRenderer.f21704h;
            this.f21705i = vPathRenderer.f21705i;
            this.f21706j = vPathRenderer.f21706j;
            this.f21707k = vPathRenderer.f21707k;
            this.f21708l = vPathRenderer.f21708l;
            this.f21709m = vPathRenderer.f21709m;
            String str = vPathRenderer.f21709m;
            if (str != null) {
                simpleArrayMap.put(str, this);
            }
            this.f21710n = vPathRenderer.f21710n;
        }
    }

    public VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.f21671g = true;
        this.f21672h = new float[9];
        this.f21673i = new Matrix();
        this.f21674j = new Rect();
        this.f21668b = vectorDrawableCompatState;
        this.f21669c = b(vectorDrawableCompatState.f21714c, vectorDrawableCompatState.d);
    }
}
