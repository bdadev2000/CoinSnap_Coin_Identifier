package U3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
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
import androidx.core.view.ViewCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import x3.AbstractC2920a;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f3196A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f3197B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3198a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3199c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3200d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3201e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3202f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3203g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f3204h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f3205i;

    /* renamed from: j, reason: collision with root package name */
    public int f3206j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f3207k;
    public Animator l;
    public final float m;

    /* renamed from: n, reason: collision with root package name */
    public int f3208n;

    /* renamed from: o, reason: collision with root package name */
    public int f3209o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3210p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3211q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f3212r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3213s;

    /* renamed from: t, reason: collision with root package name */
    public int f3214t;

    /* renamed from: u, reason: collision with root package name */
    public int f3215u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f3216v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f3217w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3218x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f3219y;

    /* renamed from: z, reason: collision with root package name */
    public int f3220z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3203g = context;
        this.f3204h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3198a = AbstractC2947c.u(context, R.attr.motionDurationShort4, 217);
        this.b = AbstractC2947c.u(context, R.attr.motionDurationMedium4, 167);
        this.f3199c = AbstractC2947c.u(context, R.attr.motionDurationShort4, 167);
        this.f3200d = AbstractC2947c.v(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC2920a.f24228d);
        LinearInterpolator linearInterpolator = AbstractC2920a.f24226a;
        this.f3201e = AbstractC2947c.v(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3202f = AbstractC2947c.v(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i9) {
        if (this.f3205i == null && this.f3207k == null) {
            Context context = this.f3203g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3205i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3205i;
            TextInputLayout textInputLayout = this.f3204h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3207k = new FrameLayout(context);
            this.f3205i.addView(this.f3207k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i9 != 0 && i9 != 1) {
            this.f3205i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f3207k.setVisibility(0);
            this.f3207k.addView(textView);
        }
        this.f3205i.setVisibility(0);
        this.f3206j++;
    }

    public final void b() {
        if (this.f3205i != null) {
            TextInputLayout textInputLayout = this.f3204h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3203g;
                boolean u8 = android.support.v4.media.session.a.u(context);
                LinearLayout linearLayout = this.f3205i;
                int paddingStart = ViewCompat.getPaddingStart(editText);
                if (u8) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (u8) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = ViewCompat.getPaddingEnd(editText);
                if (u8) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                ViewCompat.setPaddingRelative(linearLayout, paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z8, TextView textView, int i9, int i10, int i11) {
        boolean z9;
        float f9;
        long j7;
        TimeInterpolator timeInterpolator;
        if (textView != null && z8) {
            if (i9 == i11 || i9 == i10) {
                if (i11 == i9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f9);
                int i12 = this.f3199c;
                if (z9) {
                    j7 = this.b;
                } else {
                    j7 = i12;
                }
                ofFloat.setDuration(j7);
                if (z9) {
                    timeInterpolator = this.f3201e;
                } else {
                    timeInterpolator = this.f3202f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i9 == i11 && i10 != 0) {
                    ofFloat.setStartDelay(i12);
                }
                arrayList.add(ofFloat);
                if (i11 == i9 && i10 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
                    ofFloat2.setDuration(this.f3198a);
                    ofFloat2.setInterpolator(this.f3200d);
                    ofFloat2.setStartDelay(i12);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                return null;
            }
            return this.f3219y;
        }
        return this.f3212r;
    }

    public final void f() {
        this.f3210p = null;
        c();
        if (this.f3208n == 1) {
            if (this.f3218x && !TextUtils.isEmpty(this.f3217w)) {
                this.f3209o = 2;
            } else {
                this.f3209o = 0;
            }
        }
        i(this.f3208n, this.f3209o, h(this.f3212r, ""));
    }

    public final void g(TextView textView, int i9) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3205i;
        if (linearLayout == null) {
            return;
        }
        if ((i9 == 0 || i9 == 1) && (frameLayout = this.f3207k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i10 = this.f3206j - 1;
        this.f3206j = i10;
        LinearLayout linearLayout2 = this.f3205i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f3204h;
        if (ViewCompat.isLaidOut(textInputLayout) && textInputLayout.isEnabled() && (this.f3209o != this.f3208n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i9, int i10, boolean z8) {
        TextView e4;
        TextView e9;
        if (i9 == i10) {
            return;
        }
        if (z8) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3218x, this.f3219y, 2, i9, i10);
            d(arrayList, this.f3211q, this.f3212r, 1, i9, i10);
            int size = arrayList.size();
            long j7 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                j7 = Math.max(j7, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j7);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new q(this, i10, e(i9), i9, e(i10)));
            animatorSet.start();
        } else if (i9 != i10) {
            if (i10 != 0 && (e9 = e(i10)) != null) {
                e9.setVisibility(0);
                e9.setAlpha(1.0f);
            }
            if (i9 != 0 && (e4 = e(i9)) != null) {
                e4.setVisibility(4);
                if (i9 == 1) {
                    e4.setText((CharSequence) null);
                }
            }
            this.f3208n = i10;
        }
        TextInputLayout textInputLayout = this.f3204h;
        textInputLayout.r();
        textInputLayout.u(z8, false);
        textInputLayout.x();
    }
}
