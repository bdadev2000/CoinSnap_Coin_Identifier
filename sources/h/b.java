package h;

import okio.Buffer;
import okio.ForwardingSource;

/* loaded from: classes4.dex */
public final class b extends ForwardingSource {

    /* renamed from: a, reason: collision with root package name */
    public Exception f30646a;

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j2) {
        try {
            return super.read(buffer, j2);
        } catch (Exception e) {
            this.f30646a = e;
            throw e;
        }
    }
}
