package I;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class f {
    @NonNull
    public static Context a(@NonNull Context context, @Nullable String str) {
        return context.createAttributionContext(str);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static Display c(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}
