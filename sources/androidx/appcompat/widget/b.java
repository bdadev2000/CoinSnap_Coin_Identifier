package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Drawable {
    public final ActionBarContainer a;

    public b(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.f669i) {
            Drawable drawable = actionBarContainer.f668h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f666f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f667g;
        if (drawable3 != null && actionBarContainer.f670j) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.f669i) {
            if (actionBarContainer.f668h != null) {
                actionBarContainer.f666f.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f666f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
