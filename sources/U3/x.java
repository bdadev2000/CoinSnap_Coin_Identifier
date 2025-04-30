package U3;

import M0.C0219j;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes2.dex */
public final class x extends LinearLayout {
    public final TextInputLayout b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f3233c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f3234d;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f3235f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3236g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3237h;

    /* renamed from: i, reason: collision with root package name */
    public int f3238i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView.ScaleType f3239j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f3240k;
    public boolean l;

    public x(TextInputLayout textInputLayout, l5.k kVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3235f = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f3233c = appCompatTextView;
        if (android.support.v4.media.session.a.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3240k;
        checkableImageButton.setOnClickListener(null);
        C0219j.x(checkableImageButton, onLongClickListener);
        this.f3240k = null;
        checkableImageButton.setOnLongClickListener(null);
        C0219j.x(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) kVar.b;
        if (typedArray.hasValue(69)) {
            this.f3236g = android.support.v4.media.session.a.q(getContext(), kVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f3237h = L3.k.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(kVar.e(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f3238i) {
                this.f3238i = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType k6 = C0219j.k(typedArray.getInt(68, -1));
                this.f3239j = k6;
                checkableImageButton.setScaleType(k6);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                appCompatTextView.setTextColor(kVar.d(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f3234d = TextUtils.isEmpty(text2) ? null : text2;
            appCompatTextView.setText(text2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i9;
        CheckableImageButton checkableImageButton = this.f3235f;
        if (checkableImageButton.getVisibility() == 0) {
            i9 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i9 = 0;
        }
        return ViewCompat.getPaddingStart(this.f3233c) + ViewCompat.getPaddingStart(this) + i9;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3235f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3236g;
            PorterDuff.Mode mode = this.f3237h;
            TextInputLayout textInputLayout = this.b;
            C0219j.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            C0219j.w(textInputLayout, checkableImageButton, this.f3236g);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f3240k;
        checkableImageButton.setOnClickListener(null);
        C0219j.x(checkableImageButton, onLongClickListener);
        this.f3240k = null;
        checkableImageButton.setOnLongClickListener(null);
        C0219j.x(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z8) {
        boolean z9;
        CheckableImageButton checkableImageButton = this.f3235f;
        int i9 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != z8) {
            if (!z8) {
                i9 = 8;
            }
            checkableImageButton.setVisibility(i9);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.b.f14165f;
        if (editText == null) {
            return;
        }
        if (this.f3235f.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = ViewCompat.getPaddingStart(editText);
        }
        ViewCompat.setPaddingRelative(this.f3233c, paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i9;
        int i10 = 8;
        if (this.f3234d != null && !this.l) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        if (this.f3235f.getVisibility() == 0 || i9 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f3233c.setVisibility(i9);
        this.b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        d();
    }
}
