package a9;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import v8.u0;

/* loaded from: classes3.dex */
public final class f implements i {
    public final ni.a a = new ni.a();

    /* renamed from: b, reason: collision with root package name */
    public final l f388b = new l();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f389c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f390d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f391e;

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f389c.addFirst(new d(this, 0));
        }
        this.f390d = 0;
    }

    @Override // w7.e
    public final void a(l lVar) {
        boolean z10;
        boolean z11 = true;
        u0.m(!this.f391e);
        if (this.f390d == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        if (this.f388b != lVar) {
            z11 = false;
        }
        u0.d(z11);
        this.f390d = 2;
    }

    @Override // w7.e
    public final Object dequeueInputBuffer() {
        u0.m(!this.f391e);
        if (this.f390d != 0) {
            return null;
        }
        this.f390d = 1;
        return this.f388b;
    }

    @Override // w7.e
    public final Object dequeueOutputBuffer() {
        u0.m(!this.f391e);
        if (this.f390d == 2) {
            ArrayDeque arrayDeque = this.f389c;
            if (!arrayDeque.isEmpty()) {
                m mVar = (m) arrayDeque.removeFirst();
                l lVar = this.f388b;
                if (lVar.c(4)) {
                    mVar.a(4);
                } else {
                    long j3 = lVar.f26892h;
                    ByteBuffer byteBuffer = lVar.f26890f;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    this.a.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList(com.mbridge.msdk.foundation.controller.a.a);
                    parcelableArrayList.getClass();
                    mVar.f(lVar.f26892h, new e(j3, u0.v(b.L, parcelableArrayList)), 0L);
                }
                lVar.e();
                this.f390d = 0;
                return mVar;
            }
        }
        return null;
    }

    @Override // w7.e
    public final void flush() {
        u0.m(!this.f391e);
        this.f388b.e();
        this.f390d = 0;
    }

    @Override // w7.e
    public final void release() {
        this.f391e = true;
    }

    @Override // a9.i
    public final void setPositionUs(long j3) {
    }
}
