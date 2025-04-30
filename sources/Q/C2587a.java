package q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f22624a;

    public C2587a(ActionBarContainer actionBarContainer) {
        this.f22624a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f22624a;
        if (actionBarContainer.f4147i) {
            Drawable drawable = actionBarContainer.f4146h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4144f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4145g;
        if (drawable3 != null && actionBarContainer.f4148j) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f22624a;
        if (actionBarContainer.f4147i) {
            if (actionBarContainer.f4146h != null) {
                actionBarContainer.f4144f.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4144f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
