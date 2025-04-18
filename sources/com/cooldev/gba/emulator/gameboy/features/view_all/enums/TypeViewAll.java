package com.cooldev.gba.emulator.gameboy.features.view_all.enums;

import b1.f0;
import com.facebook.appevents.AppEventsConstants;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TypeViewAll {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TypeViewAll[] $VALUES;

    @NotNull
    private final String id;

    @NotNull
    private final String title;
    public static final TypeViewAll RECENT = new TypeViewAll("RECENT", 0, AppEventsConstants.EVENT_PARAM_VALUE_NO, "Recent");
    public static final TypeViewAll FAVORITE = new TypeViewAll("FAVORITE", 1, AppEventsConstants.EVENT_PARAM_VALUE_YES, "Favorites");
    public static final TypeViewAll YOUR_GAME = new TypeViewAll("YOUR_GAME", 2, "2", "Your Game");

    private static final /* synthetic */ TypeViewAll[] $values() {
        return new TypeViewAll[]{RECENT, FAVORITE, YOUR_GAME};
    }

    static {
        TypeViewAll[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private TypeViewAll(String str, int i2, String str2, String str3) {
        this.id = str2;
        this.title = str3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TypeViewAll valueOf(String str) {
        return (TypeViewAll) Enum.valueOf(TypeViewAll.class, str);
    }

    public static TypeViewAll[] values() {
        return (TypeViewAll[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
