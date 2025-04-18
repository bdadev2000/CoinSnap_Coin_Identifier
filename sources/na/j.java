package na;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.R;
import v8.u0;

/* loaded from: classes3.dex */
public final class j extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f22619e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22620f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f22621g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f22622h;

    /* renamed from: i, reason: collision with root package name */
    public final z2.b f22623i;

    /* renamed from: j, reason: collision with root package name */
    public final b f22624j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.core.app.h f22625k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22626l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22627m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22628n;

    /* renamed from: o, reason: collision with root package name */
    public long f22629o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f22630p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f22631q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f22632r;

    public j(m mVar) {
        super(mVar);
        this.f22623i = new z2.b(this, 6);
        this.f22624j = new b(this, 1);
        this.f22625k = new androidx.core.app.h(this, 28);
        this.f22629o = Long.MAX_VALUE;
        this.f22620f = u0.g0(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f22619e = u0.g0(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f22621g = u0.h0(mVar.getContext(), R.attr.motionEasingLinearInterpolator, s9.a.a);
    }

    @Override // na.n
    public final void a() {
        boolean z10;
        if (this.f22630p.isTouchExplorationEnabled()) {
            if (this.f22622h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f22658d.hasFocus()) {
                this.f22622h.dismissDropDown();
            }
        }
        this.f22622h.post(new k8.f(this, 7));
    }

    @Override // na.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // na.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // na.n
    public final View.OnFocusChangeListener e() {
        return this.f22624j;
    }

    @Override // na.n
    public final View.OnClickListener f() {
        return this.f22623i;
    }

    @Override // na.n
    public final androidx.core.app.h h() {
        return this.f22625k;
    }

    @Override // na.n
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // na.n
    public final boolean j() {
        return this.f22626l;
    }

    @Override // na.n
    public final boolean l() {
        return this.f22628n;
    }

    @Override // na.n
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f22622h = autoCompleteTextView;
            int i10 = 0;
            autoCompleteTextView.setOnTouchListener(new h(this, i10));
            this.f22622h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: na.i
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    j jVar = j.this;
                    jVar.f22627m = true;
                    jVar.f22629o = System.currentTimeMillis();
                    jVar.t(false);
                }
            });
            this.f22622h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                i10 = 1;
            }
            if (i10 == 0 && this.f22630p.isTouchExplorationEnabled()) {
                this.f22658d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // na.n
    public final void n(o0.j jVar) {
        boolean z10;
        boolean e2;
        if (this.f22622h.getInputType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            jVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e2 = jVar.a.isShowingHintText();
        } else {
            e2 = jVar.e(4);
        }
        if (e2) {
            jVar.l(null);
        }
    }

    @Override // na.n
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (this.f22630p.isEnabled()) {
            boolean z11 = false;
            if (this.f22622h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f22628n && !this.f22622h.isPopupShowing()) {
                    z11 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z11) {
                    u();
                    this.f22627m = true;
                    this.f22629o = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // na.n
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f22621g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f22620f);
        int i10 = 3;
        ofFloat.addUpdateListener(new m3.o(this, i10));
        this.f22632r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f22619e);
        ofFloat2.addUpdateListener(new m3.o(this, i10));
        this.f22631q = ofFloat2;
        ofFloat2.addListener(new androidx.appcompat.widget.d(this, 9));
        this.f22630p = (AccessibilityManager) this.f22657c.getSystemService("accessibility");
    }

    @Override // na.n
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f22622h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f22622h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f22628n != z10) {
            this.f22628n = z10;
            this.f22632r.cancel();
            this.f22631q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f22622h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f22629o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f22627m = false;
        }
        if (!this.f22627m) {
            t(!this.f22628n);
            if (this.f22628n) {
                this.f22622h.requestFocus();
                this.f22622h.showDropDown();
                return;
            } else {
                this.f22622h.dismissDropDown();
                return;
            }
        }
        this.f22627m = false;
    }
}
