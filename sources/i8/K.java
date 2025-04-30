package i8;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class K extends M {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20788c;

    /* renamed from: d, reason: collision with root package name */
    public final w8.h f20789d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20790f;

    public /* synthetic */ K(Object obj, long j7, w8.h hVar, int i9) {
        this.b = i9;
        this.f20790f = obj;
        this.f20788c = j7;
        this.f20789d = hVar;
    }

    @Override // i8.M
    public final long contentLength() {
        switch (this.b) {
            case 0:
                return this.f20788c;
            default:
                return this.f20788c;
        }
    }

    @Override // i8.M
    public final x contentType() {
        Object obj = this.f20790f;
        switch (this.b) {
            case 0:
                return (x) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = x.f20893c;
                return r8.k.u(str);
        }
    }

    @Override // i8.M
    public final w8.h source() {
        switch (this.b) {
            case 0:
                return this.f20789d;
            default:
                return this.f20789d;
        }
    }
}
