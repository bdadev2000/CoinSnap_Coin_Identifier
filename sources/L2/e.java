package L2;

import G7.j;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1723a;

    public /* synthetic */ e(int i9) {
        this.f1723a = i9;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f1723a) {
            case 0:
                j.d(str, "name");
                Pattern compile = Pattern.compile(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3)));
                j.d(compile, "compile(...)");
                return compile.matcher(str).matches();
            case 1:
                j.d(str, "name");
                Pattern compile2 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1)));
                j.d(compile2, "compile(...)");
                return compile2.matcher(str).matches();
            case 2:
                j.d(str, "name");
                Pattern compile3 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1)));
                j.d(compile3, "compile(...)");
                return compile3.matcher(str).matches();
            case 3:
                j.d(str, "name");
                Pattern compile4 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1)));
                j.d(compile4, "compile(...)");
                return compile4.matcher(str).matches();
            case 4:
                return Pattern.matches("cpu[0-9]+", str);
            case 5:
                return str.startsWith("aqs.");
            case 6:
                return str.startsWith(".ae");
            case 7:
                return str.startsWith(NotificationCompat.CATEGORY_EVENT);
            default:
                if (str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_")) {
                    return true;
                }
                return false;
        }
    }
}
