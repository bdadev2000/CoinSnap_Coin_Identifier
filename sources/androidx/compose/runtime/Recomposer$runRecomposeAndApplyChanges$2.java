package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {574, 585}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public List f13932a;

    /* renamed from: b, reason: collision with root package name */
    public List f13933b;

    /* renamed from: c, reason: collision with root package name */
    public List f13934c;
    public MutableScatterSet d;

    /* renamed from: f, reason: collision with root package name */
    public MutableScatterSet f13935f;

    /* renamed from: g, reason: collision with root package name */
    public MutableScatterSet f13936g;

    /* renamed from: h, reason: collision with root package name */
    public Set f13937h;

    /* renamed from: i, reason: collision with root package name */
    public MutableScatterSet f13938i;

    /* renamed from: j, reason: collision with root package name */
    public int f13939j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ MonotonicFrameClock f13940k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13941l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Recomposer f13942a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableScatterSet f13943b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableScatterSet f13944c;
        public final /* synthetic */ List d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f13945f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableScatterSet f13946g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f13947h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ MutableScatterSet f13948i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Set f13949j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Recomposer recomposer, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, List list, List list2, MutableScatterSet mutableScatterSet3, List list3, MutableScatterSet mutableScatterSet4, Set set) {
            super(1);
            this.f13942a = recomposer;
            this.f13943b = mutableScatterSet;
            this.f13944c = mutableScatterSet2;
            this.d = list;
            this.f13945f = list2;
            this.f13946g = mutableScatterSet3;
            this.f13947h = list3;
            this.f13948i = mutableScatterSet4;
            this.f13949j = set;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            boolean D;
            MutableScatterSet mutableScatterSet;
            MutableScatterSet mutableScatterSet2;
            boolean z2;
            ControlledComposition controlledComposition;
            MutableScatterSet mutableScatterSet3;
            MutableScatterSet mutableScatterSet4;
            long longValue = ((Number) obj).longValue();
            Recomposer recomposer = this.f13942a;
            synchronized (recomposer.f13878b) {
                D = recomposer.D();
            }
            if (D) {
                Recomposer recomposer2 = this.f13942a;
                android.os.Trace.beginSection("Recomposer:animation");
                try {
                    recomposer2.f13877a.b(longValue);
                    Snapshot.Companion.g();
                } finally {
                }
            }
            Recomposer recomposer3 = this.f13942a;
            MutableScatterSet mutableScatterSet5 = this.f13943b;
            MutableScatterSet mutableScatterSet6 = this.f13944c;
            List list = this.d;
            List list2 = this.f13945f;
            MutableScatterSet mutableScatterSet7 = this.f13946g;
            List list3 = this.f13947h;
            MutableScatterSet mutableScatterSet8 = this.f13948i;
            Set set = this.f13949j;
            android.os.Trace.beginSection("Recomposer:recompose");
            try {
                Recomposer.y(recomposer3);
                synchronized (recomposer3.f13878b) {
                    try {
                        MutableVector mutableVector = recomposer3.f13882h;
                        int i2 = mutableVector.f14144c;
                        if (i2 > 0) {
                            Object[] objArr = mutableVector.f14142a;
                            int i3 = 0;
                            do {
                                list.add((ControlledComposition) objArr[i3]);
                                i3++;
                            } while (i3 < i2);
                        }
                        recomposer3.f13882h.g();
                    } finally {
                    }
                }
                mutableScatterSet5.f();
                mutableScatterSet6.f();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    MutableScatterSet mutableScatterSet9 = mutableScatterSet5;
                    MutableScatterSet mutableScatterSet10 = mutableScatterSet6;
                    try {
                        try {
                            int size = list.size();
                            int i4 = 0;
                            while (i4 < size) {
                                try {
                                    controlledComposition = (ControlledComposition) list.get(i4);
                                    mutableScatterSet = mutableScatterSet9;
                                } catch (Exception e) {
                                    e = e;
                                    mutableScatterSet = mutableScatterSet9;
                                }
                                try {
                                    ControlledComposition x = Recomposer.x(recomposer3, controlledComposition, mutableScatterSet);
                                    if (x != null) {
                                        try {
                                            list3.add(x);
                                        } catch (Exception e2) {
                                            e = e2;
                                            z2 = true;
                                            mutableScatterSet2 = mutableScatterSet10;
                                            Recomposer.L(recomposer3, e, z2, 2);
                                            Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet, mutableScatterSet2);
                                            return b0.f30125a;
                                        }
                                    }
                                    mutableScatterSet2 = mutableScatterSet10;
                                    try {
                                        mutableScatterSet2.d(controlledComposition);
                                        i4++;
                                        mutableScatterSet9 = mutableScatterSet;
                                        mutableScatterSet10 = mutableScatterSet2;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z2 = true;
                                        Recomposer.L(recomposer3, e, z2, 2);
                                        Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet, mutableScatterSet2);
                                        return b0.f30125a;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    mutableScatterSet2 = mutableScatterSet10;
                                    z2 = true;
                                    Recomposer.L(recomposer3, e, z2, 2);
                                    Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet, mutableScatterSet2);
                                    return b0.f30125a;
                                }
                            }
                            MutableScatterSet mutableScatterSet11 = mutableScatterSet9;
                            MutableScatterSet mutableScatterSet12 = mutableScatterSet10;
                            list.clear();
                            if (mutableScatterSet11.c() || recomposer3.f13882h.m()) {
                                synchronized (recomposer3.f13878b) {
                                    try {
                                        List F = recomposer3.F();
                                        int size2 = F.size();
                                        for (int i5 = 0; i5 < size2; i5++) {
                                            ControlledComposition controlledComposition2 = (ControlledComposition) F.get(i5);
                                            if (!mutableScatterSet12.a(controlledComposition2) && controlledComposition2.j(set)) {
                                                list.add(controlledComposition2);
                                            }
                                        }
                                        MutableVector mutableVector2 = recomposer3.f13882h;
                                        int i6 = mutableVector2.f14144c;
                                        int i7 = 0;
                                        for (int i8 = 0; i8 < i6; i8++) {
                                            ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.f14142a[i8];
                                            if (!mutableScatterSet12.a(controlledComposition3) && !list.contains(controlledComposition3)) {
                                                list.add(controlledComposition3);
                                                i7++;
                                            } else if (i7 > 0) {
                                                Object[] objArr2 = mutableVector2.f14142a;
                                                objArr2[i8 - i7] = objArr2[i8];
                                            }
                                        }
                                        int i9 = i6 - i7;
                                        e0.q.W(i9, i6, mutableVector2.f14142a);
                                        mutableVector2.f14144c = i9;
                                    } finally {
                                    }
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    Recomposer$runRecomposeAndApplyChanges$2.v(list2, recomposer3);
                                    while (!list2.isEmpty()) {
                                        List J = recomposer3.J(list2, mutableScatterSet11);
                                        mutableScatterSet7.getClass();
                                        for (Object obj2 : J) {
                                            mutableScatterSet7.f1592b[mutableScatterSet7.g(obj2)] = obj2;
                                        }
                                        Recomposer$runRecomposeAndApplyChanges$2.v(list2, recomposer3);
                                    }
                                } catch (Exception e5) {
                                    Recomposer.L(recomposer3, e5, true, 2);
                                    Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet11, mutableScatterSet12);
                                }
                            }
                            mutableScatterSet5 = mutableScatterSet11;
                            mutableScatterSet6 = mutableScatterSet12;
                        } finally {
                            list.clear();
                        }
                    } catch (Exception e6) {
                        e = e6;
                        mutableScatterSet = mutableScatterSet9;
                        mutableScatterSet2 = mutableScatterSet10;
                        z2 = true;
                    }
                }
                if (!list3.isEmpty()) {
                    try {
                        try {
                            int size3 = list3.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                mutableScatterSet8.d((ControlledComposition) list3.get(i10));
                            }
                            int size4 = list3.size();
                            for (int i11 = 0; i11 < size4; i11++) {
                                ((ControlledComposition) list3.get(i11)).n();
                            }
                            list3.clear();
                        } finally {
                            list3.clear();
                        }
                    } catch (Exception e7) {
                        Recomposer.L(recomposer3, e7, false, 6);
                        Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet5, mutableScatterSet6);
                        list3.clear();
                    }
                }
                if (mutableScatterSet7.c()) {
                    try {
                        try {
                            mutableScatterSet8.j(mutableScatterSet7);
                            Object[] objArr3 = mutableScatterSet7.f1592b;
                            long[] jArr = mutableScatterSet7.f1591a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j2 = jArr[i12];
                                    mutableScatterSet3 = mutableScatterSet5;
                                    mutableScatterSet4 = mutableScatterSet6;
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        long j3 = j2;
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j3 & 255) < 128) {
                                                try {
                                                    ((ControlledComposition) objArr3[(i12 << 3) + i14]).e();
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    Recomposer.L(recomposer3, e, false, 6);
                                                    Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet3, mutableScatterSet4);
                                                    mutableScatterSet7.f();
                                                    return b0.f30125a;
                                                }
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length) {
                                        break;
                                    }
                                    i12++;
                                    mutableScatterSet5 = mutableScatterSet3;
                                    mutableScatterSet6 = mutableScatterSet4;
                                }
                            } else {
                                mutableScatterSet3 = mutableScatterSet5;
                                mutableScatterSet4 = mutableScatterSet6;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            mutableScatterSet3 = mutableScatterSet5;
                            mutableScatterSet4 = mutableScatterSet6;
                        }
                    } finally {
                        mutableScatterSet7.f();
                    }
                } else {
                    mutableScatterSet3 = mutableScatterSet5;
                    mutableScatterSet4 = mutableScatterSet6;
                }
                if (mutableScatterSet8.c()) {
                    try {
                        try {
                            Object[] objArr4 = mutableScatterSet8.f1592b;
                            long[] jArr2 = mutableScatterSet8.f1591a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j4 = jArr2[i15];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        long j5 = j4;
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j5 & 255) < 128) {
                                                ((ControlledComposition) objArr4[(i15 << 3) + i17]).s();
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                        } finally {
                            mutableScatterSet8.f();
                        }
                    } catch (Exception e10) {
                        Recomposer.L(recomposer3, e10, false, 6);
                        Recomposer$runRecomposeAndApplyChanges$2.c(recomposer3, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet3, mutableScatterSet4);
                        mutableScatterSet8.f();
                    }
                }
                synchronized (recomposer3.f13878b) {
                    recomposer3.C();
                }
                SnapshotKt.k().m();
                mutableScatterSet4.f();
                mutableScatterSet3.f();
                recomposer3.f13888n = null;
                return b0.f30125a;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, g gVar) {
        super(3, gVar);
        this.f13941l = recomposer;
    }

    public static final void c(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
        synchronized (recomposer.f13878b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ControlledComposition controlledComposition = (ControlledComposition) list3.get(i2);
                    controlledComposition.r();
                    recomposer.M(controlledComposition);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet.f1592b;
                long[] jArr = mutableScatterSet.f1591a;
                int length = jArr.length - 2;
                long j2 = -9187201950435737472L;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        long[] jArr2 = jArr;
                        if ((((~j3) << 7) & j3 & j2) != j2) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j3 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i3 << 3) + i5];
                                    controlledComposition2.r();
                                    recomposer.M(controlledComposition2);
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        jArr = jArr2;
                        j2 = -9187201950435737472L;
                    }
                }
                mutableScatterSet.f();
                Object[] objArr2 = mutableScatterSet2.f1592b;
                long[] jArr3 = mutableScatterSet2.f1591a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j4 = jArr3[i6];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j4 & 255) < 128) {
                                    ((ControlledComposition) objArr2[(i6 << 3) + i8]).s();
                                }
                                j4 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                mutableScatterSet2.f();
                mutableScatterSet3.f();
                Object[] objArr3 = mutableScatterSet4.f1592b;
                long[] jArr4 = mutableScatterSet4.f1591a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j5 = jArr4[i9];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j5 & 255) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i9 << 3) + i11];
                                    controlledComposition3.r();
                                    recomposer.M(controlledComposition3);
                                }
                                j5 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length3) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                mutableScatterSet4.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void v(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f13878b) {
            try {
                ArrayList arrayList = recomposer.f13884j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((MovableContentStateReference) arrayList.get(i2));
                }
                recomposer.f13884j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f13941l, (g) obj3);
        recomposer$runRecomposeAndApplyChanges$2.f13940k = (MonotonicFrameClock) obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x013c -> B:6:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0203 -> B:27:0x00a4). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
