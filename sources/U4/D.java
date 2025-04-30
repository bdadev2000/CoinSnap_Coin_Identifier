package U4;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f3251c;

    /* renamed from: a, reason: collision with root package name */
    public F1.i f3252a;
    public final Executor b;

    public D(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
    }

    public final synchronized C a() {
        String str;
        C c9;
        F1.i iVar = this.f3252a;
        synchronized (((ArrayDeque) iVar.f1087g)) {
            str = (String) ((ArrayDeque) iVar.f1087g).peek();
        }
        Pattern pattern = C.f3248d;
        c9 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                c9 = new C(split[0], split[1]);
            }
        }
        return c9;
    }
}
