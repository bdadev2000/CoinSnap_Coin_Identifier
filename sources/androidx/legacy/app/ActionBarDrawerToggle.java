package androidx.legacy.app;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

@Deprecated
/* loaded from: classes3.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    @Deprecated
    /* loaded from: classes3.dex */
    public interface Delegate {
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface DelegateProvider {
    }

    /* loaded from: classes3.dex */
    public static class SetIndicatorInfo {
    }

    /* loaded from: classes3.dex */
    public class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            copyBounds(null);
            canvas.save();
            throw null;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerSlide(View view, float f2) {
        throw null;
    }
}
