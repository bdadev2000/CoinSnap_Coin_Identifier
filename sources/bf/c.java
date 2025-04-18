package bf;

import a4.j;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.util.Log;
import df.d;
import df.f;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {
    public static final float[] a;

    static {
        float[] matrix = new float[16];
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.setIdentityM(matrix, 0);
        a = matrix;
    }

    public static final void a(String opName) {
        Intrinsics.checkNotNullParameter(opName, "opName");
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == d.f17005d) {
            return;
        }
        StringBuilder o10 = j.o("Error during ", opName, ": EGL error 0x");
        String hexString = Integer.toHexString(eglGetError);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        o10.append(hexString);
        String sb2 = o10.toString();
        Log.e("Egloo", sb2);
        throw new RuntimeException(sb2);
    }

    public static final void b(String opName) {
        Intrinsics.checkNotNullParameter(opName, "opName");
        int m240constructorimpl = UInt.m240constructorimpl(GLES20.glGetError());
        int i10 = f.a;
        if (m240constructorimpl == 0) {
            return;
        }
        StringBuilder o10 = j.o("Error during ", opName, ": glError 0x");
        String hexString = Integer.toHexString(m240constructorimpl);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        o10.append(hexString);
        o10.append(": ");
        String gluErrorString = GLU.gluErrorString(m240constructorimpl);
        Intrinsics.checkNotNullExpressionValue(gluErrorString, "gluErrorString(value)");
        o10.append(gluErrorString);
        String sb2 = o10.toString();
        Log.e("Egloo", sb2);
        throw new RuntimeException(sb2);
    }
}
