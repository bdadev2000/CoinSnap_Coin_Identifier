package com.swordfish.libretrodroid;

import android.support.v4.media.d;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Controller {

    @Nullable
    private final String description;
    private final int id;

    public Controller() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Controller copy$default(Controller controller, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = controller.id;
        }
        if ((i3 & 2) != 0) {
            str = controller.description;
        }
        return controller.copy(i2, str);
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final Controller copy(int i2, @Nullable String str) {
        return new Controller(i2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Controller)) {
            return false;
        }
        Controller controller = (Controller) obj;
        return this.id == controller.id && p0.a.g(this.description, controller.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Controller(id=");
        sb.append(this.id);
        sb.append(", description=");
        return d.q(sb, this.description, ')');
    }

    public Controller(int i2, @Nullable String str) {
        this.id = i2;
        this.description = str;
    }

    public /* synthetic */ Controller(int i2, String str, int i3, k kVar) {
        this((i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? null : str);
    }
}
