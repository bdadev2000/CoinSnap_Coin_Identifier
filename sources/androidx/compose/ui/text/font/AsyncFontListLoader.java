package androidx.compose.ui.text.font;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AsyncFontListLoader implements State<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final List f17191a;

    /* renamed from: b, reason: collision with root package name */
    public final TypefaceRequest f17192b;

    /* renamed from: c, reason: collision with root package name */
    public final AsyncTypefaceCache f17193c;
    public final l d;

    /* renamed from: f, reason: collision with root package name */
    public final PlatformFontLoader f17194f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17195g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17196h;

    public AsyncFontListLoader(List list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, l lVar, PlatformFontLoader platformFontLoader) {
        ParcelableSnapshotMutableState f2;
        this.f17191a = list;
        this.f17192b = typefaceRequest;
        this.f17193c = asyncTypefaceCache;
        this.d = lVar;
        this.f17194f = platformFontLoader;
        f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f17195g = f2;
        this.f17196h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003e, blocks: (B:12:0x0038, B:31:0x00b3, B:33:0x00c1, B:37:0x00dd), top: B:11:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003e, blocks: (B:12:0x0038, B:31:0x00b3, B:33:0x00c1, B:37:0x00dd), top: B:11:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:14:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00fe -> B:15:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h0.g r19) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.a(h0.g):java.lang.Object");
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return this.f17195g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(androidx.compose.ui.text.font.Font r7, h0.g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f17208b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.text.font.Font r7 = r0.f17207a
            kotlin.jvm.internal.q.m(r8)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L4b
        L2a:
            r8 = move-exception
            goto L4d
        L2c:
            r7 = move-exception
            goto L76
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.jvm.internal.q.m(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f17207a = r7     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = p0.a.I0(r2, r8, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r4 = r8
            goto L80
        L4d:
            h0.l r1 = r0.getContext()
            b1.a0 r2 = b1.a0.f22284a
            h0.j r1 = r1.i(r2)
            b1.b0 r1 = (b1.b0) r1
            if (r1 == 0) goto L80
            h0.l r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.F(r0, r2)
            goto L80
        L76:
            h0.l r8 = r0.getContext()
            boolean r8 = kotlin.jvm.internal.e.p(r8)
            if (r8 == 0) goto L81
        L80:
            return r4
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.p(androidx.compose.ui.text.font.Font, h0.g):java.lang.Object");
    }
}
