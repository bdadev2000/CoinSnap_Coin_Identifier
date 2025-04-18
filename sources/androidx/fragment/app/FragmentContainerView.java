package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.r2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n55#2,6:349\n55#2,6:355\n1855#3,2:361\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:349,6\n135#1:355,6\n221#1:361,2\n*E\n"})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1554b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1555c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1556d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1554b = new ArrayList();
        this.f1555c = new ArrayList();
        this.f1557f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = g1.a.f17933b;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1555c.contains(view)) {
            this.f1554b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (FragmentManager.getViewFragment(child) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        r2 onApplyWindowInsets;
        Intrinsics.checkNotNullParameter(insets, "insets");
        r2 h10 = r2.h(null, insets);
        Intrinsics.checkNotNullExpressionValue(h10, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1556d;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(this, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets onApplyWindowInsets2 = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets2, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            onApplyWindowInsets = r2.h(null, onApplyWindowInsets2);
        } else {
            onApplyWindowInsets = ViewCompat.onApplyWindowInsets(this, h10);
        }
        Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!onApplyWindowInsets.a.m()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i10), onApplyWindowInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f1557f) {
            Iterator it = this.f1554b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f1557f) {
            ArrayList arrayList = this.f1554b;
            if ((!arrayList.isEmpty()) && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j3);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f1555c.remove(view);
        if (this.f1554b.remove(view)) {
            this.f1557f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f1557f = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f1556d = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f1555c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, FragmentManager fm) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f1554b = new ArrayList();
        this.f1555c = new ArrayList();
        this.f1557f = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = g1.a.f17933b;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment findFragmentById = fm.findFragmentById(id2);
        if (classAttribute != null && findFragmentById == null) {
            if (id2 == -1) {
                throw new IllegalStateException(com.applovin.impl.mediation.ads.e.f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            h0 fragmentFactory = fm.getFragmentFactory();
            context.getClassLoader();
            Fragment a = fragmentFactory.a(classAttribute);
            Intrinsics.checkNotNullExpressionValue(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attrs, (Bundle) null);
            fm.beginTransaction().setReorderingAllowed(true).add(this, a, string).commitNowAllowingStateLoss();
        }
        fm.onContainerAvailable(this);
    }
}
