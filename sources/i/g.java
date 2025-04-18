package i;

import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* loaded from: classes3.dex */
public final class g extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink sink(Path path, boolean z2) {
        Path parent = path.parent();
        if (parent != null) {
            createDirectories(parent);
        }
        return super.sink(path, z2);
    }
}
