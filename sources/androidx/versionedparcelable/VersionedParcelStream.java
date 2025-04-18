package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;

@RestrictTo
/* loaded from: classes3.dex */
class VersionedParcelStream extends VersionedParcel {

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f21733m = Charset.forName("UTF-16");
    public final DataInputStream d;
    public final DataOutputStream e;

    /* renamed from: f, reason: collision with root package name */
    public final DataInputStream f21734f;

    /* renamed from: g, reason: collision with root package name */
    public DataOutputStream f21735g;

    /* renamed from: h, reason: collision with root package name */
    public FieldBuffer f21736h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21737i;

    /* renamed from: j, reason: collision with root package name */
    public int f21738j;

    /* renamed from: k, reason: collision with root package name */
    public int f21739k;

    /* renamed from: l, reason: collision with root package name */
    public int f21740l;

    /* loaded from: classes3.dex */
    public static class FieldBuffer {

        /* renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f21742a;

        /* renamed from: b, reason: collision with root package name */
        public final DataOutputStream f21743b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21744c;
        public final DataOutputStream d;

        public FieldBuffer(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f21742a = byteArrayOutputStream;
            this.f21743b = new DataOutputStream(byteArrayOutputStream);
            this.f21744c = i2;
            this.d = dataOutputStream;
        }
    }

    public VersionedParcelStream(DataInputStream dataInputStream, DataOutputStream dataOutputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f21738j = 0;
        this.f21739k = -1;
        this.f21740l = -1;
        DataInputStream dataInputStream2 = dataInputStream != null ? new DataInputStream(new FilterInputStream(dataInputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f21740l;
                if (i2 != -1 && versionedParcelStream.f21738j >= i2) {
                    throw new IOException();
                }
                int read = super.read();
                versionedParcelStream.f21738j++;
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j2) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f21740l;
                if (i2 != -1 && versionedParcelStream.f21738j >= i2) {
                    throw new IOException();
                }
                long skip = super.skip(j2);
                if (skip > 0) {
                    versionedParcelStream.f21738j += (int) skip;
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i4 = versionedParcelStream.f21740l;
                if (i4 != -1 && versionedParcelStream.f21738j >= i4) {
                    throw new IOException();
                }
                int read = super.read(bArr, i2, i3);
                if (read > 0) {
                    versionedParcelStream.f21738j += read;
                }
                return read;
            }
        }) : null;
        this.d = dataInputStream2;
        DataOutputStream dataOutputStream2 = dataOutputStream != null ? new DataOutputStream(dataOutputStream) : null;
        this.e = dataOutputStream2;
        this.f21734f = dataInputStream2;
        this.f21735g = dataOutputStream2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        FieldBuffer fieldBuffer = this.f21736h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f21742a.size() != 0) {
                    FieldBuffer fieldBuffer2 = this.f21736h;
                    fieldBuffer2.f21743b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = fieldBuffer2.f21742a;
                    int size = byteArrayOutputStream.size();
                    int i2 = fieldBuffer2.f21744c << 16;
                    int i3 = size >= 65535 ? 65535 : size;
                    DataOutputStream dataOutputStream = fieldBuffer2.d;
                    dataOutputStream.writeInt(i2 | i3);
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f21736h = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        return new VersionedParcelStream(this.f21734f, this.f21735g, this.f21724a, this.f21725b, this.f21726c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        try {
            return this.f21734f.readBoolean();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        DataInputStream dataInputStream = this.f21734f;
        try {
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i2) {
        while (true) {
            try {
                int i3 = this.f21739k;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                int i4 = this.f21738j;
                int i5 = this.f21740l;
                DataInputStream dataInputStream = this.d;
                if (i4 < i5) {
                    dataInputStream.skip(i5 - i4);
                }
                this.f21740l = -1;
                int readInt = dataInputStream.readInt();
                this.f21738j = 0;
                int i6 = readInt & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i6 == 65535) {
                    i6 = dataInputStream.readInt();
                }
                this.f21739k = (readInt >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                this.f21740l = i6;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        try {
            return this.f21734f.readInt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        DataInputStream dataInputStream = this.f21734f;
        try {
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            return new String(bArr, f21733m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i2) {
        a();
        FieldBuffer fieldBuffer = new FieldBuffer(i2, this.e);
        this.f21736h = fieldBuffer;
        this.f21735g = fieldBuffer.f21743b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(boolean z2, boolean z3) {
        if (!z2) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f21737i = z3;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z2) {
        try {
            this.f21735g.writeBoolean(z2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f21735g.writeInt(bArr.length);
                this.f21735g.write(bArr);
            } else {
                this.f21735g.writeInt(-1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        if (!this.f21737i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i2) {
        try {
            this.f21735g.writeInt(i2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        if (!this.f21737i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f21733m);
                this.f21735g.writeInt(bytes.length);
                this.f21735g.write(bytes);
            } else {
                this.f21735g.writeInt(-1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
