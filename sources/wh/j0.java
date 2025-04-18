package wh;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f27080e;

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f27081f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27082g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f27083h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f27084i;
    public final ki.l a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27085b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f27086c;

    /* renamed from: d, reason: collision with root package name */
    public long f27087d;

    static {
        Pattern pattern = g0.f27059d;
        f27080e = a0.r("multipart/mixed");
        a0.r("multipart/alternative");
        a0.r("multipart/digest");
        a0.r("multipart/parallel");
        f27081f = a0.r("multipart/form-data");
        f27082g = new byte[]{58, 32};
        f27083h = new byte[]{Ascii.CR, 10};
        f27084i = new byte[]{45, 45};
    }

    public j0(ki.l boundaryByteString, g0 type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.a = boundaryByteString;
        this.f27085b = parts;
        Pattern pattern = g0.f27059d;
        this.f27086c = a0.r(type + "; boundary=" + boundaryByteString.q());
        this.f27087d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(ki.j jVar, boolean z10) {
        ki.i iVar;
        ki.j jVar2;
        if (z10) {
            jVar2 = new ki.i();
            iVar = jVar2;
        } else {
            iVar = 0;
            jVar2 = jVar;
        }
        List list = this.f27085b;
        int size = list.size();
        long j3 = 0;
        int i10 = 0;
        while (true) {
            ki.l lVar = this.a;
            byte[] bArr = f27084i;
            byte[] bArr2 = f27083h;
            if (i10 < size) {
                int i11 = i10 + 1;
                i0 i0Var = (i0) list.get(i10);
                z zVar = i0Var.a;
                Intrinsics.checkNotNull(jVar2);
                jVar2.write(bArr);
                jVar2.E(lVar);
                jVar2.write(bArr2);
                if (zVar != null) {
                    int length = zVar.f27243b.length / 2;
                    for (int i12 = 0; i12 < length; i12++) {
                        jVar2.writeUtf8(zVar.b(i12)).write(f27082g).writeUtf8(zVar.d(i12)).write(bArr2);
                    }
                }
                s0 s0Var = i0Var.f27079b;
                g0 contentType = s0Var.contentType();
                if (contentType != null) {
                    jVar2.writeUtf8("Content-Type: ").writeUtf8(contentType.a).write(bArr2);
                }
                long contentLength = s0Var.contentLength();
                if (contentLength != -1) {
                    jVar2.writeUtf8("Content-Length: ").writeDecimalLong(contentLength).write(bArr2);
                } else if (z10) {
                    Intrinsics.checkNotNull(iVar);
                    iVar.d();
                    return -1L;
                }
                jVar2.write(bArr2);
                if (z10) {
                    j3 += contentLength;
                } else {
                    s0Var.writeTo(jVar2);
                }
                jVar2.write(bArr2);
                i10 = i11;
            } else {
                Intrinsics.checkNotNull(jVar2);
                jVar2.write(bArr);
                jVar2.E(lVar);
                jVar2.write(bArr);
                jVar2.write(bArr2);
                if (z10) {
                    Intrinsics.checkNotNull(iVar);
                    long j10 = j3 + iVar.f20994c;
                    iVar.d();
                    return j10;
                }
                return j3;
            }
        }
    }

    @Override // wh.s0
    public final long contentLength() {
        long j3 = this.f27087d;
        if (j3 == -1) {
            long a = a(null, true);
            this.f27087d = a;
            return a;
        }
        return j3;
    }

    @Override // wh.s0
    public final g0 contentType() {
        return this.f27086c;
    }

    @Override // wh.s0
    public final void writeTo(ki.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
