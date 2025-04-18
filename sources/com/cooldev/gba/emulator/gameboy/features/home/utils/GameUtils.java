package com.cooldev.gba.emulator.gameboy.features.home.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.ColorUtils;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e0.p;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p0.a;
import y0.d;
import y0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class GameUtils {
    public static final int $stable = 0;

    @NotNull
    public static final GameUtils INSTANCE = new GameUtils();

    private GameUtils() {
    }

    private final int color(float f2, float f3, float f4) {
        return ColorUtils.a(new float[]{f2 * 360.0f, f3, f4});
    }

    public static /* synthetic */ int color$default(GameUtils gameUtils, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.5f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.5f;
        }
        return gameUtils.color(f2, f3, f4);
    }

    private final String computeTitle(Game game) {
        String valueOf;
        String title = game.getTitle();
        Pattern compile = Pattern.compile("\\(.*\\)");
        a.r(compile, "compile(...)");
        a.s(title, "input");
        String replaceAll = compile.matcher(title).replaceAll("");
        a.r(replaceAll, "replaceAll(...)");
        String O = m.O(m.R(m.L(replaceAll.length() == 0 ? d.f31426a : new p(replaceAll, 5), GameUtils$computeTitle$1.INSTANCE), 3), "", null, 62);
        if (z0.m.Z0(O)) {
            String title2 = game.getTitle();
            a.s(title2, "<this>");
            if (title2.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            O = String.valueOf(title2.charAt(0));
        }
        if (O.length() <= 0) {
            return O;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = O.charAt(0);
        if (Character.isLowerCase(charAt)) {
            Locale locale = Locale.getDefault();
            a.r(locale, "getDefault(...)");
            valueOf = a.C0(charAt, locale);
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        String substring = O.substring(1);
        a.r(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    private final String getSystemNameForGame(Context context, Game game) {
        String string = context.getString(GameSystem.Companion.findById(game.getSystemId()).getShortTitleResId());
        a.r(string, "getString(...)");
        return string;
    }

    private final int randomColor(Object obj, int i2, float f2, float f3) {
        return ColorUtils.a(new float[]{(Math.abs(obj.hashCode() % i2) / i2) * 360.0f, f2, f3});
    }

    public static /* synthetic */ int randomColor$default(GameUtils gameUtils, Object obj, int i2, float f2, float f3, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i2 = 128;
        }
        if ((i3 & 4) != 0) {
            f2 = 0.5f;
        }
        if ((i3 & 8) != 0) {
            f3 = 0.5f;
        }
        return gameUtils.randomColor(obj, i2, f2, f3);
    }

    @NotNull
    public final TextDrawable getFallbackDrawable(@NotNull Game game) {
        a.s(game, RouterName.GAME);
        return new TextDrawable(computeTitle(game), randomColor$default(this, game.getTitle(), 0, 0.0f, 0.0f, 14, null));
    }

    @NotNull
    public final String getGameSubtitle(@NotNull Context context, @NotNull Game game) {
        String str;
        a.s(context, "context");
        a.s(game, RouterName.GAME);
        String systemNameForGame = getSystemNameForGame(context, game);
        if (game.getDeveloper() == null || !(!z0.m.Z0(r0))) {
            str = "";
        } else {
            str = "- " + game.getDeveloper();
        }
        return systemNameForGame + ' ' + str;
    }
}
