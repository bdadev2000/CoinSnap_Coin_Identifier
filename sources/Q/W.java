package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import g4.AbstractC2292b;
import j.AbstractC2379a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f22597a;
    public com.facebook.A b;

    /* renamed from: c, reason: collision with root package name */
    public com.facebook.A f22598c;

    /* renamed from: d, reason: collision with root package name */
    public com.facebook.A f22599d;

    /* renamed from: e, reason: collision with root package name */
    public com.facebook.A f22600e;

    /* renamed from: f, reason: collision with root package name */
    public com.facebook.A f22601f;

    /* renamed from: g, reason: collision with root package name */
    public com.facebook.A f22602g;

    /* renamed from: h, reason: collision with root package name */
    public com.facebook.A f22603h;

    /* renamed from: i, reason: collision with root package name */
    public final C2596e0 f22604i;

    /* renamed from: j, reason: collision with root package name */
    public int f22605j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f22606k = -1;
    public Typeface l;
    public boolean m;

    public W(TextView textView) {
        this.f22597a = textView;
        this.f22604i = new C2596e0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.A, java.lang.Object] */
    public static com.facebook.A c(Context context, C2624t c2624t, int i9) {
        ColorStateList h6;
        synchronized (c2624t) {
            h6 = c2624t.f22726a.h(context, i9);
        }
        if (h6 != null) {
            ?? obj = new Object();
            obj.b = true;
            obj.f13377c = h6;
            return obj;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i9;
        int i10;
        CharSequence subSequence;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i11 >= 30) {
                Y.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i11 >= 30) {
                Y.b.a(editorInfo, text);
                return;
            }
            int i12 = editorInfo.initialSelStart;
            int i13 = editorInfo.initialSelEnd;
            if (i12 > i13) {
                i9 = i13;
            } else {
                i9 = i12;
            }
            if (i12 <= i13) {
                i12 = i13;
            }
            int length = text.length();
            if (i9 >= 0 && i12 <= length) {
                int i14 = editorInfo.inputType & 4095;
                if (i14 != 129 && i14 != 225 && i14 != 18) {
                    if (length <= 2048) {
                        Y.c.a(editorInfo, text, i9, i12);
                        return;
                    }
                    int i15 = i12 - i9;
                    if (i15 > 1024) {
                        i10 = 0;
                    } else {
                        i10 = i15;
                    }
                    int i16 = 2048 - i10;
                    int min = Math.min(text.length() - i12, i16 - Math.min(i9, (int) (i16 * 0.8d)));
                    int min2 = Math.min(i9, i16 - min);
                    int i17 = i9 - min2;
                    if (Character.isLowSurrogate(text.charAt(i17))) {
                        i17++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i12 + min) - 1))) {
                        min--;
                    }
                    int i18 = min2 + i10;
                    int i19 = i18 + min;
                    if (i10 != i15) {
                        subSequence = TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i12, min + i12));
                    } else {
                        subSequence = text.subSequence(i17, i19 + i17);
                    }
                    Y.c.a(editorInfo, subSequence, min2, i18);
                    return;
                }
                Y.c.a(editorInfo, null, 0, 0);
                return;
            }
            Y.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, com.facebook.A a6) {
        if (drawable != null && a6 != null) {
            C2624t.d(drawable, a6, this.f22597a.getDrawableState());
        }
    }

    public final void b() {
        com.facebook.A a6 = this.b;
        TextView textView = this.f22597a;
        if (a6 != null || this.f22598c != null || this.f22599d != null || this.f22600e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f22598c);
            a(compoundDrawables[2], this.f22599d);
            a(compoundDrawables[3], this.f22600e);
        }
        if (this.f22601f != null || this.f22602g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f22601f);
            a(compoundDrawablesRelative[2], this.f22602g);
        }
    }

    public final ColorStateList d() {
        com.facebook.A a6 = this.f22603h;
        if (a6 != null) {
            return (ColorStateList) a6.f13377c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        com.facebook.A a6 = this.f22603h;
        if (a6 != null) {
            return (PorterDuff.Mode) a6.f13378d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i9) {
        boolean z8;
        boolean z9;
        String str;
        String str2;
        boolean z10;
        float f9;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i10;
        int i11;
        int i12;
        float f12;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        int i14;
        TextView textView = this.f22597a;
        Context context = textView.getContext();
        C2624t a6 = C2624t.a();
        int[] iArr = AbstractC2379a.f20948h;
        l5.k i15 = l5.k.i(context, attributeSet, iArr, i9, 0);
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, (TypedArray) i15.b, i9, 0);
        TypedArray typedArray = (TypedArray) i15.b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a6, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f22598c = c(context, a6, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f22599d = c(context, a6, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f22600e = c(context, a6, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f22601f = c(context, a6, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f22602g = c(context, a6, typedArray.getResourceId(6, 0));
        }
        i15.j();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC2379a.f20961w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            l5.k kVar = new l5.k(context, obtainStyledAttributes);
            if (!z11 && obtainStyledAttributes.hasValue(14)) {
                z8 = obtainStyledAttributes.getBoolean(14, false);
                z9 = true;
            } else {
                z8 = false;
                z9 = false;
            }
            n(context, kVar);
            int i16 = Build.VERSION.SDK_INT;
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i14 = 26;
            } else {
                i14 = 26;
                str2 = null;
            }
            if (i16 >= i14 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            kVar.j();
        } else {
            z8 = false;
            z9 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i9, 0);
        l5.k kVar2 = new l5.k(context, obtainStyledAttributes2);
        if (!z11 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z9 = true;
        } else {
            z10 = z8;
        }
        int i17 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i17 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i17 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, kVar2);
        kVar2.j();
        if (!z11 && z9) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.f22606k == -1) {
                textView.setTypeface(typeface, this.f22605j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            U.d(textView, str);
        }
        if (str2 != null) {
            T.b(textView, T.a(str2));
        }
        int[] iArr3 = AbstractC2379a.f20949i;
        C2596e0 c2596e0 = this.f22604i;
        Context context2 = c2596e0.f22651j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i9, 0);
        TextView textView2 = c2596e0.f22650i;
        ViewCompat.saveAttributeDataForStyleable(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i9, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c2596e0.f22643a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f9 = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f9 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f10 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f11 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i18 = 0; i18 < length; i18++) {
                    iArr4[i18] = obtainTypedArray.getDimensionPixelSize(i18, -1);
                }
                c2596e0.f22647f = C2596e0.b(iArr4);
                c2596e0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c2596e0.j()) {
            if (c2596e0.f22643a == 1) {
                if (!c2596e0.f22648g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f10 == -1.0f) {
                        i13 = 2;
                        f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i13 = 2;
                    }
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                    }
                    if (f9 == -1.0f) {
                        f9 = 1.0f;
                    }
                    c2596e0.k(f10, f11, f9);
                }
                c2596e0.h();
            }
        } else {
            c2596e0.f22643a = 0;
        }
        if (g1.f22658c && c2596e0.f22643a != 0) {
            int[] iArr5 = c2596e0.f22647f;
            if (iArr5.length > 0) {
                if (U.a(textView) != -1.0f) {
                    U.b(textView, Math.round(c2596e0.f22645d), Math.round(c2596e0.f22646e), Math.round(c2596e0.f22644c), 0);
                } else {
                    U.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a6.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a6.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a6.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a6.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a6.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a6.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
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
                        drawable2 = compoundDrawablesRelative[1];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative[3];
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
                }
            }
        } else {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative2[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative2[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = I.h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            Z.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i10 = -1;
            Z.m.g(textView, AbstractC2610l0.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i10 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i10);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i10);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i19 = peekValue.data;
                int i20 = i19 & 15;
                f12 = TypedValue.complexToFloat(i19);
                i12 = i20;
                i11 = -1;
            } else {
                i11 = -1;
                f12 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i12 = -1;
            }
        } else {
            i11 = -1;
            i12 = -1;
            f12 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i11) {
            AbstractC2292b.k(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i11) {
            AbstractC2292b.m(textView, dimensionPixelSize2);
        }
        if (f12 != -1.0f) {
            if (i12 == i11) {
                AbstractC2292b.n(textView, (int) f12);
            } else if (Build.VERSION.SDK_INT >= 34) {
                Z.p.a(textView, i12, f12);
            } else {
                AbstractC2292b.n(textView, Math.round(TypedValue.applyDimension(i12, f12, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i9) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, AbstractC2379a.f20961w);
        l5.k kVar = new l5.k(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f22597a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, kVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            U.d(textView, string);
        }
        kVar.j();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f22605j);
        }
    }

    public final void i(int i9, int i10, int i11, int i12) {
        C2596e0 c2596e0 = this.f22604i;
        if (c2596e0.j()) {
            DisplayMetrics displayMetrics = c2596e0.f22651j.getResources().getDisplayMetrics();
            c2596e0.k(TypedValue.applyDimension(i12, i9, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (c2596e0.h()) {
                c2596e0.a();
            }
        }
    }

    public final void j(int[] iArr, int i9) {
        C2596e0 c2596e0 = this.f22604i;
        if (c2596e0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i9 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2596e0.f22651j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i9, iArr[i10], displayMetrics));
                    }
                }
                c2596e0.f22647f = C2596e0.b(iArr2);
                if (!c2596e0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c2596e0.f22648g = false;
            }
            if (c2596e0.h()) {
                c2596e0.a();
            }
        }
    }

    public final void k(int i9) {
        C2596e0 c2596e0 = this.f22604i;
        if (c2596e0.j()) {
            if (i9 != 0) {
                if (i9 == 1) {
                    DisplayMetrics displayMetrics = c2596e0.f22651j.getResources().getDisplayMetrics();
                    c2596e0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c2596e0.h()) {
                        c2596e0.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Unknown auto-size text type: "));
            }
            c2596e0.f22643a = 0;
            c2596e0.f22645d = -1.0f;
            c2596e0.f22646e = -1.0f;
            c2596e0.f22644c = -1.0f;
            c2596e0.f22647f = new int[0];
            c2596e0.b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.A, java.lang.Object] */
    public final void l(ColorStateList colorStateList) {
        boolean z8;
        if (this.f22603h == null) {
            this.f22603h = new Object();
        }
        com.facebook.A a6 = this.f22603h;
        a6.f13377c = colorStateList;
        if (colorStateList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        a6.b = z8;
        this.b = a6;
        this.f22598c = a6;
        this.f22599d = a6;
        this.f22600e = a6;
        this.f22601f = a6;
        this.f22602g = a6;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.A, java.lang.Object] */
    public final void m(PorterDuff.Mode mode) {
        boolean z8;
        if (this.f22603h == null) {
            this.f22603h = new Object();
        }
        com.facebook.A a6 = this.f22603h;
        a6.f13378d = mode;
        if (mode != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        a6.f13376a = z8;
        this.b = a6;
        this.f22598c = a6;
        this.f22599d = a6;
        this.f22600e = a6;
        this.f22601f = a6;
        this.f22602g = a6;
    }

    public final void n(Context context, l5.k kVar) {
        String string;
        boolean z8;
        boolean z9;
        int i9 = this.f22605j;
        TypedArray typedArray = (TypedArray) kVar.b;
        this.f22605j = typedArray.getInt(2, i9);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f22606k = i11;
            if (i11 != -1) {
                this.f22605j &= 2;
            }
        }
        int i12 = 10;
        boolean z10 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f22606k;
        int i15 = this.f22605j;
        if (!context.isRestricted()) {
            try {
                Typeface g9 = kVar.g(i12, this.f22605j, new S(this, i14, i15, new WeakReference(this.f22597a)));
                if (g9 != null) {
                    if (i10 >= 28 && this.f22606k != -1) {
                        Typeface create = Typeface.create(g9, 0);
                        int i16 = this.f22606k;
                        if ((this.f22605j & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.l = V.a(create, i16, z9);
                    } else {
                        this.l = g9;
                    }
                }
                if (this.l == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.m = z8;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f22606k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f22606k;
                if ((this.f22605j & 2) != 0) {
                    z10 = true;
                }
                this.l = V.a(create2, i17, z10);
                return;
            }
            this.l = Typeface.create(string, this.f22605j);
        }
    }
}
