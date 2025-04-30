package i8;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import w8.C2912b;

/* loaded from: classes3.dex */
public final class D extends G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20759a;
    public final /* synthetic */ x b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20760c;

    public /* synthetic */ D(x xVar, Object obj, int i9) {
        this.f20759a = i9;
        this.b = xVar;
        this.f20760c = obj;
    }

    @Override // i8.G
    public final long contentLength() {
        switch (this.f20759a) {
            case 0:
                return ((File) this.f20760c).length();
            default:
                return ((w8.i) this.f20760c).c();
        }
    }

    @Override // i8.G
    public final x contentType() {
        switch (this.f20759a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // i8.G
    public final void writeTo(w8.g gVar) {
        Object obj = this.f20760c;
        switch (this.f20759a) {
            case 0:
                Logger logger = w8.p.f24030a;
                File file = (File) obj;
                G7.j.e(file, "<this>");
                C2912b c2912b = new C2912b(new FileInputStream(file), w8.A.f23999d);
                try {
                    gVar.z(c2912b);
                    android.support.v4.media.session.a.f(c2912b, null);
                    return;
                } finally {
                }
            default:
                gVar.A((w8.i) obj);
                return;
        }
    }
}
