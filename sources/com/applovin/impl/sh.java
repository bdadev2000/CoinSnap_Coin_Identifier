package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sh extends ua {
    public static final Parcelable.Creator<sh> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11192c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh[] newArray(int i9) {
            return new sh[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh createFromParcel(Parcel parcel) {
            return new sh(parcel);
        }
    }

    public sh(Parcel parcel) {
        super(PrivFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f11192c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sh.class != obj.getClass()) {
            return false;
        }
        sh shVar = (sh) obj;
        if (yp.a((Object) this.b, (Object) shVar.b) && Arrays.equals(this.f11192c, shVar.f11192c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        String str = this.b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return Arrays.hashCode(this.f11192c) + ((i9 + 527) * 31);
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.f11192c);
    }

    public sh(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.b = str;
        this.f11192c = bArr;
    }
}
