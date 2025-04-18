package com.bytedance.adsdk.Sg.vc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.Sg.YFl.YFl.wXo;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class vc {
    private static final ThreadLocal<PathMeasure> YFl = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.Sg.vc.vc.1
        @Override // java.lang.ThreadLocal
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> Sg = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.Sg.vc.vc.2
        @Override // java.lang.ThreadLocal
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> tN = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.Sg.vc.vc.3
        @Override // java.lang.ThreadLocal
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> AlY = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.Sg.vc.vc.4
        @Override // java.lang.ThreadLocal
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float wN = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean Sg(Matrix matrix) {
        float[] fArr = AlY.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    public static int YFl(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (f10 * 527.0f) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean YFl(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static Path YFl(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f10 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void YFl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float YFl(Matrix matrix) {
        float[] fArr = AlY.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = wN;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void YFl(Path path, wXo wxo) {
        if (wxo == null || wxo.vc()) {
            return;
        }
        YFl(path, ((com.bytedance.adsdk.Sg.YFl.Sg.AlY) wxo.tN()).NjR() / 100.0f, ((com.bytedance.adsdk.Sg.YFl.Sg.AlY) wxo.AlY()).NjR() / 100.0f, ((com.bytedance.adsdk.Sg.YFl.Sg.AlY) wxo.wN()).NjR() / 360.0f);
    }

    public static void YFl(Path path, float f10, float f11, float f12) {
        com.bytedance.adsdk.Sg.wN.YFl("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = YFl.get();
        Path path2 = Sg.get();
        Path path3 = tN.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            com.bytedance.adsdk.Sg.wN.Sg("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = wN.YFl(min, length);
                max = wN.YFl(max, length);
            }
            if (min < 0.0f) {
                min = wN.YFl(min, length);
            }
            if (max < 0.0f) {
                max = wN.YFl(max, length);
            }
            if (min == max) {
                path.reset();
                com.bytedance.adsdk.Sg.wN.Sg("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.bytedance.adsdk.Sg.wN.Sg("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.Sg.wN.Sg("applyTrimPathIfNeeded");
    }

    public static float YFl() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float YFl(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap YFl(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean YFl(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static void YFl(Canvas canvas, RectF rectF, Paint paint) {
        YFl(canvas, rectF, paint, 31);
    }

    public static void YFl(Canvas canvas, RectF rectF, Paint paint, int i10) {
        com.bytedance.adsdk.Sg.wN.YFl("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.Sg.wN.Sg("Utils#saveLayer");
    }
}
