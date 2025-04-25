package com.glority.android.picturexx.recognize.fragment.grading;

import android.widget.FrameLayout;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.RecognizeConstants;
import com.glority.android.picturexx.recognize.databinding.FragmentCaptureBinding;
import com.glority.android.picturexx.recognize.fragment.CaptureFragment;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import kotlin.Metadata;

/* compiled from: GradingCaptureFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0014¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/recognize/fragment/grading/GradingCaptureFragment;", "Lcom/glority/android/picturexx/recognize/fragment/CaptureFragment;", "<init>", "()V", "initView", "", "snapTipsRecordKey", "", "snapTipsLayout", "", "getLogPageName", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingCaptureFragment extends CaptureFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.picturexx.recognize.fragment.CaptureFragment
    public void initView() {
        super.initView();
        FrameLayout frameLayout = ((FragmentCaptureBinding) getBinding()).snapLl;
    }

    @Override // com.glority.android.picturexx.recognize.fragment.CaptureFragment
    public String snapTipsRecordKey() {
        return RecognizeConstants.KEY_OPEN_GRADING_CAPTURE_SNAP_TIPS;
    }

    @Override // com.glority.android.picturexx.recognize.fragment.CaptureFragment
    public int snapTipsLayout() {
        return R.layout.activity_grading_snaptips;
    }

    @Override // com.glority.android.picturexx.recognize.fragment.CaptureFragment, com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return RecognizeLogEvents.camera;
    }
}
