package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f19167a;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19168a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19168a = iArr;
            try {
                iArr[WireFormat.FieldType.f19407k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19168a[WireFormat.FieldType.f19406j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19168a[WireFormat.FieldType.f19404h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19168a[WireFormat.FieldType.f19414r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19168a[WireFormat.FieldType.f19416t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19168a[WireFormat.FieldType.f19412p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19168a[WireFormat.FieldType.f19405i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19168a[WireFormat.FieldType.f19402f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19168a[WireFormat.FieldType.f19415s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19168a[WireFormat.FieldType.f19417u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19168a[WireFormat.FieldType.f19403g.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19168a[WireFormat.FieldType.f19408l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Charset charset = Internal.f19251a;
        if (codedOutputStream == null) {
            throw new NullPointerException(AgentOptions.OUTPUT);
        }
        this.f19167a = codedOutputStream;
        codedOutputStream.f19163a = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void A(int i2, Object obj) {
        this.f19167a.y0(i2, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void B(float f2, int i2) {
        CodedOutputStream codedOutputStream = this.f19167a;
        codedOutputStream.getClass();
        codedOutputStream.c(i2, Float.floatToRawIntBits(f2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void C(int i2, long j2) {
        this.f19167a.g(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void D(int i2, boolean z2) {
        this.f19167a.D(i2, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void E(int i2, int i3) {
        this.f19167a.c(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void F(int i2) {
        this.f19167a.E0(i2, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void G(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.x(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            Logger logger = CodedOutputStream.f19161b;
            i4 += 8;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.w0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void H(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.c(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            Logger logger = CodedOutputStream.f19161b;
            i4 += 4;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.v0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void I(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.D(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).booleanValue();
            Logger logger = CodedOutputStream.f19161b;
            i4++;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.s0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void J(int i2) {
        this.f19167a.E0(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void K(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.u(i2, CodedOutputStream.p0(((Integer) list.get(i3)).intValue()));
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m0(CodedOutputStream.p0(((Integer) list.get(i5)).intValue()));
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.F0(CodedOutputStream.p0(((Integer) list.get(i3)).intValue()));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void L(int i2, int i3) {
        this.f19167a.i(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void M(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.g(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.o0(((Long) list.get(i5)).longValue());
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.G0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void N(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                double doubleValue = ((Double) list.get(i3)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.x(i2, Double.doubleToRawLongBits(doubleValue));
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).doubleValue();
            Logger logger = CodedOutputStream.f19161b;
            i4 += 8;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.w0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void O(int i2, int i3) {
        this.f19167a.u(i2, CodedOutputStream.p0(i3));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void P(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f19167a.k(i2, (ByteString) list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                float floatValue = ((Float) list.get(i3)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.c(i2, Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).floatValue();
            Logger logger = CodedOutputStream.f19161b;
            i4 += 4;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.v0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i2, Object obj) {
        boolean z2 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (z2) {
            codedOutputStream.C0(i2, (ByteString) obj);
        } else {
            codedOutputStream.B0(i2, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void c(int i2, int i3) {
        this.f19167a.c(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i2, List list) {
        boolean z2 = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = this.f19167a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.f(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i3 < list.size()) {
            Object F = lazyStringList.F(i3);
            if (F instanceof String) {
                codedOutputStream.f(i2, (String) F);
            } else {
                codedOutputStream.k(i2, (ByteString) F);
            }
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void e(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            p(i2, schema, list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void f(int i2, String str) {
        this.f19167a.f(i2, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void g(int i2, long j2) {
        this.f19167a.g(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void h(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.i(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.b0(((Integer) list.get(i5)).intValue());
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.x0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void i(int i2, int i3) {
        this.f19167a.i(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void j(double d, int i2) {
        CodedOutputStream codedOutputStream = this.f19167a;
        codedOutputStream.getClass();
        codedOutputStream.x(i2, Double.doubleToRawLongBits(d));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void k(int i2, ByteString byteString) {
        this.f19167a.k(i2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void l(int i2, long j2) {
        this.f19167a.x(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void m(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.c(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            Logger logger = CodedOutputStream.f19161b;
            i4 += 4;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.v0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void n(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.u(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m0(((Integer) list.get(i5)).intValue());
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.F0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void o(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.g(i2, CodedOutputStream.q0(((Long) list.get(i3)).longValue()));
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.o0(CodedOutputStream.q0(((Long) list.get(i5)).longValue()));
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.G0(CodedOutputStream.q0(((Long) list.get(i3)).longValue()));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void p(int i2, Schema schema, Object obj) {
        CodedOutputStream codedOutputStream = this.f19167a;
        codedOutputStream.E0(i2, 3);
        schema.h((MessageLite) obj, codedOutputStream.f19163a);
        codedOutputStream.E0(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void q(int i2, long j2) {
        this.f19167a.g(i2, CodedOutputStream.q0(j2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void r(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.i(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.b0(((Integer) list.get(i5)).intValue());
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.x0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void s(int i2, MapEntryLite.Metadata metadata, Map map) {
        CodedOutputStream codedOutputStream = this.f19167a;
        codedOutputStream.getClass();
        for (Map.Entry entry : map.entrySet()) {
            codedOutputStream.E0(i2, 2);
            codedOutputStream.F0(MapEntryLite.a(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.b(codedOutputStream, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void t(int i2, Schema schema, Object obj) {
        this.f19167a.z0(i2, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void u(int i2, int i3) {
        this.f19167a.u(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void v(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.x(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            Logger logger = CodedOutputStream.f19161b;
            i4 += 8;
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.w0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void w(int i2, List list, boolean z2) {
        int i3 = 0;
        CodedOutputStream codedOutputStream = this.f19167a;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.g(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        codedOutputStream.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.o0(((Long) list.get(i5)).longValue());
        }
        codedOutputStream.F0(i4);
        while (i3 < list.size()) {
            codedOutputStream.G0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void x(int i2, long j2) {
        this.f19167a.x(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder y() {
        return Writer.FieldOrder.f19432a;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void z(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            t(i2, schema, list.get(i3));
        }
    }
}
