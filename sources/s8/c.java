package s8;

import i8.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f22988a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = z.class.getPackage();
        if (r22 == null) {
            name = null;
        } else {
            name = r22.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(z.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(p8.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(l8.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = AbstractC2829t.c0(linkedHashMap);
    }
}
