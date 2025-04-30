package Y4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends com.facebook.appevents.n {

    /* renamed from: j, reason: collision with root package name */
    public static g f3796j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map f3797k;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(461L, "FIREPERF_AUTOPUSH");
        hashMap.put(462L, "FIREPERF");
        hashMap.put(675L, "FIREPERF_INTERNAL_LOW");
        hashMap.put(676L, "FIREPERF_INTERNAL_HIGH");
        f3797k = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.facebook.appevents.n
    public final String f() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
