package com.facebook.internal.logging.dumpsys;

import java.io.PrintWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface EndToEndDumper {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static EndToEndDumper instance;

        private Companion() {
        }

        @Nullable
        public final EndToEndDumper getInstance() {
            return instance;
        }

        public final void setInstance(@Nullable EndToEndDumper endToEndDumper) {
            instance = endToEndDumper;
        }
    }

    boolean maybeDump(@NotNull String str, @NotNull PrintWriter printWriter, @Nullable String[] strArr);
}
