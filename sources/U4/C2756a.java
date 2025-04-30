package u4;

import java.io.File;
import w4.C2864C;
import w4.P0;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2756a {

    /* renamed from: a, reason: collision with root package name */
    public final P0 f23109a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final File f23110c;

    public C2756a(C2864C c2864c, String str, File file) {
        this.f23109a = c2864c;
        if (str != null) {
            this.b = str;
            this.f23110c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2756a)) {
            return false;
        }
        C2756a c2756a = (C2756a) obj;
        if (this.f23109a.equals(c2756a.f23109a) && this.b.equals(c2756a.b) && this.f23110c.equals(c2756a.f23110c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23109a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23110c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f23109a + ", sessionId=" + this.b + ", reportFile=" + this.f23110c + "}";
    }
}
