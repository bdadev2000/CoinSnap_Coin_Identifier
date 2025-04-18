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
/* loaded from: classes4.dex */
public final class StorageFile {
    public static final int $stable = 8;

    @Nullable
    private final String crc;

    @NotNull
    private final String name;

    @Nullable
    private final String path;

    @Nullable
    private final String serial;
    private final long size;

    @Nullable
    private final SystemID systemID;

    @NotNull
    private final Uri uri;

    public StorageFile(@NotNull String str, long j2, @Nullable String str2, @Nullable String str3, @NotNull Uri uri, @Nullable String str4, @Nullable SystemID systemID) {
        a.s(str, "name");
        a.s(uri, ShareConstants.MEDIA_URI);
        this.name = str;
        this.size = j2;
        this.crc = str2;
        this.serial = str3;
        this.uri = uri;
        this.path = str4;
        this.systemID = systemID;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.size;
    }

    @Nullable
    public final String component3() {
        return this.crc;
    }

    @Nullable
    public final String component4() {
        return this.serial;
    }

    @NotNull
    public final Uri component5() {
        return this.uri;
    }

    @Nullable
    public final String component6() {
        return this.path;
    }

    @Nullable
    public final SystemID component7() {
        return this.systemID;
    }

    @NotNull
    public final StorageFile copy(@NotNull String str, long j2, @Nullable String str2, @Nullable String str3, @NotNull Uri uri, @Nullable String str4, @Nullable SystemID systemID) {
        a.s(str, "name");
        a.s(uri, ShareConstants.MEDIA_URI);
        return new StorageFile(str, j2, str2, str3, uri, str4, systemID);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageFile)) {
            return false;
        }
        StorageFile storageFile = (StorageFile) obj;
        return a.g(this.name, storageFile.name) && this.size == storageFile.size && a.g(this.crc, storageFile.crc) && a.g(this.serial, storageFile.serial) && a.g(this.uri, storageFile.uri) && a.g(this.path, storageFile.path) && this.systemID == storageFile.systemID;
    }

    @Nullable
    public final String getCrc() {
        return this.crc;
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

    @Nullable
    public final String getSerial() {
        return this.serial;
    }

    public final long getSize() {
        return this.size;
    }

    @Nullable
    public final SystemID getSystemID() {
        return this.systemID;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int d = d.d(this.size, this.name.hashCode() * 31, 31);
        String str = this.crc;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serial;
        int hashCode2 = (this.uri.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.path;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SystemID systemID = this.systemID;
        return hashCode3 + (systemID != null ? systemID.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StorageFile(name=" + this.name + ", size=" + this.size + ", crc=" + this.crc + ", serial=" + this.serial + ", uri=" + this.uri + ", path=" + this.path + ", systemID=" + this.systemID + ')';
    }

    public /* synthetic */ StorageFile(String str, long j2, String str2, String str3, Uri uri, String str4, SystemID systemID, int i2, k kVar) {
        this(str, j2, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, uri, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : systemID);
    }
}
