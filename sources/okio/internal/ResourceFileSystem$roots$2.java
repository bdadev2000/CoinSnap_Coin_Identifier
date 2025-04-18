package okio.internal;

import d0.k;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class ResourceFileSystem$roots$2 extends r implements a {
    final /* synthetic */ ResourceFileSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.this$0 = resourceFileSystem;
    }

    @Override // q0.a
    @NotNull
    public final List<k> invoke() {
        ClassLoader classLoader;
        List<k> classpathRoots;
        ResourceFileSystem resourceFileSystem = this.this$0;
        classLoader = resourceFileSystem.classLoader;
        classpathRoots = resourceFileSystem.toClasspathRoots(classLoader);
        return classpathRoots;
    }
}
