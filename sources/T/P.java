package T;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class P {
    public static void a(@NonNull View view) {
        view.cancelDragAndDrop();
    }

    public static void b(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    public static void c(View view) {
        view.dispatchStartTemporaryDetach();
    }

    public static void d(@NonNull View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static boolean e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i9) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i9);
    }

    public static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }
}
