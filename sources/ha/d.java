package ha;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.ViewCompat;
import f0.q;
import v8.u0;

/* loaded from: classes3.dex */
public final class d {
    public final ColorStateList a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18992c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18993d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18994e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18995f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18996g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18997h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18998i;

    /* renamed from: j, reason: collision with root package name */
    public final float f18999j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f19000k;

    /* renamed from: l, reason: collision with root package name */
    public float f19001l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19002m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19003n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19004o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f19005p;

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, r9.a.f24043z);
        this.f19001l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f19000k = u0.z(context, obtainStyledAttributes, 3);
        u0.z(context, obtainStyledAttributes, 4);
        u0.z(context, obtainStyledAttributes, 5);
        this.f18993d = obtainStyledAttributes.getInt(2, 0);
        this.f18994e = obtainStyledAttributes.getInt(1, 1);
        int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f19002m = obtainStyledAttributes.getResourceId(i11, 0);
        this.f18991b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = u0.z(context, obtainStyledAttributes, 6);
        this.f18995f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f18996g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f18997h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        int i12 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, r9.a.f24035q);
        this.f18998i = obtainStyledAttributes2.hasValue(0);
        this.f18999j = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (i12 >= 26) {
            this.f18992c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f19005p;
        int i10 = this.f18993d;
        if (typeface == null && (str = this.f18991b) != null) {
            this.f19005p = Typeface.create(str, i10);
        }
        if (this.f19005p == null) {
            int i11 = this.f18994e;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f19005p = Typeface.DEFAULT;
                    } else {
                        this.f19005p = Typeface.MONOSPACE;
                    }
                } else {
                    this.f19005p = Typeface.SERIF;
                }
            } else {
                this.f19005p = Typeface.SANS_SERIF;
            }
            this.f19005p = Typeface.create(this.f19005p, i10);
        }
    }

    public final void b(Context context, p6.a aVar) {
        if (!c(context)) {
            a();
        }
        int i10 = this.f19002m;
        if (i10 == 0) {
            this.f19003n = true;
        }
        if (this.f19003n) {
            aVar.o(this.f19005p, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = q.a;
            if (context.isRestricted()) {
                bVar.b(-4);
            } else {
                q.a(context, i10, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f19003n = true;
            aVar.n(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f18991b, e2);
            this.f19003n = true;
            aVar.n(-3);
        }
    }

    public final boolean c(Context context) {
        Typeface a;
        String str;
        Typeface create;
        if (this.f19003n) {
            return true;
        }
        int i10 = this.f19002m;
        if (i10 == 0) {
            return false;
        }
        ThreadLocal threadLocal = q.a;
        Typeface typeface = null;
        if (context.isRestricted()) {
            a = null;
        } else {
            a = q.a(context, i10, new TypedValue(), 0, null, false, true);
        }
        if (a != null) {
            this.f19005p = a;
            this.f19003n = true;
            return true;
        }
        if (!this.f19004o) {
            this.f19004o = true;
            Resources resources = context.getResources();
            int i11 = this.f19002m;
            if (i11 != 0 && resources.getResourceTypeName(i11).equals("font")) {
                try {
                    XmlResourceParser xml = resources.getXml(i11);
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), c0.a.f2516b);
                            str = obtainAttributes.getString(6);
                            obtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                    }
                } catch (Throwable unused) {
                }
            }
            str = null;
            if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                typeface = Typeface.create(create, this.f18993d);
            }
        }
        if (typeface == null) {
            return false;
        }
        this.f19005p = typeface;
        this.f19003n = true;
        return true;
    }

    public final void d(Context context, TextPaint textPaint, p6.a aVar) {
        int i10;
        int i11;
        e(context, textPaint, aVar);
        ColorStateList colorStateList = this.f19000k;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = ViewCompat.MEASURED_STATE_MASK;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f18997h, this.f18995f, this.f18996g, i11);
    }

    public final void e(Context context, TextPaint textPaint, p6.a aVar) {
        Typeface typeface;
        if (c(context) && this.f19003n && (typeface = this.f19005p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f19005p);
        b(context, new c(this, context, textPaint, aVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface S = u0.S(context.getResources().getConfiguration(), typeface);
        if (S != null) {
            typeface = S;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f18993d;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f19001l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f18992c);
        }
        if (this.f18998i) {
            textPaint.setLetterSpacing(this.f18999j);
        }
    }
}
