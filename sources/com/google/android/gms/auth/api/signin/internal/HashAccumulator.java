package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class HashAccumulator {
    private int zaa = 1;

    @NonNull
    @KeepForSdk
    public HashAccumulator addObject(@Nullable Object obj) {
        int hashCode;
        int i9 = this.zaa * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.zaa = i9 + hashCode;
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @NonNull
    public final HashAccumulator zaa(boolean z8) {
        this.zaa = (this.zaa * 31) + (z8 ? 1 : 0);
        return this;
    }
}
