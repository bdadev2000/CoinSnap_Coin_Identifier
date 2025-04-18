package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: level */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface RequiresOptIn {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Level {

        /* renamed from: a, reason: collision with root package name */
        public static final Level f306a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Level[] f307b;

        /* JADX INFO: Fake field, exist only in values array */
        Level EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.annotation.RequiresOptIn$Level, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.annotation.RequiresOptIn$Level, java.lang.Enum] */
        static {
            ?? r02 = new Enum("WARNING", 0);
            ?? r1 = new Enum("ERROR", 1);
            f306a = r1;
            f307b = new Level[]{r02, r1};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f307b.clone();
        }
    }
}
