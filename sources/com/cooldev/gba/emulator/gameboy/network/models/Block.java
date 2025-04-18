package com.cooldev.gba.emulator.gameboy.network.models;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class Block {
    public static final int $stable = 8;

    @Nullable
    private final Accessory accessory;

    @Nullable
    private final String block_id;

    @Nullable
    private final List<BlockText> fields;

    @Nullable
    private final BlockText text;

    @NotNull
    private final String type;

    public Block(@NotNull String str, @Nullable BlockText blockText, @Nullable String str2, @Nullable Accessory accessory, @Nullable List<BlockText> list) {
        a.s(str, "type");
        this.type = str;
        this.text = blockText;
        this.block_id = str2;
        this.accessory = accessory;
        this.fields = list;
    }

    public static /* synthetic */ Block copy$default(Block block, String str, BlockText blockText, String str2, Accessory accessory, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = block.type;
        }
        if ((i2 & 2) != 0) {
            blockText = block.text;
        }
        BlockText blockText2 = blockText;
        if ((i2 & 4) != 0) {
            str2 = block.block_id;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            accessory = block.accessory;
        }
        Accessory accessory2 = accessory;
        if ((i2 & 16) != 0) {
            list = block.fields;
        }
        return block.copy(str, blockText2, str3, accessory2, list);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final BlockText component2() {
        return this.text;
    }

    @Nullable
    public final String component3() {
        return this.block_id;
    }

    @Nullable
    public final Accessory component4() {
        return this.accessory;
    }

    @Nullable
    public final List<BlockText> component5() {
        return this.fields;
    }

    @NotNull
    public final Block copy(@NotNull String str, @Nullable BlockText blockText, @Nullable String str2, @Nullable Accessory accessory, @Nullable List<BlockText> list) {
        a.s(str, "type");
        return new Block(str, blockText, str2, accessory, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Block)) {
            return false;
        }
        Block block = (Block) obj;
        return a.g(this.type, block.type) && a.g(this.text, block.text) && a.g(this.block_id, block.block_id) && a.g(this.accessory, block.accessory) && a.g(this.fields, block.fields);
    }

    @Nullable
    public final Accessory getAccessory() {
        return this.accessory;
    }

    @Nullable
    public final String getBlock_id() {
        return this.block_id;
    }

    @Nullable
    public final List<BlockText> getFields() {
        return this.fields;
    }

    @Nullable
    public final BlockText getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        BlockText blockText = this.text;
        int hashCode2 = (hashCode + (blockText == null ? 0 : blockText.hashCode())) * 31;
        String str = this.block_id;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Accessory accessory = this.accessory;
        int hashCode4 = (hashCode3 + (accessory == null ? 0 : accessory.hashCode())) * 31;
        List<BlockText> list = this.fields;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Block(type=" + this.type + ", text=" + this.text + ", block_id=" + this.block_id + ", accessory=" + this.accessory + ", fields=" + this.fields + ')';
    }

    public /* synthetic */ Block(String str, BlockText blockText, String str2, Accessory accessory, List list, int i2, k kVar) {
        this(str, (i2 & 2) != 0 ? null : blockText, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : accessory, (i2 & 16) != 0 ? null : list);
    }
}
