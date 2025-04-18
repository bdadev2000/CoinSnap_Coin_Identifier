package jb;

import java.io.File;
import mb.b0;
import mb.s2;

/* loaded from: classes3.dex */
public final class a {
    public final s2 a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19873b;

    /* renamed from: c, reason: collision with root package name */
    public final File f19874c;

    public a(b0 b0Var, String str, File file) {
        this.a = b0Var;
        if (str != null) {
            this.f19873b = str;
            if (file != null) {
                this.f19874c = file;
                return;
            }
            throw new NullPointerException("Null reportFile");
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && this.f19873b.equals(aVar.f19873b) && this.f19874c.equals(aVar.f19874c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f19873b.hashCode()) * 1000003) ^ this.f19874c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.f19873b + ", reportFile=" + this.f19874c + "}";
    }
}
