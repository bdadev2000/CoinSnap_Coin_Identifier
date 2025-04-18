package okio;

import e0.q;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Path implements Comparable<Path> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DIRECTORY_SEPARATOR;

    @NotNull
    private final ByteString bytes;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.get(str, z2);
        }

        @NotNull
        public final Path get(@NotNull File file) {
            p0.a.s(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.get(file, z2);
        }

        @NotNull
        public final Path get(@NotNull String str) {
            p0.a.s(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.get(path, z2);
        }

        @NotNull
        public final Path get(@NotNull java.nio.file.Path path) {
            p0.a.s(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull String str, boolean z2) {
            p0.a.s(str, "<this>");
            return okio.internal.Path.commonToPath(str, z2);
        }

        @NotNull
        public final Path get(@NotNull File file, boolean z2) {
            p0.a.s(file, "<this>");
            String file2 = file.toString();
            p0.a.r(file2, "toString(...)");
            return get(file2, z2);
        }

        @NotNull
        public final Path get(@NotNull java.nio.file.Path path, boolean z2) {
            p0.a.s(path, "<this>");
            return get(path.toString(), z2);
        }
    }

    static {
        String str = File.separator;
        p0.a.r(str, "separator");
        DIRECTORY_SEPARATOR = str;
    }

    public Path(@NotNull ByteString byteString) {
        p0.a.s(byteString, "bytes");
        this.bytes = byteString;
    }

    @NotNull
    public static final Path get(@NotNull File file) {
        return Companion.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return path.resolve(str, z2);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Path) && p0.a.g(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    @NotNull
    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    @Nullable
    public final Path getRoot() {
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        if (access$rootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, access$rootLength));
    }

    @NotNull
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < getBytes$okio().size() && getBytes$okio().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = getBytes$okio().size();
        int i2 = access$rootLength;
        while (access$rootLength < size) {
            if (getBytes$okio().getByte(access$rootLength) == 47 || getBytes$okio().getByte(access$rootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i2, access$rootLength));
                i2 = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i2 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i2, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < getBytes$okio().size() && getBytes$okio().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = getBytes$okio().size();
        int i2 = access$rootLength;
        while (access$rootLength < size) {
            if (getBytes$okio().getByte(access$rootLength) == 47 || getBytes$okio().getByte(access$rootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i2, access$rootLength));
                i2 = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i2 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i2, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return okio.internal.Path.access$rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return okio.internal.Path.access$rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return okio.internal.Path.access$rootLength(this) == getBytes$okio().size();
    }

    @NotNull
    public final String name() {
        return nameBytes().utf8();
    }

    @NotNull
    public final ByteString nameBytes() {
        int access$getIndexOfLastSlash = okio.internal.Path.access$getIndexOfLastSlash(this);
        return access$getIndexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), access$getIndexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    @NotNull
    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    @Nullable
    public final Path parent() {
        Path path;
        if (p0.a.g(getBytes$okio(), okio.internal.Path.access$getDOT$p()) || p0.a.g(getBytes$okio(), okio.internal.Path.access$getSLASH$p()) || p0.a.g(getBytes$okio(), okio.internal.Path.access$getBACKSLASH$p()) || okio.internal.Path.access$lastSegmentIsDotDot(this)) {
            return null;
        }
        int access$getIndexOfLastSlash = okio.internal.Path.access$getIndexOfLastSlash(this);
        if (access$getIndexOfLastSlash != 2 || volumeLetter() == null) {
            if (access$getIndexOfLastSlash == 1 && getBytes$okio().startsWith(okio.internal.Path.access$getBACKSLASH$p())) {
                return null;
            }
            if (access$getIndexOfLastSlash != -1 || volumeLetter() == null) {
                if (access$getIndexOfLastSlash == -1) {
                    return new Path(okio.internal.Path.access$getDOT$p());
                }
                if (access$getIndexOfLastSlash != 0) {
                    return new Path(ByteString.substring$default(getBytes$okio(), 0, access$getIndexOfLastSlash, 1, null));
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null));
            } else {
                if (getBytes$okio().size() == 2) {
                    return null;
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
            }
        } else {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            path = new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        return path;
    }

    @NotNull
    public final Path relativeTo(@NotNull Path path) {
        p0.a.s(path, "other");
        if (!p0.a.g(getRoot(), path.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = path.getSegmentsBytes();
        int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i2 = 0;
        while (i2 < min && p0.a.g(segmentsBytes.get(i2), segmentsBytes2.get(i2))) {
            i2++;
        }
        if (i2 == min && getBytes$okio().size() == path.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i2, segmentsBytes2.size()).indexOf(okio.internal.Path.access$getDOT_DOT$p()) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path).toString());
        }
        Buffer buffer = new Buffer();
        ByteString access$getSlash = okio.internal.Path.access$getSlash(path);
        if (access$getSlash == null && (access$getSlash = okio.internal.Path.access$getSlash(this)) == null) {
            access$getSlash = okio.internal.Path.access$toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i3 = i2; i3 < size; i3++) {
            buffer.write(okio.internal.Path.access$getDOT_DOT$p());
            buffer.write(access$getSlash);
        }
        int size2 = segmentsBytes.size();
        while (i2 < size2) {
            buffer.write(segmentsBytes.get(i2));
            buffer.write(access$getSlash);
            i2++;
        }
        return okio.internal.Path.toPath(buffer, false);
    }

    @NotNull
    public final Path resolve(@NotNull Path path) {
        p0.a.s(path, "child");
        return okio.internal.Path.commonResolve(this, path, false);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        p0.a.r(path, "get(...)");
        return path;
    }

    @NotNull
    public String toString() {
        return getBytes$okio().utf8();
    }

    @Nullable
    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), okio.internal.Path.access$getSLASH$p(), 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c2 = (char) getBytes$okio().getByte(0);
        if (('a' > c2 || c2 >= '{') && ('A' > c2 || c2 >= '[')) {
            return null;
        }
        return Character.valueOf(c2);
    }

    @NotNull
    public static final Path get(@NotNull File file, boolean z2) {
        return Companion.get(file, z2);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return path.resolve(byteString, z2);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Path path) {
        p0.a.s(path, "other");
        return getBytes$okio().compareTo(path.getBytes$okio());
    }

    @NotNull
    public final Path resolve(@NotNull Path path, boolean z2) {
        p0.a.s(path, "child");
        return okio.internal.Path.commonResolve(this, path, z2);
    }

    @NotNull
    public static final Path get(@NotNull String str) {
        return Companion.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return path.resolve(path2, z2);
    }

    @NotNull
    public final Path resolve(@NotNull String str) {
        p0.a.s(str, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), false);
    }

    @NotNull
    public static final Path get(@NotNull String str, boolean z2) {
        return Companion.get(str, z2);
    }

    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path) {
        return Companion.get(path);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString byteString) {
        p0.a.s(byteString, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(byteString), false), false);
    }

    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path, boolean z2) {
        return Companion.get(path, z2);
    }

    @NotNull
    public final Path resolve(@NotNull String str, boolean z2) {
        p0.a.s(str, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), z2);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString byteString, boolean z2) {
        p0.a.s(byteString, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(byteString), false), z2);
    }
}
