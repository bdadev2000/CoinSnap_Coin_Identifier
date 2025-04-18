package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f18565h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f18566a;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f18567b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18568c;
    public WrappedDrawableState d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18569f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f18570g;

    public WrappedDrawableApi14(WrappedDrawableState wrappedDrawableState, Resources resources) {
        Drawable.ConstantState constantState;
        this.d = wrappedDrawableState;
        if (wrappedDrawableState == null || (constantState = wrappedDrawableState.f18573b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable a() {
        return this.f18570g;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f18570g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18570g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.d;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.f18573b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, androidx.core.graphics.drawable.WrappedDrawableState] */
    public final WrappedDrawableState c() {
        WrappedDrawableState wrappedDrawableState = this.d;
        ?? constantState = new Drawable.ConstantState();
        constantState.f18574c = null;
        constantState.d = f18565h;
        if (wrappedDrawableState != null) {
            constantState.f18572a = wrappedDrawableState.f18572a;
            constantState.f18573b = wrappedDrawableState.f18573b;
            constantState.f18574c = wrappedDrawableState.f18574c;
            constantState.d = wrappedDrawableState.d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        if (!(!(this instanceof WrappedDrawableApi21))) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.d;
        ColorStateList colorStateList = wrappedDrawableState.f18574c;
        PorterDuff.Mode mode = wrappedDrawableState.d;
        if (colorStateList == null || mode == null) {
            this.f18568c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f18568c || colorForState != this.f18566a || mode != this.f18567b) {
                setColorFilter(colorForState, mode);
                this.f18566a = colorForState;
                this.f18567b = mode;
                this.f18568c = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f18570g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.d;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.f18570g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.d;
        if (wrappedDrawableState == null || wrappedDrawableState.f18573b == null) {
            return null;
        }
        wrappedDrawableState.f18572a = getChangingConfigurations();
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f18570g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f18570g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f18570g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return DrawableCompat.Api23Impl.a(this.f18570g);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f18570g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f18570g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f18570g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f18570g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f18570g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f18570g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f18570g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = (!((this instanceof WrappedDrawableApi21) ^ true) || (wrappedDrawableState = this.d) == null) ? null : wrappedDrawableState.f18574c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f18570g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f18570g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f18569f && super.mutate() == this) {
            this.d = c();
            Drawable drawable = this.f18570g;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState = this.d;
            if (wrappedDrawableState != null) {
                Drawable drawable2 = this.f18570g;
                wrappedDrawableState.f18573b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f18569f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18570g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        return DrawableCompat.Api23Impl.b(this.f18570g, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.f18570g.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f18570g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f18570g.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.f18570g.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18570g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f18570g.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f18570g.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f18570g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.d.f18574c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.d.d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f18570g.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
