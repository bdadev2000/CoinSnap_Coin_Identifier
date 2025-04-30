package O4;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class k {
    public static final long b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2194c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f2195d;

    /* renamed from: a, reason: collision with root package name */
    public final R3.e f2196a;

    public k(R3.e eVar) {
        this.f2196a = eVar;
    }

    public final boolean a(P4.b bVar) {
        if (TextUtils.isEmpty(bVar.f2422c)) {
            return true;
        }
        long j7 = bVar.f2425f + bVar.f2424e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2196a.getClass();
        if (j7 < timeUnit.toSeconds(System.currentTimeMillis()) + b) {
            return true;
        }
        return false;
    }
}
