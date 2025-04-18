package zh;

import java.io.IOException;
import ki.a0;
import ki.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends p {

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f28825c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a0 delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f28825c = onException;
    }

    @Override // ki.p, ki.i0
    public final void a(ki.i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f28826d) {
            source.skip(j3);
            return;
        }
        try {
            super.a(source, j3);
        } catch (IOException e2) {
            this.f28826d = true;
            this.f28825c.invoke(e2);
        }
    }

    @Override // ki.p, ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f28826d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.f28826d = true;
            this.f28825c.invoke(e2);
        }
    }

    @Override // ki.p, ki.i0, java.io.Flushable
    public final void flush() {
        if (this.f28826d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.f28826d = true;
            this.f28825c.invoke(e2);
        }
    }
}
