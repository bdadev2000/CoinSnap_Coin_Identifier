package com.bytedance.adsdk.lottie.HWF;

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
import com.bytedance.adsdk.lottie.zp.zp.FP;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class HWF {
    private static final ThreadLocal<PathMeasure> zp = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.lottie.HWF.HWF.1
        @Override // java.lang.ThreadLocal
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> lMd = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.HWF.HWF.2
        @Override // java.lang.ThreadLocal
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> KS = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.HWF.HWF.3
        @Override // java.lang.ThreadLocal
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> jU = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.lottie.HWF.HWF.4
        @Override // java.lang.ThreadLocal
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float COT = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean lMd(Matrix matrix) {
        float[] fArr = jU.get();
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

    public static int zp(float f9, float f10, float f11, float f12) {
        int i9 = f9 != 0.0f ? (int) (f9 * 527.0f) : 17;
        if (f10 != 0.0f) {
            i9 = (int) (i9 * 31 * f10);
        }
        if (f11 != 0.0f) {
            i9 = (int) (i9 * 31 * f11);
        }
        return f12 != 0.0f ? (int) (i9 * 31 * f12) : i9;
    }

    public static boolean zp(int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i9 < i12) {
            return false;
        }
        if (i9 > i12) {
            return true;
        }
        if (i10 < i13) {
            return false;
        }
        return i10 > i13 || i11 >= i14;
    }

    public static Path zp(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f9 = pointF3.x + pointF.x;
            float f10 = pointF.y + pointF3.y;
            float f11 = pointF2.x;
            float f12 = f11 + pointF4.x;
            float f13 = pointF2.y;
            path.cubicTo(f9, f10, f12, f13 + pointF4.y, f11, f13);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void zp(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static float zp(Matrix matrix) {
        float[] fArr = jU.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f9 = COT;
        fArr[2] = f9;
        fArr[3] = f9;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void zp(Path path, FP fp) {
        if (fp == null || fp.HWF()) {
            return;
        }
        zp(path, ((com.bytedance.adsdk.lottie.zp.lMd.jU) fp.KS()).YW() / 100.0f, ((com.bytedance.adsdk.lottie.zp.lMd.jU) fp.jU()).YW() / 100.0f, ((com.bytedance.adsdk.lottie.zp.lMd.jU) fp.COT()).YW() / 360.0f);
    }

    public static void zp(Path path, float f9, float f10, float f11) {
        com.bytedance.adsdk.lottie.COT.zp("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = zp.get();
        Path path2 = lMd.get();
        Path path3 = KS.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f9 == 1.0f && f10 == 0.0f) {
            com.bytedance.adsdk.lottie.COT.lMd("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f10 - f9) - 1.0f) >= 0.01d) {
            float f12 = f9 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = COT.zp(min, length);
                max = COT.zp(max, length);
            }
            if (min < 0.0f) {
                min = COT.zp(min, length);
            }
            if (max < 0.0f) {
                max = COT.zp(max, length);
            }
            if (min == max) {
                path.reset();
                com.bytedance.adsdk.lottie.COT.lMd("applyTrimPathIfNeeded");
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
            com.bytedance.adsdk.lottie.COT.lMd("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.lottie.COT.lMd("applyTrimPathIfNeeded");
    }

    public static float zp() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float zp(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap zp(Bitmap bitmap, int i9, int i10) {
        if (bitmap.getWidth() == i9 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i9, i10, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean zp(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void zp(Canvas canvas, RectF rectF, Paint paint) {
        zp(canvas, rectF, paint, 31);
    }

    public static void zp(Canvas canvas, RectF rectF, Paint paint, int i9) {
        com.bytedance.adsdk.lottie.COT.zp("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.lottie.COT.lMd("Utils#saveLayer");
    }
}
