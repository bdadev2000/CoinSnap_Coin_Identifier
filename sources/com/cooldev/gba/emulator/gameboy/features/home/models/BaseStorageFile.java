package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.net.Uri;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.utils.FileUtils;
import com.facebook.share.internal.ShareConstants;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BaseStorageFile {
    public static final int $stable = 8;

    @NotNull
    private final String name;

    @Nullable
    private final String path;
    private final long size;

    @NotNull
    private final Uri uri;

    public BaseStorageFile(@NotNull String str, long j2, @NotNull Uri uri, @Nullable String str2) {
        a.s(str, "name");
        a.s(uri, ShareConstants.MEDIA_URI);
        this.name = str;
        this.size = j2;
        this.uri = uri;
        this.path = str2;
    }

    public static /* synthetic */ BaseStorageFile copy$default(BaseStorageFile baseStorageFile, String str, long j2, Uri uri, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = baseStorageFile.name;
        }
        if ((i2 & 2) != 0) {
            j2 = baseStorageFile.size;
        }
        long j3 = j2;
        if ((i2 & 4) != 0) {
            uri = baseStorageFile.uri;
        }
        Uri uri2 = uri;
        if ((i2 & 8) != 0) {
            str2 = baseStorageFile.path;
        }
        return baseStorageFile.copy(str, j3, uri2, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.size;
    }

    @NotNull
    public final Uri component3() {
        return this.uri;
    }

    @Nullable
    public final String component4() {
        return this.path;
    }

    @NotNull
    public final BaseStorageFile copy(@NotNull String str, long j2, @NotNull Uri uri, @Nullable String str2) {
        a.s(str, "name");
        a.s(uri, ShareConstants.MEDIA_URI);
        return new BaseStorageFile(str, j2, uri, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStorageFile)) {
            return false;
        }
        BaseStorageFile baseStorageFile = (BaseStorageFile) obj;
        return a.g(this.name, baseStorageFile.name) && this.size == baseStorageFile.size && a.g(this.uri, baseStorageFile.uri) && a.g(this.path, baseStorageFile.path);
    }

    @NotNull
    public final String getExtension() {
        return FileUtils.INSTANCE.extractExtension(this.name);
    }

    @NotNull
    public final String getExtensionLessName() {
        return FileUtils.INSTANCE.discardExtension(this.name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = (this.uri.hashCode() + d.d(this.size, this.name.hashCode() * 31, 31)) * 31;
        String str = this.path;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BaseStorageFile(name=");
        sb.append(this.name);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", path=");
        return d.q(sb, this.path, ')');
    }

    public /* synthetic */ BaseStorageFile(String str, long j2, Uri uri, String str2, int i2, k kVar) {
        this(str, j2, uri, (i2 & 8) != 0 ? null : str2);
    }
}
