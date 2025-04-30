package com.google.android.material.textfield;

import B3.d;
import I.h;
import L.c;
import L3.b;
import M0.C0217h;
import M0.C0219j;
import R3.e;
import R3.f;
import R3.g;
import R3.j;
import R3.k;
import U3.A;
import U3.B;
import U3.m;
import U3.o;
import U3.r;
import U3.s;
import U3.v;
import U3.x;
import U3.y;
import U3.z;
import W3.a;
import a.AbstractC0325a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import b0.AbstractC0547b;
import com.facebook.appevents.n;
import com.google.android.material.internal.CheckableImageButton;
import g4.AbstractC2292b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import n1.C2475f;
import q.AbstractC2610l0;
import q.C2624t;
import q.J0;
import w3.AbstractC2861a;
import x0.AbstractC2914a;
import x3.AbstractC2920a;
import y2.AbstractC2947c;
import z2.i;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: E0, reason: collision with root package name */
    public static final int[][] f14131E0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f14132A;

    /* renamed from: A0, reason: collision with root package name */
    public ValueAnimator f14133A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f14134B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f14135B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f14136C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f14137C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f14138D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f14139D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f14140E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f14141F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14142G;

    /* renamed from: H, reason: collision with root package name */
    public g f14143H;

    /* renamed from: I, reason: collision with root package name */
    public g f14144I;

    /* renamed from: J, reason: collision with root package name */
    public StateListDrawable f14145J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f14146K;

    /* renamed from: L, reason: collision with root package name */
    public g f14147L;

    /* renamed from: M, reason: collision with root package name */
    public g f14148M;

    /* renamed from: N, reason: collision with root package name */
    public k f14149N;
    public boolean O;

    /* renamed from: P, reason: collision with root package name */
    public final int f14150P;

    /* renamed from: Q, reason: collision with root package name */
    public int f14151Q;

    /* renamed from: R, reason: collision with root package name */
    public int f14152R;

    /* renamed from: S, reason: collision with root package name */
    public int f14153S;

    /* renamed from: T, reason: collision with root package name */
    public int f14154T;

    /* renamed from: U, reason: collision with root package name */
    public int f14155U;

    /* renamed from: V, reason: collision with root package name */
    public int f14156V;

    /* renamed from: W, reason: collision with root package name */
    public int f14157W;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f14158a0;
    public final FrameLayout b;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f14159b0;

    /* renamed from: c, reason: collision with root package name */
    public final x f14160c;

    /* renamed from: c0, reason: collision with root package name */
    public final RectF f14161c0;

    /* renamed from: d, reason: collision with root package name */
    public final o f14162d;

    /* renamed from: d0, reason: collision with root package name */
    public Typeface f14163d0;

    /* renamed from: e0, reason: collision with root package name */
    public ColorDrawable f14164e0;

    /* renamed from: f, reason: collision with root package name */
    public EditText f14165f;
    public int f0;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f14166g;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f14167g0;

    /* renamed from: h, reason: collision with root package name */
    public int f14168h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorDrawable f14169h0;

    /* renamed from: i, reason: collision with root package name */
    public int f14170i;

    /* renamed from: i0, reason: collision with root package name */
    public int f14171i0;

    /* renamed from: j, reason: collision with root package name */
    public int f14172j;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f14173j0;

    /* renamed from: k, reason: collision with root package name */
    public int f14174k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f14175k0;
    public final s l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f14176l0;
    public boolean m;

    /* renamed from: m0, reason: collision with root package name */
    public int f14177m0;

    /* renamed from: n, reason: collision with root package name */
    public int f14178n;

    /* renamed from: n0, reason: collision with root package name */
    public int f14179n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14180o;

    /* renamed from: o0, reason: collision with root package name */
    public int f14181o0;

    /* renamed from: p, reason: collision with root package name */
    public A f14182p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f14183p0;

    /* renamed from: q, reason: collision with root package name */
    public AppCompatTextView f14184q;

    /* renamed from: q0, reason: collision with root package name */
    public int f14185q0;

    /* renamed from: r, reason: collision with root package name */
    public int f14186r;

    /* renamed from: r0, reason: collision with root package name */
    public int f14187r0;

    /* renamed from: s, reason: collision with root package name */
    public int f14188s;

    /* renamed from: s0, reason: collision with root package name */
    public int f14189s0;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f14190t;

    /* renamed from: t0, reason: collision with root package name */
    public int f14191t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14192u;

    /* renamed from: u0, reason: collision with root package name */
    public int f14193u0;

    /* renamed from: v, reason: collision with root package name */
    public AppCompatTextView f14194v;

    /* renamed from: v0, reason: collision with root package name */
    public int f14195v0;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f14196w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f14197w0;

    /* renamed from: x, reason: collision with root package name */
    public int f14198x;

    /* renamed from: x0, reason: collision with root package name */
    public final b f14199x0;

    /* renamed from: y, reason: collision with root package name */
    public C0217h f14200y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f14201y0;

    /* renamed from: z, reason: collision with root package name */
    public C0217h f14202z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f14203z0;

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.textInputStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_Design_TextInputLayout), attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.textInputStyle);
        this.f14168h = -1;
        this.f14170i = -1;
        this.f14172j = -1;
        this.f14174k = -1;
        this.l = new s(this);
        this.f14182p = new A4.a(16);
        this.f14158a0 = new Rect();
        this.f14159b0 = new Rect();
        this.f14161c0 = new RectF();
        this.f14167g0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f14199x0 = bVar;
        this.f14139D0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC2920a.f24226a;
        bVar.f1740Q = linearInterpolator;
        bVar.h(false);
        bVar.f1739P = linearInterpolator;
        bVar.h(false);
        if (bVar.f1760g != 8388659) {
            bVar.f1760g = 8388659;
            bVar.h(false);
        }
        int[] iArr = AbstractC2861a.f23660B;
        L3.k.a(context2, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.textInputStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_Design_TextInputLayout);
        L3.k.b(context2, attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.textInputStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.textInputStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_Design_TextInputLayout);
        l5.k kVar = new l5.k(context2, obtainStyledAttributes);
        x xVar = new x(this, kVar);
        this.f14160c = xVar;
        this.f14140E = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f14203z0 = obtainStyledAttributes.getBoolean(47, true);
        this.f14201y0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f14149N = k.b(context2, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.textInputStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_Design_TextInputLayout).a();
        this.f14150P = context2.getResources().getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f14152R = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f14154T = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f14155U = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f14153S = this.f14154T;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e4 = this.f14149N.e();
        if (dimension >= 0.0f) {
            e4.f2685e = new R3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e4.f2686f = new R3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e4.f2687g = new R3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e4.f2688h = new R3.a(dimension4);
        }
        this.f14149N = e4.a();
        ColorStateList q9 = android.support.v4.media.session.a.q(context2, kVar, 7);
        if (q9 != null) {
            int defaultColor = q9.getDefaultColor();
            this.f14185q0 = defaultColor;
            this.f14157W = defaultColor;
            if (q9.isStateful()) {
                this.f14187r0 = q9.getColorForState(new int[]{-16842910}, -1);
                this.f14189s0 = q9.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f14191t0 = q9.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f14189s0 = this.f14185q0;
                ColorStateList colorStateList = h.getColorStateList(context2, com.tools.arruler.photomeasure.camera.ruler.R.color.mtrl_filled_background_color);
                this.f14187r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f14191t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f14157W = 0;
            this.f14185q0 = 0;
            this.f14187r0 = 0;
            this.f14189s0 = 0;
            this.f14191t0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList d2 = kVar.d(1);
            this.f14176l0 = d2;
            this.f14175k0 = d2;
        }
        ColorStateList q10 = android.support.v4.media.session.a.q(context2, kVar, 14);
        this.f14181o0 = obtainStyledAttributes.getColor(14, 0);
        this.f14177m0 = h.getColor(context2, com.tools.arruler.photomeasure.camera.ruler.R.color.mtrl_textinput_default_box_stroke_color);
        this.f14193u0 = h.getColor(context2, com.tools.arruler.photomeasure.camera.ruler.R.color.mtrl_textinput_disabled_color);
        this.f14179n0 = h.getColor(context2, com.tools.arruler.photomeasure.camera.ruler.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (q10 != null) {
            setBoxStrokeColorStateList(q10);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(android.support.v4.media.session.a.q(context2, kVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f14136C = kVar.d(24);
        this.f14138D = kVar.d(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i9 = obtainStyledAttributes.getInt(34, 1);
        boolean z8 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z9 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z10 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f14188s = obtainStyledAttributes.getResourceId(22, 0);
        this.f14186r = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i9);
        setCounterOverflowTextAppearance(this.f14186r);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f14188s);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(kVar.d(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(kVar.d(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(kVar.d(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(kVar.d(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(kVar.d(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(kVar.d(58));
        }
        o oVar = new o(this, kVar);
        this.f14162d = oVar;
        boolean z11 = obtainStyledAttributes.getBoolean(0, true);
        kVar.j();
        ViewCompat.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout.addView(xVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(z11);
        setHelperTextEnabled(z9);
        setErrorEnabled(z8);
        setCounterEnabled(z10);
        setHelperText(text2);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        int i9;
        EditText editText = this.f14165f;
        if ((editText instanceof AutoCompleteTextView) && !AbstractC2292b.f(editText)) {
            int q9 = C0219j.q(this.f14165f, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorControlHighlight);
            int i10 = this.f14151Q;
            int[][] iArr = f14131E0;
            if (i10 == 2) {
                Context context = getContext();
                g gVar = this.f14143H;
                TypedValue p2 = AbstractC0325a.p(context, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorSurface, "TextInputLayout");
                int i11 = p2.resourceId;
                if (i11 != 0) {
                    i9 = h.getColor(context, i11);
                } else {
                    i9 = p2.data;
                }
                g gVar2 = new g(gVar.b.f2643a);
                int u8 = C0219j.u(0.1f, q9, i9);
                gVar2.k(new ColorStateList(iArr, new int[]{u8, 0}));
                gVar2.setTint(i9);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{u8, i9});
                g gVar3 = new g(gVar.b.f2643a);
                gVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
            }
            if (i10 == 1) {
                g gVar4 = this.f14143H;
                int i12 = this.f14157W;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{C0219j.u(0.1f, q9, i12), i12}), gVar4, gVar4);
            }
            return null;
        }
        return this.f14143H;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f14145J == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f14145J = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f14145J.addState(new int[0], f(false));
        }
        return this.f14145J;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f14144I == null) {
            this.f14144I = f(true);
        }
        return this.f14144I;
    }

    public static void k(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z8);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f14165f == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f14165f = editText;
            int i9 = this.f14168h;
            if (i9 != -1) {
                setMinEms(i9);
            } else {
                setMinWidth(this.f14172j);
            }
            int i10 = this.f14170i;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.f14174k);
            }
            this.f14146K = false;
            i();
            setTextInputAccessibilityDelegate(new z(this));
            Typeface typeface = this.f14165f.getTypeface();
            b bVar = this.f14199x0;
            bVar.m(typeface);
            float textSize = this.f14165f.getTextSize();
            if (bVar.f1761h != textSize) {
                bVar.f1761h = textSize;
                bVar.h(false);
            }
            int i11 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f14165f.getLetterSpacing();
            if (bVar.f1746W != letterSpacing) {
                bVar.f1746W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.f14165f.getGravity();
            int i12 = (gravity & (-113)) | 48;
            if (bVar.f1760g != i12) {
                bVar.f1760g = i12;
                bVar.h(false);
            }
            if (bVar.f1759f != gravity) {
                bVar.f1759f = gravity;
                bVar.h(false);
            }
            this.f14195v0 = ViewCompat.getMinimumHeight(editText);
            this.f14165f.addTextChangedListener(new y(this, editText));
            if (this.f14175k0 == null) {
                this.f14175k0 = this.f14165f.getHintTextColors();
            }
            if (this.f14140E) {
                if (TextUtils.isEmpty(this.f14141F)) {
                    CharSequence hint = this.f14165f.getHint();
                    this.f14166g = hint;
                    setHint(hint);
                    this.f14165f.setHint((CharSequence) null);
                }
                this.f14142G = true;
            }
            if (i11 >= 29) {
                p();
            }
            if (this.f14184q != null) {
                n(this.f14165f.getText());
            }
            r();
            this.l.b();
            this.f14160c.bringToFront();
            o oVar = this.f14162d;
            oVar.bringToFront();
            Iterator it = this.f14167g0.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(this);
            }
            oVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f14141F)) {
            this.f14141F = charSequence;
            b bVar = this.f14199x0;
            if (charSequence == null || !TextUtils.equals(bVar.f1725A, charSequence)) {
                bVar.f1725A = charSequence;
                bVar.f1726B = null;
                Bitmap bitmap = bVar.f1729E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f1729E = null;
                }
                bVar.h(false);
            }
            if (!this.f14197w0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f14192u == z8) {
            return;
        }
        if (z8) {
            AppCompatTextView appCompatTextView = this.f14194v;
            if (appCompatTextView != null) {
                this.b.addView(appCompatTextView);
                this.f14194v.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f14194v;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f14194v = null;
        }
        this.f14192u = z8;
    }

    public final void a(float f9) {
        int i9 = 1;
        b bVar = this.f14199x0;
        if (bVar.b == f9) {
            return;
        }
        if (this.f14133A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f14133A0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC2947c.v(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.attr.motionEasingEmphasizedInterpolator, AbstractC2920a.b));
            this.f14133A0.setDuration(AbstractC2947c.u(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.attr.motionDurationMedium4, 167));
            this.f14133A0.addUpdateListener(new d(this, i9));
        }
        this.f14133A0.setFloatValues(bVar.b, f9);
        this.f14133A0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.b;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i9, layoutParams);
    }

    public final void b() {
        ColorStateList valueOf;
        int i9;
        int i10;
        g gVar = this.f14143H;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.b.f2643a;
        k kVar2 = this.f14149N;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f14151Q == 2 && (i9 = this.f14153S) > -1 && (i10 = this.f14156V) != 0) {
            g gVar2 = this.f14143H;
            gVar2.b.f2652k = i9;
            gVar2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i10);
            f fVar = gVar2.b;
            if (fVar.f2645d != valueOf2) {
                fVar.f2645d = valueOf2;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i11 = this.f14157W;
        if (this.f14151Q == 1) {
            i11 = c.b(this.f14157W, C0219j.p(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.attr.colorSurface, 0));
        }
        this.f14157W = i11;
        this.f14143H.k(ColorStateList.valueOf(i11));
        g gVar3 = this.f14147L;
        if (gVar3 != null && this.f14148M != null) {
            if (this.f14153S > -1 && this.f14156V != 0) {
                if (this.f14165f.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f14177m0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f14156V);
                }
                gVar3.k(valueOf);
                this.f14148M.k(ColorStateList.valueOf(this.f14156V));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f14140E) {
            return 0;
        }
        int i9 = this.f14151Q;
        b bVar = this.f14199x0;
        if (i9 != 0) {
            if (i9 != 2) {
                return 0;
            }
            d2 = bVar.d() / 2.0f;
        } else {
            d2 = bVar.d();
        }
        return (int) d2;
    }

    public final C0217h d() {
        C0217h c0217h = new C0217h();
        c0217h.f1920d = AbstractC2947c.u(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.attr.motionDurationShort2, 87);
        c0217h.f1921f = AbstractC2947c.v(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.attr.motionEasingLinearInterpolator, AbstractC2920a.f24226a);
        return c0217h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i9) {
        EditText editText = this.f14165f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i9);
            return;
        }
        if (this.f14166g != null) {
            boolean z8 = this.f14142G;
            this.f14142G = false;
            CharSequence hint = editText.getHint();
            this.f14165f.setHint(this.f14166g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i9);
                return;
            } finally {
                this.f14165f.setHint(hint);
                this.f14142G = z8;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i9);
        onProvideAutofillVirtualStructure(viewStructure, i9);
        FrameLayout frameLayout = this.b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure newChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(newChild, i9);
            if (childAt == this.f14165f) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f14137C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f14137C0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i9;
        super.draw(canvas);
        boolean z8 = this.f14140E;
        b bVar = this.f14199x0;
        if (z8) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f1726B != null) {
                RectF rectF = bVar.f1757e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f1738N;
                    textPaint.setTextSize(bVar.f1731G);
                    float f9 = bVar.f1767p;
                    float f10 = bVar.f1768q;
                    float f11 = bVar.f1730F;
                    if (f11 != 1.0f) {
                        canvas.scale(f11, f11, f9, f10);
                    }
                    if (bVar.f1756d0 > 1 && !bVar.f1727C) {
                        float lineStart = bVar.f1767p - bVar.f1748Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f10);
                        float f12 = alpha;
                        textPaint.setAlpha((int) (bVar.f1752b0 * f12));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            float f13 = bVar.f1732H;
                            float f14 = bVar.f1733I;
                            float f15 = bVar.f1734J;
                            int i11 = bVar.f1735K;
                            textPaint.setShadowLayer(f13, f14, f15, c.d(i11, (textPaint.getAlpha() * Color.alpha(i11)) / 255));
                        }
                        bVar.f1748Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f1751a0 * f12));
                        if (i10 >= 31) {
                            float f16 = bVar.f1732H;
                            float f17 = bVar.f1733I;
                            float f18 = bVar.f1734J;
                            int i12 = bVar.f1735K;
                            textPaint.setShadowLayer(f16, f17, f18, c.d(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f1748Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f1754c0;
                        float f19 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f19, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(bVar.f1732H, bVar.f1733I, bVar.f1734J, bVar.f1735K);
                        }
                        String trim = bVar.f1754c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i9 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i9 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f1748Y.getLineEnd(i9), str.length()), 0.0f, f19, (Paint) textPaint);
                    } else {
                        canvas.translate(f9, f10);
                        bVar.f1748Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f14148M != null && (gVar = this.f14147L) != null) {
            gVar.draw(canvas);
            if (this.f14165f.isFocused()) {
                Rect bounds = this.f14148M.getBounds();
                Rect bounds2 = this.f14147L.getBounds();
                float f20 = bVar.b;
                int centerX = bounds2.centerX();
                bounds.left = AbstractC2920a.c(f20, centerX, bounds2.left);
                bounds.right = AbstractC2920a.c(f20, centerX, bounds2.right);
                this.f14148M.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f14135B0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f14135B0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            L3.b r3 = r4.f14199x0
            if (r3 == 0) goto L2f
            r3.f1736L = r1
            android.content.res.ColorStateList r1 = r3.f1764k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1763j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f14165f
            if (r3 == 0) goto L45
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r4)
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.u(r0, r2)
        L45:
            r4.r()
            r4.x()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.f14135B0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (this.f14140E && !TextUtils.isEmpty(this.f14141F) && (this.f14143H instanceof U3.g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [R3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [y8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [y8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [y8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [y8.a, java.lang.Object] */
    public final g f(boolean z8) {
        float f9;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i9;
        int i10 = 0;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_shape_corner_size_small_component);
        if (z8) {
            f9 = dimensionPixelOffset2;
        } else {
            f9 = 0.0f;
        }
        EditText editText = this.f14165f;
        if (editText instanceof v) {
            dimensionPixelOffset = ((v) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e eVar = new e(i10);
        e eVar2 = new e(i10);
        e eVar3 = new e(i10);
        e eVar4 = new e(i10);
        R3.a aVar = new R3.a(f9);
        R3.a aVar2 = new R3.a(f9);
        R3.a aVar3 = new R3.a(dimensionPixelOffset2);
        R3.a aVar4 = new R3.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f2692a = obj;
        obj5.b = obj2;
        obj5.f2693c = obj3;
        obj5.f2694d = obj4;
        obj5.f2695e = aVar;
        obj5.f2696f = aVar2;
        obj5.f2697g = aVar4;
        obj5.f2698h = aVar3;
        obj5.f2699i = eVar;
        obj5.f2700j = eVar2;
        obj5.f2701k = eVar3;
        obj5.l = eVar4;
        EditText editText2 = this.f14165f;
        if (editText2 instanceof v) {
            colorStateList = ((v) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g.f2661y;
            TypedValue p2 = AbstractC0325a.p(context, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorSurface, g.class.getSimpleName());
            int i11 = p2.resourceId;
            if (i11 != 0) {
                i9 = h.getColor(context, i11);
            } else {
                i9 = p2.data;
            }
            colorStateList = ColorStateList.valueOf(i9);
        }
        g gVar = new g();
        gVar.i(context);
        gVar.k(colorStateList);
        gVar.j(dimensionPixelOffset);
        gVar.setShapeAppearanceModel(obj5);
        f fVar = gVar.b;
        if (fVar.f2649h == null) {
            fVar.f2649h = new Rect();
        }
        gVar.b.f2649h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i9, boolean z8) {
        int compoundPaddingLeft;
        if (!z8 && getPrefixText() != null) {
            compoundPaddingLeft = this.f14160c.a();
        } else if (z8 && getSuffixText() != null) {
            compoundPaddingLeft = this.f14162d.c();
        } else {
            compoundPaddingLeft = this.f14165f.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i9;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f14165f;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    @NonNull
    public g getBoxBackground() {
        int i9 = this.f14151Q;
        if (i9 != 1 && i9 != 2) {
            throw new IllegalStateException();
        }
        return this.f14143H;
    }

    public int getBoxBackgroundColor() {
        return this.f14157W;
    }

    public int getBoxBackgroundMode() {
        return this.f14151Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f14152R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e4 = L3.k.e(this);
        RectF rectF = this.f14161c0;
        if (e4) {
            return this.f14149N.f2698h.a(rectF);
        }
        return this.f14149N.f2697g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e4 = L3.k.e(this);
        RectF rectF = this.f14161c0;
        if (e4) {
            return this.f14149N.f2697g.a(rectF);
        }
        return this.f14149N.f2698h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e4 = L3.k.e(this);
        RectF rectF = this.f14161c0;
        if (e4) {
            return this.f14149N.f2695e.a(rectF);
        }
        return this.f14149N.f2696f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e4 = L3.k.e(this);
        RectF rectF = this.f14161c0;
        if (e4) {
            return this.f14149N.f2696f.a(rectF);
        }
        return this.f14149N.f2695e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f14181o0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f14183p0;
    }

    public int getBoxStrokeWidth() {
        return this.f14154T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f14155U;
    }

    public int getCounterMaxLength() {
        return this.f14178n;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.m && this.f14180o && (appCompatTextView = this.f14184q) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f14134B;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f14132A;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.f14136C;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.f14138D;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f14175k0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f14165f;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f14162d.f3174i.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f14162d.f3174i.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f14162d.f3178o;
    }

    public int getEndIconMode() {
        return this.f14162d.f3176k;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f14162d.f3179p;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f14162d.f3174i;
    }

    @Nullable
    public CharSequence getError() {
        s sVar = this.l;
        if (sVar.f3211q) {
            return sVar.f3210p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.l.f3214t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.l.f3213s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.l.f3212r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f14162d.f3170d.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        s sVar = this.l;
        if (sVar.f3218x) {
            return sVar.f3217w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.l.f3219y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f14140E) {
            return this.f14141F;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f14199x0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f14199x0;
        return bVar.e(bVar.f1764k);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f14176l0;
    }

    @NonNull
    public A getLengthCounter() {
        return this.f14182p;
    }

    public int getMaxEms() {
        return this.f14170i;
    }

    public int getMaxWidth() {
        return this.f14174k;
    }

    public int getMinEms() {
        return this.f14168h;
    }

    public int getMinWidth() {
        return this.f14172j;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f14162d.f3174i.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f14162d.f3174i.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f14192u) {
            return this.f14190t;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f14198x;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f14196w;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f14160c.f3234d;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f14160c.f3233c.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f14160c.f3233c;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f14149N;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f14160c.f3235f.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f14160c.f3235f.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f14160c.f3238i;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f14160c.f3239j;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f14162d.f3181r;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f14162d.f3182s.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f14162d.f3182s;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f14163d0;
    }

    public final int h(int i9, boolean z8) {
        int compoundPaddingRight;
        if (!z8 && getSuffixText() != null) {
            compoundPaddingRight = this.f14162d.c();
        } else if (z8 && getPrefixText() != null) {
            compoundPaddingRight = this.f14160c.a();
        } else {
            compoundPaddingRight = this.f14165f.getCompoundPaddingRight();
        }
        return i9 - compoundPaddingRight;
    }

    public final void i() {
        int i9 = this.f14151Q;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    if (this.f14140E && !(this.f14143H instanceof U3.g)) {
                        k kVar = this.f14149N;
                        int i10 = U3.g.f3150A;
                        if (kVar == null) {
                            kVar = new k();
                        }
                        this.f14143H = new U3.g(new U3.f(kVar, new RectF()));
                    } else {
                        this.f14143H = new g(this.f14149N);
                    }
                    this.f14147L = null;
                    this.f14148M = null;
                } else {
                    throw new IllegalArgumentException(AbstractC2914a.g(new StringBuilder(), this.f14151Q, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f14143H = new g(this.f14149N);
                this.f14147L = new g();
                this.f14148M = new g();
            }
        } else {
            this.f14143H = null;
            this.f14147L = null;
            this.f14148M = null;
        }
        s();
        x();
        if (this.f14151Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f14152R = getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (android.support.v4.media.session.a.u(getContext())) {
                this.f14152R = getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f14165f != null && this.f14151Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f14165f;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.f14165f), getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (android.support.v4.media.session.a.u(getContext())) {
                EditText editText2 = this.f14165f;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.f14165f), getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f14151Q != 0) {
            t();
        }
        EditText editText3 = this.f14165f;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f14151Q;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f9;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int i9;
        int i10;
        if (!e()) {
            return;
        }
        int width = this.f14165f.getWidth();
        int gravity = this.f14165f.getGravity();
        b bVar = this.f14199x0;
        boolean b = bVar.b(bVar.f1725A);
        bVar.f1727C = b;
        Rect rect = bVar.f1755d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b) {
                    f9 = rect.right;
                    f10 = bVar.f1749Z;
                } else {
                    i10 = rect.left;
                    f11 = i10;
                }
            } else if (b) {
                i10 = rect.left;
                f11 = i10;
            } else {
                f9 = rect.right;
                f10 = bVar.f1749Z;
            }
            float max = Math.max(f11, rect.left);
            rectF = this.f14161c0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (bVar.f1727C) {
                        i9 = rect.right;
                        f12 = i9;
                    } else {
                        f12 = bVar.f1749Z + max;
                    }
                } else if (bVar.f1727C) {
                    f12 = max + bVar.f1749Z;
                } else {
                    i9 = rect.right;
                    f12 = i9;
                }
            } else {
                f12 = (width / 2.0f) + (bVar.f1749Z / 2.0f);
            }
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f13 = rectF.left;
                float f14 = this.f14150P;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f14153S);
                U3.g gVar = (U3.g) this.f14143H;
                gVar.getClass();
                gVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f9 = width / 2.0f;
        f10 = bVar.f1749Z / 2.0f;
        f11 = f9 - f10;
        float max2 = Math.max(f11, rect.left);
        rectF = this.f14161c0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f12 = (width / 2.0f) + (bVar.f1749Z / 2.0f);
        rectF.right = Math.min(f12, rect.right);
        rectF.bottom = bVar.d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void l(TextView textView, int i9) {
        try {
            textView.setTextAppearance(i9);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.tools.arruler.photomeasure.camera.ruler.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(h.getColor(getContext(), com.tools.arruler.photomeasure.camera.ruler.R.color.design_error));
    }

    public final boolean m() {
        s sVar = this.l;
        if (sVar.f3209o == 1 && sVar.f3212r != null && !TextUtils.isEmpty(sVar.f3210p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i9;
        boolean z8;
        int i10;
        R.b bVar;
        ((A4.a) this.f14182p).getClass();
        if (editable != null) {
            i9 = editable.length();
        } else {
            i9 = 0;
        }
        boolean z9 = this.f14180o;
        int i11 = this.f14178n;
        String str = null;
        if (i11 == -1) {
            this.f14184q.setText(String.valueOf(i9));
            this.f14184q.setContentDescription(null);
            this.f14180o = false;
        } else {
            if (i9 > i11) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f14180o = z8;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f14184q;
            int i12 = this.f14178n;
            if (this.f14180o) {
                i10 = com.tools.arruler.photomeasure.camera.ruler.R.string.character_counter_overflowed_content_description;
            } else {
                i10 = com.tools.arruler.photomeasure.camera.ruler.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i10, Integer.valueOf(i9), Integer.valueOf(i12)));
            if (z9 != this.f14180o) {
                o();
            }
            String str2 = R.b.f2602d;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = R.b.f2605g;
            } else {
                bVar = R.b.f2604f;
            }
            AppCompatTextView appCompatTextView2 = this.f14184q;
            String string = getContext().getString(com.tools.arruler.photomeasure.camera.ruler.R.string.character_counter_pattern, Integer.valueOf(i9), Integer.valueOf(this.f14178n));
            if (string == null) {
                bVar.getClass();
            } else {
                B3.e eVar = bVar.f2607c;
                str = bVar.c(string).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f14165f != null && z9 != this.f14180o) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i9;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f14184q;
        if (appCompatTextView != null) {
            if (this.f14180o) {
                i9 = this.f14186r;
            } else {
                i9 = this.f14188s;
            }
            l(appCompatTextView, i9);
            if (!this.f14180o && (colorStateList2 = this.f14132A) != null) {
                this.f14184q.setTextColor(colorStateList2);
            }
            if (this.f14180o && (colorStateList = this.f14134B) != null) {
                this.f14184q.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14199x0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        o oVar = this.f14162d;
        oVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z8 = false;
        this.f14139D0 = false;
        if (this.f14165f != null && this.f14165f.getMeasuredHeight() < (max = Math.max(oVar.getMeasuredHeight(), this.f14160c.getMeasuredHeight()))) {
            this.f14165f.setMinimumHeight(max);
            z8 = true;
        }
        boolean q9 = q();
        if (z8 || q9) {
            this.f14165f.post(new D3.b(this, 9));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z8, i9, i10, i11, i12);
        EditText editText = this.f14165f;
        if (editText != null) {
            ThreadLocal threadLocal = L3.c.f1778a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f14158a0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = L3.c.f1778a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            L3.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = L3.c.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f14147L;
            if (gVar != null) {
                int i13 = rect.bottom;
                gVar.setBounds(rect.left, i13 - this.f14154T, rect.right, i13);
            }
            g gVar2 = this.f14148M;
            if (gVar2 != null) {
                int i14 = rect.bottom;
                gVar2.setBounds(rect.left, i14 - this.f14155U, rect.right, i14);
            }
            if (this.f14140E) {
                float textSize = this.f14165f.getTextSize();
                b bVar = this.f14199x0;
                if (bVar.f1761h != textSize) {
                    bVar.f1761h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f14165f.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (bVar.f1760g != i15) {
                    bVar.f1760g = i15;
                    bVar.h(false);
                }
                if (bVar.f1759f != gravity) {
                    bVar.f1759f = gravity;
                    bVar.h(false);
                }
                if (this.f14165f != null) {
                    boolean e4 = L3.k.e(this);
                    int i16 = rect.bottom;
                    Rect rect2 = this.f14159b0;
                    rect2.bottom = i16;
                    int i17 = this.f14151Q;
                    if (i17 != 1) {
                        if (i17 != 2) {
                            rect2.left = g(rect.left, e4);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, e4);
                        } else {
                            rect2.left = this.f14165f.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f14165f.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, e4);
                        rect2.top = rect.top + this.f14152R;
                        rect2.right = h(rect.right, e4);
                    }
                    int i18 = rect2.left;
                    int i19 = rect2.top;
                    int i20 = rect2.right;
                    int i21 = rect2.bottom;
                    Rect rect3 = bVar.f1755d;
                    if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                        rect3.set(i18, i19, i20, i21);
                        bVar.f1737M = true;
                    }
                    if (this.f14165f != null) {
                        TextPaint textPaint = bVar.O;
                        textPaint.setTextSize(bVar.f1761h);
                        textPaint.setTypeface(bVar.f1772u);
                        textPaint.setLetterSpacing(bVar.f1746W);
                        float f9 = -textPaint.ascent();
                        rect2.left = this.f14165f.getCompoundPaddingLeft() + rect.left;
                        if (this.f14151Q == 1 && this.f14165f.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f9 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f14165f.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f14165f.getCompoundPaddingRight();
                        if (this.f14151Q == 1 && this.f14165f.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect2.top + f9);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f14165f.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i22 = rect2.left;
                        int i23 = rect2.top;
                        int i24 = rect2.right;
                        Rect rect4 = bVar.f1753c;
                        if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                            rect4.set(i22, i23, i24, compoundPaddingBottom);
                            bVar.f1737M = true;
                        }
                        bVar.h(false);
                        if (e() && !this.f14197w0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        EditText editText;
        super.onMeasure(i9, i10);
        boolean z8 = this.f14139D0;
        o oVar = this.f14162d;
        if (!z8) {
            oVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f14139D0 = true;
        }
        if (this.f14194v != null && (editText = this.f14165f) != null) {
            this.f14194v.setGravity(editText.getGravity());
            this.f14194v.setPadding(this.f14165f.getCompoundPaddingLeft(), this.f14165f.getCompoundPaddingTop(), this.f14165f.getCompoundPaddingRight(), this.f14165f.getCompoundPaddingBottom());
        }
        oVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        B b = (B) parcelable;
        super.onRestoreInstanceState(b.b);
        setError(b.f3136d);
        if (b.f3137f) {
            post(new B3.k(this, 5));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [R3.k, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        boolean z8 = true;
        if (i9 != 1) {
            z8 = false;
        }
        if (z8 != this.O) {
            R3.c cVar = this.f14149N.f2695e;
            RectF rectF = this.f14161c0;
            float a6 = cVar.a(rectF);
            float a9 = this.f14149N.f2696f.a(rectF);
            float a10 = this.f14149N.f2698h.a(rectF);
            float a11 = this.f14149N.f2697g.a(rectF);
            k kVar = this.f14149N;
            y8.a aVar = kVar.f2692a;
            y8.a aVar2 = kVar.b;
            y8.a aVar3 = kVar.f2694d;
            y8.a aVar4 = kVar.f2693c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(aVar2);
            j.b(aVar);
            j.b(aVar4);
            j.b(aVar3);
            R3.a aVar5 = new R3.a(a9);
            R3.a aVar6 = new R3.a(a6);
            R3.a aVar7 = new R3.a(a11);
            R3.a aVar8 = new R3.a(a10);
            ?? obj = new Object();
            obj.f2692a = aVar2;
            obj.b = aVar;
            obj.f2693c = aVar3;
            obj.f2694d = aVar4;
            obj.f2695e = aVar5;
            obj.f2696f = aVar6;
            obj.f2697g = aVar8;
            obj.f2698h = aVar7;
            obj.f2699i = eVar;
            obj.f2700j = eVar2;
            obj.f2701k = eVar3;
            obj.l = eVar4;
            this.O = z8;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, U3.B, b0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        if (m()) {
            abstractC0547b.f3136d = getError();
        }
        o oVar = this.f14162d;
        if (oVar.f3176k != 0 && oVar.f3174i.f14091f) {
            z8 = true;
        } else {
            z8 = false;
        }
        abstractC0547b.f3137f = z8;
        return abstractC0547b;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f14136C;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue n2 = AbstractC0325a.n(context, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorControlActivated);
            if (n2 != null) {
                int i9 = n2.resourceId;
                if (i9 != 0) {
                    colorStateList2 = h.getColorStateList(context, i9);
                } else {
                    int i10 = n2.data;
                    if (i10 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i10);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f14165f;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f14165f.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((m() || (this.f14184q != null && this.f14180o)) && (colorStateList = this.f14138D) != null) {
                    colorStateList2 = colorStateList;
                }
                M.a.h(mutate, colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        PorterDuffColorFilter g9;
        PorterDuffColorFilter g10;
        EditText editText = this.f14165f;
        if (editText == null || this.f14151Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC2610l0.f22685a;
        Drawable mutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C2624t.b;
            synchronized (C2624t.class) {
                g10 = J0.g(errorCurrentTextColors, mode);
            }
            mutate.setColorFilter(g10);
            return;
        }
        if (this.f14180o && (appCompatTextView = this.f14184q) != null) {
            int currentTextColor = appCompatTextView.getCurrentTextColor();
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode4 = C2624t.b;
            synchronized (C2624t.class) {
                g9 = J0.g(currentTextColor, mode3);
            }
            mutate.setColorFilter(g9);
            return;
        }
        mutate.clearColorFilter();
        this.f14165f.refreshDrawableState();
    }

    public final void s() {
        EditText editText = this.f14165f;
        if (editText != null && this.f14143H != null) {
            if ((this.f14146K || editText.getBackground() == null) && this.f14151Q != 0) {
                ViewCompat.setBackground(this.f14165f, getEditTextBoxBackground());
                this.f14146K = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i9) {
        if (this.f14157W != i9) {
            this.f14157W = i9;
            this.f14185q0 = i9;
            this.f14189s0 = i9;
            this.f14191t0 = i9;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i9) {
        setBoxBackgroundColor(h.getColor(getContext(), i9));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f14185q0 = defaultColor;
        this.f14157W = defaultColor;
        this.f14187r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f14189s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f14191t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i9) {
        if (i9 == this.f14151Q) {
            return;
        }
        this.f14151Q = i9;
        if (this.f14165f != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i9) {
        this.f14152R = i9;
    }

    public void setBoxCornerFamily(int i9) {
        j e4 = this.f14149N.e();
        R3.c cVar = this.f14149N.f2695e;
        y8.a g9 = i.g(i9);
        e4.f2682a = g9;
        j.b(g9);
        e4.f2685e = cVar;
        R3.c cVar2 = this.f14149N.f2696f;
        y8.a g10 = i.g(i9);
        e4.b = g10;
        j.b(g10);
        e4.f2686f = cVar2;
        R3.c cVar3 = this.f14149N.f2698h;
        y8.a g11 = i.g(i9);
        e4.f2684d = g11;
        j.b(g11);
        e4.f2688h = cVar3;
        R3.c cVar4 = this.f14149N.f2697g;
        y8.a g12 = i.g(i9);
        e4.f2683c = g12;
        j.b(g12);
        e4.f2687g = cVar4;
        this.f14149N = e4.a();
        b();
    }

    public void setBoxStrokeColor(int i9) {
        if (this.f14181o0 != i9) {
            this.f14181o0 = i9;
            x();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f14177m0 = colorStateList.getDefaultColor();
            this.f14193u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f14179n0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f14181o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f14181o0 != colorStateList.getDefaultColor()) {
            this.f14181o0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f14183p0 != colorStateList) {
            this.f14183p0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i9) {
        this.f14154T = i9;
        x();
    }

    public void setBoxStrokeWidthFocused(int i9) {
        this.f14155U = i9;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i9) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i9));
    }

    public void setBoxStrokeWidthResource(int i9) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i9));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.m != z8) {
            Editable editable = null;
            s sVar = this.l;
            if (z8) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f14184q = appCompatTextView;
                appCompatTextView.setId(com.tools.arruler.photomeasure.camera.ruler.R.id.textinput_counter);
                Typeface typeface = this.f14163d0;
                if (typeface != null) {
                    this.f14184q.setTypeface(typeface);
                }
                this.f14184q.setMaxLines(1);
                sVar.a(this.f14184q, 2);
                ((ViewGroup.MarginLayoutParams) this.f14184q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f14184q != null) {
                    EditText editText = this.f14165f;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                sVar.g(this.f14184q, 2);
                this.f14184q = null;
            }
            this.m = z8;
        }
    }

    public void setCounterMaxLength(int i9) {
        Editable text;
        if (this.f14178n != i9) {
            if (i9 > 0) {
                this.f14178n = i9;
            } else {
                this.f14178n = -1;
            }
            if (this.m && this.f14184q != null) {
                EditText editText = this.f14165f;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i9) {
        if (this.f14186r != i9) {
            this.f14186r = i9;
            o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f14134B != colorStateList) {
            this.f14134B = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i9) {
        if (this.f14188s != i9) {
            this.f14188s = i9;
            o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f14132A != colorStateList) {
            this.f14132A = colorStateList;
            o();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.f14136C != colorStateList) {
            this.f14136C = colorStateList;
            p();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f14138D != colorStateList) {
            this.f14138D = colorStateList;
            if (m() || (this.f14184q != null && this.f14180o)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f14175k0 = colorStateList;
        this.f14176l0 = colorStateList;
        if (this.f14165f != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        k(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f14162d.f3174i.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f14162d.f3174i.setCheckable(z8);
    }

    public void setEndIconContentDescription(@StringRes int i9) {
        o oVar = this.f14162d;
        CharSequence text = i9 != 0 ? oVar.getResources().getText(i9) : null;
        CheckableImageButton checkableImageButton = oVar.f3174i;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i9) {
        o oVar = this.f14162d;
        Drawable g9 = i9 != 0 ? n.g(oVar.getContext(), i9) : null;
        CheckableImageButton checkableImageButton = oVar.f3174i;
        checkableImageButton.setImageDrawable(g9);
        if (g9 != null) {
            ColorStateList colorStateList = oVar.m;
            PorterDuff.Mode mode = oVar.f3177n;
            TextInputLayout textInputLayout = oVar.b;
            C0219j.d(textInputLayout, checkableImageButton, colorStateList, mode);
            C0219j.w(textInputLayout, checkableImageButton, oVar.m);
        }
    }

    public void setEndIconMinSize(int i9) {
        o oVar = this.f14162d;
        if (i9 >= 0) {
            if (i9 != oVar.f3178o) {
                oVar.f3178o = i9;
                CheckableImageButton checkableImageButton = oVar.f3174i;
                checkableImageButton.setMinimumWidth(i9);
                checkableImageButton.setMinimumHeight(i9);
                CheckableImageButton checkableImageButton2 = oVar.f3170d;
                checkableImageButton2.setMinimumWidth(i9);
                checkableImageButton2.setMinimumHeight(i9);
                return;
            }
            return;
        }
        oVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i9) {
        this.f14162d.g(i9);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o oVar = this.f14162d;
        View.OnLongClickListener onLongClickListener = oVar.f3180q;
        CheckableImageButton checkableImageButton = oVar.f3174i;
        checkableImageButton.setOnClickListener(onClickListener);
        C0219j.x(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o oVar = this.f14162d;
        oVar.f3180q = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f3174i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0219j.x(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        o oVar = this.f14162d;
        oVar.f3179p = scaleType;
        oVar.f3174i.setScaleType(scaleType);
        oVar.f3170d.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f14162d;
        if (oVar.m != colorStateList) {
            oVar.m = colorStateList;
            C0219j.d(oVar.b, oVar.f3174i, colorStateList, oVar.f3177n);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f14162d;
        if (oVar.f3177n != mode) {
            oVar.f3177n = mode;
            C0219j.d(oVar.b, oVar.f3174i, oVar.m, mode);
        }
    }

    public void setEndIconVisible(boolean z8) {
        this.f14162d.h(z8);
    }

    public void setError(@Nullable CharSequence charSequence) {
        s sVar = this.l;
        if (!sVar.f3211q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            sVar.c();
            sVar.f3210p = charSequence;
            sVar.f3212r.setText(charSequence);
            int i9 = sVar.f3208n;
            if (i9 != 1) {
                sVar.f3209o = 1;
            }
            sVar.i(i9, sVar.f3209o, sVar.h(sVar.f3212r, charSequence));
            return;
        }
        sVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i9) {
        s sVar = this.l;
        sVar.f3214t = i9;
        AppCompatTextView appCompatTextView = sVar.f3212r;
        if (appCompatTextView != null) {
            ViewCompat.setAccessibilityLiveRegion(appCompatTextView, i9);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        s sVar = this.l;
        sVar.f3213s = charSequence;
        AppCompatTextView appCompatTextView = sVar.f3212r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z8) {
        s sVar = this.l;
        if (sVar.f3211q != z8) {
            sVar.c();
            TextInputLayout textInputLayout = sVar.f3204h;
            if (z8) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f3203g);
                sVar.f3212r = appCompatTextView;
                appCompatTextView.setId(com.tools.arruler.photomeasure.camera.ruler.R.id.textinput_error);
                sVar.f3212r.setTextAlignment(5);
                Typeface typeface = sVar.f3197B;
                if (typeface != null) {
                    sVar.f3212r.setTypeface(typeface);
                }
                int i9 = sVar.f3215u;
                sVar.f3215u = i9;
                AppCompatTextView appCompatTextView2 = sVar.f3212r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i9);
                }
                ColorStateList colorStateList = sVar.f3216v;
                sVar.f3216v = colorStateList;
                AppCompatTextView appCompatTextView3 = sVar.f3212r;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = sVar.f3213s;
                sVar.f3213s = charSequence;
                AppCompatTextView appCompatTextView4 = sVar.f3212r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i10 = sVar.f3214t;
                sVar.f3214t = i10;
                AppCompatTextView appCompatTextView5 = sVar.f3212r;
                if (appCompatTextView5 != null) {
                    ViewCompat.setAccessibilityLiveRegion(appCompatTextView5, i10);
                }
                sVar.f3212r.setVisibility(4);
                sVar.a(sVar.f3212r, 0);
            } else {
                sVar.f();
                sVar.g(sVar.f3212r, 0);
                sVar.f3212r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            sVar.f3211q = z8;
        }
    }

    public void setErrorIconDrawable(int i9) {
        o oVar = this.f14162d;
        oVar.i(i9 != 0 ? n.g(oVar.getContext(), i9) : null);
        C0219j.w(oVar.b, oVar.f3170d, oVar.f3171f);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o oVar = this.f14162d;
        CheckableImageButton checkableImageButton = oVar.f3170d;
        View.OnLongClickListener onLongClickListener = oVar.f3173h;
        checkableImageButton.setOnClickListener(onClickListener);
        C0219j.x(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o oVar = this.f14162d;
        oVar.f3173h = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f3170d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0219j.x(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f14162d;
        if (oVar.f3171f != colorStateList) {
            oVar.f3171f = colorStateList;
            C0219j.d(oVar.b, oVar.f3170d, colorStateList, oVar.f3172g);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f14162d;
        if (oVar.f3172g != mode) {
            oVar.f3172g = mode;
            C0219j.d(oVar.b, oVar.f3170d, oVar.f3171f, mode);
        }
    }

    public void setErrorTextAppearance(int i9) {
        s sVar = this.l;
        sVar.f3215u = i9;
        AppCompatTextView appCompatTextView = sVar.f3212r;
        if (appCompatTextView != null) {
            sVar.f3204h.l(appCompatTextView, i9);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        s sVar = this.l;
        sVar.f3216v = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f3212r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.f14201y0 != z8) {
            this.f14201y0 = z8;
            u(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.l;
        if (isEmpty) {
            if (sVar.f3218x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f3218x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f3217w = charSequence;
        sVar.f3219y.setText(charSequence);
        int i9 = sVar.f3208n;
        if (i9 != 2) {
            sVar.f3209o = 2;
        }
        sVar.i(i9, sVar.f3209o, sVar.h(sVar.f3219y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        s sVar = this.l;
        sVar.f3196A = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f3219y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z8) {
        s sVar = this.l;
        if (sVar.f3218x != z8) {
            sVar.c();
            if (z8) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f3203g);
                sVar.f3219y = appCompatTextView;
                appCompatTextView.setId(com.tools.arruler.photomeasure.camera.ruler.R.id.textinput_helper_text);
                sVar.f3219y.setTextAlignment(5);
                Typeface typeface = sVar.f3197B;
                if (typeface != null) {
                    sVar.f3219y.setTypeface(typeface);
                }
                sVar.f3219y.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(sVar.f3219y, 1);
                int i9 = sVar.f3220z;
                sVar.f3220z = i9;
                AppCompatTextView appCompatTextView2 = sVar.f3219y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(i9);
                }
                ColorStateList colorStateList = sVar.f3196A;
                sVar.f3196A = colorStateList;
                AppCompatTextView appCompatTextView3 = sVar.f3219y;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                sVar.a(sVar.f3219y, 1);
                sVar.f3219y.setAccessibilityDelegate(new r(sVar));
            } else {
                sVar.c();
                int i10 = sVar.f3208n;
                if (i10 == 2) {
                    sVar.f3209o = 0;
                }
                sVar.i(i10, sVar.f3209o, sVar.h(sVar.f3219y, ""));
                sVar.g(sVar.f3219y, 1);
                sVar.f3219y = null;
                TextInputLayout textInputLayout = sVar.f3204h;
                textInputLayout.r();
                textInputLayout.x();
            }
            sVar.f3218x = z8;
        }
    }

    public void setHelperTextTextAppearance(int i9) {
        s sVar = this.l;
        sVar.f3220z = i9;
        AppCompatTextView appCompatTextView = sVar.f3219y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i9);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f14140E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.f14203z0 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.f14140E) {
            this.f14140E = z8;
            if (!z8) {
                this.f14142G = false;
                if (!TextUtils.isEmpty(this.f14141F) && TextUtils.isEmpty(this.f14165f.getHint())) {
                    this.f14165f.setHint(this.f14141F);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f14165f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f14141F)) {
                        setHint(hint);
                    }
                    this.f14165f.setHint((CharSequence) null);
                }
                this.f14142G = true;
            }
            if (this.f14165f != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i9) {
        b bVar = this.f14199x0;
        View view = bVar.f1750a;
        O3.d dVar = new O3.d(view.getContext(), i9);
        ColorStateList colorStateList = dVar.f2174j;
        if (colorStateList != null) {
            bVar.f1764k = colorStateList;
        }
        float f9 = dVar.f2175k;
        if (f9 != 0.0f) {
            bVar.f1762i = f9;
        }
        ColorStateList colorStateList2 = dVar.f2166a;
        if (colorStateList2 != null) {
            bVar.f1744U = colorStateList2;
        }
        bVar.f1742S = dVar.f2169e;
        bVar.f1743T = dVar.f2170f;
        bVar.f1741R = dVar.f2171g;
        bVar.f1745V = dVar.f2173i;
        O3.a aVar = bVar.f1776y;
        if (aVar != null) {
            aVar.f2159f = true;
        }
        C2475f c2475f = new C2475f(bVar, 5);
        dVar.a();
        bVar.f1776y = new O3.a(c2475f, dVar.f2176n);
        dVar.c(view.getContext(), bVar.f1776y);
        bVar.h(false);
        this.f14176l0 = bVar.f1764k;
        if (this.f14165f != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f14176l0 != colorStateList) {
            if (this.f14175k0 == null) {
                b bVar = this.f14199x0;
                if (bVar.f1764k != colorStateList) {
                    bVar.f1764k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f14176l0 = colorStateList;
            if (this.f14165f != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull A a6) {
        this.f14182p = a6;
    }

    public void setMaxEms(int i9) {
        this.f14170i = i9;
        EditText editText = this.f14165f;
        if (editText != null && i9 != -1) {
            editText.setMaxEms(i9);
        }
    }

    public void setMaxWidth(int i9) {
        this.f14174k = i9;
        EditText editText = this.f14165f;
        if (editText != null && i9 != -1) {
            editText.setMaxWidth(i9);
        }
    }

    public void setMaxWidthResource(int i9) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i9));
    }

    public void setMinEms(int i9) {
        this.f14168h = i9;
        EditText editText = this.f14165f;
        if (editText != null && i9 != -1) {
            editText.setMinEms(i9);
        }
    }

    public void setMinWidth(int i9) {
        this.f14172j = i9;
        EditText editText = this.f14165f;
        if (editText != null && i9 != -1) {
            editText.setMinWidth(i9);
        }
    }

    public void setMinWidthResource(int i9) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i9));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i9) {
        o oVar = this.f14162d;
        oVar.f3174i.setContentDescription(i9 != 0 ? oVar.getResources().getText(i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i9) {
        o oVar = this.f14162d;
        oVar.f3174i.setImageDrawable(i9 != 0 ? n.g(oVar.getContext(), i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        o oVar = this.f14162d;
        if (z8 && oVar.f3176k != 1) {
            oVar.g(1);
        } else if (!z8) {
            oVar.g(0);
        } else {
            oVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f14162d;
        oVar.m = colorStateList;
        C0219j.d(oVar.b, oVar.f3174i, colorStateList, oVar.f3177n);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f14162d;
        oVar.f3177n = mode;
        C0219j.d(oVar.b, oVar.f3174i, oVar.m, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        Editable text;
        if (this.f14194v == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f14194v = appCompatTextView;
            appCompatTextView.setId(com.tools.arruler.photomeasure.camera.ruler.R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.f14194v, 2);
            C0217h d2 = d();
            this.f14200y = d2;
            d2.f1919c = 67L;
            this.f14202z = d();
            setPlaceholderTextAppearance(this.f14198x);
            setPlaceholderTextColor(this.f14196w);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f14192u) {
                setPlaceholderTextEnabled(true);
            }
            this.f14190t = charSequence;
        }
        EditText editText = this.f14165f;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        v(text);
    }

    public void setPlaceholderTextAppearance(int i9) {
        this.f14198x = i9;
        AppCompatTextView appCompatTextView = this.f14194v;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i9);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f14196w != colorStateList) {
            this.f14196w = colorStateList;
            AppCompatTextView appCompatTextView = this.f14194v;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        x xVar = this.f14160c;
        xVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        xVar.f3234d = charSequence2;
        xVar.f3233c.setText(charSequence);
        xVar.e();
    }

    public void setPrefixTextAppearance(int i9) {
        this.f14160c.f3233c.setTextAppearance(i9);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f14160c.f3233c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull k kVar) {
        g gVar = this.f14143H;
        if (gVar != null && gVar.b.f2643a != kVar) {
            this.f14149N = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z8) {
        this.f14160c.f3235f.setCheckable(z8);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f14160c.f3235f;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i9) {
        setStartIconDrawable(i9 != 0 ? n.g(getContext(), i9) : null);
    }

    public void setStartIconMinSize(int i9) {
        x xVar = this.f14160c;
        if (i9 >= 0) {
            if (i9 != xVar.f3238i) {
                xVar.f3238i = i9;
                CheckableImageButton checkableImageButton = xVar.f3235f;
                checkableImageButton.setMinimumWidth(i9);
                checkableImageButton.setMinimumHeight(i9);
                return;
            }
            return;
        }
        xVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        x xVar = this.f14160c;
        View.OnLongClickListener onLongClickListener = xVar.f3240k;
        CheckableImageButton checkableImageButton = xVar.f3235f;
        checkableImageButton.setOnClickListener(onClickListener);
        C0219j.x(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        x xVar = this.f14160c;
        xVar.f3240k = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f3235f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0219j.x(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        x xVar = this.f14160c;
        xVar.f3239j = scaleType;
        xVar.f3235f.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        x xVar = this.f14160c;
        if (xVar.f3236g != colorStateList) {
            xVar.f3236g = colorStateList;
            C0219j.d(xVar.b, xVar.f3235f, colorStateList, xVar.f3237h);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        x xVar = this.f14160c;
        if (xVar.f3237h != mode) {
            xVar.f3237h = mode;
            C0219j.d(xVar.b, xVar.f3235f, xVar.f3236g, mode);
        }
    }

    public void setStartIconVisible(boolean z8) {
        this.f14160c.c(z8);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        o oVar = this.f14162d;
        oVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        oVar.f3181r = charSequence2;
        oVar.f3182s.setText(charSequence);
        oVar.n();
    }

    public void setSuffixTextAppearance(int i9) {
        this.f14162d.f3182s.setTextAppearance(i9);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f14162d.f3182s.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable z zVar) {
        EditText editText = this.f14165f;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, zVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f14163d0) {
            this.f14163d0 = typeface;
            this.f14199x0.m(typeface);
            s sVar = this.l;
            if (typeface != sVar.f3197B) {
                sVar.f3197B = typeface;
                AppCompatTextView appCompatTextView = sVar.f3212r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = sVar.f3219y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f14184q;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f14151Q != 1) {
            FrameLayout frameLayout = this.b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c9 = c();
            if (c9 != layoutParams.topMargin) {
                layoutParams.topMargin = c9;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i9;
        boolean isEnabled = isEnabled();
        EditText editText = this.f14165f;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        EditText editText2 = this.f14165f;
        if (editText2 != null && editText2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ColorStateList colorStateList3 = this.f14175k0;
        b bVar = this.f14199x0;
        if (colorStateList3 != null) {
            bVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f14175k0;
            if (colorStateList4 != null) {
                i9 = colorStateList4.getColorForState(new int[]{-16842910}, this.f14193u0);
            } else {
                i9 = this.f14193u0;
            }
            bVar.i(ColorStateList.valueOf(i9));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.l.f3212r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.i(colorStateList2);
        } else if (this.f14180o && (appCompatTextView = this.f14184q) != null) {
            bVar.i(appCompatTextView.getTextColors());
        } else if (z11 && (colorStateList = this.f14176l0) != null && bVar.f1764k != colorStateList) {
            bVar.f1764k = colorStateList;
            bVar.h(false);
        }
        o oVar = this.f14162d;
        x xVar = this.f14160c;
        if (!z10 && this.f14201y0 && (!isEnabled() || !z11)) {
            if (z9 || !this.f14197w0) {
                ValueAnimator valueAnimator = this.f14133A0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f14133A0.cancel();
                }
                if (z8 && this.f14203z0) {
                    a(0.0f);
                } else {
                    bVar.k(0.0f);
                }
                if (e() && (!((U3.g) this.f14143H).f3151z.f3149v.isEmpty()) && e()) {
                    ((U3.g) this.f14143H).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f14197w0 = true;
                AppCompatTextView appCompatTextView3 = this.f14194v;
                if (appCompatTextView3 != null && this.f14192u) {
                    appCompatTextView3.setText((CharSequence) null);
                    M0.A.a(this.b, this.f14202z);
                    this.f14194v.setVisibility(4);
                }
                xVar.l = true;
                xVar.e();
                oVar.f3183t = true;
                oVar.n();
                return;
            }
            return;
        }
        if (z9 || this.f14197w0) {
            ValueAnimator valueAnimator2 = this.f14133A0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f14133A0.cancel();
            }
            if (z8 && this.f14203z0) {
                a(1.0f);
            } else {
                bVar.k(1.0f);
            }
            this.f14197w0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f14165f;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            v(editable);
            xVar.l = false;
            xVar.e();
            oVar.f3183t = false;
            oVar.n();
        }
    }

    public final void v(Editable editable) {
        int i9;
        ((A4.a) this.f14182p).getClass();
        if (editable != null) {
            i9 = editable.length();
        } else {
            i9 = 0;
        }
        FrameLayout frameLayout = this.b;
        if (i9 == 0 && !this.f14197w0) {
            if (this.f14194v != null && this.f14192u && !TextUtils.isEmpty(this.f14190t)) {
                this.f14194v.setText(this.f14190t);
                M0.A.a(frameLayout, this.f14200y);
                this.f14194v.setVisibility(0);
                this.f14194v.bringToFront();
                announceForAccessibility(this.f14190t);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f14194v;
        if (appCompatTextView != null && this.f14192u) {
            appCompatTextView.setText((CharSequence) null);
            M0.A.a(frameLayout, this.f14202z);
            this.f14194v.setVisibility(4);
        }
    }

    public final void w(boolean z8, boolean z9) {
        int defaultColor = this.f14183p0.getDefaultColor();
        int colorForState = this.f14183p0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f14183p0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.f14156V = colorForState2;
        } else if (z9) {
            this.f14156V = colorForState;
        } else {
            this.f14156V = defaultColor;
        }
    }

    public final void x() {
        boolean z8;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f14143H != null && this.f14151Q != 0) {
            boolean z9 = false;
            if (!isFocused() && ((editText2 = this.f14165f) == null || !editText2.hasFocus())) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (isHovered() || ((editText = this.f14165f) != null && editText.isHovered())) {
                z9 = true;
            }
            if (!isEnabled()) {
                this.f14156V = this.f14193u0;
            } else if (m()) {
                if (this.f14183p0 != null) {
                    w(z8, z9);
                } else {
                    this.f14156V = getErrorCurrentTextColors();
                }
            } else if (this.f14180o && (appCompatTextView = this.f14184q) != null) {
                if (this.f14183p0 != null) {
                    w(z8, z9);
                } else {
                    this.f14156V = appCompatTextView.getCurrentTextColor();
                }
            } else if (z8) {
                this.f14156V = this.f14181o0;
            } else if (z9) {
                this.f14156V = this.f14179n0;
            } else {
                this.f14156V = this.f14177m0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            o oVar = this.f14162d;
            oVar.l();
            CheckableImageButton checkableImageButton = oVar.f3170d;
            ColorStateList colorStateList = oVar.f3171f;
            TextInputLayout textInputLayout = oVar.b;
            C0219j.w(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = oVar.m;
            CheckableImageButton checkableImageButton2 = oVar.f3174i;
            C0219j.w(textInputLayout, checkableImageButton2, colorStateList2);
            if (oVar.b() instanceof U3.k) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    M.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    C0219j.d(textInputLayout, checkableImageButton2, oVar.m, oVar.f3177n);
                }
            }
            x xVar = this.f14160c;
            C0219j.w(xVar.b, xVar.f3235f, xVar.f3236g);
            if (this.f14151Q == 2) {
                int i9 = this.f14153S;
                if (z8 && isEnabled()) {
                    this.f14153S = this.f14155U;
                } else {
                    this.f14153S = this.f14154T;
                }
                if (this.f14153S != i9 && e() && !this.f14197w0) {
                    if (e()) {
                        ((U3.g) this.f14143H).o(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f14151Q == 1) {
                if (!isEnabled()) {
                    this.f14157W = this.f14187r0;
                } else if (z9 && !z8) {
                    this.f14157W = this.f14191t0;
                } else if (z8) {
                    this.f14157W = this.f14189s0;
                } else {
                    this.f14157W = this.f14185q0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f14160c.b(drawable);
    }

    public void setHint(@StringRes int i9) {
        setHint(i9 != 0 ? getResources().getText(i9) : null);
    }

    public void setStartIconContentDescription(@StringRes int i9) {
        setStartIconContentDescription(i9 != 0 ? getResources().getText(i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f14162d.f3174i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f14162d.f3174i.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f14162d.i(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f14162d.f3174i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        o oVar = this.f14162d;
        CheckableImageButton checkableImageButton = oVar.f3174i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oVar.m;
            PorterDuff.Mode mode = oVar.f3177n;
            TextInputLayout textInputLayout = oVar.b;
            C0219j.d(textInputLayout, checkableImageButton, colorStateList, mode);
            C0219j.w(textInputLayout, checkableImageButton, oVar.m);
        }
    }
}
