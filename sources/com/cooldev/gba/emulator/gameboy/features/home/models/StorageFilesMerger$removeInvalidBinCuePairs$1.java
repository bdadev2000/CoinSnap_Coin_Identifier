package com.cooldev.gba.emulator.gameboy.features.home.models;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class StorageFilesMerger$removeInvalidBinCuePairs$1 extends r implements l {
    public static final StorageFilesMerger$removeInvalidBinCuePairs$1 INSTANCE = new StorageFilesMerger$removeInvalidBinCuePairs$1();

    public StorageFilesMerger$removeInvalidBinCuePairs$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull BaseStorageFile baseStorageFile) {
        a.s(baseStorageFile, "it");
        return Boolean.valueOf(a.g(baseStorageFile.getExtension(), "cue"));
    }
}
