package wh;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27234b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final long f27235c;

    /* renamed from: d, reason: collision with root package name */
    public final ki.k f27236d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f27237f;

    public w0(String str, long j3, ki.e0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f27237f = str;
        this.f27235c = j3;
        this.f27236d = source;
    }

    @Override // wh.y0
    public final long contentLength() {
        return this.f27235c;
    }

    @Override // wh.y0
    public final g0 contentType() {
        int i10 = this.f27234b;
        Object obj = this.f27237f;
        switch (i10) {
            case 0:
                return (g0) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = g0.f27059d;
                return a0.E(str);
        }
    }

    @Override // wh.y0
    public final ki.k source() {
        return this.f27236d;
    }

    public w0(g0 g0Var, long j3, ki.k kVar) {
        this.f27237f = g0Var;
        this.f27235c = j3;
        this.f27236d = kVar;
    }
}
