package com.glority.utils.store;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.glority.android.xx.constants.Args;
import com.glority.utils.UtilsApp;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public class SandboxUtils {
    public static Bitmap getBitmap(Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        if (uri == null || (openFileDescriptor = openFileDescriptor(uri, "r")) == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(Uri uri, int i, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        if (uri == null || (openFileDescriptor = openFileDescriptor(uri, "r")) == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmap(Uri uri, int i) {
        ParcelFileDescriptor openFileDescriptor;
        if (uri == null || (openFileDescriptor = openFileDescriptor(uri, "r")) == null) {
            return null;
        }
        if (i <= 0) {
            i = 1;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            return BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ParcelFileDescriptor openFileDescriptor(Uri uri, String str) {
        try {
            return UtilsApp.getApp().getContentResolver().openFileDescriptor(uri, str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SecurityException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (i > 0 && i2 > 0) {
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            if (i4 > i || i5 > i2) {
                while (i4 / i3 > i * 2 && i5 / i3 > i2 * 2) {
                    i3 *= 2;
                }
            }
        }
        return i3;
    }

    public static Uri saveImage(Bitmap bitmap, String str) {
        return saveImage(bitmap, str, (String) null);
    }

    public static Uri saveImage(Bitmap bitmap, String str, String str2) {
        return saveImage(bitmap, str, str2, (String) null);
    }

    public static Uri saveImage(Bitmap bitmap, String str, String str2, String str3) {
        FileOutputStream fileOutputStream;
        OutputStream outputStream;
        if (bitmap == null) {
            return null;
        }
        if (str2 == null) {
            str2 = getPictureFileName();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Uri createImageUri = createImageUri(str, str2, str3);
            if (createImageUri == null) {
                return null;
            }
            try {
                outputStream = UtilsApp.getApp().getContentResolver().openOutputStream(createImageUri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                outputStream = null;
            }
            if (outputStream == null) {
                return null;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            try {
                outputStream.close();
                return createImageUri;
            } catch (IOException e2) {
                e2.printStackTrace();
                return createImageUri;
            }
        }
        File file = new File(getPicDir(str), str2);
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return null;
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        UtilsApp.getApp().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
        return Uri.fromFile(file);
    }

    public static Uri saveImage(byte[] bArr, String str) {
        return saveImage(bArr, str, (String) null);
    }

    public static Uri saveImage(byte[] bArr, String str, String str2) {
        return saveImage(bArr, str, str2, (String) null);
    }

    public static Uri saveImage(byte[] bArr, String str, String str2, String str3) {
        FileOutputStream fileOutputStream;
        OutputStream outputStream;
        if (bArr == null) {
            return null;
        }
        if (str2 == null) {
            str2 = getPictureFileName();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Uri createImageUri = createImageUri(str, str2, str3);
            if (createImageUri == null) {
                return null;
            }
            try {
                outputStream = UtilsApp.getApp().getContentResolver().openOutputStream(createImageUri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                outputStream = null;
            }
            if (outputStream == null) {
                return null;
            }
            try {
                outputStream.write(bArr);
                outputStream.close();
                return createImageUri;
            } catch (IOException e2) {
                e2.printStackTrace();
                return createImageUri;
            }
        }
        File file = new File(getPicDir(str), str2);
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        UtilsApp.getApp().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
        return Uri.fromFile(file);
    }

    public static Uri createImageUri(String str, String str2, String str3) {
        ContentResolver contentResolver = UtilsApp.getApp().getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (str2 == null) {
            str2 = getPictureFileName();
        }
        contentValues.put(Args.title, str2);
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
        if (str3 != null) {
            contentValues.put("description", str3);
        }
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
        if (Build.VERSION.SDK_INT >= 29) {
            if (str != null) {
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + str);
            }
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        }
        return contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static File getPicDir(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory == null) {
            return null;
        }
        File file = new File(externalStoragePublicDirectory, str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static Uri getContentUriFromPath(Context context, String str) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{TransferTable.COLUMN_ID}, "_data=? ", new String[]{str}, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        Uri withAppendedPath = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "" + cursor.getInt(cursor.getColumnIndex(TransferTable.COLUMN_ID)));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return withAppendedPath;
                    }
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String getPictureFileName() {
        return "img_" + System.currentTimeMillis() + ".jpg";
    }
}
