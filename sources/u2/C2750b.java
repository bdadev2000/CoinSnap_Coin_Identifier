package u2;

import G7.j;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.o;
import j6.t;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import v2.AbstractC2847a;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2750b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23075a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f23076c;

    /* renamed from: d, reason: collision with root package name */
    public int f23077d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23078e;

    /* renamed from: f, reason: collision with root package name */
    public Comparable f23079f;

    /* renamed from: g, reason: collision with root package name */
    public int f23080g;

    /* renamed from: h, reason: collision with root package name */
    public Object f23081h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f23082i;

    /* JADX WARN: Type inference failed for: r3v4, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [float[], java.io.Serializable] */
    public C2750b(int i9) {
        this.f23075a = i9;
        switch (i9) {
            case 1:
                this.f23078e = new float[16];
                this.f23081h = new float[]{0.0f, 0.0f, 0.0f};
                this.f23082i = new float[4];
                return;
            default:
                this.f23078e = new float[16];
                this.f23081h = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                this.f23082i = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
                return;
        }
    }

    public void a(int i9) {
        Object obj = this.f23078e;
        switch (this.f23075a) {
            case 0:
                AbstractC2847a.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Before draw");
                float[] fArr = (float[]) this.f23082i;
                if (i9 == 0) {
                    fArr[0] = 1.0f;
                    fArr[1] = 1.0f;
                    fArr[2] = 1.0f;
                } else {
                    fArr[0] = 255.0f;
                    fArr[1] = 165.0f;
                    fArr[2] = 0.0f;
                }
                fArr[3] = 1.0f;
                GLES20.glUseProgram(this.b);
                GLES20.glUniformMatrix4fv(this.f23080g, 1, false, (float[]) obj, 0);
                GLES20.glVertexAttribPointer(this.f23076c, 3, 5126, false, 0, (Buffer) this.f23079f);
                GLES20.glEnableVertexAttribArray(this.f23076c);
                GLES20.glEnable(3042);
                GLES20.glDepthMask(false);
                GLES20.glBlendFunc(770, 771);
                GLES20.glUniform4fv(this.f23077d, 1, fArr, 0);
                GLES20.glLineWidth(10.0f);
                GLES20.glDrawArrays(1, 0, 2);
                GLES20.glDisable(3042);
                return;
            default:
                AbstractC2847a.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Before draw");
                float[] fArr2 = (float[]) this.f23082i;
                if (i9 == 0) {
                    fArr2[0] = 1.0f;
                    fArr2[1] = 1.0f;
                    fArr2[2] = 1.0f;
                    fArr2[3] = 1.0f;
                } else {
                    fArr2[0] = 255.0f;
                    fArr2[1] = 165.0f;
                    fArr2[2] = 0.0f;
                    fArr2[3] = 1.0f;
                }
                GLES20.glUseProgram(this.b);
                GLES20.glUniformMatrix4fv(this.f23080g, 1, false, (float[]) obj, 0);
                GLES20.glVertexAttribPointer(this.f23076c, 3, 5126, false, 0, (Buffer) this.f23079f);
                GLES20.glEnableVertexAttribArray(this.f23076c);
                GLES20.glUniform4fv(this.f23077d, 1, fArr2, 0);
                GLES20.glEnable(3042);
                GLES20.glDepthMask(false);
                GLES20.glBlendFunc(770, 771);
                GLES20.glDrawArrays(0, 0, 1);
                GLES20.glDisable(3042);
                return;
        }
    }

    public void b(float[] fArr, float[] fArr2, float[] fArr3) {
        this.f23081h = fArr;
        Matrix.multiplyMM((float[]) this.f23078e, 0, fArr3, 0, fArr2, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(12);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f23079f = asFloatBuffer;
        j.b(asFloatBuffer);
        asFloatBuffer.put((float[]) this.f23081h);
        FloatBuffer floatBuffer = (FloatBuffer) this.f23079f;
        j.b(floatBuffer);
        floatBuffer.position(0);
    }

    public void c(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        Matrix.multiplyMM((float[]) this.f23078e, 0, fArr2, 0, fArr, 0);
        float f9 = fArr3[0];
        float[] fArr5 = (float[]) this.f23081h;
        fArr5[0] = f9;
        fArr5[1] = fArr3[1];
        fArr5[2] = fArr3[2];
        fArr5[3] = fArr4[0];
        fArr5[4] = fArr4[1];
        fArr5[5] = fArr4[2];
        String arrays = Arrays.toString(fArr5);
        j.d(arrays, "toString(...)");
        Log.i(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "upData: originalPosition ".concat(arrays));
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(24);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f23079f = asFloatBuffer;
        j.b(asFloatBuffer);
        asFloatBuffer.put(fArr5);
        FloatBuffer floatBuffer = (FloatBuffer) this.f23079f;
        j.b(floatBuffer);
        floatBuffer.position(0);
    }

    public C2750b(Context context) {
        this.f23075a = 2;
        this.f23078e = context;
        this.f23082i = t.b;
        float f9 = 28;
        this.b = o.f(1, f9);
        this.f23076c = o.f(1, f9);
        this.f23077d = o.f(1, 8);
        this.f23080g = -1;
        this.f23079f = "";
    }
}
