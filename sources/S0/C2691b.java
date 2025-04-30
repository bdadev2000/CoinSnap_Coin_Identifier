package s0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2691b {

    /* renamed from: a, reason: collision with root package name */
    public final C2692c f22962a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f22963c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f22964d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }
}
