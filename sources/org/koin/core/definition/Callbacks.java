package org.koin.core.definition;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class Callbacks<T> {

    @Nullable
    private final l onClose;

    public Callbacks() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Callbacks copy$default(Callbacks callbacks, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = callbacks.onClose;
        }
        return callbacks.copy(lVar);
    }

    @Nullable
    public final l component1() {
        return this.onClose;
    }

    @NotNull
    public final Callbacks<T> copy(@Nullable l lVar) {
        return new Callbacks<>(lVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Callbacks) && a.g(this.onClose, ((Callbacks) obj).onClose);
    }

    @Nullable
    public final l getOnClose() {
        return this.onClose;
    }

    public int hashCode() {
        l lVar = this.onClose;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @NotNull
    public String toString() {
        return "Callbacks(onClose=" + this.onClose + ')';
    }

    public Callbacks(@Nullable l lVar) {
        this.onClose = lVar;
    }

    public /* synthetic */ Callbacks(l lVar, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : lVar);
    }
}
