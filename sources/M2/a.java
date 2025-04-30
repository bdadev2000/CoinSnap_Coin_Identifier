package M2;

import G7.j;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.appevents.i;
import com.facebook.appevents.n;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1982a = Process.myUid();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public static String f1983c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final C2.b f1984d = new C2.b(9);

    public static final void a(ActivityManager activityManager) {
        if (O2.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f1982a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        j.d(thread, "getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        j.d(stackTrace, "stackTrace");
                        int length = stackTrace.length;
                        int i9 = 0;
                        while (i9 < length) {
                            StackTraceElement stackTraceElement = stackTrace[i9];
                            i9++;
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!j.a(jSONArray2, f1983c) && n.k(thread)) {
                            f1983c = jSONArray2;
                            i.b(processErrorStateInfo.shortMsg, jSONArray2).b();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            O2.a.a(a.class, th);
        }
    }
}
