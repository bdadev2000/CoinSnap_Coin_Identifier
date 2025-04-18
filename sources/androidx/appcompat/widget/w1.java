package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class w1 extends i.c {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1072c;

    public w1(Drawable drawable) {
        super(drawable);
        this.f1072c = true;
    }

    @Override // i.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1072c) {
            super.draw(canvas);
        }
    }

    @Override // i.c, android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f1072c) {
            super.setHotspot(f10, f11);
        }
    }

    @Override // i.c, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f1072c) {
            super.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // i.c, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f1072c) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // i.c, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f1072c) {
            return super.setVisible(z10, z11);
        }
        return false;
    }
}
