package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import b1.d0;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import d0.b0;
import e1.h;
import e1.r;
import h0.g;
import h0.l;
import j0.c;
import j0.e;
import j0.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;
import x0.n;

/* loaded from: classes.dex */
public final class SessionDatastoreImpl implements SessionDatastore {

    @NotNull
    private static final String TAG = "FirebaseSessionsRepo";

    @NotNull
    private final l backgroundDispatcher;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicReference<FirebaseSessionsData> currentSessionFromDatastore;

    @NotNull
    private final h firebaseSessionDataFlow;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final t0.b dataStore$delegate = PreferenceDataStoreDelegateKt.a(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), new ReplaceFileCorruptionHandler(SessionDatastoreImpl$Companion$dataStore$2.INSTANCE));

    @e(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {Opcodes.DASTORE}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        public AnonymousClass1(g gVar) {
            super(2, gVar);
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.label;
            if (i2 == 0) {
                q.m(obj);
                h hVar = SessionDatastoreImpl.this.firebaseSessionDataFlow;
                final SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                e1.i iVar = new e1.i() { // from class: com.google.firebase.sessions.SessionDatastoreImpl.1.1
                    @Override // e1.i
                    @Nullable
                    public final Object emit(@NotNull FirebaseSessionsData firebaseSessionsData, @NotNull g gVar) {
                        SessionDatastoreImpl.this.currentSessionFromDatastore.set(firebaseSessionsData);
                        return b0.f30125a;
                    }
                };
                this.label = 1;
                if (hVar.collect(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            return b0.f30125a;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ n[] $$delegatedProperties;

        static {
            z zVar = new z(Companion.class);
            g0.f30932a.getClass();
            $$delegatedProperties = new n[]{zVar};
        }

        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore<Preferences> getDataStore(Context context) {
            return (DataStore) SessionDatastoreImpl.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class FirebaseSessionDataKeys {

        @NotNull
        public static final FirebaseSessionDataKeys INSTANCE = new FirebaseSessionDataKeys();

        @NotNull
        private static final Preferences.Key<String> SESSION_ID = new Preferences.Key<>(SDKAnalyticsEvents.PARAMETER_SESSION_ID);

        private FirebaseSessionDataKeys() {
        }

        @NotNull
        public final Preferences.Key<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    public SessionDatastoreImpl(@NotNull Context context, @NotNull l lVar) {
        p0.a.s(context, "context");
        p0.a.s(lVar, "backgroundDispatcher");
        this.context = context;
        this.backgroundDispatcher = lVar;
        this.currentSessionFromDatastore = new AtomicReference<>();
        final r rVar = new r(Companion.getDataStore(context).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.firebaseSessionDataFlow = new h() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements e1.i {
                final /* synthetic */ e1.i $this_unsafeFlow;
                final /* synthetic */ SessionDatastoreImpl this$0;

                @e(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {223}, m = "emit")
                /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(g gVar) {
                        super(gVar);
                    }

                    @Override // j0.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(e1.i iVar, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.$this_unsafeFlow = iVar;
                    this.this$0 = sessionDatastoreImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // e1.i
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull h0.g r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1 r0 = (com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        i0.a r1 = i0.a.f30806a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.jvm.internal.q.m(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.jvm.internal.q.m(r6)
                        e1.i r6 = r4.$this_unsafeFlow
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        com.google.firebase.sessions.SessionDatastoreImpl r2 = r4.this$0
                        com.google.firebase.sessions.FirebaseSessionsData r5 = com.google.firebase.sessions.SessionDatastoreImpl.access$mapSessionsData(r2, r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        d0.b0 r5 = d0.b0.f30125a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h0.g):java.lang.Object");
                }
            }

            @Override // e1.h
            @Nullable
            public Object collect(@NotNull e1.i iVar, @NotNull g gVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar, this), gVar);
                return collect == i0.a.f30806a ? collect : b0.f30125a;
            }
        };
        kotlin.jvm.internal.e.v(p0.a.c(lVar), null, 0, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseSessionsData mapSessionsData(Preferences preferences) {
        return new FirebaseSessionsData((String) preferences.b(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    @Nullable
    public String getCurrentSessionId() {
        FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void updateSessionId(@NotNull String str) {
        p0.a.s(str, "sessionId");
        kotlin.jvm.internal.e.v(p0.a.c(this.backgroundDispatcher), null, 0, new SessionDatastoreImpl$updateSessionId$1(this, str, null), 3);
    }
}
