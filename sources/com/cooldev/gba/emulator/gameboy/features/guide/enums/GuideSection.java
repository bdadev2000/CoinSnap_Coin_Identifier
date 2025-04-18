package com.cooldev.gba.emulator.gameboy.features.guide.enums;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class GuideSection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GuideSection[] $VALUES;

    @NotNull
    private final String title;
    public static final GuideSection STEPS = new GuideSection("STEPS", 0, "Steps");
    public static final GuideSection SITE = new GuideSection("SITE", 1, "Site");

    private static final /* synthetic */ GuideSection[] $values() {
        return new GuideSection[]{STEPS, SITE};
    }

    static {
        GuideSection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GuideSection(String str, int i2, String str2) {
        this.title = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GuideSection valueOf(String str) {
        return (GuideSection) Enum.valueOf(GuideSection.class, str);
    }

    public static GuideSection[] values() {
        return (GuideSection[]) $VALUES.clone();
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
