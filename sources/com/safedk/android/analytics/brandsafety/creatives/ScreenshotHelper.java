package com.safedk.android.analytics.brandsafety.creatives;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.PixelCopy;
import android.view.View;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.n;
import com.safedk.android.utils.Logger;

/* loaded from: classes2.dex */
public class ScreenshotHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29498a = "ScreenshotHelper";

    public static Bitmap a(View view, int i2) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(f29498a, "Cannot save view to bitmap! view: " + view);
            return null;
        }
        Pair<Bitmap, Float> b2 = b(view, i2);
        Bitmap bitmap = (Bitmap) b2.first;
        float floatValue = ((Float) b2.second).floatValue();
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.scale(1.0f / floatValue, 1.0f / floatValue);
            view.draw(canvas);
            return bitmap;
        }
        return bitmap;
    }

    private static Pair<Bitmap, Float> b(View view, int i2) {
        float width = view.getWidth();
        float height = view.getHeight();
        float f2 = 1.0f;
        if (i2 > 0) {
            if (width > height) {
                Logger.v(f29498a, "Taking screenshot of landscape view " + view);
                if (width > i2) {
                    f2 = width / i2;
                    height = (height * i2) / width;
                    width = i2;
                }
            } else {
                Logger.v(f29498a, "Taking screenshot of portrait view " + view);
                if (height > i2) {
                    f2 = height / i2;
                    width = (width * i2) / height;
                    height = i2;
                }
            }
        }
        Logger.v(f29498a, "scale size = " + f2);
        return new Pair<>(Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888), Float.valueOf(f2));
    }

    @TargetApi(26)
    /* loaded from: classes2.dex */
    public static class DefaultOnPixelCopyFinishedListener implements PixelCopy.OnPixelCopyFinishedListener {
        final Activity activity;
        Bitmap bitmap;
        n currentActivityInterstitial;

        DefaultOnPixelCopyFinishedListener(Bitmap bitmap, n currentActivityInterstitial, Activity activity) {
            this.bitmap = null;
            this.currentActivityInterstitial = null;
            this.bitmap = bitmap;
            this.currentActivityInterstitial = currentActivityInterstitial;
            this.activity = activity;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int copyResult) {
            if (copyResult == 0) {
                InterstitialFinder y2 = SafeDK.getInstance().y();
                if (y2 != null) {
                    Logger.d(ScreenshotHelper.f29498a, "take screenshot using PixelCopy - PixelCopy finished successfully. Calling Inter takeScreenshot");
                    y2.a(this.bitmap, this.currentActivityInterstitial, this.activity);
                    return;
                }
                return;
            }
            Logger.d(ScreenshotHelper.f29498a, "take screenshot using PixelCopy - PixelCopy finished NOT successfully. result= " + copyResult);
        }
    }

    public static void a(Activity activity, n nVar, View view, int i2) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(f29498a, "Cannot save view to bitmap! view: " + view);
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) b(view, i2).first;
            if (activity != null && bitmap != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                if (Build.VERSION.SDK_INT >= 26) {
                    PixelCopy.request(activity.getWindow(), rect, bitmap, new DefaultOnPixelCopyFinishedListener(bitmap, nVar, activity), new Handler(Looper.getMainLooper()));
                }
            }
        } catch (Exception e) {
            Logger.d(f29498a, "take screenshot using PixelCopy - exception on PixelCopy request: " + e);
        } catch (Throwable th) {
            Logger.d(f29498a, "take screenshot using PixelCopy - throwable on PixelCopy request: " + th);
        }
    }
}
