package na;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.plantcare.ai.identifier.plantid.R;
import v8.u0;

/* loaded from: classes3.dex */
public final class d extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f22606e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22607f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f22608g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f22609h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f22610i;

    /* renamed from: j, reason: collision with root package name */
    public final z2.b f22611j;

    /* renamed from: k, reason: collision with root package name */
    public final b f22612k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f22613l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f22614m;

    public d(m mVar) {
        super(mVar);
        this.f22611j = new z2.b(this, 5);
        this.f22612k = new b(this, 0);
        this.f22606e = u0.g0(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f22607f = u0.g0(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f22608g = u0.h0(mVar.getContext(), R.attr.motionEasingLinearInterpolator, s9.a.a);
        this.f22609h = u0.h0(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, s9.a.f24935d);
    }

    @Override // na.n
    public final void a() {
        if (this.f22656b.f22650r != null) {
            return;
        }
        t(u());
    }

    @Override // na.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // na.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // na.n
    public final View.OnFocusChangeListener e() {
        return this.f22612k;
    }

    @Override // na.n
    public final View.OnClickListener f() {
        return this.f22611j;
    }

    @Override // na.n
    public final View.OnFocusChangeListener g() {
        return this.f22612k;
    }

    @Override // na.n
    public final void m(EditText editText) {
        this.f22610i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // na.n
    public final void p(boolean z10) {
        if (this.f22656b.f22650r == null) {
            return;
        }
        t(z10);
    }

    @Override // na.n
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f22609h);
        ofFloat.setDuration(this.f22607f);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: na.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f22603b;

            {
                this.f22603b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i11 = i10;
                d dVar = this.f22603b;
                switch (i11) {
                    case 0:
                        dVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f22658d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        dVar.getClass();
                        dVar.f22658d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f22608g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f22606e;
        ofFloat2.setDuration(i11);
        final int i12 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: na.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f22603b;

            {
                this.f22603b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i112 = i12;
                d dVar = this.f22603b;
                switch (i112) {
                    case 0:
                        dVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f22658d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        dVar.getClass();
                        dVar.f22658d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22613l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f22613l.addListener(new c(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: na.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f22603b;

            {
                this.f22603b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i112 = i12;
                d dVar = this.f22603b;
                switch (i112) {
                    case 0:
                        dVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f22658d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        dVar.getClass();
                        dVar.f22658d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        this.f22614m = ofFloat3;
        ofFloat3.addListener(new c(this, i12));
    }

    @Override // na.n
    public final void s() {
        EditText editText = this.f22610i;
        if (editText != null) {
            editText.post(new k8.f(this, 6));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f22656b.d() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f22613l.isRunning()) {
            this.f22614m.cancel();
            this.f22613l.start();
            if (z11) {
                this.f22613l.end();
                return;
            }
            return;
        }
        if (!z10) {
            this.f22613l.cancel();
            this.f22614m.start();
            if (z11) {
                this.f22614m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f22610i;
        if (editText != null && ((editText.hasFocus() || this.f22658d.hasFocus()) && this.f22610i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
