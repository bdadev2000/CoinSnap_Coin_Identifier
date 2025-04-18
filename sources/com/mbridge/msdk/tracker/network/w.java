package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* loaded from: classes4.dex */
public final class w<T> {
    public final T a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f15521b;

    /* renamed from: c, reason: collision with root package name */
    public final ad f15522c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15523d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(ad adVar);
    }

    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(T t5);
    }

    private w(T t5, b.a aVar) {
        this.f15523d = false;
        this.a = t5;
        this.f15521b = aVar;
        this.f15522c = null;
    }

    public static <T> w<T> a(T t5, b.a aVar) {
        return new w<>(t5, aVar);
    }

    public static <T> w<T> a(ad adVar) {
        return new w<>(adVar);
    }

    private w(ad adVar) {
        this.f15523d = false;
        this.a = null;
        this.f15521b = null;
        this.f15522c = adVar;
    }
}
