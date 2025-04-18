package n0;

import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class a1 {
    public static int a(View view) {
        int importantForContentCapture;
        importantForContentCapture = view.getImportantForContentCapture();
        return importantForContentCapture;
    }

    public static CharSequence b(View view) {
        CharSequence stateDescription;
        stateDescription = view.getStateDescription();
        return stateDescription;
    }

    @Nullable
    public static w2 c(@NonNull View view) {
        WindowInsetsController windowInsetsController;
        windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new w2(windowInsetsController);
        }
        return null;
    }

    public static boolean d(View view) {
        boolean isImportantForContentCapture;
        isImportantForContentCapture = view.isImportantForContentCapture();
        return isImportantForContentCapture;
    }

    public static void e(View view, int i10) {
        view.setImportantForContentCapture(i10);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
