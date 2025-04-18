package androidx.profileinstaller;

import androidx.annotation.RequiresApi;
import java.io.File;

/* loaded from: classes2.dex */
class BenchmarkOperation {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21ContextHelper {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24ContextHelper {
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = a(file2) && z2;
        }
        return z2;
    }
}
