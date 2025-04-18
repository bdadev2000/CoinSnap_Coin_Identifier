package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import d0.b0;
import e1.h;
import e1.k1;
import e1.x;
import h0.g;
import i0.a;
import j0.c;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {Opcodes.LNEG}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SingleProcessDataStore$data$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19004a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19006c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f19007a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State f19008b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State state, g gVar) {
            super(2, gVar);
            this.f19008b = state;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19008b, gVar);
            anonymousClass1.f19007a = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((State) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            State state = (State) this.f19007a;
            State state2 = this.f19008b;
            boolean z2 = false;
            if (!(state2 instanceof Data) && !(state2 instanceof Final) && state == state2) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(2, gVar);
        this.f19006c = singleProcessDataStore;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.f19006c, gVar);
        singleProcessDataStore$data$1.f19005b = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleProcessDataStore$data$1) create((e1.i) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f19004a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            e1.i iVar = (e1.i) this.f19005b;
            SingleProcessDataStore singleProcessDataStore = this.f19006c;
            State state = (State) singleProcessDataStore.f18986h.getValue();
            if (!(state instanceof Data)) {
                singleProcessDataStore.f18988j.a(new SingleProcessDataStore.Message.Read(state));
            }
            final x xVar = new x(singleProcessDataStore.f18986h, new AnonymousClass1(state, null));
            h hVar = new h() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public final class AnonymousClass2 implements e1.i {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ e1.i f18990a;

                    @e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {Opcodes.L2F}, m = "emit")
                    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public final class AnonymousClass1 extends c {

                        /* renamed from: a, reason: collision with root package name */
                        public /* synthetic */ Object f18991a;

                        /* renamed from: b, reason: collision with root package name */
                        public int f18992b;

                        public AnonymousClass1(g gVar) {
                            super(gVar);
                        }

                        @Override // j0.a
                        public final Object invokeSuspend(Object obj) {
                            this.f18991a = obj;
                            this.f18992b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(e1.i iVar) {
                        this.f18990a = iVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // e1.i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, h0.g r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.f18992b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f18992b = r1
                            goto L18
                        L13:
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f18991a
                            i0.a r1 = i0.a.f30806a
                            int r2 = r0.f18992b
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.jvm.internal.q.m(r6)
                            goto L4f
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.jvm.internal.q.m(r6)
                            androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                            boolean r6 = r5 instanceof androidx.datastore.core.ReadException
                            if (r6 != 0) goto L6d
                            boolean r6 = r5 instanceof androidx.datastore.core.Final
                            if (r6 != 0) goto L68
                            boolean r6 = r5 instanceof androidx.datastore.core.Data
                            if (r6 == 0) goto L52
                            androidx.datastore.core.Data r5 = (androidx.datastore.core.Data) r5
                            java.lang.Object r5 = r5.f18950a
                            r0.f18992b = r3
                            e1.i r6 = r4.f18990a
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4f
                            return r1
                        L4f:
                            d0.b0 r5 = d0.b0.f30125a
                            return r5
                        L52:
                            boolean r5 = r5 instanceof androidx.datastore.core.UnInitialized
                            if (r5 == 0) goto L62
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                            java.lang.String r6 = r6.toString()
                            r5.<init>(r6)
                            throw r5
                        L62:
                            d0.e r5 = new d0.e
                            r5.<init>()
                            throw r5
                        L68:
                            androidx.datastore.core.Final r5 = (androidx.datastore.core.Final) r5
                            java.lang.Throwable r5 = r5.f18968a
                            throw r5
                        L6d:
                            androidx.datastore.core.ReadException r5 = (androidx.datastore.core.ReadException) r5
                            java.lang.Throwable r5 = r5.f18969a
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h0.g):java.lang.Object");
                    }
                }

                @Override // e1.h
                public final Object collect(e1.i iVar2, g gVar) {
                    Object collect = xVar.collect(new AnonymousClass2(iVar2), gVar);
                    return collect == a.f30806a ? collect : b0.f30125a;
                }
            };
            this.f19004a = 1;
            if (iVar instanceof k1) {
                throw ((k1) iVar).f30302a;
            }
            Object collect = hVar.collect(iVar, this);
            if (collect != aVar) {
                collect = b0Var;
            }
            if (collect == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
