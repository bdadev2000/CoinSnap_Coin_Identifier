package com.glority.android.picturexx.recognize.fragment;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.OnGetPermissionCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CaptureFragment$initView$3 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$initView$3(CaptureFragment captureFragment) {
        super(1);
        this.this$0 = captureFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseFragment.logEvent$default(this.this$0, RecognizeLogEvents.camera_flash_click, null, 2, null);
        if (this.this$0.getActivity() == null) {
            return;
        }
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        final CaptureFragment captureFragment = this.this$0;
        PermissionUtils.checkPermission((RuntimePermissionActivity) activity, Permission.CAMERA, new OnGetPermissionCallback() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$3$$ExternalSyntheticLambda0
            @Override // com.glority.utils.permission.callback.OnGetPermissionCallback
            public final void onGetPermission() {
                CaptureFragment$initView$3.invoke$lambda$0(CaptureFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CaptureFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.switchTorchState();
        CaptureFragment.access$getBinding(this$0).ivFlash.setImageResource(this$0.getIsLightOn() ? R.drawable.icon_capture_tourch : R.drawable.icon_capture_tourch_close);
    }
}
