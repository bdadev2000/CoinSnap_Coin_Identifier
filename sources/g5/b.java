package g5;

import java.util.concurrent.ConcurrentHashMap;
import p5.c;

/* loaded from: classes.dex */
public abstract class b {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static synchronized void a(c cVar) {
        synchronized (b.class) {
            a aVar = (a) a.remove(cVar.pDU());
            if (aVar != null) {
                aVar.f18197c = true;
            }
            cVar.tN();
            cVar.pDU();
        }
    }
}
