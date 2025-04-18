package m2;

import android.content.Context;
import androidx.work.p;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class i {
    public static final String a = p.g("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f21454b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = a;
            p.e().b(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (String str2 : f21454b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        p.e().h(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    p.e().b(str, format, new Throwable[0]);
                }
            }
        }
    }
}
