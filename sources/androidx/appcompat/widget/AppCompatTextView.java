package androidx.appcompat.widget;

import L.j;
import R.d;
import R.e;
import Z.m;
import Z.p;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.a;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.g;
import com.facebook.appevents.n;
import com.facebook.internal.C1838g;
import com.mbridge.msdk.foundation.entity.o;
import e1.f;
import g4.AbstractC2292b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import q.C2596e0;
import q.C2617p;
import q.C2628v;
import q.O0;
import q.P;
import q.P0;
import q.Q;
import q.W;
import q.X;
import q.Y;
import q.Z;
import q.g1;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final C2617p mBackgroundTintHelper;

    @NonNull
    private C2628v mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<e> mPrecomputedTextFuture;

    @Nullable
    private X mSuperCaller;
    private final Q mTextClassifierHelper;
    private final W mTextHelper;

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<e> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                o.v(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC2292b.e(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @NonNull
    private C2628v getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C2628v(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @RequiresApi(api = 26)
    public X getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                this.mSuperCaller = new Z(this);
            } else if (i9 >= 28) {
                this.mSuperCaller = new Y(this);
            } else if (i9 >= 26) {
                this.mSuperCaller = new C1838g(this);
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        Q q9;
        if (Build.VERSION.SDK_INT >= 28 || (q9 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = q9.b;
        if (textClassifier == null) {
            return P.a(q9.f22588a);
        }
        return textClassifier;
    }

    @NonNull
    public d getTextMetricsParamsCompat() {
        return AbstractC2292b.e(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((f) getEmojiTextViewHelper().b.b).n();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        W.h(this, onCreateInputConnection, editorInfo);
        g.u(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30 && i9 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        W w2 = this.mTextHelper;
        if (w2 != null && !g1.f22658c) {
            w2.f22604i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i9, i10);
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
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i9);
        } else {
            AbstractC2292b.k(this, i9);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i9);
        } else {
            AbstractC2292b.m(this, i9);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i9) {
        AbstractC2292b.n(this, i9);
    }

    public void setPrecomputedText(@NonNull e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC2292b.e(this);
        throw null;
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        Q q9;
        if (Build.VERSION.SDK_INT >= 28 || (q9 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q9.b = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<e> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i9 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i9 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i9 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i9 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i9 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i9 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i9 = 7;
            }
        }
        setTextDirection(i9);
        getPaint().set(dVar.f2608a);
        m.e(this, dVar.f2609c);
        m.h(this, dVar.f2610d);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i9) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i9 > 0) {
            Context context = getContext();
            a aVar = j.f1674a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i9);
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
            super.setTypeface(typeface, i9);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i9, float f9) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().d(i9, f9);
        } else if (i10 >= 34) {
            p.a(this, i9, f9);
        } else {
            AbstractC2292b.n(this, Math.round(TypedValue.applyDimension(i9, f9, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [q.Q, java.lang.Object] */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        P0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        O0.a(this, getContext());
        C2617p c2617p = new C2617p(this);
        this.mBackgroundTintHelper = c2617p;
        c2617p.d(attributeSet, i9);
        W w2 = new W(this);
        this.mTextHelper = w2;
        w2.f(attributeSet, i9);
        w2.b();
        ?? obj = new Object();
        obj.f22588a = this;
        this.mTextClassifierHelper = obj;
        getEmojiTextViewHelper().b(attributeSet, i9);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i9 != 0 ? n.g(context, i9) : null, i10 != 0 ? n.g(context, i10) : null, i11 != 0 ? n.g(context, i11) : null, i12 != 0 ? n.g(context, i12) : null);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i9 != 0 ? n.g(context, i9) : null, i10 != 0 ? n.g(context, i10) : null, i11 != 0 ? n.g(context, i11) : null, i12 != 0 ? n.g(context, i12) : null);
        W w2 = this.mTextHelper;
        if (w2 != null) {
            w2.b();
        }
    }
}
