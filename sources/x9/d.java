package x9;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.r0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d extends r0 {
    public final Paint a;

    /* renamed from: b, reason: collision with root package name */
    public List f27582b;

    public d() {
        Paint paint = new Paint();
        this.a = paint;
        this.f27582b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, k1 k1Var) {
        super.onDrawOver(canvas, recyclerView, k1Var);
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (h hVar : this.f27582b) {
            float f10 = hVar.f27595c;
            ThreadLocal threadLocal = g0.d.a;
            float f11 = 1.0f - f10;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f10) + (Color.alpha(-65281) * f11)), (int) ((Color.red(-16776961) * f10) + (Color.red(-65281) * f11)), (int) ((Color.green(-16776961) * f10) + (Color.green(-65281) * f11)), (int) ((Color.blue(-16776961) * f10) + (Color.blue(-65281) * f11))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).q()) {
                canvas.drawLine(hVar.f27594b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11635j.k(), hVar.f27594b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11635j.g(), paint);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f11635j.h(), hVar.f27594b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11635j.i(), hVar.f27594b, paint);
            }
        }
    }
}
