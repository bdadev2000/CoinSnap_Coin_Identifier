package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import e0.q;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SnapshotStateObserver {

    /* renamed from: a, reason: collision with root package name */
    public final l f14598a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14600c;

    /* renamed from: g, reason: collision with root package name */
    public a f14602g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14603h;

    /* renamed from: i, reason: collision with root package name */
    public ObservedScopeMap f14604i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14599b = new AtomicReference(null);
    public final p d = new SnapshotStateObserver$applyObserver$1(this);
    public final l e = new SnapshotStateObserver$readObserver$1(this);

    /* renamed from: f, reason: collision with root package name */
    public final MutableVector f14601f = new MutableVector(new ObservedScopeMap[16]);

    /* renamed from: j, reason: collision with root package name */
    public long f14605j = -1;

    /* loaded from: classes3.dex */
    public static final class ObservedScopeMap {

        /* renamed from: a, reason: collision with root package name */
        public final l f14606a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14607b;

        /* renamed from: c, reason: collision with root package name */
        public MutableObjectIntMap f14608c;

        /* renamed from: j, reason: collision with root package name */
        public int f14613j;
        public int d = -1;
        public final ScopeMap e = new ScopeMap();

        /* renamed from: f, reason: collision with root package name */
        public final MutableScatterMap f14609f = new MutableScatterMap();

        /* renamed from: g, reason: collision with root package name */
        public final MutableScatterSet f14610g = new MutableScatterSet();

        /* renamed from: h, reason: collision with root package name */
        public final MutableVector f14611h = new MutableVector(new DerivedState[16]);

        /* renamed from: i, reason: collision with root package name */
        public final SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 f14612i = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void a() {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                observedScopeMap.f14613j--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void start() {
                SnapshotStateObserver.ObservedScopeMap.this.f14613j++;
            }
        };

        /* renamed from: k, reason: collision with root package name */
        public final ScopeMap f14614k = new ScopeMap();

        /* renamed from: l, reason: collision with root package name */
        public final HashMap f14615l = new HashMap();

        /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1] */
        public ObservedScopeMap(l lVar) {
            this.f14606a = lVar;
        }

        public final void a(Object obj, l lVar, q0.a aVar) {
            long[] jArr;
            long[] jArr2;
            int i2;
            Object obj2 = this.f14607b;
            MutableObjectIntMap mutableObjectIntMap = this.f14608c;
            int i3 = this.d;
            this.f14607b = obj;
            this.f14608c = (MutableObjectIntMap) this.f14609f.c(obj);
            if (this.d == -1) {
                this.d = SnapshotKt.k().d();
            }
            SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 = this.f14612i;
            MutableVector c2 = SnapshotStateKt.c();
            try {
                c2.b(snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1);
                Snapshot.Companion.d(lVar, aVar);
                c2.o(c2.f14144c - 1);
                Object obj3 = this.f14607b;
                p0.a.p(obj3);
                int i4 = this.d;
                MutableObjectIntMap mutableObjectIntMap2 = this.f14608c;
                if (mutableObjectIntMap2 != null) {
                    long[] jArr3 = mutableObjectIntMap2.f1545a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j2 = jArr3[i5];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j2 & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = mutableObjectIntMap2.f1546b[i9];
                                        jArr2 = jArr3;
                                        boolean z2 = mutableObjectIntMap2.f1547c[i9] != i4;
                                        if (z2) {
                                            d(obj3, obj4);
                                        }
                                        if (z2) {
                                            mutableObjectIntMap2.f(i9);
                                        }
                                        i2 = 8;
                                    } else {
                                        jArr2 = jArr3;
                                        i2 = i6;
                                    }
                                    j2 >>= i2;
                                    i8++;
                                    i6 = i2;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                            jArr3 = jArr;
                        }
                    }
                }
                this.f14607b = obj2;
                this.f14608c = mutableObjectIntMap;
                this.d = i3;
            } catch (Throwable th) {
                c2.o(c2.f14144c - 1);
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            if (((androidx.compose.runtime.snapshots.StateObjectImpl) r13).t(2) == false) goto L127;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(java.util.Set r44) {
            /*
                Method dump skipped, instructions count: 1812
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.b(java.util.Set):boolean");
        }

        public final void c(Object obj, int i2, Object obj2, MutableObjectIntMap mutableObjectIntMap) {
            int i3;
            if (this.f14613j > 0) {
                return;
            }
            int d = mutableObjectIntMap.d(obj);
            if (d < 0) {
                d = ~d;
                i3 = -1;
            } else {
                i3 = mutableObjectIntMap.f1547c[d];
            }
            mutableObjectIntMap.f1546b[d] = obj;
            mutableObjectIntMap.f1547c[d] = i2;
            if ((obj instanceof DerivedState) && i3 != i2) {
                DerivedSnapshotState.ResultRecord s2 = ((DerivedState) obj).s();
                this.f14615l.put(obj, s2.f13788f);
                ObjectIntMap objectIntMap = s2.e;
                ScopeMap scopeMap = this.f14614k;
                scopeMap.d(obj);
                Object[] objArr = objectIntMap.f1546b;
                long[] jArr = objectIntMap.f1545a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j2 & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i4 << 3) + i6];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).v(2);
                                    }
                                    scopeMap.a(stateObject, obj);
                                }
                                j2 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            if (i3 == -1) {
                if (obj instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj).v(2);
                }
                this.e.a(obj, obj2);
            }
        }

        public final void d(Object obj, Object obj2) {
            ScopeMap scopeMap = this.e;
            scopeMap.c(obj2, obj);
            if (!(obj2 instanceof DerivedState) || scopeMap.f14161a.a(obj2)) {
                return;
            }
            this.f14614k.d(obj2);
            this.f14615l.remove(obj2);
        }

        public final void e(l lVar) {
            long[] jArr;
            int i2;
            long[] jArr2;
            int i3;
            long j2;
            int i4;
            long j3;
            int i5;
            MutableScatterMap mutableScatterMap = this.f14609f;
            long[] jArr3 = mutableScatterMap.f1557a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                long j4 = jArr3[i6];
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j4 & 255) < 128) {
                            int i10 = (i6 << 3) + i9;
                            Object obj = mutableScatterMap.f1558b[i10];
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.f1559c[i10];
                            Boolean bool = (Boolean) lVar.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.f1546b;
                                int[] iArr = mutableObjectIntMap.f1547c;
                                long[] jArr4 = mutableObjectIntMap.f1545a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i4 = i8;
                                    int i11 = 0;
                                    while (true) {
                                        long j6 = jArr4[i11];
                                        i3 = i6;
                                        j2 = j4;
                                        j3 = -9187201950435737472L;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            for (int i13 = 0; i13 < i12; i13++) {
                                                if ((j6 & 255) < 128) {
                                                    int i14 = (i11 << 3) + i13;
                                                    Object obj2 = objArr[i14];
                                                    int i15 = iArr[i14];
                                                    d(obj, obj2);
                                                }
                                                j6 >>= 8;
                                            }
                                            if (i12 != 8) {
                                                break;
                                            }
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        i6 = i3;
                                        j4 = j2;
                                    }
                                } else {
                                    i3 = i6;
                                    j2 = j4;
                                    i4 = i8;
                                    j3 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i3 = i6;
                                j2 = j4;
                                i4 = i8;
                                j3 = j5;
                            }
                            if (bool.booleanValue()) {
                                mutableScatterMap.j(i10);
                            }
                            i5 = 8;
                        } else {
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j4;
                            i4 = i8;
                            j3 = j5;
                            i5 = i7;
                        }
                        j4 = j2 >> i5;
                        i9++;
                        i7 = i5;
                        j5 = j3;
                        jArr3 = jArr2;
                        i8 = i4;
                        i6 = i3;
                    }
                    jArr = jArr3;
                    int i16 = i6;
                    if (i8 != i7) {
                        return;
                    } else {
                        i2 = i16;
                    }
                } else {
                    jArr = jArr3;
                    i2 = i6;
                }
                if (i2 == length) {
                    return;
                }
                i6 = i2 + 1;
                jArr3 = jArr;
            }
        }
    }

    public SnapshotStateObserver(l lVar) {
        this.f14598a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(SnapshotStateObserver snapshotStateObserver) {
        boolean z2;
        Set set;
        synchronized (snapshotStateObserver.f14601f) {
            z2 = snapshotStateObserver.f14600c;
        }
        if (z2) {
            return false;
        }
        boolean z3 = false;
        while (true) {
            AtomicReference atomicReference = snapshotStateObserver.f14599b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ComposerKt.d("Unexpected notification");
                        throw null;
                    }
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z3;
            }
            synchronized (snapshotStateObserver.f14601f) {
                MutableVector mutableVector = snapshotStateObserver.f14601f;
                int i2 = mutableVector.f14144c;
                if (i2 > 0) {
                    Object[] objArr = mutableVector.f14142a;
                    int i3 = 0;
                    do {
                        z3 = ((ObservedScopeMap) objArr[i3]).b(set2) || z3;
                        i3++;
                    } while (i3 < i2);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f14601f) {
            MutableVector mutableVector = this.f14601f;
            int i2 = mutableVector.f14144c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.f14142a;
                int i3 = 0;
                do {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) objArr[i3];
                    observedScopeMap.e.f14161a.e();
                    observedScopeMap.f14609f.e();
                    observedScopeMap.f14614k.f14161a.e();
                    observedScopeMap.f14615l.clear();
                    i3++;
                } while (i3 < i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0079, B:12:0x0083, B:14:0x0086, B:16:0x0096, B:18:0x008b, B:22:0x0022, B:25:0x002e, B:27:0x0043, B:29:0x004f, B:31:0x0059, B:33:0x0064, B:40:0x0072, B:43:0x009c), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            androidx.compose.runtime.collection.MutableVector r2 = r1.f14601f
            monitor-enter(r2)
            androidx.compose.runtime.collection.MutableVector r3 = r1.f14601f     // Catch: java.lang.Throwable -> L94
            int r4 = r3.f14144c     // Catch: java.lang.Throwable -> L94
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L9c
            java.lang.Object[] r8 = r3.f14142a     // Catch: java.lang.Throwable -> L94
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L94
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r8 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r8     // Catch: java.lang.Throwable -> L94
            androidx.collection.MutableScatterMap r9 = r8.f14609f     // Catch: java.lang.Throwable -> L94
            java.lang.Object r9 = r9.i(r0)     // Catch: java.lang.Throwable -> L94
            androidx.collection.MutableObjectIntMap r9 = (androidx.collection.MutableObjectIntMap) r9     // Catch: java.lang.Throwable -> L94
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L79
        L22:
            java.lang.Object[] r10 = r9.f1546b     // Catch: java.lang.Throwable -> L94
            int[] r11 = r9.f1547c     // Catch: java.lang.Throwable -> L94
            long[] r9 = r9.f1545a     // Catch: java.lang.Throwable -> L94
            int r12 = r9.length     // Catch: java.lang.Throwable -> L94
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L94
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L94
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L70
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L94
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r6 = 0
        L4d:
            if (r6 >= r5) goto L6c
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L64
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L94
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L94
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L94
        L64:
            r1 = 8
            long r14 = r14 >> r1
            int r6 = r6 + 1
            r1 = r22
            goto L4d
        L6c:
            r1 = 8
            if (r5 != r1) goto L79
        L70:
            if (r13 == r12) goto L79
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L79:
            androidx.collection.MutableScatterMap r1 = r8.f14609f     // Catch: java.lang.Throwable -> L94
            int r1 = r1.e     // Catch: java.lang.Throwable -> L94
            r5 = 1
            if (r1 == 0) goto L82
            r1 = r5
            goto L83
        L82:
            r1 = 0
        L83:
            r1 = r1 ^ r5
            if (r1 == 0) goto L89
            int r7 = r7 + 1
            goto L96
        L89:
            if (r7 <= 0) goto L96
            java.lang.Object[] r1 = r3.f14142a     // Catch: java.lang.Throwable -> L94
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L94
            r1[r6] = r5     // Catch: java.lang.Throwable -> L94
            goto L96
        L94:
            r0 = move-exception
            goto La7
        L96:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L9c:
            java.lang.Object[] r0 = r3.f14142a     // Catch: java.lang.Throwable -> L94
            int r1 = r4 - r7
            e0.q.W(r1, r4, r0)     // Catch: java.lang.Throwable -> L94
            r3.f14144c = r1     // Catch: java.lang.Throwable -> L94
            monitor-exit(r2)
            return
        La7:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.c(java.lang.Object):void");
    }

    public final void d(l lVar) {
        synchronized (this.f14601f) {
            try {
                MutableVector mutableVector = this.f14601f;
                int i2 = mutableVector.f14144c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.f14142a[i4];
                    observedScopeMap.e(lVar);
                    if (!(observedScopeMap.f14609f.e != 0)) {
                        i3++;
                    } else if (i3 > 0) {
                        Object[] objArr = mutableVector.f14142a;
                        objArr[i4 - i3] = objArr[i4];
                    }
                }
                int i5 = i2 - i3;
                q.W(i5, i2, mutableVector.f14142a);
                mutableVector.f14144c = i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(Object obj, l lVar, q0.a aVar) {
        Object obj2;
        ObservedScopeMap observedScopeMap;
        synchronized (this.f14601f) {
            MutableVector mutableVector = this.f14601f;
            int i2 = mutableVector.f14144c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.f14142a;
                int i3 = 0;
                do {
                    obj2 = objArr[i3];
                    if (((ObservedScopeMap) obj2).f14606a == lVar) {
                        break;
                    } else {
                        i3++;
                    }
                } while (i3 < i2);
            }
            obj2 = null;
            observedScopeMap = (ObservedScopeMap) obj2;
            if (observedScopeMap == null) {
                p0.a.q(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                e.g(1, lVar);
                observedScopeMap = new ObservedScopeMap(lVar);
                mutableVector.b(observedScopeMap);
            }
        }
        boolean z2 = this.f14603h;
        ObservedScopeMap observedScopeMap2 = this.f14604i;
        long j2 = this.f14605j;
        if (j2 != -1 && j2 != ActualJvm_jvmKt.a()) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j2, "), currentThread={id=");
            r2.append(ActualJvm_jvmKt.a());
            r2.append(", name=");
            r2.append(Thread.currentThread().getName());
            r2.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            PreconditionsKt.a(r2.toString());
            throw null;
        }
        try {
            this.f14603h = false;
            this.f14604i = observedScopeMap;
            this.f14605j = ActualJvm_jvmKt.a();
            observedScopeMap.a(obj, this.e, aVar);
        } finally {
            this.f14604i = observedScopeMap2;
            this.f14603h = z2;
            this.f14605j = j2;
        }
    }
}
