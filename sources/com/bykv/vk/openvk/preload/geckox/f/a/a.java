package com.bykv.vk.openvk.preload.geckox.f.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class a {
    private File a;

    public a(File file) {
        this.a = file;
    }

    public abstract InputStream a(File file, String str) throws IOException;

    public final InputStream a(String str) throws IOException {
        return a(this.a, str);
    }

    public abstract boolean b(File file, String str) throws IOException;

    public final boolean b(String str) throws IOException {
        return b(this.a, str);
    }
}
