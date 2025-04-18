package da;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import ka.i;

/* loaded from: classes3.dex */
public final class a extends ViewOutlineProvider {
    public final Rect a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f16927b;

    public a(ShapeableImageView shapeableImageView) {
        this.f16927b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f16927b;
        if (shapeableImageView.f11753k == null) {
            return;
        }
        if (shapeableImageView.f11752j == null) {
            shapeableImageView.f11752j = new i(shapeableImageView.f11753k);
        }
        RectF rectF = shapeableImageView.f11746c;
        Rect rect = this.a;
        rectF.round(rect);
        shapeableImageView.f11752j.setBounds(rect);
        shapeableImageView.f11752j.getOutline(outline);
    }
}
