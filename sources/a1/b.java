package a1;

import java.util.concurrent.atomic.AtomicBoolean;
import ki.b0;
import ki.o;
import kotlin.jvm.internal.Intrinsics;
import y0.z0;

/* loaded from: classes.dex */
public class b implements z0 {
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f11b;

    /* renamed from: c, reason: collision with root package name */
    public final c f12c;

    /* renamed from: d, reason: collision with root package name */
    public final f.a f13d;

    public b(o fileSystem, b0 path, c serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.a = fileSystem;
        this.f11b = path;
        this.f12c = serializer;
        this.f13d = new f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: FileNotFoundException -> 0x008f, TRY_ENTER, TryCatch #1 {FileNotFoundException -> 0x008f, blocks: (B:15:0x008a, B:18:0x008e, B:47:0x0048), top: B:46:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[Catch: FileNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #1 {FileNotFoundException -> 0x008f, blocks: (B:15:0x008a, B:18:0x008e, B:47:0x0048), top: B:46:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(a1.b r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.a(a1.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y0.a
    public final void close() {
        ((AtomicBoolean) this.f13d.f17509c).set(true);
    }
}
