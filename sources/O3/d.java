package O3;

import K.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2166a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2167c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2168d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2169e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2170f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2171g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2172h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2173i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2174j;

    /* renamed from: k, reason: collision with root package name */
    public float f2175k;
    public final int l;
    public boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f2176n;

    public d(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, AbstractC2861a.f23684z);
        this.f2175k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2174j = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 3);
        android.support.v4.media.session.a.p(context, obtainStyledAttributes, 4);
        android.support.v4.media.session.a.p(context, obtainStyledAttributes, 5);
        this.f2167c = obtainStyledAttributes.getInt(2, 0);
        this.f2168d = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = obtainStyledAttributes.getResourceId(i10, 0);
        this.b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2166a = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 6);
        this.f2169e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2170f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f2171g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i9, AbstractC2861a.f23675q);
        this.f2172h = obtainStyledAttributes2.hasValue(0);
        this.f2173i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2176n;
        int i9 = this.f2167c;
        if (typeface == null && (str = this.b) != null) {
            this.f2176n = Typeface.create(str, i9);
        }
        if (this.f2176n == null) {
            int i10 = this.f2168d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f2176n = Typeface.DEFAULT;
                    } else {
                        this.f2176n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f2176n = Typeface.SERIF;
                }
            } else {
                this.f2176n = Typeface.SANS_SERIF;
            }
            this.f2176n = Typeface.create(this.f2176n, i9);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.f2176n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a6 = o.a(context, this.l);
                this.f2176n = a6;
                if (a6 != null) {
                    this.f2176n = Typeface.create(a6, this.f2167c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e4) {
                Log.d("TextAppearance", "Error loading font " + this.b, e4);
            }
        }
        a();
        this.m = true;
        return this.f2176n;
    }

    public final void c(Context context, com.bumptech.glide.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i9 = this.l;
        if (i9 == 0) {
            this.m = true;
        }
        if (this.m) {
            cVar.Q(this.f2176n, true);
            return;
        }
        try {
            b bVar = new b(this, cVar);
            ThreadLocal threadLocal = o.f1632a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                o.b(context, i9, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            cVar.P(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.b, e4);
            this.m = true;
            cVar.P(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i9 = this.l;
        if (i9 != 0) {
            ThreadLocal threadLocal = o.f1632a;
            if (!context.isRestricted()) {
                typeface = o.b(context, i9, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        int i9;
        int i10;
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f2174j;
        if (colorStateList != null) {
            i9 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i9 = ViewCompat.MEASURED_STATE_MASK;
        }
        textPaint.setColor(i9);
        ColorStateList colorStateList2 = this.f2166a;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i10 = 0;
        }
        textPaint.setShadowLayer(this.f2171g, this.f2169e, this.f2170f, i10);
    }

    public final void f(Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f2176n);
        c(context, new c(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z8;
        float f9;
        Typeface R4 = com.bumptech.glide.d.R(context.getResources().getConfiguration(), typeface);
        if (R4 != null) {
            typeface = R4;
        }
        textPaint.setTypeface(typeface);
        int i9 = (~typeface.getStyle()) & this.f2167c;
        if ((i9 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        textPaint.setFakeBoldText(z8);
        if ((i9 & 2) != 0) {
            f9 = -0.25f;
        } else {
            f9 = 0.0f;
        }
        textPaint.setTextSkewX(f9);
        textPaint.setTextSize(this.f2175k);
        if (this.f2172h) {
            textPaint.setLetterSpacing(this.f2173i);
        }
    }
}
