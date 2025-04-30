package u2;

import G7.j;
import K.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import android.util.TypedValue;
import com.mbridge.msdk.MBridgeConstans;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import v2.AbstractC2847a;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2751c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f23083p = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f23084a;
    public int b;

    /* renamed from: e, reason: collision with root package name */
    public FloatBuffer f23087e;

    /* renamed from: f, reason: collision with root package name */
    public int f23088f;

    /* renamed from: j, reason: collision with root package name */
    public int f23092j;

    /* renamed from: k, reason: collision with root package name */
    public int f23093k;
    public FloatBuffer l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public Bitmap f23094n;

    /* renamed from: o, reason: collision with root package name */
    public Bitmap f23095o;

    /* renamed from: c, reason: collision with root package name */
    public float[] f23085c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23086d = new float[16];

    /* renamed from: g, reason: collision with root package name */
    public final float[] f23089g = new float[18];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23090h = {0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: i, reason: collision with root package name */
    public final int[] f23091i = new int[1];

    public static float[] a(C2751c c2751c, float[] fArr, float[] fArr2) {
        c2751c.getClass();
        float f9 = 2;
        float[] fArr3 = {(fArr[0] + fArr2[0]) / f9, (fArr[1] + fArr2[1]) / f9, (fArr[2] + fArr2[2]) / f9};
        float f10 = (-fArr[1]) + fArr2[1];
        float f11 = fArr[0] - fArr2[0];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        fArr3[0] = fArr3[0] + ((f10 / sqrt) * 0.004f);
        fArr3[1] = fArr3[1] + ((f11 / sqrt) * 0.004f);
        return fArr3;
    }

    public static float[] b(float[] fArr, float f9, float[] fArr2) {
        float[] fArr3 = {fArr[0] + f9, fArr[1] + f9, fArr[2], 1.0f};
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, fArr3, 0);
        float f10 = (float) ((-0.1d) / fArr3[2]);
        fArr3[0] = fArr3[0] * f10;
        fArr3[1] = fArr3[1] * f10;
        fArr3[2] = -0.1f;
        fArr3[3] = 1.0f;
        return fArr3;
    }

    public static float[] c(float[] fArr, float[] fArr2) {
        float[] fArr3 = {fArr[0], fArr[1], fArr[2], 1.0f};
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, fArr3, 0);
        float f9 = (float) ((-0.1d) / fArr3[2]);
        fArr3[0] = fArr3[0] * f9;
        fArr3[1] = fArr3[1] * f9;
        fArr3[2] = -0.1f;
        fArr3[3] = 1.0f;
        return fArr3;
    }

    public static boolean e(float[] fArr, float[] fArr2) {
        float f9 = fArr2[0] - fArr[0];
        float f10 = fArr2[1] - fArr[1];
        if ((f10 * f10) + (f9 * f9) > 2.5E-5f) {
            return false;
        }
        return true;
    }

    public static void g(C2751c c2751c, float[] fArr, float[] fArr2, float[] fArr3) {
        c2751c.getClass();
        float f9 = fArr[0] - fArr2[0];
        float f10 = fArr[1] - fArr2[1];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        float f11 = (f9 / sqrt) * 0.008f;
        float f12 = (f10 / sqrt) * 0.008f;
        Log.i(com.mbridge.msdk.foundation.controller.a.f15376a.concat(MBridgeConstans.API_REUQEST_CATEGORY_APP), "translateScaledVector: scaledVector.vx : " + f11 + ", scaledVector.vy : " + f12);
        fArr3[0] = fArr3[0] + f11;
        fArr3[1] = fArr3[1] + f12;
    }

    public final void d(Context context) {
        float f9;
        float f10;
        int c9 = AbstractC2847a.c(context, com.mbridge.msdk.foundation.controller.a.f15376a, "shaders/point_circle.vert", 35633);
        int c10 = AbstractC2847a.c(context, com.mbridge.msdk.foundation.controller.a.f15376a, "shaders/point_circle.frag", 35632);
        int glCreateProgram = GLES20.glCreateProgram();
        this.f23084a = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, c9);
        GLES20.glAttachShader(this.f23084a, c10);
        GLES20.glLinkProgram(this.f23084a);
        GLES20.glUseProgram(this.f23084a);
        AbstractC2847a.a(com.mbridge.msdk.foundation.controller.a.f15376a, "Program creation");
        this.b = GLES20.glGetAttribLocation(this.f23084a, "a_Position");
        this.f23088f = GLES20.glGetUniformLocation(this.f23084a, "mvpMatrix");
        this.f23093k = GLES20.glGetAttribLocation(this.f23084a, "a_TexCoord");
        this.f23092j = GLES20.glGetAttribLocation(this.f23084a, "u_TextureUnit");
        GLES20.glDeleteShader(c9);
        GLES20.glDeleteShader(c10);
        AbstractC2847a.a(com.mbridge.msdk.foundation.controller.a.f15376a, "loadShader Error");
        int[] iArr = this.f23091i;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glUniform1i(this.f23092j, 0);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        AbstractC2847a.a(com.mbridge.msdk.foundation.controller.a.f15376a, "createTexture Error");
        Matrix.setIdentityM(this.f23085c, 0);
        int i9 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i10 = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (i9 > i10) {
            f9 = i9;
            f10 = i10;
        } else {
            f9 = i10;
            f10 = i9;
        }
        float f11 = f9 / f10;
        if (i9 > i10) {
            Matrix.orthoM(this.f23086d, 0, -f11, f11, -1.0f, 1.0f, -1.0f, 1.0f);
        } else {
            Matrix.orthoM(this.f23086d, 0, -1.0f, 1.0f, -f11, f11, -1.0f, 1.0f);
        }
    }

    public final void f() {
        GLES20.glUseProgram(this.f23084a);
        GLES20.glUniformMatrix4fv(this.f23088f, 1, false, this.f23085c, 0);
        GLES20.glVertexAttribPointer(this.b, 3, 5126, false, 0, (Buffer) this.f23087e);
        GLES20.glVertexAttribPointer(this.f23093k, 2, 5126, false, 0, (Buffer) this.l);
        GLES20.glEnableVertexAttribArray(this.f23093k);
        GLES20.glEnableVertexAttribArray(this.b);
        GLES20.glEnable(3042);
        GLES20.glDepthMask(false);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDrawArrays(4, 0, 6);
        GLES20.glDisableVertexAttribArray(this.b);
        GLES20.glDisableVertexAttribArray(this.f23093k);
        GLES20.glDisable(3042);
    }

    public final void h(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, String str, Context context, float f9, boolean z8, boolean z9) {
        Bitmap createScaledBitmap;
        j.e(fArr4, "projectionMatrix");
        j.e(str, "lineLength");
        this.m = (int) 4283123522L;
        float[] c9 = c(fArr, fArr3);
        float[] c10 = c(fArr2, fArr3);
        float[] a6 = a(this, c10, c9);
        if (z9) {
            g(this, c10, c9, a6);
            Log.i(com.mbridge.msdk.foundation.controller.a.f15376a.concat(MBridgeConstans.API_REUQEST_CATEGORY_APP), "upData: deletePoint : " + a6[0] + "," + a6[1] + "," + a6[2]);
        }
        if (z8 || (createScaledBitmap = this.f23094n) == null) {
            Bitmap bitmap = this.f23094n;
            if (bitmap == null) {
                createScaledBitmap = AbstractC2847a.b(context, this.m, str);
            } else {
                Paint paint = new Paint(1);
                paint.setTextSize(TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()));
                paint.getTextBounds(str, 0, str.length(), new Rect());
                createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ((int) Math.abs(r12.right - r12.left)) + 100, ((int) Math.abs(r12.top - r12.bottom)) + 50, false);
                j.d(createScaledBitmap, "createScaledBitmap(...)");
                Canvas canvas = new Canvas(createScaledBitmap);
                paint.setTypeface(o.a(context, R.font.poppins_medium));
                paint.setColor(-256);
                canvas.drawText(str, 50.0f, r12 + 25, paint);
            }
        }
        float[] fArr5 = {c10[0] - c9[0], c10[1] - c9[1]};
        float[] fArr6 = {fArr5[0], fArr5[1]};
        float[] d2 = AbstractC2847a.d(AbstractC2847a.f(fArr6));
        float[] d9 = AbstractC2847a.d(fArr6);
        float f10 = d2[0];
        float f11 = d2[1];
        d2[0] = (float) (f10 / Math.sqrt((f11 * f11) + (f10 * f10)));
        float sqrt = (float) (d2[1] / Math.sqrt((r8 * r8) + (r7 * r7)));
        d2[1] = sqrt;
        Log.i(com.mbridge.msdk.foundation.controller.a.f15376a, "upData: vector2Y: " + d2[0] + "," + sqrt + " ");
        float f12 = (float) 2;
        float f13 = (f9 * 0.005f) / f12;
        float f14 = d9[0] * f13;
        float f15 = f13 * d9[1];
        float f16 = 0.005f / f12;
        float f17 = d2[0] * f16;
        float f18 = f16 * d2[1];
        float f19 = (a6[0] - f14) - f17;
        float[] fArr7 = this.f23089g;
        fArr7[0] = f19;
        fArr7[1] = (a6[1] - f15) - f18;
        fArr7[2] = a6[2];
        float f20 = a6[0];
        float f21 = f20 + f14;
        fArr7[3] = f21 - f17;
        float f22 = a6[1];
        float f23 = f22 + f15;
        fArr7[4] = f23 - f18;
        float f24 = a6[2];
        fArr7[5] = f24;
        float f25 = f21 + f17;
        fArr7[6] = f25;
        float f26 = f23 + f18;
        fArr7[7] = f26;
        fArr7[8] = f24;
        float f27 = f20 - f14;
        fArr7[9] = f27 - f17;
        float f28 = f22 - f15;
        fArr7[10] = f28 - f18;
        fArr7[11] = f24;
        fArr7[12] = f25;
        fArr7[13] = f26;
        fArr7[14] = f24;
        float f29 = f27 + f17;
        fArr7[15] = f29;
        float f30 = f28 + f18;
        fArr7[16] = f30;
        fArr7[17] = f24;
        float[] fArr8 = this.f23090h;
        if (f25 > f29) {
            fArr8[0] = 0.0f;
            fArr8[1] = 1.0f;
            fArr8[2] = 1.0f;
            fArr8[3] = 1.0f;
            fArr8[4] = 1.0f;
            fArr8[5] = 0.0f;
            fArr8[6] = 0.0f;
            fArr8[7] = 1.0f;
            fArr8[8] = 1.0f;
            fArr8[9] = 0.0f;
            fArr8[10] = 0.0f;
            fArr8[11] = 0.0f;
        } else {
            fArr8[0] = 1.0f;
            fArr8[1] = 0.0f;
            fArr8[2] = 0.0f;
            fArr8[3] = 0.0f;
            fArr8[4] = 0.0f;
            fArr8[5] = 1.0f;
            fArr8[6] = 1.0f;
            fArr8[7] = 0.0f;
            fArr8[8] = 0.0f;
            fArr8[9] = 1.0f;
            fArr8[10] = 1.0f;
            fArr8[11] = 1.0f;
        }
        this.f23085c = fArr4;
        float f31 = fArr7[6] - f29;
        float f32 = fArr7[7] - f30;
        float f33 = fArr7[8];
        Log.i("TAG1", "upData: danwei distance " + Math.sqrt((f32 * f32) + (f31 * f31)));
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr7.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f23087e = asFloatBuffer;
        j.b(asFloatBuffer);
        asFloatBuffer.put(fArr7);
        FloatBuffer floatBuffer = this.f23087e;
        j.b(floatBuffer);
        floatBuffer.position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f23091i[0]);
        GLUtils.texImage2D(3553, 0, createScaledBitmap, 0);
        GLES20.glGenerateMipmap(3553);
        if (this.f23094n == null) {
            createScaledBitmap.recycle();
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr8.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.l = asFloatBuffer2;
        j.b(asFloatBuffer2);
        asFloatBuffer2.put(fArr8);
        FloatBuffer floatBuffer2 = this.l;
        j.b(floatBuffer2);
        floatBuffer2.position(0);
    }
}
