package p3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23376b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23377c;

    public l(List list) {
        this.f23377c = list;
        this.a = new ArrayList(list.size());
        this.f23376b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.a.add(new o((List) ((t3.f) list.get(i10)).f25215b.f21106c));
            this.f23376b.add(((t3.f) list.get(i10)).f25216c.a());
        }
    }

    public l(ArrayList grantedPermissions, ArrayList declinedPermissions, ArrayList expiredPermissions) {
        Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
        this.a = grantedPermissions;
        this.f23376b = declinedPermissions;
        this.f23377c = expiredPermissions;
    }
}
