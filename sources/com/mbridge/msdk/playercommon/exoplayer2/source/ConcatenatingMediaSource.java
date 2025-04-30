package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> implements PlayerMessage.Target {
    private static final int MSG_ADD = 0;
    private static final int MSG_ADD_MULTIPLE = 1;
    private static final int MSG_CLEAR = 4;
    private static final int MSG_MOVE = 3;
    private static final int MSG_NOTIFY_LISTENER = 5;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private final boolean isAtomic;
    private boolean listenerNotificationScheduled;
    private final Map<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private final List<EventDispatcher> pendingOnCompletionActions;
    private int periodCount;
    private ExoPlayer player;
    private final MediaSourceHolder query;
    private ShuffleOrder shuffleOrder;
    private final Timeline.Window window;
    private int windowCount;

    /* loaded from: classes3.dex */
    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, int i9, int i10, ShuffleOrder shuffleOrder, boolean z8) {
            super(z8, shuffleOrder);
            this.windowCount = i9;
            this.periodCount = i10;
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int i11 = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i11] = mediaSourceHolder.timeline;
                this.firstPeriodInChildIndices[i11] = mediaSourceHolder.firstPeriodIndexInChild;
                this.firstWindowInChildIndices[i11] = mediaSourceHolder.firstWindowIndexInChild;
                Object[] objArr = this.uids;
                Object obj = mediaSourceHolder.uid;
                objArr[i11] = obj;
                this.childIndexByUid.put(obj, Integer.valueOf(i11));
                i11++;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getChildIndexByPeriodIndex(int i9) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i9 + 1, false, false);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getChildIndexByWindowIndex(int i9) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i9 + 1, false, false);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final Object getChildUidByChildIndex(int i9) {
            return this.uids[i9];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getFirstPeriodIndexByChildIndex(int i9) {
            return this.firstPeriodInChildIndices[i9];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final int getFirstWindowIndexByChildIndex(int i9) {
            return this.firstWindowInChildIndices[i9];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.periodCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        public final Timeline getTimelineByChildIndex(int i9) {
            return this.timelines[i9];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getWindowCount() {
            return this.windowCount;
        }
    }

    /* loaded from: classes3.dex */
    public static final class DeferredTimeline extends ForwardingTimeline {
        private final Object replacedId;
        private static final Object DUMMY_ID = new Object();
        private static final Timeline.Period period = new Timeline.Period();
        private static final DummyTimeline dummyTimeline = new DummyTimeline();

        public DeferredTimeline() {
            this(dummyTimeline, null);
        }

        public final DeferredTimeline cloneWithNewTimeline(Timeline timeline) {
            Object obj;
            if (this.replacedId == null && timeline.getPeriodCount() > 0) {
                obj = timeline.getPeriod(0, period, true).uid;
            } else {
                obj = this.replacedId;
            }
            return new DeferredTimeline(timeline, obj);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
            Timeline timeline = this.timeline;
            if (DUMMY_ID.equals(obj)) {
                obj = this.replacedId;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i9, Timeline.Period period2, boolean z8) {
            this.timeline.getPeriod(i9, period2, z8);
            if (Util.areEqual(period2.uid, this.replacedId)) {
                period2.uid = DUMMY_ID;
            }
            return period2;
        }

        public final Timeline getTimeline() {
            return this.timeline;
        }

        private DeferredTimeline(Timeline timeline, Object obj) {
            super(timeline);
            this.replacedId = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class DummyTimeline extends Timeline {
        private DummyTimeline() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i9, Timeline.Period period, boolean z8) {
            return period.set(null, null, 0, C.TIME_UNSET, 0L);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getPeriodCount() {
            return 1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i9, Timeline.Window window, boolean z8, long j7) {
            long j9 = 0;
            if (j7 > 0) {
                j9 = C.TIME_UNSET;
            }
            return window.set(null, C.TIME_UNSET, C.TIME_UNSET, false, true, j9, C.TIME_UNSET, 0, 0, 0L);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getWindowCount() {
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class EventDispatcher {
        public final Handler eventHandler;
        public final Runnable runnable;

        public EventDispatcher(Runnable runnable) {
            Looper mainLooper;
            this.runnable = runnable;
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            this.eventHandler = new Handler(mainLooper);
        }

        public final void dispatchEvent() {
            this.eventHandler.post(this.runnable);
        }
    }

    /* loaded from: classes3.dex */
    public static final class MediaSourceHolder implements Comparable<MediaSourceHolder> {
        public int childIndex;
        public int firstPeriodIndexInChild;
        public int firstWindowIndexInChild;
        public boolean isPrepared;
        public boolean isRemoved;
        public final MediaSource mediaSource;
        public DeferredTimeline timeline = new DeferredTimeline();
        public List<DeferredMediaPeriod> activeMediaPeriods = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource) {
            this.mediaSource = mediaSource;
        }

        public final void reset(int i9, int i10, int i11) {
            this.childIndex = i9;
            this.firstWindowIndexInChild = i10;
            this.firstPeriodIndexInChild = i11;
            this.isPrepared = false;
            this.isRemoved = false;
            this.activeMediaPeriods.clear();
        }

        @Override // java.lang.Comparable
        public final int compareTo(MediaSourceHolder mediaSourceHolder) {
            return this.firstPeriodIndexInChild - mediaSourceHolder.firstPeriodIndexInChild;
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageData<T> {
        public final EventDispatcher actionOnCompletion;
        public final T customData;
        public final int index;

        public MessageData(int i9, T t9, Runnable runnable) {
            EventDispatcher eventDispatcher;
            this.index = i9;
            if (runnable != null) {
                eventDispatcher = new EventDispatcher(runnable);
            } else {
                eventDispatcher = null;
            }
            this.actionOnCompletion = eventDispatcher;
            this.customData = t9;
        }
    }

    public ConcatenatingMediaSource() {
        this(false, (ShuffleOrder) new ShuffleOrder.DefaultShuffleOrder(0));
    }

    private void addMediaSourceInternal(int i9, MediaSourceHolder mediaSourceHolder) {
        if (i9 > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i9 - 1);
            mediaSourceHolder.reset(i9, mediaSourceHolder2.timeline.getWindowCount() + mediaSourceHolder2.firstWindowIndexInChild, mediaSourceHolder2.timeline.getPeriodCount() + mediaSourceHolder2.firstPeriodIndexInChild);
        } else {
            mediaSourceHolder.reset(i9, 0, 0);
        }
        correctOffsets(i9, 1, mediaSourceHolder.timeline.getWindowCount(), mediaSourceHolder.timeline.getPeriodCount());
        this.mediaSourceHolders.add(i9, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
    }

    private void addMediaSourcesInternal(int i9, Collection<MediaSourceHolder> collection) {
        Iterator<MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i9, it.next());
            i9++;
        }
    }

    private void clearInternal() {
        for (int size = this.mediaSourceHolders.size() - 1; size >= 0; size--) {
            removeMediaSourceInternal(size);
        }
    }

    private void correctOffsets(int i9, int i10, int i11, int i12) {
        this.windowCount += i11;
        this.periodCount += i12;
        while (i9 < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i9).childIndex += i10;
            this.mediaSourceHolders.get(i9).firstWindowIndexInChild += i11;
            this.mediaSourceHolders.get(i9).firstPeriodIndexInChild += i12;
            i9++;
        }
    }

    private int findMediaSourceHolderByPeriodIndex(int i9) {
        MediaSourceHolder mediaSourceHolder = this.query;
        mediaSourceHolder.firstPeriodIndexInChild = i9;
        int binarySearch = Collections.binarySearch(this.mediaSourceHolders, mediaSourceHolder);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        while (binarySearch < this.mediaSourceHolders.size() - 1) {
            int i10 = binarySearch + 1;
            if (this.mediaSourceHolders.get(i10).firstPeriodIndexInChild != i9) {
                break;
            }
            binarySearch = i10;
        }
        return binarySearch;
    }

    private void moveMediaSourceInternal(int i9, int i10) {
        int min = Math.min(i9, i10);
        int max = Math.max(i9, i10);
        int i11 = this.mediaSourceHolders.get(min).firstWindowIndexInChild;
        int i12 = this.mediaSourceHolders.get(min).firstPeriodIndexInChild;
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i10, list.remove(i9));
        while (min <= max) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(min);
            mediaSourceHolder.firstWindowIndexInChild = i11;
            mediaSourceHolder.firstPeriodIndexInChild = i12;
            i11 += mediaSourceHolder.timeline.getWindowCount();
            i12 += mediaSourceHolder.timeline.getPeriodCount();
            min++;
        }
    }

    private void notifyListener() {
        List arrayList;
        this.listenerNotificationScheduled = false;
        if (this.pendingOnCompletionActions.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(this.pendingOnCompletionActions);
        }
        this.pendingOnCompletionActions.clear();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.windowCount, this.periodCount, this.shuffleOrder, this.isAtomic), null);
        if (!arrayList.isEmpty()) {
            this.player.createMessage(this).setType(6).setPayload(arrayList).send();
        }
    }

    private void removeMediaSourceInternal(int i9) {
        MediaSourceHolder remove = this.mediaSourceHolders.remove(i9);
        DeferredTimeline deferredTimeline = remove.timeline;
        correctOffsets(i9, -1, -deferredTimeline.getWindowCount(), -deferredTimeline.getPeriodCount());
        remove.isRemoved = true;
        if (remove.activeMediaPeriods.isEmpty()) {
            releaseChildSource(remove);
        }
    }

    private void scheduleListenerNotification(EventDispatcher eventDispatcher) {
        if (!this.listenerNotificationScheduled) {
            this.player.createMessage(this).setType(5).send();
            this.listenerNotificationScheduled = true;
        }
        if (eventDispatcher != null) {
            this.pendingOnCompletionActions.add(eventDispatcher);
        }
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder != null) {
            DeferredTimeline deferredTimeline = mediaSourceHolder.timeline;
            if (deferredTimeline.getTimeline() == timeline) {
                return;
            }
            int windowCount = timeline.getWindowCount() - deferredTimeline.getWindowCount();
            int periodCount = timeline.getPeriodCount() - deferredTimeline.getPeriodCount();
            if (windowCount != 0 || periodCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount, periodCount);
            }
            mediaSourceHolder.timeline = deferredTimeline.cloneWithNewTimeline(timeline);
            if (!mediaSourceHolder.isPrepared && !timeline.isEmpty()) {
                timeline.getWindow(0, this.window);
                long defaultPositionUs = this.window.getDefaultPositionUs() + this.window.getPositionInFirstPeriodUs();
                for (int i9 = 0; i9 < mediaSourceHolder.activeMediaPeriods.size(); i9++) {
                    DeferredMediaPeriod deferredMediaPeriod = mediaSourceHolder.activeMediaPeriods.get(i9);
                    deferredMediaPeriod.setDefaultPreparePositionUs(defaultPositionUs);
                    deferredMediaPeriod.createPeriod();
                }
                mediaSourceHolder.isPrepared = true;
            }
            scheduleListenerNotification(null);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, null);
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, null);
    }

    public final synchronized void clear() {
        clear(null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(findMediaSourceHolderByPeriodIndex(mediaPeriodId.periodIndex));
        DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(mediaSourceHolder.mediaSource, mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex - mediaSourceHolder.firstPeriodIndexInChild), allocator);
        this.mediaSourceByMediaPeriod.put(deferredMediaPeriod, mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriods.add(deferredMediaPeriod);
        if (mediaSourceHolder.isPrepared) {
            deferredMediaPeriod.createPeriod();
        }
        return deferredMediaPeriod;
    }

    public final synchronized MediaSource getMediaSource(int i9) {
        return this.mediaSourcesPublic.get(i9).mediaSource;
    }

    public final synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i9, Object obj) throws ExoPlaybackException {
        switch (i9) {
            case 0:
                MessageData messageData = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, 1);
                addMediaSourceInternal(messageData.index, (MediaSourceHolder) messageData.customData);
                scheduleListenerNotification(messageData.actionOnCompletion);
                return;
            case 1:
                MessageData messageData2 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData2.index, ((Collection) messageData2.customData).size());
                addMediaSourcesInternal(messageData2.index, (Collection) messageData2.customData);
                scheduleListenerNotification(messageData2.actionOnCompletion);
                return;
            case 2:
                MessageData messageData3 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(messageData3.index);
                removeMediaSourceInternal(messageData3.index);
                scheduleListenerNotification(messageData3.actionOnCompletion);
                return;
            case 3:
                MessageData messageData4 = (MessageData) obj;
                ShuffleOrder cloneAndRemove = this.shuffleOrder.cloneAndRemove(messageData4.index);
                this.shuffleOrder = cloneAndRemove;
                this.shuffleOrder = cloneAndRemove.cloneAndInsert(((Integer) messageData4.customData).intValue(), 1);
                moveMediaSourceInternal(messageData4.index, ((Integer) messageData4.customData).intValue());
                scheduleListenerNotification(messageData4.actionOnCompletion);
                return;
            case 4:
                clearInternal();
                scheduleListenerNotification((EventDispatcher) obj);
                return;
            case 5:
                notifyListener();
                return;
            case 6:
                List list = (List) obj;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((EventDispatcher) list.get(i10)).dispatchEvent();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final synchronized void moveMediaSource(int i9, int i10) {
        moveMediaSource(i9, i10, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final synchronized void prepareSourceInternal(ExoPlayer exoPlayer, boolean z8) {
        try {
            super.prepareSourceInternal(exoPlayer, z8);
            this.player = exoPlayer;
            if (this.mediaSourcesPublic.isEmpty()) {
                notifyListener();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
                addMediaSourcesInternal(0, this.mediaSourcesPublic);
                scheduleListenerNotification(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder remove = this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        ((DeferredMediaPeriod) mediaPeriod).releasePeriod();
        remove.activeMediaPeriods.remove(mediaPeriod);
        if (remove.activeMediaPeriods.isEmpty() && remove.isRemoved) {
            releaseChildSource(remove);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.player = null;
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        this.windowCount = 0;
        this.periodCount = 0;
    }

    public final synchronized void removeMediaSource(int i9) {
        removeMediaSource(i9, null);
    }

    public ConcatenatingMediaSource(boolean z8) {
        this(z8, new ShuffleOrder.DefaultShuffleOrder(0));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i9 = 0; i9 < mediaSourceHolder.activeMediaPeriods.size(); i9++) {
            if (mediaSourceHolder.activeMediaPeriods.get(i9).id.windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex + mediaSourceHolder.firstPeriodIndexInChild);
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i9) {
        return i9 + mediaSourceHolder.firstWindowIndexInChild;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline, Object obj) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    public ConcatenatingMediaSource(boolean z8, ShuffleOrder shuffleOrder) {
        this(z8, shuffleOrder, new MediaSource[0]);
    }

    public final synchronized void addMediaSource(MediaSource mediaSource, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, runnable);
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection, Runnable runnable) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, runnable);
    }

    public final synchronized void clear(Runnable runnable) {
        try {
            this.mediaSourcesPublic.clear();
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.createMessage(this).setType(4).setPayload(runnable != null ? new EventDispatcher(runnable) : null).send();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void moveMediaSource(int i9, int i10, Runnable runnable) {
        if (i9 == i10) {
            return;
        }
        try {
            List<MediaSourceHolder> list = this.mediaSourcesPublic;
            list.add(i10, list.remove(i9));
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.createMessage(this).setType(3).setPayload(new MessageData(i9, Integer.valueOf(i10), runnable)).send();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void removeMediaSource(int i9, Runnable runnable) {
        try {
            this.mediaSourcesPublic.remove(i9);
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.createMessage(this).setType(2).setPayload(new MessageData(i9, null, runnable)).send();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z8, MediaSource... mediaSourceArr) {
        this(z8, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public final synchronized void addMediaSource(int i9, MediaSource mediaSource) {
        addMediaSource(i9, mediaSource, null);
    }

    public final synchronized void addMediaSources(int i9, Collection<MediaSource> collection) {
        addMediaSources(i9, collection, null);
    }

    public ConcatenatingMediaSource(boolean z8, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.pendingOnCompletionActions = new ArrayList();
        this.query = new MediaSourceHolder(null);
        this.isAtomic = z8;
        this.window = new Timeline.Window();
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public final synchronized void addMediaSource(int i9, MediaSource mediaSource, Runnable runnable) {
        try {
            Assertions.checkNotNull(mediaSource);
            MediaSourceHolder mediaSourceHolder = new MediaSourceHolder(mediaSource);
            this.mediaSourcesPublic.add(i9, mediaSourceHolder);
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.createMessage(this).setType(0).setPayload(new MessageData(i9, mediaSourceHolder, runnable)).send();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void addMediaSources(int i9, Collection<MediaSource> collection, Runnable runnable) {
        try {
            Iterator<MediaSource> it = collection.iterator();
            while (it.hasNext()) {
                Assertions.checkNotNull(it.next());
            }
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<MediaSource> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(new MediaSourceHolder(it2.next()));
            }
            this.mediaSourcesPublic.addAll(i9, arrayList);
            if (this.player != null && !collection.isEmpty()) {
                this.player.createMessage(this).setType(1).setPayload(new MessageData(i9, arrayList, runnable)).send();
            } else if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
