package k6;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.applovin.impl.sdk.g0;
import com.facebook.appevents.g;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public abstract class a {
    public static final int a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f20276b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public static String f20277c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f20278d = new g0(16);

    public static final void a(ActivityManager activityManager) {
        if (m6.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                        Intrinsics.checkNotNullParameter(thread, "thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
                        int length = stackTrace.length;
                        int i10 = 0;
                        while (i10 < length) {
                            StackTraceElement stackTraceElement = stackTrace[i10];
                            i10++;
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!Intrinsics.areEqual(jSONArray2, f20277c) && g.y(thread)) {
                            f20277c = jSONArray2;
                            new j6.c(processErrorStateInfo.shortMsg, jSONArray2).c();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            m6.a.a(a.class, th2);
        }
    }
}
