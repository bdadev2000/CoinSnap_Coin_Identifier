package N0;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class g extends Drawable {
    public Drawable b;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        return super.onLevelChange(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i9);
        } else {
            super.setChangingConfigurations(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i9, PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(i9, mode);
        } else {
            super.setColorFilter(i9, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z8) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setFilterBitmap(z8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f9, float f10) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.e(drawable, f9, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i9, int i10, int i11, int i12) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.f(drawable, i9, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
