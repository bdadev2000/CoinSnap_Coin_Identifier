package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class S {
    @Deprecated
    public void getItemOffsets(@NonNull Rect rect, int i9, @NonNull RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @Deprecated
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, l0 l0Var) {
        getItemOffsets(rect, ((X) view.getLayoutParams()).f4947a.getLayoutPosition(), recyclerView);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, l0 l0Var) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull l0 l0Var) {
        onDrawOver(canvas, recyclerView);
    }
}
