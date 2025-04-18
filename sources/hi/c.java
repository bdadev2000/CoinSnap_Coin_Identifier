package hi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.l0;

/* loaded from: classes5.dex */
public abstract class c {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f19119b;

    static {
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = l0.class.getPackage();
        if (r22 == null) {
            name = null;
        } else {
            name = r22.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = l0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = ei.g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = ai.f.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f19119b = MapsKt.toMap(linkedHashMap);
    }
}
