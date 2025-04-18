package na;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import v8.u0;

/* loaded from: classes3.dex */
public final class q {
    public ColorStateList A;
    public Typeface B;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22664c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f22665d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f22666e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f22667f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f22668g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f22669h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f22670i;

    /* renamed from: j, reason: collision with root package name */
    public int f22671j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f22672k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f22673l;

    /* renamed from: m, reason: collision with root package name */
    public final float f22674m;

    /* renamed from: n, reason: collision with root package name */
    public int f22675n;

    /* renamed from: o, reason: collision with root package name */
    public int f22676o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f22677p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22678q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f22679r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f22680s;

    /* renamed from: t, reason: collision with root package name */
    public int f22681t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f22682v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f22683w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22684x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f22685y;

    /* renamed from: z, reason: collision with root package name */
    public int f22686z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f22668g = context;
        this.f22669h = textInputLayout;
        this.f22674m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = u0.g0(context, R.attr.motionDurationShort4, 217);
        this.f22663b = u0.g0(context, R.attr.motionDurationMedium4, 167);
        this.f22664c = u0.g0(context, R.attr.motionDurationShort4, 167);
        this.f22665d = u0.h0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, s9.a.f24935d);
        LinearInterpolator linearInterpolator = s9.a.a;
        this.f22666e = u0.h0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f22667f = u0.h0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        boolean z10;
        if (this.f22670i == null && this.f22672k == null) {
            Context context = this.f22668g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f22670i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f22670i;
            TextInputLayout textInputLayout = this.f22669h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f22672k = new FrameLayout(context);
            this.f22670i.addView(this.f22672k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f22672k.setVisibility(0);
            this.f22672k.addView(textView);
        } else {
            this.f22670i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f22670i.setVisibility(0);
        this.f22671j++;
    }

    public final void b() {
        boolean z10;
        LinearLayout linearLayout = this.f22670i;
        TextInputLayout textInputLayout = this.f22669h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f22668g;
            boolean K = u0.K(context);
            LinearLayout linearLayout2 = this.f22670i;
            int paddingStart = editText.getPaddingStart();
            if (K) {
                paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (K) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int paddingEnd = editText.getPaddingEnd();
            if (K) {
                paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            linearLayout2.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
        }
    }

    public final void c() {
        Animator animator = this.f22673l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        float f10;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z13;
        if (textView != null && z10) {
            if (i10 != i12 && i10 != i11) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i12 == i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f10);
                int i14 = this.f22664c;
                if (z12) {
                    i13 = this.f22663b;
                } else {
                    i13 = i14;
                }
                ofFloat.setDuration(i13);
                if (z12) {
                    timeInterpolator = this.f22666e;
                } else {
                    timeInterpolator = this.f22667f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    ofFloat.setStartDelay(i14);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f22674m, 0.0f);
                    ofFloat2.setDuration(this.a);
                    ofFloat2.setInterpolator(this.f22665d);
                    ofFloat2.setStartDelay(i14);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f22685y;
        }
        return this.f22679r;
    }

    public final void f() {
        this.f22677p = null;
        c();
        if (this.f22675n == 1) {
            if (this.f22684x && !TextUtils.isEmpty(this.f22683w)) {
                this.f22676o = 2;
            } else {
                this.f22676o = 0;
            }
        }
        i(this.f22675n, this.f22676o, h(this.f22679r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f22670i;
        if (linearLayout == null) {
            return;
        }
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        if (z10 && (frameLayout = this.f22672k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f22671j - 1;
        this.f22671j = i11;
        LinearLayout linearLayout2 = this.f22670i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f22669h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled() && (this.f22676o != this.f22675n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView e2;
        TextView e10;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f22673l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f22684x, this.f22685y, 2, i10, i11);
            d(arrayList, this.f22678q, this.f22679r, 1, i10, i11);
            u0.Y(animatorSet, arrayList);
            animatorSet.addListener(new o(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e10 = e(i11)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i10 != 0 && (e2 = e(i10)) != null) {
                e2.setVisibility(4);
                if (i10 == 1) {
                    e2.setText((CharSequence) null);
                }
            }
            this.f22675n = i11;
        }
        TextInputLayout textInputLayout = this.f22669h;
        textInputLayout.r();
        textInputLayout.u(z10, false);
        textInputLayout.x();
    }
}
