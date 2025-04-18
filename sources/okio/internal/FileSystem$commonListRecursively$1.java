package okio.internal;

import d0.b0;
import e0.n;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;
import y0.l;

@e(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
/* renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class FileSystem$commonListRecursively$1 extends h implements p {
    final /* synthetic */ Path $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ FileSystem $this_commonListRecursively;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(Path path, FileSystem fileSystem, boolean z2, g gVar) {
        super(gVar);
        this.$dir = path;
        this.$this_commonListRecursively = fileSystem;
        this.$followSymlinks = z2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new FileSystem$commonListRecursively$1(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, gVar);
        fileSystem$commonListRecursively$1.L$0 = obj;
        return fileSystem$commonListRecursively$1;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1;
        l lVar;
        n nVar;
        Iterator<Path> it;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            l lVar2 = (l) this.L$0;
            n nVar2 = new n();
            nVar2.addLast(this.$dir);
            fileSystem$commonListRecursively$1 = this;
            lVar = lVar2;
            nVar = nVar2;
            it = this.$this_commonListRecursively.list(this.$dir).iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            n nVar3 = (n) this.L$1;
            l lVar3 = (l) this.L$0;
            q.m(obj);
            fileSystem$commonListRecursively$1 = this;
            nVar = nVar3;
            lVar = lVar3;
        }
        while (it.hasNext()) {
            Path next = it.next();
            FileSystem fileSystem = fileSystem$commonListRecursively$1.$this_commonListRecursively;
            boolean z2 = fileSystem$commonListRecursively$1.$followSymlinks;
            fileSystem$commonListRecursively$1.L$0 = lVar;
            fileSystem$commonListRecursively$1.L$1 = nVar;
            fileSystem$commonListRecursively$1.L$2 = it;
            fileSystem$commonListRecursively$1.label = 1;
            if (FileSystem.collectRecursively(lVar, fileSystem, nVar, next, z2, false, fileSystem$commonListRecursively$1) == aVar) {
                return aVar;
            }
        }
        return b0.f30125a;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull l lVar, @Nullable g gVar) {
        return ((FileSystem$commonListRecursively$1) create(lVar, gVar)).invokeSuspend(b0.f30125a);
    }
}
