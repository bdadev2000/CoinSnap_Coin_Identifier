package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public interface DrmSessionEventListener {
    default void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* loaded from: classes12.dex */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public EventDispatcher withParameters(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void drmSessionAcquired() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.this.m8036x7aff32be(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$drmSessionAcquired$0$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        public /* synthetic */ void m8036x7aff32be(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
        }

        public void drmKeysLoaded() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.this.m8033x6262ec98(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$drmKeysLoaded$1$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        public /* synthetic */ void m8033x6262ec98(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionManagerError(final Exception exc) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.this.m8037x99ee26cd(drmSessionEventListener, exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$drmSessionManagerError$2$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        public /* synthetic */ void m8037x99ee26cd(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        public void drmKeysRestored() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.this.m8035x8910d2ab(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$drmKeysRestored$3$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        public /* synthetic */ void m8035x8910d2ab(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        public void drmKeysRemoved() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.this.m8034xc24f0d8a(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$drmKeysRemoved$4$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        public /* synthetic */ void m8034xc24f0d8a(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionReleased() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.this.m8038xbad440f2(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$drmSessionReleased$5$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        public /* synthetic */ void m8038xbad440f2(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        /* loaded from: classes12.dex */
        private static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }
    }
}
