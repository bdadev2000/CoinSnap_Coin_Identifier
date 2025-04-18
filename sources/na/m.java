package na;

import android.content.res.ColorStateList;
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
import androidx.appcompat.widget.i3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v8.u0;

/* loaded from: classes3.dex */
public final class m extends LinearLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f22634y = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f22635b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f22636c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f22637d;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f22638f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f22639g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f22640h;

    /* renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f22641i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.activity.result.i f22642j;

    /* renamed from: k, reason: collision with root package name */
    public int f22643k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f22644l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f22645m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f22646n;

    /* renamed from: o, reason: collision with root package name */
    public int f22647o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView.ScaleType f22648p;

    /* renamed from: q, reason: collision with root package name */
    public View.OnLongClickListener f22649q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f22650r;

    /* renamed from: s, reason: collision with root package name */
    public final AppCompatTextView f22651s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22652t;
    public EditText u;

    /* renamed from: v, reason: collision with root package name */
    public final AccessibilityManager f22653v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.core.app.h f22654w;

    /* renamed from: x, reason: collision with root package name */
    public final k f22655x;

    public m(TextInputLayout textInputLayout, i3 i3Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f22643k = 0;
        this.f22644l = new LinkedHashSet();
        this.f22655x = new k(this);
        l lVar = new l(this);
        this.f22653v = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f22635b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f22636c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.f22637d = a;
        CheckableImageButton a10 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f22641i = a10;
        this.f22642j = new androidx.activity.result.i(this, i3Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f22651s = appCompatTextView;
        if (i3Var.l(38)) {
            this.f22638f = u0.A(getContext(), i3Var, 38);
        }
        if (i3Var.l(39)) {
            this.f22639g = u0.W(i3Var.h(39, -1), null);
        }
        if (i3Var.l(37)) {
            i(i3Var.e(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setFocusable(false);
        if (!i3Var.l(53)) {
            if (i3Var.l(32)) {
                this.f22645m = u0.A(getContext(), i3Var, 32);
            }
            if (i3Var.l(33)) {
                this.f22646n = u0.W(i3Var.h(33, -1), null);
            }
        }
        if (i3Var.l(30)) {
            g(i3Var.h(30, 0));
            if (i3Var.l(27) && a10.getContentDescription() != (k10 = i3Var.k(27))) {
                a10.setContentDescription(k10);
            }
            a10.setCheckable(i3Var.a(26, true));
        } else if (i3Var.l(53)) {
            if (i3Var.l(54)) {
                this.f22645m = u0.A(getContext(), i3Var, 54);
            }
            if (i3Var.l(55)) {
                this.f22646n = u0.W(i3Var.h(55, -1), null);
            }
            g(i3Var.a(53, false) ? 1 : 0);
            CharSequence k11 = i3Var.k(51);
            if (a10.getContentDescription() != k11) {
                a10.setContentDescription(k11);
            }
        }
        int d10 = i3Var.d(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f22647o) {
                this.f22647o = d10;
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
                a.setMinimumWidth(d10);
                a.setMinimumHeight(d10);
            }
            if (i3Var.l(31)) {
                ImageView.ScaleType r6 = u0.r(i3Var.h(31, -1));
                this.f22648p = r6;
                a10.setScaleType(r6);
                a.setScaleType(r6);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(i3Var.i(72, 0));
            if (i3Var.l(73)) {
                appCompatTextView.setTextColor(i3Var.b(73));
            }
            CharSequence k12 = i3Var.k(71);
            this.f22650r = TextUtils.isEmpty(k12) ? null : k12;
            appCompatTextView.setText(k12);
            n();
            frameLayout.addView(a10);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a);
            textInputLayout.f11811g0.add(lVar);
            if (textInputLayout.f11808f != null) {
                lVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new k.f(this, 2));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (u0.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        int i10 = this.f22643k;
        androidx.activity.result.i iVar = this.f22642j;
        n nVar = (n) ((SparseArray) iVar.f610d).get(i10);
        if (nVar == null) {
            if (i10 != -1) {
                int i11 = 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                nVar = new j((m) iVar.f611f);
                            } else {
                                throw new IllegalArgumentException(eb.j.i("Invalid end icon mode: ", i10));
                            }
                        } else {
                            nVar = new d((m) iVar.f611f);
                        }
                    } else {
                        nVar = new t((m) iVar.f611f, iVar.f609c);
                    }
                } else {
                    nVar = new e((m) iVar.f611f, i11);
                }
            } else {
                nVar = new e((m) iVar.f611f, 0);
            }
            ((SparseArray) iVar.f610d).append(i10, nVar);
        }
        return nVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f22641i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.f22651s.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f22636c.getVisibility() == 0 && this.f22641i.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f22637d.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        n b3 = b();
        boolean k10 = b3.k();
        CheckableImageButton checkableImageButton = this.f22641i;
        boolean z12 = true;
        if (k10 && (isChecked = checkableImageButton.isChecked()) != b3.l()) {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b3 instanceof j) && (isActivated = checkableImageButton.isActivated()) != b3.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            u0.a0(this.f22635b, checkableImageButton, this.f22645m);
        }
    }

    public final void g(int i10) {
        boolean z10;
        Drawable drawable;
        if (this.f22643k == i10) {
            return;
        }
        n b3 = b();
        androidx.core.app.h hVar = this.f22654w;
        AccessibilityManager accessibilityManager = this.f22653v;
        if (hVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new o0.b(hVar));
        }
        CharSequence charSequence = null;
        this.f22654w = null;
        b3.s();
        this.f22643k = i10;
        Iterator it = this.f22644l.iterator();
        if (!it.hasNext()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h(z10);
            n b10 = b();
            int i11 = this.f22642j.f608b;
            if (i11 == 0) {
                i11 = b10.d();
            }
            if (i11 != 0) {
                drawable = com.bumptech.glide.c.t(getContext(), i11);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f22641i;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f22635b;
            if (drawable != null) {
                u0.a(textInputLayout, checkableImageButton, this.f22645m, this.f22646n);
                u0.a0(textInputLayout, checkableImageButton, this.f22645m);
            }
            int c10 = b10.c();
            if (c10 != 0) {
                charSequence = getResources().getText(c10);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b10.k());
            if (b10.i(textInputLayout.getBoxBackgroundMode())) {
                b10.r();
                androidx.core.app.h h10 = b10.h();
                this.f22654w = h10;
                if (h10 != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new o0.b(this.f22654w));
                }
                View.OnClickListener f10 = b10.f();
                View.OnLongClickListener onLongClickListener = this.f22649q;
                checkableImageButton.setOnClickListener(f10);
                u0.k0(checkableImageButton, onLongClickListener);
                EditText editText = this.u;
                if (editText != null) {
                    b10.m(editText);
                    j(b10);
                }
                u0.a(textInputLayout, checkableImageButton, this.f22645m, this.f22646n);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        a4.j.t(it.next());
        throw null;
    }

    public final void h(boolean z10) {
        int i10;
        if (d() != z10) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f22641i.setVisibility(i10);
            k();
            m();
            this.f22635b.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f22637d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        u0.a(this.f22635b, checkableImageButton, this.f22638f, this.f22639g);
    }

    public final void j(n nVar) {
        if (this.u == null) {
            return;
        }
        if (nVar.e() != null) {
            this.u.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f22641i.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void k() {
        int i10;
        boolean z10;
        boolean z11;
        int i11 = 8;
        if (this.f22641i.getVisibility() == 0 && !e()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f22636c.setVisibility(i10);
        if (this.f22650r != null && !this.f22652t) {
            z10 = false;
        } else {
            z10 = 8;
        }
        if (!d() && !e() && z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void l() {
        boolean z10;
        int i10;
        CheckableImageButton checkableImageButton = this.f22637d;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z11 = true;
        TextInputLayout textInputLayout = this.f22635b;
        if (drawable != null && textInputLayout.f11820l.f22678q && textInputLayout.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        k();
        m();
        if (this.f22643k == 0) {
            z11 = false;
        }
        if (!z11) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i10;
        TextInputLayout textInputLayout = this.f22635b;
        if (textInputLayout.f11808f == null) {
            return;
        }
        if (!d() && !e()) {
            i10 = textInputLayout.f11808f.getPaddingEnd();
        } else {
            i10 = 0;
        }
        this.f22651s.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f11808f.getPaddingTop(), i10, textInputLayout.f11808f.getPaddingBottom());
    }

    public final void n() {
        int i10;
        AppCompatTextView appCompatTextView = this.f22651s;
        int visibility = appCompatTextView.getVisibility();
        boolean z10 = false;
        if (this.f22650r != null && !this.f22652t) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            n b3 = b();
            if (i10 == 0) {
                z10 = true;
            }
            b3.p(z10);
        }
        k();
        appCompatTextView.setVisibility(i10);
        this.f22635b.q();
    }
}
