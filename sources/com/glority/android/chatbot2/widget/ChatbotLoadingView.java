package com.glority.android.chatbot2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.glority.chatbot2.R;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;

/* compiled from: ChatbotLoadingView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0006\u0010\u0014\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/chatbot2/widget/ChatbotLoadingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dotViews", "", "Landroid/view/View;", "loadingJob", "Lkotlinx/coroutines/Job;", "thread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "v1", "v2", "v3", "cancelLoading", "", "onDetachedFromWindow", "showLoading", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotLoadingView extends FrameLayout {
    private final List<View> dotViews;
    private Job loadingJob;
    private ExecutorCoroutineDispatcher thread;
    private final View v1;
    private final View v2;
    private final View v3;

    public ChatbotLoadingView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ChatbotLoadingView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.chatbot2.widget.ChatbotLoadingView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        this.thread = ExecutorsKt.from(newSingleThreadExecutor);
        LayoutInflater.from(context).inflate(R.layout.chatbot_item_loading_view, this);
        View findViewById = findViewById(R.id.v1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.v1)");
        this.v1 = findViewById;
        View findViewById2 = findViewById(R.id.v2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.v2)");
        this.v2 = findViewById2;
        View findViewById3 = findViewById(R.id.v3);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.v3)");
        this.v3 = findViewById3;
        this.dotViews = CollectionsKt.listOf((Object[]) new View[]{findViewById, findViewById2, findViewById3});
    }

    public final void showLoading() {
        Job launch$default;
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((AppCompatActivity) context), this.thread, null, new ChatbotLoadingView$showLoading$1(this, null), 2, null);
        this.loadingJob = launch$default;
    }

    public final void cancelLoading() {
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelLoading();
    }
}
