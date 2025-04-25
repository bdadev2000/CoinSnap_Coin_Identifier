package com.glority.android.picturexx.utils;

import com.glority.component.generatedAPI.kotlinAPI.item.ItemDetail;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ItemDetailUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/utils/ItemDetailUtils;", "", "<init>", "()V", "getYear", "", "itemDetail", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "getDenominationSideUrl", "getSubjectSideUrl", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ItemDetailUtils {
    public static final int $stable = 0;
    public static final ItemDetailUtils INSTANCE = new ItemDetailUtils();

    private ItemDetailUtils() {
    }

    public final String getYear(ItemDetail itemDetail) {
        if (itemDetail == null) {
            return null;
        }
        try {
            String properties = itemDetail.getProperties();
            if (properties == null) {
                properties = "";
            }
            JSONObject jSONObject = new JSONObject(properties).getJSONObject("recognize_year");
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            if (keys.hasNext()) {
                return jSONObject.getString(keys.next());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final String getDenominationSideUrl(ItemDetail itemDetail) {
        if (itemDetail == null) {
            return null;
        }
        try {
            String properties = itemDetail.getProperties();
            if (properties == null) {
                properties = "";
            }
            return new JSONObject(properties).getString("denomination_side_url");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String getSubjectSideUrl(ItemDetail itemDetail) {
        if (itemDetail == null) {
            return null;
        }
        try {
            String properties = itemDetail.getProperties();
            if (properties == null) {
                properties = "";
            }
            return new JSONObject(properties).getString("subject_side_url");
        } catch (Throwable unused) {
            return null;
        }
    }
}
