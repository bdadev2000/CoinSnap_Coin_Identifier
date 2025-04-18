package com.cooldev.gba.emulator.gameboy.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class GameDBManager$dbInstance$2 extends r implements a {
    final /* synthetic */ GameDBManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDBManager$dbInstance$2(GameDBManager gameDBManager) {
        super(0);
        this.this$0 = gameDBManager;
    }

    @Override // q0.a
    @NotNull
    public final GameDatabase invoke() {
        Context context;
        context = this.this$0.context;
        RoomDatabase.Builder a2 = Room.a(context, GameDatabase.class, "gba-db");
        a2.f21337r = "gba-db.sqlite";
        a2.f21331l = false;
        a2.f21332m = true;
        return (GameDatabase) a2.b();
    }
}
