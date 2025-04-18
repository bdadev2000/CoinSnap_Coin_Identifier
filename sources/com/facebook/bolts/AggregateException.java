package com.facebook.bolts;

import e0.w;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class AggregateException extends Exception {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;

    @NotNull
    private final List<Throwable> innerThrowables;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public AggregateException(@Nullable String str, @Nullable List<? extends Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : list.get(0));
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? w.f30218a : list);
        p0.a.r(unmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.innerThrowables = unmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintStream printStream) {
        p0.a.s(printStream, "err");
        super.printStackTrace(printStream);
        int i2 = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i2++;
            printStream.append((CharSequence) String.valueOf(i2));
            printStream.append(": ");
            if (th != null) {
                th.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintWriter printWriter) {
        p0.a.s(printWriter, "err");
        super.printStackTrace(printWriter);
        int i2 = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i2++;
            printWriter.append((CharSequence) String.valueOf(i2));
            printWriter.append(": ");
            if (th != null) {
                th.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
