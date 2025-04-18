package com.facebook.internal;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final m f11030d = new m();

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f11031e = new HashMap();
    public final com.facebook.m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11032b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f11033c;

    public d0() {
        com.facebook.m0 behavior = com.facebook.m0.REQUESTS;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter("Request", "tag");
        this.a = behavior;
        x5.i.o("Request", "tag");
        this.f11032b = Intrinsics.stringPlus("FacebookSDK.", "Request");
        this.f11033c = new StringBuilder();
    }

    public final void a(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] args = {key, value};
        Intrinsics.checkNotNullParameter("  %s:\t%s\n", "format");
        Intrinsics.checkNotNullParameter(args, "args");
        c();
    }

    public final void b() {
        String string = this.f11033c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        Intrinsics.checkNotNullParameter(string, "string");
        m.p(this.a, this.f11032b, string);
        this.f11033c = new StringBuilder();
    }

    public final void c() {
        com.facebook.x xVar = com.facebook.x.a;
        com.facebook.x.i(this.a);
    }
}
