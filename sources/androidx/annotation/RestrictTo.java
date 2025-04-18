package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Scope {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Scope[] f308a = {new Enum("LIBRARY", 0), new Enum("LIBRARY_GROUP", 1), new Enum("LIBRARY_GROUP_PREFIX", 2), new Enum("GROUP_ID", 3), new Enum("TESTS", 4), new Enum("SUBCLASSES", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Scope EF5;

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) f308a.clone();
        }
    }
}
