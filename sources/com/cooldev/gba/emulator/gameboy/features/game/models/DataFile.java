package com.cooldev.gba.emulator.gameboy.features.game.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DataFile implements Serializable {
    public static final int $stable = 0;

    @NotNull
    private final String fileName;

    @NotNull
    private final String fileUri;

    @NotNull
    private final String gameId;

    @NotNull
    private final String id;
    private final long lastIndexedAt;

    @Nullable
    private final String path;

    public DataFile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, @Nullable String str5) {
        a.s(str, "id");
        a.s(str2, "gameId");
        a.s(str3, "fileName");
        a.s(str4, "fileUri");
        this.id = str;
        this.gameId = str2;
        this.fileName = str3;
        this.fileUri = str4;
        this.lastIndexedAt = j2;
        this.path = str5;
    }

    public static /* synthetic */ DataFile copy$default(DataFile dataFile, String str, String str2, String str3, String str4, long j2, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dataFile.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dataFile.gameId;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = dataFile.fileName;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = dataFile.fileUri;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            j2 = dataFile.lastIndexedAt;
        }
        long j3 = j2;
        if ((i2 & 32) != 0) {
            str5 = dataFile.path;
        }
        return dataFile.copy(str, str6, str7, str8, j3, str5);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.gameId;
    }

    @NotNull
    public final String component3() {
        return this.fileName;
    }

    @NotNull
    public final String component4() {
        return this.fileUri;
    }

    public final long component5() {
        return this.lastIndexedAt;
    }

    @Nullable
    public final String component6() {
        return this.path;
    }

    @NotNull
    public final DataFile copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, @Nullable String str5) {
        a.s(str, "id");
        a.s(str2, "gameId");
        a.s(str3, "fileName");
        a.s(str4, "fileUri");
        return new DataFile(str, str2, str3, str4, j2, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataFile)) {
            return false;
        }
        DataFile dataFile = (DataFile) obj;
        return a.g(this.id, dataFile.id) && a.g(this.gameId, dataFile.gameId) && a.g(this.fileName, dataFile.fileName) && a.g(this.fileUri, dataFile.fileUri) && this.lastIndexedAt == dataFile.lastIndexedAt && a.g(this.path, dataFile.path);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFileUri() {
        return this.fileUri;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getLastIndexedAt() {
        return this.lastIndexedAt;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int d = d.d(this.lastIndexedAt, androidx.compose.foundation.text.input.a.b(this.fileUri, androidx.compose.foundation.text.input.a.b(this.fileName, androidx.compose.foundation.text.input.a.b(this.gameId, this.id.hashCode() * 31, 31), 31), 31), 31);
        String str = this.path;
        return d + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataFile(id=");
        sb.append(this.id);
        sb.append(", gameId=");
        sb.append(this.gameId);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", fileUri=");
        sb.append(this.fileUri);
        sb.append(", lastIndexedAt=");
        sb.append(this.lastIndexedAt);
        sb.append(", path=");
        return d.q(sb, this.path, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DataFile(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, java.lang.String r17, int r18, kotlin.jvm.internal.k r19) {
        /*
            r10 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L13
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            p0.a.r(r0, r1)
            r3 = r0
            goto L14
        L13:
            r3 = r11
        L14:
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.models.DataFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, kotlin.jvm.internal.k):void");
    }
}
