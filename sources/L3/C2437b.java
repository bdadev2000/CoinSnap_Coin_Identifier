package l3;

import android.content.Context;
import t3.C2707b;
import x0.AbstractC2914a;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2437b extends AbstractC2438c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21555a;
    public final C2707b b;

    /* renamed from: c, reason: collision with root package name */
    public final C2707b f21556c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21557d;

    public C2437b(Context context, C2707b c2707b, C2707b c2707b2, String str) {
        if (context != null) {
            this.f21555a = context;
            if (c2707b != null) {
                this.b = c2707b;
                if (c2707b2 != null) {
                    this.f21556c = c2707b2;
                    if (str != null) {
                        this.f21557d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2438c)) {
            return false;
        }
        AbstractC2438c abstractC2438c = (AbstractC2438c) obj;
        if (this.f21555a.equals(((C2437b) abstractC2438c).f21555a)) {
            C2437b c2437b = (C2437b) abstractC2438c;
            if (this.b.equals(c2437b.b) && this.f21556c.equals(c2437b.f21556c) && this.f21557d.equals(c2437b.f21557d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f21555a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f21556c.hashCode()) * 1000003) ^ this.f21557d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f21555a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.f21556c);
        sb.append(", backendName=");
        return AbstractC2914a.h(sb, this.f21557d, "}");
    }
}
