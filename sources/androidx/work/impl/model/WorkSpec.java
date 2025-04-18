package androidx.work.impl.model;

import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.compose.foundation.text.input.a;
import androidx.room.Entity;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Entity
@RestrictTo
/* loaded from: classes4.dex */
public final class WorkSpec {

    /* renamed from: s, reason: collision with root package name */
    public static final Function f22145s = null;

    /* renamed from: a, reason: collision with root package name */
    public String f22146a;

    /* renamed from: b, reason: collision with root package name */
    public WorkInfo.State f22147b = WorkInfo.State.f21897a;

    /* renamed from: c, reason: collision with root package name */
    public String f22148c;
    public String d;
    public Data e;

    /* renamed from: f, reason: collision with root package name */
    public Data f22149f;

    /* renamed from: g, reason: collision with root package name */
    public long f22150g;

    /* renamed from: h, reason: collision with root package name */
    public long f22151h;

    /* renamed from: i, reason: collision with root package name */
    public long f22152i;

    /* renamed from: j, reason: collision with root package name */
    public Constraints f22153j;

    /* renamed from: k, reason: collision with root package name */
    public int f22154k;

    /* renamed from: l, reason: collision with root package name */
    public BackoffPolicy f22155l;

    /* renamed from: m, reason: collision with root package name */
    public long f22156m;

    /* renamed from: n, reason: collision with root package name */
    public long f22157n;

    /* renamed from: o, reason: collision with root package name */
    public long f22158o;

    /* renamed from: p, reason: collision with root package name */
    public long f22159p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22160q;

    /* renamed from: r, reason: collision with root package name */
    public OutOfQuotaPolicy f22161r;

    /* renamed from: androidx.work.impl.model.WorkSpec$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Function<List<WorkInfoPojo>, List<WorkInfo>> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((WorkInfoPojo) it.next()).a());
            }
            return arrayList;
        }
    }

    /* loaded from: classes4.dex */
    public static class IdAndState {

        /* renamed from: a, reason: collision with root package name */
        public String f22162a;

        /* renamed from: b, reason: collision with root package name */
        public WorkInfo.State f22163b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.f22163b != idAndState.f22163b) {
                return false;
            }
            return this.f22162a.equals(idAndState.f22162a);
        }

        public final int hashCode() {
            return this.f22163b.hashCode() + (this.f22162a.hashCode() * 31);
        }
    }

    /* loaded from: classes4.dex */
    public static class WorkInfoPojo {
        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.WorkInfo, java.lang.Object] */
        public final WorkInfo a() {
            Data data = Data.f21866c;
            UUID fromString = UUID.fromString(null);
            ?? obj = new Object();
            obj.f21893a = fromString;
            obj.f21894b = null;
            obj.f21895c = null;
            obj.d = new HashSet((Collection) null);
            obj.e = data;
            obj.f21896f = 0;
            return obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            workInfoPojo.getClass();
            workInfoPojo.getClass();
            workInfoPojo.getClass();
            return true;
        }

        public final int hashCode() {
            return (0 * 31) + 0;
        }
    }

    static {
        Logger.e("WorkSpec");
    }

    public WorkSpec(String str, String str2) {
        Data data = Data.f21866c;
        this.e = data;
        this.f22149f = data;
        this.f22153j = Constraints.f21853i;
        this.f22155l = BackoffPolicy.f21842a;
        this.f22156m = 30000L;
        this.f22159p = -1L;
        this.f22161r = OutOfQuotaPolicy.f21890a;
        this.f22146a = str;
        this.f22148c = str2;
    }

    public final long a() {
        int i2;
        if (this.f22147b == WorkInfo.State.f21897a && (i2 = this.f22154k) > 0) {
            return Math.min(18000000L, this.f22155l == BackoffPolicy.f21843b ? this.f22156m * i2 : Math.scalb((float) this.f22156m, i2 - 1)) + this.f22157n;
        }
        if (!c()) {
            long j2 = this.f22157n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            return j2 + this.f22150g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.f22157n;
        if (j3 == 0) {
            j3 = this.f22150g + currentTimeMillis;
        }
        long j4 = this.f22152i;
        long j5 = this.f22151h;
        if (j4 != j5) {
            return j3 + j5 + (j3 == 0 ? j4 * (-1) : 0L);
        }
        return j3 + (j3 != 0 ? j5 : 0L);
    }

    public final boolean b() {
        return !Constraints.f21853i.equals(this.f22153j);
    }

    public final boolean c() {
        return this.f22151h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkSpec.class != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.f22150g != workSpec.f22150g || this.f22151h != workSpec.f22151h || this.f22152i != workSpec.f22152i || this.f22154k != workSpec.f22154k || this.f22156m != workSpec.f22156m || this.f22157n != workSpec.f22157n || this.f22158o != workSpec.f22158o || this.f22159p != workSpec.f22159p || this.f22160q != workSpec.f22160q || !this.f22146a.equals(workSpec.f22146a) || this.f22147b != workSpec.f22147b || !this.f22148c.equals(workSpec.f22148c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? workSpec.d == null : str.equals(workSpec.d)) {
            return this.e.equals(workSpec.e) && this.f22149f.equals(workSpec.f22149f) && this.f22153j.equals(workSpec.f22153j) && this.f22155l == workSpec.f22155l && this.f22161r == workSpec.f22161r;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = a.b(this.f22148c, (this.f22147b.hashCode() + (this.f22146a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int hashCode = (this.f22149f.hashCode() + ((this.e.hashCode() + ((b2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j2 = this.f22150g;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f22151h;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f22152i;
        int hashCode2 = (this.f22155l.hashCode() + ((((this.f22153j.hashCode() + ((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31) + this.f22154k) * 31)) * 31;
        long j5 = this.f22156m;
        int i4 = (hashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f22157n;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f22158o;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f22159p;
        return this.f22161r.hashCode() + ((((i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f22160q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return d.r(new StringBuilder("{WorkSpec: "), this.f22146a, "}");
    }
}
