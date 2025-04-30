package com.google.ar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import androidx.fragment.app.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* loaded from: classes2.dex */
public class AugmentedImageDatabase {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public AugmentedImageDatabase(Session session) {
        this(session, nativeCreate(session.nativeWrapperHandle));
    }

    public static ByteBuffer convertBitmapToGrayscaleDirectBuffer(Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getHeight() * bitmap.getWidth());
        for (int i9 = 0; i9 < bitmap.getHeight(); i9++) {
            for (int i10 = 0; i10 < bitmap.getWidth(); i10++) {
                allocateDirect.put((bitmap.getWidth() * i9) + i10, (byte) Color.red(createBitmap.getPixel(i10, i9)));
            }
        }
        return allocateDirect;
    }

    public static AugmentedImageDatabase deserialize(Session session, InputStream inputStream) throws IOException {
        return new AugmentedImageDatabase(session, nativeDeserialize(session.nativeWrapperHandle, loadDirectByteBuffer(inputStream)));
    }

    private static ByteBuffer loadDirectByteBuffer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                allocateDirect.put(byteArray);
                return allocateDirect;
            }
        }
    }

    private native int nativeAddImage(long j7, long j9, String str, ByteBuffer byteBuffer, int i9, int i10, int i11);

    private native int nativeAddImageWithPhysicalSize(long j7, long j9, String str, ByteBuffer byteBuffer, int i9, int i10, int i11, float f9);

    private static native long nativeCreate(long j7);

    private static native long nativeDeserialize(long j7, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j7, long j9);

    private native void nativeReleaseDatabase(long j7, long j9);

    private native ByteBuffer nativeSerialize(long j7, long j9);

    public int addImage(String str, Bitmap bitmap) {
        Session session = this.session;
        return nativeAddImage(session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseDatabase(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public int getNumImages() {
        return nativeGetNumImages(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void serialize(OutputStream outputStream) throws IOException {
        Channels.newChannel(outputStream).write(nativeSerialize(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase(Session session, long j7) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public int addImage(String str, Bitmap bitmap, float f9) {
        Session session = this.session;
        return nativeAddImageWithPhysicalSize(session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f9);
    }
}
