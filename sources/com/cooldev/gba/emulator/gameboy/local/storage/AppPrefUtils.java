package com.cooldev.gba.emulator.gameboy.local.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import d0.m;
import d0.n;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AppPrefUtils {

    @NotNull
    public static final AppPrefUtils INSTANCE = new AppPrefUtils();

    @NotNull
    private static final Gson gson = new Gson();
    public static final int $stable = 8;

    private AppPrefUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [d0.m, java.lang.Object] */
    private final <T> T getObject(SharedPreferences sharedPreferences, String str, T t2) {
        if (sharedPreferences.getString(str, null) == null) {
            return t2;
        }
        try {
            a.A0();
            throw null;
        } catch (Throwable th) {
            ?? d = q.d(th);
            Throwable a2 = n.a(d);
            T t3 = d;
            if (a2 != null) {
                Log.e("AppPrefUtils", "Error deserializing object for key: " + str, a2);
                t3 = t2;
            }
            return t3 == null ? t2 : t3;
        }
    }

    private final SharedPreferences getPrefs(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        a.r(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private final /* synthetic */ <T> void saveObject(SharedPreferences sharedPreferences, String str, T t2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, gson.toJson(t2));
        edit.apply();
    }

    public final boolean addGamePadTheme(@NotNull Context context, @NotNull GamePadTheme gamePadTheme) {
        Object d;
        a.s(context, "context");
        a.s(gamePadTheme, RouterName.THEME);
        try {
            SharedPreferences prefs = getPrefs(context);
            String key = AppPrefKeys.GAME_PAD_THEME.getKey();
            SharedPreferences.Editor edit = prefs.edit();
            edit.putString(key, gson.toJson(gamePadTheme));
            edit.apply();
            d = Boolean.TRUE;
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    @NotNull
    public final GamePadTheme getGamePadTheme(@NotNull Context context) {
        Object d;
        Object d2;
        a.s(context, "context");
        try {
            SharedPreferences prefs = getPrefs(context);
            String key = AppPrefKeys.GAME_PAD_THEME.getKey();
            Object obj = GamePadTheme.Default;
            String string = prefs.getString(key, null);
            if (string != null) {
                try {
                    d2 = gson.fromJson(string, new TypeToken<GamePadTheme>() { // from class: com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils$getGamePadTheme$lambda$12$$inlined$getObject$1
                    }.getType());
                } catch (Throwable th) {
                    d2 = q.d(th);
                }
                Throwable a2 = n.a(d2);
                if (a2 != null) {
                    Log.e("AppPrefUtils", "Error deserializing object for key: " + key, a2);
                    d2 = obj;
                }
                if (d2 != null) {
                    obj = d2;
                }
            }
            d = (GamePadTheme) obj;
        } catch (Throwable th2) {
            d = q.d(th2);
        }
        Object obj2 = GamePadTheme.Default;
        if (d instanceof m) {
            d = obj2;
        }
        return (GamePadTheme) d;
    }

    public final boolean getValueFirstOpen(@NotNull Context context) {
        Object d;
        a.s(context, "context");
        try {
            d = Boolean.valueOf(context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppPrefKeys.FIRST_OPEN.getKey(), true));
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final boolean getValueOnboardingVisible(@NotNull Context context) {
        Object d;
        a.s(context, "context");
        try {
            d = Boolean.valueOf(context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppPrefKeys.ONBOARDING_VISIBLE.getKey(), true));
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final boolean getValueRatingHomeVisible(@NotNull Context context) {
        Object d;
        a.s(context, "context");
        try {
            d = Boolean.valueOf(context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppPrefKeys.HOME_RATING_DIALOG_VISIBLE.getKey(), true));
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final boolean getValueShouldShowUserGuide(@NotNull Context context) {
        Object d;
        a.s(context, "context");
        try {
            d = Boolean.valueOf(context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppPrefKeys.SHOULD_SHOW_GUIDE.getKey(), true));
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final boolean hasCheckedForUpdate(@NotNull Context context) {
        Object d;
        a.s(context, "context");
        try {
            d = Boolean.valueOf(context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppPrefKeys.HAS_CHECKED_FOR_UPDATE.getKey(), false));
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final void hideHomeRatingDialog(@NotNull Context context) {
        a.s(context, "context");
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
            edit.putBoolean(AppPrefKeys.HOME_RATING_DIALOG_VISIBLE.getKey(), false);
            edit.apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final boolean isSurveyDialogShown(@NotNull Context context) {
        Object d;
        a.s(context, "context");
        try {
            d = Boolean.valueOf(context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppPrefKeys.SURVEY_DIALOG_SHOWN.getKey(), true));
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final void setHasCheckedForUpdate(@NotNull Context context, boolean z2) {
        a.s(context, "context");
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
            edit.putBoolean(AppPrefKeys.HAS_CHECKED_FOR_UPDATE.getKey(), z2);
            edit.apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setSurveyDialogShown(@NotNull Context context, boolean z2) {
        a.s(context, "context");
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
            edit.putBoolean(AppPrefKeys.SURVEY_DIALOG_SHOWN.getKey(), z2);
            edit.apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setValueFirstOpen(@NotNull Context context) {
        a.s(context, "context");
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
            edit.putBoolean(AppPrefKeys.FIRST_OPEN.getKey(), false);
            edit.apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setValueOnboardingVisible(@NotNull Context context, boolean z2) {
        a.s(context, "context");
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
            edit.putBoolean(AppPrefKeys.ONBOARDING_VISIBLE.getKey(), z2);
            edit.apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setValueShouldShowUserGuide(@NotNull Context context) {
        a.s(context, "context");
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
            edit.putBoolean(AppPrefKeys.SHOULD_SHOW_GUIDE.getKey(), false);
            edit.apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }
}
