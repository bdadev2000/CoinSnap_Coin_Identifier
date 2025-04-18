package org.koin.core.logger;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public abstract class Logger {

    @NotNull
    private Level level;

    public Logger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void debug(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        log(Level.DEBUG, str);
    }

    public abstract void display(@NotNull Level level, @NotNull String str);

    public final void error(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        log(Level.ERROR, str);
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    public final void info(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        log(Level.INFO, str);
    }

    public final boolean isAt(@NotNull Level level) {
        a.s(level, "lvl");
        return this.level.compareTo(level) <= 0;
    }

    public final void log(@NotNull Level level, @NotNull String str) {
        a.s(level, "lvl");
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        if (isAt(level)) {
            display(level, str);
        }
    }

    public final void setLevel(@NotNull Level level) {
        a.s(level, "<set-?>");
        this.level = level;
    }

    public final void warn(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        log(Level.WARNING, str);
    }

    public Logger(@NotNull Level level) {
        a.s(level, "level");
        this.level = level;
    }

    public final void log(@NotNull Level level, @NotNull q0.a aVar) {
        a.s(level, "lvl");
        a.s(aVar, SDKConstants.PARAM_DEBUG_MESSAGE);
        if (isAt(level)) {
            display(level, (String) aVar.invoke());
        }
    }

    public /* synthetic */ Logger(Level level, int i2, k kVar) {
        this((i2 & 1) != 0 ? Level.INFO : level);
    }
}
