package org.koin.core.logger;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Level {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Level[] $VALUES;
    public static final Level DEBUG = new Level("DEBUG", 0);
    public static final Level INFO = new Level("INFO", 1);
    public static final Level WARNING = new Level("WARNING", 2);
    public static final Level ERROR = new Level("ERROR", 3);
    public static final Level NONE = new Level("NONE", 4);

    private static final /* synthetic */ Level[] $values() {
        return new Level[]{DEBUG, INFO, WARNING, ERROR, NONE};
    }

    static {
        Level[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private Level(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) $VALUES.clone();
    }
}
