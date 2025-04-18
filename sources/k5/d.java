package k5;

import android.content.Context;
import com.bytedance.sdk.component.Sg.YFl.eT;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class d {
    public static Context a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f20272b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f20273c = false;

    /* renamed from: d, reason: collision with root package name */
    public static eT f20274d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f20275e = 1;

    public static eT a() {
        if (f20274d == null) {
            eT.YFl yFl = new eT.YFl("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f20274d = yFl.YFl(10000L, timeUnit).Sg(10000L, timeUnit).tN(10000L, timeUnit).YFl();
        }
        return f20274d;
    }
}
