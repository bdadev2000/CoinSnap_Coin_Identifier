package i;

import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public final class n implements c {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f30804a;

    /* renamed from: b, reason: collision with root package name */
    public final j f30805b;

    public n(long j2, Path path, FileSystem fileSystem, h1.c cVar) {
        this.f30804a = fileSystem;
        this.f30805b = new j(fileSystem, path, cVar, j2);
    }
}
