package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.ImageMetadata;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j.AbstractC2379a;
import q.C2587a;
import q.M0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public View f4142c;

    /* renamed from: d, reason: collision with root package name */
    public View f4143d;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4144f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f4145g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f4146h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4147i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4148j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4149k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2587a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20942a);
        boolean z8 = false;
        this.f4144f = obtainStyledAttributes.getDrawable(0);
        this.f4145g = obtainStyledAttributes.getDrawable(2);
        this.f4149k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4147i = true;
            this.f4146h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4147i ? !(this.f4144f != null || this.f4145g != null) : this.f4146h == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4144f;
        if (drawable != null && drawable.isStateful()) {
            this.f4144f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4145g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4145g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4146h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f4146h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4144f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4145g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4146h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4142c = findViewById(R.id.action_bar);
        this.f4143d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.b && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        boolean z9 = true;
        if (this.f4147i) {
            Drawable drawable = this.f4146h;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z9 = false;
            }
        } else {
            if (this.f4144f != null) {
                if (this.f4142c.getVisibility() == 0) {
                    this.f4144f.setBounds(this.f4142c.getLeft(), this.f4142c.getTop(), this.f4142c.getRight(), this.f4142c.getBottom());
                } else {
                    View view = this.f4143d;
                    if (view != null && view.getVisibility() == 0) {
                        this.f4144f.setBounds(this.f4143d.getLeft(), this.f4143d.getTop(), this.f4143d.getRight(), this.f4143d.getBottom());
                    } else {
                        this.f4144f.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z9 = false;
            }
            this.f4148j = false;
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (this.f4142c == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f4149k) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i9, i10);
        if (this.f4142c == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4144f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4144f);
        }
        this.f4144f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4142c;
            if (view != null) {
                this.f4144f.setBounds(view.getLeft(), this.f4142c.getTop(), this.f4142c.getRight(), this.f4142c.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f4147i ? !(this.f4144f != null || this.f4145g != null) : this.f4146h == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4146h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4146h);
        }
        this.f4146h = drawable;
        boolean z8 = this.f4147i;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z8 && (drawable2 = this.f4146h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z8 ? !(this.f4144f != null || this.f4145g != null) : this.f4146h == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4145g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4145g);
        }
        this.f4145g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4148j && this.f4145g != null) {
                throw null;
            }
        }
        boolean z8 = false;
        if (!this.f4147i ? !(this.f4144f != null || this.f4145g != null) : this.f4146h == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z8) {
        int i9;
        this.b = z8;
        if (z8) {
            i9 = ImageMetadata.HOT_PIXEL_MODE;
        } else {
            i9 = 262144;
        }
        setDescendantFocusability(i9);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        boolean z8;
        super.setVisibility(i9);
        if (i9 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Drawable drawable = this.f4144f;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f4145g;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f4146h;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4144f;
        boolean z8 = this.f4147i;
        if ((drawable == drawable2 && !z8) || ((drawable == this.f4145g && this.f4148j) || ((drawable == this.f4146h && z8) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i9) {
        if (i9 != 0) {
            return super.startActionModeForChild(view, callback, i9);
        }
        return null;
    }

    public void setTabContainer(M0 m02) {
    }
}
