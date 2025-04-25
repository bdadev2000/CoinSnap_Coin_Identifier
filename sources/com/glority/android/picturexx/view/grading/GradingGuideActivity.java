package com.glority.android.picturexx.view.grading;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityGradingGuideBinding;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.vm.GradingRecognizeProcess;
import com.glority.android.ui.base.BaseActivity;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.activity.XBaseActivity;
import com.glority.base.utils.HandOnBundleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradingGuideActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/view/grading/GradingGuideActivity;", "Lcom/glority/base/activity/XBaseActivity;", "Lcom/glority/android/picturexx/business/databinding/ActivityGradingGuideBinding;", "<init>", "()V", "getLayoutId", "", "getLogPageName", "", "initData", "", "initView", "binding", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingGuideActivity extends XBaseActivity<ActivityGradingGuideBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String gradingGuideShowed = "gradingGuideShowed";

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_grading_guide;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return LogEvents.grading_guide;
    }

    @Override // com.glority.base.activity.XBaseActivity
    public void initData() {
        PersistData.INSTANCE.set("gradingGuideShowed", true);
    }

    @Override // com.glority.base.activity.XBaseActivity
    public void initView(ActivityGradingGuideBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.getStartBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.grading.GradingGuideActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingGuideActivity.initView$lambda$0(GradingGuideActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(GradingGuideActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity.logEvent$default(this$0, LogEvents.grading_getstart_click, null, 2, null);
        CoreActivity.INSTANCE.openGrading(this$0, new GradingRecognizeProcess(null, 1, null), LogEvents.grading_guide, (r17 & 8) != 0 ? 2 : 0, (r17 & 16) != 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(this$0));
        this$0.finish();
    }

    /* compiled from: GradingGuideActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/view/grading/GradingGuideActivity$Companion;", "", "<init>", "()V", "gradingGuideShowed", "", "open", "", "context", "Landroid/content/Context;", "keyLogBundle", "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void open$default(Companion companion, Context context, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            companion.open(context, bundle);
        }

        public final void open(Context context, Bundle keyLogBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) GradingGuideActivity.class);
            intent.putExtra(HandOnBundleUtils.KEY, keyLogBundle);
            context.startActivity(intent);
        }
    }
}
