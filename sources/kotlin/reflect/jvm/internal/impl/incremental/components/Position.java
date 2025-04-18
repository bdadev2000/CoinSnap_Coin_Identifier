package kotlin.reflect.jvm.internal.impl.incremental.components;

import a4.j;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class Position implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Position getNO_POSITION() {
            return Position.NO_POSITION;
        }
    }

    public Position(int i10, int i11) {
        this.line = i10;
        this.column = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return Integer.hashCode(this.column) + (Integer.hashCode(this.line) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Position(line=");
        sb2.append(this.line);
        sb2.append(", column=");
        return j.i(sb2, this.column, ')');
    }
}
