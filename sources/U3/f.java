package U3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class f extends R3.f {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f3149v;

    public f(R3.k kVar, RectF rectF) {
        super(kVar);
        this.f3149v = rectF;
    }

    @Override // R3.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f3149v = fVar.f3149v;
    }
}
