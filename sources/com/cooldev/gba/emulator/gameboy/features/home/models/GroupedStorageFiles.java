package com.cooldev.gba.emulator.gameboy.features.home.models;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import e0.u;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class GroupedStorageFiles {
    public static final int $stable = 8;

    @NotNull
    private final List<BaseStorageFile> dataFiles;

    @NotNull
    private final BaseStorageFile primaryFile;

    public GroupedStorageFiles(@NotNull BaseStorageFile baseStorageFile, @NotNull List<BaseStorageFile> list) {
        a.s(baseStorageFile, "primaryFile");
        a.s(list, "dataFiles");
        this.primaryFile = baseStorageFile;
        this.dataFiles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupedStorageFiles copy$default(GroupedStorageFiles groupedStorageFiles, BaseStorageFile baseStorageFile, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            baseStorageFile = groupedStorageFiles.primaryFile;
        }
        if ((i2 & 2) != 0) {
            list = groupedStorageFiles.dataFiles;
        }
        return groupedStorageFiles.copy(baseStorageFile, list);
    }

    @NotNull
    public final List<BaseStorageFile> allFiles() {
        return u.P0(this.dataFiles, f0.u(this.primaryFile));
    }

    @NotNull
    public final BaseStorageFile component1() {
        return this.primaryFile;
    }

    @NotNull
    public final List<BaseStorageFile> component2() {
        return this.dataFiles;
    }

    @NotNull
    public final GroupedStorageFiles copy(@NotNull BaseStorageFile baseStorageFile, @NotNull List<BaseStorageFile> list) {
        a.s(baseStorageFile, "primaryFile");
        a.s(list, "dataFiles");
        return new GroupedStorageFiles(baseStorageFile, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupedStorageFiles)) {
            return false;
        }
        GroupedStorageFiles groupedStorageFiles = (GroupedStorageFiles) obj;
        return a.g(this.primaryFile, groupedStorageFiles.primaryFile) && a.g(this.dataFiles, groupedStorageFiles.dataFiles);
    }

    @NotNull
    public final List<BaseStorageFile> getDataFiles() {
        return this.dataFiles;
    }

    @NotNull
    public final BaseStorageFile getPrimaryFile() {
        return this.primaryFile;
    }

    public int hashCode() {
        return this.dataFiles.hashCode() + (this.primaryFile.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GroupedStorageFiles(primaryFile=" + this.primaryFile + ", dataFiles=" + this.dataFiles + ')';
    }
}
