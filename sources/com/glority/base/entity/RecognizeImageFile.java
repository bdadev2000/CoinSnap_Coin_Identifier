package com.glority.base.entity;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeImageFile.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0005R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/glority/base/entity/RecognizeImageFile;", "", "originalImage", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getOriginalImage", "()Ljava/io/File;", "setOriginalImage", "compressImageFile", "getCompressImageFile", "setCompressImageFile", "itemId", "", "getItemId", "()Ljava/lang/Long;", "setItemId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "cropImageFile", "getCropImageFile", "setCropImageFile", "getDisplayImageFile", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class RecognizeImageFile {
    public static final int $stable = 8;
    private File compressImageFile;
    private File cropImageFile;
    private Long itemId;
    private File originalImage;

    public RecognizeImageFile(File originalImage) {
        Intrinsics.checkNotNullParameter(originalImage, "originalImage");
        this.originalImage = originalImage;
    }

    public final File getOriginalImage() {
        return this.originalImage;
    }

    public final void setOriginalImage(File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.originalImage = file;
    }

    public final File getCompressImageFile() {
        return this.compressImageFile;
    }

    public final void setCompressImageFile(File file) {
        this.compressImageFile = file;
    }

    public final Long getItemId() {
        return this.itemId;
    }

    public final void setItemId(Long l) {
        this.itemId = l;
    }

    public final File getCropImageFile() {
        return this.cropImageFile;
    }

    public final void setCropImageFile(File file) {
        this.cropImageFile = file;
    }

    public final File getDisplayImageFile() {
        File file = this.cropImageFile;
        return file == null ? this.originalImage : file;
    }
}
