package t9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.j3;

/* loaded from: classes3.dex */
public final class a extends w0.b {
    public static final Parcelable.Creator<a> CREATOR = new j3(8);

    /* renamed from: d, reason: collision with root package name */
    public boolean f25361d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25362f;

    /* renamed from: g, reason: collision with root package name */
    public int f25363g;

    /* renamed from: h, reason: collision with root package name */
    public float f25364h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25365i;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        boolean z11;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25361d = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25362f = z11;
        this.f25363g = parcel.readInt();
        this.f25364h = parcel.readFloat();
        this.f25365i = parcel.readByte() != 0;
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeByte(this.f25361d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25362f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25363g);
        parcel.writeFloat(this.f25364h);
        parcel.writeByte(this.f25365i ? (byte) 1 : (byte) 0);
    }
}
