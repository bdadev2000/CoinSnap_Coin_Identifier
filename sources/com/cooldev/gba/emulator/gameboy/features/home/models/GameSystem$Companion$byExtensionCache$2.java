package com.cooldev.gba.emulator.gameboy.features.home.models;

import e0.e0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class GameSystem$Companion$byExtensionCache$2 extends r implements a {
    public static final GameSystem$Companion$byExtensionCache$2 INSTANCE = new GameSystem$Companion$byExtensionCache$2();

    public GameSystem$Companion$byExtensionCache$2() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Map<String, GameSystem> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GameSystem gameSystem : GameSystem.SYSTEMS) {
            for (String str : gameSystem.getUniqueExtensions()) {
                Locale locale = Locale.US;
                p0.a.r(locale, "US");
                String lowerCase = str.toLowerCase(locale);
                p0.a.r(lowerCase, "toLowerCase(...)");
                linkedHashMap.put(lowerCase, gameSystem);
            }
        }
        return e0.x(linkedHashMap);
    }
}
