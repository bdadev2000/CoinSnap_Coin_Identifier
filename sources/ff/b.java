package ff;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.GLES20;
import df.d;
import df.e;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b extends a {
    static {
        Intrinsics.checkNotNullExpressionValue(e.class.getSimpleName(), "EglSurface::class.java.simpleName");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bf.a eglCore, e eglSurface) {
        super(eglCore, eglSurface);
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
    }

    public final void a(ByteArrayOutputStream stream, Bitmap.CompressFormat format) {
        boolean z10;
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        e eglSurface = this.f17857b;
        bf.a aVar = this.a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        if (Intrinsics.areEqual(aVar.f2429b, new df.b(EGL14.eglGetCurrentContext())) && Intrinsics.areEqual(eglSurface, new e(EGL14.eglGetCurrentSurface(d.f17009h)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = this.f17858c;
            if (i10 < 0) {
                e eglSurface2 = this.f17857b;
                int i11 = d.f17007f;
                Intrinsics.checkNotNullParameter(eglSurface2, "eglSurface");
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(aVar.a.a, eglSurface2.a, i11, iArr, 0);
                i10 = iArr[0];
            }
            int i12 = this.f17859d;
            if (i12 < 0) {
                e eglSurface3 = this.f17857b;
                int i13 = d.f17008g;
                Intrinsics.checkNotNullParameter(eglSurface3, "eglSurface");
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(aVar.a.a, eglSurface3.a, i13, iArr2, 0);
                i12 = iArr2[0];
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i12 * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            GLES20.glReadPixels(0, 0, i10, i12, 6408, 5121, allocateDirect);
            bf.c.b("glReadPixels");
            allocateDirect.rewind();
            Bitmap createBitmap = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            createBitmap.compress(format, 90, stream);
            createBitmap.recycle();
            return;
        }
        throw new RuntimeException("Expected EGL context/surface is not current");
    }
}
