package com.cooldev.gba.emulator.gameboy.local.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import d0.m;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class GamePrefUtils {

    @NotNull
    public static final GamePrefUtils INSTANCE = new GamePrefUtils();

    @NotNull
    private static final Gson gson = new Gson();
    public static final int $stable = 8;

    private GamePrefUtils() {
    }

    private final <T> T getObject(SharedPreferences sharedPreferences, String str, T t2) {
        if (sharedPreferences.getString(str, null) != null) {
            try {
                a.A0();
                throw null;
            } catch (Throwable th) {
                new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
                Log.e("GamePrefUtils", "Error deserializing object", th);
            }
        }
        return t2;
    }

    private final SharedPreferences getPrefs(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        a.r(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private final <T> void saveObject(SharedPreferences sharedPreferences, String str, T t2) {
        try {
            sharedPreferences.edit().putString(str, gson.toJson(t2)).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    private final boolean updateGame(Context context, String str, l lVar) {
        Object d;
        try {
            ArrayList b12 = u.b1(getAllGames(context));
            Iterator it = b12.iterator();
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (a.g(((Game) it.next()).getId(), str)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                b12.set(i2, lVar.invoke(b12.get(i2)));
                saveObject(getPrefs(context), GamePrefKeys.LIST_GAME.getKey(), b12);
                z2 = true;
            }
            d = Boolean.valueOf(z2);
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public static /* synthetic */ boolean updateGameAutoSave$default(GamePrefUtils gamePrefUtils, Context context, String str, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        return gamePrefUtils.updateGameAutoSave(context, str, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<Game> addUniqueGamesToList(@NotNull Context context, @NotNull List<Game> list) {
        m mVar;
        a.s(context, "context");
        a.s(list, "newGames");
        try {
            ArrayList b12 = u.b1(getAllGames(context));
            ArrayList arrayList = new ArrayList(e0.q.M(b12, 10));
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                arrayList.add(((Game) it.next()).getFileUri());
            }
            Set e12 = u.e1(arrayList);
            ArrayList arrayList2 = new ArrayList(e0.q.M(b12, 10));
            Iterator it2 = b12.iterator();
            while (it2.hasNext()) {
                Game game = (Game) it2.next();
                arrayList2.add(new GameDistinct(game.getDeveloper(), game.getTitle(), game.getCoverFrontUrl()));
            }
            Set e13 = u.e1(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                Game game2 = (Game) obj;
                if (!e12.contains(game2.getFileUri()) && !e13.contains(new GameDistinct(game2.getDeveloper(), game2.getTitle(), game2.getCoverFrontUrl()))) {
                    arrayList3.add(obj);
                }
            }
            b12.addAll(arrayList3);
            saveObject(getPrefs(context), GamePrefKeys.LIST_GAME.getKey(), b12);
            mVar = arrayList3;
        } catch (Throwable th) {
            mVar = q.d(th);
        }
        w wVar = w.f30218a;
        boolean z2 = mVar instanceof m;
        Object obj2 = mVar;
        if (z2) {
            obj2 = wVar;
        }
        return (List) obj2;
    }

    @NotNull
    public final List<Game> getAllGames(@NotNull Context context) {
        Object obj;
        a.s(context, "context");
        SharedPreferences prefs = getPrefs(context);
        String key = GamePrefKeys.LIST_GAME.getKey();
        Object obj2 = w.f30218a;
        String string = prefs.getString(key, null);
        if (string != null) {
            try {
                obj = gson.fromJson(string, new TypeToken<List<? extends Game>>() { // from class: com.cooldev.gba.emulator.gameboy.local.storage.GamePrefUtils$getAllGames$$inlined$getObject$1
                }.getType());
            } catch (Throwable th) {
                new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
                Log.e("GamePrefUtils", "Error deserializing object", th);
                obj = obj2;
            }
            if (obj != null) {
                obj2 = obj;
            }
        }
        return (List) obj2;
    }

    public final boolean removeGame(@NotNull Context context, @NotNull String str) {
        Object d;
        a.s(context, "context");
        a.s(str, "gameId");
        try {
            ArrayList b12 = u.b1(getAllGames(context));
            Iterator it = b12.iterator();
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (a.g(((Game) it.next()).getId(), str)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                b12.remove(i2);
                saveObject(getPrefs(context), GamePrefKeys.LIST_GAME.getKey(), b12);
                z2 = true;
            }
            d = Boolean.valueOf(z2);
        } catch (Throwable th) {
            d = q.d(th);
        }
        Object obj = Boolean.FALSE;
        if (d instanceof m) {
            d = obj;
        }
        return ((Boolean) d).booleanValue();
    }

    public final boolean updateGameAudio(@NotNull Context context, @NotNull String str, boolean z2) {
        a.s(context, "context");
        a.s(str, "gameId");
        return updateGame(context, str, new GamePrefUtils$updateGameAudio$1(z2));
    }

    public final boolean updateGameAutoSave(@NotNull Context context, @NotNull String str, boolean z2, boolean z3) {
        a.s(context, "context");
        a.s(str, "gameId");
        return updateGame(context, str, new GamePrefUtils$updateGameAutoSave$1(z2, z3));
    }

    public final boolean updateGameFastForward(@NotNull Context context, @NotNull String str, boolean z2) {
        a.s(context, "context");
        a.s(str, "gameId");
        return updateGame(context, str, new GamePrefUtils$updateGameFastForward$1(z2));
    }

    public final boolean updateGameFavoriteStatus(@NotNull Context context, @NotNull String str, boolean z2) {
        a.s(context, "context");
        a.s(str, "gameId");
        return updateGame(context, str, new GamePrefUtils$updateGameFavoriteStatus$1(z2));
    }

    public final boolean updateGameLastPlayedAndTime(@NotNull Context context, @NotNull String str) {
        a.s(context, "context");
        a.s(str, "gameId");
        return updateGame(context, str, GamePrefUtils$updateGameLastPlayedAndTime$1.INSTANCE);
    }
}
