package k9;

import com.google.common.collect.r0;
import java.util.Collections;
import java.util.List;
import n9.h0;
import v8.i1;

/* loaded from: classes3.dex */
public final class u implements s7.i {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20478d = h0.E(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f20479f = h0.E(1);

    /* renamed from: b, reason: collision with root package name */
    public final i1 f20480b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f20481c;

    static {
        new n0.h(8);
    }

    public u(i1 i1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i1Var.f26163b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f20480b = i1Var;
        this.f20481c = r0.i(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f20480b.equals(uVar.f20480b) && this.f20481c.equals(uVar.f20481c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20481c.hashCode() * 31) + this.f20480b.hashCode();
    }
}
