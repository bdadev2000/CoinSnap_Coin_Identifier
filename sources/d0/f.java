package d0;

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
        Context createAttributionContext;
        createAttributionContext = context.createAttributionContext(str);
        return createAttributionContext;
    }

    public static String b(Context context) {
        String attributionTag;
        attributionTag = context.getAttributionTag();
        return attributionTag;
    }

    public static Display c(Context context) {
        Display display;
        try {
            display = context.getDisplay();
            return display;
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}
