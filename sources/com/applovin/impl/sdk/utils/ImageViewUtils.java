package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.ft;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sj;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class ImageViewUtils {
    public static /* synthetic */ void a(final j jVar, String str, final ImageView imageView, Uri uri) {
        if (((Boolean) jVar.a(sj.D)).booleanValue()) {
            try {
                InputStream openStream = new URL(str).openStream();
                try {
                    final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                    final int i2 = 0;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            j jVar2 = jVar;
                            ImageView imageView2 = imageView;
                            Bitmap bitmap = decodeStream;
                            switch (i3) {
                                case 0:
                                    ImageViewUtils.a(jVar2, bitmap, imageView2);
                                    return;
                                default:
                                    ImageViewUtils.b(jVar2, bitmap, imageView2);
                                    return;
                            }
                        }
                    });
                    if (openStream != null) {
                        openStream.close();
                        return;
                    }
                    return;
                } finally {
                }
            } catch (Throwable th) {
                jVar.J();
                if (n.a()) {
                    jVar.J().a("ImageViewUtils", "Failed to fetch image: " + uri, th);
                }
                jVar.J().a("ImageViewUtils", th);
                jVar.E().a("ImageViewUtils", "setImageUri", th);
                return;
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = new URL(str).openStream();
            final Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream);
            final int i3 = 1;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i32 = i3;
                    j jVar2 = jVar;
                    ImageView imageView2 = imageView;
                    Bitmap bitmap = decodeStream2;
                    switch (i32) {
                        case 0:
                            ImageViewUtils.a(jVar2, bitmap, imageView2);
                            return;
                        default:
                            ImageViewUtils.b(jVar2, bitmap, imageView2);
                            return;
                    }
                }
            });
        } catch (Throwable th2) {
            try {
                jVar.J();
                if (n.a()) {
                    jVar.J().a("ImageViewUtils", "Failed to fetch image: " + uri, th2);
                }
            } finally {
                yp.a(inputStream, jVar);
            }
        }
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        j jVar = j.f26635v0;
        if (jVar == null) {
            n.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            jVar.j0().b().execute(new b(uri, imageView));
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new b(imageView, uri, 1));
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, j jVar) {
        if (imageView == null || uri == null) {
            return;
        }
        String uri2 = uri.toString();
        if (URLUtil.isFileUrl(uri2) || URLUtil.isContentUrl(uri2)) {
            AppLovinSdkUtils.runOnUiThread(new b(imageView, uri, 2));
            return;
        }
        if (jVar == null) {
            return;
        }
        jVar.J();
        if (n.a()) {
            jVar.J().a("ImageViewUtils", "Fetching image: " + uri);
        }
        jVar.j0().b().execute(new ft(3, uri2, jVar, imageView, uri));
    }

    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public static /* synthetic */ void b(j jVar, Bitmap bitmap, ImageView imageView) {
        jVar.J();
        if (n.a()) {
            jVar.J().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(j.l().getResources(), bitmap));
    }

    public static /* synthetic */ void a(j jVar, Bitmap bitmap, ImageView imageView) {
        jVar.J();
        if (n.a()) {
            jVar.J().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(j.l().getResources(), bitmap));
    }

    public static /* synthetic */ void a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point b2 = z3.b(imageView.getContext());
            height = Math.min(b2.x, b2.y);
            width = height;
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 > height || i4 > width) {
            while (true) {
                int i5 = i2 * 2;
                if (i3 / i5 < height && i4 / i5 < width) {
                    break;
                } else {
                    i2 = i5;
                }
            }
        }
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        j.f26635v0.J();
        if (n.a()) {
            j.f26635v0.J().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new androidx.core.content.res.a(22, imageView, BitmapFactory.decodeFile(uri.getPath(), options)));
    }
}
