package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.cooldev.gba.emulator.gameboy.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final VisibilityAnimListener f813a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f814b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f815c;
    public ActionMenuPresenter d;

    /* renamed from: f, reason: collision with root package name */
    public int f816f;

    /* renamed from: g, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f817g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f818h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f819i;

    /* renamed from: androidx.appcompat.widget.AbsActionBarView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f820a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f821b;

        public VisibilityAnimListener() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void a() {
            AbsActionBarView.super.setVisibility(0);
            this.f820a = false;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationCancel() {
            this.f820a = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            if (this.f820a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f817g = null;
            AbsActionBarView.super.setVisibility(this.f821b);
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f813a = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f814b = context;
        } else {
            this.f814b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int d(int i2, int i3, int i4, View view, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, androidx.appcompat.view.ActionBarPolicy] */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, androidx.appcompat.R.styleable.f311a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            Context context = actionMenuPresenter.f676b;
            ?? obj = new Object();
            obj.f593a = context;
            actionMenuPresenter.f878r = obj.a();
            MenuBuilder menuBuilder = actionMenuPresenter.f677c;
            if (menuBuilder != null) {
                menuBuilder.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f819i = false;
        }
        if (!this.f819i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f819i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f819i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f818h = false;
        }
        if (!this.f818h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f818h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f818h = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f816f = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f817g;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            super.setVisibility(i2);
        }
    }
}
