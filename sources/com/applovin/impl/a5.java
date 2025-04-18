package com.applovin.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a5 {
    public ab a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return n2.a(z4.f9320t, (ArrayList) a1.a(readBundle.getParcelableArrayList(com.mbridge.msdk.foundation.controller.a.a)));
    }
}
