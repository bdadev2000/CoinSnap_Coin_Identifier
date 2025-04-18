package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: orders */
/* JADX WARN: Method from annotation default annotation not found: unique */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface Index {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Order {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Order[] f21272a = {new Enum("ASC", 0), new Enum("DESC", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Order EF5;

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f21272a.clone();
        }
    }
}
