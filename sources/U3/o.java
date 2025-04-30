package U3;

import M0.C0219j;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class o extends LinearLayout {
    public final TextInputLayout b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f3169c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3170d;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f3171f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f3172g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f3173h;

    /* renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f3174i;

    /* renamed from: j, reason: collision with root package name */
    public final G5.b f3175j;

    /* renamed from: k, reason: collision with root package name */
    public int f3176k;
    public final LinkedHashSet l;
    public ColorStateList m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f3177n;

    /* renamed from: o, reason: collision with root package name */
    public int f3178o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView.ScaleType f3179p;

    /* renamed from: q, reason: collision with root package name */
    public View.OnLongClickListener f3180q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3181r;

    /* renamed from: s, reason: collision with root package name */
    public final AppCompatTextView f3182s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3183t;

    /* renamed from: u, reason: collision with root package name */
    public EditText f3184u;

    /* renamed from: v, reason: collision with root package name */
    public final AccessibilityManager f3185v;

    /* renamed from: w, reason: collision with root package name */
    public F2.d f3186w;

    /* renamed from: x, reason: collision with root package name */
    public final l f3187x;

    public o(TextInputLayout textInputLayout, l5.k kVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f3176k = 0;
        this.l = new LinkedHashSet();
        this.f3187x = new l(this);
        m mVar = new m(this);
        this.f3185v = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3169c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a6 = a(R.id.text_input_error_icon, from, this);
        this.f3170d = a6;
        CheckableImageButton a9 = a(R.id.text_input_end_icon, from, frameLayout);
        this.f3174i = a9;
        this.f3175j = new G5.b(this, kVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f3182s = appCompatTextView;
        TypedArray typedArray = (TypedArray) kVar.b;
        if (typedArray.hasValue(38)) {
            this.f3171f = android.support.v4.media.session.a.q(getContext(), kVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f3172g = L3.k.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(kVar.e(37));
        }
        a6.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(a6, 2);
        a6.setClickable(false);
        a6.setPressable(false);
        a6.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.m = android.support.v4.media.session.a.q(getContext(), kVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f3177n = L3.k.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a9.getContentDescription() != (text = typedArray.getText(27))) {
                a9.setContentDescription(text);
            }
            a9.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.m = android.support.v4.media.session.a.q(getContext(), kVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f3177n = L3.k.g(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a9.getContentDescription() != text2) {
                a9.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f3178o) {
                this.f3178o = dimensionPixelSize;
                a9.setMinimumWidth(dimensionPixelSize);
                a9.setMinimumHeight(dimensionPixelSize);
                a6.setMinimumWidth(dimensionPixelSize);
                a6.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType k6 = C0219j.k(typedArray.getInt(31, -1));
                this.f3179p = k6;
                a9.setScaleType(k6);
                a6.setScaleType(k6);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
            if (typedArray.hasValue(73)) {
                appCompatTextView.setTextColor(kVar.d(73));
            }
            CharSequence text3 = typedArray.getText(71);
            this.f3181r = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            n();
            frameLayout.addView(a9);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a6);
            textInputLayout.f14167g0.add(mVar);
            if (textInputLayout.f14165f != null) {
                mVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new n(this, 0));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(int i9, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i9);
        if (android.support.v4.media.session.a.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final p b() {
        p eVar;
        int i9 = this.f3176k;
        G5.b bVar = this.f3175j;
        SparseArray sparseArray = (SparseArray) bVar.f1276c;
        p pVar = (p) sparseArray.get(i9);
        if (pVar == null) {
            o oVar = (o) bVar.f1277d;
            if (i9 != -1) {
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                eVar = new k(oVar);
                            } else {
                                throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Invalid end icon mode: "));
                            }
                        } else {
                            eVar = new d(oVar);
                        }
                    } else {
                        pVar = new w(oVar, bVar.b);
                        sparseArray.append(i9, pVar);
                    }
                } else {
                    eVar = new e(oVar, 1);
                }
            } else {
                eVar = new e(oVar, 0);
            }
            pVar = eVar;
            sparseArray.append(i9, pVar);
        }
        return pVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f3174i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return ViewCompat.getPaddingEnd(this.f3182s) + ViewCompat.getPaddingEnd(this) + marginStart;
    }

    public final boolean d() {
        if (this.f3169c.getVisibility() == 0 && this.f3174i.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f3170d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z8) {
        boolean z9;
        boolean isActivated;
        boolean z10;
        p b = b();
        boolean k6 = b.k();
        CheckableImageButton checkableImageButton = this.f3174i;
        boolean z11 = true;
        if (k6 && (z10 = checkableImageButton.f14091f) != b.l()) {
            checkableImageButton.setChecked(!z10);
            z9 = true;
        } else {
            z9 = false;
        }
        if ((b instanceof k) && (isActivated = checkableImageButton.isActivated()) != b.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z11 = z9;
        }
        if (z8 || z11) {
            C0219j.w(this.b, checkableImageButton, this.m);
        }
    }

    public final void g(int i9) {
        boolean z8;
        Drawable drawable;
        if (this.f3176k == i9) {
            return;
        }
        p b = b();
        F2.d dVar = this.f3186w;
        AccessibilityManager accessibilityManager = this.f3185v;
        if (dVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new U.b(dVar));
        }
        CharSequence charSequence = null;
        this.f3186w = null;
        b.s();
        this.f3176k = i9;
        Iterator it = this.l.iterator();
        if (!it.hasNext()) {
            if (i9 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            h(z8);
            p b8 = b();
            int i10 = this.f3175j.f1275a;
            if (i10 == 0) {
                i10 = b8.d();
            }
            if (i10 != 0) {
                drawable = com.facebook.appevents.n.g(getContext(), i10);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f3174i;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.b;
            if (drawable != null) {
                C0219j.d(textInputLayout, checkableImageButton, this.m, this.f3177n);
                C0219j.w(textInputLayout, checkableImageButton, this.m);
            }
            int c9 = b8.c();
            if (c9 != 0) {
                charSequence = getResources().getText(c9);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b8.k());
            if (b8.i(textInputLayout.getBoxBackgroundMode())) {
                b8.r();
                F2.d h6 = b8.h();
                this.f3186w = h6;
                if (h6 != null && accessibilityManager != null && ViewCompat.isAttachedToWindow(this)) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new U.b(this.f3186w));
                }
                View.OnClickListener f9 = b8.f();
                View.OnLongClickListener onLongClickListener = this.f3180q;
                checkableImageButton.setOnClickListener(f9);
                C0219j.x(checkableImageButton, onLongClickListener);
                EditText editText = this.f3184u;
                if (editText != null) {
                    b8.m(editText);
                    j(b8);
                }
                C0219j.d(textInputLayout, checkableImageButton, this.m, this.f3177n);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i9);
        }
        com.mbridge.msdk.foundation.entity.o.v(it.next());
        throw null;
    }

    public final void h(boolean z8) {
        int i9;
        if (d() != z8) {
            if (z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            this.f3174i.setVisibility(i9);
            k();
            m();
            this.b.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3170d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        C0219j.d(this.b, checkableImageButton, this.f3171f, this.f3172g);
    }

    public final void j(p pVar) {
        if (this.f3184u == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f3184u.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f3174i.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void k() {
        int i9;
        boolean z8;
        int i10 = 8;
        if (this.f3174i.getVisibility() == 0 && !e()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f3169c.setVisibility(i9);
        if (this.f3181r != null && !this.f3183t) {
            z8 = false;
        } else {
            z8 = 8;
        }
        if (d() || e() || !z8) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    public final void l() {
        int i9;
        CheckableImageButton checkableImageButton = this.f3170d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.b;
        if (drawable != null && textInputLayout.l.f3211q && textInputLayout.m()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        checkableImageButton.setVisibility(i9);
        k();
        m();
        if (this.f3176k == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i9;
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.f14165f == null) {
            return;
        }
        if (!d() && !e()) {
            i9 = ViewCompat.getPaddingEnd(textInputLayout.f14165f);
        } else {
            i9 = 0;
        }
        ViewCompat.setPaddingRelative(this.f3182s, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f14165f.getPaddingTop(), i9, textInputLayout.f14165f.getPaddingBottom());
    }

    public final void n() {
        int i9;
        AppCompatTextView appCompatTextView = this.f3182s;
        int visibility = appCompatTextView.getVisibility();
        boolean z8 = false;
        if (this.f3181r != null && !this.f3183t) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        if (visibility != i9) {
            p b = b();
            if (i9 == 0) {
                z8 = true;
            }
            b.p(z8);
        }
        k();
        appCompatTextView.setVisibility(i9);
        this.b.q();
    }
}
