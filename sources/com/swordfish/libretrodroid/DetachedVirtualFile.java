package com.swordfish.libretrodroid;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class DetachedVirtualFile {
    private final int fileDescriptor;

    @NotNull
    private final String virtualPath;

    public DetachedVirtualFile(@NotNull String str, int i2) {
        p0.a.s(str, "virtualPath");
        this.virtualPath = str;
        this.fileDescriptor = i2;
    }

    public static /* synthetic */ DetachedVirtualFile copy$default(DetachedVirtualFile detachedVirtualFile, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = detachedVirtualFile.virtualPath;
        }
        if ((i3 & 2) != 0) {
            i2 = detachedVirtualFile.fileDescriptor;
        }
        return detachedVirtualFile.copy(str, i2);
    }

    @NotNull
    public final String component1() {
        return this.virtualPath;
    }

    public final int component2() {
        return this.fileDescriptor;
    }

    @NotNull
    public final DetachedVirtualFile copy(@NotNull String str, int i2) {
        p0.a.s(str, "virtualPath");
        return new DetachedVirtualFile(str, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetachedVirtualFile)) {
            return false;
        }
        DetachedVirtualFile detachedVirtualFile = (DetachedVirtualFile) obj;
        return p0.a.g(this.virtualPath, detachedVirtualFile.virtualPath) && this.fileDescriptor == detachedVirtualFile.fileDescriptor;
    }

    public final int getFileDescriptor() {
        return this.fileDescriptor;
    }

    @NotNull
    public final String getVirtualPath() {
        return this.virtualPath;
    }

    public int hashCode() {
        return Integer.hashCode(this.fileDescriptor) + (this.virtualPath.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DetachedVirtualFile(virtualPath=");
        sb.append(this.virtualPath);
        sb.append(", fileDescriptor=");
        return d.o(sb, this.fileDescriptor, ')');
    }
}
