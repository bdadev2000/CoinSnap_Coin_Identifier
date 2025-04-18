package com.bumptech.glide.load.data;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class m implements f {
    public final h4.h a;

    public m(h4.h hVar) {
        this.a = hVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        return new n((InputStream) obj, this.a);
    }
}
