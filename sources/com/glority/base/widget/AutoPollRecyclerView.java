package com.glority.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoPollRecyclerView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/base/widget/AutoPollRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoPollTask", "Lcom/glority/base/widget/AutoPollRecyclerView$AutoPollTask;", "running", "", "canRun", "xScrollStep", "", "yScrollStep", "setScrollStep", "", "start", "stop", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "AutoPollTask", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AutoPollRecyclerView extends RecyclerView {
    private static final long TIME_AUTO_POLL = 15;
    private AutoPollTask autoPollTask;
    private boolean canRun;
    private boolean running;
    private int xScrollStep;
    private int yScrollStep;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoPollRecyclerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AutoPollRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.autoPollTask = new AutoPollTask(this);
    }

    public final void setScrollStep(int xScrollStep, int yScrollStep) {
        this.xScrollStep = xScrollStep;
        this.yScrollStep = yScrollStep;
    }

    /* compiled from: AutoPollRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/base/widget/AutoPollRecyclerView$AutoPollTask;", "Ljava/lang/Runnable;", "view", "Lcom/glority/base/widget/AutoPollRecyclerView;", "<init>", "(Lcom/glority/base/widget/AutoPollRecyclerView;)V", "getView", "()Lcom/glority/base/widget/AutoPollRecyclerView;", "run", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class AutoPollTask implements Runnable {
        public static final int $stable = 8;
        private final AutoPollRecyclerView view;

        public AutoPollTask(AutoPollRecyclerView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        public final AutoPollRecyclerView getView() {
            return this.view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.view.running && this.view.canRun) {
                AutoPollRecyclerView autoPollRecyclerView = this.view;
                autoPollRecyclerView.scrollBy(autoPollRecyclerView.xScrollStep, this.view.yScrollStep);
                AutoPollRecyclerView autoPollRecyclerView2 = this.view;
                autoPollRecyclerView2.postDelayed(autoPollRecyclerView2.autoPollTask, AutoPollRecyclerView.TIME_AUTO_POLL);
            }
        }
    }

    public final void start() {
        if (this.running) {
            stop();
        }
        this.canRun = true;
        this.running = true;
        postDelayed(this.autoPollTask, TIME_AUTO_POLL);
    }

    public final void stop() {
        this.running = false;
        removeCallbacks(this.autoPollTask);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        int action = e.getAction();
        if (action == 0) {
            if (this.running) {
                stop();
            }
        } else if ((action == 1 || action == 3 || action == 4) && this.canRun) {
            start();
        }
        return super.onTouchEvent(e);
    }
}
