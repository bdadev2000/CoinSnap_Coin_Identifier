package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
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
import androidx.appcompat.widget.i3;
import androidx.appcompat.widget.s1;
import androidx.appcompat.widget.s2;
import androidx.core.view.ViewCompat;
import c6.k;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import com.vungle.ads.internal.protos.n;
import ea.b;
import ea.c;
import f2.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ka.i;
import ka.l;
import n0.f2;
import na.f;
import na.g;
import na.j;
import na.m;
import na.p;
import na.q;
import na.s;
import na.u;
import na.v;
import na.w;
import na.x;
import na.y;
import p6.a;
import v8.u0;
import vd.e;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public ValueAnimator A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public boolean E;
    public CharSequence F;
    public boolean G;
    public i H;
    public i I;
    public StateListDrawable J;
    public boolean K;
    public i L;
    public i M;
    public l N;
    public boolean O;
    public final int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f11800a0;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f11801b;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f11802b0;

    /* renamed from: c, reason: collision with root package name */
    public final u f11803c;

    /* renamed from: c0, reason: collision with root package name */
    public final RectF f11804c0;

    /* renamed from: d, reason: collision with root package name */
    public final m f11805d;

    /* renamed from: d0, reason: collision with root package name */
    public Typeface f11806d0;

    /* renamed from: e0, reason: collision with root package name */
    public ColorDrawable f11807e0;

    /* renamed from: f, reason: collision with root package name */
    public EditText f11808f;

    /* renamed from: f0, reason: collision with root package name */
    public int f11809f0;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f11810g;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f11811g0;

    /* renamed from: h, reason: collision with root package name */
    public int f11812h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorDrawable f11813h0;

    /* renamed from: i, reason: collision with root package name */
    public int f11814i;

    /* renamed from: i0, reason: collision with root package name */
    public int f11815i0;

    /* renamed from: j, reason: collision with root package name */
    public int f11816j;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f11817j0;

    /* renamed from: k, reason: collision with root package name */
    public int f11818k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f11819k0;

    /* renamed from: l, reason: collision with root package name */
    public final q f11820l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f11821l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11822m;

    /* renamed from: m0, reason: collision with root package name */
    public int f11823m0;

    /* renamed from: n, reason: collision with root package name */
    public int f11824n;

    /* renamed from: n0, reason: collision with root package name */
    public int f11825n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11826o;

    /* renamed from: o0, reason: collision with root package name */
    public int f11827o0;

    /* renamed from: p, reason: collision with root package name */
    public x f11828p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f11829p0;

    /* renamed from: q, reason: collision with root package name */
    public AppCompatTextView f11830q;

    /* renamed from: q0, reason: collision with root package name */
    public int f11831q0;

    /* renamed from: r, reason: collision with root package name */
    public int f11832r;

    /* renamed from: r0, reason: collision with root package name */
    public int f11833r0;

    /* renamed from: s, reason: collision with root package name */
    public int f11834s;

    /* renamed from: s0, reason: collision with root package name */
    public int f11835s0;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f11836t;

    /* renamed from: t0, reason: collision with root package name */
    public int f11837t0;
    public boolean u;

    /* renamed from: u0, reason: collision with root package name */
    public int f11838u0;

    /* renamed from: v, reason: collision with root package name */
    public AppCompatTextView f11839v;

    /* renamed from: v0, reason: collision with root package name */
    public int f11840v0;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f11841w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f11842w0;

    /* renamed from: x, reason: collision with root package name */
    public int f11843x;

    /* renamed from: x0, reason: collision with root package name */
    public final b f11844x0;

    /* renamed from: y, reason: collision with root package name */
    public h f11845y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f11846y0;

    /* renamed from: z, reason: collision with root package name */
    public h f11847z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f11848z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v56 */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.z(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.textInputStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_Design_TextInputLayout), attributeSet, com.plantcare.ai.identifier.plantid.R.attr.textInputStyle);
        ?? r42;
        this.f11812h = -1;
        this.f11814i = -1;
        this.f11816j = -1;
        this.f11818k = -1;
        this.f11820l = new q(this);
        this.f11828p = new n0.h(13);
        this.f11800a0 = new Rect();
        this.f11802b0 = new Rect();
        this.f11804c0 = new RectF();
        this.f11811g0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f11844x0 = bVar;
        this.D0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f11801b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = s9.a.a;
        bVar.P = linearInterpolator;
        bVar.i(false);
        bVar.O = linearInterpolator;
        bVar.i(false);
        if (bVar.f17215g != 8388659) {
            bVar.f17215g = 8388659;
            bVar.i(false);
        }
        int[] iArr = r9.a.B;
        d.d(context2, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.textInputStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_Design_TextInputLayout);
        d.g(context2, attributeSet, iArr, com.plantcare.ai.identifier.plantid.R.attr.textInputStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.plantcare.ai.identifier.plantid.R.attr.textInputStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_Design_TextInputLayout);
        i3 i3Var = new i3(context2, obtainStyledAttributes);
        u uVar = new u(this, i3Var);
        this.f11803c = uVar;
        this.E = i3Var.a(48, true);
        setHint(i3Var.k(4));
        this.f11848z0 = i3Var.a(47, true);
        this.f11846y0 = i3Var.a(42, true);
        if (i3Var.l(6)) {
            setMinEms(i3Var.h(6, -1));
        } else if (i3Var.l(3)) {
            setMinWidth(i3Var.d(3, -1));
        }
        if (i3Var.l(5)) {
            setMaxEms(i3Var.h(5, -1));
        } else if (i3Var.l(2)) {
            setMaxWidth(i3Var.d(2, -1));
        }
        this.N = new l(l.b(context2, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.textInputStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_Design_TextInputLayout));
        this.P = context2.getResources().getDimensionPixelOffset(com.plantcare.ai.identifier.plantid.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = i3Var.c(9, 0);
        this.T = i3Var.d(16, context2.getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.U = i3Var.d(17, context2.getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = this.T;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        l lVar = this.N;
        lVar.getClass();
        h7.l lVar2 = new h7.l(lVar);
        if (dimension >= 0.0f) {
            lVar2.f18829e = new ka.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            lVar2.f18830f = new ka.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            lVar2.f18831g = new ka.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            lVar2.f18832h = new ka.a(dimension4);
        }
        this.N = new l(lVar2);
        ColorStateList A = u0.A(context2, i3Var, 7);
        if (A != null) {
            int defaultColor = A.getDefaultColor();
            this.f11831q0 = defaultColor;
            this.W = defaultColor;
            if (A.isStateful()) {
                this.f11833r0 = A.getColorForState(new int[]{-16842910}, -1);
                this.f11835s0 = A.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f11837t0 = A.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f11835s0 = this.f11831q0;
                ColorStateList colorStateList = d0.h.getColorStateList(context2, com.plantcare.ai.identifier.plantid.R.color.mtrl_filled_background_color);
                this.f11833r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f11837t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.W = 0;
            this.f11831q0 = 0;
            this.f11833r0 = 0;
            this.f11835s0 = 0;
            this.f11837t0 = 0;
        }
        if (i3Var.l(1)) {
            ColorStateList b3 = i3Var.b(1);
            this.f11821l0 = b3;
            this.f11819k0 = b3;
        }
        ColorStateList A2 = u0.A(context2, i3Var, 14);
        this.f11827o0 = obtainStyledAttributes.getColor(14, 0);
        this.f11823m0 = d0.h.getColor(context2, com.plantcare.ai.identifier.plantid.R.color.mtrl_textinput_default_box_stroke_color);
        this.f11838u0 = d0.h.getColor(context2, com.plantcare.ai.identifier.plantid.R.color.mtrl_textinput_disabled_color);
        this.f11825n0 = d0.h.getColor(context2, com.plantcare.ai.identifier.plantid.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (A2 != null) {
            setBoxStrokeColorStateList(A2);
        }
        if (i3Var.l(15)) {
            setBoxStrokeErrorColor(u0.A(context2, i3Var, 15));
        }
        if (i3Var.i(49, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(i3Var.i(49, 0));
        } else {
            r42 = 0;
        }
        this.C = i3Var.b(24);
        this.D = i3Var.b(25);
        int i10 = i3Var.i(40, r42);
        CharSequence k10 = i3Var.k(35);
        int h10 = i3Var.h(34, 1);
        boolean a = i3Var.a(36, r42);
        int i11 = i3Var.i(45, r42);
        boolean a10 = i3Var.a(44, r42);
        CharSequence k11 = i3Var.k(43);
        int i12 = i3Var.i(57, r42);
        CharSequence k12 = i3Var.k(56);
        boolean a11 = i3Var.a(18, r42);
        setCounterMaxLength(i3Var.h(19, -1));
        this.f11834s = i3Var.i(22, 0);
        this.f11832r = i3Var.i(20, 0);
        setBoxBackgroundMode(i3Var.h(8, 0));
        setErrorContentDescription(k10);
        setErrorAccessibilityLiveRegion(h10);
        setCounterOverflowTextAppearance(this.f11832r);
        setHelperTextTextAppearance(i11);
        setErrorTextAppearance(i10);
        setCounterTextAppearance(this.f11834s);
        setPlaceholderText(k12);
        setPlaceholderTextAppearance(i12);
        if (i3Var.l(41)) {
            setErrorTextColor(i3Var.b(41));
        }
        if (i3Var.l(46)) {
            setHelperTextColor(i3Var.b(46));
        }
        if (i3Var.l(50)) {
            setHintTextColor(i3Var.b(50));
        }
        if (i3Var.l(23)) {
            setCounterTextColor(i3Var.b(23));
        }
        if (i3Var.l(21)) {
            setCounterOverflowTextColor(i3Var.b(21));
        }
        if (i3Var.l(58)) {
            setPlaceholderTextColor(i3Var.b(58));
        }
        m mVar = new m(this, i3Var);
        this.f11805d = mVar;
        boolean a12 = i3Var.a(0, true);
        i3Var.o();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(a12);
        setHelperTextEnabled(a10);
        setErrorEnabled(a);
        setCounterEnabled(a11);
        setHelperText(k11);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        boolean z10;
        int i10;
        EditText editText = this.f11808f;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int x10 = u0.x(com.plantcare.ai.identifier.plantid.R.attr.colorControlHighlight, this.f11808f);
                int i11 = this.Q;
                int[][] iArr = E0;
                if (i11 == 2) {
                    Context context = getContext();
                    i iVar = this.H;
                    TypedValue y4 = k.y(context, com.plantcare.ai.identifier.plantid.R.attr.colorSurface, "TextInputLayout");
                    int i12 = y4.resourceId;
                    if (i12 != 0) {
                        i10 = d0.h.getColor(context, i12);
                    } else {
                        i10 = y4.data;
                    }
                    i iVar2 = new i(iVar.f20557b.a);
                    int O = u0.O(0.1f, x10, i10);
                    iVar2.k(new ColorStateList(iArr, new int[]{O, 0}));
                    iVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{O, i10});
                    i iVar3 = new i(iVar.f20557b.a);
                    iVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar2, iVar3), iVar});
                }
                if (i11 == 1) {
                    i iVar4 = this.H;
                    int i13 = this.W;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{u0.O(0.1f, x10, i13), i13}), iVar4, iVar4);
                }
                return null;
            }
        }
        return this.H;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.J == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.J = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.J.addState(new int[0], f(false));
        }
        return this.J;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.I == null) {
            this.I = f(true);
        }
        return this.I;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f11808f == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f11808f = editText;
            int i10 = this.f11812h;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f11816j);
            }
            int i11 = this.f11814i;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f11818k);
            }
            this.K = false;
            i();
            setTextInputAccessibilityDelegate(new w(this));
            Typeface typeface = this.f11808f.getTypeface();
            b bVar = this.f11844x0;
            bVar.m(typeface);
            float textSize = this.f11808f.getTextSize();
            if (bVar.f17216h != textSize) {
                bVar.f17216h = textSize;
                bVar.i(false);
            }
            int i12 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f11808f.getLetterSpacing();
            if (bVar.V != letterSpacing) {
                bVar.V = letterSpacing;
                bVar.i(false);
            }
            int gravity = this.f11808f.getGravity();
            int i13 = (gravity & (-113)) | 48;
            if (bVar.f17215g != i13) {
                bVar.f17215g = i13;
                bVar.i(false);
            }
            if (bVar.f17214f != gravity) {
                bVar.f17214f = gravity;
                bVar.i(false);
            }
            this.f11840v0 = editText.getMinimumHeight();
            this.f11808f.addTextChangedListener(new v(this, editText));
            if (this.f11819k0 == null) {
                this.f11819k0 = this.f11808f.getHintTextColors();
            }
            if (this.E) {
                if (TextUtils.isEmpty(this.F)) {
                    CharSequence hint = this.f11808f.getHint();
                    this.f11810g = hint;
                    setHint(hint);
                    this.f11808f.setHint((CharSequence) null);
                }
                this.G = true;
            }
            if (i12 >= 29) {
                p();
            }
            if (this.f11830q != null) {
                n(this.f11808f.getText());
            }
            r();
            this.f11820l.b();
            this.f11803c.bringToFront();
            m mVar = this.f11805d;
            mVar.bringToFront();
            Iterator it = this.f11811g0.iterator();
            while (it.hasNext()) {
                ((na.l) it.next()).a(this);
            }
            mVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.F)) {
            this.F = charSequence;
            b bVar = this.f11844x0;
            if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
                bVar.A = charSequence;
                bVar.B = null;
                bVar.i(false);
            }
            if (!this.f11842w0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.u == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f11839v;
            if (appCompatTextView != null) {
                this.f11801b.addView(appCompatTextView);
                this.f11839v.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f11839v;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f11839v = null;
        }
        this.u = z10;
    }

    public final void a(float f10) {
        b bVar = this.f11844x0;
        if (bVar.f17206b == f10) {
            return;
        }
        int i10 = 2;
        if (this.A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0 = valueAnimator;
            valueAnimator.setInterpolator(u0.h0(getContext(), com.plantcare.ai.identifier.plantid.R.attr.motionEasingEmphasizedInterpolator, s9.a.f24933b));
            this.A0.setDuration(u0.g0(getContext(), com.plantcare.ai.identifier.plantid.R.attr.motionDurationMedium4, 167));
            this.A0.addUpdateListener(new com.facebook.shimmer.d(this, i10));
        }
        this.A0.setFloatValues(bVar.f17206b, f10);
        this.A0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f11801b;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            ka.i r0 = r7.H
            if (r0 != 0) goto L5
            return
        L5:
            ka.h r1 = r0.f20557b
            ka.l r1 = r1.a
            ka.l r2 = r7.N
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.Q
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.S
            if (r0 <= r2) goto L22
            int r0 = r7.V
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            ka.i r0 = r7.H
            int r1 = r7.S
            float r1 = (float) r1
            int r5 = r7.V
            ka.h r6 = r0.f20557b
            r6.f20546l = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            ka.h r5 = r0.f20557b
            android.content.res.ColorStateList r6 = r5.f20539e
            if (r6 == r1) goto L4b
            r5.f20539e = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.W
            int r1 = r7.Q
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130968996(0x7f0401a4, float:1.7546661E38)
            int r0 = v8.u0.y(r0, r1, r3)
            int r1 = r7.W
            int r0 = g0.d.b(r1, r0)
        L62:
            r7.W = r0
            ka.i r1 = r7.H
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r0)
            ka.i r0 = r7.L
            if (r0 == 0) goto La7
            ka.i r1 = r7.M
            if (r1 != 0) goto L76
            goto La7
        L76:
            int r1 = r7.S
            if (r1 <= r2) goto L7f
            int r1 = r7.V
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La4
            android.widget.EditText r1 = r7.f11808f
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L90
            int r1 = r7.f11823m0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L96
        L90:
            int r1 = r7.V
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L96:
            r0.k(r1)
            ka.i r0 = r7.M
            int r1 = r7.V
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
        La4:
            r7.invalidate()
        La7:
            r7.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float e2;
        if (!this.E) {
            return 0;
        }
        int i10 = this.Q;
        b bVar = this.f11844x0;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            e2 = bVar.e() / 2.0f;
        } else {
            e2 = bVar.e();
        }
        return (int) e2;
    }

    public final h d() {
        h hVar = new h();
        hVar.f17640d = u0.g0(getContext(), com.plantcare.ai.identifier.plantid.R.attr.motionDurationShort2, 87);
        hVar.f17641f = u0.h0(getContext(), com.plantcare.ai.identifier.plantid.R.attr.motionEasingLinearInterpolator, s9.a.a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f11808f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f11810g != null) {
            boolean z10 = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.f11808f.setHint(this.f11810g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f11808f.setHint(hint);
                this.G = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f11801b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f11808f) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.C0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar;
        super.draw(canvas);
        boolean z10 = this.E;
        b bVar = this.f11844x0;
        if (z10) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.B != null) {
                RectF rectF = bVar.f17212e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.M;
                    textPaint.setTextSize(bVar.F);
                    float f10 = bVar.f17224p;
                    float f11 = bVar.f17225q;
                    float f12 = bVar.E;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    boolean z11 = true;
                    if (bVar.f17209c0 <= 1 || bVar.C) {
                        z11 = false;
                    }
                    if (z11) {
                        float lineStart = bVar.f17224p - bVar.X.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (bVar.f17205a0 * f13));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            float f14 = bVar.G;
                            float f15 = bVar.H;
                            float f16 = bVar.I;
                            int i11 = bVar.J;
                            textPaint.setShadowLayer(f14, f15, f16, g0.d.c(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                        }
                        bVar.X.draw(canvas);
                        textPaint.setAlpha((int) (bVar.Z * f13));
                        if (i10 >= 31) {
                            float f17 = bVar.G;
                            float f18 = bVar.H;
                            float f19 = bVar.I;
                            int i12 = bVar.J;
                            textPaint.setShadowLayer(f17, f18, f19, g0.d.c(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.X.getLineBaseline(0);
                        CharSequence charSequence = bVar.f17207b0;
                        float f20 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(bVar.G, bVar.H, bVar.I, bVar.J);
                        }
                        String trim = bVar.f17207b0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.X.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                    } else {
                        canvas.translate(f10, f11);
                        bVar.X.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.M != null && (iVar = this.L) != null) {
            iVar.draw(canvas);
            if (this.f11808f.isFocused()) {
                Rect bounds = this.M.getBounds();
                Rect bounds2 = this.L.getBounds();
                float f21 = bVar.f17206b;
                int centerX = bounds2.centerX();
                bounds.left = s9.a.b(f21, centerX, bounds2.left);
                bounds.right = s9.a.b(f21, centerX, bounds2.right);
                this.M.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        boolean z11;
        boolean z12;
        if (this.B0) {
            return;
        }
        boolean z13 = true;
        this.B0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f11844x0;
        if (bVar != null) {
            bVar.K = drawableState;
            ColorStateList colorStateList2 = bVar.f17219k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f17218j) != null && colorStateList.isStateful())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                bVar.i(false);
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = z12 | false;
        } else {
            z10 = false;
        }
        if (this.f11808f != null) {
            if (!isLaidOut() || !isEnabled()) {
                z13 = false;
            }
            u(z13, false);
        }
        r();
        x();
        if (z10) {
            invalidate();
        }
        this.B0 = false;
    }

    public final boolean e() {
        return this.E && !TextUtils.isEmpty(this.F) && (this.H instanceof g);
    }

    public final i f(boolean z10) {
        float f10;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i10;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.plantcare.ai.identifier.plantid.R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f11808f;
        if (editText instanceof s) {
            dimensionPixelOffset = ((s) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.plantcare.ai.identifier.plantid.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.plantcare.ai.identifier.plantid.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        h7.l lVar = new h7.l(1);
        lVar.f18829e = new ka.a(f10);
        lVar.f18830f = new ka.a(f10);
        lVar.f18832h = new ka.a(dimensionPixelOffset2);
        lVar.f18831g = new ka.a(dimensionPixelOffset2);
        l lVar2 = new l(lVar);
        EditText editText2 = this.f11808f;
        if (editText2 instanceof s) {
            colorStateList = ((s) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            l lVar3 = i.f20556z;
            TypedValue y4 = k.y(context, com.plantcare.ai.identifier.plantid.R.attr.colorSurface, i.class.getSimpleName());
            int i11 = y4.resourceId;
            if (i11 != 0) {
                i10 = d0.h.getColor(context, i11);
            } else {
                i10 = y4.data;
            }
            colorStateList = ColorStateList.valueOf(i10);
        }
        i iVar = new i();
        iVar.h(context);
        iVar.k(colorStateList);
        iVar.j(dimensionPixelOffset);
        iVar.setShapeAppearanceModel(lVar2);
        ka.h hVar = iVar.f20557b;
        if (hVar.f20543i == null) {
            hVar.f20543i = new Rect();
        }
        iVar.f20557b.f20543i.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (!z10 && getPrefixText() != null) {
            compoundPaddingLeft = this.f11803c.a();
        } else if (z10 && getSuffixText() != null) {
            compoundPaddingLeft = this.f11805d.c();
        } else {
            compoundPaddingLeft = this.f11808f.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11808f;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    @NonNull
    public i getBoxBackground() {
        int i10 = this.Q;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.H;
    }

    public int getBoxBackgroundColor() {
        return this.W;
    }

    public int getBoxBackgroundMode() {
        return this.Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        RectF rectF = this.f11804c0;
        if (z10) {
            return this.N.f20585h.a(rectF);
        }
        return this.N.f20584g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        RectF rectF = this.f11804c0;
        if (z10) {
            return this.N.f20584g.a(rectF);
        }
        return this.N.f20585h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        RectF rectF = this.f11804c0;
        if (z10) {
            return this.N.f20582e.a(rectF);
        }
        return this.N.f20583f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        RectF rectF = this.f11804c0;
        if (z10) {
            return this.N.f20583f.a(rectF);
        }
        return this.N.f20582e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f11827o0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f11829p0;
    }

    public int getBoxStrokeWidth() {
        return this.T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.f11824n;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f11822m && this.f11826o && (appCompatTextView = this.f11830q) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.A;
    }

    @Nullable
    @RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
    public ColorStateList getCursorColor() {
        return this.C;
    }

    @Nullable
    @RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
    public ColorStateList getCursorErrorColor() {
        return this.D;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f11819k0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f11808f;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f11805d.f22641i.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f11805d.f22641i.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f11805d.f22647o;
    }

    public int getEndIconMode() {
        return this.f11805d.f22643k;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f11805d.f22648p;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f11805d.f22641i;
    }

    @Nullable
    public CharSequence getError() {
        q qVar = this.f11820l;
        if (qVar.f22678q) {
            return qVar.f22677p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f11820l.f22681t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f11820l.f22680s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f11820l.f22679r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f11805d.f22637d.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        q qVar = this.f11820l;
        if (qVar.f22684x) {
            return qVar.f22683w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f11820l.f22685y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.E) {
            return this.F;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f11844x0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f11844x0;
        return bVar.f(bVar.f17219k);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f11821l0;
    }

    @NonNull
    public x getLengthCounter() {
        return this.f11828p;
    }

    public int getMaxEms() {
        return this.f11814i;
    }

    public int getMaxWidth() {
        return this.f11818k;
    }

    public int getMinEms() {
        return this.f11812h;
    }

    public int getMinWidth() {
        return this.f11816j;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f11805d.f22641i.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f11805d.f22641i.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.u) {
            return this.f11836t;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f11843x;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f11841w;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f11803c.f22703d;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f11803c.f22702c.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f11803c.f22702c;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        return this.N;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f11803c.f22704f.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f11803c.f22704f.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f11803c.f22707i;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f11803c.f22708j;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f11805d.f22650r;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f11805d.f22651s.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f11805d.f22651s;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f11806d0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight;
        if (!z10 && getSuffixText() != null) {
            compoundPaddingRight = this.f11805d.c();
        } else if (z10 && getPrefixText() != null) {
            compoundPaddingRight = this.f11803c.a();
        } else {
            compoundPaddingRight = this.f11808f.getCompoundPaddingRight();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        boolean z10;
        int i10 = this.Q;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.E && !(this.H instanceof g)) {
                        l lVar = this.N;
                        int i11 = g.C;
                        if (lVar == null) {
                            lVar = new l();
                        }
                        this.H = new g(new f(lVar, new RectF()));
                    } else {
                        this.H = new i(this.N);
                    }
                    this.L = null;
                    this.M = null;
                } else {
                    throw new IllegalArgumentException(e.g(new StringBuilder(), this.Q, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.H = new i(this.N);
                this.L = new i();
                this.M = new i();
            }
        } else {
            this.H = null;
            this.L = null;
            this.M = null;
        }
        s();
        x();
        boolean z11 = false;
        if (this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.R = getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (u0.K(getContext())) {
                this.R = getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f11808f != null && this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z11 = true;
            }
            if (z11) {
                EditText editText = this.f11808f;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f11808f.getPaddingEnd(), getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (u0.K(getContext())) {
                EditText editText2 = this.f11808f;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f11808f.getPaddingEnd(), getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.Q != 0) {
            t();
        }
        EditText editText3 = this.f11808f;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.Q;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (!e()) {
            return;
        }
        int width = this.f11808f.getWidth();
        int gravity = this.f11808f.getGravity();
        b bVar = this.f11844x0;
        boolean c10 = bVar.c(bVar.A);
        bVar.C = c10;
        Rect rect = bVar.f17210d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (c10) {
                    f10 = rect.right;
                    f11 = bVar.Y;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
            } else if (c10) {
                i11 = rect.left;
                f12 = i11;
            } else {
                f10 = rect.right;
                f11 = bVar.Y;
            }
            float max = Math.max(f12, rect.left);
            rectF = this.f11804c0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (bVar.C) {
                        i10 = rect.right;
                        f13 = i10;
                    } else {
                        f13 = bVar.Y + max;
                    }
                } else if (bVar.C) {
                    f13 = bVar.Y + max;
                } else {
                    i10 = rect.right;
                    f13 = i10;
                }
            } else {
                f13 = (width / 2.0f) + (bVar.Y / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = bVar.e() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f14 = rectF.left;
                float f15 = this.P;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
                g gVar = (g) this.H;
                gVar.getClass();
                gVar.p(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f10 = width / 2.0f;
        f11 = bVar.Y / 2.0f;
        f12 = f10 - f11;
        float max2 = Math.max(f12, rect.left);
        rectF = this.f11804c0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f13 = (width / 2.0f) + (bVar.Y / 2.0f);
        rectF.right = Math.min(f13, rect.right);
        rectF.bottom = bVar.e() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void l(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(com.plantcare.ai.identifier.plantid.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(d0.h.getColor(getContext(), com.plantcare.ai.identifier.plantid.R.color.design_error));
        }
    }

    public final boolean m() {
        q qVar = this.f11820l;
        if (qVar.f22676o == 1 && qVar.f22679r != null && !TextUtils.isEmpty(qVar.f22677p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        ((n0.h) this.f11828p).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z11 = this.f11826o;
        int i12 = this.f11824n;
        String str = null;
        if (i12 == -1) {
            this.f11830q.setText(String.valueOf(i10));
            this.f11830q.setContentDescription(null);
            this.f11826o = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11826o = z10;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f11830q;
            int i13 = this.f11824n;
            if (this.f11826o) {
                i11 = com.plantcare.ai.identifier.plantid.R.string.character_counter_overflowed_content_description;
            } else {
                i11 = com.plantcare.ai.identifier.plantid.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z11 != this.f11826o) {
                o();
            }
            l0.b c10 = l0.b.c();
            AppCompatTextView appCompatTextView2 = this.f11830q;
            String string = getContext().getString(com.plantcare.ai.identifier.plantid.R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f11824n));
            if (string == null) {
                c10.getClass();
            } else {
                str = c10.d(string, c10.f21101c).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f11808f != null && z11 != this.f11826o) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f11830q;
        if (appCompatTextView != null) {
            if (this.f11826o) {
                i10 = this.f11832r;
            } else {
                i10 = this.f11834s;
            }
            l(appCompatTextView, i10);
            if (!this.f11826o && (colorStateList2 = this.A) != null) {
                this.f11830q.setTextColor(colorStateList2);
            }
            if (this.f11826o && (colorStateList = this.B) != null) {
                this.f11830q.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11844x0.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        m mVar = this.f11805d;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.D0 = false;
        if (this.f11808f != null && this.f11808f.getMeasuredHeight() < (max = Math.max(mVar.getMeasuredHeight(), this.f11803c.getMeasuredHeight()))) {
            this.f11808f.setMinimumHeight(max);
            z10 = true;
        }
        boolean q10 = q();
        if (z10 || q10) {
            this.f11808f.post(new k8.f(this, 8));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        int compoundPaddingTop;
        boolean z14;
        int compoundPaddingBottom;
        boolean z15;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f11808f;
        if (editText != null) {
            ThreadLocal threadLocal = c.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f11800a0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = c.a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = c.f17234b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            i iVar = this.L;
            if (iVar != null) {
                int i14 = rect.bottom;
                iVar.setBounds(rect.left, i14 - this.T, rect.right, i14);
            }
            i iVar2 = this.M;
            if (iVar2 != null) {
                int i15 = rect.bottom;
                iVar2.setBounds(rect.left, i15 - this.U, rect.right, i15);
            }
            if (this.E) {
                float textSize = this.f11808f.getTextSize();
                b bVar = this.f11844x0;
                if (bVar.f17216h != textSize) {
                    bVar.f17216h = textSize;
                    bVar.i(false);
                }
                int gravity = this.f11808f.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (bVar.f17215g != i16) {
                    bVar.f17215g = i16;
                    bVar.i(false);
                }
                if (bVar.f17214f != gravity) {
                    bVar.f17214f = gravity;
                    bVar.i(false);
                }
                if (this.f11808f != null) {
                    if (getLayoutDirection() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i17 = rect.bottom;
                    Rect rect2 = this.f11802b0;
                    rect2.bottom = i17;
                    int i18 = this.Q;
                    if (i18 != 1) {
                        if (i18 != 2) {
                            rect2.left = g(rect.left, z11);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, z11);
                        } else {
                            rect2.left = this.f11808f.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f11808f.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, z11);
                        rect2.top = rect.top + this.R;
                        rect2.right = h(rect.right, z11);
                    }
                    int i19 = rect2.left;
                    int i20 = rect2.top;
                    int i21 = rect2.right;
                    int i22 = rect2.bottom;
                    Rect rect3 = bVar.f17210d;
                    if (rect3.left == i19 && rect3.top == i20 && rect3.right == i21 && rect3.bottom == i22) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        rect3.set(i19, i20, i21, i22);
                        bVar.L = true;
                    }
                    if (this.f11808f != null) {
                        TextPaint textPaint = bVar.N;
                        textPaint.setTextSize(bVar.f17216h);
                        textPaint.setTypeface(bVar.u);
                        textPaint.setLetterSpacing(bVar.V);
                        float f10 = -textPaint.ascent();
                        rect2.left = this.f11808f.getCompoundPaddingLeft() + rect.left;
                        if (this.Q == 1 && this.f11808f.getMinLines() <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            compoundPaddingTop = (int) (rect.centerY() - (f10 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f11808f.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f11808f.getCompoundPaddingRight();
                        if (this.Q == 1 && this.f11808f.getMinLines() <= 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            compoundPaddingBottom = (int) (rect2.top + f10);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f11808f.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i23 = rect2.left;
                        int i24 = rect2.top;
                        int i25 = rect2.right;
                        Rect rect4 = bVar.f17208c;
                        if (rect4.left == i23 && rect4.top == i24 && rect4.right == i25 && rect4.bottom == compoundPaddingBottom) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            rect4.set(i23, i24, i25, compoundPaddingBottom);
                            bVar.L = true;
                        }
                        bVar.i(false);
                        if (e() && !this.f11842w0) {
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
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.D0;
        m mVar = this.f11805d;
        if (!z10) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.D0 = true;
        }
        if (this.f11839v != null && (editText = this.f11808f) != null) {
            this.f11839v.setGravity(editText.getGravity());
            this.f11839v.setPadding(this.f11808f.getCompoundPaddingLeft(), this.f11808f.getCompoundPaddingTop(), this.f11808f.getCompoundPaddingRight(), this.f11808f.getCompoundPaddingBottom());
        }
        mVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.f26666b);
        setError(yVar.f22715d);
        if (yVar.f22716f) {
            post(new androidx.activity.i(this, 23));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        boolean z10;
        super.onRtlPropertiesChanged(i10);
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.O) {
            ka.c cVar = this.N.f20582e;
            RectF rectF = this.f11804c0;
            float a = cVar.a(rectF);
            float a10 = this.N.f20583f.a(rectF);
            float a11 = this.N.f20585h.a(rectF);
            float a12 = this.N.f20584g.a(rectF);
            l lVar = this.N;
            a aVar = lVar.a;
            h7.l lVar2 = new h7.l(1);
            a aVar2 = lVar.f20579b;
            lVar2.a = aVar2;
            h7.l.b(aVar2);
            lVar2.f18826b = aVar;
            h7.l.b(aVar);
            a aVar3 = lVar.f20580c;
            lVar2.f18828d = aVar3;
            h7.l.b(aVar3);
            a aVar4 = lVar.f20581d;
            lVar2.f18827c = aVar4;
            h7.l.b(aVar4);
            lVar2.f18829e = new ka.a(a10);
            lVar2.f18830f = new ka.a(a);
            lVar2.f18832h = new ka.a(a12);
            lVar2.f18831g = new ka.a(a11);
            l lVar3 = new l(lVar2);
            this.O = z10;
            setShapeAppearanceModel(lVar3);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        y yVar = new y(super.onSaveInstanceState());
        if (m()) {
            yVar.f22715d = getError();
        }
        m mVar = this.f11805d;
        boolean z11 = true;
        if (mVar.f22643k != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !mVar.f22641i.isChecked()) {
            z11 = false;
        }
        yVar.f22716f = z11;
        return yVar;
    }

    public final void p() {
        boolean z10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.C;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue v10 = k.v(context, com.plantcare.ai.identifier.plantid.R.attr.colorControlActivated);
            if (v10 != null) {
                int i10 = v10.resourceId;
                if (i10 != 0) {
                    colorStateList2 = d0.h.getColorStateList(context, i10);
                } else {
                    int i11 = v10.data;
                    if (i11 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i11);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f11808f;
        if (editText != null && f2.b(editText) != null) {
            Drawable mutate = f2.b(this.f11808f).mutate();
            if (!m() && (this.f11830q == null || !this.f11826o)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && (colorStateList = this.D) != null) {
                colorStateList2 = colorStateList;
            }
            h0.a.h(mutate, colorStateList2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r3.d() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r3.f22650r != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        PorterDuffColorFilter g10;
        PorterDuffColorFilter g11;
        EditText editText = this.f11808f;
        if (editText == null || this.Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = s1.a;
        Drawable mutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = androidx.appcompat.widget.w.f1066b;
            synchronized (androidx.appcompat.widget.w.class) {
                g11 = s2.g(errorCurrentTextColors, mode);
            }
            mutate.setColorFilter(g11);
            return;
        }
        if (this.f11826o && (appCompatTextView = this.f11830q) != null) {
            int currentTextColor = appCompatTextView.getCurrentTextColor();
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode4 = androidx.appcompat.widget.w.f1066b;
            synchronized (androidx.appcompat.widget.w.class) {
                g10 = s2.g(currentTextColor, mode3);
            }
            mutate.setColorFilter(g10);
            return;
        }
        mutate.clearColorFilter();
        this.f11808f.refreshDrawableState();
    }

    public final void s() {
        EditText editText = this.f11808f;
        if (editText != null && this.H != null) {
            if ((this.K || editText.getBackground() == null) && this.Q != 0) {
                this.f11808f.setBackground(getEditTextBoxBackground());
                this.K = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.f11831q0 = i10;
            this.f11835s0 = i10;
            this.f11837t0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(d0.h.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f11831q0 = defaultColor;
        this.W = defaultColor;
        this.f11833r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f11835s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f11837t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.Q) {
            return;
        }
        this.Q = i10;
        if (this.f11808f != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.R = i10;
    }

    public void setBoxCornerFamily(int i10) {
        l lVar = this.N;
        lVar.getClass();
        h7.l lVar2 = new h7.l(lVar);
        ka.c cVar = this.N.f20582e;
        a s5 = u0.s(i10);
        lVar2.a = s5;
        h7.l.b(s5);
        lVar2.f18829e = cVar;
        ka.c cVar2 = this.N.f20583f;
        a s10 = u0.s(i10);
        lVar2.f18826b = s10;
        h7.l.b(s10);
        lVar2.f18830f = cVar2;
        ka.c cVar3 = this.N.f20585h;
        a s11 = u0.s(i10);
        lVar2.f18828d = s11;
        h7.l.b(s11);
        lVar2.f18832h = cVar3;
        ka.c cVar4 = this.N.f20584g;
        a s12 = u0.s(i10);
        lVar2.f18827c = s12;
        h7.l.b(s12);
        lVar2.f18831g = cVar4;
        this.N = new l(lVar2);
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f11827o0 != i10) {
            this.f11827o0 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f11823m0 = colorStateList.getDefaultColor();
            this.f11838u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f11825n0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f11827o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f11827o0 != colorStateList.getDefaultColor()) {
            this.f11827o0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f11829p0 != colorStateList) {
            this.f11829p0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.T = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.U = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f11822m != z10) {
            Editable editable = null;
            q qVar = this.f11820l;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f11830q = appCompatTextView;
                appCompatTextView.setId(com.plantcare.ai.identifier.plantid.R.id.textinput_counter);
                Typeface typeface = this.f11806d0;
                if (typeface != null) {
                    this.f11830q.setTypeface(typeface);
                }
                this.f11830q.setMaxLines(1);
                qVar.a(this.f11830q, 2);
                ((ViewGroup.MarginLayoutParams) this.f11830q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.plantcare.ai.identifier.plantid.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f11830q != null) {
                    EditText editText = this.f11808f;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                qVar.g(this.f11830q, 2);
                this.f11830q = null;
            }
            this.f11822m = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.f11824n != i10) {
            if (i10 > 0) {
                this.f11824n = i10;
            } else {
                this.f11824n = -1;
            }
            if (this.f11822m && this.f11830q != null) {
                EditText editText = this.f11808f;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f11832r != i10) {
            this.f11832r = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f11834s != i10) {
            this.f11834s = i10;
            o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            o();
        }
    }

    @RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            p();
        }
    }

    @RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        boolean z10;
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (!m() && (this.f11830q == null || !this.f11826o)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f11819k0 = colorStateList;
        this.f11821l0 = colorStateList;
        if (this.f11808f != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f11805d.f22641i.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f11805d.f22641i.setCheckable(z10);
    }

    public void setEndIconContentDescription(@StringRes int i10) {
        m mVar = this.f11805d;
        CharSequence text = i10 != 0 ? mVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = mVar.f22641i;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        m mVar = this.f11805d;
        Drawable t5 = i10 != 0 ? com.bumptech.glide.c.t(mVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = mVar.f22641i;
        checkableImageButton.setImageDrawable(t5);
        if (t5 != null) {
            ColorStateList colorStateList = mVar.f22645m;
            PorterDuff.Mode mode = mVar.f22646n;
            TextInputLayout textInputLayout = mVar.f22635b;
            u0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            u0.a0(textInputLayout, checkableImageButton, mVar.f22645m);
        }
    }

    public void setEndIconMinSize(int i10) {
        m mVar = this.f11805d;
        if (i10 >= 0) {
            if (i10 != mVar.f22647o) {
                mVar.f22647o = i10;
                CheckableImageButton checkableImageButton = mVar.f22641i;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = mVar.f22637d;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        mVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.f11805d.g(i10);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m mVar = this.f11805d;
        View.OnLongClickListener onLongClickListener = mVar.f22649q;
        CheckableImageButton checkableImageButton = mVar.f22641i;
        checkableImageButton.setOnClickListener(onClickListener);
        u0.k0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        m mVar = this.f11805d;
        mVar.f22649q = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f22641i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u0.k0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        m mVar = this.f11805d;
        mVar.f22648p = scaleType;
        mVar.f22641i.setScaleType(scaleType);
        mVar.f22637d.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        m mVar = this.f11805d;
        if (mVar.f22645m != colorStateList) {
            mVar.f22645m = colorStateList;
            u0.a(mVar.f22635b, mVar.f22641i, colorStateList, mVar.f22646n);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        m mVar = this.f11805d;
        if (mVar.f22646n != mode) {
            mVar.f22646n = mode;
            u0.a(mVar.f22635b, mVar.f22641i, mVar.f22645m, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f11805d.h(z10);
    }

    public void setError(@Nullable CharSequence charSequence) {
        q qVar = this.f11820l;
        if (!qVar.f22678q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            qVar.c();
            qVar.f22677p = charSequence;
            qVar.f22679r.setText(charSequence);
            int i10 = qVar.f22675n;
            if (i10 != 1) {
                qVar.f22676o = 1;
            }
            qVar.i(i10, qVar.f22676o, qVar.h(qVar.f22679r, charSequence));
            return;
        }
        qVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.f11820l;
        qVar.f22681t = i10;
        AppCompatTextView appCompatTextView = qVar.f22679r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        q qVar = this.f11820l;
        qVar.f22680s = charSequence;
        AppCompatTextView appCompatTextView = qVar.f22679r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.f11820l;
        if (qVar.f22678q != z10) {
            qVar.c();
            TextInputLayout textInputLayout = qVar.f22669h;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f22668g);
                qVar.f22679r = appCompatTextView;
                appCompatTextView.setId(com.plantcare.ai.identifier.plantid.R.id.textinput_error);
                qVar.f22679r.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f22679r.setTypeface(typeface);
                }
                int i10 = qVar.u;
                qVar.u = i10;
                AppCompatTextView appCompatTextView2 = qVar.f22679r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i10);
                }
                ColorStateList colorStateList = qVar.f22682v;
                qVar.f22682v = colorStateList;
                AppCompatTextView appCompatTextView3 = qVar.f22679r;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = qVar.f22680s;
                qVar.f22680s = charSequence;
                AppCompatTextView appCompatTextView4 = qVar.f22679r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i11 = qVar.f22681t;
                qVar.f22681t = i11;
                AppCompatTextView appCompatTextView5 = qVar.f22679r;
                if (appCompatTextView5 != null) {
                    appCompatTextView5.setAccessibilityLiveRegion(i11);
                }
                qVar.f22679r.setVisibility(4);
                qVar.a(qVar.f22679r, 0);
            } else {
                qVar.f();
                qVar.g(qVar.f22679r, 0);
                qVar.f22679r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            qVar.f22678q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        m mVar = this.f11805d;
        mVar.i(i10 != 0 ? com.bumptech.glide.c.t(mVar.getContext(), i10) : null);
        u0.a0(mVar.f22635b, mVar.f22637d, mVar.f22638f);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m mVar = this.f11805d;
        CheckableImageButton checkableImageButton = mVar.f22637d;
        View.OnLongClickListener onLongClickListener = mVar.f22640h;
        checkableImageButton.setOnClickListener(onClickListener);
        u0.k0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        m mVar = this.f11805d;
        mVar.f22640h = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f22637d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u0.k0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        m mVar = this.f11805d;
        if (mVar.f22638f != colorStateList) {
            mVar.f22638f = colorStateList;
            u0.a(mVar.f22635b, mVar.f22637d, colorStateList, mVar.f22639g);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        m mVar = this.f11805d;
        if (mVar.f22639g != mode) {
            mVar.f22639g = mode;
            u0.a(mVar.f22635b, mVar.f22637d, mVar.f22638f, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.f11820l;
        qVar.u = i10;
        AppCompatTextView appCompatTextView = qVar.f22679r;
        if (appCompatTextView != null) {
            qVar.f22669h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        q qVar = this.f11820l;
        qVar.f22682v = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f22679r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f11846y0 != z10) {
            this.f11846y0 = z10;
            u(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f11820l;
        if (isEmpty) {
            if (qVar.f22684x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f22684x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f22683w = charSequence;
        qVar.f22685y.setText(charSequence);
        int i10 = qVar.f22675n;
        if (i10 != 2) {
            qVar.f22676o = 2;
        }
        qVar.i(i10, qVar.f22676o, qVar.h(qVar.f22685y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        q qVar = this.f11820l;
        qVar.A = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f22685y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.f11820l;
        if (qVar.f22684x != z10) {
            qVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f22668g);
                qVar.f22685y = appCompatTextView;
                appCompatTextView.setId(com.plantcare.ai.identifier.plantid.R.id.textinput_helper_text);
                qVar.f22685y.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f22685y.setTypeface(typeface);
                }
                qVar.f22685y.setVisibility(4);
                qVar.f22685y.setAccessibilityLiveRegion(1);
                int i10 = qVar.f22686z;
                qVar.f22686z = i10;
                AppCompatTextView appCompatTextView2 = qVar.f22685y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(i10);
                }
                ColorStateList colorStateList = qVar.A;
                qVar.A = colorStateList;
                AppCompatTextView appCompatTextView3 = qVar.f22685y;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                qVar.a(qVar.f22685y, 1);
                qVar.f22685y.setAccessibilityDelegate(new p(qVar));
            } else {
                qVar.c();
                int i11 = qVar.f22675n;
                if (i11 == 2) {
                    qVar.f22676o = 0;
                }
                qVar.i(i11, qVar.f22676o, qVar.h(qVar.f22685y, ""));
                qVar.g(qVar.f22685y, 1);
                qVar.f22685y = null;
                TextInputLayout textInputLayout = qVar.f22669h;
                textInputLayout.r();
                textInputLayout.x();
            }
            qVar.f22684x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.f11820l;
        qVar.f22686z = i10;
        AppCompatTextView appCompatTextView = qVar.f22685y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f11848z0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            if (!z10) {
                this.G = false;
                if (!TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.f11808f.getHint())) {
                    this.f11808f.setHint(this.F);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f11808f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.F)) {
                        setHint(hint);
                    }
                    this.f11808f.setHint((CharSequence) null);
                }
                this.G = true;
            }
            if (this.f11808f != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.f11844x0;
        View view = bVar.a;
        ha.d dVar = new ha.d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f19000k;
        if (colorStateList != null) {
            bVar.f17219k = colorStateList;
        }
        float f10 = dVar.f19001l;
        if (f10 != 0.0f) {
            bVar.f17217i = f10;
        }
        ColorStateList colorStateList2 = dVar.a;
        if (colorStateList2 != null) {
            bVar.T = colorStateList2;
        }
        bVar.R = dVar.f18995f;
        bVar.S = dVar.f18996g;
        bVar.Q = dVar.f18997h;
        bVar.U = dVar.f18999j;
        ha.a aVar = bVar.f17232y;
        if (aVar != null) {
            aVar.f18984h = true;
        }
        y7.u uVar = new y7.u(bVar);
        dVar.a();
        bVar.f17232y = new ha.a(uVar, dVar.f19005p);
        dVar.b(view.getContext(), bVar.f17232y);
        bVar.i(false);
        this.f11821l0 = bVar.f17219k;
        if (this.f11808f != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f11821l0 != colorStateList) {
            if (this.f11819k0 == null) {
                b bVar = this.f11844x0;
                if (bVar.f17219k != colorStateList) {
                    bVar.f17219k = colorStateList;
                    bVar.i(false);
                }
            }
            this.f11821l0 = colorStateList;
            if (this.f11808f != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull x xVar) {
        this.f11828p = xVar;
    }

    public void setMaxEms(int i10) {
        this.f11814i = i10;
        EditText editText = this.f11808f;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f11818k = i10;
        EditText editText = this.f11808f;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f11812h = i10;
        EditText editText = this.f11808f;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f11816j = i10;
        EditText editText = this.f11808f;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i10) {
        m mVar = this.f11805d;
        mVar.f22641i.setContentDescription(i10 != 0 ? mVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        m mVar = this.f11805d;
        mVar.f22641i.setImageDrawable(i10 != 0 ? com.bumptech.glide.c.t(mVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        m mVar = this.f11805d;
        if (z10 && mVar.f22643k != 1) {
            mVar.g(1);
        } else if (!z10) {
            mVar.g(0);
        } else {
            mVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        m mVar = this.f11805d;
        mVar.f22645m = colorStateList;
        u0.a(mVar.f22635b, mVar.f22641i, colorStateList, mVar.f22646n);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        m mVar = this.f11805d;
        mVar.f22646n = mode;
        u0.a(mVar.f22635b, mVar.f22641i, mVar.f22645m, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        Editable text;
        if (this.f11839v == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f11839v = appCompatTextView;
            appCompatTextView.setId(com.plantcare.ai.identifier.plantid.R.id.textinput_placeholder);
            this.f11839v.setImportantForAccessibility(2);
            h d10 = d();
            this.f11845y = d10;
            d10.f17639c = 67L;
            this.f11847z = d();
            setPlaceholderTextAppearance(this.f11843x);
            setPlaceholderTextColor(this.f11841w);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.u) {
                setPlaceholderTextEnabled(true);
            }
            this.f11836t = charSequence;
        }
        EditText editText = this.f11808f;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        v(text);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f11843x = i10;
        AppCompatTextView appCompatTextView = this.f11839v;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f11841w != colorStateList) {
            this.f11841w = colorStateList;
            AppCompatTextView appCompatTextView = this.f11839v;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        u uVar = this.f11803c;
        uVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        uVar.f22703d = charSequence2;
        uVar.f22702c.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f11803c.f22702c.setTextAppearance(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f11803c.f22702c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull l lVar) {
        i iVar = this.H;
        if (iVar != null && iVar.f20557b.a != lVar) {
            this.N = lVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f11803c.f22704f.setCheckable(z10);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11803c.f22704f;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? com.bumptech.glide.c.t(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        u uVar = this.f11803c;
        if (i10 >= 0) {
            if (i10 != uVar.f22707i) {
                uVar.f22707i = i10;
                CheckableImageButton checkableImageButton = uVar.f22704f;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        uVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        u uVar = this.f11803c;
        View.OnLongClickListener onLongClickListener = uVar.f22709k;
        CheckableImageButton checkableImageButton = uVar.f22704f;
        checkableImageButton.setOnClickListener(onClickListener);
        u0.k0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        u uVar = this.f11803c;
        uVar.f22709k = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f22704f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u0.k0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        u uVar = this.f11803c;
        uVar.f22708j = scaleType;
        uVar.f22704f.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        u uVar = this.f11803c;
        if (uVar.f22705g != colorStateList) {
            uVar.f22705g = colorStateList;
            u0.a(uVar.f22701b, uVar.f22704f, colorStateList, uVar.f22706h);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        u uVar = this.f11803c;
        if (uVar.f22706h != mode) {
            uVar.f22706h = mode;
            u0.a(uVar.f22701b, uVar.f22704f, uVar.f22705g, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f11803c.c(z10);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        m mVar = this.f11805d;
        mVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        mVar.f22650r = charSequence2;
        mVar.f22651s.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f11805d.f22651s.setTextAppearance(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f11805d.f22651s.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable w wVar) {
        EditText editText = this.f11808f;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, wVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f11806d0) {
            this.f11806d0 = typeface;
            this.f11844x0.m(typeface);
            q qVar = this.f11820l;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                AppCompatTextView appCompatTextView = qVar.f22679r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = qVar.f22685y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f11830q;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.Q != 1) {
            FrameLayout frameLayout = this.f11801b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f11808f;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f11808f;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.f11819k0;
        b bVar = this.f11844x0;
        if (colorStateList3 != null) {
            bVar.j(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f11819k0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.f11838u0);
            } else {
                i10 = this.f11838u0;
            }
            bVar.j(ColorStateList.valueOf(i10));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f11820l.f22679r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.j(colorStateList2);
        } else if (this.f11826o && (appCompatTextView = this.f11830q) != null) {
            bVar.j(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f11821l0) != null && bVar.f17219k != colorStateList) {
            bVar.f17219k = colorStateList;
            bVar.i(false);
        }
        m mVar = this.f11805d;
        u uVar = this.f11803c;
        if (!z12 && this.f11846y0 && (!isEnabled() || !z13)) {
            if (z11 || !this.f11842w0) {
                ValueAnimator valueAnimator = this.A0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A0.cancel();
                }
                if (z10 && this.f11848z0) {
                    a(0.0f);
                } else {
                    bVar.l(0.0f);
                }
                if (e() && (!((g) this.H).B.f22616w.isEmpty()) && e()) {
                    ((g) this.H).p(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f11842w0 = true;
                AppCompatTextView appCompatTextView3 = this.f11839v;
                if (appCompatTextView3 != null && this.u) {
                    appCompatTextView3.setText((CharSequence) null);
                    f2.x.a(this.f11801b, this.f11847z);
                    this.f11839v.setVisibility(4);
                }
                uVar.f22710l = true;
                uVar.e();
                mVar.f22652t = true;
                mVar.n();
                return;
            }
            return;
        }
        if (z11 || this.f11842w0) {
            ValueAnimator valueAnimator2 = this.A0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.A0.cancel();
            }
            if (z10 && this.f11848z0) {
                a(1.0f);
            } else {
                bVar.l(1.0f);
            }
            this.f11842w0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f11808f;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            v(editable);
            uVar.f22710l = false;
            uVar.e();
            mVar.f22652t = false;
            mVar.n();
        }
    }

    public final void v(Editable editable) {
        int i10;
        ((n0.h) this.f11828p).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        FrameLayout frameLayout = this.f11801b;
        if (i10 == 0 && !this.f11842w0) {
            if (this.f11839v != null && this.u && !TextUtils.isEmpty(this.f11836t)) {
                this.f11839v.setText(this.f11836t);
                f2.x.a(frameLayout, this.f11845y);
                this.f11839v.setVisibility(0);
                this.f11839v.bringToFront();
                announceForAccessibility(this.f11836t);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f11839v;
        if (appCompatTextView != null && this.u) {
            appCompatTextView.setText((CharSequence) null);
            f2.x.a(frameLayout, this.f11847z);
            this.f11839v.setVisibility(4);
        }
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.f11829p0.getDefaultColor();
        int colorForState = this.f11829p0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f11829p0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.V = colorForState2;
        } else if (z11) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    public final void x() {
        boolean z10;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.H != null && this.Q != 0) {
            boolean z11 = false;
            if (!isFocused() && ((editText2 = this.f11808f) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (isHovered() || ((editText = this.f11808f) != null && editText.isHovered())) {
                z11 = true;
            }
            if (!isEnabled()) {
                this.V = this.f11838u0;
            } else if (m()) {
                if (this.f11829p0 != null) {
                    w(z10, z11);
                } else {
                    this.V = getErrorCurrentTextColors();
                }
            } else if (this.f11826o && (appCompatTextView = this.f11830q) != null) {
                if (this.f11829p0 != null) {
                    w(z10, z11);
                } else {
                    this.V = appCompatTextView.getCurrentTextColor();
                }
            } else if (z10) {
                this.V = this.f11827o0;
            } else if (z11) {
                this.V = this.f11825n0;
            } else {
                this.V = this.f11823m0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            m mVar = this.f11805d;
            mVar.l();
            CheckableImageButton checkableImageButton = mVar.f22637d;
            ColorStateList colorStateList = mVar.f22638f;
            TextInputLayout textInputLayout = mVar.f22635b;
            u0.a0(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = mVar.f22645m;
            CheckableImageButton checkableImageButton2 = mVar.f22641i;
            u0.a0(textInputLayout, checkableImageButton2, colorStateList2);
            if (mVar.b() instanceof j) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    h0.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    u0.a(textInputLayout, checkableImageButton2, mVar.f22645m, mVar.f22646n);
                }
            }
            u uVar = this.f11803c;
            u0.a0(uVar.f22701b, uVar.f22704f, uVar.f22705g);
            if (this.Q == 2) {
                int i10 = this.S;
                if (z10 && isEnabled()) {
                    this.S = this.U;
                } else {
                    this.S = this.T;
                }
                if (this.S != i10 && e() && !this.f11842w0) {
                    if (e()) {
                        ((g) this.H).p(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.Q == 1) {
                if (!isEnabled()) {
                    this.W = this.f11833r0;
                } else if (z11 && !z10) {
                    this.W = this.f11837t0;
                } else if (z10) {
                    this.W = this.f11835s0;
                } else {
                    this.W = this.f11831q0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f11803c.b(drawable);
    }

    public void setHint(@StringRes int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(@StringRes int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f11805d.f22641i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f11805d.f22641i.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f11805d.i(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11805d.f22641i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        m mVar = this.f11805d;
        CheckableImageButton checkableImageButton = mVar.f22641i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = mVar.f22645m;
            PorterDuff.Mode mode = mVar.f22646n;
            TextInputLayout textInputLayout = mVar.f22635b;
            u0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            u0.a0(textInputLayout, checkableImageButton, mVar.f22645m);
        }
    }
}
