package com.google.android.gms.ads.internal.util.client;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class zzn {
    public static boolean zza(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj != null && obj2 != null) {
                    if (obj instanceof Bundle) {
                        if (!(obj2 instanceof Bundle) || !zza((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if (obj.getClass().isArray()) {
                        int length = Array.getLength(obj);
                        if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                            return false;
                        }
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!Objects.equal(Array.get(obj, i10), Array.get(obj2, i10))) {
                                return false;
                            }
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    bundle2 = obj2;
                    bundle = obj;
                }
            }
            return true;
        }
        if (bundle == null && bundle2 == null) {
            return true;
        }
        return false;
    }
}
