package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import com.google.android.gms.common.api.Api;
import org.objectweb.asm.Opcodes;

@RestrictTo
/* loaded from: classes3.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f824a;

    /* renamed from: b, reason: collision with root package name */
    public ScrollingTabContainerView f825b;

    /* renamed from: c, reason: collision with root package name */
    public View f826c;
    public View d;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f827f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f828g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f829h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f830i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f831j;

    /* renamed from: k, reason: collision with root package name */
    public final int f832k;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api21Impl {
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new ActionBarBackgroundDrawable(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f311a);
        boolean z2 = false;
        this.f827f = obtainStyledAttributes.getDrawable(0);
        this.f828g = obtainStyledAttributes.getDrawable(2);
        this.f832k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.cooldev.gba.emulator.gameboy.R.id.split_action_bar) {
            this.f830i = true;
            this.f829h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f830i ? !(this.f827f != null || this.f828g != null) : this.f829h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f827f;
        if (drawable != null && drawable.isStateful()) {
            this.f827f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f828g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f828g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f829h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f829h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f825b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f827f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f828g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f829h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f826c = findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_bar);
        this.d = findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f824a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        ScrollingTabContainerView scrollingTabContainerView = this.f825b;
        boolean z3 = true;
        boolean z4 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f830i) {
            Drawable drawable2 = this.f829h;
            if (drawable2 == null) {
                return;
            } else {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f827f == null) {
                z3 = false;
            } else if (this.f826c.getVisibility() == 0) {
                this.f827f.setBounds(this.f826c.getLeft(), this.f826c.getTop(), this.f826c.getRight(), this.f826c.getBottom());
            } else {
                View view = this.d;
                if (view == null || view.getVisibility() != 0) {
                    this.f827f.setBounds(0, 0, 0, 0);
                } else {
                    this.f827f.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
                }
            }
            this.f831j = z4;
            if (z4 && (drawable = this.f828g) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            } else if (!z3) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int a2;
        int i4;
        if (this.f826c == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f832k) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f826c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        ScrollingTabContainerView scrollingTabContainerView = this.f825b;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f826c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.d;
            a2 = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.d);
        } else {
            a2 = a(this.f826c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f825b) + a2, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f827f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f827f);
        }
        this.f827f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f826c;
            if (view != null) {
                this.f827f.setBounds(view.getLeft(), this.f826c.getTop(), this.f826c.getRight(), this.f826c.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f830i ? !(this.f827f != null || this.f828g != null) : this.f829h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f829h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f829h);
        }
        this.f829h = drawable;
        boolean z2 = this.f830i;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f829h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f827f != null || this.f828g != null) : this.f829h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f828g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f828g);
        }
        this.f828g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f831j && (drawable2 = this.f828g) != null) {
                drawable2.setBounds(this.f825b.getLeft(), this.f825b.getTop(), this.f825b.getRight(), this.f825b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f830i ? !(this.f827f != null || this.f828g != null) : this.f829h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f825b;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f825b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f824a = z2;
        setDescendantFocusability(z2 ? Opcodes.ASM6 : Opcodes.ASM4);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f827f;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f828g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f829h;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f827f;
        boolean z2 = this.f830i;
        return (drawable == drawable2 && !z2) || (drawable == this.f828g && this.f831j) || ((drawable == this.f829h && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
