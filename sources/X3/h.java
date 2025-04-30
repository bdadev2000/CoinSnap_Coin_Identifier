package X3;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3675a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f3675a = new HashMap();
        AbstractC2914a.c(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (h.class) {
            hashMap = f3675a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
        }
        if (hashMap.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
        }
        return bundle;
    }
}
