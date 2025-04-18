package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final r mBackgroundTintHelper;

    @NonNull
    private z mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<l0.f> mPrecomputedTextFuture;

    @Nullable
    private e1 mSuperCaller;
    private final v0 mTextClassifierHelper;
    private final d1 mTextHelper;

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<l0.f> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                a4.j.t(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                d6.g.q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @NonNull
    private z getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new z(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @RequiresApi(api = 26)
    public e1 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.mSuperCaller = new f1(this);
            } else if (i10 >= 26) {
                this.mSuperCaller = new v3.c(this, 2);
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        v0 v0Var;
        if (Build.VERSION.SDK_INT < 28 && (v0Var = this.mTextClassifierHelper) != null) {
            TextClassifier textClassifier = v0Var.f1062b;
            if (textClassifier == null) {
                return u0.a(v0Var.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @NonNull
    public l0.e getTextMetricsParamsCompat() {
        return d6.g.q(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((ac.e) getEmojiTextViewHelper().f1101b.f17509c).p();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        d1.h(this, onCreateInputConnection, editorInfo);
        com.bumptech.glide.c.L(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null && !f4.f868b) {
            d1Var.f848i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
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
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().u(i10);
        } else {
            d6.g.F(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i10);
        } else {
            d6.g.G(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        com.bumptech.glide.e.j(i10);
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(@NonNull l0.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        d6.g.q(this);
        throw null;
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        v0 v0Var;
        if (Build.VERSION.SDK_INT < 28 && (v0Var = this.mTextClassifierHelper) != null) {
            v0Var.f1062b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(@Nullable Future<l0.f> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull l0.e eVar) {
        int i10;
        TextDirectionHeuristic textDirectionHeuristic = eVar.f21102b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
            setTextDirection(i10);
            getPaint().set(eVar.a);
            t0.m.e(this, eVar.f21103c);
            t0.m.h(this, eVar.f21104d);
        }
        i10 = 1;
        setTextDirection(i10);
        getPaint().set(eVar.a);
        t0.m.e(this, eVar.f21103c);
        t0.m.h(this, eVar.f21104d);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            v3.c cVar = g0.l.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q3.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        p3.a(getContext(), this);
        r rVar = new r(this);
        this.mBackgroundTintHelper = rVar;
        rVar.d(attributeSet, i10);
        d1 d1Var = new d1(this);
        this.mTextHelper = d1Var;
        d1Var.f(attributeSet, i10);
        d1Var.b();
        this.mTextClassifierHelper = new v0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? com.bumptech.glide.c.t(context, i10) : null, i11 != 0 ? com.bumptech.glide.c.t(context, i11) : null, i12 != 0 ? com.bumptech.glide.c.t(context, i12) : null, i13 != 0 ? com.bumptech.glide.c.t(context, i13) : null);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? com.bumptech.glide.c.t(context, i10) : null, i11 != 0 ? com.bumptech.glide.c.t(context, i11) : null, i12 != 0 ? com.bumptech.glide.c.t(context, i12) : null, i13 != 0 ? com.bumptech.glide.c.t(context, i13) : null);
        d1 d1Var = this.mTextHelper;
        if (d1Var != null) {
            d1Var.b();
        }
    }
}
