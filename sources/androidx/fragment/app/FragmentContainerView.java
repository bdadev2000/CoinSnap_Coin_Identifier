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
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import n0.AbstractC2469a;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4650c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4651d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        G7.j.e(context, "context");
        this.b = new ArrayList();
        this.f4650c = new ArrayList();
        this.f4652f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2469a.b, 0, 0);
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
        if (this.f4650c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        G7.j.e(view, "child");
        if (FragmentManager.getViewFragment(view) != null) {
            super.addView(view, i9, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        T.G0 onApplyWindowInsets;
        G7.j.e(windowInsets, "insets");
        T.G0 h6 = T.G0.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4651d;
        if (onApplyWindowInsetsListener != null) {
            G7.j.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets2 = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            G7.j.d(onApplyWindowInsets2, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            onApplyWindowInsets = T.G0.h(null, onApplyWindowInsets2);
        } else {
            onApplyWindowInsets = ViewCompat.onApplyWindowInsets(this, h6);
        }
        G7.j.d(onApplyWindowInsets, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!onApplyWindowInsets.f2863a.m()) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i9), onApplyWindowInsets);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        G7.j.e(canvas, "canvas");
        if (this.f4652f) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        G7.j.e(canvas, "canvas");
        G7.j.e(view, "child");
        if (this.f4652f) {
            ArrayList arrayList = this.b;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f4650c.remove(view);
        if (this.b.remove(view)) {
            this.f4652f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        G7.j.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                G7.j.d(childAt, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i9) {
        View childAt = getChildAt(i9);
        G7.j.d(childAt, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        a(childAt);
        super.removeViewAt(i9);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i9, int i10) {
        int i11 = i9 + i10;
        for (int i12 = i9; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            G7.j.d(childAt, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            a(childAt);
        }
        super.removeViews(i9, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i9, int i10) {
        int i11 = i9 + i10;
        for (int i12 = i9; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            G7.j.d(childAt, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            a(childAt);
        }
        super.removeViewsInLayout(i9, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z8) {
        this.f4652f = z8;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        G7.j.e(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f4651d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (view.getParent() == this) {
            this.f4650c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        G7.j.e(context, "context");
        G7.j.e(attributeSet, "attrs");
        G7.j.e(fragmentManager, "fm");
        this.b = new ArrayList();
        this.f4650c = new ArrayList();
        this.f4652f = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2469a.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment findFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC2914a.e("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            P fragmentFactory = fragmentManager.getFragmentFactory();
            context.getClassLoader();
            Fragment a6 = fragmentFactory.a(classAttribute);
            G7.j.d(a6, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a6.mFragmentId = id;
            a6.mContainerId = id;
            a6.mTag = string;
            a6.mFragmentManager = fragmentManager;
            a6.mHost = fragmentManager.getHost();
            a6.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(this, a6, string).commitNowAllowingStateLoss();
        }
        fragmentManager.onContainerAvailable(this);
    }
}
