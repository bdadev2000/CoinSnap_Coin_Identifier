package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class r0 {
    @Deprecated
    public void getItemOffsets(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @Deprecated
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, k1 k1Var) {
        getItemOffsets(rect, ((w0) view.getLayoutParams()).a(), recyclerView);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, k1 k1Var) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull k1 k1Var) {
        onDrawOver(canvas, recyclerView);
    }
}
