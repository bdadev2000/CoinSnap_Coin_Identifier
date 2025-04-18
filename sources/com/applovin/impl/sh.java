package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sh extends ua {
    public static final Parcelable.Creator<sh> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f8028b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8029c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh[] newArray(int i10) {
            return new sh[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh createFromParcel(Parcel parcel) {
            return new sh(parcel);
        }
    }

    public sh(Parcel parcel) {
        super(PrivFrame.ID);
        this.f8028b = (String) yp.a((Object) parcel.readString());
        this.f8029c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sh.class != obj.getClass()) {
            return false;
        }
        sh shVar = (sh) obj;
        if (yp.a((Object) this.f8028b, (Object) shVar.f8028b) && Arrays.equals(this.f8029c, shVar.f8029c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f8028b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f8029c) + ((i10 + 527) * 31);
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": owner=" + this.f8028b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8028b);
        parcel.writeByteArray(this.f8029c);
    }

    public sh(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f8028b = str;
        this.f8029c = bArr;
    }
}
