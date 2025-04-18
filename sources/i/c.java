package i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class c extends Drawable implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f19135b;

    public c(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f19135b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f19135b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f19135b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f19135b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f19135b.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19135b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19135b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f19135b.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f19135b.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f19135b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f19135b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f19135b.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f19135b.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f19135b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f19135b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f19135b.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f19135b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f19135b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f19135b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        this.f19135b.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.f19135b.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19135b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f19135b.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f19135b.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        h0.a.e(this.f19135b, f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        h0.a.f(this.f19135b, i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f19135b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        h0.a.g(this.f19135b, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        h0.a.h(this.f19135b, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        h0.a.i(this.f19135b, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f19135b.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
