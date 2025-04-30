package U3;

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
import androidx.core.view.ViewCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g4.AbstractC2292b;
import x3.AbstractC2920a;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public final class k extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f3155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3156f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3157g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f3158h;

    /* renamed from: i, reason: collision with root package name */
    public final A6.c f3159i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0303a f3160j;

    /* renamed from: k, reason: collision with root package name */
    public final F2.d f3161k;
    public boolean l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3162n;

    /* renamed from: o, reason: collision with root package name */
    public long f3163o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f3164p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f3165q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f3166r;

    public k(o oVar) {
        super(oVar);
        this.f3159i = new A6.c(this, 4);
        this.f3160j = new ViewOnFocusChangeListenerC0303a(this, 1);
        this.f3161k = new F2.d(this, 4);
        this.f3163o = Long.MAX_VALUE;
        this.f3156f = AbstractC2947c.u(oVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f3155e = AbstractC2947c.u(oVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f3157g = AbstractC2947c.v(oVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC2920a.f24226a);
    }

    @Override // U3.p
    public final void a() {
        if (this.f3164p.isTouchExplorationEnabled() && AbstractC2292b.f(this.f3158h) && !this.f3190d.hasFocus()) {
            this.f3158h.dismissDropDown();
        }
        this.f3158h.post(new D3.b(this, 8));
    }

    @Override // U3.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // U3.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // U3.p
    public final View.OnFocusChangeListener e() {
        return this.f3160j;
    }

    @Override // U3.p
    public final View.OnClickListener f() {
        return this.f3159i;
    }

    @Override // U3.p
    public final F2.d h() {
        return this.f3161k;
    }

    @Override // U3.p
    public final boolean i(int i9) {
        if (i9 != 0) {
            return true;
        }
        return false;
    }

    @Override // U3.p
    public final boolean j() {
        return this.l;
    }

    @Override // U3.p
    public final boolean l() {
        return this.f3162n;
    }

    @Override // U3.p
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f3158h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new i(this, 0));
            this.f3158h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: U3.j
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    k kVar = k.this;
                    kVar.m = true;
                    kVar.f3163o = System.currentTimeMillis();
                    kVar.t(false);
                }
            });
            this.f3158h.setThreshold(0);
            TextInputLayout textInputLayout = this.f3188a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!AbstractC2292b.f(editText) && this.f3164p.isTouchExplorationEnabled()) {
                ViewCompat.setImportantForAccessibility(this.f3190d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // U3.p
    public final void n(U.i iVar) {
        boolean e4;
        if (!AbstractC2292b.f(this.f3158h)) {
            iVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e4 = iVar.f3098a.isShowingHintText();
        } else {
            e4 = iVar.e(4);
        }
        if (e4) {
            iVar.j(null);
        }
    }

    @Override // U3.p
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z8;
        if (this.f3164p.isEnabled() && !AbstractC2292b.f(this.f3158h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f3162n && !this.f3158h.isPopupShowing()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z8) {
                u();
                this.m = true;
                this.f3163o = System.currentTimeMillis();
            }
        }
    }

    @Override // U3.p
    public final void r() {
        int i9 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3157g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f3156f);
        ofFloat.addUpdateListener(new h(this, i9));
        this.f3166r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f3155e);
        ofFloat2.addUpdateListener(new h(this, i9));
        this.f3165q = ofFloat2;
        ofFloat2.addListener(new B3.c(this, 5));
        this.f3164p = (AccessibilityManager) this.f3189c.getSystemService("accessibility");
    }

    @Override // U3.p
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f3158h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3158h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z8) {
        if (this.f3162n != z8) {
            this.f3162n = z8;
            this.f3166r.cancel();
            this.f3165q.start();
        }
    }

    public final void u() {
        boolean z8;
        if (this.f3158h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3163o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            this.m = false;
        }
        if (!this.m) {
            t(!this.f3162n);
            if (this.f3162n) {
                this.f3158h.requestFocus();
                this.f3158h.showDropDown();
                return;
            } else {
                this.f3158h.dismissDropDown();
                return;
            }
        }
        this.m = false;
    }
}
