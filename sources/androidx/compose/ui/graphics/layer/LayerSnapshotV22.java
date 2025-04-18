package androidx.compose.ui.graphics.layer;

import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final LayerSnapshotV22 f15242a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.ui.graphics.layer.GraphicsLayer r9, h0.g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = (androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1) r0
            int r1 = r0.f15246f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15246f = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f15245c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f15246f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            android.media.ImageReader r9 = r0.f15243a
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L2a
            goto La3
        L2a:
            r10 = move-exception
            goto Lbb
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.jvm.internal.q.m(r10)
            long r4 = r9.f15171t
            android.os.Looper r10 = android.os.Looper.myLooper()
            if (r10 != 0) goto L44
            android.os.Looper r10 = android.os.Looper.getMainLooper()
        L44:
            r2 = 32
            long r6 = r4 >> r2
            int r2 = (int) r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r2, r4, r3, r3)
            r0.getClass()     // Catch: java.lang.Throwable -> Laf
            r0.getClass()     // Catch: java.lang.Throwable -> Laf
            r0.f15243a = r2     // Catch: java.lang.Throwable -> Laf
            r0.getClass()     // Catch: java.lang.Throwable -> Laf
            r0.f15244b = r0     // Catch: java.lang.Throwable -> Laf
            r0.f15246f = r3     // Catch: java.lang.Throwable -> Laf
            b1.l r4 = new b1.l     // Catch: java.lang.Throwable -> Laf
            h0.g r0 = b1.f0.r(r0)     // Catch: java.lang.Throwable -> Laf
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> Laf
            r4.p()     // Catch: java.lang.Throwable -> Laf
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1 r0 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1     // Catch: java.lang.Throwable -> Laf
            r0.<init>()     // Catch: java.lang.Throwable -> Laf
            android.os.Handler r10 = androidx.core.os.HandlerCompat.a(r10)     // Catch: java.lang.Throwable -> Laf
            r2.setOnImageAvailableListener(r0, r10)     // Catch: java.lang.Throwable -> Laf
            android.view.Surface r10 = r2.getSurface()     // Catch: java.lang.Throwable -> Laf
            androidx.compose.ui.graphics.layer.SurfaceVerificationHelper r0 = androidx.compose.ui.graphics.layer.SurfaceVerificationHelper.f15254a     // Catch: java.lang.Throwable -> Lb9
            android.graphics.Canvas r0 = r0.a(r10)     // Catch: java.lang.Throwable -> Lb9
            long r5 = androidx.compose.ui.graphics.Color.f14957b     // Catch: java.lang.Throwable -> Lb2
            int r3 = androidx.compose.ui.graphics.ColorKt.j(r5)     // Catch: java.lang.Throwable -> Lb2
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> Lb2
            r0.drawColor(r3, r5)     // Catch: java.lang.Throwable -> Lb2
            androidx.compose.ui.graphics.AndroidCanvas r3 = androidx.compose.ui.graphics.AndroidCanvas_androidKt.a(r0)     // Catch: java.lang.Throwable -> Lb2
            r5 = 0
            r9.c(r3, r5)     // Catch: java.lang.Throwable -> Lb2
            r10.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r10 = r4.o()     // Catch: java.lang.Throwable -> Laf
            if (r10 != r1) goto La2
            return r1
        La2:
            r9 = r2
        La3:
            android.media.Image r10 = (android.media.Image) r10     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r10 = androidx.compose.ui.graphics.layer.LayerSnapshot_androidKt.a(r10)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto Lae
            r9.close()
        Lae:
            return r10
        Laf:
            r10 = move-exception
        Lb0:
            r9 = r2
            goto Lbb
        Lb2:
            r9 = move-exception
            r10.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> Laf
            throw r9     // Catch: java.lang.Throwable -> Laf
        Lb7:
            r10 = r9
            goto Lb0
        Lb9:
            r9 = move-exception
            goto Lb7
        Lbb:
            throw r10     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            if (r9 == 0) goto Lc7
            r9.close()     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc3:
            r9 = move-exception
            kotlin.jvm.internal.q.a(r10, r9)
        Lc7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.LayerSnapshotV22.a(androidx.compose.ui.graphics.layer.GraphicsLayer, h0.g):java.lang.Object");
    }
}
