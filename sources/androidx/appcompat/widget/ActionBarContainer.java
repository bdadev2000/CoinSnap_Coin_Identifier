package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f663b;

    /* renamed from: c, reason: collision with root package name */
    public View f664c;

    /* renamed from: d, reason: collision with root package name */
    public View f665d;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f666f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f667g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f668h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f669i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f670j;

    /* renamed from: k, reason: collision with root package name */
    public final int f671k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.setBackground(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.a);
        boolean z10 = false;
        this.f666f = obtainStyledAttributes.getDrawable(0);
        this.f667g = obtainStyledAttributes.getDrawable(2);
        this.f671k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f669i = true;
            this.f668h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f669i ? !(this.f666f != null || this.f667g != null) : this.f668h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f666f;
        if (drawable != null && drawable.isStateful()) {
            this.f666f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f667g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f667g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f668h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f668h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f666f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f667g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f668h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f664c = findViewById(R.id.action_bar);
        this.f665d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f663b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (this.f669i) {
            Drawable drawable = this.f668h;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f666f != null) {
                if (this.f664c.getVisibility() == 0) {
                    this.f666f.setBounds(this.f664c.getLeft(), this.f664c.getTop(), this.f664c.getRight(), this.f664c.getBottom());
                } else {
                    View view = this.f665d;
                    if (view != null && view.getVisibility() == 0) {
                        this.f666f.setBounds(this.f665d.getLeft(), this.f665d.getTop(), this.f665d.getRight(), this.f665d.getBottom());
                    } else {
                        this.f666f.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z11 = false;
            }
            this.f670j = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f664c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f671k) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f664c == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f666f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f666f);
        }
        this.f666f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f664c;
            if (view != null) {
                this.f666f.setBounds(view.getLeft(), this.f664c.getTop(), this.f664c.getRight(), this.f664c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f669i ? this.f666f != null || this.f667g != null : this.f668h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f668h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f668h);
        }
        this.f668h = drawable;
        boolean z10 = this.f669i;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f668h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f666f != null || this.f667g != null) : this.f668h == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f667g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f667g);
        }
        this.f667g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f670j && this.f667g != null) {
                throw null;
            }
        }
        if (!this.f669i ? !(this.f666f != null || this.f667g != null) : this.f668h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(v2 v2Var) {
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f663b = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f666f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f667g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f668h;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f666f;
        boolean z10 = this.f669i;
        if ((drawable == drawable2 && !z10) || ((drawable == this.f667g && this.f670j) || ((drawable == this.f668h && z10) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
