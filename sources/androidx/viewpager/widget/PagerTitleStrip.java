package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public ViewPager f21751a;

    /* renamed from: b, reason: collision with root package name */
    public int f21752b;

    /* renamed from: c, reason: collision with root package name */
    public float f21753c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21754f;

    /* loaded from: classes2.dex */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public int f21755a;

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i2) {
            this.f21755a = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i2) {
            if (this.f21755a == 0) {
                throw null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {

        /* renamed from: a, reason: collision with root package name */
        public Locale f21756a;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f21756a);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.viewpager.widget.PagerTitleStrip$SingleLineAllCapsTransform, android.text.method.SingleLineTransformationMethod, android.text.method.TransformationMethod] */
    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        ?? singleLineTransformationMethod = new SingleLineTransformationMethod();
        singleLineTransformationMethod.f21756a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(singleLineTransformationMethod);
    }

    public final void a(int i2, PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter.a();
        }
        this.f21754f = true;
        throw null;
    }

    public void b(float f2, int i2) {
        if (i2 == this.f21752b) {
            throw null;
        }
        a(i2, this.f21751a.getAdapter());
        throw null;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.B = null;
        if (viewPager.C == null) {
            viewPager.C = new ArrayList();
        }
        viewPager.C.add(null);
        this.f21751a = viewPager;
        if (adapter != null) {
            throw null;
        }
        this.f21752b = -1;
        this.f21753c = -1.0f;
        a(viewPager.getCurrentItem(), adapter);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f21751a;
        if (viewPager != null) {
            if (viewPager.getAdapter() != null) {
                throw null;
            }
            ViewPager viewPager2 = this.f21751a;
            if (viewPager2 != null) {
                this.f21752b = -1;
                this.f21753c = -1.0f;
                a(viewPager2.getCurrentItem(), null);
                throw null;
            }
            ViewPager.OnPageChangeListener onPageChangeListener = viewPager2.B;
            viewPager2.B = null;
            ArrayList arrayList = viewPager2.C;
            if (arrayList != null) {
                arrayList.remove((Object) null);
            }
            this.f21751a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f21751a != null) {
            float f2 = this.f21753c;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            b(f2, this.f21752b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i2, (int) (View.MeasureSpec.getSize(i2) * 0.2f), -2);
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f21754f) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i2) {
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange float f2) {
        throw null;
    }

    public void setTextColor(@ColorInt int i2) {
        throw null;
    }

    public void setTextSpacing(int i2) {
        this.d = i2;
        requestLayout();
    }
}
