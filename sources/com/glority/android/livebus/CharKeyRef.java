package com.glority.android.livebus;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyRefDefinition.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/livebus/CharKeyRef;", "Lcom/glority/android/livebus/KeyRef;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "livebus_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
final class CharKeyRef implements KeyRef<Character> {
    private final String key;

    public CharKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // com.glority.android.livebus.KeyRef
    public String getKey() {
        return this.key;
    }
}
