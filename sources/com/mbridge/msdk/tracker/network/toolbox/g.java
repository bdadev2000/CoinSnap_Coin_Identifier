package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f18241a;
    private final List<com.mbridge.msdk.tracker.network.h> b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18242c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f18243d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f18244e;

    public g(int i9, List<com.mbridge.msdk.tracker.network.h> list) {
        this(i9, list, -1, null);
    }

    public final int a() {
        return this.f18241a;
    }

    public final List<com.mbridge.msdk.tracker.network.h> b() {
        return Collections.unmodifiableList(this.b);
    }

    public final int c() {
        return this.f18242c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f18243d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f18244e != null) {
            return new ByteArrayInputStream(this.f18244e);
        }
        return null;
    }

    public g(int i9, List<com.mbridge.msdk.tracker.network.h> list, int i10, InputStream inputStream) {
        this.f18241a = i9;
        this.b = list;
        this.f18242c = i10;
        this.f18243d = inputStream;
        this.f18244e = null;
    }
}
