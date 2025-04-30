package I;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i9) {
        return context.getDrawable(i9);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
