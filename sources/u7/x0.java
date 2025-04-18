package u7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class x0 implements p {

    /* renamed from: b, reason: collision with root package name */
    public int f25692b;

    /* renamed from: c, reason: collision with root package name */
    public float f25693c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f25694d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public n f25695e;

    /* renamed from: f, reason: collision with root package name */
    public n f25696f;

    /* renamed from: g, reason: collision with root package name */
    public n f25697g;

    /* renamed from: h, reason: collision with root package name */
    public n f25698h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25699i;

    /* renamed from: j, reason: collision with root package name */
    public w0 f25700j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f25701k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f25702l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f25703m;

    /* renamed from: n, reason: collision with root package name */
    public long f25704n;

    /* renamed from: o, reason: collision with root package name */
    public long f25705o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25706p;

    public x0() {
        n nVar = n.f25592e;
        this.f25695e = nVar;
        this.f25696f = nVar;
        this.f25697g = nVar;
        this.f25698h = nVar;
        ByteBuffer byteBuffer = p.a;
        this.f25701k = byteBuffer;
        this.f25702l = byteBuffer.asShortBuffer();
        this.f25703m = byteBuffer;
        this.f25692b = -1;
    }

    @Override // u7.p
    public final n a(n nVar) {
        if (nVar.f25594c == 2) {
            int i10 = this.f25692b;
            if (i10 == -1) {
                i10 = nVar.a;
            }
            this.f25695e = nVar;
            n nVar2 = new n(i10, nVar.f25593b, 2);
            this.f25696f = nVar2;
            this.f25699i = true;
            return nVar2;
        }
        throw new o(nVar);
    }

    @Override // u7.p
    public final void flush() {
        if (isActive()) {
            n nVar = this.f25695e;
            this.f25697g = nVar;
            n nVar2 = this.f25696f;
            this.f25698h = nVar2;
            if (this.f25699i) {
                this.f25700j = new w0(nVar.a, nVar.f25593b, this.f25693c, this.f25694d, nVar2.a);
            } else {
                w0 w0Var = this.f25700j;
                if (w0Var != null) {
                    w0Var.f25677k = 0;
                    w0Var.f25679m = 0;
                    w0Var.f25681o = 0;
                    w0Var.f25682p = 0;
                    w0Var.f25683q = 0;
                    w0Var.f25684r = 0;
                    w0Var.f25685s = 0;
                    w0Var.f25686t = 0;
                    w0Var.u = 0;
                    w0Var.f25687v = 0;
                }
            }
        }
        this.f25703m = p.a;
        this.f25704n = 0L;
        this.f25705o = 0L;
        this.f25706p = false;
    }

    @Override // u7.p
    public final ByteBuffer getOutput() {
        w0 w0Var = this.f25700j;
        if (w0Var != null) {
            int i10 = w0Var.f25679m;
            int i11 = w0Var.f25668b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f25701k.capacity() < i12) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f25701k = order;
                    this.f25702l = order.asShortBuffer();
                } else {
                    this.f25701k.clear();
                    this.f25702l.clear();
                }
                ShortBuffer shortBuffer = this.f25702l;
                int min = Math.min(shortBuffer.remaining() / i11, w0Var.f25679m);
                int i13 = min * i11;
                shortBuffer.put(w0Var.f25678l, 0, i13);
                int i14 = w0Var.f25679m - min;
                w0Var.f25679m = i14;
                short[] sArr = w0Var.f25678l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f25705o += i12;
                this.f25701k.limit(i12);
                this.f25703m = this.f25701k;
            }
        }
        ByteBuffer byteBuffer = this.f25703m;
        this.f25703m = p.a;
        return byteBuffer;
    }

    @Override // u7.p
    public final boolean isActive() {
        if (this.f25696f.a != -1 && (Math.abs(this.f25693c - 1.0f) >= 1.0E-4f || Math.abs(this.f25694d - 1.0f) >= 1.0E-4f || this.f25696f.a != this.f25695e.a)) {
            return true;
        }
        return false;
    }

    @Override // u7.p
    public final boolean isEnded() {
        w0 w0Var;
        if (this.f25706p && ((w0Var = this.f25700j) == null || w0Var.f25679m * w0Var.f25668b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // u7.p
    public final void queueEndOfStream() {
        w0 w0Var = this.f25700j;
        if (w0Var != null) {
            int i10 = w0Var.f25677k;
            float f10 = w0Var.f25669c;
            float f11 = w0Var.f25670d;
            int i11 = w0Var.f25679m + ((int) ((((i10 / (f10 / f11)) + w0Var.f25681o) / (w0Var.f25671e * f11)) + 0.5f));
            short[] sArr = w0Var.f25676j;
            int i12 = w0Var.f25674h * 2;
            w0Var.f25676j = w0Var.b(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = w0Var.f25668b;
                if (i13 >= i12 * i14) {
                    break;
                }
                w0Var.f25676j[(i14 * i10) + i13] = 0;
                i13++;
            }
            w0Var.f25677k = i12 + w0Var.f25677k;
            w0Var.e();
            if (w0Var.f25679m > i11) {
                w0Var.f25679m = i11;
            }
            w0Var.f25677k = 0;
            w0Var.f25684r = 0;
            w0Var.f25681o = 0;
        }
        this.f25706p = true;
    }

    @Override // u7.p
    public final void queueInput(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        w0 w0Var = this.f25700j;
        w0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f25704n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = w0Var.f25668b;
        int i11 = remaining2 / i10;
        short[] b3 = w0Var.b(w0Var.f25676j, w0Var.f25677k, i11);
        w0Var.f25676j = b3;
        asShortBuffer.get(b3, w0Var.f25677k * i10, ((i11 * i10) * 2) / 2);
        w0Var.f25677k += i11;
        w0Var.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // u7.p
    public final void reset() {
        this.f25693c = 1.0f;
        this.f25694d = 1.0f;
        n nVar = n.f25592e;
        this.f25695e = nVar;
        this.f25696f = nVar;
        this.f25697g = nVar;
        this.f25698h = nVar;
        ByteBuffer byteBuffer = p.a;
        this.f25701k = byteBuffer;
        this.f25702l = byteBuffer.asShortBuffer();
        this.f25703m = byteBuffer;
        this.f25692b = -1;
        this.f25699i = false;
        this.f25700j = null;
        this.f25704n = 0L;
        this.f25705o = 0L;
        this.f25706p = false;
    }
}
