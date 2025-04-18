package ic;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f19586c;
    public a4.f a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f19587b;

    public x(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f19587b = scheduledExecutorService;
    }

    public final synchronized w a() {
        String str;
        w wVar;
        a4.f fVar = this.a;
        synchronized (((ArrayDeque) fVar.f113e)) {
            str = (String) ((ArrayDeque) fVar.f113e).peek();
        }
        Pattern pattern = w.f19583d;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                wVar = new w(split[0], split[1]);
            }
        }
        wVar = null;
        return wVar;
    }
}
