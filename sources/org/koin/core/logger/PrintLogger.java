package org.koin.core.logger;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.PrintStream;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class PrintLogger extends Logger {
    private final PrintStream printer;

    public PrintLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // org.koin.core.logger.Logger
    public void display(@NotNull Level level, @NotNull String str) {
        a.s(level, "level");
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        this.printer.println("[" + level + "] [Koin] " + str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrintLogger(@NotNull Level level) {
        super(level);
        a.s(level, "level");
        this.printer = level.compareTo(Level.WARNING) >= 0 ? System.err : System.out;
    }

    public /* synthetic */ PrintLogger(Level level, int i2, k kVar) {
        this((i2 & 1) != 0 ? Level.INFO : level);
    }
}
