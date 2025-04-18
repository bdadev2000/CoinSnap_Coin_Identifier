package com.applovin.impl;

import com.applovin.impl.we;

/* loaded from: classes.dex */
public abstract class ua implements we.b {
    public final String a;

    public ua(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }
}
