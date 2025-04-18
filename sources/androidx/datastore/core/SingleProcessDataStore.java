package androidx.datastore.core;

import androidx.datastore.preferences.core.PreferencesSerializer;
import b1.d0;
import b1.f0;
import b1.r;
import b1.s;
import d0.p;
import e0.u;
import e1.h;
import e1.i1;
import e1.j;
import e1.t0;
import h0.g;
import h0.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import q0.a;

/* loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashSet f18979k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f18980l = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final a f18981a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializer f18982b;

    /* renamed from: c, reason: collision with root package name */
    public final CorruptionHandler f18983c;
    public final d0 d;
    public final j e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18984f;

    /* renamed from: g, reason: collision with root package name */
    public final p f18985g;

    /* renamed from: h, reason: collision with root package name */
    public final i1 f18986h;

    /* renamed from: i, reason: collision with root package name */
    public List f18987i;

    /* renamed from: j, reason: collision with root package name */
    public final SimpleActor f18988j;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static abstract class Message<T> {

        /* loaded from: classes.dex */
        public static final class Read<T> extends Message<T> {

            /* renamed from: a, reason: collision with root package name */
            public final State f18994a;

            public Read(State state) {
                this.f18994a = state;
            }
        }

        /* loaded from: classes.dex */
        public static final class Update<T> extends Message<T> {

            /* renamed from: a, reason: collision with root package name */
            public final q0.p f18995a;

            /* renamed from: b, reason: collision with root package name */
            public final r f18996b;

            /* renamed from: c, reason: collision with root package name */
            public final State f18997c;
            public final l d;

            public Update(q0.p pVar, s sVar, State state, l lVar) {
                p0.a.s(lVar, "callerContext");
                this.f18995a = pVar;
                this.f18996b = sVar;
                this.f18997c = state;
                this.d = lVar;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class UncloseableOutputStream extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final FileOutputStream f18998a;

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            this.f18998a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f18998a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
            this.f18998a.write(i2);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            p0.a.s(bArr, "b");
            this.f18998a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            p0.a.s(bArr, "bytes");
            this.f18998a.write(bArr, i2, i3);
        }
    }

    public SingleProcessDataStore(a aVar, List list, CorruptionHandler corruptionHandler, d0 d0Var) {
        PreferencesSerializer preferencesSerializer = PreferencesSerializer.f19100a;
        p0.a.s(d0Var, "scope");
        this.f18981a = aVar;
        this.f18982b = preferencesSerializer;
        this.f18983c = corruptionHandler;
        this.d = d0Var;
        this.e = new j(new SingleProcessDataStore$data$1(this, null));
        this.f18984f = ".tmp";
        this.f18985g = f0.t(new SingleProcessDataStore$file$2(this));
        this.f18986h = t0.c(UnInitialized.f19061a);
        this.f18987i = u.Z0(list);
        this.f18988j = new SimpleActor(d0Var, new SingleProcessDataStore$actor$1(this), new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.datastore.core.SingleProcessDataStore r8, androidx.datastore.core.SingleProcessDataStore.Message.Update r9, h0.g r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.b(androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore$Message$Update, h0.g):java.lang.Object");
    }

    @Override // androidx.datastore.core.DataStore
    public final Object a(q0.p pVar, g gVar) {
        s b2 = p0.a.b();
        this.f18988j.a(new Message.Update(pVar, b2, (State) this.f18986h.getValue(), gVar.getContext()));
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    public final File c() {
        return (File) this.f18985g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(h0.g r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.d(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19034b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.datastore.core.SingleProcessDataStore r0 = r0.f19033a
            kotlin.jvm.internal.q.m(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            r0.f19033a = r4     // Catch: java.lang.Throwable -> L44
            r0.d = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            d0.b0 r5 = d0.b0.f30125a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            e1.i1 r0 = r0.f18986h
            androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
            r1.<init>(r5)
            r0.h(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.e(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19037b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.datastore.core.SingleProcessDataStore r0 = r0.f19036a
            kotlin.jvm.internal.q.m(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            r0.f19036a = r4     // Catch: java.lang.Throwable -> L41
            r0.d = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            e1.i1 r0 = r0.f18986h
            androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
            r1.<init>(r5)
            r0.h(r1)
        L4d:
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.f(h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.f19042f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19042f = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19041c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f19042f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f19040b
            androidx.datastore.core.SingleProcessDataStore r0 = r0.f19039a
            kotlin.jvm.internal.q.m(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.jvm.internal.q.m(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            androidx.datastore.core.Serializer r2 = r4.f18982b     // Catch: java.lang.Throwable -> L5e
            r0.f19039a = r4     // Catch: java.lang.Throwable -> L5e
            r0.f19040b = r5     // Catch: java.lang.Throwable -> L5e
            r0.f19042f = r3     // Catch: java.lang.Throwable -> L5e
            androidx.datastore.preferences.core.MutablePreferences r0 = r2.b(r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            kotlin.jvm.internal.q.b(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L68
        L5a:
            r1 = r5
            r5 = r0
            r0 = r4
            goto L60
        L5e:
            r0 = move-exception
            goto L5a
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = move-exception
            kotlin.jvm.internal.q.b(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L79
            androidx.datastore.core.Serializer r5 = r0.f18982b
            androidx.datastore.preferences.core.MutablePreferences r5 = r5.a()
            return r5
        L79:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.g(h0.g):java.lang.Object");
    }

    @Override // androidx.datastore.core.DataStore
    public final h getData() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(h0.g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.f19046f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19046f = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f19045c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f19046f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f19044b
            java.lang.Object r0 = r0.f19043a
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.jvm.internal.q.m(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f19044b
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f19043a
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.jvm.internal.q.m(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f19043a
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.jvm.internal.q.m(r8)     // Catch: androidx.datastore.core.CorruptionException -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            kotlin.jvm.internal.q.m(r8)
            r0.f19043a = r7     // Catch: androidx.datastore.core.CorruptionException -> L62
            r0.f19046f = r5     // Catch: androidx.datastore.core.CorruptionException -> L62
            java.lang.Object r8 = r7.g(r0)     // Catch: androidx.datastore.core.CorruptionException -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            androidx.datastore.core.CorruptionHandler r5 = r2.f18983c
            r0.f19043a = r2
            r0.f19044b = r8
            r0.f19046f = r4
            java.lang.Object r4 = r5.a(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f19043a = r2     // Catch: java.io.IOException -> L86
            r0.f19044b = r8     // Catch: java.io.IOException -> L86
            r0.f19046f = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            kotlin.jvm.internal.q.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.h(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(h0.g r8, h0.l r9, q0.p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.f19051g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19051g = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f19051g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f19048b
            androidx.datastore.core.SingleProcessDataStore r10 = r0.f19047a
            kotlin.jvm.internal.q.m(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.f19049c
            java.lang.Object r10 = r0.f19048b
            androidx.datastore.core.Data r10 = (androidx.datastore.core.Data) r10
            androidx.datastore.core.SingleProcessDataStore r2 = r0.f19047a
            kotlin.jvm.internal.q.m(r8)
            goto L6b
        L43:
            kotlin.jvm.internal.q.m(r8)
            e1.i1 r8 = r7.f18986h
            java.lang.Object r8 = r8.getValue()
            androidx.datastore.core.Data r8 = (androidx.datastore.core.Data) r8
            r8.a()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r2 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            java.lang.Object r6 = r8.f18950a
            r2.<init>(r6, r3, r10)
            r0.f19047a = r7
            r0.f19048b = r8
            r0.f19049c = r6
            r0.f19051g = r5
            java.lang.Object r9 = kotlin.jvm.internal.e.G(r0, r9, r2)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r8
            r8 = r9
            r9 = r6
        L6b:
            r10.a()
            boolean r10 = p0.a.g(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.f19047a = r2
            r0.f19048b = r8
            r0.f19049c = r3
            r0.f19051g = r4
            java.lang.Object r9 = r2.j(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            e1.i1 r8 = r10.f18986h
            androidx.datastore.core.Data r10 = new androidx.datastore.core.Data
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r9, r0)
            r8.h(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.i(h0.g, h0.l, q0.p):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: IOException -> 0x00b8, TryCatch #0 {IOException -> 0x00b8, blocks: (B:15:0x0093, B:19:0x00a1, B:20:0x00b7, B:27:0x00be, B:28:0x00c1, B:38:0x006c, B:24:0x00bc), top: B:7:0x0023, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r9, h0.g r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r1 == 0) goto L15
            r1 = r10
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r1 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r1
            int r2 = r1.f19060h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f19060h = r2
            goto L1a
        L15:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r1 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f19058f
            i0.a r2 = i0.a.f30806a
            int r3 = r1.f19060h
            d0.b0 r4 = d0.b0.f30125a
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 != r5) goto L36
            java.io.FileOutputStream r9 = r1.d
            java.io.FileOutputStream r2 = r1.f19057c
            java.io.File r3 = r1.f19056b
            androidx.datastore.core.SingleProcessDataStore r1 = r1.f19055a
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r9 = move-exception
            goto Lbc
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.jvm.internal.q.m(r10)
            java.io.File r10 = r8.c()
            java.io.File r3 = r10.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L50
            goto L59
        L50:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Lcc
        L59:
            java.io.File r3 = new java.io.File
            java.io.File r10 = r8.c()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r6 = r8.f18984f
            java.lang.String r10 = p0.a.z0(r6, r10)
            r3.<init>(r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb8
            r10.<init>(r3)     // Catch: java.io.IOException -> Lb8
            androidx.datastore.core.Serializer r6 = r8.f18982b     // Catch: java.lang.Throwable -> Lba
            androidx.datastore.core.SingleProcessDataStore$UncloseableOutputStream r7 = new androidx.datastore.core.SingleProcessDataStore$UncloseableOutputStream     // Catch: java.lang.Throwable -> Lba
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lba
            r1.f19055a = r8     // Catch: java.lang.Throwable -> Lba
            r1.f19056b = r3     // Catch: java.lang.Throwable -> Lba
            r1.f19057c = r10     // Catch: java.lang.Throwable -> Lba
            r1.d = r10     // Catch: java.lang.Throwable -> Lba
            r1.f19060h = r5     // Catch: java.lang.Throwable -> Lba
            r6.c(r9, r7)     // Catch: java.lang.Throwable -> Lba
            if (r4 != r2) goto L88
            return r2
        L88:
            r1 = r8
            r9 = r10
            r2 = r9
        L8b:
            java.io.FileDescriptor r9 = r9.getFD()     // Catch: java.lang.Throwable -> L33
            r9.sync()     // Catch: java.lang.Throwable -> L33
            r9 = 0
            kotlin.jvm.internal.q.b(r2, r9)     // Catch: java.io.IOException -> Lb8
            java.io.File r9 = r1.c()     // Catch: java.io.IOException -> Lb8
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lb8
            if (r9 == 0) goto La1
            return r4
        La1:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> Lb8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb8
            r10.<init>(r0)     // Catch: java.io.IOException -> Lb8
            r10.append(r3)     // Catch: java.io.IOException -> Lb8
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r10.append(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lb8
            r9.<init>(r10)     // Catch: java.io.IOException -> Lb8
            throw r9     // Catch: java.io.IOException -> Lb8
        Lb8:
            r9 = move-exception
            goto Lc2
        Lba:
            r9 = move-exception
            r2 = r10
        Lbc:
            throw r9     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r10 = move-exception
            kotlin.jvm.internal.q.b(r2, r9)     // Catch: java.io.IOException -> Lb8
            throw r10     // Catch: java.io.IOException -> Lb8
        Lc2:
            boolean r10 = r3.exists()
            if (r10 == 0) goto Lcb
            r3.delete()
        Lcb:
            throw r9
        Lcc:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r10 = p0.a.z0(r10, r0)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.j(java.lang.Object, h0.g):java.lang.Object");
    }
}
