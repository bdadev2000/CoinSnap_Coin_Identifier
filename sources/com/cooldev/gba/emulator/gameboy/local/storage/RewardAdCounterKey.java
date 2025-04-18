package com.cooldev.gba.emulator.gameboy.local.storage;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RewardAdCounterKey {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RewardAdCounterKey[] $VALUES;
    public static final RewardAdCounterKey REWARD_ADS_COUNTER = new RewardAdCounterKey("REWARD_ADS_COUNTER", 0, "RewardAdCounter");

    @NotNull
    private final String key;

    private static final /* synthetic */ RewardAdCounterKey[] $values() {
        return new RewardAdCounterKey[]{REWARD_ADS_COUNTER};
    }

    static {
        RewardAdCounterKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private RewardAdCounterKey(String str, int i2, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RewardAdCounterKey valueOf(String str) {
        return (RewardAdCounterKey) Enum.valueOf(RewardAdCounterKey.class, str);
    }

    public static RewardAdCounterKey[] values() {
        return (RewardAdCounterKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
