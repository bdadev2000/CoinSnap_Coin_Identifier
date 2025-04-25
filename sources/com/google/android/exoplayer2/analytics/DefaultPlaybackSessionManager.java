package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes12.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final Supplier<String> DEFAULT_SESSION_ID_GENERATOR = new Supplier() { // from class: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Supplier
        public final Object get() {
            String generateDefaultSessionId;
            generateDefaultSessionId = DefaultPlaybackSessionManager.generateDefaultSessionId();
            return generateDefaultSessionId;
        }
    };
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final Supplier<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    public DefaultPlaybackSessionManager(Supplier<String> supplier) {
        this.sessionIdGenerator = supplier;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r25.mediaPeriodId.windowSequenceNumber < r2.windowSequenceNumber) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[Catch: all -> 0x010f, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x001a, B:9:0x0024, B:15:0x002d, B:18:0x003b, B:20:0x0047, B:21:0x004d, B:23:0x0052, B:25:0x005a, B:27:0x0077, B:28:0x00d2, B:30:0x00d8, B:31:0x00ee, B:33:0x00fa, B:35:0x0100), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r25) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime):void");
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        Assertions.checkNotNull(this.listener);
        Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline)) {
                it.remove();
                if (next.isCreated) {
                    if (next.sessionId.equals(this.currentSessionId)) {
                        this.currentSessionId = null;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateSessionsWithDiscontinuity(eventTime, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x00d1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0011, B:10:0x001b, B:12:0x0021, B:15:0x002d, B:18:0x0036, B:21:0x0044, B:25:0x004f, B:26:0x0052, B:33:0x005c, B:35:0x007b, B:38:0x0085, B:40:0x0091, B:42:0x0097, B:44:0x00a3, B:46:0x00af), top: B:2:0x0001 }] */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r0 = r6.listener     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Ld1
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L10
            r2 = 3
            if (r8 != r2) goto Le
            goto L10
        Le:
            r8 = r0
            goto L11
        L10:
            r8 = r1
        L11:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r2 = r6.sessions     // Catch: java.lang.Throwable -> Ld1
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ld1
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r3 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r3     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r3.isFinishedAtEventTime(r7)     // Catch: java.lang.Throwable -> Ld1
            if (r4 == 0) goto L1b
            r2.remove()     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r3)     // Catch: java.lang.Throwable -> Ld1
            if (r4 == 0) goto L1b
            java.lang.String r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = r6.currentSessionId     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r8 == 0) goto L4c
            if (r4 == 0) goto L4c
            boolean r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$400(r3)     // Catch: java.lang.Throwable -> Ld1
            if (r5 == 0) goto L4c
            r5 = r1
            goto L4d
        L4c:
            r5 = r0
        L4d:
            if (r4 == 0) goto L52
            r4 = 0
            r6.currentSessionId = r4     // Catch: java.lang.Throwable -> Ld1
        L52:
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r4 = r6.listener     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> Ld1
            r4.onSessionFinished(r7, r3, r5)     // Catch: java.lang.Throwable -> Ld1
            goto L1b
        L5c:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r8 = r6.sessions     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = r6.currentSessionId     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r8 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r8     // Catch: java.lang.Throwable -> Ld1
            int r0 = r7.windowIndex     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r0 = r6.getOrAddSession(r0, r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r0)     // Catch: java.lang.Throwable -> Ld1
            r6.currentSessionId = r1     // Catch: java.lang.Throwable -> Ld1
            r6.updateSessions(r7)     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lcf
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            boolean r1 = r1.isAd()     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lcf
            if (r8 == 0) goto Laf
            long r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$100(r8)     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            long r3 = r3.windowSequenceNumber     // Catch: java.lang.Throwable -> Ld1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Laf
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r8)     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Laf
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r8)     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.adGroupIndex     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            int r2 = r2.adGroupIndex     // Catch: java.lang.Throwable -> Ld1
            if (r1 != r2) goto Laf
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r8)     // Catch: java.lang.Throwable -> Ld1
            int r8 = r8.adIndexInAdGroup     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.adIndexInAdGroup     // Catch: java.lang.Throwable -> Ld1
            if (r8 == r1) goto Lcf
        Laf:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r1 = r1.periodUid     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Ld1
            long r2 = r2.windowSequenceNumber     // Catch: java.lang.Throwable -> Ld1
            r8.<init>(r1, r2)     // Catch: java.lang.Throwable -> Ld1
            int r1 = r7.windowIndex     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r8 = r6.getOrAddSession(r1, r8)     // Catch: java.lang.Throwable -> Ld1
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r1 = r6.listener     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r8 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r8)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r0)     // Catch: java.lang.Throwable -> Ld1
            r1.onAdPlaybackStarted(r7, r8, r0)     // Catch: java.lang.Throwable -> Ld1
        Lcf:
            monitor-exit(r6)
            return
        Ld1:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, int):void");
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        this.currentSessionId = null;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    private SessionDescriptor getOrAddSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i, mediaPeriodId)) {
                long j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == -1 || j2 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j2;
                } else if (j2 == j && ((SessionDescriptor) Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str = this.sessionIdGenerator.get();
        SessionDescriptor sessionDescriptor3 = new SessionDescriptor(str, i, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int resolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = resolveWindowIndexToNewTimeline;
            if (resolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }

        public boolean belongsToSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            return mediaPeriodId == null ? i == this.windowIndex : this.adMediaPeriodId == null ? !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber : mediaPeriodId.windowSequenceNumber == this.adMediaPeriodId.windowSequenceNumber && mediaPeriodId.adGroupIndex == this.adMediaPeriodId.adGroupIndex && mediaPeriodId.adIndexInAdGroup == this.adMediaPeriodId.adIndexInAdGroup;
        }

        public void maybeSetWindowSequenceNumber(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber == -1 && i == this.windowIndex && mediaPeriodId != null) {
                this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            if (this.windowSequenceNumber == -1) {
                return false;
            }
            if (eventTime.mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            if (eventTime.mediaPeriodId.windowSequenceNumber > this.windowSequenceNumber) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!eventTime.mediaPeriodId.isAd()) {
                return eventTime.mediaPeriodId.nextAdGroupIndex == -1 || eventTime.mediaPeriodId.nextAdGroupIndex > this.adMediaPeriodId.adGroupIndex;
            }
            int i = eventTime.mediaPeriodId.adGroupIndex;
            return i > this.adMediaPeriodId.adGroupIndex || (i == this.adMediaPeriodId.adGroupIndex && eventTime.mediaPeriodId.adIndexInAdGroup > this.adMediaPeriodId.adIndexInAdGroup);
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i) {
            if (i < timeline.getWindowCount()) {
                timeline.getWindow(i, DefaultPlaybackSessionManager.this.window);
                for (int i2 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                    }
                }
                return -1;
            }
            if (i < timeline2.getWindowCount()) {
                return i;
            }
            return -1;
        }
    }
}
