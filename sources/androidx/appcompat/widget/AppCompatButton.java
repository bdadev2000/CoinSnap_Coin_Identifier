package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    @NonNull
    private z mAppCompatEmojiTextHelper;
    private final r mBackgroundTintHelper;
    private final d1 mTextHelper;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private z getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new z(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.a();
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f4.f868b) {
            return super.getAutoSizeMaxTextSize();
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            return Math.round(d1Var.f848i.f952e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f4.f868b) {
            return super.getAutoSizeMinTextSize();
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            return Math.round(d1Var.f848i.f951d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f4.f868b) {
            return super.getAutoSizeStepGranularity();
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            return Math.round(d1Var.f848i.f950c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f4.f868b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            return d1Var.f848i.f953f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f4.f868b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var == null) {
            return 0;
        }
        return d1Var.f848i.a;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.g.L(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return ((ac.e) getEmojiTextViewHelper().f1101b.f17509c).p();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null && !f4.f868b) {
            d1Var.f848i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        d1 d1Var = this.mTextHelper;
        boolean z11 = false;
        if (d1Var != null && !f4.f868b) {
            n1 n1Var = d1Var.f848i;
            if (n1Var.i() && n1Var.a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            this.mTextHelper.f848i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (f4.f868b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (f4.f868b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (f4.f868b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.g.M(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = f4.f868b;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        d1 d1Var = this.mTextHelper;
        if (d1Var != null && !z11) {
            n1 n1Var = d1Var.f848i;
            if (n1Var.i() && n1Var.a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                n1Var.f(f10, i10);
            }
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q3.a(context);
        p3.a(getContext(), this);
        r rVar = new r(this);
        this.mBackgroundTintHelper = rVar;
        rVar.d(attributeSet, i10);
        d1 d1Var = new d1(this);
        this.mTextHelper = d1Var;
        d1Var.f(attributeSet, i10);
        d1Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
