package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10970b;

    public s(HashMap proxyEvents) {
        Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
        this.f10970b = proxyEvents;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new t(this.f10970b);
    }
}
