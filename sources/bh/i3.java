package bh;

import androidx.core.app.NotificationCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class i3 {
    public static final b3 Companion = new b3(null);
    private final String carrier;
    private e3 ext;

    /* renamed from: h, reason: collision with root package name */
    private final int f2437h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;

    /* renamed from: ua, reason: collision with root package name */
    private String f2438ua;

    /* renamed from: w, reason: collision with root package name */
    private final int f2439w;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ i3(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, e3 e3Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (119 != (i10 & 119)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 119, u2.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.f2439w = i11;
        this.f2437h = i12;
        if ((i10 & 128) == 0) {
            this.f2438ua = null;
        } else {
            this.f2438ua = str6;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            this.ext = null;
        } else {
            this.ext = e3Var;
        }
    }

    @JvmStatic
    public static final void write$Self(i3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z14 = false;
        output.encodeStringElement(serialDesc, 0, self.make);
        output.encodeStringElement(serialDesc, 1, self.model);
        output.encodeStringElement(serialDesc, 2, self.osv);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.carrier != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.carrier);
        }
        output.encodeStringElement(serialDesc, 4, self.os);
        output.encodeIntElement(serialDesc, 5, self.f2439w);
        output.encodeIntElement(serialDesc, 6, self.f2437h);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.f2438ua != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.f2438ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.ifa != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.ifa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.lmt != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.lmt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.ext != null) {
            z14 = true;
        }
        if (z14) {
            output.encodeNullableSerializableElement(serialDesc, 10, c3.INSTANCE, self.ext);
        }
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final e3 component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.f2439w;
    }

    public final int component7() {
        return this.f2437h;
    }

    public final String component8() {
        return this.f2438ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final i3 copy(String make, String model, String osv, String str, String os, int i10, int i11, String str2, String str3, Integer num, e3 e3Var) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        return new i3(make, model, osv, str, os, i10, i11, str2, str3, num, e3Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return Intrinsics.areEqual(this.make, i3Var.make) && Intrinsics.areEqual(this.model, i3Var.model) && Intrinsics.areEqual(this.osv, i3Var.osv) && Intrinsics.areEqual(this.carrier, i3Var.carrier) && Intrinsics.areEqual(this.os, i3Var.os) && this.f2439w == i3Var.f2439w && this.f2437h == i3Var.f2437h && Intrinsics.areEqual(this.f2438ua, i3Var.f2438ua) && Intrinsics.areEqual(this.ifa, i3Var.ifa) && Intrinsics.areEqual(this.lmt, i3Var.lmt) && Intrinsics.areEqual(this.ext, i3Var.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final e3 getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.f2437h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.f2438ua;
    }

    public final int getW() {
        return this.f2439w;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int c10 = vd.e.c(this.osv, vd.e.c(this.model, this.make.hashCode() * 31, 31), 31);
        String str = this.carrier;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f2437h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f2439w, vd.e.c(this.os, (c10 + hashCode) * 31, 31), 31), 31);
        String str2 = this.f2438ua;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (e2 + hashCode2) * 31;
        String str3 = this.ifa;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num = this.lmt;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        e3 e3Var = this.ext;
        if (e3Var != null) {
            i10 = e3Var.hashCode();
        }
        return i13 + i10;
    }

    public final void setExt(e3 e3Var) {
        this.ext = e3Var;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.f2438ua = str;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.f2439w + ", h=" + this.f2437h + ", ua=" + this.f2438ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public i3(String make, String model, String osv, String str, String os, int i10, int i11, String str2, String str3, Integer num, e3 e3Var) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.f2439w = i10;
        this.f2437h = i11;
        this.f2438ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = e3Var;
    }

    public /* synthetic */ i3(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, e3 e3Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : e3Var);
    }
}
