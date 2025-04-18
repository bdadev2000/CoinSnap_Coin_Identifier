package re;

import android.graphics.ImageFormat;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f24115f = new fe.c(d.class.getSimpleName());
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f24116b = -1;

    /* renamed from: c, reason: collision with root package name */
    public ze.b f24117c = null;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f24118d;

    /* renamed from: e, reason: collision with root package name */
    public ne.a f24119e;

    public d(Class cls, int i10) {
        this.a = i10;
        this.f24118d = new LinkedBlockingQueue(i10);
    }

    public final c a(long j3, Object obj) {
        boolean z10;
        if (this.f24117c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c cVar = (c) this.f24118d.poll();
            fe.c cVar2 = f24115f;
            if (cVar != null) {
                cVar2.a(0, "getFrame for time:", Long.valueOf(j3), "RECYCLING.");
                this.f24119e.c(2, 4, 2);
                this.f24119e.c(2, 3, 2);
                cVar.f24112b = obj;
                cVar.f24113c = j3;
                cVar.f24114d = j3;
                return cVar;
            }
            cVar2.a(1, "getFrame for time:", Long.valueOf(j3), "NOT AVAILABLE.");
            b(obj, false);
            return null;
        }
        throw new IllegalStateException("Can't call getFrame() after releasing or before setUp.");
    }

    public abstract void b(Object obj, boolean z10);

    public void c() {
        boolean z10;
        if (this.f24117c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        fe.c cVar = f24115f;
        if (!z10) {
            cVar.a(2, "release called twice. Ignoring.");
            return;
        }
        cVar.a(1, "release: Clearing the frame and buffer queue.");
        this.f24118d.clear();
        this.f24116b = -1;
        this.f24117c = null;
        this.f24119e = null;
    }

    public void d(int i10, ze.b bVar, ne.a aVar) {
        this.f24117c = bVar;
        this.f24116b = (int) Math.ceil(((bVar.f28750c * bVar.f28749b) * ImageFormat.getBitsPerPixel(i10)) / 8.0d);
        for (int i11 = 0; i11 < this.a; i11++) {
            this.f24118d.offer(new c(this));
        }
        this.f24119e = aVar;
    }
}
