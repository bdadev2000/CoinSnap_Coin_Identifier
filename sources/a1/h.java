package a1;

import java.util.concurrent.atomic.AtomicBoolean;
import ki.b0;
import ki.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import y0.i1;
import y0.l1;

/* loaded from: classes.dex */
public final class h implements l1 {
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f35b;

    /* renamed from: c, reason: collision with root package name */
    public final c f36c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f37d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f38e;

    /* renamed from: f, reason: collision with root package name */
    public final f.a f39f;

    /* renamed from: g, reason: collision with root package name */
    public final Mutex f40g;

    public h(o fileSystem, b0 path, c serializer, i1 coordinator, d onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.a = fileSystem;
        this.f35b = path;
        this.f36c = serializer;
        this.f37d = coordinator;
        this.f38e = onClose;
        this.f39f = new f.a();
        this.f40g = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|14|15|16|(2:(1:19)|20)(1:22)))|7|(0)(0)|14|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:22:0x0083, B:31:0x008f, B:28:0x0092, B:27:0x008a), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v10, types: [a1.h] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v0, types: [y0.m1] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(y0.m1 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a1.f
            if (r0 == 0) goto L13
            r0 = r11
            a1.f r0 = (a1.f) r0
            int r1 = r0.f27h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27h = r1
            goto L18
        L13:
            a1.f r0 = new a1.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f25f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r10 = r0.f24d
            a1.b r1 = r0.f23c
            a1.h r0 = r0.f22b
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L30
            goto L73
        L30:
            r11 = move-exception
            goto L8a
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.ResultKt.throwOnFailure(r11)
            f.a r11 = r9.f39f
            java.lang.Object r11 = r11.f17509c
            java.util.concurrent.atomic.AtomicBoolean r11 = (java.util.concurrent.atomic.AtomicBoolean) r11
            boolean r11 = r11.get()
            r11 = r11 ^ r3
            if (r11 == 0) goto La2
            kotlinx.coroutines.sync.Mutex r11 = r9.f40g
            boolean r11 = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(r11, r4, r3, r4)
            a1.b r2 = new a1.b     // Catch: java.lang.Throwable -> L98
            ki.o r5 = r9.a     // Catch: java.lang.Throwable -> L98
            ki.b0 r6 = r9.f35b     // Catch: java.lang.Throwable -> L98
            a1.c r7 = r9.f36c     // Catch: java.lang.Throwable -> L98
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r11)     // Catch: java.lang.Throwable -> L84
            r0.f22b = r9     // Catch: java.lang.Throwable -> L84
            r0.f23c = r2     // Catch: java.lang.Throwable -> L84
            r0.f24d = r11     // Catch: java.lang.Throwable -> L84
            r0.f27h = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r10.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L84
            if (r10 != r1) goto L6e
            return r1
        L6e:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L73:
            r1.close()     // Catch: java.lang.Throwable -> L78
            r1 = r4
            goto L79
        L78:
            r1 = move-exception
        L79:
            if (r1 != 0) goto L83
            if (r10 == 0) goto L82
            kotlinx.coroutines.sync.Mutex r10 = r0.f40g
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r10, r4, r3, r4)
        L82:
            return r11
        L83:
            throw r1     // Catch: java.lang.Throwable -> L93
        L84:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L8a:
            r1.close()     // Catch: java.lang.Throwable -> L8e
            goto L92
        L8e:
            r1 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r11, r1)     // Catch: java.lang.Throwable -> L93
        L92:
            throw r11     // Catch: java.lang.Throwable -> L93
        L93:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L9a
        L98:
            r10 = move-exception
            r0 = r9
        L9a:
            if (r11 == 0) goto La1
            kotlinx.coroutines.sync.Mutex r11 = r0.f40g
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r11, r4, r3, r4)
        La1:
            throw r10
        La2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "StorageConnection has already been disposed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.a(y0.m1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010a A[Catch: all -> 0x0122, IOException -> 0x0124, TRY_ENTER, TryCatch #1 {all -> 0x0122, blocks: (B:19:0x010a, B:21:0x0112, B:22:0x0119, B:26:0x0121), top: B:17:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121 A[Catch: all -> 0x0122, IOException -> 0x0124, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0122, blocks: (B:19:0x010a, B:21:0x0112, B:22:0x0119, B:26:0x0121), top: B:17:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v17, types: [y0.a] */
    /* JADX WARN: Type inference failed for: r12v32, types: [y0.a] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(y0.t0 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.b(y0.t0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y0.a
    public final void close() {
        ((AtomicBoolean) this.f39f.f17509c).set(true);
        this.f38e.invoke();
    }
}
