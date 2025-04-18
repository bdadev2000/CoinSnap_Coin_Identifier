package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class sk extends pk {
    public static final Parcelable.Creator<sk> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sk[] newArray(int i10) {
            return new sk[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sk createFromParcel(Parcel parcel) {
            return new sk();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
