package com.applovin.impl;

import com.applovin.impl.we;

/* loaded from: classes.dex */
public abstract class pk implements we.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
