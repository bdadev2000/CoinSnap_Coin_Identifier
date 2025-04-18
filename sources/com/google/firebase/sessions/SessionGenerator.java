package com.google.firebase.sessions;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes.dex */
public final class SessionGenerator {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private SessionDetails currentSession;

    @NotNull
    private final String firstSessionId;
    private int sessionIndex;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final q0.a uuidGenerator;

    /* renamed from: com.google.firebase.sessions.SessionGenerator$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends o implements q0.a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // q0.a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final SessionGenerator getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
            p0.a.r(obj, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) obj;
        }
    }

    public SessionGenerator(@NotNull TimeProvider timeProvider, @NotNull q0.a aVar) {
        p0.a.s(timeProvider, "timeProvider");
        p0.a.s(aVar, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = aVar;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    private final String generateSessionId() {
        String uuid = ((UUID) this.uuidGenerator.invoke()).toString();
        p0.a.r(uuid, "uuidGenerator().toString()");
        String lowerCase = m.k1(uuid, "-", "").toLowerCase(Locale.ROOT);
        p0.a.r(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @CanIgnoreReturnValue
    @NotNull
    public final SessionDetails generateNewSession() {
        int i2 = this.sessionIndex + 1;
        this.sessionIndex = i2;
        this.currentSession = new SessionDetails(i2 == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    @NotNull
    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        p0.a.B0("currentSession");
        throw null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, q0.a aVar, int i2, k kVar) {
        this(timeProvider, (i2 & 2) != 0 ? AnonymousClass1.INSTANCE : aVar);
    }
}
