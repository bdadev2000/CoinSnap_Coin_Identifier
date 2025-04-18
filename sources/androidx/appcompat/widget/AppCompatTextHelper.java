package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class AppCompatTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1039a;

    /* renamed from: b, reason: collision with root package name */
    public TintInfo f1040b;

    /* renamed from: c, reason: collision with root package name */
    public TintInfo f1041c;
    public TintInfo d;
    public TintInfo e;

    /* renamed from: f, reason: collision with root package name */
    public TintInfo f1042f;

    /* renamed from: g, reason: collision with root package name */
    public TintInfo f1043g;

    /* renamed from: h, reason: collision with root package name */
    public TintInfo f1044h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextViewAutoSizeHelper f1045i;

    /* renamed from: j, reason: collision with root package name */
    public int f1046j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f1047k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f1048l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1049m;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api26Impl {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void b(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        @DoNotInline
        public static void c(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        @DoNotInline
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api28Impl {
        @DoNotInline
        public static Typeface a(Typeface typeface, int i2, boolean z2) {
            return Typeface.create(typeface, i2, z2);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f1039a = textView;
        this.f1045i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public static TintInfo c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList g2;
        synchronized (appCompatDrawableManager) {
            g2 = appCompatDrawableManager.f971a.g(i2, context);
        }
        if (g2 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        obj.f1233a = g2;
        return obj;
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, this.f1039a.getDrawableState());
    }

    public final void b() {
        TintInfo tintInfo = this.f1040b;
        TextView textView = this.f1039a;
        if (tintInfo != null || this.f1041c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1040b);
            a(compoundDrawables[1], this.f1041c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f1042f == null && this.f1043g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1042f);
        a(compoundDrawablesRelative[2], this.f1043g);
    }

    public final ColorStateList d() {
        TintInfo tintInfo = this.f1044h;
        if (tintInfo != null) {
            return tintInfo.f1233a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        TintInfo tintInfo = this.f1044h;
        if (tintInfo != null) {
            return tintInfo.f1234b;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int resourceId;
        int i7;
        TextView textView = this.f1039a;
        Context context = textView.getContext();
        AppCompatDrawableManager a2 = AppCompatDrawableManager.a();
        int[] iArr = R.styleable.f316h;
        TintTypedArray e = TintTypedArray.e(context, attributeSet, iArr, i2);
        ViewCompat.z(textView, textView.getContext(), iArr, attributeSet, e.f1237b, i2);
        TypedArray typedArray = e.f1237b;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1040b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1041c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f1042f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1043g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        e.f();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = R.styleable.x;
        if (resourceId2 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr2);
            TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            m(context, tintTypedArray);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i7 = 13;
            } else {
                i7 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i7) ? obtainStyledAttributes.getString(i7) : null;
            tintTypedArray.f();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        TintTypedArray tintTypedArray2 = new TintTypedArray(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z5 = z2;
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i8 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, tintTypedArray2);
        tintTypedArray2.f();
        if (!z4 && z3) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f1048l;
        if (typeface != null) {
            if (this.f1047k == -1) {
                textView.setTypeface(typeface, this.f1046j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            Api26Impl.d(textView, str);
        }
        if (str2 != null) {
            Api24Impl.b(textView, Api24Impl.a(str2));
        }
        int[] iArr3 = R.styleable.f317i;
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1045i;
        Context context2 = appCompatTextViewAutoSizeHelper.f1075j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = appCompatTextViewAutoSizeHelper.f1074i;
        ViewCompat.z(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i2);
        if (obtainStyledAttributes3.hasValue(5)) {
            appCompatTextViewAutoSizeHelper.f1068a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i9 = 0; i9 < length; i9++) {
                    iArr4[i9] = obtainTypedArray.getDimensionPixelSize(i9, -1);
                }
                appCompatTextViewAutoSizeHelper.f1071f = AppCompatTextViewAutoSizeHelper.b(iArr4);
                appCompatTextViewAutoSizeHelper.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!appCompatTextViewAutoSizeHelper.j()) {
            appCompatTextViewAutoSizeHelper.f1068a = 0;
        } else if (appCompatTextViewAutoSizeHelper.f1068a == 1) {
            if (!appCompatTextViewAutoSizeHelper.f1072g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                appCompatTextViewAutoSizeHelper.k(dimension2, dimension3, dimension);
            }
            appCompatTextViewAutoSizeHelper.h();
        }
        if (ViewUtils.f1297c && appCompatTextViewAutoSizeHelper.f1068a != 0) {
            int[] iArr5 = appCompatTextViewAutoSizeHelper.f1071f;
            if (iArr5.length > 0) {
                if (Api26Impl.a(textView) != -1.0f) {
                    Api26Impl.b(textView, Math.round(appCompatTextViewAutoSizeHelper.d), Math.round(appCompatTextViewAutoSizeHelper.e), Math.round(appCompatTextViewAutoSizeHelper.f1070c), 0);
                } else {
                    Api26Impl.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        TintTypedArray tintTypedArray3 = new TintTypedArray(context, obtainStyledAttributes4);
        int resourceId3 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId3 != -1 ? a2.b(context, resourceId3) : null;
        int resourceId4 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b3 = resourceId4 != -1 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b4 = resourceId5 != -1 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b5 = resourceId6 != -1 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b6 = resourceId7 != -1 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b7 = resourceId8 != -1 ? a2.b(context, resourceId8) : null;
        if (b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b6 == null) {
                b6 = compoundDrawablesRelative[0];
            }
            if (b3 == null) {
                b3 = compoundDrawablesRelative[1];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[2];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b6, b3, b7, b5);
        } else if (b2 != null || b3 != null || b4 != null || b5 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[2];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b5);
            } else {
                if (b3 == null) {
                    b3 = compoundDrawablesRelative2[1];
                }
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b3, compoundDrawablesRelative2[2], b5);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            TextViewCompat.b(textView, tintTypedArray3.a(11));
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            TextViewCompat.c(textView, DrawableUtils.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i4 = -1;
                f2 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i5 = -1;
            } else {
                int i10 = peekValue.data;
                i5 = i10 & 15;
                f2 = TypedValue.complexToFloat(i10);
                i4 = -1;
            }
        } else {
            i4 = -1;
            i5 = -1;
            f2 = -1.0f;
        }
        tintTypedArray3.f();
        if (dimensionPixelSize != i4) {
            TextViewCompat.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i4) {
            TextViewCompat.e(textView, dimensionPixelSize2);
        }
        if (f2 != -1.0f) {
            if (i5 == i4) {
                TextViewCompat.f(textView, (int) f2);
            } else {
                TextViewCompat.g(textView, i5, f2);
            }
        }
    }

    public final void g(int i2, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.x);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f1039a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, tintTypedArray);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            Api26Impl.d(textView, string);
        }
        tintTypedArray.f();
        Typeface typeface = this.f1048l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1046j);
        }
    }

    public final void h(int i2, int i3, int i4, int i5) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1045i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f1075j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void i(int[] iArr, int i2) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1045i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f1075j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                appCompatTextViewAutoSizeHelper.f1071f = AppCompatTextViewAutoSizeHelper.b(iArr2);
                if (!appCompatTextViewAutoSizeHelper.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                appCompatTextViewAutoSizeHelper.f1072g = false;
            }
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void j(int i2) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1045i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            if (i2 == 0) {
                appCompatTextViewAutoSizeHelper.f1068a = 0;
                appCompatTextViewAutoSizeHelper.d = -1.0f;
                appCompatTextViewAutoSizeHelper.e = -1.0f;
                appCompatTextViewAutoSizeHelper.f1070c = -1.0f;
                appCompatTextViewAutoSizeHelper.f1071f = new int[0];
                appCompatTextViewAutoSizeHelper.f1069b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(android.support.v4.media.d.i("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f1075j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public final void k(ColorStateList colorStateList) {
        if (this.f1044h == null) {
            this.f1044h = new Object();
        }
        TintInfo tintInfo = this.f1044h;
        tintInfo.f1233a = colorStateList;
        tintInfo.d = colorStateList != null;
        this.f1040b = tintInfo;
        this.f1041c = tintInfo;
        this.d = tintInfo;
        this.e = tintInfo;
        this.f1042f = tintInfo;
        this.f1043g = tintInfo;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public final void l(PorterDuff.Mode mode) {
        if (this.f1044h == null) {
            this.f1044h = new Object();
        }
        TintInfo tintInfo = this.f1044h;
        tintInfo.f1234b = mode;
        tintInfo.f1235c = mode != null;
        this.f1040b = tintInfo;
        this.f1041c = tintInfo;
        this.d = tintInfo;
        this.e = tintInfo;
        this.f1042f = tintInfo;
        this.f1043g = tintInfo;
    }

    public final void m(Context context, TintTypedArray tintTypedArray) {
        String string;
        int i2 = this.f1046j;
        TypedArray typedArray = tintTypedArray.f1237b;
        this.f1046j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f1047k = i4;
            if (i4 != -1) {
                this.f1046j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1049m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f1048l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f1048l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f1048l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1048l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        final int i7 = this.f1047k;
        final int i8 = this.f1046j;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.f1039a);
            try {
                Typeface d = tintTypedArray.d(i6, this.f1046j, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void onFontRetrievalFailed(int i9) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void onFontRetrieved(final Typeface typeface) {
                        int i9;
                        if (Build.VERSION.SDK_INT >= 28 && (i9 = i7) != -1) {
                            typeface = Api28Impl.a(typeface, i9, (i8 & 2) != 0);
                        }
                        AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
                        if (appCompatTextHelper.f1049m) {
                            appCompatTextHelper.f1048l = typeface;
                            final TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                if (!textView.isAttachedToWindow()) {
                                    textView.setTypeface(typeface, appCompatTextHelper.f1046j);
                                } else {
                                    final int i10 = appCompatTextHelper.f1046j;
                                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            textView.setTypeface(typeface, i10);
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
                if (d != null) {
                    if (i3 < 28 || this.f1047k == -1) {
                        this.f1048l = d;
                    } else {
                        this.f1048l = Api28Impl.a(Typeface.create(d, 0), this.f1047k, (this.f1046j & 2) != 0);
                    }
                }
                this.f1049m = this.f1048l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1048l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1047k == -1) {
            this.f1048l = Typeface.create(string, this.f1046j);
        } else {
            this.f1048l = Api28Impl.a(Typeface.create(string, 0), this.f1047k, (this.f1046j & 2) != 0);
        }
    }
}
