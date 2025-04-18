package eh;

import com.vungle.ads.internal.util.x;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ b get$default(a aVar, Executor executor, x xVar, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = b.FILENAME;
        }
        return aVar.get(executor, xVar, str);
    }

    public static /* synthetic */ void getFILENAME$annotations() {
    }

    @JvmStatic
    public final synchronized b get(Executor ioExecutor, x pathProvider, String filename) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(filename, "filename");
        concurrentHashMap = b.filePreferenceMap;
        obj = concurrentHashMap.get(filename);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (obj = new b(ioExecutor, pathProvider, filename, null)))) != null) {
            obj = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "filePreferenceMap.getOrP…, filename)\n            }");
        return (b) obj;
    }
}
