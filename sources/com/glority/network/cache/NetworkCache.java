package com.glority.network.cache;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;

/* compiled from: NetworkCache.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0007J'\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\n\u001a\u0002H\u00042\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/glority/network/cache/NetworkCache;", "", LogEvents.exportemptyalert_close_click_type_get, "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "key", "(Lcom/glority/android/core/definition/APIDefinition;)Ljava/lang/String;", "put", "", "value", "originalJson", "(Lcom/glority/android/core/definition/APIDefinition;Ljava/lang/String;)V", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public interface NetworkCache {
    <T extends APIDefinition> String get(T key);

    <T extends APIDefinition> void put(T value, String originalJson);
}
