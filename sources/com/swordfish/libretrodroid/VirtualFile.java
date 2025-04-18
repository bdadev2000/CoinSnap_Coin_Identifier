package com.swordfish.libretrodroid;

import android.os.ParcelFileDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class VirtualFile {

    @NotNull
    private final ParcelFileDescriptor fileDescriptor;

    @NotNull
    private final String virtualPath;

    public VirtualFile(@NotNull String str, @NotNull ParcelFileDescriptor parcelFileDescriptor) {
        p0.a.s(str, "virtualPath");
        p0.a.s(parcelFileDescriptor, "fileDescriptor");
        this.virtualPath = str;
        this.fileDescriptor = parcelFileDescriptor;
    }

    public static /* synthetic */ VirtualFile copy$default(VirtualFile virtualFile, String str, ParcelFileDescriptor parcelFileDescriptor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = virtualFile.virtualPath;
        }
        if ((i2 & 2) != 0) {
            parcelFileDescriptor = virtualFile.fileDescriptor;
        }
        return virtualFile.copy(str, parcelFileDescriptor);
    }

    @NotNull
    public final String component1() {
        return this.virtualPath;
    }

    @NotNull
    public final ParcelFileDescriptor component2() {
        return this.fileDescriptor;
    }

    @NotNull
    public final VirtualFile copy(@NotNull String str, @NotNull ParcelFileDescriptor parcelFileDescriptor) {
        p0.a.s(str, "virtualPath");
        p0.a.s(parcelFileDescriptor, "fileDescriptor");
        return new VirtualFile(str, parcelFileDescriptor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualFile)) {
            return false;
        }
        VirtualFile virtualFile = (VirtualFile) obj;
        return p0.a.g(this.virtualPath, virtualFile.virtualPath) && p0.a.g(this.fileDescriptor, virtualFile.fileDescriptor);
    }

    @NotNull
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @NotNull
    public final String getVirtualPath() {
        return this.virtualPath;
    }

    public int hashCode() {
        return this.fileDescriptor.hashCode() + (this.virtualPath.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VirtualFile(virtualPath=" + this.virtualPath + ", fileDescriptor=" + this.fileDescriptor + ')';
    }
}
