package okio.internal;

import b1.f0;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.sessions.settings.RemoteSettings;
import d0.h;
import e0.q;
import e0.t;
import e0.u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.k;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* loaded from: classes2.dex */
public final class ResourceFileSystem extends FileSystem {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null);

    @NotNull
    private final ClassLoader classLoader;

    @NotNull
    private final h roots$delegate;

    @NotNull
    private final FileSystem systemFileSystem;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !m.P0(path.name(), ".class", true);
        }

        @NotNull
        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        @NotNull
        public final Path removeBase(@NotNull Path path, @NotNull Path path2) {
            a.s(path, "<this>");
            a.s(path2, "base");
            return getROOT().resolve(m.j1(m.g1(path2.toString(), path.toString()), '\\', '/'));
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z2, FileSystem fileSystem, int i2, k kVar) {
        this(classLoader, z2, (i2 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<d0.k> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<d0.k> toClasspathRoots(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        a.r(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        a.r(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            a.p(url);
            d0.k fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        a.r(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        a.r(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            a.p(url2);
            d0.k jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return u.P0(arrayList2, arrayList);
    }

    private final d0.k toFileRoot(URL url) {
        if (a.g(url.getProtocol(), ShareInternalUtility.STAGING_PARAM)) {
            return new d0.k(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final d0.k toJarRoot(URL url) {
        int b12;
        String url2 = url.toString();
        a.r(url2, "toString(...)");
        if (!m.q1(url2, "jar:file:", false) || (b12 = m.b1(url2, "!", 6)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String substring = url2.substring(4, b12);
        a.r(substring, "substring(...)");
        return new d0.k(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(substring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path, boolean z2) {
        a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path path, @NotNull Path path2) {
        a.s(path, "source");
        a.s(path2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) {
        a.s(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path path, boolean z2) {
        a.s(path, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path path, @NotNull Path path2) {
        a.s(path, "source");
        a.s(path2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean z2) {
        a.s(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path path) {
        a.s(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (d0.k kVar : getRoots()) {
            FileSystem fileSystem = (FileSystem) kVar.f30134a;
            Path path2 = (Path) kVar.f30135b;
            try {
                List<Path> list = fileSystem.list(path2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path2));
                }
                t.t0(linkedHashSet, arrayList2);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return u.Z0(linkedHashSet);
        }
        throw new FileNotFoundException(okio.a.a("file not found: ", path));
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path path) {
        a.s(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<d0.k> it = getRoots().iterator();
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            d0.k next = it.next();
            FileSystem fileSystem = (FileSystem) next.f30134a;
            Path path2 = (Path) next.f30135b;
            List<Path> listOrNull = fileSystem.listOrNull(path2.resolve(relativePath));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q.M(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                t.t0(linkedHashSet, arrayList);
                z2 = true;
            }
        }
        if (z2) {
            return u.Z0(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) {
        a.s(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (d0.k kVar : getRoots()) {
            FileMetadata metadataOrNull = ((FileSystem) kVar.f30134a).metadataOrNull(((Path) kVar.f30135b).resolve(relativePath));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path) {
        a.s(path, ShareInternalUtility.STAGING_PARAM);
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException(okio.a.a("file not found: ", path));
        }
        String relativePath = toRelativePath(path);
        for (d0.k kVar : getRoots()) {
            try {
                return ((FileSystem) kVar.f30134a).openReadOnly(((Path) kVar.f30135b).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(okio.a.a("file not found: ", path));
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path, boolean z2, boolean z3) {
        a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path, boolean z2) {
        a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path) {
        Source source;
        a.s(path, ShareInternalUtility.STAGING_PARAM);
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException(okio.a.a("file not found: ", path));
        }
        Path path2 = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path2, path, false, 2, (Object) null).relativeTo(path2).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(okio.a.a("file not found: ", path));
        }
        return source;
    }

    public ResourceFileSystem(@NotNull ClassLoader classLoader, boolean z2, @NotNull FileSystem fileSystem) {
        a.s(classLoader, "classLoader");
        a.s(fileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots$delegate = f0.t(new ResourceFileSystem$roots$2(this));
        if (z2) {
            getRoots().size();
        }
    }
}
