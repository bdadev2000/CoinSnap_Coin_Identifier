package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d1 {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public r3 f841b;

    /* renamed from: c, reason: collision with root package name */
    public r3 f842c;

    /* renamed from: d, reason: collision with root package name */
    public r3 f843d;

    /* renamed from: e, reason: collision with root package name */
    public r3 f844e;

    /* renamed from: f, reason: collision with root package name */
    public r3 f845f;

    /* renamed from: g, reason: collision with root package name */
    public r3 f846g;

    /* renamed from: h, reason: collision with root package name */
    public r3 f847h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f848i;

    /* renamed from: j, reason: collision with root package name */
    public int f849j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f850k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f851l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f852m;

    public d1(TextView textView) {
        this.a = textView;
        this.f848i = new n1(textView);
    }

    public static r3 c(Context context, w wVar, int i10) {
        ColorStateList h10;
        synchronized (wVar) {
            h10 = wVar.a.h(context, i10);
        }
        if (h10 != null) {
            r3 r3Var = new r3();
            r3Var.f1011c = true;
            r3Var.f1012d = h10;
            return r3Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        CharSequence subSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 != 129 && i16 != 225 && i16 != 18) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    com.bumptech.glide.d.A(editorInfo, null, 0, 0);
                    return;
                }
                if (length <= 2048) {
                    com.bumptech.glide.d.A(editorInfo, text, i10, i11);
                    return;
                }
                int i17 = i11 - i10;
                if (i17 > 1024) {
                    i12 = 0;
                } else {
                    i12 = i17;
                }
                int i18 = 2048 - i12;
                int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (i18 * 0.8d)));
                int min2 = Math.min(i10, i18 - min);
                int i19 = i10 - min2;
                if (Character.isLowSurrogate(text.charAt(i19))) {
                    i19++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i20 = min2 + i12 + min;
                if (i12 != i17) {
                    subSequence = TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11));
                } else {
                    subSequence = text.subSequence(i19, i20 + i19);
                }
                int i21 = min2 + 0;
                com.bumptech.glide.d.A(editorInfo, subSequence, i21, i12 + i21);
                return;
            }
            com.bumptech.glide.d.A(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, r3 r3Var) {
        if (drawable == null || r3Var == null) {
            return;
        }
        w.d(drawable, r3Var, this.a.getDrawableState());
    }

    public final void b() {
        r3 r3Var = this.f841b;
        TextView textView = this.a;
        if (r3Var != null || this.f842c != null || this.f843d != null || this.f844e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f841b);
            a(compoundDrawables[1], this.f842c);
            a(compoundDrawables[2], this.f843d);
            a(compoundDrawables[3], this.f844e);
        }
        if (this.f845f != null || this.f846g != null) {
            Drawable[] a = y0.a(textView);
            a(a[0], this.f845f);
            a(a[2], this.f846g);
        }
    }

    public final ColorStateList d() {
        r3 r3Var = this.f847h;
        if (r3Var != null) {
            return (ColorStateList) r3Var.f1012d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        r3 r3Var = this.f847h;
        if (r3Var != null) {
            return (PorterDuff.Mode) r3Var.f1013e;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        n1 n1Var;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i11;
        Paint.FontMetricsInt fontMetricsInt;
        int i12;
        int resourceId;
        int i13;
        TextView textView = this.a;
        Context context = textView.getContext();
        w a = w.a();
        int[] iArr = g.a.f17885h;
        i3 m10 = i3.m(context, attributeSet, iArr, i10);
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m10.f874b, i10, 0);
        int i14 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f841b = c(context, a, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.f842c = c(context, a, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f843d = c(context, a, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f844e = c(context, a, m10.i(2, 0));
        }
        int i15 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f845f = c(context, a, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f846g = c(context, a, m10.i(6, 0));
        }
        m10.o();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = g.a.f17899w;
        if (i14 != -1) {
            i3 i3Var = new i3(context, context.obtainStyledAttributes(i14, iArr2));
            if (!z12 && i3Var.l(14)) {
                z10 = i3Var.a(14, false);
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            n(context, i3Var);
            if (i3Var.l(15)) {
                str = i3Var.j(15);
                i13 = 26;
            } else {
                i13 = 26;
                str = null;
            }
            if (i15 >= i13 && i3Var.l(13)) {
                str2 = i3Var.j(13);
            } else {
                str2 = null;
            }
            i3Var.o();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        i3 i3Var2 = new i3(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z12 && i3Var2.l(14)) {
            z10 = i3Var2.a(14, false);
            z11 = true;
        }
        if (i3Var2.l(15)) {
            str = i3Var2.j(15);
        }
        if (i15 >= 26 && i3Var2.l(13)) {
            str2 = i3Var2.j(13);
        }
        String str3 = str2;
        if (i15 >= 28 && i3Var2.l(0) && i3Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, i3Var2);
        i3Var2.o();
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f851l;
        if (typeface != null) {
            if (this.f850k == -1) {
                textView.setTypeface(typeface, this.f849j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            a1.d(textView, str3);
        }
        if (str != null) {
            z0.b(textView, z0.a(str));
        }
        int[] iArr3 = g.a.f17886i;
        n1 n1Var2 = this.f848i;
        Context context2 = n1Var2.f957j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = n1Var2.f956i;
        ViewCompat.saveAttributeDataForStyleable(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            int i16 = obtainStyledAttributes.getInt(5, 0);
            n1Var = n1Var2;
            n1Var.a = i16;
        } else {
            n1Var = n1Var2;
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f10 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f11 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f12 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = obtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                n1Var.f953f = n1.b(iArr4);
                n1Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (n1Var.i()) {
            if (n1Var.a == 1) {
                if (!n1Var.f954g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        i12 = 2;
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i12 = 2;
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    n1Var.j(f11, f12, f10);
                }
                n1Var.g();
            }
        } else {
            n1Var.a = 0;
        }
        if (f4.f868b && n1Var.a != 0) {
            int[] iArr5 = n1Var.f953f;
            if (iArr5.length > 0) {
                if (a1.a(textView) != -1.0f) {
                    a1.b(textView, Math.round(n1Var.f951d), Math.round(n1Var.f952e), Math.round(n1Var.f950c), 0);
                } else {
                    a1.c(textView, iArr5, 0);
                }
            }
        }
        i3 i3Var3 = new i3(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i18 = i3Var3.i(8, -1);
        if (i18 != -1) {
            drawable = a.b(context, i18);
        } else {
            drawable = null;
        }
        int i19 = i3Var3.i(13, -1);
        if (i19 != -1) {
            drawable2 = a.b(context, i19);
        } else {
            drawable2 = null;
        }
        int i20 = i3Var3.i(9, -1);
        if (i20 != -1) {
            drawable3 = a.b(context, i20);
        } else {
            drawable3 = null;
        }
        int i21 = i3Var3.i(6, -1);
        if (i21 != -1) {
            drawable4 = a.b(context, i21);
        } else {
            drawable4 = null;
        }
        int i22 = i3Var3.i(10, -1);
        if (i22 != -1) {
            drawable5 = a.b(context, i22);
        } else {
            drawable5 = null;
        }
        int i23 = i3Var3.i(7, -1);
        if (i23 != -1) {
            drawable6 = a.b(context, i23);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a10 = y0.a(textView);
                Drawable drawable7 = a10[0];
                if (drawable7 == null && a10[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a10[1];
                    }
                    Drawable drawable8 = a10[2];
                    if (drawable4 == null) {
                        drawable4 = a10[3];
                    }
                    y0.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a11 = y0.a(textView);
            if (drawable5 == null) {
                drawable5 = a11[0];
            }
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            if (drawable6 == null) {
                drawable6 = a11[2];
            }
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            y0.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (i3Var3.l(11)) {
            t0.m.f(textView, i3Var3.b(11));
        }
        if (i3Var3.l(12)) {
            i11 = -1;
            fontMetricsInt = null;
            t0.m.g(textView, s1.b(i3Var3.h(12, -1), null));
        } else {
            i11 = -1;
            fontMetricsInt = null;
        }
        int d10 = i3Var3.d(15, i11);
        int d11 = i3Var3.d(18, i11);
        int d12 = i3Var3.d(19, i11);
        i3Var3.o();
        if (d10 != i11) {
            d6.g.F(textView, d10);
        }
        if (d11 != i11) {
            d6.g.G(textView, d11);
        }
        if (d12 != i11) {
            com.bumptech.glide.e.j(d12);
            if (d12 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(d12 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String j3;
        i3 i3Var = new i3(context, context.obtainStyledAttributes(i10, g.a.f17899w));
        boolean l10 = i3Var.l(14);
        TextView textView = this.a;
        if (l10) {
            textView.setAllCaps(i3Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i3Var.l(0) && i3Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, i3Var);
        if (i11 >= 26 && i3Var.l(13) && (j3 = i3Var.j(13)) != null) {
            a1.d(textView, j3);
        }
        i3Var.o();
        Typeface typeface = this.f851l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f849j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        n1 n1Var = this.f848i;
        if (n1Var.i()) {
            DisplayMetrics displayMetrics = n1Var.f957j.getResources().getDisplayMetrics();
            n1Var.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (n1Var.g()) {
                n1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        n1 n1Var = this.f848i;
        if (n1Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = n1Var.f957j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                n1Var.f953f = n1.b(iArr2);
                if (!n1Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                n1Var.f954g = false;
            }
            if (n1Var.g()) {
                n1Var.a();
            }
        }
    }

    public final void k(int i10) {
        n1 n1Var = this.f848i;
        if (n1Var.i()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = n1Var.f957j.getResources().getDisplayMetrics();
                    n1Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (n1Var.g()) {
                        n1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(eb.j.i("Unknown auto-size text type: ", i10));
            }
            n1Var.a = 0;
            n1Var.f951d = -1.0f;
            n1Var.f952e = -1.0f;
            n1Var.f950c = -1.0f;
            n1Var.f953f = new int[0];
            n1Var.f949b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.f847h == null) {
            this.f847h = new r3();
        }
        r3 r3Var = this.f847h;
        r3Var.f1012d = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r3Var.f1011c = z10;
        this.f841b = r3Var;
        this.f842c = r3Var;
        this.f843d = r3Var;
        this.f844e = r3Var;
        this.f845f = r3Var;
        this.f846g = r3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f847h == null) {
            this.f847h = new r3();
        }
        r3 r3Var = this.f847h;
        r3Var.f1013e = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r3Var.f1010b = z10;
        this.f841b = r3Var;
        this.f842c = r3Var;
        this.f843d = r3Var;
        this.f844e = r3Var;
        this.f845f = r3Var;
        this.f846g = r3Var;
    }

    public final void n(Context context, i3 i3Var) {
        String j3;
        boolean z10;
        boolean z11;
        this.f849j = i3Var.h(2, this.f849j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int h10 = i3Var.h(11, -1);
            this.f850k = h10;
            if (h10 != -1) {
                this.f849j = (this.f849j & 2) | 0;
            }
        }
        int i11 = 10;
        if (!i3Var.l(10) && !i3Var.l(12)) {
            if (i3Var.l(1)) {
                this.f852m = false;
                int h11 = i3Var.h(1, 1);
                if (h11 != 1) {
                    if (h11 != 2) {
                        if (h11 == 3) {
                            this.f851l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f851l = Typeface.SERIF;
                    return;
                }
                this.f851l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f851l = null;
        if (i3Var.l(12)) {
            i11 = 12;
        }
        int i12 = this.f850k;
        int i13 = this.f849j;
        if (!context.isRestricted()) {
            try {
                Typeface g10 = i3Var.g(i11, this.f849j, new w0(this, i12, i13, new WeakReference(this.a)));
                if (g10 != null) {
                    if (i10 >= 28 && this.f850k != -1) {
                        Typeface create = Typeface.create(g10, 0);
                        int i14 = this.f850k;
                        if ((this.f849j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f851l = c1.a(create, i14, z11);
                    } else {
                        this.f851l = g10;
                    }
                }
                if (this.f851l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f852m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f851l == null && (j3 = i3Var.j(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f850k != -1) {
                Typeface create2 = Typeface.create(j3, 0);
                int i15 = this.f850k;
                if ((this.f849j & 2) != 0) {
                    z12 = true;
                }
                this.f851l = c1.a(create2, i15, z12);
                return;
            }
            this.f851l = Typeface.create(j3, this.f849j);
        }
    }
}
