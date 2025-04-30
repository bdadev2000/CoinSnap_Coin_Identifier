package k8;

import G7.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w8.y;

/* loaded from: classes3.dex */
public final class f implements Closeable {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21512c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21513d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f21514f;

    public f(h hVar, String str, long j7, ArrayList arrayList, long[] jArr) {
        j.e(hVar, "this$0");
        j.e(str, "key");
        j.e(jArr, "lengths");
        this.f21514f = hVar;
        this.b = str;
        this.f21512c = j7;
        this.f21513d = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f21513d.iterator();
        while (it.hasNext()) {
            j8.b.c((y) it.next());
        }
    }
}
