package s7;

import java.io.IOException;

/* loaded from: classes3.dex */
public class x1 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24863c;

    public x1(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f24862b = z10;
        this.f24863c = i10;
    }

    public static x1 a(String str, Exception exc) {
        return new x1(str, exc, true, 1);
    }

    public static x1 b(String str, Exception exc) {
        return new x1(str, exc, true, 4);
    }

    public static x1 c(String str) {
        return new x1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f24862b);
        sb2.append(", dataType=");
        return vd.e.g(sb2, this.f24863c, "}");
    }
}
