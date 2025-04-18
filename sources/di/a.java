package di;

import a4.s;
import ki.k;
import kotlin.jvm.internal.Intrinsics;
import wh.z;

/* loaded from: classes5.dex */
public final class a {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public long f17042b;

    public a(k source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.a = source;
        this.f17042b = 262144L;
    }

    public final z a() {
        boolean z10;
        s sVar = new s();
        while (true) {
            String readUtf8LineStrict = this.a.readUtf8LineStrict(this.f17042b);
            this.f17042b -= readUtf8LineStrict.length();
            if (readUtf8LineStrict.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return sVar.d();
            }
            sVar.b(readUtf8LineStrict);
        }
    }
}
