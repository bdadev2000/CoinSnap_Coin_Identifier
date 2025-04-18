package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10971b;

    public t() {
        this.f10971b = new HashMap();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            return new s(this.f10971b);
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final void a(b accessTokenAppIdPair, List appEvents) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            HashMap hashMap = this.f10971b;
            if (!hashMap.containsKey(accessTokenAppIdPair)) {
                hashMap.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                return;
            }
            List list = (List) hashMap.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public t(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap hashMap = new HashMap();
        this.f10971b = hashMap;
        hashMap.putAll(appEventMap);
    }
}
