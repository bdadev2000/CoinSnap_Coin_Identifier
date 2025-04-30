package D3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.l0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends S {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f741a;
    public final List b;

    public d() {
        Paint paint = new Paint();
        this.f741a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.S
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, l0 l0Var) {
        super.onDrawOver(canvas, recyclerView, l0Var);
        Paint paint = this.f741a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (g gVar : this.b) {
            gVar.getClass();
            ThreadLocal threadLocal = L.c.f1667a;
            float f9 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f9)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f9)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f9)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f9))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).i()) {
                float e4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.e();
                float a6 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.a();
                gVar.getClass();
                gVar.getClass();
                canvas.drawLine(0.0f, e4, 0.0f, a6, paint);
            } else {
                float b = ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.b();
                float c9 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.c();
                gVar.getClass();
                gVar.getClass();
                canvas.drawLine(b, 0.0f, c9, 0.0f, paint);
            }
        }
    }
}
