package mc;

import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f22190e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f22191f;
    public final HashSet a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22192b;

    /* renamed from: c, reason: collision with root package name */
    public final d f22193c;

    /* renamed from: d, reason: collision with root package name */
    public final d f22194d;

    static {
        Charset.forName("UTF-8");
        f22190e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f22191f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public j(ScheduledExecutorService scheduledExecutorService, d dVar, d dVar2) {
        this.f22192b = scheduledExecutorService;
        this.f22193c = dVar;
        this.f22194d = dVar2;
    }

    public final void a(f fVar, String str) {
        if (fVar == null) {
            return;
        }
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.f22192b.execute(new androidx.emoji2.text.n(17, (BiConsumer) it.next(), str, fVar));
            }
        }
    }
}
