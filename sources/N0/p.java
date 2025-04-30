package N0;

import a.AbstractC0325a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.mbridge.msdk.MBridgeConstans;
import g4.AbstractC2292b;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public n f2075c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f2076d;

    /* renamed from: f, reason: collision with root package name */
    public ColorFilter f2077f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2078g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2079h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f2080i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f2081j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2082k;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, N0.n] */
    public p() {
        this.f2079h = true;
        this.f2080i = new float[9];
        this.f2081j = new Matrix();
        this.f2082k = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f2065c = null;
        constantState.f2066d = l;
        constantState.b = new m();
        this.f2075c = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2082k;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f2077f;
            if (colorFilter == null) {
                colorFilter = this.f2076d;
            }
            Matrix matrix = this.f2081j;
            canvas.getMatrix(matrix);
            float[] fArr = this.f2080i;
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
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && M.b.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f2075c;
                Bitmap bitmap = nVar.f2068f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f2068f.getHeight()) {
                    nVar.f2068f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f2073k = true;
                }
                if (!this.f2079h) {
                    n nVar2 = this.f2075c;
                    nVar2.f2068f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f2068f);
                    m mVar = nVar2.b;
                    mVar.a(mVar.f2057g, m.f2051p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f2075c;
                    if (nVar3.f2073k || nVar3.f2069g != nVar3.f2065c || nVar3.f2070h != nVar3.f2066d || nVar3.f2072j != nVar3.f2067e || nVar3.f2071i != nVar3.b.getRootAlpha()) {
                        n nVar4 = this.f2075c;
                        nVar4.f2068f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f2068f);
                        m mVar2 = nVar4.b;
                        mVar2.a(mVar2.f2057g, m.f2051p, canvas3, min, min2);
                        n nVar5 = this.f2075c;
                        nVar5.f2069g = nVar5.f2065c;
                        nVar5.f2070h = nVar5.f2066d;
                        nVar5.f2071i = nVar5.b.getRootAlpha();
                        nVar5.f2072j = nVar5.f2067e;
                        nVar5.f2073k = false;
                    }
                }
                n nVar6 = this.f2075c;
                if (nVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.l == null) {
                        Paint paint2 = new Paint();
                        nVar6.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.l.setAlpha(nVar6.b.getRootAlpha());
                    nVar6.l.setColorFilter(colorFilter);
                    paint = nVar6.l;
                }
                canvas.drawBitmap(nVar6.f2068f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f2075c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f2075c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return M.a.c(drawable);
        }
        return this.f2077f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b != null) {
            return new o(this.b.getConstantState());
        }
        this.f2075c.f2064a = getChangingConfigurations();
        return this.f2075c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f2075c.b.f2059i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f2075c.b.f2058h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f2075c.f2067e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f2075c;
            if (nVar != null) {
                m mVar = nVar.b;
                if (mVar.f2062n == null) {
                    mVar.f2062n = Boolean.valueOf(mVar.f2057g.a());
                }
                if (mVar.f2062n.booleanValue() || ((colorStateList = this.f2075c.f2065c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, N0.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2078g && super.mutate() == this) {
            n nVar = this.f2075c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f2065c = null;
            constantState.f2066d = l;
            if (nVar != null) {
                constantState.f2064a = nVar.f2064a;
                m mVar = new m(nVar.b);
                constantState.b = mVar;
                if (nVar.b.f2055e != null) {
                    mVar.f2055e = new Paint(nVar.b.f2055e);
                }
                if (nVar.b.f2054d != null) {
                    constantState.b.f2054d = new Paint(nVar.b.f2054d);
                }
                constantState.f2065c = nVar.f2065c;
                constantState.f2066d = nVar.f2066d;
                constantState.f2067e = nVar.f2067e;
            }
            this.f2075c = constantState;
            this.f2078g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f2075c;
        ColorStateList colorStateList = nVar.f2065c;
        if (colorStateList != null && (mode = nVar.f2066d) != null) {
            this.f2076d = a(colorStateList, mode);
            invalidateSelf();
            z8 = true;
        } else {
            z8 = false;
        }
        m mVar = nVar.b;
        if (mVar.f2062n == null) {
            mVar.f2062n = Boolean.valueOf(mVar.f2057g.a());
        }
        if (mVar.f2062n.booleanValue()) {
            boolean b = nVar.b.f2057g.b(iArr);
            nVar.f2073k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else if (this.f2075c.b.getRootAlpha() != i9) {
            this.f2075c.b.setRootAlpha(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f2075c.f2067e = z8;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2077f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC2292b.o(drawable, i9);
        } else {
            setTintList(ColorStateList.valueOf(i9));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f2075c;
        if (nVar.f2065c != colorStateList) {
            nVar.f2065c = colorStateList;
            this.f2076d = a(colorStateList, nVar.f2066d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.i(drawable, mode);
            return;
        }
        n nVar = this.f2075c;
        if (nVar.f2066d != mode) {
            nVar.f2066d = mode;
            this.f2076d = a(nVar.f2065c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z8, z9);
        }
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16, types: [N0.l, N0.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i9;
        boolean z8;
        char c9;
        int i10;
        Paint.Cap cap;
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f2075c;
        nVar.b = new m();
        TypedArray f9 = K.b.f(resources, theme, attributeSet, a.f2014a);
        n nVar2 = this.f2075c;
        m mVar2 = nVar2.b;
        int i11 = !K.b.c(xmlPullParser, "tintMode") ? -1 : f9.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
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
        nVar2.f2066d = mode;
        int i13 = 1;
        ColorStateList colorStateList = null;
        boolean z9 = false;
        if (K.b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f9.getValue(1, typedValue);
            int i14 = typedValue.type;
            if (i14 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i14 >= 28 && i14 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f9.getResources();
                int resourceId = f9.getResourceId(1, 0);
                ThreadLocal threadLocal = K.c.f1617a;
                try {
                    colorStateList = K.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f2065c = colorStateList2;
        }
        boolean z10 = nVar2.f2067e;
        if (K.b.c(xmlPullParser, "autoMirrored")) {
            z10 = f9.getBoolean(5, z10);
        }
        nVar2.f2067e = z10;
        float f10 = mVar2.f2060j;
        if (K.b.c(xmlPullParser, "viewportWidth")) {
            f10 = f9.getFloat(7, f10);
        }
        mVar2.f2060j = f10;
        float f11 = mVar2.f2061k;
        if (K.b.c(xmlPullParser, "viewportHeight")) {
            f11 = f9.getFloat(8, f11);
        }
        mVar2.f2061k = f11;
        if (mVar2.f2060j <= 0.0f) {
            throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            mVar2.f2058h = f9.getDimension(3, mVar2.f2058h);
            float dimension = f9.getDimension(2, mVar2.f2059i);
            mVar2.f2059i = dimension;
            if (mVar2.f2058h <= 0.0f) {
                throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (K.b.c(xmlPullParser, "alpha")) {
                    alpha = f9.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f9.getString(0);
                if (string != null) {
                    mVar2.m = string;
                    mVar2.f2063o.put(string, mVar2);
                }
                f9.recycle();
                nVar.f2064a = getChangingConfigurations();
                nVar.f2073k = true;
                n nVar3 = this.f2075c;
                m mVar3 = nVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f2057g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != i12)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = MBridgeConstans.DYNAMIC_VIEW_WX_PATH.equals(name);
                        x.b bVar = mVar3.f2063o;
                        mVar = mVar3;
                        if (equals) {
                            ?? lVar = new l();
                            lVar.f2030f = 0.0f;
                            lVar.f2032h = 1.0f;
                            lVar.f2033i = 1.0f;
                            lVar.f2034j = 0.0f;
                            lVar.f2035k = 1.0f;
                            lVar.l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.m = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            lVar.f2036n = join;
                            i9 = depth;
                            lVar.f2037o = 4.0f;
                            TypedArray f12 = K.b.f(resources, theme, attributeSet, a.f2015c);
                            if (K.b.c(xmlPullParser, "pathData")) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    lVar.b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    lVar.f2048a = AbstractC0325a.c(string3);
                                }
                                lVar.f2031g = K.b.b(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = lVar.f2033i;
                                if (K.b.c(xmlPullParser, "fillAlpha")) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                lVar.f2033i = f13;
                                int i15 = !K.b.c(xmlPullParser, "strokeLineCap") ? -1 : f12.getInt(8, -1);
                                Paint.Cap cap3 = lVar.m;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.m = cap;
                                int i16 = !K.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f12.getInt(9, -1);
                                Paint.Join join2 = lVar.f2036n;
                                if (i16 != 0) {
                                    if (i16 != 1) {
                                        join = i16 != 2 ? join2 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                }
                                lVar.f2036n = join;
                                float f14 = lVar.f2037o;
                                if (K.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                lVar.f2037o = f14;
                                lVar.f2029e = K.b.b(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = lVar.f2032h;
                                if (K.b.c(xmlPullParser, "strokeAlpha")) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                lVar.f2032h = f15;
                                float f16 = lVar.f2030f;
                                if (K.b.c(xmlPullParser, "strokeWidth")) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                lVar.f2030f = f16;
                                float f17 = lVar.f2035k;
                                if (K.b.c(xmlPullParser, "trimPathEnd")) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                lVar.f2035k = f17;
                                float f18 = lVar.l;
                                if (K.b.c(xmlPullParser, "trimPathOffset")) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                lVar.l = f18;
                                float f19 = lVar.f2034j;
                                if (K.b.c(xmlPullParser, "trimPathStart")) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                lVar.f2034j = f19;
                                int i17 = lVar.f2049c;
                                if (K.b.c(xmlPullParser, "fillType")) {
                                    i17 = f12.getInt(13, i17);
                                }
                                lVar.f2049c = i17;
                            }
                            f12.recycle();
                            jVar.b.add(lVar);
                            if (lVar.getPathName() != null) {
                                bVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f2064a |= lVar.f2050d;
                            z8 = false;
                            c9 = '\b';
                            z11 = false;
                        } else {
                            i9 = depth;
                            c9 = '\b';
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (K.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f20 = K.b.f(resources, theme, attributeSet, a.f2016d);
                                    String string4 = f20.getString(0);
                                    if (string4 != null) {
                                        lVar2.b = string4;
                                    }
                                    String string5 = f20.getString(1);
                                    if (string5 != null) {
                                        lVar2.f2048a = AbstractC0325a.c(string5);
                                    }
                                    lVar2.f2049c = !K.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                    f20.recycle();
                                }
                                jVar.b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    bVar.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f2064a |= lVar2.f2050d;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f21 = K.b.f(resources, theme, attributeSet, a.b);
                                float f22 = jVar2.f2039c;
                                if (K.b.c(xmlPullParser, "rotation")) {
                                    f22 = f21.getFloat(5, f22);
                                }
                                jVar2.f2039c = f22;
                                jVar2.f2040d = f21.getFloat(1, jVar2.f2040d);
                                jVar2.f2041e = f21.getFloat(2, jVar2.f2041e);
                                float f23 = jVar2.f2042f;
                                if (K.b.c(xmlPullParser, "scaleX")) {
                                    f23 = f21.getFloat(3, f23);
                                }
                                jVar2.f2042f = f23;
                                float f24 = jVar2.f2043g;
                                if (K.b.c(xmlPullParser, "scaleY")) {
                                    f24 = f21.getFloat(4, f24);
                                }
                                jVar2.f2043g = f24;
                                float f25 = jVar2.f2044h;
                                if (K.b.c(xmlPullParser, "translateX")) {
                                    f25 = f21.getFloat(6, f25);
                                }
                                jVar2.f2044h = f25;
                                float f26 = jVar2.f2045i;
                                if (K.b.c(xmlPullParser, "translateY")) {
                                    f26 = f21.getFloat(7, f26);
                                }
                                jVar2.f2045i = f26;
                                z8 = false;
                                String string6 = f21.getString(0);
                                if (string6 != null) {
                                    jVar2.l = string6;
                                }
                                jVar2.c();
                                f21.recycle();
                                jVar.b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f2064a = jVar2.f2047k | nVar3.f2064a;
                            }
                            z8 = false;
                        }
                        i12 = 3;
                        i10 = 1;
                    } else {
                        mVar = mVar3;
                        i9 = depth;
                        z8 = z9;
                        c9 = '\b';
                        i10 = i13;
                        i12 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i13 = i10;
                    mVar3 = mVar;
                    z9 = z8;
                    depth = i9;
                }
                if (!z11) {
                    this.f2076d = a(nVar.f2065c, nVar.f2066d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f2079h = true;
        this.f2080i = new float[9];
        this.f2081j = new Matrix();
        this.f2082k = new Rect();
        this.f2075c = nVar;
        this.f2076d = a(nVar.f2065c, nVar.f2066d);
    }
}
