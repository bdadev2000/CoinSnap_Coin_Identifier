package w7;

import java.nio.ByteBuffer;
import s7.p0;

/* loaded from: classes3.dex */
public class i extends a {

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f26890f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26891g;

    /* renamed from: h, reason: collision with root package name */
    public long f26892h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f26893i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26894j;

    /* renamed from: d, reason: collision with root package name */
    public final d f26889d = new d();

    /* renamed from: k, reason: collision with root package name */
    public final int f26895k = 0;

    static {
        p0.a("goog.exo.decoder");
    }

    public i(int i10) {
        this.f26894j = i10;
    }

    public void e() {
        this.f26867c = 0;
        ByteBuffer byteBuffer = this.f26890f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f26893i;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26891g = false;
    }

    public final ByteBuffer f(int i10) {
        int capacity;
        int i11 = this.f26894j;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f26890f;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new h(capacity, i10);
    }

    public final void g(int i10) {
        int i11 = i10 + this.f26895k;
        ByteBuffer byteBuffer = this.f26890f;
        if (byteBuffer == null) {
            this.f26890f = f(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f26890f = byteBuffer;
            return;
        }
        ByteBuffer f10 = f(i12);
        f10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f10.put(byteBuffer);
        }
        this.f26890f = f10;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f26890f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f26893i;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
