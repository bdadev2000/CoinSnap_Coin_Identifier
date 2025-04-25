package com.glority.android.core.init;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitGrade.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/glority/android/core/init/InitGrade;", "", "()V", "BACK_GROUND_INIT", "", "DELAY_INIT", "FRONT_INIT", "INIT_BUGLY", "INIT_UMENG", "isNeedInitComplete", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setNeedInitComplete", "(Landroidx/lifecycle/MutableLiveData;)V", "isPrivacyAgreed", "", "setPrivacyAgreed", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class InitGrade {
    public static final int BACK_GROUND_INIT = 0;
    public static final int DELAY_INIT = 2;
    public static final int FRONT_INIT = 1;
    public static final int INIT_BUGLY = 1;
    public static final int INIT_UMENG = 2;
    public static final InitGrade INSTANCE = new InitGrade();
    private static MutableLiveData<Integer> isNeedInitComplete;
    private static MutableLiveData<Boolean> isPrivacyAgreed;

    private InitGrade() {
    }

    static {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(false);
        isPrivacyAgreed = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(0);
        isNeedInitComplete = mutableLiveData2;
    }

    public final MutableLiveData<Boolean> isPrivacyAgreed() {
        return isPrivacyAgreed;
    }

    public final void setPrivacyAgreed(MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        isPrivacyAgreed = mutableLiveData;
    }

    public final MutableLiveData<Integer> isNeedInitComplete() {
        return isNeedInitComplete;
    }

    public final void setNeedInitComplete(MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        isNeedInitComplete = mutableLiveData;
    }
}
