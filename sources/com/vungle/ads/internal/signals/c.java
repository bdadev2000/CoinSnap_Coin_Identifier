package com.vungle.ads.internal.signals;

import c7.y1;
import com.mbridge.msdk.foundation.entity.o;
import e8.W;
import e8.g0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class c {
    public static final b Companion = new b(null);
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<m> signaledAd;
    private List<y1> unclosedAd;

    public c(int i9) {
        this.sessionCount = i9;
        String uuid = UUID.randomUUID().toString();
        G7.j.d(uuid, "randomUUID().toString()");
        this.sessionId = uuid;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ c copy$default(c cVar, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = cVar.sessionCount;
        }
        return cVar.copy(i9);
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (G7.j.a(r0, r1) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.vungle.ads.internal.signals.c r6, d8.b r7, c8.g r8) {
        /*
            java.lang.String r0 = "self"
            G7.j.e(r6, r0)
            java.lang.String r0 = "output"
            G7.j.e(r7, r0)
            java.lang.String r0 = "serialDesc"
            G7.j.e(r8, r0)
            r0 = 0
            int r1 = r6.sessionCount
            r7.C(r0, r1, r8)
            boolean r0 = r7.o(r8)
            if (r0 == 0) goto L1c
            goto L31
        L1c:
            java.lang.String r0 = r6.sessionId
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            G7.j.d(r1, r2)
            boolean r0 = G7.j.a(r0, r1)
            if (r0 != 0) goto L37
        L31:
            java.lang.String r0 = r6.sessionId
            r1 = 1
            r7.k(r8, r1, r0)
        L37:
            boolean r0 = r7.o(r8)
            if (r0 == 0) goto L3e
            goto L4b
        L3e:
            long r0 = r6.sessionCreationTime
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L51
        L4b:
            long r0 = r6.sessionCreationTime
            r2 = 2
            r7.z(r8, r2, r0)
        L51:
            boolean r0 = r7.o(r8)
            if (r0 == 0) goto L58
            goto L65
        L58:
            java.util.List<com.vungle.ads.internal.signals.m> r0 = r6.signaledAd
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = G7.j.a(r0, r1)
            if (r0 != 0) goto L73
        L65:
            e8.c r0 = new e8.c
            com.vungle.ads.internal.signals.k r1 = com.vungle.ads.internal.signals.k.INSTANCE
            r2 = 0
            r0.<init>(r1, r2)
            java.util.List<com.vungle.ads.internal.signals.m> r1 = r6.signaledAd
            r2 = 3
            r7.m(r8, r2, r0, r1)
        L73:
            boolean r0 = r7.o(r8)
            if (r0 == 0) goto L7a
            goto L82
        L7a:
            long r0 = r6.sessionDuration
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L88
        L82:
            long r0 = r6.sessionDuration
            r2 = 4
            r7.z(r8, r2, r0)
        L88:
            boolean r0 = r7.o(r8)
            if (r0 == 0) goto L8f
            goto L93
        L8f:
            int r0 = r6.sessionDepthCounter
            if (r0 == 0) goto L99
        L93:
            int r0 = r6.sessionDepthCounter
            r1 = 5
            r7.C(r1, r0, r8)
        L99:
            boolean r0 = r7.o(r8)
            if (r0 == 0) goto La0
            goto Lad
        La0:
            java.util.List<c7.y1> r0 = r6.unclosedAd
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = G7.j.a(r0, r1)
            if (r0 != 0) goto Lbb
        Lad:
            e8.c r0 = new e8.c
            c7.w1 r1 = c7.w1.INSTANCE
            r2 = 0
            r0.<init>(r1, r2)
            java.util.List<c7.y1> r6 = r6.unclosedAd
            r1 = 6
            r7.m(r8, r1, r0, r6)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.c.write$Self(com.vungle.ads.internal.signals.c, d8.b, c8.g):void");
    }

    public final int component1() {
        return this.sessionCount;
    }

    public final c copy(int i9) {
        return new c(i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.sessionCount == ((c) obj).sessionCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<m> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<y1> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    public final void setSessionCreationTime(long j7) {
        this.sessionCreationTime = j7;
    }

    public final void setSessionDepthCounter(int i9) {
        this.sessionDepthCounter = i9;
    }

    public final void setSessionDuration(long j7) {
        this.sessionDuration = j7;
    }

    public final void setSignaledAd(List<m> list) {
        G7.j.e(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<y1> list) {
        G7.j.e(list, "<set-?>");
        this.unclosedAd = list;
    }

    public String toString() {
        return o.l(new StringBuilder("SessionData(sessionCount="), this.sessionCount, ')');
    }

    public /* synthetic */ c(int i9, int i10, String str, long j7, List list, long j9, int i11, List list2, g0 g0Var) {
        if (1 != (i9 & 1)) {
            W.h(i9, 1, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionCount = i10;
        if ((i9 & 2) == 0) {
            String uuid = UUID.randomUUID().toString();
            G7.j.d(uuid, "randomUUID().toString()");
            this.sessionId = uuid;
        } else {
            this.sessionId = str;
        }
        if ((i9 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j7;
        }
        if ((i9 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i9 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j9;
        }
        if ((i9 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i11;
        }
        if ((i9 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
    }
}
