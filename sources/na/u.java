package na;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.i3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.R;
import v8.u0;

/* loaded from: classes3.dex */
public final class u extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f22701b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f22702c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f22703d;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f22704f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f22705g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f22706h;

    /* renamed from: i, reason: collision with root package name */
    public int f22707i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView.ScaleType f22708j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f22709k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22710l;

    public u(TextInputLayout textInputLayout, i3 i3Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f22701b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f22704f = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f22702c = appCompatTextView;
        if (u0.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f22709k;
        checkableImageButton.setOnClickListener(null);
        u0.k0(checkableImageButton, onLongClickListener);
        this.f22709k = null;
        checkableImageButton.setOnLongClickListener(null);
        u0.k0(checkableImageButton, null);
        if (i3Var.l(69)) {
            this.f22705g = u0.A(getContext(), i3Var, 69);
        }
        if (i3Var.l(70)) {
            this.f22706h = u0.W(i3Var.h(70, -1), null);
        }
        if (i3Var.l(66)) {
            b(i3Var.e(66));
            if (i3Var.l(65) && checkableImageButton.getContentDescription() != (k10 = i3Var.k(65))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(i3Var.a(64, true));
        }
        int d10 = i3Var.d(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f22707i) {
                this.f22707i = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (i3Var.l(68)) {
                ImageView.ScaleType r6 = u0.r(i3Var.h(68, -1));
                this.f22708j = r6;
                checkableImageButton.setScaleType(r6);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(i3Var.i(60, 0));
            if (i3Var.l(61)) {
                appCompatTextView.setTextColor(i3Var.b(61));
            }
            CharSequence k11 = i3Var.k(59);
            this.f22703d = TextUtils.isEmpty(k11) ? null : k11;
            appCompatTextView.setText(k11);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        boolean z10;
        CheckableImageButton checkableImageButton = this.f22704f;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        }
        return this.f22702c.getPaddingStart() + getPaddingStart() + i10;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f22704f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f22705g;
            PorterDuff.Mode mode = this.f22706h;
            TextInputLayout textInputLayout = this.f22701b;
            u0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            u0.a0(textInputLayout, checkableImageButton, this.f22705g);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f22709k;
        checkableImageButton.setOnClickListener(null);
        u0.k0(checkableImageButton, onLongClickListener);
        this.f22709k = null;
        checkableImageButton.setOnLongClickListener(null);
        u0.k0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f22704f;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            d();
            e();
        }
    }

    public final void d() {
        boolean z10;
        EditText editText = this.f22701b.f11808f;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (this.f22704f.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = editText.getPaddingStart();
        }
        this.f22702c.setPaddingRelative(i10, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.f22703d != null && !this.f22710l) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f22704f.getVisibility() != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f22702c.setVisibility(i10);
        this.f22701b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
