package zh;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final String f28796b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28797c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28798d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f28799f;

    public h(j this$0, String key, long j3, ArrayList sources, long[] lengths) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(lengths, "lengths");
        this.f28799f = this$0;
        this.f28796b = key;
        this.f28797c = j3;
        this.f28798d = sources;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f28798d.iterator();
        while (it.hasNext()) {
            xh.b.c((k0) it.next());
        }
    }
}
