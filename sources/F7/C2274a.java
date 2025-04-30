package f7;

import G7.f;
import G7.j;
import com.vungle.ads.internal.util.x;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2274a {
    public /* synthetic */ C2274a(f fVar) {
        this();
    }

    public static /* synthetic */ C2275b get$default(C2274a c2274a, Executor executor, x xVar, String str, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            str = C2275b.FILENAME;
        }
        return c2274a.get(executor, xVar, str);
    }

    public final synchronized C2275b get(Executor executor, x xVar, String str) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object putIfAbsent;
        try {
            j.e(executor, "ioExecutor");
            j.e(xVar, "pathProvider");
            j.e(str, "filename");
            concurrentHashMap = C2275b.filePreferenceMap;
            obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new C2275b(executor, xVar, str, null)))) != null) {
                obj = putIfAbsent;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C2275b) obj;
    }

    private C2274a() {
    }

    public static /* synthetic */ void getFILENAME$annotations() {
    }
}
