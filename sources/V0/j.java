package V0;

import android.content.Context;
import androidx.work.o;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3414a = o.g("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = f3414a;
            o.e().b(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (String str2 : b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        o.e().h(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    o.e().b(str, format, new Throwable[0]);
                }
            }
        }
    }
}
