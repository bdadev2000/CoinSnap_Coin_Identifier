package okio;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class ForwardingFileSystem$listRecursively$1 extends r implements l {
    final /* synthetic */ ForwardingFileSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardingFileSystem$listRecursively$1(ForwardingFileSystem forwardingFileSystem) {
        super(1);
        this.this$0 = forwardingFileSystem;
    }

    @Override // q0.l
    @NotNull
    public final Path invoke(@NotNull Path path) {
        p0.a.s(path, "it");
        return this.this$0.onPathResult(path, "listRecursively");
    }
}
