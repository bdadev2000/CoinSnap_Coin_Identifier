package com.facebook;

import android.os.Handler;
import e0.q;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class GraphRequestBatch extends AbstractList<GraphRequest> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger idGenerator = new AtomicInteger();

    @Nullable
    private String batchApplicationId;

    @Nullable
    private Handler callbackHandler;

    @NotNull
    private List<Callback> callbacks;

    @NotNull
    private final String id;

    @NotNull
    private List<GraphRequest> requests;
    private int timeoutInMilliseconds;

    /* loaded from: classes.dex */
    public interface Callback {
        void onBatchCompleted(@NotNull GraphRequestBatch graphRequestBatch);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface OnProgressCallback extends Callback {
        void onBatchProgress(@NotNull GraphRequestBatch graphRequestBatch, long j2, long j3);
    }

    public GraphRequestBatch() {
        this.id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList();
    }

    private final List<GraphResponse> executeAndWaitImpl() {
        return GraphRequest.Companion.executeBatchAndWait(this);
    }

    private final GraphRequestAsyncTask executeAsyncImpl() {
        return GraphRequest.Companion.executeBatchAsync(this);
    }

    public final void addCallback(@NotNull Callback callback) {
        p0.a.s(callback, "callback");
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    public /* bridge */ boolean contains(GraphRequest graphRequest) {
        return super.contains((Object) graphRequest);
    }

    @NotNull
    public final List<GraphResponse> executeAndWait() {
        return executeAndWaitImpl();
    }

    @NotNull
    public final GraphRequestAsyncTask executeAsync() {
        return executeAsyncImpl();
    }

    @Nullable
    public final String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    @Nullable
    public final Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    @NotNull
    public final List<Callback> getCallbacks() {
        return this.callbacks;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<GraphRequest> getRequests() {
        return this.requests;
    }

    public int getSize() {
        return this.requests.size();
    }

    public final int getTimeout() {
        return this.timeoutInMilliseconds;
    }

    public /* bridge */ int indexOf(GraphRequest graphRequest) {
        return super.indexOf((Object) graphRequest);
    }

    public /* bridge */ int lastIndexOf(GraphRequest graphRequest) {
        return super.lastIndexOf((Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ GraphRequest remove(int i2) {
        return removeAt(i2);
    }

    @NotNull
    public GraphRequest removeAt(int i2) {
        return this.requests.remove(i2);
    }

    public final void removeCallback(@NotNull Callback callback) {
        p0.a.s(callback, "callback");
        this.callbacks.remove(callback);
    }

    public final void setBatchApplicationId(@Nullable String str) {
        this.batchApplicationId = str;
    }

    public final void setCallbackHandler(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    public final void setTimeout(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.".toString());
        }
        this.timeoutInMilliseconds = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return contains((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public GraphRequest get(int i2) {
        return this.requests.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return indexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return lastIndexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public GraphRequest set(int i2, @NotNull GraphRequest graphRequest) {
        p0.a.s(graphRequest, "element");
        return this.requests.set(i2, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(@NotNull GraphRequest graphRequest) {
        p0.a.s(graphRequest, "element");
        return this.requests.add(graphRequest);
    }

    public /* bridge */ boolean remove(GraphRequest graphRequest) {
        return super.remove((Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, @NotNull GraphRequest graphRequest) {
        p0.a.s(graphRequest, "element");
        this.requests.add(i2, graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return remove((GraphRequest) obj);
        }
        return false;
    }

    public GraphRequestBatch(@NotNull Collection<GraphRequest> collection) {
        p0.a.s(collection, "requests");
        this.id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(collection);
    }

    public GraphRequestBatch(@NotNull GraphRequest... graphRequestArr) {
        p0.a.s(graphRequestArr, "requests");
        this.id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(q.J(graphRequestArr));
    }

    public GraphRequestBatch(@NotNull GraphRequestBatch graphRequestBatch) {
        p0.a.s(graphRequestBatch, "requests");
        this.id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(graphRequestBatch);
        this.callbackHandler = graphRequestBatch.callbackHandler;
        this.timeoutInMilliseconds = graphRequestBatch.timeoutInMilliseconds;
        this.callbacks = new ArrayList(graphRequestBatch.callbacks);
    }
}
