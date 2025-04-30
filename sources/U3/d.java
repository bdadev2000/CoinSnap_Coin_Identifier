package U3;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.tools.arruler.photomeasure.camera.ruler.R;
import x3.AbstractC2920a;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public final class d extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f3141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3142f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3143g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f3144h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f3145i;

    /* renamed from: j, reason: collision with root package name */
    public final A6.c f3146j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0303a f3147k;
    public AnimatorSet l;
    public ValueAnimator m;

    public d(o oVar) {
        super(oVar);
        this.f3146j = new A6.c(this, 3);
        this.f3147k = new ViewOnFocusChangeListenerC0303a(this, 0);
        this.f3141e = AbstractC2947c.u(oVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f3142f = AbstractC2947c.u(oVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f3143g = AbstractC2947c.v(oVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC2920a.f24226a);
        this.f3144h = AbstractC2947c.v(oVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2920a.f24228d);
    }

    @Override // U3.p
    public final void a() {
        if (this.b.f3181r != null) {
            return;
        }
        t(u());
    }

    @Override // U3.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // U3.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // U3.p
    public final View.OnFocusChangeListener e() {
        return this.f3147k;
    }

    @Override // U3.p
    public final View.OnClickListener f() {
        return this.f3146j;
    }

    @Override // U3.p
    public final View.OnFocusChangeListener g() {
        return this.f3147k;
    }

    @Override // U3.p
    public final void m(EditText editText) {
        this.f3145i = editText;
        this.f3188a.setEndIconVisible(u());
    }

    @Override // U3.p
    public final void p(boolean z8) {
        if (this.b.f3181r == null) {
            return;
        }
        t(z8);
    }

    @Override // U3.p
    public final void r() {
        final int i9 = 1;
        final int i10 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f3144h);
        ofFloat.setDuration(this.f3142f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: U3.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        d dVar = this.b;
                        dVar.getClass();
                        dVar.f3190d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f3190d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3143g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f3141e;
        ofFloat2.setDuration(i11);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: U3.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.b;
                        dVar.getClass();
                        dVar.f3190d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f3190d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new c(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: U3.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.b;
                        dVar.getClass();
                        dVar.f3190d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f3190d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new c(this, i9));
    }

    @Override // U3.p
    public final void s() {
        EditText editText = this.f3145i;
        if (editText != null) {
            editText.post(new D3.b(this, 7));
        }
    }

    public final void t(boolean z8) {
        boolean z9;
        if (this.b.d() == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z9) {
                this.l.end();
                return;
            }
            return;
        }
        if (!z8) {
            this.l.cancel();
            this.m.start();
            if (z9) {
                this.m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f3145i;
        if (editText != null && ((editText.hasFocus() || this.f3190d.hasFocus()) && this.f3145i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
