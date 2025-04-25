package com.glority.base.utils;

import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import kotlin.Metadata;

/* compiled from: PrivacyPolicyUtil.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/base/utils/PrivacyPolicyUtil;", "", "<init>", "()V", "value", "", "hasAgreed", "getHasAgreed", "()Ljava/lang/Boolean;", "setHasAgreed", "(Ljava/lang/Boolean;)V", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class PrivacyPolicyUtil {
    public static final int $stable = 0;
    public static final PrivacyPolicyUtil INSTANCE = new PrivacyPolicyUtil();

    private PrivacyPolicyUtil() {
    }

    public final Boolean getHasAgreed() {
        return (Boolean) PersistData.INSTANCE.getCompat(PersistKey.KEY_HAS_AGREED_PRIVACY_POLICY, null);
    }

    public final void setHasAgreed(Boolean bool) {
        PersistData.INSTANCE.set(PersistKey.KEY_HAS_AGREED_PRIVACY_POLICY, bool);
    }
}
