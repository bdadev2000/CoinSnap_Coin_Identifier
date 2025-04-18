package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class k0 {
    public static void a(@NonNull ViewTreeObserver viewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
