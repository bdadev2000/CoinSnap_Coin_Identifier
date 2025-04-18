package okio;

import java.io.Closeable;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class Okio__OkioKt {
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        p0.a.s(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t2, @NotNull l lVar) {
        R r2;
        p0.a.s(lVar, "block");
        Throwable th = null;
        try {
            r2 = (R) lVar.invoke(t2);
            if (t2 != null) {
                try {
                    t2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (t2 != null) {
                try {
                    t2.close();
                } catch (Throwable th4) {
                    q.a(th3, th4);
                }
            }
            th = th3;
            r2 = null;
        }
        if (th != null) {
            throw th;
        }
        p0.a.p(r2);
        return r2;
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        p0.a.s(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
