package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@KeepForSdk
/* loaded from: classes3.dex */
public final class Objects {

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        public /* synthetic */ ToStringHelper(Object obj, zzai zzaiVar) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        @NonNull
        @KeepForSdk
        public ToStringHelper add(@NonNull String str, @Nullable Object obj) {
            Preconditions.checkNotNull(str);
            this.zza.add(a.m(str, "=", String.valueOf(obj)));
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.zzb.getClass().getSimpleName());
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            int size = this.zza.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.zza.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!equal(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        }
        if (bundle == bundle2) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int hashCode(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @KeepForSdk
    public static ToStringHelper toStringHelper(@NonNull Object obj) {
        return new ToStringHelper(obj, null);
    }
}
