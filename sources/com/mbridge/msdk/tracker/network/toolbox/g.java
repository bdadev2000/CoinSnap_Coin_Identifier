package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class g {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.h> f15481b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15482c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f15483d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f15484e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.h> list) {
        this(i10, list, -1, null);
    }

    public final int a() {
        return this.a;
    }

    public final List<com.mbridge.msdk.tracker.network.h> b() {
        return Collections.unmodifiableList(this.f15481b);
    }

    public final int c() {
        return this.f15482c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f15483d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f15484e != null) {
            return new ByteArrayInputStream(this.f15484e);
        }
        return null;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.h> list, int i11, InputStream inputStream) {
        this.a = i10;
        this.f15481b = list;
        this.f15482c = i11;
        this.f15483d = inputStream;
        this.f15484e = null;
    }
}
