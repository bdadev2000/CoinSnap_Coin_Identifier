package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class vk extends sk {
    public static final Parcelable.Creator<vk> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vk[] newArray(int i2) {
            return new vk[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vk createFromParcel(Parcel parcel) {
            return new vk();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
