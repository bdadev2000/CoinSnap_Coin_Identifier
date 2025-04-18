package u7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class b0 implements p {

    /* renamed from: b, reason: collision with root package name */
    public n f25542b;

    /* renamed from: c, reason: collision with root package name */
    public n f25543c;

    /* renamed from: d, reason: collision with root package name */
    public n f25544d;

    /* renamed from: e, reason: collision with root package name */
    public n f25545e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f25546f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f25547g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25548h;

    public b0() {
        ByteBuffer byteBuffer = p.a;
        this.f25546f = byteBuffer;
        this.f25547g = byteBuffer;
        n nVar = n.f25592e;
        this.f25544d = nVar;
        this.f25545e = nVar;
        this.f25542b = nVar;
        this.f25543c = nVar;
    }

    @Override // u7.p
    public final n a(n nVar) {
        this.f25544d = nVar;
        this.f25545e = b(nVar);
        if (isActive()) {
            return this.f25545e;
        }
        return n.f25592e;
    }

    public abstract n b(n nVar);

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public final ByteBuffer f(int i10) {
        if (this.f25546f.capacity() < i10) {
            this.f25546f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f25546f.clear();
        }
        ByteBuffer byteBuffer = this.f25546f;
        this.f25547g = byteBuffer;
        return byteBuffer;
    }

    @Override // u7.p
    public final void flush() {
        this.f25547g = p.a;
        this.f25548h = false;
        this.f25542b = this.f25544d;
        this.f25543c = this.f25545e;
        c();
    }

    @Override // u7.p
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f25547g;
        this.f25547g = p.a;
        return byteBuffer;
    }

    @Override // u7.p
    public boolean isActive() {
        return this.f25545e != n.f25592e;
    }

    @Override // u7.p
    public boolean isEnded() {
        return this.f25548h && this.f25547g == p.a;
    }

    @Override // u7.p
    public final void queueEndOfStream() {
        this.f25548h = true;
        d();
    }

    @Override // u7.p
    public final void reset() {
        flush();
        this.f25546f = p.a;
        n nVar = n.f25592e;
        this.f25544d = nVar;
        this.f25545e = nVar;
        this.f25542b = nVar;
        this.f25543c = nVar;
        e();
    }
}
