package androidx.test.internal.util;

import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public abstract class Checks {
    public static final /* synthetic */ int a = 0;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(ThreadChecker.class).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (arrayList.isEmpty()) {
            new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else {
            if (arrayList.size() == 1) {
                return;
            }
            throw new IllegalStateException(String.format("Found more than one %s implementations.", ThreadChecker.class.getName()));
        }
    }
}
