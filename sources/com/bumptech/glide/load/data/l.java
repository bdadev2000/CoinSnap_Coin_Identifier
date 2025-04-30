package com.bumptech.glide.load.data;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.f f12865a;

    public l(Q1.f fVar) {
        this.f12865a = fVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        return new h((InputStream) obj, this.f12865a);
    }
}
