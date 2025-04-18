package di;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import wh.d0;

/* loaded from: classes5.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public final d0 f17049f;

    /* renamed from: g, reason: collision with root package name */
    public long f17050g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f17052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h this$0, d0 url) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17052i = this$0;
        this.f17049f = url;
        this.f17050g = -1L;
        this.f17051h = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17044c) {
            return;
        }
        if (this.f17051h && !xh.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f17052i.f17060b.k();
            d();
        }
        this.f17044c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r4 != false) goto L28;
     */
    @Override // di.b, ki.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(ki.i r13, long r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: di.d.read(ki.i, long):long");
    }
}
