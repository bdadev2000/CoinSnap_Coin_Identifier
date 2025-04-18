package com.facebook.appevents;

import com.facebook.internal.m0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f10923b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10924c;

    public b(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f10923b = applicationId;
        this.f10924c = m0.z(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new a(this.f10924c, this.f10923b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!m0.a(bVar.f10924c, this.f10924c) || !m0.a(bVar.f10923b, this.f10923b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10924c;
        return (str == null ? 0 : str.hashCode()) ^ this.f10923b.hashCode();
    }
}
