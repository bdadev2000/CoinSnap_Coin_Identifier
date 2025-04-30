package l3;

import Q7.n0;
import z.AbstractC2965e;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21554a;
    public final long b;

    public C2436a(int i9, long j7) {
        if (i9 != 0) {
            this.f21554a = i9;
            this.b = j7;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2436a)) {
            return false;
        }
        C2436a c2436a = (C2436a) obj;
        if (AbstractC2965e.a(this.f21554a, c2436a.f21554a) && this.b == c2436a.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d2 = (AbstractC2965e.d(this.f21554a) ^ 1000003) * 1000003;
        long j7 = this.b;
        return d2 ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i9 = this.f21554a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return n0.k(sb, this.b, "}");
    }
}
