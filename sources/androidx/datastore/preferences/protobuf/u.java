package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static volatile u f1468b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f1469c = new u();
    public final Map a = Collections.emptyMap();

    public static u a() {
        u uVar = f1468b;
        if (uVar == null) {
            synchronized (u.class) {
                uVar = f1468b;
                if (uVar == null) {
                    Class cls = t.a;
                    u uVar2 = null;
                    if (cls != null) {
                        try {
                            uVar2 = (u) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (uVar2 == null) {
                        uVar2 = f1469c;
                    }
                    f1468b = uVar2;
                    uVar = uVar2;
                }
            }
        }
        return uVar;
    }
}
