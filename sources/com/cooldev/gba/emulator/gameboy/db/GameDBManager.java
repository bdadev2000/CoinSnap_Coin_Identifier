package com.cooldev.gba.emulator.gameboy.db;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import d0.h;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class GameDBManager {

    @NotNull
    private static final String DB_NAME = "gba-db";

    @NotNull
    private final Context context;

    @NotNull
    private final h dbInstance$delegate;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public GameDBManager(@NotNull Context context) {
        a.s(context, "context");
        this.context = context;
        this.dbInstance$delegate = f0.t(new GameDBManager$dbInstance$2(this));
    }

    @NotNull
    public final GameDatabase getDbInstance() {
        return (GameDatabase) this.dbInstance$delegate.getValue();
    }
}
