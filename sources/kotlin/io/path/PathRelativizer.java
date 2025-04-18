package kotlin.io.path;

import com.mbridge.msdk.MBridgeConstans;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath;
    private static final Path parentPath;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        emptyPath = path;
        path2 = Paths.get("..", new String[0]);
        parentPath = path2;
    }

    private PathRelativizer() {
    }

    public final Path tryRelativeTo(Path path, Path base) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        boolean endsWith$default;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        Path name;
        Path name2;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        normalize = base.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i10 = 0; i10 < min; i10++) {
            name = normalize.getName(i10);
            Path path2 = parentPath;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            name2 = normalize2.getName(i10);
            if (!Intrinsics.areEqual(name2, path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(normalize2, normalize) || !Intrinsics.areEqual(normalize, emptyPath)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(obj, separator, false, 2, null);
            if (endsWith$default) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                normalize2 = fileSystem2.getPath(StringsKt.dropLast(obj, separator2.length()), new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        Intrinsics.checkNotNull(normalize2);
        return normalize2;
    }
}
