package kotlin.io.path;

import com.mbridge.msdk.MBridgeConstans;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0007j\u0002`\bJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "limit", "", "(I)V", "collectedExceptions", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedExceptions", "()Ljava/util/List;", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "setPath", "(Ljava/nio/file/Path;)V", "<set-?>", "totalExceptions", "getTotalExceptions", "()I", "collect", "", "exception", "enterEntry", "name", "exitEntry", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExceptionsCollector {
    private final List<Exception> collectedExceptions;
    private final int limit;
    private Path path;
    private int totalExceptions;

    public ExceptionsCollector() {
        this(0, 1, null);
    }

    public final void collect(Exception exception) {
        Throwable initCause;
        Intrinsics.checkNotNullParameter(exception, "exception");
        boolean z10 = true;
        this.totalExceptions++;
        if (this.collectedExceptions.size() >= this.limit) {
            z10 = false;
        }
        if (z10) {
            if (this.path != null) {
                a.t();
                initCause = a.f(String.valueOf(this.path)).initCause(exception);
                Intrinsics.checkNotNull(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = d2.a.o(initCause);
            }
            this.collectedExceptions.add(exception);
        }
    }

    public final void enterEntry(Path name) {
        Path path;
        Intrinsics.checkNotNullParameter(name, "name");
        Path path2 = this.path;
        if (path2 != null) {
            path = path2.resolve(name);
        } else {
            path = null;
        }
        this.path = path;
    }

    public final void exitEntry(Path name) {
        Path path;
        Intrinsics.checkNotNullParameter(name, "name");
        Path path2 = this.path;
        Path path3 = null;
        if (path2 != null) {
            path = path2.getFileName();
        } else {
            path = null;
        }
        if (Intrinsics.areEqual(name, path)) {
            Path path4 = this.path;
            if (path4 != null) {
                path3 = path4.getParent();
            }
            this.path = path3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final List<Exception> getCollectedExceptions() {
        return this.collectedExceptions;
    }

    public final Path getPath() {
        return this.path;
    }

    public final int getTotalExceptions() {
        return this.totalExceptions;
    }

    public final void setPath(Path path) {
        this.path = path;
    }

    public ExceptionsCollector(int i10) {
        this.limit = i10;
        this.collectedExceptions = new ArrayList();
    }

    public /* synthetic */ ExceptionsCollector(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 64 : i10);
    }
}
