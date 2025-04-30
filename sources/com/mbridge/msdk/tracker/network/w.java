package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* loaded from: classes3.dex */
public final class w<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f18285a;
    public final b.a b;

    /* renamed from: c, reason: collision with root package name */
    public final ad f18286c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18287d;

    /* loaded from: classes3.dex */
    public interface a {
        void a(ad adVar);
    }

    /* loaded from: classes3.dex */
    public interface b<T> {
        void a(T t9);
    }

    private w(T t9, b.a aVar) {
        this.f18287d = false;
        this.f18285a = t9;
        this.b = aVar;
        this.f18286c = null;
    }

    public static <T> w<T> a(T t9, b.a aVar) {
        return new w<>(t9, aVar);
    }

    public static <T> w<T> a(ad adVar) {
        return new w<>(adVar);
    }

    private w(ad adVar) {
        this.f18287d = false;
        this.f18285a = null;
        this.b = null;
        this.f18286c = adVar;
    }
}
