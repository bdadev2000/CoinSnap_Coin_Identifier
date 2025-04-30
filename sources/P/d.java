package P;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d {
    public static <T> T a(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }

    public static <T> T[] b(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        return (T[]) bundle.getParcelableArray(str, cls);
    }

    public static <T> ArrayList<T> c(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static <T extends Serializable> T d(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        return (T) bundle.getSerializable(str, cls);
    }

    public static <T> SparseArray<T> e(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }
}
