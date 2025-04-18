package dc;

import android.text.TextUtils;
import com.facebook.internal.m;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f16987b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16988c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f16989d;
    public final m a;

    public k(m mVar) {
        this.a = mVar;
    }

    public final boolean a(ec.a aVar) {
        if (TextUtils.isEmpty(aVar.f17293c)) {
            return true;
        }
        long j3 = aVar.f17296f + aVar.f17295e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f16987b) {
            return true;
        }
        return false;
    }
}
