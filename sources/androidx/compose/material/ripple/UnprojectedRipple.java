package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7479a;

    /* renamed from: b, reason: collision with root package name */
    public Color f7480b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f7481c;
    public boolean d;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class MRadiusHelper {

        /* renamed from: a, reason: collision with root package name */
        public static final MRadiusHelper f7482a = new Object();

        @DoNotInline
        public final void a(@NotNull RippleDrawable rippleDrawable, int i2) {
            rippleDrawable.setRadius(i2);
        }
    }

    public UnprojectedRipple(boolean z2) {
        super(ColorStateList.valueOf(-16777216), null, z2 ? new ColorDrawable(-1) : null);
        this.f7479a = z2;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f7479a) {
            this.d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.d;
    }
}
