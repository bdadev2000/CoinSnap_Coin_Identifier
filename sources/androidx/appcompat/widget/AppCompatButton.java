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
import com.tools.arruler.photomeasure.camera.ruler.R;
import e1.f;
import g4.AbstractC2292b;
import q.C2596e0;
import q.C2617p;
import q.C2628v;
import q.O0;
import q.P0;
import q.W;
import q.g1;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    @NonNull
    private C2628v mAppCompatEmojiTextHelper;
    private final C2617p mBackgroundTintHelper;
    private final W mTextHelper;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private C2628v getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C2628v(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            c2617p.a();
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f22658c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            return Math.round(w2.f22604i.f22646e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f22658c) {
            return super.getAutoSizeMinTextSize();
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            return Math.round(w2.f22604i.f22645d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f22658c) {
            return super.getAutoSizeStepGranularity();
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            return Math.round(w2.f22604i.f22644c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f22658c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            return w2.f22604i.f22647f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f22658c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        W w2 = this.mTextHelper;
        if (w2 == null) {
            return 0;
        }
        return w2.f22604i.f22643a;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2292b.q(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            return c2617p.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            return c2617p.c();
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
        return ((f) getEmojiTextViewHelper().b.b).n();
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
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        W w2 = this.mTextHelper;
        if (w2 != null && !g1.f22658c) {
            w2.f22604i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        W w2 = this.mTextHelper;
        if (w2 != null && !g1.f22658c && w2.f22604i.f()) {
            this.mTextHelper.f22604i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) throws IllegalArgumentException {
        if (g1.f22658c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
            return;
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.i(i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i9) throws IllegalArgumentException {
        if (g1.f22658c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
            return;
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.j(iArr, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (g1.f22658c) {
            super.setAutoSizeTextTypeWithDefaults(i9);
            return;
        }
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.k(i9);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            c2617p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            c2617p.f(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2292b.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z8) {
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.f22597a.setAllCaps(z8);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            c2617p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C2617p c2617p = this.mBackgroundTintHelper;
        if (c2617p != null) {
            c2617p.i(mode);
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
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.g(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i9, float f9) {
        boolean z8 = g1.f22658c;
        if (z8) {
            super.setTextSize(i9, f9);
            return;
        }
        W w2 = this.mTextHelper;
        if (w2 != null && !z8) {
            C2596e0 c2596e0 = w2.f22604i;
            if (!c2596e0.f()) {
                c2596e0.g(i9, f9);
            }
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        P0.a(context);
        O0.a(this, getContext());
        C2617p c2617p = new C2617p(this);
        this.mBackgroundTintHelper = c2617p;
        c2617p.d(attributeSet, i9);
        W w2 = new W(this);
        this.mTextHelper = w2;
        w2.f(attributeSet, i9);
        w2.b();
        getEmojiTextViewHelper().b(attributeSet, i9);
    }
}
