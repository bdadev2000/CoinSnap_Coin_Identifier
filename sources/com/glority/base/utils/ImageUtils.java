package com.glority.base.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.core.app.AppContext;
import com.glority.imagepicker.utils.MyFileProvider;
import com.glority.utils.UtilsApp;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageUtils.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u001a\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\"\u0010#\u001a\u00020!2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0012\u0010&\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0006\u0010'\u001a\u00020(J\u0018\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u0018J0\u0010,\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J,\u00100\u001a\u0004\u0018\u00010\u001c2\u0006\u00101\u001a\u00020\u001c2\b\b\u0001\u00102\u001a\u00020/2\b\b\u0001\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020(J4\u00105\u001a\u0004\u0018\u00010!2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020/2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ*\u00108\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020/J\u0010\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002J \u0010=\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010>\u001a\u00020?H\u0002J&\u0010@\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006A"}, d2 = {"Lcom/glority/base/utils/ImageUtils;", "", "<init>", "()V", "TAG", "", "PICTURE_PREFIX", "getPICTURE_PREFIX", "()Ljava/lang/String;", "setPICTURE_PREFIX", "(Ljava/lang/String;)V", "JPG_PICTURE_EXTENSION", "getJPG_PICTURE_EXTENSION", "setJPG_PICTURE_EXTENSION", "PNG_PICTURE_EXTENSION", "getPNG_PICTURE_EXTENSION", "setPNG_PICTURE_EXTENSION", "WEBP_PICTURE_EXTENSION", "getWEBP_PICTURE_EXTENSION", "setWEBP_PICTURE_EXTENSION", "PUBLIC_PATH", "getPUBLIC_PATH", "setPUBLIC_PATH", "getShareUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "getFileUri", TransferTable.COLUMN_FILE, "Ljava/io/File;", "saveImageToFileProvider", "saveImageToFile", "createEmptyImageFile", "dir", "getFielExtension", "isAndroidQ", "", "saveBitmap", "getPathFromContentUri", "uri", "writeBitmapToUri", "", "quality", "", "toRound", "src", "borderSize", "borderColor", "recycle", "scaleImage", "minWidth", "minHeight", "getScaledBitmap", "targetW", "targetH", "getRotate", "orientation", "getOrientation", "fd", "Ljava/io/FileDescriptor;", "writeBitmapToFile", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ImageUtils {
    public static final String TAG = "ImageUtils";
    public static final ImageUtils INSTANCE = new ImageUtils();
    private static String PICTURE_PREFIX = "pp_";
    private static String JPG_PICTURE_EXTENSION = "jpeg";
    private static String PNG_PICTURE_EXTENSION = "png";
    private static String WEBP_PICTURE_EXTENSION = "webp";
    private static String PUBLIC_PATH = "Pictures/" + AppContext.INSTANCE.getConfig("appName");
    public static final int $stable = 8;

    /* compiled from: ImageUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getRotate(int orientation) {
        if (orientation == 3) {
            return 180;
        }
        if (orientation != 6) {
            return orientation != 8 ? 0 : 270;
        }
        return 90;
    }

    private ImageUtils() {
    }

    public final String getPICTURE_PREFIX() {
        return PICTURE_PREFIX;
    }

    public final void setPICTURE_PREFIX(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PICTURE_PREFIX = str;
    }

    public final String getJPG_PICTURE_EXTENSION() {
        return JPG_PICTURE_EXTENSION;
    }

    public final void setJPG_PICTURE_EXTENSION(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        JPG_PICTURE_EXTENSION = str;
    }

    public final String getPNG_PICTURE_EXTENSION() {
        return PNG_PICTURE_EXTENSION;
    }

    public final void setPNG_PICTURE_EXTENSION(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PNG_PICTURE_EXTENSION = str;
    }

    public final String getWEBP_PICTURE_EXTENSION() {
        return WEBP_PICTURE_EXTENSION;
    }

    public final void setWEBP_PICTURE_EXTENSION(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        WEBP_PICTURE_EXTENSION = str;
    }

    public final String getPUBLIC_PATH() {
        return PUBLIC_PATH;
    }

    public final void setPUBLIC_PATH(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PUBLIC_PATH = str;
    }

    public static /* synthetic */ Uri getShareUri$default(ImageUtils imageUtils, Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, Object obj) {
        if ((i & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        return imageUtils.getShareUri(context, bitmap, compressFormat);
    }

    public final Uri getShareUri(Context context, Bitmap bitmap, Bitmap.CompressFormat format) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return getFileUri(context, saveImageToFileProvider(bitmap, format));
    }

    private final Uri getFileUri(Context context, File file) {
        String str = context.getPackageName() + ".mis_file_provider";
        Intrinsics.checkNotNull(file);
        return MyFileProvider.getUriForFile(context, str, file);
    }

    private final File saveImageToFileProvider(Bitmap bitmap, Bitmap.CompressFormat format) {
        File externalFilesDir = UtilsApp.getApp().getExternalFilesDir("");
        Intrinsics.checkNotNull(externalFilesDir);
        return saveImageToFile(createEmptyImageFile(externalFilesDir, format), bitmap, format);
    }

    private final File saveImageToFile(File file, Bitmap bitmap, Bitmap.CompressFormat format) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    if (format == null) {
                        try {
                            format = Bitmap.CompressFormat.JPEG;
                        } catch (Exception e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return file;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    fileOutputStream = fileOutputStream2;
                    bitmap.compress(format, 90, fileOutputStream);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final File createEmptyImageFile(File dir, Bitmap.CompressFormat format) {
        String fielExtension = getFielExtension(format);
        File file = new File(dir, PICTURE_PREFIX + System.currentTimeMillis() + InstructionFileId.DOT + fielExtension);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    private final String getFielExtension(Bitmap.CompressFormat format) {
        int i = format == null ? -1 : WhenMappings.$EnumSwitchMapping$0[format.ordinal()];
        if (i == 1) {
            return JPG_PICTURE_EXTENSION;
        }
        if (i == 2) {
            return PNG_PICTURE_EXTENSION;
        }
        if (i == 3) {
            return WEBP_PICTURE_EXTENSION;
        }
        return JPG_PICTURE_EXTENSION;
    }

    public final boolean isAndroidQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public final Uri saveBitmap(final Context context, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String fielExtension = getFielExtension(Bitmap.CompressFormat.JPEG);
        String str = PICTURE_PREFIX + System.currentTimeMillis() + InstructionFileId.DOT + fielExtension;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/" + fielExtension);
        if (isAndroidQ()) {
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("relative_path", PUBLIC_PATH);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        try {
            if (insert != null) {
                writeBitmapToUri(context, insert, bitmap, 100, Bitmap.CompressFormat.JPEG);
            } else {
                LogUtils.e("insert image fail uri==null");
            }
        } catch (Exception unused) {
            LogUtils.e("write image fail");
        }
        if (isAndroidQ()) {
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            Intrinsics.checkNotNull(insert);
            contentResolver.update(insert, contentValues, null, null);
        }
        if (insert != null && !isAndroidQ()) {
            MediaScannerConnection.scanFile(context, new String[]{getPathFromContentUri(context, insert)}, new String[]{MimeTypes.IMAGE_JPEG}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.glority.base.utils.ImageUtils$$ExternalSyntheticLambda0
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri) {
                    ImageUtils.saveBitmap$lambda$0(context, str2, uri);
                }
            });
        }
        return insert;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveBitmap$lambda$0(Context context, String str, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        context.sendBroadcast(intent);
    }

    public final String getPathFromContentUri(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] strArr = {"_data"};
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNull(uri);
        Cursor query = contentResolver.query(uri, strArr, null, null, null);
        Intrinsics.checkNotNull(query);
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex(strArr[0]));
        query.close();
        return string;
    }

    private final void writeBitmapToUri(Context context, Uri uri, Bitmap bitmap, int quality, Bitmap.CompressFormat format) throws FileNotFoundException, SecurityException {
        ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = null;
        try {
            try {
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(openFileDescriptor);
                    try {
                        bitmap.compress(format, quality, autoCloseOutputStream2);
                        autoCloseOutputStream2.flush();
                        autoCloseOutputStream2.close();
                    } catch (Exception e) {
                        e = e;
                        autoCloseOutputStream = autoCloseOutputStream2;
                        e.printStackTrace();
                        if (autoCloseOutputStream != null) {
                            autoCloseOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        autoCloseOutputStream = autoCloseOutputStream2;
                        if (autoCloseOutputStream != null) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public final Bitmap toRound(Bitmap src, int borderSize, int borderColor, boolean recycle) {
        Intrinsics.checkNotNullParameter(src, "src");
        if (src.getWidth() == 0 || src.getHeight() == 0) {
            return null;
        }
        int width = src.getWidth();
        int height = src.getHeight();
        int min = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, src.getConfig());
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        float f = min / 2.0f;
        float f2 = width;
        float f3 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        rectF.inset((width - min) / 2.0f, (height - min) / 2.0f);
        Matrix matrix = new Matrix();
        BitmapShader bitmapShader = new BitmapShader(src, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f, f, paint);
        if (borderSize > 0) {
            paint.setShader(null);
            paint.setColor(borderColor);
            paint.setStyle(Paint.Style.STROKE);
            float f4 = borderSize;
            paint.setStrokeWidth(f4);
            canvas.drawCircle(f2 / 2.0f, f3 / 2.0f, f - (f4 / 2.0f), paint);
        }
        if (recycle && !src.isRecycled()) {
            src.recycle();
        }
        return createBitmap;
    }

    public final File scaleImage(Context context, Uri uri, int minWidth, int minHeight, Bitmap.CompressFormat format) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return null;
        }
        return writeBitmapToFile(FileUtils.createEmptyImageFile(FileUtils.getTmepDir(), format), getScaledBitmap(context, uri, minWidth, minHeight), format);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap getScaledBitmap(android.content.Context r8, android.net.Uri r9, int r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "r"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            r1 = 0
            if (r9 != 0) goto Lb
            return r1
        Lb:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            android.os.ParcelFileDescriptor r4 = r4.openFileDescriptor(r9, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> La9
            java.io.FileDescriptor r5 = r4.getFileDescriptor()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> La9
            android.graphics.BitmapFactory.decodeFileDescriptor(r5, r1, r2)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> La9
            r4.close()     // Catch: java.lang.Exception -> L29
            goto L3d
        L29:
            r5 = move-exception
            r5.printStackTrace()
            goto L3d
        L2e:
            r5 = move-exception
            goto L35
        L30:
            r8 = move-exception
            goto Lab
        L33:
            r5 = move-exception
            r4 = r1
        L35:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L3d
            r4.close()     // Catch: java.lang.Exception -> L29
        L3d:
            int r5 = r2.outWidth
            int r2 = r2.outHeight
            if (r5 <= r2) goto L46
            r6 = r5
            r5 = r2
            r2 = r6
        L46:
            int r5 = r5 / r10
            int r2 = r2 / r11
            int r10 = java.lang.Math.min(r5, r2)
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r11.inSampleSize = r10
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r10
            r11.inPreferQualityOverSpeed = r3
            r10 = 0
            r11.inJustDecodeBounds = r10
            android.content.ContentResolver r10 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            android.os.ParcelFileDescriptor r4 = r10.openFileDescriptor(r9, r0)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.io.FileDescriptor r10 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r11)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.io.FileDescriptor r11 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r0 = "getFileDescriptor(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            int r8 = r7.getOrientation(r8, r9, r11)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            int r8 = r7.getRotate(r8)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            android.graphics.Bitmap r8 = com.glority.base.utils.BitmapUtil.rotate(r10, r8)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r4.close()     // Catch: java.lang.Exception -> L88
            goto L8c
        L88:
            r9 = move-exception
            r9.printStackTrace()
        L8c:
            return r8
        L8d:
            r8 = move-exception
            goto L9e
        L8f:
            r8 = move-exception
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L9d
            r4.close()     // Catch: java.lang.Exception -> L99
            goto L9d
        L99:
            r8 = move-exception
            r8.printStackTrace()
        L9d:
            return r1
        L9e:
            if (r4 == 0) goto La8
            r4.close()     // Catch: java.lang.Exception -> La4
            goto La8
        La4:
            r9 = move-exception
            r9.printStackTrace()
        La8:
            throw r8
        La9:
            r8 = move-exception
            r1 = r4
        Lab:
            if (r1 == 0) goto Lb5
            r1.close()     // Catch: java.lang.Exception -> Lb1
            goto Lb5
        Lb1:
            r9 = move-exception
            r9.printStackTrace()
        Lb5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.utils.ImageUtils.getScaledBitmap(android.content.Context, android.net.Uri, int, int):android.graphics.Bitmap");
    }

    private final int getOrientation(Context context, Uri uri, FileDescriptor fd) {
        ExifInterface exifInterface;
        try {
            if (FileUtils.isAndroidQ()) {
                exifInterface = new ExifInterface(fd);
            } else {
                exifInterface = new ExifInterface(FileUtils.getPathFromContentUri(context, uri));
            }
            return exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x001c -> B:15:0x0031). Please report as a decompilation issue!!! */
    public final File writeBitmapToFile(File file, Bitmap bitmap, Bitmap.CompressFormat format) {
        FileOutputStream fileOutputStream = null;
        try {
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                if (bitmap != null) {
                    if (format == null) {
                        try {
                            format = Bitmap.CompressFormat.JPEG;
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return file;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    fileOutputStream = fileOutputStream2;
                    bitmap.compress(format, 100, fileOutputStream);
                }
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Exception e4) {
                e = e4;
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
