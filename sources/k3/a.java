package K3;

import R3.g;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1646a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public a(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.f14082k == null) {
            return;
        }
        if (shapeableImageView.f14081j == null) {
            shapeableImageView.f14081j = new g(shapeableImageView.f14082k);
        }
        RectF rectF = shapeableImageView.f14075c;
        Rect rect = this.f1646a;
        rectF.round(rect);
        shapeableImageView.f14081j.setBounds(rect);
        shapeableImageView.f14081j.getOutline(outline);
    }
}
