package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements Serializable {
    private static final long serialVersionUID = -2488473066578201069L;

    /* renamed from: b, reason: collision with root package name */
    public final String f10921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10922c;

    public a(String str, String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f10921b = str;
        this.f10922c = appId;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new b(this.f10921b, this.f10922c);
    }
}
