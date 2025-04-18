package org.koin.core.definition;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Kind {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Kind[] $VALUES;
    public static final Kind Singleton = new Kind("Singleton", 0);
    public static final Kind Factory = new Kind("Factory", 1);
    public static final Kind Scoped = new Kind("Scoped", 2);

    private static final /* synthetic */ Kind[] $values() {
        return new Kind[]{Singleton, Factory, Scoped};
    }

    static {
        Kind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private Kind(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) $VALUES.clone();
    }
}
