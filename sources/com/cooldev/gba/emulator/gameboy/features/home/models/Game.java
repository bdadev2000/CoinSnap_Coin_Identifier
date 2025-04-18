package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game.models.DataFile;
import com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem;
import e0.w;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Game implements Serializable {
    private final boolean audioEnabled;
    private final boolean autoSaveEnable;

    @Nullable
    private final String coverFrontUrl;

    @Nullable
    private final Long createdAtInMillis;

    @NotNull
    private final List<DataFile> dataFiles;

    @Nullable
    private final String developer;
    private final boolean fastForwardEnabled;

    @NotNull
    private final String fileName;

    @NotNull
    private final String fileUri;

    @NotNull
    private final String id;
    private final boolean isFavorite;
    private final boolean isFirstTimeInPremium;

    @Nullable
    private final Long lastPlayedAt;

    @NotNull
    private final String systemId;

    @NotNull
    private final String title;

    @Nullable
    private final Long updatedAtInMillis;

    @NotNull
    public static final Factory Factory = new Factory(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(k kVar) {
            this();
        }

        @Nullable
        public final Game fromMetadata(@NotNull String str, @NotNull GroupedStorageFiles groupedStorageFiles, @NotNull StorageFile storageFile, @Nullable GameMetadata gameMetadata, @NotNull List<DataFile> list) {
            a.s(str, "id");
            a.s(groupedStorageFiles, "groupedStorageFile");
            a.s(storageFile, "storageFile");
            a.s(list, "dataFiles");
            if (gameMetadata == null) {
                return null;
            }
            GameSystem.Companion companion = GameSystem.Companion;
            String system = gameMetadata.getSystem();
            a.p(system);
            GameSystem findById = companion.findById(system);
            String name = storageFile.getName();
            String uri = groupedStorageFiles.getPrimaryFile().getUri().toString();
            String name2 = gameMetadata.getName();
            if (name2 == null) {
                name2 = "N/A";
            }
            String dbname = findById.getId().getDbname();
            String developer = gameMetadata.getDeveloper();
            String thumbnail = gameMetadata.getThumbnail();
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
            a.p(uri);
            return new Game(str, name, uri, name2, dbname, developer, thumbnail, null, false, Long.valueOf(timeInMillis), Long.valueOf(timeInMillis2), list, false, false, true, false, 32896, null);
        }
    }

    public Game(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l2, boolean z2, @Nullable Long l3, @Nullable Long l4, @NotNull List<DataFile> list, boolean z3, boolean z4, boolean z5, boolean z6) {
        a.s(str, "id");
        a.s(str2, "fileName");
        a.s(str3, "fileUri");
        a.s(str4, "title");
        a.s(str5, "systemId");
        a.s(list, "dataFiles");
        this.id = str;
        this.fileName = str2;
        this.fileUri = str3;
        this.title = str4;
        this.systemId = str5;
        this.developer = str6;
        this.coverFrontUrl = str7;
        this.lastPlayedAt = l2;
        this.isFavorite = z2;
        this.createdAtInMillis = l3;
        this.updatedAtInMillis = l4;
        this.dataFiles = list;
        this.fastForwardEnabled = z3;
        this.autoSaveEnable = z4;
        this.audioEnabled = z5;
        this.isFirstTimeInPremium = z6;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final Long component10() {
        return this.createdAtInMillis;
    }

    @Nullable
    public final Long component11() {
        return this.updatedAtInMillis;
    }

    @NotNull
    public final List<DataFile> component12() {
        return this.dataFiles;
    }

    public final boolean component13() {
        return this.fastForwardEnabled;
    }

    public final boolean component14() {
        return this.autoSaveEnable;
    }

    public final boolean component15() {
        return this.audioEnabled;
    }

    public final boolean component16() {
        return this.isFirstTimeInPremium;
    }

    @NotNull
    public final String component2() {
        return this.fileName;
    }

    @NotNull
    public final String component3() {
        return this.fileUri;
    }

    @NotNull
    public final String component4() {
        return this.title;
    }

    @NotNull
    public final String component5() {
        return this.systemId;
    }

    @Nullable
    public final String component6() {
        return this.developer;
    }

    @Nullable
    public final String component7() {
        return this.coverFrontUrl;
    }

    @Nullable
    public final Long component8() {
        return this.lastPlayedAt;
    }

    public final boolean component9() {
        return this.isFavorite;
    }

    @NotNull
    public final Game copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l2, boolean z2, @Nullable Long l3, @Nullable Long l4, @NotNull List<DataFile> list, boolean z3, boolean z4, boolean z5, boolean z6) {
        a.s(str, "id");
        a.s(str2, "fileName");
        a.s(str3, "fileUri");
        a.s(str4, "title");
        a.s(str5, "systemId");
        a.s(list, "dataFiles");
        return new Game(str, str2, str3, str4, str5, str6, str7, l2, z2, l3, l4, list, z3, z4, z5, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Game)) {
            return false;
        }
        Game game = (Game) obj;
        return a.g(this.id, game.id) && a.g(this.fileName, game.fileName) && a.g(this.fileUri, game.fileUri) && a.g(this.title, game.title) && a.g(this.systemId, game.systemId) && a.g(this.developer, game.developer) && a.g(this.coverFrontUrl, game.coverFrontUrl) && a.g(this.lastPlayedAt, game.lastPlayedAt) && this.isFavorite == game.isFavorite && a.g(this.createdAtInMillis, game.createdAtInMillis) && a.g(this.updatedAtInMillis, game.updatedAtInMillis) && a.g(this.dataFiles, game.dataFiles) && this.fastForwardEnabled == game.fastForwardEnabled && this.autoSaveEnable == game.autoSaveEnable && this.audioEnabled == game.audioEnabled && this.isFirstTimeInPremium == game.isFirstTimeInPremium;
    }

    public final boolean getAudioEnabled() {
        return this.audioEnabled;
    }

    public final boolean getAutoSaveEnable() {
        return this.autoSaveEnable;
    }

    @Nullable
    public final String getCoverFrontUrl() {
        return this.coverFrontUrl;
    }

    @Nullable
    public final Long getCreatedAtInMillis() {
        return this.createdAtInMillis;
    }

    @NotNull
    public final List<DataFile> getDataFiles() {
        return this.dataFiles;
    }

    @Nullable
    public final String getDeveloper() {
        return this.developer;
    }

    public final boolean getFastForwardEnabled() {
        return this.fastForwardEnabled;
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
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getLastPlayedAt() {
        return this.lastPlayedAt;
    }

    @NotNull
    public final String getSystemId() {
        return this.systemId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Long getUpdatedAtInMillis() {
        return this.updatedAtInMillis;
    }

    public int hashCode() {
        int b2 = androidx.compose.foundation.text.input.a.b(this.systemId, androidx.compose.foundation.text.input.a.b(this.title, androidx.compose.foundation.text.input.a.b(this.fileUri, androidx.compose.foundation.text.input.a.b(this.fileName, this.id.hashCode() * 31, 31), 31), 31), 31);
        String str = this.developer;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverFrontUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.lastPlayedAt;
        int g2 = d.g(this.isFavorite, (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
        Long l3 = this.createdAtInMillis;
        int hashCode3 = (g2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.updatedAtInMillis;
        return Boolean.hashCode(this.isFirstTimeInPremium) + d.g(this.audioEnabled, d.g(this.autoSaveEnable, d.g(this.fastForwardEnabled, d.f(this.dataFiles, (hashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFirstTimeInPremium() {
        return this.isFirstTimeInPremium;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Game(id=");
        sb.append(this.id);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", fileUri=");
        sb.append(this.fileUri);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", systemId=");
        sb.append(this.systemId);
        sb.append(", developer=");
        sb.append(this.developer);
        sb.append(", coverFrontUrl=");
        sb.append(this.coverFrontUrl);
        sb.append(", lastPlayedAt=");
        sb.append(this.lastPlayedAt);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", createdAtInMillis=");
        sb.append(this.createdAtInMillis);
        sb.append(", updatedAtInMillis=");
        sb.append(this.updatedAtInMillis);
        sb.append(", dataFiles=");
        sb.append(this.dataFiles);
        sb.append(", fastForwardEnabled=");
        sb.append(this.fastForwardEnabled);
        sb.append(", autoSaveEnable=");
        sb.append(this.autoSaveEnable);
        sb.append(", audioEnabled=");
        sb.append(this.audioEnabled);
        sb.append(", isFirstTimeInPremium=");
        return d.s(sb, this.isFirstTimeInPremium, ')');
    }

    public /* synthetic */ Game(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, boolean z2, Long l3, Long l4, List list, boolean z3, boolean z4, boolean z5, boolean z6, int i2, k kVar) {
        this(str, str2, str3, str4, str5, str6, str7, (i2 & 128) != 0 ? null : l2, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? null : l3, (i2 & 1024) != 0 ? null : l4, (i2 & Opcodes.ACC_STRICT) != 0 ? w.f30218a : list, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? true : z5, (i2 & 32768) != 0 ? true : z6);
    }
}
