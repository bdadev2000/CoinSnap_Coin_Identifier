package te;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final fe.c f25391e = new fe.c(i.class.getSimpleName());

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f25392f = new ConcurrentHashMap(4);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final h f25393b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f25394c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.b f25395d;

    public i(String str) {
        this.a = str;
        h hVar = new h(str);
        this.f25393b = hVar;
        hVar.setDaemon(true);
        hVar.start();
        Handler handler = new Handler(hVar.getLooper());
        this.f25394c = handler;
        this.f25395d = new x2.b(this, 2);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new he.c(8, this, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public static i a(String str) {
        ConcurrentHashMap concurrentHashMap = f25392f;
        boolean containsKey = concurrentHashMap.containsKey(str);
        fe.c cVar = f25391e;
        if (containsKey) {
            i iVar = (i) ((WeakReference) concurrentHashMap.get(str)).get();
            if (iVar != null) {
                h hVar = iVar.f25393b;
                if (hVar.isAlive() && !hVar.isInterrupted()) {
                    cVar.a(2, "get:", "Reusing cached worker handler.", str);
                    return iVar;
                }
                if (hVar.isAlive()) {
                    hVar.interrupt();
                    hVar.quit();
                }
                concurrentHashMap.remove(iVar.a);
                cVar.a(2, "get:", "Thread reference found, but not alive or interrupted.", "Removing.", str);
                concurrentHashMap.remove(str);
            } else {
                cVar.a(2, "get:", "Thread reference died. Removing.", str);
                concurrentHashMap.remove(str);
            }
        }
        cVar.a(1, "get:", "Creating new handler.", str);
        i iVar2 = new i(str);
        concurrentHashMap.put(str, new WeakReference(iVar2));
        return iVar2;
    }
}
