package com.applovin.impl;

import com.applovin.impl.bf;

/* loaded from: classes2.dex */
public abstract class sk implements bf.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
