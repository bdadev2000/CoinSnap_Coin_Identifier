package androidx.annotation;

import d0.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: attributeId */
/* JADX WARN: Method from annotation default annotation not found: enumMapping */
/* JADX WARN: Method from annotation default annotation not found: flagMapping */
/* JADX WARN: Method from annotation default annotation not found: hasAttributeId */
/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: valueType */
@Target({ElementType.METHOD})
@a
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface InspectableProperty {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface EnumEntry {
    }

    /* JADX WARN: Method from annotation default annotation not found: mask */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface FlagEntry {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class ValueType {

        /* renamed from: a, reason: collision with root package name */
        public static final ValueType f304a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ValueType[] f305b;

        /* JADX INFO: Fake field, exist only in values array */
        ValueType EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r4v2, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r5v2, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r6v2, types: [androidx.annotation.InspectableProperty$ValueType, java.lang.Enum] */
        static {
            ?? r02 = new Enum("NONE", 0);
            ?? r1 = new Enum("INFERRED", 1);
            f304a = r1;
            f305b = new ValueType[]{r02, r1, new Enum("INT_ENUM", 2), new Enum("INT_FLAG", 3), new Enum("COLOR", 4), new Enum("GRAVITY", 5), new Enum("RESOURCE_ID", 6)};
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) f305b.clone();
        }
    }
}
