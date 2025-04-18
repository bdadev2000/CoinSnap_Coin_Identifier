package androidx.room;

import androidx.annotation.RequiresApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: collate */
/* JADX WARN: Method from annotation default annotation not found: defaultValue */
/* JADX WARN: Method from annotation default annotation not found: index */
/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: typeAffinity */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface ColumnInfo {

    @RequiresApi
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface Collate {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface SQLiteTypeAffinity {
    }
}
