package com.cooldev.gba.emulator.gameboy.features.dashboard.enums;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NavigationBottomBarPortraitItem {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NavigationBottomBarPortraitItem[] $VALUES;
    public static final NavigationBottomBarPortraitItem Add;
    public static final NavigationBottomBarPortraitItem Home;
    public static final NavigationBottomBarPortraitItem Theme;
    private int iconActiveResId;
    private int iconResId;

    @NotNull
    private final String route;

    @NotNull
    private final String title;

    private static final /* synthetic */ NavigationBottomBarPortraitItem[] $values() {
        return new NavigationBottomBarPortraitItem[]{Home, Add, Theme};
    }

    static {
        MyImages myImages = MyImages.INSTANCE;
        Home = new NavigationBottomBarPortraitItem("Home", 0, "Home", RouterName.HOME, myImages.getHome1(), myImages.getHome());
        Add = new NavigationBottomBarPortraitItem("Add", 1, "", "", myImages.getAdd1(), myImages.getAdd());
        Theme = new NavigationBottomBarPortraitItem("Theme", 2, "Theme", RouterName.THEME, myImages.getTheme1(), myImages.getTheme());
        NavigationBottomBarPortraitItem[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private NavigationBottomBarPortraitItem(String str, int i2, String str2, String str3, int i3, int i4) {
        this.title = str2;
        this.route = str3;
        this.iconActiveResId = i3;
        this.iconResId = i4;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static NavigationBottomBarPortraitItem valueOf(String str) {
        return (NavigationBottomBarPortraitItem) Enum.valueOf(NavigationBottomBarPortraitItem.class, str);
    }

    public static NavigationBottomBarPortraitItem[] values() {
        return (NavigationBottomBarPortraitItem[]) $VALUES.clone();
    }

    public final int getIconActiveResId() {
        return this.iconActiveResId;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setIconActiveResId(int i2) {
        this.iconActiveResId = i2;
    }

    public final void setIconResId(int i2) {
        this.iconResId = i2;
    }
}
