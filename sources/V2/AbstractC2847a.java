package v2;

import G7.j;
import K.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.Log;
import android.util.TypedValue;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2847a {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f23602a = {0.0f, -1.0f, 1.0f, 0.0f};

    public static final void a(String str, String str2) {
        int i9 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            Log.e(str, str2 + ": glError " + glGetError);
            i9 = glGetError;
        }
        if (i9 == 0) {
            return;
        }
        throw new RuntimeException(str2 + ": glError " + i9);
    }

    public static Bitmap b(Context context, int i9, String str) {
        j.e(str, MimeTypes.BASE_TYPE_TEXT);
        Paint paint = new Paint(1);
        paint.setTextSize(TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()));
        paint.getTextBounds(str, 0, str.length(), new Rect());
        Bitmap createBitmap = Bitmap.createBitmap(((int) Math.abs(r1.right - r1.left)) + 100, ((int) Math.abs(r1.top - r1.bottom)) + 50, Bitmap.Config.ARGB_8888);
        j.d(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(-1);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        paint.setColor(i9);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(rectF, 50.0f, 50.0f, paint);
        paint.setTypeface(o.a(context, R.font.poppins_medium));
        paint.setColor(-256);
        canvas.drawText(str, 50.0f, r1 + 25, paint);
        return createBitmap;
    }

    public static final int c(Context context, String str, String str2, int i9) {
        String str3;
        j.e(context, "context");
        int glCreateShader = GLES20.glCreateShader(i9);
        try {
            str3 = e(context, str2);
        } catch (IOException e4) {
            e4.printStackTrace();
            str3 = null;
        }
        GLES20.glShaderSource(glCreateShader, str3);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e(str, "Error compiling shader: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        if (glCreateShader != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    public static final float[] d(float[] fArr) {
        float f9 = fArr[0];
        float f10 = fArr[1];
        float sqrt = (float) (f9 / Math.sqrt((f10 * f10) + (f9 * f9)));
        float f11 = fArr[1];
        float f12 = fArr[0];
        return new float[]{sqrt, (float) (f11 / Math.sqrt((f11 * f11) + (f12 * f12)))};
    }

    public static String e(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    } else {
                        String sb2 = sb.toString();
                        j.d(sb2, "toString(...)");
                        android.support.v4.media.session.a.f(bufferedReader, null);
                        android.support.v4.media.session.a.f(open, null);
                        return sb2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                android.support.v4.media.session.a.f(open, th);
                throw th2;
            }
        }
    }

    public static final float[] f(float[] fArr) {
        float f9 = fArr[0];
        float[] fArr2 = f23602a;
        float f10 = fArr2[0] * f9;
        float f11 = fArr[1];
        return new float[]{(fArr2[1] * f11) + f10, (f11 * fArr2[3]) + (f9 * fArr2[2])};
    }
}
