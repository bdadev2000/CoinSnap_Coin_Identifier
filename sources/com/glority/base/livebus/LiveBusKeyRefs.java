package com.glority.base.livebus;

import com.glority.android.livebus.KeyRef;
import com.glority.android.livebus.KeyRefDefinitionKt;
import kotlin.Metadata;

/* compiled from: LiveBus.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/base/livebus/LiveBusKeyRefs;", "", "<init>", "()V", "AGREE_AGREEMENT", "", "AGREE_AGREEMENT_KEY_REF", "Lcom/glority/android/livebus/KeyRef;", "getAGREE_AGREEMENT_KEY_REF", "()Lcom/glority/android/livebus/KeyRef;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class LiveBusKeyRefs {
    public static final LiveBusKeyRefs INSTANCE = new LiveBusKeyRefs();
    private static final String AGREE_AGREEMENT = "key_agree_agreement";
    private static final KeyRef<Object> AGREE_AGREEMENT_KEY_REF = KeyRefDefinitionKt.anyKeyRef(AGREE_AGREEMENT);
    public static final int $stable = 8;

    private LiveBusKeyRefs() {
    }

    public final KeyRef<Object> getAGREE_AGREEMENT_KEY_REF() {
        return AGREE_AGREEMENT_KEY_REF;
    }
}
