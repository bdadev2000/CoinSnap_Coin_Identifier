package com.vungle.ads;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 extends n3 {
    public /* synthetic */ b1(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str);
    }

    @Override // com.vungle.ads.n3
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(b1.class, cls)) {
            return false;
        }
        int code = getCode();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.vungle.ads.InternalError");
        if (code == ((b1) obj).getCode()) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.n3
    public int hashCode() {
        return b1.class.hashCode();
    }

    public b1(int i10, String str) {
        super(Integer.valueOf(i10), null, str, null, null, null, 58, null);
    }
}
