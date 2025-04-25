package com.glority.android.core.utils.mediaSource;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.android.core.route.utils.AfShotLogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.device.CorePersistKey;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaSourceUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u000fR\u001b\u0010\u001e\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u000fR$\u0010!\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R$\u0010$\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/glority/android/core/utils/mediaSource/MediaSourceUtils;", "", "()V", "ABTESTING_IS_CLOSE", "", "AF_SECOND_DAY_HAD_SEND", "", "AF_SHOT_TIMES", "MEDIA_SOURCE_DELAY_AFTER_HOME", "MEDIA_SOURCE_DELAY_BEFORE_HOME", "MEDIA_SOURCE_FORM_APPSFLYS", "MEDIA_SOURCE_FORM_TIMEOUT", "value", "afShotTimes", "getAfShotTimes", "()I", "setAfShotTimes", "(I)V", "campaign", "getCampaign", "()Ljava/lang/String;", "setCampaign", "(Ljava/lang/String;)V", "fbInstallReferrer", "getFbInstallReferrer", "setFbInstallReferrer", "mediaSourceAfterHomeDelay", "getMediaSourceAfterHomeDelay", "mediaSourceAfterHomeDelay$delegate", "Lkotlin/Lazy;", "mediaSourceBeforeHomeDelay", "getMediaSourceBeforeHomeDelay", "mediaSourceBeforeHomeDelay$delegate", "mediaSourceControlValue", "getMediaSourceControlValue", "setMediaSourceControlValue", "mediaSources", "getMediaSources", "setMediaSources", "mediaSourcesControl", "Landroidx/lifecycle/MutableLiveData;", "getMediaSourcesControl", "()Landroidx/lifecycle/MutableLiveData;", "setMediaSourcesControl", "(Landroidx/lifecycle/MutableLiveData;)V", "setMediaSourceFrom", "", "sourceFrom", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class MediaSourceUtils {
    public static final int ABTESTING_IS_CLOSE = 3;
    public static final String AF_SECOND_DAY_HAD_SEND = "af_second_day_had_send";
    private static final String AF_SHOT_TIMES = "af_shot_times";
    private static final String MEDIA_SOURCE_DELAY_AFTER_HOME = "media_source_delay_after_home";
    private static final String MEDIA_SOURCE_DELAY_BEFORE_HOME = "media_source_delay_before_home";
    public static final int MEDIA_SOURCE_FORM_APPSFLYS = 2;
    public static final int MEDIA_SOURCE_FORM_TIMEOUT = 1;
    public static final MediaSourceUtils INSTANCE = new MediaSourceUtils();
    private static MutableLiveData<Integer> mediaSourcesControl = new MutableLiveData<>();

    /* renamed from: mediaSourceBeforeHomeDelay$delegate, reason: from kotlin metadata */
    private static final Lazy mediaSourceBeforeHomeDelay = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Integer>() { // from class: com.glority.android.core.utils.mediaSource.MediaSourceUtils$mediaSourceBeforeHomeDelay$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Integer result = new AbtestGetVariableRequest("media_source_delay_before_home").toResult();
            return Integer.valueOf(result == null ? 3000 : result.intValue());
        }
    });

    /* renamed from: mediaSourceAfterHomeDelay$delegate, reason: from kotlin metadata */
    private static final Lazy mediaSourceAfterHomeDelay = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Integer>() { // from class: com.glority.android.core.utils.mediaSource.MediaSourceUtils$mediaSourceAfterHomeDelay$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Integer result = new AbtestGetVariableRequest("media_source_delay_after_home").toResult();
            return Integer.valueOf(result == null ? 0 : result.intValue());
        }
    });

    private MediaSourceUtils() {
    }

    public final MutableLiveData<Integer> getMediaSourcesControl() {
        return mediaSourcesControl;
    }

    public final void setMediaSourcesControl(MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        mediaSourcesControl = mutableLiveData;
    }

    public final int getAfShotTimes() {
        return ((Number) PersistData.INSTANCE.get(AF_SHOT_TIMES, 0)).intValue();
    }

    public final void setAfShotTimes(int i) {
        int intValue = ((Number) PersistData.INSTANCE.get(AF_SHOT_TIMES, 0)).intValue() + i;
        PersistData.INSTANCE.set(AF_SHOT_TIMES, Integer.valueOf(intValue));
        new AfShotLogEventRequest(intValue).post();
    }

    public final String getMediaSources() {
        return (String) PersistData.INSTANCE.get(CorePersistKey.MEDIA_STORE, "");
    }

    public final void setMediaSources(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PersistData.INSTANCE.set(CorePersistKey.MEDIA_STORE, value);
    }

    public final String getCampaign() {
        return (String) PersistData.INSTANCE.get(CorePersistKey.ATTRIBUTION_CAMPAIGN, "");
    }

    public final void setCampaign(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PersistData.INSTANCE.set(CorePersistKey.ATTRIBUTION_CAMPAIGN, value);
    }

    public final String getFbInstallReferrer() {
        return (String) PersistData.INSTANCE.get(CorePersistKey.FB_INSTALL_REFERRER, "");
    }

    public final void setFbInstallReferrer(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PersistData.INSTANCE.set(CorePersistKey.FB_INSTALL_REFERRER, value);
    }

    public final int getMediaSourceControlValue() {
        return ((Number) PersistData.INSTANCE.get(CorePersistKey.MEDIA_STORE_CONTROL, 0)).intValue();
    }

    public final void setMediaSourceControlValue(int i) {
        PersistData.INSTANCE.set(CorePersistKey.MEDIA_STORE_CONTROL, Integer.valueOf(i));
    }

    public final void setMediaSourceFrom(int sourceFrom) {
        if (getMediaSourceControlValue() == 0) {
            setMediaSourceControlValue(sourceFrom);
        }
    }

    public final int getMediaSourceBeforeHomeDelay() {
        return ((Number) mediaSourceBeforeHomeDelay.getValue()).intValue();
    }

    public final int getMediaSourceAfterHomeDelay() {
        return ((Number) mediaSourceAfterHomeDelay.getValue()).intValue();
    }
}
