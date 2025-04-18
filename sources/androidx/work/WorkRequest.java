package androidx.work;

import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class WorkRequest {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f21904a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkSpec f21905b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f21906c;

    /* loaded from: classes2.dex */
    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {

        /* renamed from: a, reason: collision with root package name */
        public UUID f21907a;

        /* renamed from: b, reason: collision with root package name */
        public WorkSpec f21908b;

        /* renamed from: c, reason: collision with root package name */
        public HashSet f21909c;

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, androidx.work.impl.model.WorkSpec] */
        /* JADX WARN: Type inference failed for: r5v10, types: [androidx.work.Constraints, java.lang.Object] */
        public final WorkRequest a() {
            WorkRequest b2 = b();
            Constraints constraints = this.f21908b.f22153j;
            boolean z2 = constraints.f21859h.f21862a.size() > 0 || constraints.d || constraints.f21855b || constraints.f21856c;
            if (this.f21908b.f22160q && z2) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f21907a = UUID.randomUUID();
            WorkSpec workSpec = this.f21908b;
            ?? obj = new Object();
            obj.f22147b = WorkInfo.State.f21897a;
            Data data = Data.f21866c;
            obj.e = data;
            obj.f22149f = data;
            obj.f22153j = Constraints.f21853i;
            obj.f22155l = BackoffPolicy.f21842a;
            obj.f22156m = 30000L;
            obj.f22159p = -1L;
            obj.f22161r = OutOfQuotaPolicy.f21890a;
            obj.f22146a = workSpec.f22146a;
            obj.f22148c = workSpec.f22148c;
            obj.f22147b = workSpec.f22147b;
            obj.d = workSpec.d;
            obj.e = new Data(workSpec.e);
            obj.f22149f = new Data(workSpec.f22149f);
            obj.f22150g = workSpec.f22150g;
            obj.f22151h = workSpec.f22151h;
            obj.f22152i = workSpec.f22152i;
            Constraints constraints2 = workSpec.f22153j;
            ?? obj2 = new Object();
            obj2.f21854a = NetworkType.f21881a;
            obj2.f21857f = -1L;
            obj2.f21858g = -1L;
            obj2.f21859h = new ContentUriTriggers();
            obj2.f21855b = constraints2.f21855b;
            obj2.f21856c = constraints2.f21856c;
            obj2.f21854a = constraints2.f21854a;
            obj2.d = constraints2.d;
            obj2.e = constraints2.e;
            obj2.f21859h = constraints2.f21859h;
            obj.f22153j = obj2;
            obj.f22154k = workSpec.f22154k;
            obj.f22155l = workSpec.f22155l;
            obj.f22156m = workSpec.f22156m;
            obj.f22157n = workSpec.f22157n;
            obj.f22158o = workSpec.f22158o;
            obj.f22159p = workSpec.f22159p;
            obj.f22160q = workSpec.f22160q;
            obj.f22161r = workSpec.f22161r;
            this.f21908b = obj;
            obj.f22146a = this.f21907a.toString();
            return b2;
        }

        public abstract WorkRequest b();
    }

    public WorkRequest(UUID uuid, WorkSpec workSpec, HashSet hashSet) {
        this.f21904a = uuid;
        this.f21905b = workSpec;
        this.f21906c = hashSet;
    }
}
