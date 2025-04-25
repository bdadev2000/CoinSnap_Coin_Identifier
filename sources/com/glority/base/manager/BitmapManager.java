package com.glority.base.manager;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.glority.android.core.data.LogEventArguments;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitmapManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0013"}, d2 = {"Lcom/glority/base/manager/BitmapManager;", "", "<init>", "()V", "rotate", "Landroid/graphics/Bitmap;", "bitmap", "degree", "", "saveBitmap", "", TransferTable.COLUMN_FILE, "Ljava/io/File;", "resize", LogEventArguments.ARG_SIZE, "Lcom/glority/base/manager/BitmapManager$Size;", "ratio", "", "Size", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class BitmapManager {
    public static final int $stable = 0;
    public static final BitmapManager INSTANCE = new BitmapManager();

    private BitmapManager() {
    }

    public final Bitmap rotate(Bitmap bitmap, int degree) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(degree);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        if (!Intrinsics.areEqual(bitmap, createBitmap)) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public final void saveBitmap(Bitmap bitmap, File file) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* compiled from: BitmapManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/glority/base/manager/BitmapManager$Size;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final /* data */ class Size {
        public static final int $stable = 0;
        private final int height;
        private final int width;

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final Size copy(int width, int height) {
            return new Size(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "Size(width=" + this.width + ", height=" + this.height + ")";
        }

        public Size(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static /* synthetic */ Size copy$default(Size size, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = size.width;
            }
            if ((i3 & 2) != 0) {
                i2 = size.height;
            }
            return size.copy(i, i2);
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public final Bitmap resize(Bitmap bitmap, Size size) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(size, "size");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, size.getWidth(), size.getHeight());
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public final Bitmap resize(Bitmap bitmap, float ratio) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postScale(ratio, ratio);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }
}
