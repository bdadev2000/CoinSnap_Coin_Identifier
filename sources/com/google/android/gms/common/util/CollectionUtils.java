package com.google.android.gms.common.util;

import Q7.n0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x.b;
import x.c;

@KeepForSdk
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k6, @NonNull V v6, @NonNull K k7, @NonNull V v9, @NonNull K k9, @NonNull V v10) {
        Map zza = zza(3, false);
        zza.put(k6, v6);
        zza.put(k7, v9);
        zza.put(k9, v10);
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map zza = zza(length, false);
                    for (int i9 = 0; i9 < kArr.length; i9++) {
                        zza.put(kArr[i9], vArr[i9]);
                    }
                    return Collections.unmodifiableMap(zza);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException(n0.e(length, length2, "Key and values array lengths not equal: ", " != "));
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i9) {
        if (i9 == 0) {
            return new c(0);
        }
        return zzb(i9, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t9, @NonNull T t10, @NonNull T t11) {
        Set zzb = zzb(3, false);
        zzb.add(t9);
        zzb.add(t10);
        zzb.add(t11);
        return Collections.unmodifiableSet(zzb);
    }

    private static Map zza(int i9, boolean z8) {
        if (i9 <= 256) {
            return new b(i9);
        }
        return new HashMap(i9, 1.0f);
    }

    private static Set zzb(int i9, boolean z8) {
        int i10;
        float f9;
        if (true != z8) {
            i10 = NotificationCompat.FLAG_LOCAL_ONLY;
        } else {
            i10 = 128;
        }
        if (i9 <= i10) {
            return new c(i9);
        }
        if (true != z8) {
            f9 = 1.0f;
        } else {
            f9 = 0.75f;
        }
        return new HashSet(i9, f9);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t9) {
        return Collections.singletonList(t9);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k6, @NonNull V v6, @NonNull K k7, @NonNull V v9, @NonNull K k9, @NonNull V v10, @NonNull K k10, @NonNull V v11, @NonNull K k11, @NonNull V v12, @NonNull K k12, @NonNull V v13) {
        Map zza = zza(6, false);
        zza.put(k6, v6);
        zza.put(k7, v9);
        zza.put(k9, v10);
        zza.put(k10, v11);
        zza.put(k11, v12);
        zza.put(k12, v13);
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t9 = tArr[0];
            T t10 = tArr[1];
            Set zzb = zzb(2, false);
            zzb.add(t9);
            zzb.add(t10);
            return Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zzb2 = zzb(length, false);
            Collections.addAll(zzb2, tArr);
            return Collections.unmodifiableSet(zzb2);
        }
        T t11 = tArr[0];
        T t12 = tArr[1];
        T t13 = tArr[2];
        T t14 = tArr[3];
        Set zzb3 = zzb(4, false);
        zzb3.add(t11);
        zzb3.add(t12);
        zzb3.add(t13);
        zzb3.add(t14);
        return Collections.unmodifiableSet(zzb3);
    }
}
