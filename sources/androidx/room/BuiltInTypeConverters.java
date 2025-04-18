package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: byteBuffer */
/* JADX WARN: Method from annotation default annotation not found: enums */
/* JADX WARN: Method from annotation default annotation not found: uuid */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface BuiltInTypeConverters {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f21224a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f21225b;

        /* JADX INFO: Fake field, exist only in values array */
        State EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.room.BuiltInTypeConverters$State] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.room.BuiltInTypeConverters$State] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.room.BuiltInTypeConverters$State] */
        static {
            ?? r02 = new Enum("ENABLED", 0);
            ?? r1 = new Enum("DISABLED", 1);
            ?? r2 = new Enum("INHERITED", 2);
            f21224a = r2;
            f21225b = new State[]{r02, r1, r2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f21225b.clone();
        }
    }
}
