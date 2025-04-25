package com.glority.utils.ui;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.glority.utils.UtilsApp;
import com.glority.utils.app.ResUtils;
import com.glority.utils.data.StringUtils;
import com.glority.utils.store.FileUtils;
import com.glority.utils.store.IOUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes9.dex */
public final class ImageUtils {
    public static Bitmap view2Bitmap(View view) {
        if (view == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return createBitmap;
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        Bitmap.Config config;
        Bitmap createBitmap;
        Bitmap.Config config2;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            if (drawable.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            createBitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (drawable.getOpacity() != -1) {
                config2 = Bitmap.Config.ARGB_8888;
            } else {
                config2 = Bitmap.Config.RGB_565;
            }
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(UtilsApp.getApp().getResources(), bitmap);
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return bitmap2Drawable(bytes2Bitmap(bArr));
    }

    public static Drawable tintDrawable(int i, int i2) {
        return tintDrawable(ResUtils.getDrawable(i), i2);
    }

    public static Drawable tintDrawable(Drawable drawable, int i) {
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTintList(wrap, ColorStateList.valueOf(i));
        return wrap;
    }

    public static boolean isImage(File file) {
        return file != null && isImage(file.getPath());
    }

    public static boolean isImage(String str) {
        String upperCase = str.toUpperCase();
        return upperCase.endsWith(".PNG") || upperCase.endsWith(".JPG") || upperCase.endsWith(".JPEG") || upperCase.endsWith(".BMP") || upperCase.endsWith(".GIF") || upperCase.endsWith(".WEBP");
    }

    public static String getImageType(String str) {
        return getImageType(FileUtils.getFileByPath(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getImageType(java.io.File r3) {
        /*
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            java.lang.String r0 = getImageType(r1)     // Catch: java.io.IOException -> L1e java.lang.Throwable -> L40
            if (r0 == 0) goto L1a
            r1.close()     // Catch: java.io.IOException -> L15
            goto L19
        L15:
            r3 = move-exception
            r3.printStackTrace()
        L19:
            return r0
        L1a:
            r1.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L1e:
            r0 = move-exception
            goto L26
        L20:
            r3 = move-exception
            goto L42
        L22:
            r1 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L26:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r0 = move-exception
            r0.printStackTrace()
        L33:
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r3 = com.glority.utils.store.FileUtils.getFileExtension(r3)
            java.lang.String r3 = r3.toUpperCase()
            return r3
        L40:
            r3 = move-exception
            r0 = r1
        L42:
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r0 = move-exception
            r0.printStackTrace()
        L4c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.ui.ImageUtils.getImageType(java.io.File):java.lang.String");
    }

    public static Bitmap getBitmap(File file) {
        if (file == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(File file, int i, int i2) {
        if (file == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(String str) {
        if (StringUtils.isSpace(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(String str, int i, int i2) {
        if (StringUtils.isSpace(str)) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream, int i, int i2) {
        if (inputStream == null) {
            return null;
        }
        try {
            return getBitmap(IOUtils.is2Bytes(inputStream), 0, i, i2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(byte[] bArr, int i) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, i, bArr.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(byte[] bArr, int i, int i2, int i3) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, i, bArr.length, options);
            options.inSampleSize = calculateInSampleSize(options, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeByteArray(bArr, i, bArr.length, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(int i) {
        try {
            Drawable drawable = ContextCompat.getDrawable(UtilsApp.getApp(), i);
            Canvas canvas = new Canvas();
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            canvas.setBitmap(createBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(int i, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = UtilsApp.getApp().getResources();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeResource(resources, i, options);
            options.inSampleSize = calculateInSampleSize(options, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(resources, i, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor, int i, int i2) {
        if (fileDescriptor == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap drawColor(Bitmap bitmap, int i) {
        return drawColor(bitmap, i, false);
    }

    public static Bitmap drawColor(Bitmap bitmap, int i, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    public static Bitmap scale(Bitmap bitmap, int i) {
        int i2;
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= i || height <= i) {
            return bitmap;
        }
        float f = width / height;
        if (f <= 1.0f) {
            i2 = (int) (i / f);
        } else {
            int i3 = (int) (i * f);
            i2 = i;
            i = i3;
        }
        return scale(bitmap, i, i2, false);
    }

    public static Bitmap scale(Bitmap bitmap, int i, int i2) {
        return scale(bitmap, i, i2, false);
    }

    public static Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap scale(Bitmap bitmap, float f, float f2) {
        return scale(bitmap, f, f2, false);
    }

    public static Bitmap scale(Bitmap bitmap, float f, float f2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap clip(Bitmap bitmap, int i, int i2, int i3, int i4) {
        return clip(bitmap, i, i2, i3, i4, false);
    }

    public static Bitmap clip(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, i3, i4);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f, float f2) {
        return skew(bitmap, f, f2, 0.0f, 0.0f, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f, float f2, boolean z) {
        return skew(bitmap, f, f2, 0.0f, 0.0f, z);
    }

    public static Bitmap skew(Bitmap bitmap, float f, float f2, float f3, float f4) {
        return skew(bitmap, f, f2, f3, f4, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f, float f2, float f3, float f4, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f, f2, f3, f4);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap rotate(Bitmap bitmap, int i, float f, float f2) {
        return rotate(bitmap, i, f, f2, false);
    }

    public static Bitmap rotate(Bitmap bitmap, int i, float f, float f2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, f, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static int getRotateDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static double[] getImageLatLng(String str) {
        try {
            return new ExifInterface(str).getLatLong();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap toRound(Bitmap bitmap) {
        return toRound(bitmap, 0, 0, false);
    }

    public static Bitmap toRound(Bitmap bitmap, boolean z) {
        return toRound(bitmap, 0, 0, z);
    }

    public static Bitmap toRound(Bitmap bitmap, int i, int i2) {
        return toRound(bitmap, i, i2, false);
    }

    public static Bitmap toRound(Bitmap bitmap, int i, int i2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f = min / 2.0f;
        float f2 = width;
        float f3 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        rectF.inset((width - min) / 2.0f, (height - min) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f, f, paint);
        if (i > 0) {
            paint.setShader(null);
            paint.setColor(i2);
            paint.setStyle(Paint.Style.STROKE);
            float f4 = i;
            paint.setStrokeWidth(f4);
            canvas.drawCircle(f2 / 2.0f, f3 / 2.0f, f - (f4 / 2.0f), paint);
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f) {
        return toRoundCorner(bitmap, f, 0, 0, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f, boolean z) {
        return toRoundCorner(bitmap, f, 0, 0, z);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f, int i, int i2) {
        return toRoundCorner(bitmap, f, i, i2, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f, int i, int i2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f2 = i;
        float f3 = f2 / 2.0f;
        rectF.inset(f3, f3);
        canvas.drawRoundRect(rectF, f, f, paint);
        if (i > 0) {
            paint.setShader(null);
            paint.setColor(i2);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f2);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, int i, int i2, float f) {
        return addBorder(bitmap, i, i2, false, f, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, int i, int i2, float f, boolean z) {
        return addBorder(bitmap, i, i2, false, f, z);
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, int i, int i2) {
        return addBorder(bitmap, i, i2, true, 0.0f, false);
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, int i, int i2, boolean z) {
        return addBorder(bitmap, i, i2, true, 0.0f, z);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i) {
        return addReflection(bitmap, i, false);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height - i, width, i, matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height + i, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f = height;
        canvas.drawBitmap(createBitmap, 0.0f, f, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, createBitmap2.getHeight(), 1895825407, 16777215, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f, width, createBitmap2.getHeight(), paint);
        if (!createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap2;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, int i, int i2, float f, float f2) {
        return addTextWatermark(bitmap, str, i, i2, f, f2, false);
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, float f, int i, float f2, float f3, boolean z) {
        if (isEmptyBitmap(bitmap) || str == null) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(copy);
        paint.setColor(i);
        paint.setTextSize(f);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f2, f3 + f, paint);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return copy;
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3) {
        return addImageWatermark(bitmap, bitmap2, i, i2, i3, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        if (!isEmptyBitmap(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(copy);
            paint.setAlpha(i3);
            canvas.drawBitmap(bitmap2, i, i2, paint);
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return copy;
    }

    public static Bitmap toAlpha(Bitmap bitmap) {
        return toAlpha(bitmap, false);
    }

    public static Bitmap toAlpha(Bitmap bitmap, Boolean bool) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap extractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return extractAlpha;
    }

    public static Bitmap toGray(Bitmap bitmap) {
        return toGray(bitmap, false);
    }

    public static Bitmap toGray(Bitmap bitmap, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap fastBlur(Bitmap bitmap, float f, float f2) {
        return fastBlur(bitmap, f, f2, false);
    }

    public static Bitmap fastBlur(Bitmap bitmap, float f, float f2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f, f);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        Bitmap renderScriptBlur = renderScriptBlur(createBitmap, f2, z);
        if (f == 1.0f) {
            if (z && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return renderScriptBlur;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(renderScriptBlur, width, height, true);
        if (!renderScriptBlur.isRecycled()) {
            renderScriptBlur.recycle();
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap renderScriptBlur(Bitmap bitmap, float f) {
        return renderScriptBlur(bitmap, f, false);
    }

    public static Bitmap renderScriptBlur(Bitmap bitmap, float f, boolean z) {
        if (!z) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        RenderScript renderScript = null;
        try {
            renderScript = RenderScript.create(UtilsApp.getApp());
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            create.setInput(createFromBitmap);
            create.setRadius(f);
            create.forEach(createTyped);
            createTyped.copyTo(bitmap);
            return bitmap;
        } finally {
            if (renderScript != null) {
                renderScript.destroy();
            }
        }
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i) {
        return stackBlur(bitmap, i, false);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap copy = z ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i2 = i < 1 ? 1 : i;
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap2 = copy;
            int i16 = height;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = -i2;
            int i26 = 0;
            while (i25 <= i2) {
                int i27 = i5;
                int[] iArr9 = iArr6;
                int i28 = iArr2[i14 + Math.min(i4, Math.max(i25, 0))];
                int[] iArr10 = iArr8[i25 + i2];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i28 & 255;
                int abs = i12 - Math.abs(i25);
                int i29 = iArr10[0];
                i26 += i29 * abs;
                int i30 = iArr10[1];
                i17 += i30 * abs;
                int i31 = iArr10[2];
                i18 += abs * i31;
                if (i25 > 0) {
                    i22 += i29;
                    i23 += i30;
                    i24 += i31;
                } else {
                    i19 += i29;
                    i20 += i30;
                    i21 += i31;
                }
                i25++;
                i5 = i27;
                iArr6 = iArr9;
            }
            int i32 = i5;
            int[] iArr11 = iArr6;
            int i33 = i26;
            int i34 = i2;
            int i35 = 0;
            while (i35 < width) {
                iArr3[i14] = iArr7[i33];
                iArr4[i14] = iArr7[i17];
                iArr5[i14] = iArr7[i18];
                int i36 = i33 - i19;
                int i37 = i17 - i20;
                int i38 = i18 - i21;
                int[] iArr12 = iArr8[((i34 - i2) + i7) % i7];
                int i39 = i19 - iArr12[0];
                int i40 = i20 - iArr12[1];
                int i41 = i21 - iArr12[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr11[i35] = Math.min(i35 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i42 = iArr2[i15 + iArr11[i35]];
                int i43 = (i42 & 16711680) >> 16;
                iArr12[0] = i43;
                int i44 = (i42 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[1] = i44;
                int i45 = i42 & 255;
                iArr12[2] = i45;
                int i46 = i22 + i43;
                int i47 = i23 + i44;
                int i48 = i24 + i45;
                i33 = i36 + i46;
                i17 = i37 + i47;
                i18 = i38 + i48;
                i34 = (i34 + 1) % i7;
                int[] iArr13 = iArr8[i34 % i7];
                int i49 = iArr13[0];
                i19 = i39 + i49;
                int i50 = iArr13[1];
                i20 = i40 + i50;
                int i51 = iArr13[2];
                i21 = i41 + i51;
                i22 = i46 - i49;
                i23 = i47 - i50;
                i24 = i48 - i51;
                i14++;
                i35++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            copy = bitmap2;
            height = i16;
            i5 = i32;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = copy;
        int i52 = i5;
        int[] iArr14 = iArr6;
        int i53 = height;
        int[] iArr15 = iArr7;
        int i54 = 0;
        while (i54 < width) {
            int i55 = -i2;
            int i56 = i7;
            int[] iArr16 = iArr2;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = i55;
            int i65 = i55 * width;
            int i66 = 0;
            int i67 = 0;
            while (i64 <= i2) {
                int i68 = width;
                int max = Math.max(0, i65) + i54;
                int[] iArr17 = iArr8[i64 + i2];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i64);
                i66 += iArr3[max] * abs2;
                i67 += iArr4[max] * abs2;
                i57 += iArr5[max] * abs2;
                if (i64 > 0) {
                    i61 += iArr17[0];
                    i62 += iArr17[1];
                    i63 += iArr17[2];
                } else {
                    i58 += iArr17[0];
                    i59 += iArr17[1];
                    i60 += iArr17[2];
                }
                int i69 = i52;
                if (i64 < i69) {
                    i65 += i68;
                }
                i64++;
                i52 = i69;
                width = i68;
            }
            int i70 = width;
            int i71 = i52;
            int i72 = i54;
            int i73 = i2;
            int i74 = i53;
            int i75 = 0;
            while (i75 < i74) {
                iArr16[i72] = (iArr16[i72] & ViewCompat.MEASURED_STATE_MASK) | (iArr15[i66] << 16) | (iArr15[i67] << 8) | iArr15[i57];
                int i76 = i66 - i58;
                int i77 = i67 - i59;
                int i78 = i57 - i60;
                int[] iArr18 = iArr8[((i73 - i2) + i56) % i56];
                int i79 = i58 - iArr18[0];
                int i80 = i59 - iArr18[1];
                int i81 = i60 - iArr18[2];
                int i82 = i2;
                if (i54 == 0) {
                    iArr14[i75] = Math.min(i75 + i12, i71) * i70;
                }
                int i83 = iArr14[i75] + i54;
                int i84 = iArr3[i83];
                iArr18[0] = i84;
                int i85 = iArr4[i83];
                iArr18[1] = i85;
                int i86 = iArr5[i83];
                iArr18[2] = i86;
                int i87 = i61 + i84;
                int i88 = i62 + i85;
                int i89 = i63 + i86;
                i66 = i76 + i87;
                i67 = i77 + i88;
                i57 = i78 + i89;
                i73 = (i73 + 1) % i56;
                int[] iArr19 = iArr8[i73];
                int i90 = iArr19[0];
                i58 = i79 + i90;
                int i91 = iArr19[1];
                i59 = i80 + i91;
                int i92 = iArr19[2];
                i60 = i81 + i92;
                i61 = i87 - i90;
                i62 = i88 - i91;
                i63 = i89 - i92;
                i72 += i70;
                i75++;
                i2 = i82;
            }
            i54++;
            i52 = i71;
            i53 = i74;
            i7 = i56;
            iArr2 = iArr16;
            width = i70;
        }
        int i93 = width;
        bitmap3.setPixels(iArr2, 0, i93, 0, 0, i93, i53);
        return bitmap3;
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i, int i2) {
        return scale(bitmap, i, i2, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i, int i2, boolean z) {
        return scale(bitmap, i, i2, z);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f, float f2) {
        return scale(bitmap, f, f2, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f, float f2, boolean z) {
        return scale(bitmap, f, f2, z);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i) {
        return compressByQuality(bitmap, i, false);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j) {
        return compressByQuality(bitmap, j, false);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j, boolean z) {
        byte[] byteArray;
        if (isEmptyBitmap(bitmap) || j <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i2 < i) {
                    i3 = (i2 + i) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j) {
                        break;
                    }
                    if (size > j) {
                        i = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                }
                if (i == i3 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i) {
        return compressBySampleSize(bitmap, i, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i, int i2) {
        return compressBySampleSize(bitmap, i, i2, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i, int i2, boolean z) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, FileUtils.getFileByPath(str), compressFormat, false);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, file, compressFormat, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z) {
        return save(bitmap, FileUtils.getFileByPath(str), compressFormat, z);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x002f -> B:18:0x0044). Please report as a decompilation issue!!! */
    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z) {
        boolean z2 = false;
        if (isEmptyBitmap(bitmap) || !FileUtils.createFileByDeleteOldFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    z2 = bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                    if (z && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    bufferedOutputStream2.close();
                } catch (IOException e2) {
                    e = e2;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static Bitmap addBorder(Bitmap bitmap, int i, int i2, boolean z, float f, boolean z2) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z2) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = i;
        paint.setStrokeWidth(f2);
        if (z) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f2 / 2.0f), paint);
        } else {
            float f3 = i >> 1;
            canvas.drawRoundRect(new RectF(f3, f3, width - r5, height - r5), f, f, paint);
        }
        return bitmap;
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        while (true) {
            i4 >>= 1;
            if (i4 < i || (i3 = i3 >> 1) < i2) {
                break;
            }
            i5 <<= 1;
        }
        return i5;
    }

    private static String getImageType(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[8];
            if (inputStream.read(bArr, 0, 8) != -1) {
                return getImageType(bArr);
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getImageType(byte[] bArr) {
        if (isJPEG(bArr)) {
            return "JPEG";
        }
        if (isGIF(bArr)) {
            return "GIF";
        }
        if (isPNG(bArr)) {
            return "PNG";
        }
        if (isBMP(bArr)) {
            return "BMP";
        }
        return null;
    }

    private static boolean isJPEG(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40;
    }

    private static boolean isGIF(byte[] bArr) {
        if (bArr.length < 6 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70 || bArr[3] != 56) {
            return false;
        }
        byte b = bArr[4];
        return (b == 55 || b == 57) && bArr[5] == 97;
    }

    private static boolean isPNG(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10;
    }

    private static boolean isBMP(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 66 && bArr[1] == 77;
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    private ImageUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
