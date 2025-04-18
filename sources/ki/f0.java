package ki;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f20979b;

    /* renamed from: c, reason: collision with root package name */
    public int f20980c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20981d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20982e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f20983f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f20984g;

    public f0() {
        this.a = new byte[8192];
        this.f20982e = true;
        this.f20981d = false;
    }

    public final f0 a() {
        f0 f0Var = this.f20983f;
        if (f0Var == this) {
            f0Var = null;
        }
        f0 f0Var2 = this.f20984g;
        Intrinsics.checkNotNull(f0Var2);
        f0Var2.f20983f = this.f20983f;
        f0 f0Var3 = this.f20983f;
        Intrinsics.checkNotNull(f0Var3);
        f0Var3.f20984g = this.f20984g;
        this.f20983f = null;
        this.f20984g = null;
        return f0Var;
    }

    public final void b(f0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f20984g = this;
        segment.f20983f = this.f20983f;
        f0 f0Var = this.f20983f;
        Intrinsics.checkNotNull(f0Var);
        f0Var.f20984g = segment;
        this.f20983f = segment;
    }

    public final f0 c() {
        this.f20981d = true;
        return new f0(this.a, this.f20979b, this.f20980c, true);
    }

    public final void d(f0 sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink.f20982e) {
            int i11 = sink.f20980c;
            int i12 = i11 + i10;
            byte[] bArr = sink.a;
            if (i12 > 8192) {
                if (!sink.f20981d) {
                    int i13 = sink.f20979b;
                    if (i12 - i13 <= 8192) {
                        ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i13, i11, 2, (Object) null);
                        sink.f20980c -= sink.f20979b;
                        sink.f20979b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i14 = sink.f20980c;
            int i15 = this.f20979b;
            ArraysKt.copyInto(this.a, bArr, i14, i15, i15 + i10);
            sink.f20980c += i10;
            this.f20979b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public f0(byte[] data, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = data;
        this.f20979b = i10;
        this.f20980c = i11;
        this.f20981d = z10;
        this.f20982e = false;
    }
}
